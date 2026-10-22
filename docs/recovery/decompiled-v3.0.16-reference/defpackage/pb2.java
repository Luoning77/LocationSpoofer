package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class pb2 {
    public static final ob2 a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        ob2 ob2Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                ob2Var = new ob2();
            } else {
                ob2Var = null;
            }
        } else {
            ob2Var = null;
        }
        a = ob2Var;
    }
}
