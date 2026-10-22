package defpackage;

import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ej1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ej1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.i;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                lu0 lu0Var = (lu0) obj;
                ul1 ul1Var = (ul1) obj3;
                sn snVar = (sn) obj2;
                rm1.j(ul1Var, String.valueOf(snVar.c));
                rm1.k(ul1Var, String.valueOf(snVar.d));
                lr2 lr2Var = (lr2) obj4;
                if (lr2Var != null) {
                    lr2Var.d(snVar.c, snVar.d, Float.valueOf(17.5f));
                }
                lu0Var.invoke(gz2.a);
                lu0Var.invoke(new lz2(false));
                break;
            default:
                ((ey1) obj4).setValue(Integer.valueOf(((GithubRelease) obj3).getVersionCode()));
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new xd1((yd1) obj, (q60) null, 2), 3, null);
                break;
        }
        return mf3Var;
    }
}
