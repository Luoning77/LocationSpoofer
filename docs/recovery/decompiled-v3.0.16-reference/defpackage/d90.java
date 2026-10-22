package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d90 extends k33 implements lu0 {
    public final /* synthetic */ j90 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ CoroutineScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(j90 j90Var, float f, CoroutineScope coroutineScope, q60 q60Var) {
        super(1, q60Var);
        this.e = j90Var;
        this.f = f;
        this.g = coroutineScope;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new d90(this.e, this.f, this.g, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        d90 d90Var = (d90) create((q60) obj);
        mf3 mf3Var = mf3.a;
        d90Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        j90 j90Var = this.e;
        gb0 gb0Var = (gb0) j90Var.r.f;
        ai3 ai3Var = gb0Var.a;
        o90[] o90VarArr = ai3Var.d;
        q60 q60Var = null;
        yo.s0(0, o90VarArr.length, null, o90VarArr);
        ai3Var.e = 0;
        ai3 ai3Var2 = gb0Var.b;
        o90[] o90VarArr2 = ai3Var2.d;
        yo.s0(0, o90VarArr2.length, null, o90VarArr2);
        ai3Var2.e = 0;
        gb0Var.c = 0L;
        BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new l80(j90Var, q60Var, 3), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new c90(j90Var, ((Number) mh0.x(new Float(this.f), j90Var.b)).floatValue(), q60Var, 0), 3, null);
        if (((Number) j90Var.m.d()).floatValue() != 0.0f) {
            BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new kd(j90Var, q60Var, 1), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new k(j90Var, q60Var, 20), 3, null);
        return mf3.a;
    }
}
