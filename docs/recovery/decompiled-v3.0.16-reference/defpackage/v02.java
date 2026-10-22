package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v02 extends rd3 {
    public static final wo b = new wo(2);
    public final zw0 a;

    public v02(zw0 zw0Var) {
        this.a = zw0Var;
    }

    public final Serializable a(z71 z71Var, int i) {
        int iZ = az2.z(i);
        if (iZ == 5) {
            return z71Var.s0();
        }
        if (iZ == 6) {
            return Double.valueOf(z71Var.l0());
        }
        if (iZ == 7) {
            return Boolean.valueOf(z71Var.k0());
        }
        if (iZ == 8) {
            z71Var.q0();
            return null;
        }
        fo.n("Unexpected token: ".concat(az2.A(i)));
        return null;
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        Object arrayList;
        Serializable arrayList2;
        int iU0 = z71Var.u0();
        int iZ = az2.z(iU0);
        if (iZ == 0) {
            z71Var.A();
            arrayList = new ArrayList();
        } else if (iZ != 2) {
            arrayList = null;
        } else {
            z71Var.F();
            arrayList = new ig1(true);
        }
        if (arrayList == null) {
            return a(z71Var, iU0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (z71Var.h0()) {
                String strO0 = arrayList instanceof Map ? z71Var.o0() : null;
                int iU1 = z71Var.u0();
                int iZ2 = az2.z(iU1);
                if (iZ2 == 0) {
                    z71Var.A();
                    arrayList2 = new ArrayList();
                } else if (iZ2 != 2) {
                    arrayList2 = null;
                } else {
                    z71Var.F();
                    arrayList2 = new ig1(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(z71Var, iU1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strO0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    z71Var.U();
                } else {
                    z71Var.c0();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        if (obj == null) {
            i81Var.f0();
            return;
        }
        rd3 rd3VarC = this.a.c(new zd3(obj.getClass()));
        if (!(rd3VarC instanceof v02)) {
            rd3VarC.write(i81Var, obj);
        } else {
            i81Var.O();
            i81Var.c0();
        }
    }
}
