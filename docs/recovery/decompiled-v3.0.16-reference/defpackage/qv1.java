package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qv1[], still in use, count: 1, list:
  (r0v1 qv1[]) from 0x006f: CONSTRUCTOR (r0v1 qv1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:112) call: wk0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qv1 {
    OFF(0, 0.0d, 0.0d, 0.0d, 0.0d),
    LOW(1, 0.015d, 1.5d, 0.05d, 0.03d),
    MEDIUM(2, 0.03d, 3.0d, 0.1d, 0.06d),
    HIGH(3, 0.05d, 5.0d, 0.18d, 0.1d);

    public static final k91 j = new k91(8);
    public static final /* synthetic */ wk0 p;
    public final int e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    static {
        p = new wk0(new qv1[]{r0, r1, r2, r3});
    }

    public qv1(int i, double d, double d2, double d3, double d4) {
        super(str, i);
        this.e = i;
        this.f = d;
        this.g = d2;
        this.h = d3;
        this.i = d4;
    }

    public static qv1 valueOf(String str) {
        return (qv1) Enum.valueOf(qv1.class, str);
    }

    public static qv1[] values() {
        return (qv1[]) o.clone();
    }
}
