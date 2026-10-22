package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class cg2 {
    public static final bg2 Companion = new bg2();

    public static final cg2 create(byte[] bArr) {
        bg2 bg2Var = Companion;
        bg2Var.getClass();
        bArr.getClass();
        return bg2.c(bg2Var, bArr, null, 0, 7);
    }

    public abstract long contentLength();

    public abstract kr1 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(cu cuVar);

    @cc0
    public static final cg2 create(kr1 kr1Var, File file) {
        Companion.getClass();
        file.getClass();
        return new zf2(kr1Var, file, 0);
    }

    @cc0
    public static final cg2 create(kr1 kr1Var, String str) {
        Companion.getClass();
        str.getClass();
        return bg2.b(str, kr1Var);
    }

    @cc0
    public static final cg2 create(kr1 kr1Var, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return bg2.a(kr1Var, bArr, 0, bArr.length);
    }

    @cc0
    public static final cg2 create(kr1 kr1Var, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return bg2.a(kr1Var, bArr, i, bArr.length);
    }

    public static final cg2 create(String str, kr1 kr1Var) {
        Companion.getClass();
        return bg2.b(str, kr1Var);
    }

    @cc0
    public static final cg2 create(kr1 kr1Var, uu uuVar) {
        Companion.getClass();
        uuVar.getClass();
        return new zf2(kr1Var, uuVar, 1);
    }

    public static final cg2 create(byte[] bArr, kr1 kr1Var) {
        bg2 bg2Var = Companion;
        bg2Var.getClass();
        bArr.getClass();
        return bg2.c(bg2Var, bArr, kr1Var, 0, 6);
    }

    public static final cg2 create(byte[] bArr, kr1 kr1Var, int i) {
        bg2 bg2Var = Companion;
        bg2Var.getClass();
        bArr.getClass();
        return bg2.c(bg2Var, bArr, kr1Var, i, 4);
    }

    public static final cg2 create(byte[] bArr, kr1 kr1Var, int i, int i2) {
        Companion.getClass();
        return bg2.a(kr1Var, bArr, i, i2);
    }

    public static final cg2 create(uu uuVar, kr1 kr1Var) {
        Companion.getClass();
        uuVar.getClass();
        return new zf2(kr1Var, uuVar, 1);
    }

    public static final cg2 create(File file, kr1 kr1Var) {
        Companion.getClass();
        file.getClass();
        return new zf2(kr1Var, file, 0);
    }

    @cc0
    public static final cg2 create(kr1 kr1Var, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return bg2.a(kr1Var, bArr, i, i2);
    }
}
