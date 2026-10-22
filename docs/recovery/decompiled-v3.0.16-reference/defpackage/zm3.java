package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zm3 {
    public static final lz A;
    public static final lz B;
    public static final lz C;
    public static final float D;
    public static final lz E;
    public static final lz F;
    public static final byte[] G;
    public static final byte[] H;
    public static final da3 I;
    public static final /* synthetic */ int J = 0;
    public static x01 K;
    public static x01 L;
    public static final ke3 a = ke3.h;
    public static final p10 b = new p10(new r10(15), false, -1192429467);
    public static final p10 c = new p10(new r10(16), false, -1613004644);
    public static final p10 d = new p10(new a20(0), false, 875485385);
    public static final p10 e = new p10(new c20(12), false, 1721828883);
    public static final p10 f = new p10(new c20(13), false, -1081157556);
    public static final p10 g = new p10(new c20(14), false, -1725368519);
    public static final p10 h = new p10(new b20(28), false, -1977828348);
    public static final gq0 i = new gq0(8);
    public static final cu2 j = cu2.i;
    public static final lz k;
    public static final float l;
    public static final float m;
    public static final lz n;
    public static final float o;
    public static final lz p;
    public static final float q;
    public static final lz r;
    public static final float s;
    public static final lz t;
    public static final float u;
    public static final ke3 v;
    public static final lz w;
    public static final lz x;
    public static final lz y;
    public static final float z;

    static {
        lz lzVar = lz.i;
        k = lzVar;
        l = 0.38f;
        m = 8.0f;
        n = lzVar;
        o = 0.12f;
        p = lzVar;
        q = 0.12f;
        r = lz.o;
        s = 1.0f;
        t = lz.l;
        u = 1.0f;
        v = ke3.g;
        lz lzVar2 = lz.h;
        w = lzVar2;
        lz lzVar3 = lz.j;
        x = lzVar3;
        y = lzVar;
        z = 0.38f;
        A = lzVar2;
        B = lz.m;
        C = lzVar;
        D = 0.38f;
        E = lzVar2;
        F = lzVar3;
        G = new byte[]{112, 114, 111, 0};
        H = new byte[]{112, 114, 109, 0};
        I = new da3(0, new long[0], new Object[0]);
    }

    public static final dv1 A(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new h91(lu0Var, null));
    }

    public static final dv1 B(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new h91(null, lu0Var));
    }

    public static final dv1 C(dv1 dv1Var, z42 z42Var) {
        return dv1Var.d(new a52(z42Var));
    }

    public static final dv1 D(dv1 dv1Var, float f2) {
        return dv1Var.d(new x42(f2, f2, f2, f2));
    }

    public static final dv1 E(dv1 dv1Var, float f2, float f3) {
        return dv1Var.d(new x42(f2, f3, f2, f3));
    }

    public static dv1 F(dv1 dv1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return E(dv1Var, f2, f3);
    }

    public static dv1 G(dv1 dv1Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return dv1Var.d(new x42(f2, f3, f4, f5));
    }

    public static int[] H(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iB0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iB0 += (int) wc0.b0(byteArrayInputStream, 2);
            iArr[i3] = iB0;
        }
        return iArr;
    }

    public static nc0[] I(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, nc0[] nc0VarArr) throws IOException {
        byte[] bArr3 = sb.i0;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, sb.j0)) {
                fo.n("Unsupported meta version");
                return null;
            }
            int iB0 = (int) wc0.b0(fileInputStream, 2);
            byte[] bArrA0 = wc0.a0(fileInputStream, (int) wc0.b0(fileInputStream, 4), (int) wc0.b0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                fo.n("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA0);
            try {
                nc0[] nc0VarArrK = K(byteArrayInputStream, bArr2, iB0, nc0VarArr);
                byteArrayInputStream.close();
                return nc0VarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(sb.d0, bArr2)) {
            fo.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            fo.n("Unsupported meta version");
            return null;
        }
        int iB1 = (int) wc0.b0(fileInputStream, 1);
        byte[] bArrA1 = wc0.a0(fileInputStream, (int) wc0.b0(fileInputStream, 4), (int) wc0.b0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            fo.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrA1);
        try {
            nc0[] nc0VarArrJ = J(byteArrayInputStream2, iB1, nc0VarArr);
            byteArrayInputStream2.close();
            return nc0VarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static nc0[] J(ByteArrayInputStream byteArrayInputStream, int i2, nc0[] nc0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new nc0[0];
        }
        if (i2 != nc0VarArr.length) {
            fo.n("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iB0 = (int) wc0.b0(byteArrayInputStream, 2);
            iArr[i3] = (int) wc0.b0(byteArrayInputStream, 2);
            strArr[i3] = new String(wc0.Z(byteArrayInputStream, iB0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            nc0 nc0Var = nc0VarArr[i4];
            if (!nc0Var.b.equals(strArr[i4])) {
                fo.n("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            nc0Var.e = i5;
            nc0Var.h = H(byteArrayInputStream, i5);
        }
        return nc0VarArr;
    }

    public static nc0[] K(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, nc0[] nc0VarArr) throws IOException {
        nc0 nc0Var;
        if (byteArrayInputStream.available() == 0) {
            return new nc0[0];
        }
        if (i2 != nc0VarArr.length) {
            fo.n("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            wc0.b0(byteArrayInputStream, 2);
            String str = new String(wc0.Z(byteArrayInputStream, (int) wc0.b0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jB0 = wc0.b0(byteArrayInputStream, 4);
            int iB0 = (int) wc0.b0(byteArrayInputStream, 2);
            if (nc0VarArr.length <= 0) {
                nc0Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= nc0VarArr.length) {
                    nc0Var = null;
                    break;
                }
                if (nc0VarArr[i4].b.equals(strSubstring)) {
                    nc0Var = nc0VarArr[i4];
                    break;
                }
                i4++;
            }
            if (nc0Var == null) {
                fo.n("Missing profile key: ".concat(str));
                return null;
            }
            nc0Var.d = jB0;
            int[] iArrH = H(byteArrayInputStream, iB0);
            if (Arrays.equals(bArr, sb.h0)) {
                nc0Var.e = iB0;
                nc0Var.h = iArrH;
            }
        }
        return nc0VarArr;
    }

    public static nc0[] L(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, sb.e0)) {
            fo.n("Unsupported version");
            return null;
        }
        int iB0 = (int) wc0.b0(fileInputStream, 1);
        byte[] bArrA0 = wc0.a0(fileInputStream, (int) wc0.b0(fileInputStream, 4), (int) wc0.b0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            fo.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA0);
        try {
            nc0[] nc0VarArrM = M(byteArrayInputStream, str, iB0);
            byteArrayInputStream.close();
            return nc0VarArrM;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static nc0[] M(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new nc0[0];
        }
        nc0[] nc0VarArr = new nc0[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iB0 = (int) wc0.b0(byteArrayInputStream, 2);
            int iB1 = (int) wc0.b0(byteArrayInputStream, 2);
            nc0VarArr[i4] = new nc0(str, new String(wc0.Z(byteArrayInputStream, iB0), StandardCharsets.UTF_8), wc0.b0(byteArrayInputStream, 4), iB1, (int) wc0.b0(byteArrayInputStream, 4), (int) wc0.b0(byteArrayInputStream, 4), new int[iB1], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            nc0 nc0Var = nc0VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = nc0Var.f;
            int i7 = nc0Var.g;
            TreeMap treeMap = nc0Var.i;
            int i8 = iAvailable - i6;
            int iB2 = i3;
            while (byteArrayInputStream.available() > i8) {
                iB2 += (int) wc0.b0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iB2), 1);
                int iB3 = (int) wc0.b0(byteArrayInputStream, 2);
                while (iB3 > 0) {
                    wc0.b0(byteArrayInputStream, 2);
                    int iB4 = (int) wc0.b0(byteArrayInputStream, 1);
                    if (iB4 != 6 && iB4 != 7) {
                        while (iB4 > 0) {
                            wc0.b0(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iB5 = (int) wc0.b0(byteArrayInputStream, 1); iB5 > 0; iB5--) {
                                wc0.b0(byteArrayInputStream, 2);
                            }
                            iB4--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iB3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                fo.n("Read too much data during profile line parse");
                return null;
            }
            nc0Var.h = H(byteArrayInputStream, nc0Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(wc0.Z(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return nc0VarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (defpackage.wc0.y(r8, r8) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent N(android.content.Context r8, android.content.BroadcastReceiver r9, android.content.IntentFilter r10, int r11) {
        /*
            r0 = r11 & 2
            r1 = 0
            if (r0 != 0) goto L10
            r2 = r11 & 4
            if (r2 == 0) goto La
            goto L10
        La:
            java.lang.String r8 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            defpackage.fo.i(r8)
            return r1
        L10:
            if (r0 == 0) goto L1d
            r0 = r11 & 4
            if (r0 != 0) goto L17
            goto L1d
        L17:
            java.lang.String r8 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            defpackage.fo.i(r8)
            return r1
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r5 = 0
            r6 = 0
            if (r0 < r1) goto L2e
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            android.content.Intent r8 = r2.registerReceiver(r3, r4, r5, r6, r7)
            return r8
        L2e:
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            r8 = r7 & 4
            if (r8 == 0) goto L86
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r2.getApplicationContext()
            java.lang.String r9 = r9.getPackageName()
            r8.append(r9)
            java.lang.String r9 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r10 = defpackage.wc0.y(r2, r8)
            if (r10 == 0) goto L81
            r10 = 29
            if (r0 < r10) goto L73
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = defpackage.fa.f(r2)
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r9 = defpackage.wc0.y(r2, r8)
            if (r9 != 0) goto L73
            goto L81
        L73:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Permission "
            java.lang.String r11 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r8 = defpackage.az2.k(r10, r8, r11)
            r9.<init>(r8)
            throw r9
        L81:
            android.content.Intent r8 = r2.registerReceiver(r3, r4, r8, r6)
            return r8
        L86:
            r7 = 0
            android.content.Intent r8 = r2.registerReceiver(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm3.N(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, int):android.content.Intent");
    }

    public static final co2 O(f30 f30Var) {
        Object[] objArr = new Object[0];
        boolean zD = ((ov0) f30Var).d(0);
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (zD || objQ == d30.a) {
            objQ = new oi1(21);
            ov0Var.m0(objQ);
        }
        return (co2) wc0.d0(objArr, co2.j, (au0) objQ, ov0Var, 0);
    }

    public static dv1 P(dv1 dv1Var, co2 co2Var, boolean z2) {
        x32 x32Var = x32.e;
        x32 x32Var2 = z2 ? x32Var : x32.f;
        ix1 ix1Var = co2Var.d;
        av1 av1Var = av1.a;
        return dv1Var.d(x32Var2 == x32Var ? xp1.n(av1Var, iy0.c) : xp1.n(av1Var, iy0.b)).d(new do2(null, ix1Var, x32Var2, null, co2Var, true, true)).d(new ro2(co2Var, z2));
    }

    public static final void Q(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void R(r1 r1Var, js2 js2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = r1Var.a;
        Object objG = js2Var.k().e.g(os2.f);
        if (objG == null) {
            objG = null;
        }
        py pyVar = (py) objG;
        if (pyVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(pyVar.a, pyVar.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = js2Var.k().e.g(os2.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = js2.j(4, js2Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                js2 js2Var2 = (js2) listJ.get(i2);
                if (js2Var2.k().e.c(os2.J)) {
                    arrayList.add(js2Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zH = h(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zH ? 1 : arrayList.size(), zH ? arrayList.size() : 1, false, 0));
    }

    public static final dv1 S(dv1 dv1Var, z92 z92Var, lu0 lu0Var, t73 t73Var, lu0 lu0Var2) {
        return dv1Var.d(new m63(z92Var, lu0Var, t73Var, lu0Var2));
    }

    public static final String T(byte b2) {
        char[] cArr = ks.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static boolean U(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, nc0[] nc0VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = sb.h0;
        byte[] bArr3 = sb.g0;
        byte[] bArr4 = sb.d0;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = sb.e0;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrP = p(nc0VarArr, bArr5);
                wc0.o0(byteArrayOutputStream, nc0VarArr.length, 1);
                wc0.o0(byteArrayOutputStream, bArrP.length, 4);
                byte[] bArrZ = wc0.z(bArrP);
                wc0.o0(byteArrayOutputStream, bArrZ.length, 4);
                byteArrayOutputStream.write(bArrZ);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                wc0.o0(byteArrayOutputStream, nc0VarArr.length, 1);
                for (nc0 nc0Var : nc0VarArr) {
                    int size = nc0Var.i.size() * 4;
                    String strQ = q(nc0Var.a, nc0Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    wc0.p0(byteArrayOutputStream, strQ.getBytes(charset).length);
                    wc0.p0(byteArrayOutputStream, nc0Var.h.length);
                    wc0.o0(byteArrayOutputStream, size, 4);
                    wc0.o0(byteArrayOutputStream, nc0Var.c, 4);
                    byteArrayOutputStream.write(strQ.getBytes(charset));
                    Iterator it = nc0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        wc0.p0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        wc0.p0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : nc0Var.h) {
                        wc0.p0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = sb.f0;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrP2 = p(nc0VarArr, bArr6);
                wc0.o0(byteArrayOutputStream, nc0VarArr.length, 1);
                wc0.o0(byteArrayOutputStream, bArrP2.length, 4);
                byte[] bArrZ2 = wc0.z(bArrP2);
                wc0.o0(byteArrayOutputStream, bArrZ2.length, 4);
                byteArrayOutputStream.write(bArrZ2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            wc0.p0(byteArrayOutputStream, nc0VarArr.length);
            for (nc0 nc0Var2 : nc0VarArr) {
                String str = nc0Var2.a;
                TreeMap treeMap = nc0Var2.i;
                String strQ2 = q(str, nc0Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                wc0.p0(byteArrayOutputStream, strQ2.getBytes(charset2).length);
                wc0.p0(byteArrayOutputStream, treeMap.size());
                wc0.p0(byteArrayOutputStream, nc0Var2.h.length);
                wc0.o0(byteArrayOutputStream, nc0Var2.c, 4);
                byteArrayOutputStream.write(strQ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    wc0.p0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : nc0Var2.h) {
                    wc0.p0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            wc0.p0(byteArrayOutputStream2, nc0VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (nc0 nc0Var3 : nc0VarArr) {
                wc0.o0(byteArrayOutputStream2, nc0Var3.c, 4);
                wc0.o0(byteArrayOutputStream2, nc0Var3.d, 4);
                wc0.o0(byteArrayOutputStream2, nc0Var3.g, 4);
                String strQ3 = q(nc0Var3.a, nc0Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strQ3.getBytes(charset3).length;
                wc0.p0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strQ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            tm3 tm3Var = new tm3(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList.add(tm3Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < nc0VarArr.length) {
                try {
                    nc0 nc0Var4 = nc0VarArr[i8];
                    wc0.p0(byteArrayOutputStream3, i8);
                    wc0.p0(byteArrayOutputStream3, nc0Var4.e);
                    i9 = i9 + 4 + (nc0Var4.e * i6);
                    int[] iArr = nc0Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        wc0.p0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            tm3 tm3Var2 = new tm3(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList.add(tm3Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < nc0VarArr.length; i14++) {
                try {
                    nc0 nc0Var5 = nc0VarArr[i14];
                    Iterator it3 = nc0Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        Z(byteArrayOutputStream5, iIntValue, nc0Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            a0(byteArrayOutputStream6, nc0Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            wc0.p0(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            wc0.o0(byteArrayOutputStream4, length4, 4);
                            wc0.p0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            tm3 tm3Var3 = new tm3(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList.add(tm3Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            wc0.o0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                tm3 tm3Var4 = (tm3) arrayList.get(i16);
                int i17 = tm3Var4.a;
                byte[] bArr7 = tm3Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                wc0.o0(byteArrayOutputStream, j2, 4);
                wc0.o0(byteArrayOutputStream, size2, 4);
                if (tm3Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrZ3 = wc0.z(bArr7);
                    arrayList2.add(bArrZ3);
                    wc0.o0(byteArrayOutputStream, bArrZ3.length, 4);
                    wc0.o0(byteArrayOutputStream, length5, 4);
                    length = bArrZ3.length;
                } else {
                    arrayList2.add(bArr7);
                    wc0.o0(byteArrayOutputStream, bArr7.length, 4);
                    wc0.o0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final pe2 V(pe2 pe2Var, pa1 pa1Var, pa1 pa1Var2) {
        if (!pa1Var.U() || !pa1Var2.U()) {
            return pe2.e;
        }
        return ce0.d(pa1Var2.L(wc0.F(pa1Var), pe2Var.e()), pe2Var.d());
    }

    public static dv1 W(dv1 dv1Var, co2 co2Var) {
        return P(dv1Var, co2Var, true);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, nc0 nc0Var) throws IOException {
        a0(byteArrayOutputStream, nc0Var);
        int i2 = nc0Var.g;
        int[] iArr = nc0Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            wc0.p0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : nc0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, nc0 nc0Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        wc0.p0(byteArrayOutputStream, str.getBytes(charset).length);
        wc0.p0(byteArrayOutputStream, nc0Var.e);
        wc0.o0(byteArrayOutputStream, nc0Var.f, 4);
        wc0.o0(byteArrayOutputStream, nc0Var.c, 4);
        wc0.o0(byteArrayOutputStream, nc0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2, nc0 nc0Var) throws IOException {
        int i3 = nc0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : nc0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void a(final dv1 dv1Var, final zv zvVar, final float f2, final p10 p10Var, f30 f30Var, final int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-430427655);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(zvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.c(f2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i2 & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            k22.b(u50.a.a(new hz(zvVar.b)), sb.a0(-1015786183, new pu0() { // from class: dw
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    e03 e03Var;
                    dv1 dv1VarV;
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objQ = ov0Var2.Q();
                        c30 c30Var = d30.a;
                        if (objQ == c30Var) {
                            objQ = new v1(23);
                            ov0Var2.m0(objQ);
                        }
                        dv1 dv1VarA = gs2.a(dv1Var, false, (lu0) objQ);
                        long j2 = zvVar.a;
                        i43 i43Var = d03.a;
                        dv1VarA.getClass();
                        ov0Var2.c0(-904055737);
                        long j3 = hz.c;
                        ov0Var2.c0(1153664760);
                        boolean zBooleanValue = ((Boolean) ov0Var2.j(ph1.a)).booleanValue();
                        float f3 = f2;
                        if (zBooleanValue && q1.e()) {
                            xb0 xb0Var = (xb0) ov0Var2.j(z30.h);
                            float fU = mh0.u(1.1f, 1.0f, 2.0f);
                            boolean zC = ov0Var2.c(f3) | ov0Var2.c(f3) | ov0Var2.c(f3) | ov0Var2.c(f3) | ov0Var2.c(fU) | ov0Var2.f(xb0Var);
                            Object objQ2 = ov0Var2.Q();
                            if (zC || objQ2 == c30Var) {
                                float fR = xb0Var.R(f3);
                                if (fR < 0.0f) {
                                    fR = 0.0f;
                                }
                                float f4 = fR * fU;
                                float fR2 = xb0Var.R(f3);
                                if (fR2 < 0.0f) {
                                    fR2 = 0.0f;
                                }
                                float f5 = fR2 * fU;
                                float fR3 = xb0Var.R(f3);
                                if (fR3 < 0.0f) {
                                    fR3 = 0.0f;
                                }
                                float f6 = fR3 * fU;
                                float fR4 = xb0Var.R(f3);
                                float[] fArr = {f4, f5, f6, (fR4 >= 0.0f ? fR4 : 0.0f) * fU};
                                ov0Var2.m0(fArr);
                                objQ2 = fArr;
                            }
                            float[] fArr2 = (float[]) objQ2;
                            boolean zF = ov0Var2.f(fArr2);
                            Object objQ3 = ov0Var2.Q();
                            if (zF || objQ3 == c30Var) {
                                objQ3 = new e03(j3, fArr2);
                                ov0Var2.m0(objQ3);
                            }
                            e03Var = (e03) objQ3;
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.p(false);
                            e03Var = null;
                        }
                        if (e03Var == null) {
                            bj2 bj2Var = cj2.a;
                            dv1VarV = xp1.k(xp1.n(dv1VarA, new bj2(new ud0(f3), new ud0(f3), new ud0(f3), new ud0(f3))), j2, o51.p0);
                        } else {
                            dv1VarV = xp1.v(am1.z(dv1VarA, new ym2(20)), new jl1(21, e03Var, new hz(j2)));
                        }
                        ov0Var2.p(false);
                        er1 er1VarC = ws.c(j9.f, true);
                        int iHashCode = Long.hashCode(ov0Var2.T);
                        l72 l72VarL = ov0Var2.l();
                        dv1 dv1VarH = xp1.H(ov0Var2, dv1VarV);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, v20.e, er1VarC);
                        q73.h(ov0Var2, v20.d, l72VarL);
                        q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                        q73.g(ov0Var2, v20.g);
                        q73.h(ov0Var2, v20.c, dv1VarH);
                        p10Var.invoke(ov0Var2, 0);
                        ov0Var2.p(true);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: ew
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zm3.a(dv1Var, zvVar, f2, p10Var, (f30) obj, wc0.m0(i2 | 1));
                    return mf3.a;
                }
            };
        }
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, nc0 nc0Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : nc0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                wc0.p0(byteArrayOutputStream, iIntValue - i2);
                wc0.p0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void b(dv1 dv1Var, float f2, b52 b52Var, p10 p10Var, f30 f30Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            dv1Var = av1.a;
        }
        a(dv1Var, bw.a(f30Var), f2, sb.a0(1708141821, new j2(4, b52Var, p10Var), f30Var), f30Var, (i2 & 14) | 3456);
    }

    public static final ac c(String str) {
        return new ac(mc0.H(str));
    }

    public static final bc0 d(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        er0 er0VarA = fr0.a(f2);
        if (er0VarA == null) {
            er0VarA = new uf1(f2);
        }
        return new bc0(f3, f2, er0VarA);
    }

    public static b52 e(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new b52(f2, 0.0f, f2, 0.0f);
    }

    public static b52 f(int i2, float f2) {
        return new b52(0.0f, (i2 & 2) != 0 ? 0.0f : 112.0f, 0.0f, f2);
    }

    public static final float g(z42 z42Var, qa1 qa1Var) {
        return qa1Var == qa1.e ? z42Var.b(qa1Var) : z42Var.a(qa1Var);
    }

    public static final boolean h(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = uj0.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    js2 js2Var = (js2) obj2;
                    js2 js2Var2 = (js2) obj;
                    arrayList2.add(new c12((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (js2Var2.g().c() >> 32)) - Float.intBitsToFloat((int) (js2Var.g().c() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (js2Var2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (js2Var.g().c() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((c12) zy.n0(list)).a;
            } else {
                if (list.isEmpty()) {
                    xg1.c("Empty collection can't be reduced.");
                }
                Object objN0 = zy.n0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objN0 = new c12(c12.e(((c12) objN0).a, ((c12) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((c12) objN0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final float i(z42 z42Var, qa1 qa1Var) {
        return qa1Var == qa1.e ? z42Var.a(qa1Var) : z42Var.b(qa1Var);
    }

    public static final void j(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static int k(Context context, String str) {
        if (str == null) {
            b81.k("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new j02(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static dv1 l(dv1 dv1Var, ix1 ix1Var, uh2 uh2Var, boolean z2, vh2 vh2Var, au0 au0Var, int i2) {
        dv1 dv1VarD;
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            vh2Var = null;
        }
        vh2 vh2Var2 = vh2Var;
        if (uh2Var != null) {
            dv1VarD = new ux(ix1Var, uh2Var, false, z3, null, vh2Var2, au0Var);
        } else if (uh2Var == null) {
            dv1VarD = new ux(ix1Var, null, false, z3, null, vh2Var2, au0Var);
        } else {
            av1 av1Var = av1.a;
            dv1VarD = ix1Var != null ? m11.a(av1Var, ix1Var, uh2Var).d(new ux(ix1Var, null, false, z3, null, vh2Var2, au0Var)) : xp1.p(av1Var, new vx(uh2Var, z3, vh2Var2, au0Var));
        }
        return dv1Var.d(dv1VarD);
    }

    public static dv1 m(dv1 dv1Var, boolean z2, String str, au0 au0Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return dv1Var.d(new ux(null, null, true, z3, str, null, au0Var));
    }

    public static dv1 n(dv1 dv1Var, ix1 ix1Var, au0 au0Var) {
        return dv1Var.d(new b00(au0Var, ix1Var));
    }

    public static final boolean o(pe2 pe2Var, float f2, float f3) {
        float f4 = pe2Var.a;
        if (f2 > pe2Var.c || f4 > f2) {
            return false;
        }
        return f3 <= pe2Var.d && pe2Var.b <= f3;
    }

    public static byte[] p(nc0[] nc0VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (nc0 nc0Var : nc0VarArr) {
            length += ((((nc0Var.g * 2) + 7) & (-8)) / 8) + (nc0Var.e * 2) + q(nc0Var.a, nc0Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + nc0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, sb.f0)) {
            int length2 = nc0VarArr.length;
            while (i2 < length2) {
                nc0 nc0Var2 = nc0VarArr[i2];
                Y(byteArrayOutputStream, nc0Var2, q(nc0Var2.a, nc0Var2.b, bArr));
                X(byteArrayOutputStream, nc0Var2);
                i2++;
            }
        } else {
            for (nc0 nc0Var3 : nc0VarArr) {
                Y(byteArrayOutputStream, nc0Var3, q(nc0Var3.a, nc0Var3.b, bArr));
            }
            int length3 = nc0VarArr.length;
            while (i2 < length3) {
                X(byteArrayOutputStream, nc0VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String q(String str, String str2, byte[] bArr) {
        byte[] bArr2 = sb.g0;
        byte[] bArr3 = sb.h0;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return az2.p(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static ColorStateList r(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        lg2 lg2Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        mg2 mg2Var = new mg2(resources, theme);
        synchronized (ng2.c) {
            try {
                SparseArray sparseArray = (SparseArray) ng2.b.get(mg2Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (lg2Var = (lg2) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (lg2Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || lg2Var.c != 0) {
                            if (theme == null || lg2Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = lg2Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = ng2.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = rz.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (ng2.c) {
            try {
                WeakHashMap weakHashMap = ng2.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mg2Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mg2Var, sparseArray2);
                }
                sparseArray2.append(i2, new lg2(colorStateListA, mg2Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final String[] s(i60 i60Var) {
        i60Var.getClass();
        return (String[]) ((ac) i60Var).b.toArray(new String[0]);
    }

    public static final x01 t() {
        x01 x01Var = L;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(14.59f, 2.59f);
        nx0VarI.g(-0.38f, -0.38f, -0.89f, -0.59f, -1.42f, -0.59f);
        nx0VarI.k(6.0f, 2.0f);
        nx0VarI.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0VarI.s(16.0f);
        nx0VarI.g(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        nx0VarI.k(18.0f, 22.0f);
        nx0VarI.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0VarI.k(20.0f, 8.83f);
        nx0VarI.g(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        nx0VarI.l(-4.82f, -4.83f);
        nx0VarI.e();
        nx0VarI.m(15.0f, 18.0f);
        nx0VarI.k(9.0f, 18.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.o(0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.i(6.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0VarI.o(-0.45f, 1.0f, -1.0f, 1.0f);
        nx0VarI.e();
        nx0VarI.m(15.0f, 14.0f);
        nx0VarI.k(9.0f, 14.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.o(0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.i(6.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0VarI.o(-0.45f, 1.0f, -1.0f, 1.0f);
        nx0VarI.e();
        nx0VarI.m(13.0f, 8.0f);
        nx0VarI.k(13.0f, 3.5f);
        nx0VarI.k(18.5f, 9.0f);
        nx0VarI.k(14.0f, 9.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        L = x01VarB;
        return x01VarB;
    }

    public static final gn u(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof w91) {
            return ((w91) componentCallbacks).a();
        }
        gn gnVar = j9.O;
        if (gnVar != null) {
            return gnVar;
        }
        fo.n("KoinApplication has not been started");
        return null;
    }

    public static final y81 v(y81 y81Var) {
        y81Var.getClass();
        return y81Var.getDescriptor().g() ? y81Var : new n02(y81Var);
    }

    public static final String w(ox oxVar, fd2 fd2Var) {
        fd2Var.getClass();
        return m81.a(oxVar) + "::" + fd2Var;
    }

    public static final boolean x(KeyEvent keyEvent) {
        long jI = mh0.I(keyEvent);
        int i2 = c91.O;
        return c91.a(jI, c91.h) || c91.a(jI, c91.r) || c91.a(jI, c91.E) || c91.a(jI, c91.q);
    }

    public static final d0 y(Object[] objArr) {
        objArr.getClass();
        return new d0(objArr);
    }

    public static final dv1 z(dv1 dv1Var, ie1 ie1Var, me1 me1Var, x73 x73Var) {
        return dv1Var.d(new fe1(ie1Var, me1Var, x73Var));
    }
}
