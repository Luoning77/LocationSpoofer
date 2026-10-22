package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y31 implements z31 {
    public final long e;
    public final int f;

    public y31(int i, long j) {
        this.e = j;
        this.f = i;
    }

    @Override // defpackage.z31
    public final w31 toInstant() {
        w31 w31Var = w31.g;
        w31 w31Var2 = w31.g;
        long j = w31Var2.e;
        long j2 = this.e;
        if (j2 >= j) {
            w31 w31Var3 = w31.h;
            if (j2 <= w31Var3.e) {
                long j3 = this.f;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? w31Var3 : w31Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new w31((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
                    }
                }
            }
        }
        throw new x31("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
