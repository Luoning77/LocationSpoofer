package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class sf implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ sf(List list, AppState appState, boolean z, ey1 ey1Var) {
        this.e = 1;
        this.g = list;
        this.h = appState;
        this.f = z;
        this.i = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        boolean z = this.f;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                td tdVar = (td) obj3;
                rr rrVar = (rr) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.c();
                xv xvVar = jb1Var.e;
                if (((Boolean) ((au0) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long jV0 = xvVar.v0();
                        gn gnVar = xvVar.f;
                        long jR = gnVar.r();
                        gnVar.i().l();
                        try {
                            ((t1) gnVar.a).B(-1.0f, 1.0f, jV0);
                            jg0.g0(jb1Var, tdVar, rrVar);
                        } finally {
                            p91.v(gnVar, jR);
                        }
                    } else {
                        jg0.g0(jb1Var, tdVar, rrVar);
                    }
                }
                return mf3Var;
            case 1:
                List list = (List) obj4;
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                v1 v1Var = new v1(15);
                kd1Var.c(list.size(), new l3(8, v1Var, list), new u3(list, 4), new p10(new en(list, (AppState) obj3, this.f, (ey1) obj2, 0), true, 802480018));
                return mf3Var;
            default:
                List list2 = (List) obj4;
                kd1 kd1Var2 = (kd1) obj;
                kd1Var2.getClass();
                kd1Var2.c(list2.size(), new l3(18, new yk1(27), list2), new u3(list2, 11), new p10(new en(list2, z, (lu0) obj3, (lu0) obj2), true, 802480018));
                return mf3Var;
        }
    }

    public /* synthetic */ sf(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = z;
        this.h = obj2;
        this.i = obj3;
    }
}
