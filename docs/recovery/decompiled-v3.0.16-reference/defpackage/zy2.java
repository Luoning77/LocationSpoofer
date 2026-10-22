package defpackage;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.ht2;
import defpackage.l30;
import defpackage.m30;
import defpackage.n92;
import defpackage.of3;
import defpackage.oo;
import defpackage.w90;
import defpackage.y81;
import defpackage.zb1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zy2 {
    public final <T> y81 serializer(final y81 y81Var) {
        y81Var.getClass();
        return new uv0() { // from class: androidx.savedstate.serialization.serializers.b
            private final bt2 descriptor;

            {
                n92 n92Var = new n92("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                n92Var.k("keys", false);
                n92Var.k("values", false);
                this.descriptor = n92Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.uv0
            public final y81[] childSerializers() {
                return new y81[]{SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), new oo(y81Var)};
            }

            @Override // defpackage.y81
            public final Object deserialize(w90 w90Var) {
                bt2 bt2Var = this.descriptor;
                l30 l30VarB = w90Var.b(bt2Var);
                zb1[] zb1VarArr = SparseArraySerializer$SparseArraySurrogate.$childSerializers;
                ht2 ht2Var = null;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int iJ = l30VarB.j(bt2Var);
                    if (iJ == -1) {
                        z = false;
                    } else if (iJ == 0) {
                        list = (List) l30VarB.u(bt2Var, 0, (y81) zb1VarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iJ != 1) {
                            throw new of3(iJ);
                        }
                        list2 = (List) l30VarB.u(bt2Var, 1, new oo(y81Var), list2);
                        i |= 2;
                    }
                }
                l30VarB.a(bt2Var);
                return new SparseArraySerializer$SparseArraySurrogate(i, list, list2, ht2Var);
            }

            @Override // defpackage.y81
            public final bt2 getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.y81
            public final void serialize(ak0 ak0Var, Object obj) {
                SparseArraySerializer$SparseArraySurrogate sparseArraySerializer$SparseArraySurrogate = (SparseArraySerializer$SparseArraySurrogate) obj;
                sparseArraySerializer$SparseArraySurrogate.getClass();
                bt2 bt2Var = this.descriptor;
                m30 m30VarB = ak0Var.b(bt2Var);
                SparseArraySerializer$SparseArraySurrogate.write$Self$savedstate(sparseArraySerializer$SparseArraySurrogate, m30VarB, bt2Var, y81Var);
                m30VarB.a(bt2Var);
            }

            @Override // defpackage.uv0
            public final y81[] typeParametersSerializers() {
                return new y81[]{y81Var};
            }
        };
    }
}
