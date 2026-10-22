package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import org.maplibre.android.maps.a;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bq1 implements View.OnClickListener {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final Object g;

    public bq1(jb3 jb3Var) {
        this.g = jb3Var;
        Context context = jb3Var.a.getContext();
        CharSequence charSequence = jb3Var.h;
        z6 z6Var = new z6();
        z6Var.e = 4096;
        z6Var.g = 4096;
        z6Var.l = null;
        z6Var.m = null;
        z6Var.n = false;
        z6Var.o = false;
        z6Var.p = 16;
        z6Var.i = context;
        z6Var.a = charSequence;
        this.f = z6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((jf3) obj2).getClass();
                ((a) obj).onClick(view);
                break;
            default:
                jb3 jb3Var = (jb3) obj2;
                Window.Callback callback = jb3Var.k;
                if (callback != null && jb3Var.l) {
                    callback.onMenuItemSelected(0, (z6) obj);
                    break;
                }
                break;
        }
    }

    public bq1(Context context, g gVar) {
        this.f = new a(context, gVar);
        this.g = gVar.b;
    }
}
