package defpackage;

import android.content.Intent;
import com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a61 {
    public final AppDatabase_Impl a;
    public final String[] b;
    public final ld3 c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final qe0 f;
    public final qe0 g;
    public Intent h;
    public pw1 i;
    public final Object j;

    public a61(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = appDatabase_Impl;
        this.b = strArr;
        ld3 ld3Var = new ld3(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.getUseTempTrackingTable$room_runtime(), new l(1, this, a61.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 1));
        this.c = ld3Var;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new qe0(this, 14);
        this.g = new qe0(this, 15);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.j = new Object();
        ld3Var.k = new hd(this, 20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flow a(String[] strArr) {
        ld3 ld3Var = this.c;
        i52 i52VarG = ld3Var.g(strArr);
        String[] strArr2 = (String[]) i52VarG.e;
        int[] iArr = (int[]) i52VarG.f;
        strArr2.getClass();
        iArr.getClass();
        Flow flow = FlowKt.flow(new t3((Object) ld3Var, (Object) iArr, (Object) strArr2, (q60) (0 == true ? 1 : 0), 18));
        pw1 pw1Var = this.i;
        mw1 mw1Var = pw1Var != null ? new mw1(pw1Var.h, strArr2) : null;
        return mw1Var != null ? FlowKt.merge(flow, mw1Var) : flow;
    }

    public final Object b(k33 k33Var) {
        Object objF = this.c.f(k33Var);
        return objF == z70.e ? objF : mf3.a;
    }
}
