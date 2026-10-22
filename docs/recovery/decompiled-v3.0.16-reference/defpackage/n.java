package defpackage;

import android.net.Uri;
import android.view.textclassifier.TextClassifier;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ long g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c63 c63Var, long j, g63 g63Var, b63 b63Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 5;
        this.h = c63Var;
        this.g = j;
        this.i = g63Var;
        this.j = b63Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new n((Job) obj3, this.g, (ix1) obj2, q60Var, 0);
            case 1:
                return new n((lo1) obj3, this.g, (String) obj2, q60Var, 1);
            case 2:
                return new n((qu0) this.h, (String) obj3, this.g, (is1) obj2, q60Var);
            case 3:
                n nVar = new n(this.g, q60Var, (d92) obj3, (CharSequence) obj2);
                nVar.h = obj;
                return nVar;
            case 4:
                n nVar2 = new n((wo2) obj3, this.g, (te2) obj2, q60Var, 4);
                nVar2.h = obj;
                return nVar2;
            case Logger.WARN /* 5 */:
                return new n((c63) this.h, this.g, (g63) obj3, (b63) obj2, q60Var);
            case Logger.ERROR /* 6 */:
                return new n((ey1) obj3, this.g, (ix1) obj2, q60Var, 6);
            default:
                return new n((xg3) this.h, (i52) obj3, (Uri) obj2, this.g, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 3:
                return ((n) create((TextClassifier) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 4:
                return ((n) create((uo2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.WARN /* 5 */:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case Logger.ERROR /* 6 */:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((n) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x029d  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02af  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b1 A[DONT_INVERT, PHI: r8
      0x02b1: PHI (r8v10 com.vincenthzr.locationspoofer.data.db.CompleteLocation) = 
      (r8v9 com.vincenthzr.locationspoofer.data.db.CompleteLocation)
      (r8v11 com.vincenthzr.locationspoofer.data.db.CompleteLocation)
     binds: [B:151:0x02a2, B:156:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02be  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v10 java.lang.Object, still in use, count: 2, list:
          (r9v10 java.lang.Object) from 0x028d: PHI (r9 I:??) = (r9v3 java.lang.Object), (r9v10 java.lang.Object) binds: [B:143:0x028c, B:193:0x028d] A[DONT_GENERATE, DONT_INLINE]
          (r9v10 java.lang.Object) from 0x027d: CHECK_CAST (com.vincenthzr.locationspoofer.data.db.CompleteLocation) (r9v10 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qu0 qu0Var, String str, long j, is1 is1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 2;
        this.h = qu0Var;
        this.i = str;
        this.g = j;
        this.j = is1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j, q60 q60Var, d92 d92Var, CharSequence charSequence) {
        super(2, q60Var);
        this.e = 3;
        this.i = d92Var;
        this.j = charSequence;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xg3 xg3Var, i52 i52Var, Uri uri, long j, q60 q60Var) {
        super(2, q60Var);
        this.e = 7;
        this.h = xg3Var;
        this.i = i52Var;
        this.j = uri;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, long j, Object obj2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.j = obj2;
    }
}
