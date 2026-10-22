package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cl {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static cl c;
    public kg2 a;

    public static synchronized cl a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            cl clVar = new cl();
            c = clVar;
            clVar.a = kg2.c();
            kg2 kg2Var = c.a;
            bl blVar = new bl();
            synchronized (kg2Var) {
                kg2Var.e = blVar;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
