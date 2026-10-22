package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d21 implements si {
    public final bh0 a;
    public final uf2 b;

    public d21(bh0 bh0Var, uf2 uf2Var) {
        this.a = bh0Var;
        this.b = uf2Var;
        if (bh0Var instanceof od3) {
            od3 od3Var = (od3) bh0Var;
            if (od3Var.a != 0 || od3Var.b != 0) {
                return;
            }
        } else if (bh0Var instanceof mx2) {
            if (((mx2) bh0Var).a != 0) {
                return;
            }
        } else if (!(bh0Var instanceof s91) || ((s91) bh0Var).a.a != 0) {
            return;
        }
        fo.i("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.si
    public final rh3 a(qd3 qd3Var) {
        return new jq2(this.a.a(qd3Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj;
        return d21Var.a.equals(this.a) && d21Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
