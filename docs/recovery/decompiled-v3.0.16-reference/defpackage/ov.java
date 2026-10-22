package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ov implements sp0 {
    public static final ov a = new ov();
    public static Boolean b;

    @Override // defpackage.sp0
    public final boolean c() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw az2.e("canFocus is read before it is written");
    }

    @Override // defpackage.sp0
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
