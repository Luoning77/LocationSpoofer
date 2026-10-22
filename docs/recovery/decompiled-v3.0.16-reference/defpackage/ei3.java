package defpackage;

import kotlinx.coroutines.DebugKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ei3[], still in use, count: 1, list:
  (r0v1 ei3[]) from 0x003c: CONSTRUCTOR (r0v1 ei3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: wk0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ei3 {
    g(DebugKt.DEBUG_PROPERTY_VALUE_AUTO),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("hyperos"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("coloros"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("oneui"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("aosp");

    public static final gt2 f = new gt2(10);
    public static final /* synthetic */ wk0 i;
    public final String e;

    static {
        i = new wk0(new ei3[]{r0, new ei3("hyperos"), new ei3("coloros"), new ei3("oneui"), new ei3("aosp")});
    }

    public ei3(String str) {
        super(str, i);
        this.e = str;
    }

    public static ei3 valueOf(String str) {
        return (ei3) Enum.valueOf(ei3.class, str);
    }

    public static ei3[] values() {
        return (ei3[]) h.clone();
    }
}
