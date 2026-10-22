package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e92 {
    public static final hh0 a = new hh0(1, new oi1(13));
    public static final e40 b = new e40(1);

    public static final void a(v53 v53Var, Context context, boolean z, CharSequence charSequence, f93 f93Var, z82 z82Var, lu0 lu0Var) {
        if (Build.VERSION.SDK_INT < 28 || charSequence == null || f93Var == null || z82Var == null || !(z82Var instanceof d92)) {
            lu0Var.invoke(v53Var);
            if (charSequence == null || f93Var == null) {
                return;
            }
            gh0.k(v53Var, context, z, charSequence, f93Var.a);
            return;
        }
        d92 d92Var = (d92) z82Var;
        long j = f93Var.a;
        Object obj = d92Var.h;
        Mutex mutex = d92Var.e;
        TextClassification textClassification = null;
        if (Mutex.DefaultImpls.tryLock$default(mutex, null, 1, null)) {
            u53 u53Var = (u53) d92Var.g.getValue();
            TextClassification textClassification2 = (u53Var != null && f93.b(j, u53Var.b) && o51.f(charSequence, u53Var.a)) ? u53Var.c : null;
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            lu0Var.invoke(v53Var);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                v53Var.a.a(new l63(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                v53Var.a.a(new l63(obj, textClassification, -1));
            }
            lu0Var.invoke(v53Var);
            List actions = textClassification.getActions();
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    v53Var.a.a(new l63(obj, textClassification, i));
                }
            }
        }
        gh0.k(v53Var, context, z, charSequence, f93Var.a);
    }

    public static final z82 b(vp2 vp2Var, sh1 sh1Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            ov0Var.p(false);
            return null;
        }
        Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
        y70 y70Var = (y70) ov0Var.j(a);
        boolean zF = ((((i & 112) ^ 48) > 32 && ov0Var.f(sh1Var)) || (i & 48) == 32) | ov0Var.f(y70Var) | ov0Var.f(context);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            b.getClass();
            objQ = new d92(y70Var, context, vp2Var, sh1Var);
            ov0Var.m0(objQ);
        }
        z82 z82Var = (z82) objQ;
        ov0Var.p(false);
        return z82Var;
    }
}
