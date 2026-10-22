package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class fh3 {
    public static final a01 a = new a01(d12.a, 0, 0);

    public static final bc3 a(ak3 ak3Var, dj djVar) {
        bc3 bc3VarA = ak3Var.a(djVar);
        int length = djVar.f.length();
        dj djVar2 = bc3VarA.a;
        e12 e12Var = bc3VarA.b;
        int length2 = djVar2.f.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(e12Var.r(i), length2, i);
        }
        b(e12Var.r(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(e12Var.n(i2), length, i2);
        }
        c(e12Var.n(length2), length, length2);
        return new bc3(djVar2, new a01(e12Var, djVar.f.length(), djVar2.f.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = p91.s("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", i3, i, " is not in range of transformed text [0, ");
        sbS.append(i2);
        sbS.append(']');
        s21.c(sbS.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = p91.s("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", i3, i, " is not in range of original text [0, ");
        sbS.append(i2);
        sbS.append(']');
        s21.c(sbS.toString());
    }
}
