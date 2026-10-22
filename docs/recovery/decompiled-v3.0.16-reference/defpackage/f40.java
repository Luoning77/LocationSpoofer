package defpackage;

import com.vincenthzr.locationspoofer.utils.ConfigManager;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f40 extends r60 {
    public Mutex e;
    public ConfigManager f;
    public CoroutineScope g;
    public /* synthetic */ Object h;
    public final /* synthetic */ c6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(c6 c6Var, q60 q60Var) {
        super(q60Var);
        this.i = c6Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
