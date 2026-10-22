package defpackage;

import android.content.Context;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xr2 implements dd0 {
    public final /* synthetic */ df1 a;
    public final /* synthetic */ or2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ wr2 d;
    public final /* synthetic */ se2 e;
    public final /* synthetic */ k f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ se2 h;
    public final /* synthetic */ se2 i;

    public xr2(df1 df1Var, or2 or2Var, Context context, wr2 wr2Var, se2 se2Var, k kVar, ey1 ey1Var, se2 se2Var2, se2 se2Var3) {
        this.a = df1Var;
        this.b = or2Var;
        this.c = context;
        this.d = wr2Var;
        this.e = se2Var;
        this.f = kVar;
        this.g = ey1Var;
        this.h = se2Var2;
        this.i = se2Var3;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        this.a.getLifecycle().b(this.b);
        this.c.getApplicationContext().unregisterComponentCallbacks(this.d);
        as2.b(this.e, this.f, this.g, this.h, this.i);
    }
}
