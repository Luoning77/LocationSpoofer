package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x23 extends z23 {
    public final /* synthetic */ int h = 1;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(s23 s23Var, String str) {
        super(s23Var, str);
        s23Var.getClass();
        str.getClass();
        this.i = s23Var.t(str);
    }

    @Override // defpackage.bl2
    public final void D(int i, String str) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                str.getClass();
                ((y23) obj).D(i, str);
                return;
            case 1:
                str.getClass();
                A();
                ((a33) obj).r(i, str);
                return;
            default:
                str.getClass();
                A();
                mh0.d0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public boolean I() {
        switch (this.h) {
            case 0:
                return ((y23) this.i).I();
            default:
                return super.I();
        }
    }

    @Override // defpackage.bl2
    public final boolean R() {
        int i = this.h;
        s23 s23Var = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                y23 y23Var = (y23) obj;
                boolean zR = y23Var.R();
                if (y23Var.m(0).equalsIgnoreCase("wal")) {
                    s23Var.H();
                } else {
                    s23Var.p();
                }
                return zR;
            case 1:
                A();
                ((a33) obj).execute();
                return false;
            default:
                int iOrdinal = ((w23) obj).ordinal();
                if (iOrdinal == 0) {
                    s23Var.J();
                    s23Var.g();
                } else if (iOrdinal == 1) {
                    s23Var.g();
                } else if (iOrdinal == 2) {
                    s23Var.h();
                } else if (iOrdinal == 3) {
                    s23Var.N();
                } else if (iOrdinal == 4) {
                    s23Var.w();
                } else {
                    b81.d();
                }
                return false;
        }
    }

    @Override // defpackage.bl2
    public final void a(double d, int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((y23) obj).a(d, i);
                return;
            case 1:
                A();
                ((a33) obj).a(d, i);
                return;
            default:
                A();
                mh0.d0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public final void b(int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((y23) obj).b(i);
                return;
            case 1:
                A();
                ((a33) obj).b(i);
                return;
            default:
                A();
                mh0.d0(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((y23) obj).close();
                break;
            case 1:
                ((a33) obj).close();
                this.g = true;
                break;
            default:
                this.g = true;
                break;
        }
    }

    @Override // defpackage.bl2
    public final void e(int i, long j) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((y23) obj).e(i, j);
                return;
            case 1:
                A();
                ((a33) obj).e(i, j);
                return;
            default:
                A();
                mh0.d0(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.z23, defpackage.bl2
    public void f() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((y23) obj).f();
                break;
            case 1:
                A();
                ((a33) obj).f();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // defpackage.bl2
    public final int getColumnCount() {
        switch (this.h) {
            case 0:
                return ((y23) this.i).getColumnCount();
            case 1:
                A();
                return 0;
            default:
                A();
                return 0;
        }
    }

    @Override // defpackage.bl2
    public final String getColumnName(int i) {
        switch (this.h) {
            case 0:
                return ((y23) this.i).getColumnName(i);
            case 1:
                A();
                mh0.d0(21, "no row");
                throw null;
            default:
                A();
                mh0.d0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public final double getDouble(int i) {
        switch (this.h) {
            case 0:
                return ((y23) this.i).getDouble(i);
            case 1:
                A();
                mh0.d0(21, "no row");
                throw null;
            default:
                A();
                mh0.d0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public final long getLong(int i) {
        switch (this.h) {
            case 0:
                return ((y23) this.i).getLong(i);
            case 1:
                A();
                mh0.d0(21, "no row");
                throw null;
            default:
                A();
                mh0.d0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public final boolean isNull(int i) {
        switch (this.h) {
            case 0:
                return ((y23) this.i).isNull(i);
            case 1:
                A();
                mh0.d0(21, "no row");
                throw null;
            default:
                A();
                mh0.d0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.bl2
    public final String m(int i) {
        switch (this.h) {
            case 0:
                return ((y23) this.i).m(i);
            case 1:
                A();
                mh0.d0(21, "no row");
                throw null;
            default:
                A();
                mh0.d0(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.z23, defpackage.bl2
    public void reset() {
        switch (this.h) {
            case 0:
                ((y23) this.i).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(s23 s23Var, String str, w23 w23Var) {
        super(s23Var, str);
        s23Var.getClass();
        str.getClass();
        this.i = w23Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(s23 s23Var, String str, y23 y23Var) {
        super(s23Var, str);
        s23Var.getClass();
        str.getClass();
        this.i = y23Var;
    }
}
