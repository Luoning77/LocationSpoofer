package defpackage;

import android.graphics.Typeface;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mq0 implements lq0 {
    public final od a;
    public final z92 b;
    public final us1 c;

    public mq0(u92 u92Var, od odVar) {
        z92 z92Var = nq0.a;
        y70 y70VarPlus = qq0.b.plus(zc0.a).plus(sj0.e);
        Job.Key.getClass();
        CoroutineScopeKt.CoroutineScope(y70VarPlus.plus(SupervisorKt.SupervisorJob((Job) null)));
        us1 us1Var = new us1(4, (byte) 0);
        this.a = odVar;
        this.b = z92Var;
        this.c = us1Var;
        new t(this, 17);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096 A[Catch: Exception -> 0x009e, TRY_ENTER, TryCatch #1 {Exception -> 0x009e, blocks: (B:27:0x0042, B:29:0x0050, B:32:0x0055, B:34:0x0059, B:39:0x006e, B:55:0x0096, B:56:0x009d, B:35:0x0060, B:36:0x0062, B:37:0x0065, B:38:0x006a), top: B:64:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final he3 a(ge3 ge3Var) {
        Typeface typefaceK;
        Object objRemove;
        z92 z92Var = this.b;
        synchronized (((gt2) z92Var.f)) {
            try {
                he3 he3Var = (he3) ((mk1) z92Var.g).c(ge3Var);
                he3 he3Var2 = null;
                if (he3Var != null) {
                    if (he3Var.f) {
                        return he3Var;
                    }
                    mk1 mk1Var = (mk1) z92Var.g;
                    synchronized (mk1Var.c) {
                        objRemove = mk1Var.b.a.remove(ge3Var);
                        if (objRemove != null) {
                            mk1Var.d--;
                        }
                    }
                    if (objRemove != null) {
                        mk1Var.b(ge3Var, objRemove, null);
                    }
                }
                try {
                    l43 l43Var = ge3Var.a;
                    k91 k91Var = (k91) this.c.f;
                    int i = ge3Var.c;
                    jr0 jr0Var = ge3Var.b;
                    if (l43Var != null && !(l43Var instanceof la0)) {
                        if (l43Var instanceof xv0) {
                            typefaceK = k91Var.m((xv0) l43Var, jr0Var, i);
                        }
                        if (he3Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((gt2) z92Var.f)) {
                            if (((mk1) z92Var.g).c(ge3Var) == null && he3Var2.f) {
                                ((mk1) z92Var.g).d(ge3Var, he3Var2);
                            }
                        }
                        return he3Var2;
                    }
                    switch (k91Var.e) {
                        case 17:
                            typefaceK = k91.k(null, jr0Var, i);
                            break;
                        default:
                            typefaceK = k91.l(null, jr0Var, i);
                            break;
                    }
                    he3Var2 = new he3(typefaceK);
                    if (he3Var2 != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((gt2) z92Var.f)) {
                        if (((mk1) z92Var.g).c(ge3Var) == null) {
                            ((mk1) z92Var.g).d(ge3Var, he3Var2);
                        }
                        return he3Var2;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final he3 b(l43 l43Var, jr0 jr0Var, int i, int i2) {
        int i3 = this.a.e;
        return a(new ge3(l43Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? jr0Var : new jr0(mh0.v(jr0Var.e + i3, 1, 1000)), i, i2, null));
    }
}
