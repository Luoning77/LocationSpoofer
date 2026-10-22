package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fc implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ fc(h82 h82Var, ka3 ka3Var, float f) {
        this.e = 2;
        this.g = h82Var;
        this.h = ka3Var;
        this.f = f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        float fFloatValue = 0.0f;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.h;
        float f = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                td tdVar = (td) obj3;
                rr rrVar = (rr) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.c();
                gn gnVar = jb1Var.e.f;
                long jR = gnVar.r();
                gnVar.i().l();
                try {
                    t1 t1Var = (t1) gnVar.a;
                    t1Var.D(f, 0.0f);
                    t1Var.A(45.0f, 0L);
                    jg0.g0(jb1Var, tdVar, rrVar);
                    return mf3Var;
                } finally {
                    p91.v(gnVar, jR);
                }
            case 1:
                te2 te2Var = (te2) obj3;
                sd1 sd1Var = (sd1) obj2;
                ri riVar = (ri) obj;
                if (f > 0.0f) {
                    fFloatValue = ((Number) riVar.e.getValue()).floatValue();
                    if (fFloatValue > f) {
                        fFloatValue = f;
                    }
                } else if (f < 0.0f) {
                    fFloatValue = ((Number) riVar.e.getValue()).floatValue();
                    if (fFloatValue < f) {
                        fFloatValue = f;
                    }
                }
                float f2 = fFloatValue - te2Var.e;
                if (f2 != ((ao2) sd1Var.b).a(f2) || fFloatValue != ((Number) riVar.e.getValue()).floatValue()) {
                    riVar.a();
                }
                te2Var.e += f2;
                return mf3Var;
            case 2:
                h82 h82Var = (h82) obj3;
                g82 g82Var = (g82) obj;
                oh ohVar = ((ka3) obj2).w;
                g82.B(g82Var, h82Var, ohVar != null ? (int) ((Number) ohVar.d()).floatValue() : (int) f, 0);
                return mf3Var;
            default:
                dg3 dg3Var = (dg3) obj3;
                lu0 lu0Var = (lu0) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = dg3Var.b;
                if (j == Long.MIN_VALUE) {
                    dg3Var.b = jLongValue;
                    j = jLongValue;
                }
                float f3 = dg3Var.e;
                ui uiVar = new ui(f3);
                ui uiVar2 = dg3.f;
                long jB = f == 0.0f ? dg3Var.a.b(new ui(f3), uiVar2, dg3Var.c) : xq1.Q((jLongValue - j) / f);
                float f4 = ((ui) dg3Var.a.p(jB, uiVar, uiVar2, dg3Var.c)).a;
                dg3Var.c = (ui) dg3Var.a.m(jB, uiVar, uiVar2, dg3Var.c);
                dg3Var.b = jLongValue;
                float f5 = dg3Var.e - f4;
                dg3Var.e = f4;
                lu0Var.invoke(Float.valueOf(f5));
                return mf3Var;
        }
    }

    public /* synthetic */ fc(float f, Object obj, Object obj2, int i) {
        this.e = i;
        this.f = f;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ fc(dg3 dg3Var, float f, lu0 lu0Var) {
        this.e = 3;
        this.g = dg3Var;
        this.f = f;
        this.h = lu0Var;
    }
}
