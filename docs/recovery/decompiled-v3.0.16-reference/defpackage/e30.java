package defpackage;

import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class e30 implements az1, ot1 {
    public boolean e;
    public final Object f;

    public e30(x8 x8Var) {
        this.f = x8Var;
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.az1
    public Object I0(long j, long j2, q60 q60Var) {
        ko2 ko2Var;
        long jD;
        if (q60Var instanceof ko2) {
            ko2Var = (ko2) q60Var;
            int i = ko2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko2Var.h = i - Integer.MIN_VALUE;
            } else {
                ko2Var = new ko2(this, (r60) q60Var);
            }
        } else {
            ko2Var = new ko2(this, (r60) q60Var);
        }
        Object objA = ko2Var.f;
        int i2 = ko2Var.h;
        if (i2 == 0) {
            ee0.J(objA);
            jD = 0;
            if (this.e) {
                wo2 wo2Var = (wo2) this.f;
                if (!wo2Var.i) {
                    ko2Var.e = j2;
                    ko2Var.h = 1;
                    objA = wo2Var.a(j2, ko2Var);
                    z70 z70Var = z70.e;
                    if (objA == z70Var) {
                        return z70Var;
                    }
                }
                jD = yh3.d(j2, jD);
            }
            return new yh3(jD);
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = ko2Var.e;
        ee0.J(objA);
        jD = ((yh3) objA).a;
        jD = yh3.d(j2, jD);
        return new yh3(jD);
    }

    public void a() {
        this.e = true;
    }

    @Override // defpackage.ot1
    public void b(ms1 ms1Var, boolean z) {
        g7 g7Var;
        gb3 gb3Var = (gb3) this.f;
        if (this.e) {
            return;
        }
        this.e = true;
        ActionMenuView actionMenuView = gb3Var.a.a.e;
        if (actionMenuView != null && (g7Var = actionMenuView.x) != null) {
            g7Var.c();
            c7 c7Var = g7Var.x;
            if (c7Var != null && c7Var.b()) {
                c7Var.i.dismiss();
            }
        }
        gb3Var.b.onPanelClosed(108, ms1Var);
        this.e = false;
    }

    public void c() {
        this.e = false;
    }

    public void d() {
        this.e = false;
    }

    public void e(byte b) {
        ((x8) this.f).k(String.valueOf(b));
    }

    public void f(char c) {
        x8 x8Var = (x8) this.f;
        x8Var.f(x8Var.b, 1);
        char[] cArr = (char[]) x8Var.c;
        int i = x8Var.b;
        x8Var.b = i + 1;
        cArr[i] = c;
    }

    public void g(int i) {
        ((x8) this.f).k(String.valueOf(i));
    }

    public void h(long j) {
        ((x8) this.f).k(String.valueOf(j));
    }

    public void i(short s) {
        ((x8) this.f).k(String.valueOf(s));
    }

    @Override // defpackage.az1
    public long i0(int i, long j, long j2) {
        if (!this.e) {
            return 0L;
        }
        wo2 wo2Var = (wo2) this.f;
        if (wo2Var.a.b()) {
            return 0L;
        }
        return wo2Var.h(wo2Var.d(wo2Var.a.e(wo2Var.d(wo2Var.g(j2)))));
    }

    public void j(String str) {
        byte b;
        str.getClass();
        x8 x8Var = (x8) this.f;
        x8Var.f(x8Var.b, str.length() + 2);
        char[] cArr = (char[]) x8Var.c;
        int i = x8Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = i13.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    x8Var.f(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = i13.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) x8Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = i13.a[cCharAt];
                        str2.getClass();
                        x8Var.f(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) x8Var.c, i4);
                        int length3 = str2.length() + i4;
                        x8Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) x8Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        x8Var.b = i4;
                    }
                }
                x8Var.f(i4, 1);
                ((char[]) x8Var.c)[i4] = '\"';
                x8Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        x8Var.b = i3 + 1;
    }

    @Override // defpackage.ot1
    public boolean o(ms1 ms1Var) {
        ((gb3) this.f).b.onMenuOpened(108, ms1Var);
        return true;
    }

    public e30(gb3 gb3Var) {
        this.f = gb3Var;
    }

    public e30(wo2 wo2Var, boolean z) {
        this.f = wo2Var;
        this.e = z;
    }

    public void k() {
    }

    public void l() {
    }
}
