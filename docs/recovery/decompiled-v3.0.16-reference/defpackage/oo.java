package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oo extends uy {
    public final no b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(y81 y81Var) {
        super(y81Var);
        y81Var.getClass();
        bt2 descriptor = y81Var.getDescriptor();
        descriptor.getClass();
        this.b = new no(descriptor);
    }

    @Override // defpackage.v
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.v
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.v
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.v
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.v
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // defpackage.uy
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
