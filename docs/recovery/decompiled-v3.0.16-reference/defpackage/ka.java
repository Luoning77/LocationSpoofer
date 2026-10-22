package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ka implements ay {
    public final Context a;
    public ClipboardManager b;

    public ka(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }

    public final void b(dj djVar) {
        boolean z;
        ClipboardManager clipboardManagerA = a();
        List list = djVar.g;
        uj0 uj0Var = uj0.e;
        List list2 = list == null ? uj0Var : list;
        CharSequence charSequence = djVar.f;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            v90 v90Var = new v90(1);
            v90Var.b = Parcel.obtain();
            if (list == null) {
                list = uj0Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                cj cjVar = (cj) list.get(i);
                uy2 uy2Var = (uy2) cjVar.a;
                int i2 = cjVar.b;
                int i3 = cjVar.c;
                v90Var.b.recycle();
                v90Var.b = Parcel.obtain();
                i83 i83Var = uy2Var.a;
                long j = uy2Var.l;
                long j2 = uy2Var.h;
                int i4 = i;
                long j3 = uy2Var.b;
                long jA = i83Var.a();
                List list3 = list;
                int i5 = size;
                long j4 = hz.g;
                if (!ye3.a(jA, j4)) {
                    v90Var.c((byte) 1);
                    v90Var.f(uy2Var.a.a());
                }
                long j5 = w93.c;
                byte b = 2;
                if (!w93.a(j3, j5)) {
                    v90Var.c((byte) 2);
                    v90Var.e(j3);
                }
                jr0 jr0Var = uy2Var.c;
                if (jr0Var != null) {
                    v90Var.c((byte) 3);
                    v90Var.b.writeInt(jr0Var.e);
                }
                hr0 hr0Var = uy2Var.d;
                if (hr0Var != null) {
                    int i6 = hr0Var.a;
                    v90Var.c((byte) 4);
                    v90Var.c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                ir0 ir0Var = uy2Var.e;
                if (ir0Var != null) {
                    int i7 = ir0Var.a;
                    v90Var.c((byte) 5);
                    if (i7 == 0) {
                        z = true;
                    } else {
                        if (i7 == 65535) {
                            z = true;
                            b = 1;
                        } else {
                            z = true;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    b = 3;
                                }
                            }
                        }
                        v90Var.c(b);
                    }
                    b = 0;
                    v90Var.c(b);
                } else {
                    z = true;
                }
                String str = uy2Var.g;
                if (str != null) {
                    v90Var.c((byte) 6);
                    v90Var.b.writeString(str);
                }
                if (!w93.a(j2, j5)) {
                    v90Var.c((byte) 7);
                    v90Var.e(j2);
                }
                qq qqVar = uy2Var.i;
                if (qqVar != null) {
                    float f = qqVar.a;
                    v90Var.c((byte) 8);
                    v90Var.d(f);
                }
                j83 j83Var = uy2Var.j;
                if (j83Var != null) {
                    v90Var.c((byte) 9);
                    v90Var.d(j83Var.a);
                    v90Var.d(j83Var.b);
                }
                if (!ye3.a(j, j4)) {
                    v90Var.c((byte) 10);
                    v90Var.f(j);
                }
                p63 p63Var = uy2Var.m;
                if (p63Var != null) {
                    v90Var.c((byte) 11);
                    v90Var.b.writeInt(p63Var.a);
                }
                xt2 xt2Var = uy2Var.n;
                if (xt2Var != null) {
                    v90Var.c((byte) 12);
                    v90Var.f(xt2Var.a);
                    long j6 = xt2Var.b;
                    v90Var.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    v90Var.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    v90Var.d(xt2Var.c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(v90Var.b.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                size = i5;
                list = list3;
            }
            charSequence = spannableString;
        }
        clipboardManagerA.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
