package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class lp2 {
    public static final jp2 a = new jp2(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(jp2 jp2Var) {
        jp2Var.getClass();
        if (jp2Var.f != null || jp2Var.g != null) {
            fo.i("Failed requirement.");
            return;
        }
        if (jp2Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        jp2 jp2Var2 = a;
        jp2 jp2Var3 = (jp2) atomicReference.getAndSet(jp2Var2);
        if (jp2Var3 == jp2Var2) {
            return;
        }
        int i = jp2Var3 != null ? jp2Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(jp2Var3);
            return;
        }
        jp2Var.f = jp2Var3;
        jp2Var.b = 0;
        jp2Var.c = i + 8192;
        atomicReference.set(jp2Var);
    }

    public static final jp2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        jp2 jp2Var = a;
        jp2 jp2Var2 = (jp2) atomicReference.getAndSet(jp2Var);
        if (jp2Var2 == jp2Var) {
            return new jp2();
        }
        if (jp2Var2 == null) {
            atomicReference.set(null);
            return new jp2();
        }
        atomicReference.set(jp2Var2.f);
        jp2Var2.f = null;
        jp2Var2.c = 0;
        return jp2Var2;
    }
}
