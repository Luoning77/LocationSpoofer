package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import org.maplibre.android.maps.g;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qr2 {
    public final /* synthetic */ k a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ CloudRepository d;
    public final /* synthetic */ ey1 e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;

    public /* synthetic */ qr2(k kVar, k kVar2, Context context, CloudRepository cloudRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7, ey1 ey1Var8, ey1 ey1Var9, ey1 ey1Var10) {
        this.a = kVar;
        this.b = kVar2;
        this.c = context;
        this.d = cloudRepository;
        this.e = ey1Var;
        this.f = ey1Var2;
        this.g = ey1Var3;
        this.h = ey1Var4;
        this.i = ey1Var5;
        this.j = ey1Var6;
        this.k = ey1Var7;
        this.l = ey1Var8;
        this.m = ey1Var9;
        this.n = ey1Var10;
    }

    public final void a(g gVar) {
        gVar.getClass();
        if (this.a.n) {
            return;
        }
        vu1 vu1Var = new vu1(this.e, 17);
        h2 h2Var = new h2(this.f, this.g, 12);
        vu1 vu1Var2 = new vu1(this.h, 18);
        h2 h2Var2 = new h2(this.i, this.j, 13);
        xj2 xj2Var = new xj2(this.k, 11);
        k kVar = this.b;
        Context context = this.c;
        lr2 lr2Var = new lr2(gVar, kVar, context, this.d, vu1Var, h2Var, vu1Var2, h2Var2, xj2Var);
        this.l.setValue(lr2Var);
        ((lu0) this.m.getValue()).invoke(lr2Var);
        lr2Var.k(context, ((Boolean) this.n.getValue()).booleanValue());
    }
}
