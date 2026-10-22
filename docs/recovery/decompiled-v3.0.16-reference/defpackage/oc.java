package defpackage;

import android.view.DragEvent;
import android.view.View;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oc implements View.OnDragListener, zd0 {
    public final be0 a;
    public final vo b;
    public final nc c;

    public oc() {
        be0 be0Var = new be0();
        be0Var.u = 0L;
        this.a = be0Var;
        this.b = new vo(0);
        this.c = new nc(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        t1 t1Var = new t1(dragEvent, 19);
        int action = dragEvent.getAction();
        sc3 sc3Var = sc3.e;
        vo voVar = this.b;
        be0 be0Var = this.a;
        switch (action) {
            case 1:
                se2 se2Var = new se2();
                ae0 ae0Var = new ae0(t1Var, be0Var, se2Var);
                if (ae0Var.invoke(be0Var) == sc3Var) {
                    q73.l(be0Var, ae0Var);
                }
                boolean z = se2Var.e;
                po poVar = new po(voVar);
                while (poVar.hasNext()) {
                    ((be0) poVar.next()).q1();
                }
                return z;
            case 2:
                be0Var.p1(t1Var);
                return false;
            case 3:
                return be0Var.m1();
            case 4:
                q9 q9Var = new q9(t1Var, 13);
                if (q9Var.invoke(be0Var) == sc3Var) {
                    q73.l(be0Var, q9Var);
                }
                voVar.clear();
                return false;
            case Logger.WARN /* 5 */:
                be0Var.n1();
                return false;
            case Logger.ERROR /* 6 */:
                be0Var.o1();
                return false;
            default:
                return false;
        }
    }
}
