package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w21 {
    public final /* synthetic */ int a;
    public final gy0 b;
    public final gy0 c;
    public final gy0 d;
    public final gy0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public w21(w21[] w21VarArr) {
        int i = 0;
        this.a = 0;
        this.f = w21VarArr;
        int length = w21VarArr.length;
        gy0[] gy0VarArr = new gy0[length];
        for (int i2 = 0; i2 < length; i2++) {
            gy0VarArr[i2] = ((w21[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new gy0(1, new ki3(gy0VarArr, i));
        int length2 = ((w21[]) this.f).length;
        gy0[] gy0VarArr2 = new gy0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            gy0VarArr2[i4] = ((w21[]) this.f)[i4].d();
        }
        this.c = new gy0(0, new fy0(gy0VarArr2, i));
        int length3 = ((w21[]) this.f).length;
        gy0[] gy0VarArr3 = new gy0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            gy0VarArr3[i5] = ((w21[]) this.f)[i5].c();
        }
        this.d = new gy0(1, new ki3(gy0VarArr3, i3));
        int length4 = ((w21[]) this.f).length;
        gy0[] gy0VarArr4 = new gy0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            gy0VarArr4[i6] = ((w21[]) this.f)[i6].a();
        }
        this.e = new gy0(0, new fy0(gy0VarArr4, i3));
    }

    public final gy0 a() {
        int i = this.a;
        return this.e;
    }

    public final gy0 b() {
        int i = this.a;
        return this.b;
    }

    public final gy0 c() {
        int i = this.a;
        return this.d;
    }

    public final gy0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return yo.A0((w21[]) obj, null, 57);
            default:
                return p91.p("RectRulers(", (String) obj, ')');
        }
    }

    public w21(String str) {
        this.a = 1;
        this.f = str;
        this.b = new gy0(1, null);
        this.c = new gy0(0, null);
        this.d = new gy0(1, null);
        this.e = new gy0(0, null);
    }
}
