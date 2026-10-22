package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l33 extends hv1 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public l33(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return false;
        }
        l33 l33Var = (l33) obj;
        return o51.f(this.a, l33Var.a) && o51.f(this.b, l33Var.b) && this.c == l33Var.c;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new q33(this.a, this.b, this.c);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        q33 q33Var = (q33) cv1Var;
        Object obj = q33Var.s;
        Object obj2 = this.a;
        boolean z = !o51.f(obj, obj2);
        q33Var.s = obj2;
        Object obj3 = q33Var.t;
        Object obj4 = this.b;
        if (!o51.f(obj3, obj4)) {
            z = true;
        }
        q33Var.t = obj4;
        Class<?> cls = q33Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            q33Var.o1();
        }
        q33Var.u = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
