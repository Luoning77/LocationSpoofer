package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ne1 {
    public final View a;
    public final d31 b;
    public lu0 d;
    public me1 e;
    public x73 f;
    public aj3 g;
    public final zb1 k;
    public Rect l;
    public final he1 m;
    public lu0 c = new zs0(21);
    public f83 h = new f83("", f93.b, 4);
    public c11 i = c11.g;
    public final ArrayList j = new ArrayList();

    public ne1(View view, xd xdVar, d31 d31Var) {
        this.a = view;
        this.b = d31Var;
        int i = 22;
        this.d = new zs0(i);
        this.k = ig0.A(ce1.g, new hd(this, i));
        this.m = new he1(xdVar, d31Var);
    }

    public final ne2 a(EditorInfo editorInfo) {
        int i;
        int i2;
        f83 f83Var = this.h;
        String str = f83Var.a.f;
        long j = f83Var.b;
        c11 c11Var = this.i;
        int i3 = c11Var.e;
        int i4 = c11Var.d;
        boolean z = c11Var.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                fo.n("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        sh1 sh1Var = c11Var.f;
        if (o51.f(sh1Var, sh1.g)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(az.Y(sh1Var, 10));
            Iterator it = sh1Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((rh1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                fo.n("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (c11Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 1) == 1) {
            int i5 = c11Var.b;
            if (i5 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (c11Var.c) {
                editorInfo.inputType = 32768 | i2;
            }
        }
        int i6 = f93.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        dh0.F(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!y13.a || i4 == 7 || i4 == 8) {
            if (Build.VERSION.SDK_INT >= 35) {
                ni0.b(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                ni0.b(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(am1.G(ud.l(), ud.y(), ud.u(), ud.w(), ud.z(), ud.A(), ud.B()));
            editorInfo.setSupportedHandwritingGesturePreviews(yo.H0(new Class[]{ud.l(), ud.y(), ud.u(), ud.w()}));
        }
        je1 je1Var = ke1.a;
        if (wi0.d()) {
            wi0.a().i(editorInfo);
        }
        ne2 ne2Var = new ne2(this.h, new t1(this, 28), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(ne2Var));
        return ne2Var;
    }
}
