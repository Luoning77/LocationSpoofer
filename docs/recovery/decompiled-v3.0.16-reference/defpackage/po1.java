package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class po1 extends ro1 implements Iterator, p81 {
    public final /* synthetic */ int i;

    public po1(so1 so1Var, int i) {
        this.i = i;
        this.h = so1Var;
        this.f = -1;
        this.g = so1Var.l;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                b();
                int i = this.e;
                so1 so1Var = (so1) this.h;
                if (i >= so1Var.j) {
                    b81.p();
                    return null;
                }
                this.e = i + 1;
                this.f = i;
                qo1 qo1Var = new qo1(so1Var, i);
                e();
                return qo1Var;
            case 1:
                b();
                int i2 = this.e;
                so1 so1Var2 = (so1) this.h;
                if (i2 >= so1Var2.j) {
                    b81.p();
                    return null;
                }
                this.e = i2 + 1;
                this.f = i2;
                Object obj = so1Var2.e[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.e;
                so1 so1Var3 = (so1) this.h;
                if (i3 >= so1Var3.j) {
                    b81.p();
                    return null;
                }
                this.e = i3 + 1;
                this.f = i3;
                Object[] objArr = so1Var3.f;
                objArr.getClass();
                Object obj2 = objArr[this.f];
                e();
                return obj2;
        }
    }
}
