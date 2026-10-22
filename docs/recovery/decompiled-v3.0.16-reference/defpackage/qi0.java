package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class qi0 {
    public static final od3 a;
    public static final od3 b;
    public static final od3 c;

    static {
        f80 f80Var = new f80(0.4f, 0.0f, 0.6f, 1.0f);
        a = new od3(120, 0, lh0.a);
        b = new od3(150, 0, f80Var);
        c = new od3(120, 0, f80Var);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 od3) = (r1v0 od3), (r1v0 od3), (r1v0 od3), (r1v4 od3), (r1v4 od3), (r1v4 od3), (r1v4 od3) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(oh ohVar, float f, s41 s41Var, s41 s41Var2, k33 k33Var) {
        od3 od3Var;
        od3 od3Var2 = null;
        if (s41Var2 != null) {
            boolean z = s41Var2 instanceof vb2;
            od3Var = a;
            if (z || (s41Var2 instanceof mf0) || (s41Var2 instanceof ly0) || (s41Var2 instanceof jp0)) {
                od3Var2 = od3Var;
            }
        } else if (s41Var != null) {
            boolean z2 = s41Var instanceof vb2;
            od3Var = b;
            if (z2 || (s41Var instanceof mf0)) {
                od3Var2 = od3Var;
            } else if (s41Var instanceof ly0) {
                od3Var2 = c;
            } else if (s41Var instanceof jp0) {
                od3Var2 = od3Var;
            }
        }
        od3 od3Var3 = od3Var2;
        z70 z70Var = z70.e;
        if (od3Var3 != null) {
            Object objA = oh.a(ohVar, new td0(f), od3Var3, null, k33Var, 12);
            if (objA == z70Var) {
                return objA;
            }
        } else {
            Object objE = ohVar.e(new td0(f), k33Var);
            if (objE == z70Var) {
                return objE;
            }
        }
        return mf3.a;
    }
}
