package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y23 extends z23 {
    public int[] h;
    public long[] i;
    public double[] j;
    public String[] k;
    public byte[][] l;
    public Cursor m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y23(s23 s23Var, String str) {
        super(s23Var, str);
        s23Var.getClass();
        str.getClass();
        this.h = new int[0];
        this.i = new long[0];
        this.j = new double[0];
        this.k = new String[0];
        this.l = new byte[0][];
    }

    public static void P(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            mh0.d0(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final void D(int i, String str) {
        str.getClass();
        A();
        F(3, i);
        this.h[i] = 3;
        this.k[i] = str;
    }

    public final void F(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.h;
        if (iArr.length < i3) {
            this.h = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.i;
            if (jArr.length < i3) {
                this.i = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.j;
            if (dArr.length < i3) {
                this.j = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.k;
            if (strArr.length < i3) {
                this.k = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.l;
        if (bArr.length < i3) {
            this.l = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    public final void O() {
        if (this.m == null) {
            this.m = this.e.k(new us1(this, 16));
        }
    }

    @Override // defpackage.bl2
    public final boolean R() {
        A();
        O();
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        fo.n("Required value was null.");
        return false;
    }

    public final Cursor U() {
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor;
        }
        mh0.d0(21, "no row");
        throw null;
    }

    @Override // defpackage.bl2
    public final void a(double d, int i) {
        A();
        F(2, i);
        this.h[i] = 2;
        this.j[i] = d;
    }

    @Override // defpackage.bl2
    public final void b(int i) {
        A();
        F(5, i);
        this.h[i] = 5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.g) {
            f();
            reset();
        }
        this.g = true;
    }

    @Override // defpackage.bl2
    public final void e(int i, long j) {
        A();
        F(1, i);
        this.h[i] = 1;
        this.i[i] = j;
    }

    @Override // defpackage.z23, defpackage.bl2
    public final void f() {
        A();
        this.h = new int[0];
        this.i = new long[0];
        this.j = new double[0];
        this.k = new String[0];
        this.l = new byte[0][];
    }

    @Override // defpackage.bl2
    public final int getColumnCount() {
        A();
        O();
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.bl2
    public final String getColumnName(int i) {
        A();
        O();
        Cursor cursor = this.m;
        if (cursor == null) {
            fo.n("Required value was null.");
            return null;
        }
        P(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.bl2
    public final double getDouble(int i) {
        A();
        Cursor cursorU = U();
        P(cursorU, i);
        return cursorU.getDouble(i);
    }

    @Override // defpackage.bl2
    public final long getLong(int i) {
        A();
        Cursor cursorU = U();
        P(cursorU, i);
        return cursorU.getLong(i);
    }

    @Override // defpackage.bl2
    public final boolean isNull(int i) {
        A();
        Cursor cursorU = U();
        P(cursorU, i);
        return cursorU.isNull(i);
    }

    @Override // defpackage.bl2
    public final String m(int i) {
        A();
        Cursor cursorU = U();
        P(cursorU, i);
        String string = cursorU.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.z23, defpackage.bl2
    public final void reset() {
        A();
        Cursor cursor = this.m;
        if (cursor != null) {
            cursor.close();
        }
        this.m = null;
    }
}
