package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ca extends aa1 implements ru0 {
    public final /* synthetic */ ea f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(ea eaVar, int i) {
        super(4);
        this.f = eaVar;
        this.g = i;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        ea eaVar = this.f;
        us1 us1Var = eaVar.e;
        ((AutofillManager) us1Var.f).notifyViewEntered(eaVar.g, this.g, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return mf3.a;
    }
}
