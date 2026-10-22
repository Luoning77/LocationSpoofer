package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class cv1 implements kb0 {
    public CoroutineScope f;
    public int g;
    public cv1 i;
    public cv1 j;
    public a12 k;
    public xz1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ta q;
    public boolean r;
    public cv1 e = this;
    public int h = -1;

    public final CoroutineScope a1() {
        CoroutineScope coroutineScope = this.f;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(((db) xp1.P(this)).getCoroutineContext().plus(JobKt.Job((Job) ((db) xp1.P(this)).getCoroutineContext().get(Job.Key))));
        this.f = CoroutineScope;
        return CoroutineScope;
    }

    public boolean b1() {
        return !(this instanceof hq);
    }

    public void c1() {
        if (this.r) {
            p21.c("node attached multiple times");
        }
        if (this.l == null) {
            p21.c("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void d1() {
        if (!this.r) {
            p21.c("Cannot detach a node that is not attached");
        }
        if (this.o) {
            p21.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            p21.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        CoroutineScope coroutineScope = this.f;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel(coroutineScope, new gv1("The Modifier.Node was detached", 2));
            this.f = null;
        }
    }

    public void h1() {
        if (!this.r) {
            p21.c("reset() called on an unattached node");
        }
        g1();
    }

    public void i1() {
        if (!this.r) {
            p21.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            p21.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        e1();
        this.p = true;
    }

    public void j1() {
        if (!this.r) {
            p21.c("node detached multiple times");
        }
        if (this.l == null) {
            p21.c("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            p21.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        ta taVar = this.q;
        if (taVar != null) {
            taVar.invoke();
        }
        f1();
    }

    public void k1(cv1 cv1Var) {
        this.e = cv1Var;
    }

    public void l1(xz1 xz1Var) {
        this.l = xz1Var;
    }

    public void e1() {
    }

    public void f1() {
    }

    public void g1() {
    }
}
