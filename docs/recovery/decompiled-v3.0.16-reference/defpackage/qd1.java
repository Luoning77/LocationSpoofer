package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qd1 implements fr1 {
    public final rd1 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final fr1 e;
    public final float f;
    public final boolean g;
    public final CoroutineScope h;
    public final xb0 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final x32 o;
    public final int p;
    public final int q;

    public qd1(rd1 rd1Var, int i, boolean z, float f, fr1 fr1Var, float f2, boolean z2, CoroutineScope coroutineScope, xb0 xb0Var, long j, List list, int i2, int i3, int i4, x32 x32Var, int i5, int i6) {
        this.a = rd1Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = fr1Var;
        this.f = f2;
        this.g = z2;
        this.h = coroutineScope;
        this.i = xb0Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = x32Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.fr1
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.fr1
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.fr1
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.fr1
    public final lu0 d() {
        return this.e.d();
    }

    @Override // defpackage.fr1
    public final int e() {
        return this.e.e();
    }

    public final qd1 f(int i, boolean z) {
        rd1 rd1Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (rd1Var = this.a) == null) {
            return null;
        }
        int i2 = rd1Var.n;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        rd1 rd1Var2 = (rd1) zy.n0(list);
        rd1 rd1Var3 = (rd1) zy.t0(list);
        if (rd1Var2.p || rd1Var3.p) {
            return null;
        }
        int i4 = rd1Var2.l;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + rd1Var2.n) - i6, (rd1Var3.l + rd1Var3.n) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - rd1Var3.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            rd1 rd1Var4 = (rd1) list.get(i7);
            boolean z2 = rd1Var4.c;
            int[] iArr = rd1Var4.r;
            if (!rd1Var4.p) {
                rd1Var4.l += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = rd1Var4.b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        p91.x(rd1Var4.k.a.g(rd1Var4.i));
                    }
                }
            }
        }
        return new qd1(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        fr1 fr1Var = this.e;
        return (((long) fr1Var.e()) << 32) | (((long) fr1Var.b()) & 4294967295L);
    }
}
