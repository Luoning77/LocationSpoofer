package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o92 extends Pair {
    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof o92)) {
            return false;
        }
        o92 o92Var = (o92) obj;
        if (((Integer) ((Pair) this).first).equals(((Pair) o92Var).first) && ((Integer) ((Pair) this).second).equals(((Pair) o92Var).second)) {
            return true;
        }
        return ((Integer) ((Pair) this).first).equals(((Pair) o92Var).second) && ((Integer) ((Pair) this).second).equals(((Pair) o92Var).first);
    }
}
