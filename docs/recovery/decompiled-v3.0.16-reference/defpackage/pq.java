package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class pq {
    public final Context a;
    public final WindowManager b;
    public final pd c;
    public MotionEvent d;
    public MotionEvent e;
    public long f;
    public boolean g = true;
    public Object h;

    public pq(Context context, pd pdVar) {
        this.a = context;
        if (context instanceof Activity) {
            this.b = (WindowManager) context.getSystemService("window");
        } else {
            this.b = null;
        }
        this.c = pdVar;
    }

    public abstract boolean a(MotionEvent motionEvent);

    public boolean b(int i) {
        if (this.h != null && this.g) {
            pd pdVar = this.c;
            ArrayList arrayList = pdVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Set<Integer> set = (Set) obj;
                if (set.contains(Integer.valueOf(i))) {
                    for (Integer num : set) {
                        num.getClass();
                        ArrayList arrayList2 = pdVar.b;
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            i3++;
                            pq pqVar = (pq) obj2;
                            if (pqVar instanceof xc2) {
                                xc2 xc2Var = (xc2) pqVar;
                                if (!xc2Var.p.contains(num) || !xc2Var.q) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
