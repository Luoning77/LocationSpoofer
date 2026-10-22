package defpackage;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a92 extends r60 {
    public CharSequence e;
    public Object f;
    public Mutex g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d92 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a92(d92 d92Var, r60 r60Var) {
        super(r60Var);
        this.j = d92Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, 0L, null, this);
    }
}
