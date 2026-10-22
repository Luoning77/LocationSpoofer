package defpackage;

import android.graphics.PathMeasure;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x30 extends aa1 implements au0 {
    public static final x30 A;
    public static final x30 B;
    public static final x30 C;
    public static final x30 D;
    public static final x30 g;
    public static final x30 h;
    public static final x30 i;
    public static final x30 j;
    public static final x30 k;
    public static final x30 l;
    public static final x30 m;
    public static final x30 n;
    public static final x30 o;
    public static final x30 p;
    public static final x30 q;
    public static final x30 r;
    public static final x30 s;
    public static final x30 t;
    public static final x30 u;
    public static final x30 v;
    public static final x30 w;
    public static final x30 x;
    public static final x30 y;
    public static final x30 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new x30(i2, 0);
        h = new x30(i2, 1);
        i = new x30(i2, 2);
        j = new x30(i2, 3);
        k = new x30(i2, 4);
        l = new x30(i2, 5);
        m = new x30(i2, 6);
        n = new x30(i2, 7);
        o = new x30(i2, 8);
        p = new x30(i2, 9);
        q = new x30(i2, 10);
        r = new x30(i2, 11);
        s = new x30(i2, 12);
        t = new x30(i2, 13);
        u = new x30(i2, 14);
        v = new x30(i2, 15);
        w = new x30(i2, 16);
        x = new x30(i2, 17);
        y = new x30(i2, 18);
        z = new x30(i2, 19);
        A = new x30(i2, 20);
        B = new x30(i2, 21);
        C = new x30(i2, 22);
        D = new x30(i2, 23);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i2 = this.f;
        re1 re1Var = re1.f;
        switch (i2) {
            case 0:
                z30.b("LocalLayoutDirection");
                throw null;
            case 1:
                return null;
            case 2:
                z30.b("LocalProvidableLocaleList");
                throw null;
            case 3:
                return Boolean.FALSE;
            case 4:
            case Logger.WARN /* 5 */:
                return null;
            case Logger.ERROR /* 6 */:
                z30.b("LocalTextToolbar");
                throw null;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                z30.b("LocalUriHandler");
                throw null;
            case 8:
                z30.b("LocalViewConfiguration");
                throw null;
            case mc0.b /* 9 */:
                z30.b("LocalWindowInfo");
                throw null;
            case mc0.c /* 10 */:
                return Boolean.TRUE;
            case 11:
                return Boolean.FALSE;
            case mc0.d /* 12 */:
                return Boolean.FALSE;
            case 13:
                hh0 hh0Var = v91.a;
                gn gnVar = j9.O;
                if (gnVar == null) {
                    fo.n("KoinApplication has not been started");
                    return null;
                }
                t20 t20Var = (t20) gnVar.c;
                t20Var.getClass();
                t20Var.j(re1Var, "[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
                return gnVar;
            case 14:
                hh0 hh0Var2 = v91.a;
                gn gnVar2 = j9.O;
                if (gnVar2 == null) {
                    fo.n("KoinApplication has not been started");
                    return null;
                }
                t20 t20Var2 = (t20) gnVar2.c;
                t20Var2.getClass();
                t20Var2.j(re1Var, "[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
                return (kn2) ((mn2) gnVar2.a).h;
            case a83.e /* 15 */:
                return new hb1(3);
            case 16:
            case 17:
                return null;
            case 18:
                return new hb1(2);
            case 19:
                return new te(new PathMeasure());
            case 20:
            case 21:
            case 22:
                return null;
            default:
                return mf3.a;
        }
    }
}
