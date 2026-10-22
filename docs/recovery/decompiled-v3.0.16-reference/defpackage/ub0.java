package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ub0 implements Iterator, p81 {
    public int e = -1;
    public int f;
    public int g;
    public k41 h;
    public int i;
    public final /* synthetic */ vb0 j;

    public ub0(vb0 vb0Var) {
        this.j = vb0Var;
        int iV = mh0.v(0, 0, vb0Var.a.length());
        this.f = iV;
        this.g = iV;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public final void a() {
        i52 i52Var;
        vb0 vb0Var = this.j;
        CharSequence charSequence = vb0Var.a;
        int i = this.g;
        if (i < 0) {
            this.e = 0;
            this.h = null;
            return;
        }
        int i2 = vb0Var.b;
        if (i2 > 0) {
            int i3 = this.i + 1;
            this.i = i3;
            if (i3 >= i2) {
                this.h = new k41(this.f, charSequence.length() - 1, 1);
                this.g = -1;
            } else if (i > charSequence.length() && (i52Var = (i52) vb0Var.c.invoke(charSequence, Integer.valueOf(this.g))) != null) {
                int iIntValue = ((Number) i52Var.e).intValue();
                int iIntValue2 = ((Number) i52Var.f).intValue();
                this.h = mh0.f0(this.f, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f = i4;
                this.g = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.h = new k41(this.f, charSequence.length() - 1, 1);
                this.g = -1;
            }
        } else if (i > charSequence.length()) {
            this.h = new k41(this.f, charSequence.length() - 1, 1);
            this.g = -1;
        } else {
            int iIntValue3 = ((Number) i52Var.e).intValue();
            int iIntValue4 = ((Number) i52Var.f).intValue();
            this.h = mh0.f0(this.f, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f = i5;
            this.g = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == -1) {
            a();
        }
        return this.e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e == -1) {
            a();
        }
        if (this.e == 0) {
            b81.p();
            return null;
        }
        k41 k41Var = this.h;
        k41Var.getClass();
        this.h = null;
        this.e = -1;
        return k41Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
