package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class va3 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ss2 f;

    public /* synthetic */ va3(ss2 ss2Var, int i) {
        this.e = i;
        this.f = ss2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        int i = this.e;
        boolean z = false;
        ss2 ss2Var = this.f;
        tc tcVar = (tc) obj;
        switch (i) {
            case 0:
                AutofillValue autofillValue = tcVar.a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    qs2.e(ss2Var, g93.b(boolValueOf.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = tcVar.a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    qs2.e(ss2Var, g93.b(boolValueOf.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
