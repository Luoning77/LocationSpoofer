package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class qq2 {
    public static final yp2 a = u92.m;

    public static final boolean a(p92 p92Var) {
        MotionEvent motionEventA;
        List list = p92Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((x92) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = p92Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = p92Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
