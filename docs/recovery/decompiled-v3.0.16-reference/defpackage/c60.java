package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c60 implements b60, d60 {
    public final /* synthetic */ int e;
    public Object f;
    public int g;
    public int h;
    public Object i;
    public Cloneable j;

    public c60(c60 c60Var) {
        this.e = 1;
        ClipData clipData = (ClipData) c60Var.f;
        clipData.getClass();
        this.f = clipData;
        int i = c60Var.g;
        if (i < 0) {
            Locale locale = Locale.US;
            fo.i("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            fo.i("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.g = i;
        int i2 = c60Var.h;
        if ((i2 & 1) == i2) {
            this.h = i2;
            this.i = (Uri) c60Var.i;
            this.j = (Bundle) c60Var.j;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.d60
    public ClipData a() {
        return (ClipData) this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[], java.lang.Cloneable] */
    public int b(long j) {
        int i = this.g + 1;
        long[] jArr = (long[]) this.f;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            yo.m0(jArr, jArr2, 0, 0, jArr.length);
            yo.o0(0, 0, 14, (int[]) this.i, iArr);
            this.f = jArr2;
            this.i = iArr;
        }
        int i3 = this.g;
        this.g = i3 + 1;
        int[] iArr2 = (int[]) this.j;
        int length2 = iArr2.length;
        Object[] objArr = iArr2;
        if (this.h >= length2) {
            int i4 = length2 * 2;
            ?? r1 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r1[i5] = i6;
                i5 = i6;
            }
            yo.o0(0, 0, 14, (int[]) this.j, r1);
            this.j = r1;
            objArr = r1;
        }
        Object[] objArr2 = objArr;
        int i7 = this.h;
        this.h = objArr[i7];
        long[] jArr3 = (long[]) this.f;
        jArr3[i3] = j;
        ((int[]) this.i)[i3] = i7;
        objArr2[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (o51.n(jArr3[i8], j) <= 0) {
                break;
            }
            c(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    @Override // defpackage.b60
    public e60 build() {
        return new e60(new c60(this));
    }

    public void c(int i, int i2) {
        long[] jArr = (long[]) this.f;
        int[] iArr = (int[]) this.i;
        int[] iArr2 = (int[]) this.j;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    @Override // defpackage.d60
    public int g() {
        return this.h;
    }

    @Override // defpackage.d60
    public ContentInfo h() {
        return null;
    }

    @Override // defpackage.b60
    public void l(Uri uri) {
        this.i = uri;
    }

    @Override // defpackage.d60
    public int m() {
        return this.g;
    }

    @Override // defpackage.b60
    public void p(int i) {
        this.h = i;
    }

    @Override // defpackage.b60
    public void setExtras(Bundle bundle) {
        this.j = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.e) {
            case 1:
                Uri uri = (Uri) this.i;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f).getDescription());
                sb.append(", source=");
                int i = this.g;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.h;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return az2.p(sb, ((Bundle) this.j) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c60(int i) {
        this.e = i;
    }
}
