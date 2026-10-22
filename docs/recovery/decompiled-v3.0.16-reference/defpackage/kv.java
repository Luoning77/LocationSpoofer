package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kv implements hp1, gp1 {
    public final u8 a;
    public boolean b;
    public int c;
    public final CopyOnWriteArrayList d;
    public final CopyOnWriteArrayList e;
    public final CopyOnWriteArrayList f;
    public final CopyOnWriteArrayList g;

    public kv() {
        u8 u8Var = new u8(1);
        u8Var.b = new WeakReference(this);
        this.a = u8Var;
        this.b = true;
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
    }

    @Override // defpackage.hp1
    public final void a() {
        this.a.a(1);
    }

    @Override // defpackage.gp1
    public final void b() {
        this.a.a(3);
    }

    public final void c(int i) {
        this.c = i;
        this.a.a(0);
    }
}
