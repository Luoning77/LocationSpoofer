package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eh0 implements y81 {
    public static final eh0 a = new eh0();
    public static final cc2 b = new cc2("kotlin.time.Duration", bc2.m);

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        c30 c30Var = ah0.f;
        String strX = w90Var.x();
        strX.getClass();
        try {
            long jZ = dh0.z(strX);
            if (jZ == ah0.i) {
                throw new IllegalStateException("invariant failed");
            }
            return new ah0(jZ);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(az2.k("Invalid ISO duration string format: '", strX, "'."), e);
        }
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        long j = ((ah0) obj).e;
        c30 c30Var = ah0.f;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j2 = j < 0 ? ah0.j(j) : j;
        long jH = ah0.h(j2, fh0.HOURS);
        boolean z = false;
        int iH = ah0.f(j2) ? 0 : (int) (ah0.h(j2, fh0.MINUTES) % 60);
        int iH2 = ah0.f(j2) ? 0 : (int) (ah0.h(j2, fh0.SECONDS) % 60);
        int iE = ah0.e(j2);
        if (ah0.f(j)) {
            jH = 9999999999999L;
        }
        boolean z2 = jH != 0;
        boolean z3 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jH);
            sb.append('H');
        }
        if (z) {
            sb.append(iH);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            ah0.b(sb, iH2, iE, 9, "S", true);
        }
        ak0Var.A(sb.toString());
    }
}
