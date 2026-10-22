package defpackage;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class tg3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xg3 f;
    public final /* synthetic */ Exception g;

    public /* synthetic */ tg3(xg3 xg3Var, Exception exc, int i) {
        this.e = i;
        this.f = xg3Var;
        this.g = exc;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Exception exc = this.g;
        xg3 xg3Var = this.f;
        switch (i) {
            case 0:
                xg3Var.l = false;
                MutableStateFlow mutableStateFlow = xg3Var.c;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, og3.a((og3) value, false, xg3.f(exc), null, null, null, 0, 0, 0L, null, false, false, false, null, false, null, 32764)));
                break;
            case 1:
                MutableStateFlow mutableStateFlow2 = xg3Var.c;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, og3.a((og3) value2, false, xg3.f(exc), null, null, null, 0, 16, 0L, null, false, false, false, null, false, null, 32701)));
                break;
            case 2:
                MutableStateFlow mutableStateFlow3 = xg3Var.c;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, og3.a((og3) value3, false, xg3.f(exc), null, null, null, 0, 0, 0L, null, false, false, false, null, false, null, 31741)));
                break;
            case 3:
                MutableStateFlow mutableStateFlow4 = xg3Var.c;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, og3.a((og3) value4, false, null, null, null, null, 0, 0, 0L, null, false, false, false, null, false, xg3.f(exc), 8191)));
                break;
            default:
                MutableStateFlow mutableStateFlow5 = xg3Var.c;
                do {
                    value5 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value5, og3.a((og3) value5, false, xg3.f(exc), null, null, null, 0, 16, 0L, null, false, false, false, null, false, null, 32181)));
                break;
        }
        return mf3Var;
    }
}
