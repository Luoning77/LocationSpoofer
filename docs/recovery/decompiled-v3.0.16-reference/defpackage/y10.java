package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class y10 implements vu0 {
    @Override // defpackage.vu0
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        dv1 dv1Var = (dv1) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        k60 k60Var = (k60) obj4;
        qu0 qu0Var = (qu0) obj5;
        au0 au0Var = (au0) obj6;
        f30 f30Var = (f30) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        if ((iIntValue & 6) == 0) {
            i = (((ov0) f30Var).f(dv1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((ov0) f30Var).f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((ov0) f30Var).g(zBooleanValue) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((ov0) f30Var).f(k60Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ((ov0) f30Var).h(qu0Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ((ov0) f30Var).h(au0Var) ? 131072 : 65536;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (599187 & i) != 599186)) {
            n60.c(str, zBooleanValue, k60Var, dv1Var, qu0Var, au0Var, ov0Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
