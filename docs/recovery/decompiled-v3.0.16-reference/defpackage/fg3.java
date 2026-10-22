package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import com.vincenthzr.locationspoofer.data.cloud.CloudClientArtifact;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import com.vincenthzr.locationspoofer.data.update.UpdatePackagePolicy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fg3 {
    public final Context a;

    public fg3(Context context) {
        this.a = context;
    }

    public static final Set d(PackageInfo packageInfo) {
        Signature[] apkContentsSigners;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
        } else {
            apkContentsSigners = packageInfo.signatures;
        }
        if (apkContentsSigners == null) {
            apkContentsSigners = new Signature[0];
        }
        ArrayList arrayList = new ArrayList(apkContentsSigners.length);
        for (Signature signature : apkContentsSigners) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
            bArrDigest.getClass();
            arrayList.add(yo.z0(bArrDigest, new i73(15)));
        }
        return zy.N0(arrayList);
    }

    public final void a(File file, UpdateArtifact updateArtifact, Uri uri, vg3 vg3Var) throws Exception {
        boolean z;
        Exception exc;
        file.getClass();
        updateArtifact.getClass();
        if (o51.f(uri.getScheme(), "content")) {
            Context context = this.a;
            if (DocumentsContract.isDocumentUri(context, uri)) {
                e(file, updateArtifact, vg3Var);
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "w");
                    if (outputStreamOpenOutputStream == null) {
                        throw new CloudException("export_failed", null, null, null, 14, null);
                    }
                    z = true;
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                byte[] bArr = new byte[16384];
                                while (true) {
                                    vg3Var.invoke();
                                    int i = fileInputStream.read(bArr);
                                    if (i < 0) {
                                        fileInputStream.close();
                                        outputStreamOpenOutputStream.flush();
                                        vg3Var.invoke();
                                        outputStreamOpenOutputStream.close();
                                        return;
                                    }
                                    outputStreamOpenOutputStream.write(bArr, 0, i);
                                    try {
                                        throw th;
                                    } catch (Throwable th) {
                                        ji2.z(outputStreamOpenOutputStream, th);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ji2.z(fileInputStream, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    } catch (Exception e) {
                        exc = e;
                    }
                } catch (Exception e2) {
                    z = false;
                    exc = e2;
                }
                if (z) {
                    try {
                        DocumentsContract.deleteDocument(context.getContentResolver(), uri);
                    } catch (Throwable unused) {
                    }
                }
                if ((exc instanceof CancellationException) || (exc instanceof CloudException)) {
                    throw exc;
                }
                b81.w("export_failed");
                return;
            }
        }
        b81.w("export_failed");
    }

    public final File b(UpdateArtifact updateArtifact) throws CloudException {
        SelfHostedUpdates.Companion.requireValid(updateArtifact);
        CloudClientArtifact cloudClientArtifact = new CloudClientArtifact(updateArtifact.getId(), updateArtifact.getAbi(), updateArtifact.getPath(), updateArtifact.getSha256(), updateArtifact.getSizeBytes());
        String id = cloudClientArtifact.getId();
        Pattern patternCompile = Pattern.compile("[a-f0-9-]{36}");
        patternCompile.getClass();
        id.getClass();
        if (!patternCompile.matcher(id).matches()) {
            fo.i("Failed requirement.");
            return null;
        }
        File file = new File(this.a.getCacheDir(), "client-updates");
        if (!file.isDirectory() && !file.mkdirs()) {
            fo.n("Check failed.");
            return null;
        }
        return new File(file, cloudClientArtifact.getId() + "-" + UUID.randomUUID() + ".apk");
    }

    public final z92 c(File file, UpdateArtifact updateArtifact, boolean z, vg3 vg3Var) throws CloudException, NoSuchAlgorithmException, PackageManager.NameNotFoundException, IOException {
        file.getClass();
        updateArtifact.getClass();
        if (!z && !o51.f(updateArtifact.getScheme(), "global")) {
            b81.w("invalid_apk_identity");
            return null;
        }
        z92 z92VarE = e(file, updateArtifact, vg3Var);
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        UpdatePackagePolicy updatePackagePolicy = UpdatePackagePolicy.INSTANCE;
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        if (updatePackagePolicy.canInstall(updateArtifact, longVersionCode, yo.H0(strArr), z)) {
            vg3Var.invoke();
            return z92VarE;
        }
        b81.w("invalid_apk_identity");
        return null;
    }

    public final z92 e(File file, UpdateArtifact updateArtifact, au0 au0Var) throws CloudException, NoSuchAlgorithmException, PackageManager.NameNotFoundException, IOException {
        Bundle bundle;
        SelfHostedUpdates.Companion.requireValid(updateArtifact);
        CloudClientArtifact cloudClientArtifact = new CloudClientArtifact(updateArtifact.getId(), updateArtifact.getAbi(), updateArtifact.getPath(), updateArtifact.getSha256(), updateArtifact.getSizeBytes());
        file.getClass();
        if (!file.isFile() || file.length() != cloudClientArtifact.getSizeBytes()) {
            b81.w("invalid_artifact");
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[16384];
            long j = 0;
            while (true) {
                au0Var.invoke();
                int i = fileInputStream.read(bArr);
                if (i < 0) {
                    fileInputStream.close();
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest.getClass();
                    if (!yo.z0(bArrDigest, new i73(14)).equals(cloudClientArtifact.getSha256())) {
                        b81.w("invalid_artifact");
                        return null;
                    }
                    Context context = this.a;
                    PackageManager packageManager = context.getPackageManager();
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = i2 >= 28 ? 134217728 : 64;
                    PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), i3);
                    if (packageArchiveInfo == null) {
                        b81.w("invalid_apk_identity");
                        return null;
                    }
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), i3);
                    packageInfo.getClass();
                    Set setD = d(packageInfo);
                    if (!o51.f(packageArchiveInfo.packageName, context.getPackageName()) || setD.isEmpty() || !d(packageArchiveInfo).equals(setD)) {
                        b81.w("invalid_apk_identity");
                        return null;
                    }
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    z92 z92Var = new z92(file, packageName);
                    au0Var.invoke();
                    PackageInfo packageArchiveInfo2 = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), WorkQueueKt.BUFFER_CAPACITY);
                    if (packageArchiveInfo2 == null) {
                        b81.w("invalid_apk_identity");
                        return null;
                    }
                    ZipFile zipFile = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        enumerationEntries.getClass();
                        Set<String> setV = xs2.V(new dc3(xs2.O(new dc3(xs2.N(new bz(enumerationEntries)), new i73(11)), new i73(12)), new i73(13)));
                        zipFile.close();
                        UpdatePackagePolicy updatePackagePolicy = UpdatePackagePolicy.INSTANCE;
                        long longVersionCode = i2 >= 28 ? packageArchiveInfo2.getLongVersionCode() : packageArchiveInfo2.versionCode;
                        String str = packageArchiveInfo2.versionName;
                        ApplicationInfo applicationInfo = packageArchiveInfo2.applicationInfo;
                        if (updatePackagePolicy.matchesIdentity(updateArtifact, longVersionCode, str, (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? null : bundle.getString(UpdatePackagePolicy.SCHEME_METADATA), setV)) {
                            au0Var.invoke();
                            return z92Var;
                        }
                        b81.w("invalid_apk_identity");
                        return null;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ji2.z(zipFile, th);
                            throw th2;
                        }
                    }
                }
                j += (long) i;
                if (j > cloudClientArtifact.getSizeBytes()) {
                    throw new CloudException("invalid_artifact", null, null, null, 14, null);
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ji2.z(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
