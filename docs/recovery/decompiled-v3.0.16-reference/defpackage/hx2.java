package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hx2 implements q30, Iterable, p81 {
    public int f;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public gx1 o;
    public int[] e = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(iv0 iv0Var) {
        if (this.k) {
            j30.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!iv0Var.a()) {
            hb2.a("Anchor refers to a group that was removed");
        }
        return iv0Var.a;
    }

    public final void b() {
        this.n = new HashMap();
    }

    public final gx2 c() {
        if (this.k) {
            fo.n("Cannot read while a writer is pending");
            return null;
        }
        this.i++;
        return new gx2(this);
    }

    public final kx2 d() {
        if (this.k) {
            j30.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            j30.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new kx2(this);
    }

    public final boolean e(iv0 iv0Var) {
        int iC;
        return iv0Var.a() && (iC = jx2.c(this.m, iv0Var.a, this.f)) >= 0 && o51.f(this.m.get(iC), iv0Var);
    }

    public final qv0 f(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.n;
        if (map != null) {
            if (this.k) {
                j30.a("use active SlotWriter to crate an anchor for location instead");
            }
            iv0 iv0Var = (i < 0 || i >= (i2 = this.f) || (iC = jx2.c((arrayList = this.m), i, i2)) < 0) ? null : (iv0) arrayList.get(iC);
            if (iv0Var != null) {
                return (qv0) map.get(iv0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xw0(this, 0, this.f);
    }
}
