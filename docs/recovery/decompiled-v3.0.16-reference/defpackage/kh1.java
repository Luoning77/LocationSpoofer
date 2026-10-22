package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class kh1 {
    public static final cd2 a;

    static {
        Object wg2Var;
        try {
            ClassLoader classLoader = df1.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof cd2) {
                        wg2Var = (cd2) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof cc0)) {
                    i++;
                }
                wg2Var = null;
                break;
            }
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        cd2 hh0Var = (cd2) (wg2Var instanceof wg2 ? null : wg2Var);
        if (hh0Var == null) {
            hh0Var = new hh0(1, new qe0(22));
        }
        a = hh0Var;
    }
}
