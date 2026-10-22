package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vp0 {
    public static final vp0 b = new vp0();
    public static final vp0 c = new vp0();
    public static final vp0 d = new vp0();
    public final gy1 a = new gy1(new xp0[16]);

    public static void a(vp0 vp0Var) {
        vp0Var.getClass();
        if (vp0Var == b) {
            fo.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (vp0Var == c) {
            fo.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        gy1 gy1Var = vp0Var.a;
        int i = gy1Var.g;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = gy1Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            kb0 kb0Var = (xp0) objArr[i2];
            if (!((cv1) kb0Var).e.r) {
                p21.c("visitChildren called on an unattached node");
            }
            gy1 gy1Var2 = new gy1(new cv1[16]);
            cv1 cv1Var = ((cv1) kb0Var).e;
            cv1 cv1Var2 = cv1Var.j;
            if (cv1Var2 == null) {
                xp1.h(gy1Var2, cv1Var);
            } else {
                gy1Var2.b(cv1Var2);
            }
            while (true) {
                int i3 = gy1Var2.g;
                if (i3 == 0) {
                    break;
                }
                cv1 cv1VarJ = (cv1) gy1Var2.k(i3 - 1);
                if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                    xp1.h(gy1Var2, cv1VarJ);
                } else {
                    while (cv1VarJ != null) {
                        if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            gy1 gy1Var3 = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof dq0) {
                                    if (((dq0) cv1VarJ).t1(7)) {
                                        break;
                                    }
                                } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i4 = 0;
                                    for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                        if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cv1VarJ = cv1Var3;
                                            } else {
                                                if (gy1Var3 == null) {
                                                    gy1Var3 = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var3.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var3.b(cv1Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var3);
                            }
                            break;
                        }
                        cv1VarJ = cv1VarJ.j;
                    }
                }
            }
        }
    }
}
