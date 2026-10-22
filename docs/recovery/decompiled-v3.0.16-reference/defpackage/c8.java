package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c8 extends aa1 implements au0 {
    public static final c8 A;
    public static final c8 B;
    public static final c8 C;
    public static final c8 D;
    public static final c8 E;
    public static final c8 F;
    public static final c8 G;
    public static final c8 H;
    public static final c8 I;
    public static final c8 J;
    public static final c8 g;
    public static final c8 h;
    public static final c8 i;
    public static final c8 j;
    public static final c8 k;
    public static final c8 l;
    public static final c8 m;
    public static final c8 n;
    public static final c8 o;
    public static final c8 p;
    public static final c8 q;
    public static final c8 r;
    public static final c8 s;
    public static final c8 t;
    public static final c8 u;
    public static final c8 v;
    public static final c8 w;
    public static final c8 x;
    public static final c8 y;
    public static final c8 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new c8(i2, 0);
        h = new c8(i2, 1);
        i = new c8(i2, 2);
        j = new c8(i2, 3);
        k = new c8(i2, 4);
        l = new c8(i2, 5);
        m = new c8(i2, 6);
        n = new c8(i2, 7);
        o = new c8(i2, 8);
        p = new c8(i2, 9);
        q = new c8(i2, 10);
        r = new c8(i2, 11);
        s = new c8(i2, 12);
        t = new c8(i2, 13);
        u = new c8(i2, 14);
        v = new c8(i2, 15);
        w = new c8(i2, 16);
        x = new c8(i2, 17);
        y = new c8(i2, 18);
        z = new c8(i2, 19);
        A = new c8(i2, 20);
        B = new c8(i2, 21);
        C = new c8(i2, 22);
        D = new c8(i2, 23);
        E = new c8(i2, 24);
        F = new c8(i2, 25);
        G = new c8(i2, 26);
        H = new c8(i2, 27);
        I = new c8(i2, 28);
        J = new c8(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i2 = this.f;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        switch (i2) {
            case 0:
                return Integer.valueOf(od2.e.c(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                AndroidCompositionLocals_androidKt.a("LocalConfiguration");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.a("LocalContext");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
                throw null;
            case Logger.WARN /* 5 */:
                AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
                throw null;
            case Logger.ERROR /* 6 */:
                AndroidCompositionLocals_androidKt.a("LocalView");
                throw null;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return UUID.randomUUID();
            case 8:
                return Boolean.FALSE;
            case mc0.b /* 9 */:
                return "DEFAULT_TEST_TAG";
            case mc0.c /* 10 */:
                return UUID.randomUUID();
            case 11:
                qg qgVar = new qg(Looper.myLooper() == Looper.getMainLooper() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new jd(2, q60Var, 1)), mh0.z(Looper.getMainLooper()));
                return qgVar.plus(qgVar.n);
            case mc0.d /* 12 */:
            case 13:
            case 14:
                return mf3Var;
            case a83.e /* 15 */:
            case 16:
            case 17:
                return null;
            case 18:
                z30.b("LocalAutofillManager");
                throw null;
            case 19:
                z30.b("LocalAutofillTree");
                throw null;
            case 20:
                z30.b("LocalClipboard");
                throw null;
            case 21:
                z30.b("LocalClipboardManager");
                throw null;
            case 22:
                return Boolean.TRUE;
            case 23:
                z30.b("LocalDensity");
                throw null;
            case 24:
                z30.b("LocalFocusManager");
                throw null;
            case 25:
                z30.b("LocalFontFamilyResolver");
                throw null;
            case 26:
                z30.b("LocalFontLoader");
                throw null;
            case 27:
                z30.b("LocalGraphicsContext");
                throw null;
            case 28:
                z30.b("LocalHapticFeedback");
                throw null;
            default:
                z30.b("LocalInputManager");
                throw null;
        }
    }
}
