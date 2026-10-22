package androidx.compose.ui.platform;

import defpackage.a40;
import defpackage.c8;
import defpackage.cd2;
import defpackage.hh0;
import defpackage.kh1;
import defpackage.wa;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final hh0 a = new hh0(0, c8.i);
    public static final hh0 b = new hh0(1, c8.j);
    public static final a40 c = new a40(wa.i);
    public static final hh0 d = new hh0(1, c8.k);
    public static final hh0 e = new hh0(1, c8.l);
    public static final hh0 f = new hh0(1, c8.m);

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final cd2 getLocalLifecycleOwner() {
        return kh1.a;
    }
}
