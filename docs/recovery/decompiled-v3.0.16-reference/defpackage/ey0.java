package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ey0 {
    public int a;
    public float b;
    public final Object c;

    public ey0(t83 t83Var) {
        this.c = t83Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        t83 t83Var = (t83) this.c;
        int i2 = 1;
        if (z) {
            int iT = mc0.t(t83Var.f, i, z);
            int lineStart = t83Var.f.getLineStart(iT);
            int iF = t83Var.f(iT);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fI = z3 ? t83Var.i(i, z) : t83Var.j(i, z);
        if (z2) {
            this.a = i4;
            this.b = fI;
        }
        return fI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, r60 r60Var) {
        lf2 lf2Var;
        if (r60Var instanceof lf2) {
            lf2Var = (lf2) r60Var;
            int i = lf2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lf2Var.g = i - Integer.MIN_VALUE;
            } else {
                lf2Var = new lf2(this, r60Var);
            }
        } else {
            lf2Var = new lf2(this, r60Var);
        }
        Object objInvoke = lf2Var.e;
        int i2 = lf2Var.g;
        if (i2 == 0) {
            ee0.J(objInvoke);
            p20 p20Var = (p20) this.c;
            Float f2 = new Float(f);
            lf2Var.g = 1;
            objInvoke = p20Var.invoke(f2, lf2Var);
            z70 z70Var = z70.e;
            if (objInvoke == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return mf3.a;
    }

    public ey0(int i, p20 p20Var) {
        this.a = i;
        this.c = p20Var;
    }
}
