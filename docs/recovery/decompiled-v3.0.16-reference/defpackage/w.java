package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vincenthzr.locationspoofer.LocationApp;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.i;
import org.maplibre.android.maps.k;
import org.maplibre.android.snapshotter.MapSnapshotter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w(MapSnapshotter mapSnapshotter, String str) {
        this.e = 10;
        this.f = mapSnapshotter;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0282  */
    /* JADX WARN: Code duplicated, block: B:166:0x0293 A[Catch: all -> 0x02c2, LOOP:1: B:151:0x0233->B:166:0x0293, LOOP_END, TryCatch #0 {all -> 0x02c2, blocks: (B:148:0x0225, B:151:0x0233, B:153:0x0243, B:155:0x024f, B:157:0x0258, B:159:0x0267, B:161:0x0284, B:166:0x0293, B:167:0x0297, B:169:0x02a9, B:173:0x02be, B:174:0x02c1, B:168:0x029c), top: B:234:0x0225, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r4;
        View viewFindFocus;
        Boolean bool = null;
        int i = 2;
        Application application = 1;
        application = 1;
        int i2 = 0;
        switch (this.e) {
            case 0:
                ((y) this.f).b();
                return;
            case 1:
                Activity activity = (Activity) this.f;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = p7.g;
                Method method = p7.f;
                o7 o7Var = Build.VERSION.SDK_INT;
                if (o7Var >= 28) {
                    activity.recreate();
                    return;
                }
                if (((o7Var != 26 && o7Var != 27) || method != null) && (p7.e != null || p7.d != null)) {
                    try {
                        Object obj2 = p7.c.get(activity);
                        if (obj2 != null && (obj = p7.b.get(activity)) != null) {
                            application = activity.getApplication();
                            o7Var = new o7(activity);
                            application.registerActivityLifecycleCallbacks(o7Var);
                            handler.post(new e7(1 == true ? 1 : 0, o7Var, obj2));
                            if (o7Var != 26 && o7Var != 27) {
                                application = 0;
                            }
                            try {
                                if (application != 0) {
                                    try {
                                        Boolean bool2 = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool2, null, null, bool2, bool2);
                                    } catch (Throwable th) {
                                        th = th;
                                        r4 = application;
                                        r5 = o7Var;
                                        handler.post(new e7(i, r4, r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new e7(i, application, o7Var));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = application;
                                r5 = o7Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                jb jbVar = (jb) this.f;
                Trace.beginSection("measureAndLayout");
                try {
                    jbVar.h.r(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        jbVar.i();
                        Trace.endSection();
                        jbVar.M = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 3:
                yb ybVar = (yb) this.f;
                boolean zD = ybVar.d();
                db dbVar = ybVar.e;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        dbVar.r(true);
                        gx1 gx1Var = ybVar.n;
                        int[] iArr = gx1Var.b;
                        long[] jArr = gx1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = i2;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!ybVar.c().a(i6)) {
                                                ybVar.h.add(new s50(i6, ybVar.m, t50.f, null));
                                                ybVar.k.mo32trySendJP2dKIU(mf3.a);
                                            }
                                        }
                                        j >>= 8;
                                        i5++;
                                        length = length;
                                    }
                                    int i7 = length;
                                    if (i4 == 8) {
                                        length = i7;
                                        if (i3 != length) {
                                            i3++;
                                            i2 = 0;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                    i2 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            ybVar.f(dbVar.getSemanticsOwner().a(), ybVar.o);
                            Trace.endSection();
                            ybVar.b(ybVar.c());
                            ybVar.j();
                            ybVar.p = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((jg) this.f).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case Logger.WARN /* 5 */:
                d10 d10Var = (d10) this.f;
                Runnable runnable = d10Var.f;
                if (runnable != null) {
                    runnable.run();
                    d10Var.f = null;
                    return;
                }
                return;
            case Logger.ERROR /* 6 */:
                k10.c((k10) this.f);
                return;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                uq0 uq0Var = (uq0) this.f;
                synchronized (uq0Var.c) {
                    try {
                        if (uq0Var.g == null) {
                            return;
                        }
                        try {
                            lr0 lr0VarC = uq0Var.c();
                            int i8 = lr0VarC.e;
                            if (i8 == 2) {
                                synchronized (uq0Var.c) {
                                }
                            }
                            if (i8 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                int i9 = rb3.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = uq0Var.a;
                                lr0[] lr0VarArr = {lr0VarC};
                                k93 k93Var = ae3.a;
                                r93.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceC = ae3.a.c(context, lr0VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferD = l93.d(uq0Var.a, lr0VarC.a);
                                    if (mappedByteBufferD == null || typefaceC == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        mn2 mn2Var = new mn2(typefaceC, ld0.J(mappedByteBufferD));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (uq0Var.c) {
                                            try {
                                                gh0 gh0Var = uq0Var.g;
                                                if (gh0Var != null) {
                                                    gh0Var.J(mn2Var);
                                                }
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                        uq0Var.b();
                                        return;
                                    } catch (Throwable th7) {
                                        int i10 = rb3.a;
                                        Trace.endSection();
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Trace.endSection();
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                int i11 = rb3.a;
                                Trace.endSection();
                                throw th9;
                            }
                            break;
                        } catch (Throwable th10) {
                            synchronized (uq0Var.c) {
                                try {
                                    gh0 gh0Var2 = uq0Var.g;
                                    if (gh0Var2 != null) {
                                        gh0Var2.I(th10);
                                    }
                                    uq0Var.b();
                                    return;
                                } catch (Throwable th11) {
                                    throw th11;
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        throw th12;
                    }
                }
            case 8:
                Iterator it = ((gs0) this.f).m.iterator();
                if (it.hasNext()) {
                    throw az2.g(it);
                }
                return;
            case mc0.b /* 9 */:
                LocationApp.onCreate$lambda$1((LocationApp) this.f);
                return;
            case mc0.c /* 10 */:
                return;
            case 11:
                k kVar = (k) this.f;
                kVar.post(new i(kVar));
                return;
            case mc0.d /* 12 */:
                gc2 gc2Var = (gc2) this.f;
                ff1 ff1Var = gc2Var.j;
                if (gc2Var.f == 0) {
                    gc2Var.g = true;
                    ff1Var.e(ve1.ON_PAUSE);
                }
                if (gc2Var.e == 0 && gc2Var.g) {
                    ff1Var.e(ve1.ON_STOP);
                    gc2Var.h = true;
                    return;
                }
                return;
            case 13:
                rh2.setRippleState$lambda$1((rh2) this.f);
                return;
            case 14:
                View view = (View) this.f;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                n83 n83Var = (n83) this.f;
                gn gnVar = n83Var.b;
                n83Var.n = null;
                gy1 gy1Var = n83Var.m;
                View view2 = n83Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    gy1Var.g();
                    return;
                }
                Object[] objArr = gy1Var.e;
                int i12 = gy1Var.g;
                Boolean boolValueOf = null;
                for (int i13 = 0; i13 < i12; i13++) {
                    m83 m83Var = (m83) objArr[i13];
                    int iOrdinal = m83Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            b81.d();
                            return;
                        } else if (!o51.f(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(m83Var == m83.g);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                gy1Var.g();
                if (o51.f(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((zb1) gnVar.b).getValue()).restartInput((View) gnVar.a);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((us1) ((us1) gnVar.c).f).v();
                    } else {
                        ((us1) ((us1) gnVar.c).f).n();
                    }
                }
                if (o51.f(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((zb1) gnVar.b).getValue()).restartInput((View) gnVar.a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ w(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    private final void a() {
    }
}
