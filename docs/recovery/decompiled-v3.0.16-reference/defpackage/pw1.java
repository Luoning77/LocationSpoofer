package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pw1 {
    public final String a;
    public final a61 b;
    public final Context c;
    public final CoroutineScope d;
    public final AtomicBoolean e;
    public int f;
    public h01 g;
    public final MutableSharedFlow h;
    public final d31 i;
    public final nw1 j;
    public final ow1 k;

    public pw1(Context context, String str, a61 a61Var) {
        str.getClass();
        this.a = str;
        this.b = a61Var;
        this.c = context.getApplicationContext();
        this.d = a61Var.a.getCoroutineScope();
        this.e = new AtomicBoolean(true);
        this.h = SharedFlowKt.MutableSharedFlow(0, 0, BufferOverflow.SUSPEND);
        int i = 24;
        this.i = new d31(i, this, a61Var.b, false);
        this.j = new nw1(this);
        this.k = new ow1(this);
    }

    public final void a(Intent intent) {
        intent.getClass();
        if (this.e.compareAndSet(true, false)) {
            this.c.bindService(intent, this.k, 1);
            d31 d31Var = this.i;
            d31Var.getClass();
            a61 a61Var = this.b;
            LinkedHashMap linkedHashMap = a61Var.d;
            ld3 ld3Var = a61Var.c;
            i52 i52VarG = ld3Var.g((String[]) d31Var.f);
            String[] strArr = (String[]) i52VarG.e;
            int[] iArr = (int[]) i52VarG.f;
            b12 b12Var = new b12(d31Var, iArr, strArr);
            ReentrantLock reentrantLock = a61Var.e;
            reentrantLock.lock();
            try {
                b12 b12Var2 = linkedHashMap.containsKey(d31Var) ? (b12) jq1.L(d31Var, linkedHashMap) : (b12) linkedHashMap.put(d31Var, b12Var);
                reentrantLock.unlock();
                if (b12Var2 == null) {
                    ld3Var.h.a(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
