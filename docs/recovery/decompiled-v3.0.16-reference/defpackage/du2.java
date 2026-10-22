package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class du2 implements au2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ du2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    @Override // defpackage.au2
    public final vd0 a(long j, qa1 qa1Var, xb0 xb0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qa1Var.getClass();
                xb0Var.getClass();
                eu2 eu2Var = (eu2) obj;
                au2 au2Var = (au2) ((au0) eu2Var.c).invoke();
                if (!o51.f((au2) eu2Var.d, au2Var)) {
                    eu2Var.d = au2Var;
                    eu2Var.e = null;
                }
                if (((vd0) eu2Var.e) != null && cw2.a(eu2Var.b, j) && eu2Var.a == qa1Var) {
                    Float f = (Float) eu2Var.f;
                    float fG = xb0Var.g();
                    if (f == null || f.floatValue() != fG) {
                        eu2Var.b = j;
                        eu2Var.a = qa1Var;
                        eu2Var.f = Float.valueOf(xb0Var.g());
                        eu2Var.e = au2Var.a(j, qa1Var, xb0Var);
                    }
                } else {
                    eu2Var.b = j;
                    eu2Var.a = qa1Var;
                    eu2Var.f = Float.valueOf(xb0Var.g());
                    eu2Var.e = au2Var.a(j, qa1Var, xb0Var);
                }
                vd0 vd0Var = (vd0) eu2Var.e;
                vd0Var.getClass();
                return vd0Var;
            default:
                return new z32((re) obj);
        }
    }
}
