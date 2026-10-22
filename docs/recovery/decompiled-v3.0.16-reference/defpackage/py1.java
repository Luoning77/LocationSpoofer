package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class py1 extends k33 implements pu0 {
    public Mutex e;
    public Object f;
    public sy1 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sy1 j;
    public final /* synthetic */ lu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(sy1 sy1Var, lu0 lu0Var, q60 q60Var) {
        super(2, q60Var);
        this.j = sy1Var;
        this.k = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        py1 py1Var = new py1(this.j, this.k, q60Var);
        py1Var.i = obj;
        return py1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((py1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
