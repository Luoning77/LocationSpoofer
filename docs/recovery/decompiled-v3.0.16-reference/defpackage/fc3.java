package defpackage;

import android.view.View;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fc3 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fc3(int i, Object obj, Object obj2) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, CoroutineStart.UNDISPATCHED, new e90((mc3) obj2, null), 1, null);
                return new df(3);
            case 1:
                mc3 mc3Var = (mc3) obj2;
                mc3 mc3Var2 = (mc3) obj3;
                mc3Var.j.add(mc3Var2);
                return new nn(5, mc3Var, mc3Var2);
            case 2:
                return new nn(6, (mc3) obj2, (hc3) obj3);
            case 3:
                mc3 mc3Var3 = (mc3) obj2;
                kc3 kc3Var = (kc3) obj3;
                mc3Var3.i.add(kc3Var);
                return new nn(7, mc3Var3, kc3Var);
            case 4:
                dg3 dg3Var = (dg3) obj3;
                ((Long) obj).getClass();
                float f = dg3Var.e;
                dg3Var.e = 0.0f;
                ((lu0) obj2).invoke(Float.valueOf(f));
                return mf3Var;
            case Logger.WARN /* 5 */:
                ul1 ul1Var = (ul1) obj3;
                String str = (String) obj;
                str.getClass();
                ul1Var.getClass();
                ul1Var.c.setIgnoredVersion(str);
                ((au0) obj2).invoke();
                return mf3Var;
            default:
                ul3 ul3Var = (ul3) obj3;
                View view = (View) obj2;
                ul3Var.a(view);
                return new nn(8, ul3Var, view);
        }
    }

    public /* synthetic */ fc3(mc3 mc3Var, Object obj, int i) {
        this.e = i;
        this.f = mc3Var;
        this.g = obj;
    }
}
