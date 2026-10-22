package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.az2;
import defpackage.bv0;
import defpackage.ca0;
import defpackage.fo;
import defpackage.ji2;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.my;
import defpackage.sw;
import defpackage.wg2;
import defpackage.yo;
import defpackage.zy;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class EncryptedMapResourceCache implements CloudMapResourceCache {
    public static final Companion Companion = new Companion(null);
    private static final byte FORMAT = 1;
    private static final long MAX_RESOURCE_BYTES = 8388608;
    private final au0 clock;
    private final File directory;
    private long diskBytes;
    private final lu0 event;
    private LinkedHashMap<String, Long> index;
    private final au0 key;
    private final long maxBytes;
    private final int maxEntries;
    private final long ttlMillis;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.EncryptedMapResourceCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class AnonymousClass1 extends bv0 implements au0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // defpackage.au0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public /* synthetic */ EncryptedMapResourceCache(File file, au0 au0Var, au0 au0Var2, long j, int i, long j2, lu0 lu0Var, int i2, ca0 ca0Var) {
        this(file, au0Var, (i2 & 4) != 0 ? AnonymousClass1.INSTANCE : au0Var2, (i2 & 8) != 0 ? 268435456L : j, (i2 & 16) != 0 ? 8192 : i, (i2 & 32) != 0 ? 7776000000L : j2, (i2 & 64) != 0 ? new my(22) : lu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 _init_$lambda$0(String str) {
        str.getClass();
        return mf3.a;
    }

    private final byte[] aad(String str, String str2) {
        byte[] bytes = ("location-map-cache-v1\n" + str + "\n" + str2).getBytes(sw.a);
        bytes.getClass();
        return bytes;
    }

    private final File file(String str, String str2) {
        return new File(this.directory, az2.y(CloudModelsKt.cloudBodyDigest(aad(str, str2)), ".bin"));
    }

    private final void forget(String str) {
        Long lRemove;
        long j = this.diskBytes;
        LinkedHashMap<String, Long> linkedHashMap = this.index;
        this.diskBytes = j - ((linkedHashMap == null || (lRemove = linkedHashMap.remove(str)) == null) ? 0L : lRemove.longValue());
    }

    private final void initializeIndex() {
        if (this.index != null) {
            return;
        }
        File[] fileArrListFiles = this.directory.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (name.endsWith(".part")) {
                arrayList.add(file);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((File) obj).delete();
        }
        this.index = new LinkedHashMap<>();
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                String name2 = file2.getName();
                name2.getClass();
                Pattern patternCompile = Pattern.compile("[A-Za-z0-9_-]{43}\\.bin");
                patternCompile.getClass();
                if (patternCompile.matcher(name2).matches()) {
                    arrayList2.add(file2);
                }
            }
        }
        Iterator it = zy.C0(arrayList2, new Comparator() { // from class: com.vincenthzr.locationspoofer.data.cloud.EncryptedMapResourceCache$initializeIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((File) t).lastModified()).compareTo(Long.valueOf(((File) t2).lastModified()));
            }
        }).iterator();
        while (it.hasNext()) {
            remember((File) it.next());
        }
        trim();
    }

    private final void remember(File file) {
        String name = file.getName();
        name.getClass();
        forget(name);
        long length = file.length();
        LinkedHashMap<String, Long> linkedHashMap = this.index;
        linkedHashMap.getClass();
        linkedHashMap.put(file.getName(), Long.valueOf(length));
        this.diskBytes += length;
    }

    private final void trim() {
        LinkedHashMap<String, Long> linkedHashMap = this.index;
        linkedHashMap.getClass();
        Iterator<Map.Entry<String, Long>> it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (this.diskBytes <= this.maxBytes) {
                LinkedHashMap<String, Long> linkedHashMap2 = this.index;
                linkedHashMap2.getClass();
                if (linkedHashMap2.size() <= this.maxEntries) {
                    return;
                }
            }
            if (!it.hasNext()) {
                return;
            }
            Map.Entry<String, Long> next = it.next();
            next.getClass();
            Map.Entry<String, Long> entry = next;
            File file = new File(this.directory, entry.getKey());
            if (!file.exists() || file.delete()) {
                long j = this.diskBytes;
                Long value = entry.getValue();
                value.getClass();
                this.diskBytes = j - value.longValue();
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    @Override // com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCache
    public synchronized CloudMapCacheEntry read(String str, String str2, long j, boolean z) {
        Object wg2Var;
        CloudMapCacheEntry cloudMapCacheEntry;
        boolean z2;
        str.getClass();
        str2.getClass();
        File file = file(str, str2);
        try {
            initializeIndex();
            wg2Var = mf3.a;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            this.event.invoke("miss");
            return null;
        }
        if (!file.isFile()) {
            String name = file.getName();
            name.getClass();
            forget(name);
            this.event.invoke("miss");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long length = file.length();
                if (45 > length || length > Math.min(j, MAX_RESOURCE_BYTES) + 64) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i = (int) length;
                byte[] bArr = new byte[i];
                new DataInputStream(fileInputStream).readFully(bArr);
                if (fileInputStream.read() != -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                fileInputStream.close();
                if (bArr[0] != 1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, (Key) this.key.invoke(), new GCMParameterSpec(WorkQueueKt.BUFFER_CAPACITY, yo.q0(bArr, 1, 13)));
                cipher.updateAAD(aad(str, str2));
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(cipher.doFinal(bArr, 13, i - 13)));
                try {
                    long j2 = dataInputStream.readLong();
                    long jLongValue = ((Number) this.clock.invoke()).longValue();
                    if (jLongValue >= j2) {
                        long j3 = jLongValue - j2;
                        if (j3 < this.ttlMillis) {
                            if (!str2.endsWith("/style-light.json") && !str2.endsWith("/style-dark.json")) {
                                z2 = false;
                            } else if (j3 >= 21600000) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i2 = dataInputStream.readInt();
                            int i3 = dataInputStream.readInt();
                            if (i3 < 0 || i3 > ((int) Math.min(j, MAX_RESOURCE_BYTES)) || i3 != dataInputStream.available()) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (i2 != 200 && (!z || i2 != 204 || i3 != 0)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            byte[] bArr2 = new byte[i3];
                            dataInputStream.readFully(bArr2);
                            CloudMapCacheEntry cloudMapCacheEntry2 = new CloudMapCacheEntry(bArr2, i2, z2);
                            dataInputStream.close();
                            file.setLastModified(((Number) this.clock.invoke()).longValue());
                            remember(file);
                            this.event.invoke("hit");
                            cloudMapCacheEntry = cloudMapCacheEntry2;
                            return cloudMapCacheEntry;
                        }
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ji2.z(dataInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ji2.z(fileInputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception unused) {
            file.delete();
            String name2 = file.getName();
            name2.getClass();
            forget(name2);
            this.event.invoke("discard");
            cloudMapCacheEntry = null;
        }
    }

    @Override // com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCache
    public synchronized void remove(String str, String str2) {
        try {
            str.getClass();
            str2.getClass();
            File file = file(str, str2);
            if (file.exists() && !file.delete()) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.index != null) {
                String name = file.getName();
                name.getClass();
                forget(name);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r10.getBytes().length == 0) == false) goto L59;
     */
    @Override // com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void write(java.lang.String r8, java.lang.String r9, com.vincenthzr.locationspoofer.data.cloud.CloudMapCacheEntry r10) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.cloud.EncryptedMapResourceCache.write(java.lang.String, java.lang.String, com.vincenthzr.locationspoofer.data.cloud.CloudMapCacheEntry):void");
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        private Companion() {
        }
    }

    public EncryptedMapResourceCache(File file, au0 au0Var, au0 au0Var2, long j, int i, long j2, lu0 lu0Var) {
        file.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        lu0Var.getClass();
        this.directory = file;
        this.key = au0Var;
        this.clock = au0Var2;
        this.maxBytes = j;
        this.maxEntries = i;
        this.ttlMillis = j2;
        this.event = lu0Var;
        if (j <= 0 || i <= 0 || j2 <= 0) {
            fo.i("Failed requirement.");
            throw null;
        }
    }
}
