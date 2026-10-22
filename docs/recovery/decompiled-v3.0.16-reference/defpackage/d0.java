package defpackage;

import java.util.Iterator;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class d0 implements Iterator, p81 {
    public final /* synthetic */ int e;
    public int f;
    public final Object g;

    public d0(bt2 bt2Var) {
        this.e = 2;
        this.g = bt2Var;
        this.f = bt2Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return this.f < ((g0) obj).a();
            case 1:
                return this.f < ((Object[]) obj).length;
            case 2:
                return this.f > 0;
            case 3:
                return this.f < ((byte[]) obj).length;
            case 4:
                return this.f < ((int[]) obj).length;
            case Logger.WARN /* 5 */:
                return this.f < ((long[]) obj).length;
            default:
                return this.f < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    b81.p();
                    return null;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                return ((g0) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f--;
                    b81.y(e.getMessage());
                    return null;
                }
            case 2:
                bt2 bt2Var = (bt2) obj;
                int iD = bt2Var.d();
                int i4 = this.f;
                this.f = i4 - 1;
                return bt2Var.i(iD - i4);
            case 3:
                int i5 = this.f;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.f = i5 + 1;
                    return new oe3(bArr[i5]);
                }
                b81.y(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.f = i6 + 1;
                    return new te3(iArr[i6]);
                }
                b81.y(String.valueOf(i6));
                return null;
            case Logger.WARN /* 5 */:
                int i7 = this.f;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.f = i7 + 1;
                    return new ye3(jArr[i7]);
                }
                b81.y(String.valueOf(i7));
                return null;
            default:
                int i8 = this.f;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.f = i8 + 1;
                    return new df3(sArr[i8]);
                }
                b81.y(String.valueOf(i8));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Logger.WARN /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d0(Object[] objArr) {
        this.e = 1;
        objArr.getClass();
        this.g = objArr;
    }

    public /* synthetic */ d0(Object obj, int i) {
        this.e = i;
        this.g = obj;
    }
}
