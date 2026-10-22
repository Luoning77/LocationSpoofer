package kotlinx.coroutines;

import defpackage.b81;
import defpackage.hd0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.vk0;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    public final <R, T> void invoke(pu0 pu0Var, R r, q60 q60Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            CancellableKt.startCoroutineCancellable(pu0Var, r, q60Var);
            return;
        }
        if (i == 2) {
            pu0Var.getClass();
            q60Var.getClass();
            hd0.G(hd0.r(pu0Var, r, q60Var)).resumeWith(mf3.a);
        } else if (i == 3) {
            UndispatchedKt.startCoroutineUndispatched(pu0Var, r, q60Var);
        } else {
            if (i == 4) {
                return;
            }
            b81.d();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
