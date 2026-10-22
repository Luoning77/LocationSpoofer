package kotlinx.coroutines.selects;

import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelectBuilderImpl<R> extends SelectImplementation<R> {
    private final CancellableContinuationImpl<R> cont;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {39}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        int label;
        final /* synthetic */ SelectBuilderImpl<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectBuilderImpl<R> selectBuilderImpl, q60 q60Var) {
            super(2, q60Var);
            this.this$0 = selectBuilderImpl;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.this$0, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.CancellableContinuation, kotlinx.coroutines.CancellableContinuationImpl] */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            mf3 mf3Var = mf3.a;
            try {
                if (i == 0) {
                    ee0.J(obj);
                    SelectBuilderImpl<R> selectBuilderImpl = this.this$0;
                    this.label = 1;
                    obj = selectBuilderImpl.doSelect(this);
                    z70 z70Var = z70.e;
                    if (obj == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                this = ((SelectBuilderImpl) this.this$0).cont;
                SelectOldKt.resumeUndispatched(this, obj);
                return mf3Var;
            } catch (Throwable th) {
                SelectOldKt.resumeUndispatchedWithException(((SelectBuilderImpl) this.this$0).cont, th);
                return mf3Var;
            }
        }
    }

    public SelectBuilderImpl(q60 q60Var) {
        super(q60Var.getContext());
        this.cont = new CancellableContinuationImpl<>(hd0.G(q60Var), 1);
    }

    public final Object getResult() {
        if (this.cont.isCompleted()) {
            return this.cont.getResult();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
        return this.cont.getResult();
    }

    public final void handleBuilderException(Throwable th) {
        this.cont.resumeWith(ee0.t(th));
    }
}
