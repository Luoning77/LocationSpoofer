package com.vincenthzr.locationspoofer.data.update;

import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.Ipv4PreferredDns;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import defpackage.au0;
import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.bh3;
import defpackage.ca0;
import defpackage.du;
import defpackage.dv;
import defpackage.ee0;
import defpackage.f5;
import defpackage.fo;
import defpackage.fz;
import defpackage.gv;
import defpackage.hd0;
import defpackage.i41;
import defpackage.i52;
import defpackage.if2;
import defpackage.iv;
import defpackage.j12;
import defpackage.j41;
import defpackage.ji2;
import defpackage.k12;
import defpackage.k41;
import defpackage.l13;
import defpackage.lu0;
import defpackage.mc0;
import defpackage.md0;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.nx0;
import defpackage.o51;
import defpackage.ox0;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qg2;
import defpackage.r60;
import defpackage.s90;
import defpackage.tg2;
import defpackage.vj0;
import defpackage.wg2;
import defpackage.xd2;
import defpackage.yf2;
import defpackage.ym2;
import defpackage.yo;
import defpackage.yz0;
import defpackage.z70;
import defpackage.zy;
import defpackage.zz0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelfHostedUpdates {
    public static final String APPLICATION_ID = "com.vincenthzr.locationspoofer";
    public static final String CERTIFICATE = "1541598136c33de4103ca7586274e5d9231b4e6758b400cedb63b9105b2ceaf2";
    private static final long MAX_APK_BYTES = 134217728;
    public static final int MAX_MANIFEST_BYTES = 262144;
    public static final String ORIGIN = "https://downloads.vincenthzr.org:8443";
    private final zz0 base;
    private final k12 client;
    public static final Companion Companion = new Companion(null);
    private static final if2 VERSION = new if2("[0-9]+\\.[0-9]+\\.[0-9]+(?:-beta[-.][0-9]+)?");
    private static final if2 ID = new if2("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}");
    private static final Set<String> DOWNLOAD_ERRORS = yo.H0(new String[]{"download_ticket_expired", "download_ticket_used", "download_quota_exceeded", "download_rate_limited", "service_busy"});

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$download$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates", f = "SelfHostedUpdates.kt", l = {44}, m = "download")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelfHostedUpdates.this.download(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfHostedUpdates(String str, boolean z) {
        str.getClass();
        yz0 yz0Var = new yz0();
        md0 md0Var = null;
        Object[] objArr = 0;
        yz0Var.f(null, str);
        zz0 zz0VarA = yz0Var.a();
        if (!zz0VarA.b().equals("/") || zz0VarA.g() != null || zz0VarA.g != null || zz0VarA.b.length() != 0 || zz0VarA.c.length() != 0) {
            fo.i("Failed requirement.");
            throw null;
        }
        if (!str.equals(ORIGIN) && (!z || !o51.f(zz0VarA.a, "http") || !yo.H0(new String[]{"127.0.0.1", "localhost", "::1"}).contains(zz0VarA.d))) {
            fo.i("Failed requirement.");
            throw null;
        }
        this.base = zz0VarA;
        j12 j12Var = new j12();
        j12Var.h = false;
        j12Var.i = false;
        j12Var.b(new Ipv4PreferredDns(md0Var, 1, objArr == true ? 1 : 0));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        j12Var.x = bh3.b(15L);
        timeUnit.getClass();
        j12Var.y = bh3.b(40L);
        j12Var.a(300L);
        this.client = new k12(j12Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File download$lambda$3(UpdateArtifact updateArtifact, File file, lu0 lu0Var, qg2 qg2Var, au0 au0Var) throws CloudException, IOException {
        qg2Var.getClass();
        au0Var.getClass();
        tg2 tg2Var = qg2Var.k;
        if (tg2Var == null) {
            b81.w("invalid_artifact");
            return null;
        }
        long j = 0;
        if (tg2Var.contentLength() >= 0 && tg2Var.contentLength() != updateArtifact.getSizeBytes()) {
            b81.w("invalid_artifact");
            return null;
        }
        File fileCreateTempFile = File.createTempFile("public-update-", ".part", file.getParentFile());
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            InputStream inputStreamByteStream = tg2Var.byteStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        au0Var.invoke();
                        int i = inputStreamByteStream.read(bArr);
                        if (i < 0) {
                            if (j == updateArtifact.getSizeBytes()) {
                                Companion companion = Companion;
                                byte[] bArrDigest = messageDigest.digest();
                                bArrDigest.getClass();
                                if (o51.f(companion.hex(bArrDigest), updateArtifact.getSha256())) {
                                    fileOutputStream.getFD().sync();
                                    fileOutputStream.close();
                                    ji2.z(inputStreamByteStream, null);
                                    au0Var.invoke();
                                    if (file.exists() || !fileCreateTempFile.renameTo(file)) {
                                        throw new CloudException("invalid_artifact", null, null, null, 14, null);
                                    }
                                    fileCreateTempFile.delete();
                                    return file;
                                }
                            }
                            throw new CloudException("invalid_artifact", null, null, null, 14, null);
                        }
                        j += (long) i;
                        if (j > updateArtifact.getSizeBytes()) {
                            throw new CloudException("invalid_artifact", null, null, null, 14, null);
                        }
                        messageDigest.update(bArr, 0, i);
                        fileOutputStream.write(bArr, 0, i);
                        lu0Var.invoke(Integer.valueOf((int) ((100 * j) / updateArtifact.getSizeBytes())));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ji2.z(inputStreamByteStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            fileCreateTempFile.delete();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object request(String str, String str2, final pu0 pu0Var, q60 q60Var) {
        Map mapUnmodifiableMap;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nx0 nx0Var = new nx0(0);
        yz0 yz0VarF = this.base.f();
        yz0VarF.c(str);
        yz0VarF.d(str2);
        zz0 zz0VarA = yz0VarF.a();
        nx0Var.q("Accept", "application/vnd.android.package-archive");
        nx0Var.q("Accept-Encoding", "identity");
        ox0 ox0VarC = nx0Var.c();
        byte[] bArr = bh3.a;
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = vj0.e;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            mapUnmodifiableMap.getClass();
        }
        yf2 yf2Var = new yf2(zz0VarA, "GET", ox0VarC, null, mapUnmodifiableMap);
        k12 k12Var = this.client;
        k12Var.getClass();
        final xd2 xd2Var = new xd2(k12Var, yf2Var);
        cancellableContinuationImpl.invokeOnCancellation(new lu0() { // from class: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$request$2$1
            @Override // defpackage.lu0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return mf3.a;
            }

            public final void invoke(Throwable th) {
                xd2Var.cancel();
            }
        });
        xd2Var.enqueue(new gv() { // from class: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$request$2$2
            @Override // defpackage.gv
            public void onFailure(dv dvVar, IOException iOException) {
                dvVar.getClass();
                iOException.getClass();
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(new wg2(new CloudException("network_error", null, null, null, 14, null)));
                }
            }

            /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
            /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
            @Override // defpackage.gv
            public void onResponse(dv dvVar, qg2 qg2Var) {
                String str3;
                CloudException cloudException;
                String strJ;
                Object wg2Var;
                du duVarSource;
                dvVar.getClass();
                qg2Var.getClass();
                int i = qg2Var.h;
                try {
                    pu0 pu0Var2 = pu0Var;
                    final CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    try {
                        if (300 <= i && i < 400) {
                            throw new CloudException("redirect_rejected", null, null, null, 14, null);
                        }
                        if (qg2Var.F()) {
                            Object objInvoke = pu0Var2.invoke(qg2Var, new au0() { // from class: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$request$2$2$onResponse$value$1$1
                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                public final void m4invoke() {
                                    if (!cancellableContinuation.isActive()) {
                                        throw new CancellationException("更新已取消");
                                    }
                                }

                                @Override // defpackage.au0
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m4invoke();
                                    return mf3.a;
                                }
                            });
                            qg2Var.close();
                            if (cancellableContinuationImpl.isActive()) {
                                cancellableContinuationImpl.resumeWith(objInvoke);
                                return;
                            } else {
                                if (objInvoke instanceof File) {
                                    ((File) objInvoke).delete();
                                    return;
                                }
                                return;
                            }
                        }
                        tg2 tg2Var = qg2Var.k;
                        Object obj = null;
                        if (tg2Var == null || (duVarSource = tg2Var.source()) == null) {
                            strJ = null;
                        } else {
                            duVarSource.s(4096L);
                            strJ = duVarSource.j(Math.min(4096L, duVarSource.x().f));
                        }
                        if (strJ == null) {
                            strJ = "";
                        }
                        try {
                            wg2Var = new JSONObject(strJ).getString("code");
                        } catch (Throwable th) {
                            wg2Var = new wg2(th);
                        }
                        if (!(wg2Var instanceof wg2)) {
                            obj = wg2Var;
                        }
                        String str4 = (String) obj;
                        if (zy.g0(SelfHostedUpdates.DOWNLOAD_ERRORS, str4)) {
                            str4.getClass();
                        } else {
                            str4 = "artifact_unavailable";
                        }
                        throw new CloudException(str4, Integer.valueOf(i), null, null, 12, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ji2.z(qg2Var, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e) {
                    if (cancellableContinuationImpl.isActive()) {
                        q60 q60Var2 = cancellableContinuationImpl;
                        if (e instanceof CloudException) {
                            cloudException = (CloudException) e;
                        } else {
                            if (e instanceof IOException) {
                                str3 = "network_error";
                            } else {
                                str3 = "invalid_response";
                            }
                            cloudException = new CloudException(str3, null, null, null, 14, null);
                        }
                        q60Var2.resumeWith(new wg2(cloudException));
                    }
                }
                if (cancellableContinuationImpl.isActive()) {
                    q60 q60Var3 = cancellableContinuationImpl;
                    if (e instanceof CloudException) {
                        cloudException = (CloudException) e;
                    } else {
                        if (e instanceof IOException) {
                            str3 = "network_error";
                        } else {
                            str3 = "invalid_response";
                        }
                        cloudException = new CloudException(str3, null, null, null, 14, null);
                    }
                    q60Var3.resumeWith(new wg2(cloudException));
                }
            }
        });
        return cancellableContinuationImpl.getResult();
    }

    public static /* synthetic */ Object request$default(SelfHostedUpdates selfHostedUpdates, String str, String str2, pu0 pu0Var, q60 q60Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return selfHostedUpdates.request(str, str2, pu0Var, q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object download(UpdateArtifact updateArtifact, JSONObject jSONObject, File file, lu0 lu0Var, q60 q60Var) throws Exception {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                return obj;
            }
            ee0.J(obj);
            Companion.requireValid(updateArtifact);
            zz0 zz0VarGrantUrl$core_data_globalRelease = grantUrl$core_data_globalRelease(jSONObject, updateArtifact);
            if (file.exists()) {
                b81.w("invalid_artifact");
                return null;
            }
            String strB = zz0VarGrantUrl$core_data_globalRelease.b();
            String strG = zz0VarGrantUrl$core_data_globalRelease.g();
            pu0 f5Var = new f5(updateArtifact, file, lu0Var, 11);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = file;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 1;
            Object objRequest = request(strB, strG, f5Var, anonymousClass1);
            Object obj2 = z70.e;
            return objRequest == obj2 ? obj2 : objRequest;
        } catch (Exception e) {
            file.delete();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    public final zz0 grantUrl$core_data_globalRelease(JSONObject jSONObject, UpdateArtifact updateArtifact) throws CloudException {
        String str;
        jSONObject.getClass();
        updateArtifact.getClass();
        try {
            String string = jSONObject.getString("url");
            string.getClass();
            yz0 yz0Var = new yz0();
            yz0Var.f(null, string);
            zz0 zz0VarA = yz0Var.a();
            long j = jSONObject.getLong("expiresAt") - System.currentTimeMillis();
            if (jSONObject.getInt("schemaVersion") == 1 && o51.f(jSONObject.getString("artifactId"), updateArtifact.getId()) && o51.f(jSONObject.getString("sha256"), updateArtifact.getSha256()) && jSONObject.getLong("sizeBytes") == updateArtifact.getSizeBytes() && jSONObject.getInt("expiresIn") == 180 && 1 <= j && j < 195001 && o51.f(zz0VarA.a, this.base.a) && o51.f(zz0VarA.d, this.base.d) && zz0VarA.e == this.base.e && zz0VarA.b.length() <= 0 && zz0VarA.c.length() <= 0 && zz0VarA.g == null) {
                if (zz0VarA.b().equals("/locationspoofer/files/" + updateArtifact.getId()) && zz0VarA.h().equals(mc0.H("t")) && zz0VarA.i().size() == 1) {
                    Pattern patternCompile = Pattern.compile("v1\\.[A-Za-z0-9_-]{1,2400}\\.[A-Za-z0-9_-]{86}");
                    patternCompile.getClass();
                    List list = zz0VarA.f;
                    if (list != null) {
                        i41 i41VarC0 = mh0.c0(mh0.f0(0, list.size()), 2);
                        int i = i41VarC0.e;
                        int i2 = i41VarC0.f;
                        int i3 = i41VarC0.g;
                        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                            while (true) {
                                if (!"t".equals(list.get(i))) {
                                    if (i == i2) {
                                        str = null;
                                        break;
                                    }
                                    i += i3;
                                } else {
                                    str = (String) list.get(i + 1);
                                    break;
                                }
                            }
                        } else {
                            str = null;
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (patternCompile.matcher(str).matches()) {
                        return zz0VarA;
                    }
                }
            }
            throw new CloudException("invalid_artifact", null, null, null, 14, null);
        } catch (Exception unused) {
            b81.w("invalid_artifact");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String hex(byte[] bArr) {
            return yo.z0(bArr, new ym2(14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence hex$lambda$0(byte b) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        private final Void invalid() throws CloudException {
            throw new CloudException("invalid_response", null, null, null, 14, null);
        }

        public final String artifactPath(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String str4 = str2.equals("global") ? "global" : "non-global";
            String str5 = str3.equals("arm64-v8a") ? "64" : "32";
            StringBuilder sbT = p91.t("/locationspoofer/releases/v", str, "/LocationSpoofer-v", str, "-");
            p91.y(sbT, str4, "-", str5, "bit-");
            return az2.p(sbT, str3, ".apk");
        }

        public final List<GithubRelease> parseCatalog(JSONObject jSONObject, String str, Set<String> set) {
            Object obj;
            String str2;
            Object obj2;
            jSONObject.getClass();
            str.getClass();
            set.getClass();
            Set<String> setH0 = yo.H0(new String[]{"arm64-v8a", "armeabi-v7a"});
            ArrayList arrayListX0 = zy.x0(parseManifest(jSONObject, "global", setH0), parseManifest(jSONObject, "scoped", setH0));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayListX0.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayListX0.get(i);
                i++;
                Integer numValueOf = Integer.valueOf(((GithubRelease) obj3).getVersionCode());
                Object arrayList = linkedHashMap.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList);
                }
                ((List) arrayList).add(obj3);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List<GithubRelease> list = (List) ((Map.Entry) it.next()).getValue();
                if (list.size() == 2) {
                    ArrayList arrayList3 = new ArrayList(az.Y(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((GithubRelease) it2.next()).getVersionName());
                    }
                    if (zy.N0(arrayList3).size() == 1) {
                        ArrayList arrayList4 = new ArrayList(az.Y(list, 10));
                        for (GithubRelease githubRelease : list) {
                            arrayList4.add(new i52(githubRelease.getBody(), githubRelease.getPublishedAt()));
                        }
                        if (zy.N0(arrayList4).size() == 1) {
                            ArrayList arrayList5 = new ArrayList(az.Y(list, 10));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(Boolean.valueOf(((GithubRelease) it3.next()).isPrerelease()));
                            }
                            if (zy.N0(arrayList5).size() == 1) {
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    fz.b0(arrayList6, ((GithubRelease) it4.next()).getUpdateArtifacts());
                                }
                                ArrayList arrayList7 = new ArrayList(az.Y(arrayList6, 10));
                                int size2 = arrayList6.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj4 = arrayList6.get(i2);
                                    i2++;
                                    UpdateArtifact updateArtifact = (UpdateArtifact) obj4;
                                    arrayList7.add(new i52(updateArtifact.getScheme(), updateArtifact.getAbi()));
                                }
                                if (zy.N0(arrayList7).size() != 4) {
                                    SelfHostedUpdates.Companion.invalid();
                                    fo.d();
                                    return null;
                                }
                                ArrayList arrayList8 = new ArrayList();
                                int size3 = arrayList6.size();
                                int i3 = 0;
                                while (i3 < size3) {
                                    Object obj5 = arrayList6.get(i3);
                                    i3++;
                                    UpdateArtifact updateArtifact2 = (UpdateArtifact) obj5;
                                    if (o51.f(updateArtifact2.getScheme(), str) && set.contains(updateArtifact2.getAbi())) {
                                        arrayList8.add(obj5);
                                    }
                                }
                                int size4 = arrayList8.size();
                                int i4 = 0;
                                do {
                                    if (i4 >= size4) {
                                        obj = null;
                                        break;
                                    }
                                    obj = arrayList8.get(i4);
                                    i4++;
                                } while (!o51.f(((UpdateArtifact) obj).getAbi(), "arm64-v8a"));
                                UpdateArtifact updateArtifact3 = (UpdateArtifact) obj;
                                if (updateArtifact3 == null) {
                                    updateArtifact3 = (UpdateArtifact) zy.o0(arrayList8);
                                }
                                GithubRelease githubRelease2 = (GithubRelease) zy.n0(list);
                                String path = updateArtifact3 != null ? updateArtifact3.getPath() : null;
                                int size5 = arrayList8.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size5) {
                                        str2 = null;
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = arrayList8.get(i5);
                                    i5++;
                                    UpdateArtifact updateArtifact4 = (UpdateArtifact) obj2;
                                    str2 = null;
                                    if (o51.f(updateArtifact4.getAbi(), "armeabi-v7a") && !updateArtifact4.equals(updateArtifact3)) {
                                        break;
                                    }
                                }
                                UpdateArtifact updateArtifact5 = (UpdateArtifact) obj2;
                                arrayList2.add(GithubRelease.copy$default(githubRelease2, null, null, path, updateArtifact5 != null ? updateArtifact5.getPath() : str2, null, false, null, 0, arrayList6, 243, null));
                            }
                        }
                    }
                }
                SelfHostedUpdates.Companion.invalid();
                fo.d();
                return null;
            }
            return zy.C0(arrayList2, new Comparator() { // from class: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$Companion$parseCatalog$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return Integer.valueOf(((GithubRelease) t2).getVersionCode()).compareTo(Integer.valueOf(((GithubRelease) t).getVersionCode()));
                }
            });
        }

        public final List<GithubRelease> parseManifest(JSONObject jSONObject, String str, Set<String> set) throws CloudException {
            Object obj;
            Object obj2;
            jSONObject.getClass();
            str.getClass();
            set.getClass();
            try {
                try {
                    if (jSONObject.getInt("schemaVersion") != 2 || !o51.f(jSONObject.getString("applicationId"), SelfHostedUpdates.APPLICATION_ID) || !yo.H0(new String[]{"scoped", "global"}).contains(str)) {
                        invalid();
                        throw new iv();
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("releases");
                    if (jSONArray.length() > 40) {
                        invalid();
                        throw new iv();
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    int i = 0;
                    while (i < length) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string = jSONObject2.getString("scheme");
                        String string2 = jSONObject2.getString("versionName");
                        int i2 = jSONObject2.getInt("versionCode");
                        String string3 = jSONObject2.getString("body");
                        String string4 = jSONObject2.getString("publishedAt");
                        Object obj3 = jSONObject2.get("isPrerelease");
                        obj3.getClass();
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        string2.getClass();
                        JSONArray jSONArray2 = jSONArray;
                        if (zBooleanValue != l13.c0(string2, "-beta", false)) {
                            invalid();
                            throw new iv();
                        }
                        Instant.parse(string4);
                        if (string3.length() <= 65536 && o51.f(jSONObject2.getString("signingCertificateSha256"), SelfHostedUpdates.CERTIFICATE)) {
                            Pattern patternCompile = Pattern.compile("[a-f0-9]{40}");
                            patternCompile.getClass();
                            String string5 = jSONObject2.getString("commit");
                            string5.getClass();
                            if (patternCompile.matcher(string5).matches()) {
                                if (linkedHashSet.add(string + ":" + string2) && linkedHashSet2.add(new i52(string, Integer.valueOf(i2)))) {
                                    JSONArray jSONArray3 = jSONObject2.getJSONArray("artifacts");
                                    if (jSONArray3.length() != 2) {
                                        invalid();
                                        throw new iv();
                                    }
                                    k41 k41VarF0 = mh0.f0(0, jSONArray3.length());
                                    LinkedHashSet linkedHashSet4 = linkedHashSet;
                                    ArrayList arrayList2 = new ArrayList(az.Y(k41VarF0, 10));
                                    Iterator it = k41VarF0.iterator();
                                    while (((j41) it).g) {
                                        JSONObject jSONObject3 = jSONArray3.getJSONObject(((j41) it).nextInt());
                                        String str2 = string2;
                                        String string6 = jSONObject3.getString("id");
                                        string6.getClass();
                                        String string7 = jSONObject3.getString("abi");
                                        string7.getClass();
                                        JSONArray jSONArray4 = jSONArray3;
                                        String string8 = jSONObject3.getString("path");
                                        string8.getClass();
                                        String string9 = jSONObject3.getString("sha256");
                                        string9.getClass();
                                        long j = jSONObject3.getLong("sizeBytes");
                                        string.getClass();
                                        String str3 = string;
                                        UpdateArtifact updateArtifact = new UpdateArtifact(string6, string7, string8, string9, j, str3, str2, i2);
                                        Companion companion = SelfHostedUpdates.Companion;
                                        companion.requireValid(updateArtifact);
                                        if (!linkedHashSet3.add(updateArtifact.getId())) {
                                            companion.invalid();
                                            throw new iv();
                                        }
                                        arrayList2.add(updateArtifact);
                                        string = str3;
                                        string2 = str2;
                                        jSONArray3 = jSONArray4;
                                    }
                                    String str4 = string;
                                    String str5 = string2;
                                    ArrayList arrayList3 = new ArrayList(az.Y(arrayList2, 10));
                                    int size = arrayList2.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        Object obj4 = arrayList2.get(i3);
                                        i3++;
                                        arrayList3.add(((UpdateArtifact) obj4).getAbi());
                                    }
                                    if (!zy.N0(arrayList3).equals(yo.H0(new String[]{"arm64-v8a", "armeabi-v7a"}))) {
                                        invalid();
                                        throw new iv();
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    int size2 = arrayList2.size();
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        Object obj5 = arrayList2.get(i4);
                                        i4++;
                                        int i5 = size2;
                                        if (set.contains(((UpdateArtifact) obj5).getAbi())) {
                                            arrayList4.add(obj5);
                                        }
                                        size2 = i5;
                                    }
                                    if (o51.f(str4, str) && !arrayList4.isEmpty()) {
                                        int size3 = arrayList4.size();
                                        int i6 = 0;
                                        do {
                                            if (i6 >= size3) {
                                                obj = null;
                                                break;
                                            }
                                            obj = arrayList4.get(i6);
                                            i6++;
                                        } while (!o51.f(((UpdateArtifact) obj).getAbi(), "arm64-v8a"));
                                        UpdateArtifact updateArtifact2 = (UpdateArtifact) obj;
                                        if (updateArtifact2 == null) {
                                            updateArtifact2 = (UpdateArtifact) zy.n0(arrayList4);
                                        }
                                        String path = updateArtifact2.getPath();
                                        int size4 = arrayList4.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size4) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = arrayList4.get(i7);
                                            i7++;
                                            UpdateArtifact updateArtifact3 = (UpdateArtifact) obj2;
                                            int i8 = size4;
                                            if (o51.f(updateArtifact3.getAbi(), "armeabi-v7a") && !updateArtifact3.equals(updateArtifact2)) {
                                                break;
                                            }
                                            size4 = i8;
                                        }
                                        UpdateArtifact updateArtifact4 = (UpdateArtifact) obj2;
                                        String path2 = updateArtifact4 != null ? updateArtifact4.getPath() : null;
                                        string4.getClass();
                                        arrayList.add(new GithubRelease(str5, string3, path, path2, string4, zBooleanValue, null, i2, arrayList4, 64, null));
                                    }
                                    i++;
                                    jSONArray = jSONArray2;
                                    linkedHashSet = linkedHashSet4;
                                }
                            }
                        }
                        invalid();
                        throw new iv();
                    }
                    return zy.C0(arrayList, new Comparator() { // from class: com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates$Companion$parseManifest$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return Integer.valueOf(((GithubRelease) t2).getVersionCode()).compareTo(Integer.valueOf(((GithubRelease) t).getVersionCode()));
                        }
                    });
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            b81.w("invalid_response");
            return null;
        }

        public final void requireValid(UpdateArtifact updateArtifact) throws CloudException {
            int versionCode;
            updateArtifact.getClass();
            if (SelfHostedUpdates.ID.b(updateArtifact.getId()) && SelfHostedUpdates.VERSION.b(updateArtifact.getVersionName()) && updateArtifact.getVersionName().length() <= 80 && yo.H0(new String[]{"global", "scoped"}).contains(updateArtifact.getScheme()) && yo.H0(new String[]{"arm64-v8a", "armeabi-v7a"}).contains(updateArtifact.getAbi()) && 1 <= (versionCode = updateArtifact.getVersionCode()) && versionCode < 2100000001) {
                Pattern patternCompile = Pattern.compile("[a-f0-9]{64}");
                patternCompile.getClass();
                String sha256 = updateArtifact.getSha256();
                sha256.getClass();
                if (patternCompile.matcher(sha256).matches()) {
                    long sizeBytes = updateArtifact.getSizeBytes();
                    if (1 <= sizeBytes && sizeBytes < 134217729 && o51.f(updateArtifact.getPath(), artifactPath(updateArtifact.getVersionName(), updateArtifact.getScheme(), updateArtifact.getAbi()))) {
                        return;
                    }
                }
            }
            b81.w("invalid_artifact");
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelfHostedUpdates(String str, boolean z, int i, ca0 ca0Var) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public SelfHostedUpdates() {
        this(ORIGIN, false, 2, null);
    }
}
