package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g30 {
    public final ov0 a;
    public kw b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final q41 d = new q41();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public g30(ov0 ov0Var, kw kwVar) {
        this.a = ov0Var;
        this.b = kwVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            u32 u32Var = this.b.F0;
            u32Var.V(q32.c);
            u32Var.h[u32Var.i - u32Var.f[u32Var.g - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        kw kwVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        kwVar.getClass();
        if (size != 0) {
            u32 u32Var2 = kwVar.F0;
            u32Var2.V(t22.c);
            wc0.h0(u32Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                u32 u32Var = this.b.F0;
                u32Var.V(i32.c);
                int i3 = u32Var.i - u32Var.f[u32Var.g - 1].a;
                int[] iArr = u32Var.h;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                u32 u32Var2 = this.b.F0;
                u32Var2.V(e32.c);
                int i6 = u32Var2.i - u32Var2.f[u32Var2.g - 1].a;
                int[] iArr2 = u32Var2.h;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        gx2 gx2Var = this.a.G;
        int i = z ? gx2Var.i : gx2Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            j30.a("Tried to seek backward");
        }
        if (i2 > 0) {
            u32 u32Var = this.b.F0;
            u32Var.V(m22.c);
            u32Var.h[u32Var.i - u32Var.f[u32Var.g - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                j30.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
