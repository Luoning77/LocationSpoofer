package defpackage;

import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.List;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xy implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xy(ul1 ul1Var, AppState appState, boolean z, l6 l6Var, int i) {
        this.e = 4;
        this.i = ul1Var;
        this.g = appState;
        this.f = z;
        this.j = l6Var;
        this.h = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.h;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(i2 | 1);
                ks.E((CollectionRouteRecord) obj5, this.f, (au0) obj3, (pu0) obj4, (f30) obj, iM0);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iM1 = wc0.m0(i2 | 1);
                hd0.c((ji0) obj5, this.f, (au0) obj3, (su0) obj4, (f30) obj, iM1);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iM2 = wc0.m0(i2 | 1);
                ld0.a((ki0) obj5, this.f, (au0) obj3, (iu0) obj4, (f30) obj, iM2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iM3 = wc0.m0(i2 | 1);
                ke0.c((li0) obj5, this.f, (au0) obj3, (vu0) obj4, (f30) obj, iM3);
                break;
            case 4:
                ((Integer) obj2).intValue();
                int iM4 = wc0.m0(i2 | 1);
                ke0.h((ul1) obj5, (AppState) obj3, this.f, (l6) obj4, (f30) obj, iM4);
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                int iM5 = wc0.m0(i2 | 1);
                gh0.e((List) obj5, this.f, (au0) obj3, (au0) obj4, (f30) obj, iM5);
                break;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                int iM6 = wc0.m0(1);
                wc0.l((String) obj5, this.f, (lu0) obj3, (String) obj4, (f30) obj, iM6, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM7 = wc0.m0(i2 | 1);
                ce0.e((List) obj5, (ul1) obj4, this.f, (au0) obj3, (f30) obj, iM7);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ xy(Object obj, boolean z, au0 au0Var, xu0 xu0Var, int i, int i2) {
        this.e = i2;
        this.i = obj;
        this.f = z;
        this.g = au0Var;
        this.j = xu0Var;
        this.h = i;
    }

    public /* synthetic */ xy(String str, boolean z, lu0 lu0Var, String str2, int i, int i2) {
        this.e = 6;
        this.i = str;
        this.f = z;
        this.g = lu0Var;
        this.j = str2;
        this.h = i2;
    }

    public /* synthetic */ xy(List list, ul1 ul1Var, boolean z, au0 au0Var, int i) {
        this.e = 7;
        this.i = list;
        this.j = ul1Var;
        this.f = z;
        this.g = au0Var;
        this.h = i;
    }
}
