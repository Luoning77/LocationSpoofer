package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface rh3 {
    boolean a();

    long b(yi yiVar, yi yiVar2, yi yiVar3);

    yi m(long j, yi yiVar, yi yiVar2, yi yiVar3);

    yi p(long j, yi yiVar, yi yiVar2, yi yiVar3);

    default yi q(yi yiVar, yi yiVar2, yi yiVar3) {
        return m(b(yiVar, yiVar2, yiVar3), yiVar, yiVar2, yiVar3);
    }
}
