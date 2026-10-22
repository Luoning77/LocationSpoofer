package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ni3 extends ro1 {
    public final /* synthetic */ int i;

    public ni3(int i, Class cls, int i2, int i3, int i4) {
        this.i = i4;
        this.e = i;
        this.h = cls;
        this.g = i2;
        this.f = i3;
    }

    @Override // defpackage.ro1
    public final Object c(View view) {
        switch (this.i) {
            case 0:
                return Boolean.valueOf(ti3.c(view));
            case 1:
                return ti3.a(view);
            default:
                return Boolean.valueOf(ti3.b(view));
        }
    }

    @Override // defpackage.ro1
    public final void d(View view, Object obj) {
        switch (this.i) {
            case 0:
                ti3.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                ti3.e(view, (CharSequence) obj);
                break;
            default:
                ti3.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.ro1
    public final boolean g(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
