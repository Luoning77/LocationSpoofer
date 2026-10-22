package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s f;

    public /* synthetic */ i(s sVar, int i) {
        this.e = i;
        this.f = sVar;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        kb0 kb0Var;
        int i = this.e;
        s sVar = this.f;
        switch (i) {
            case 0:
                q11 q11Var = (q11) xq1.C(sVar, m11.a);
                if (!(q11Var instanceof q11)) {
                    s21.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + q11Var);
                }
                q11 q11Var2 = sVar.C;
                q11 q11Var3 = q11Var;
                sVar.C = q11Var3;
                if (q11Var2 != null && !o51.f(q11Var3, q11Var2) && ((kb0Var = sVar.E) != null || !sVar.L)) {
                    if (kb0Var != null) {
                        sVar.n1(kb0Var);
                    }
                    sVar.E = null;
                    sVar.w1();
                }
                return mf3.a;
            default:
                sVar.A.invoke();
                return Boolean.TRUE;
        }
    }
}
