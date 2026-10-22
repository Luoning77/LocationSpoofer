package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.df1;
import defpackage.gn;
import defpackage.k21;
import defpackage.vq0;
import defpackage.wi0;
import defpackage.xe1;
import defpackage.xi0;
import defpackage.zi0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class EmojiCompatInitializer implements k21 {
    @Override // defpackage.k21
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.k21
    public final Object b(Context context) {
        Object objG;
        vq0 vq0Var = new vq0(new zi0(context, 0));
        vq0Var.b = 1;
        if (wi0.k == null) {
            synchronized (wi0.j) {
                try {
                    if (wi0.k == null) {
                        wi0.k = new wi0(vq0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        gn gnVarP = gn.p(context);
        gnVarP.getClass();
        synchronized (gn.e) {
            try {
                objG = ((HashMap) gnVarP.a).get(ProcessLifecycleInitializer.class);
                if (objG == null) {
                    objG = gnVarP.g(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xe1 lifecycle = ((df1) objG).getLifecycle();
        lifecycle.a(new xi0(this, lifecycle));
        return Boolean.TRUE;
    }
}
