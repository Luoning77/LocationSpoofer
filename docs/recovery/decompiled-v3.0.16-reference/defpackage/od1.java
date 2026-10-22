package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class od1 {
    public final gx1 a;
    public final ld1 b;
    public final pc1 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ pc1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ k9 i;
    public final /* synthetic */ or j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ yd1 n;

    public od1(long j, boolean z, ld1 ld1Var, pc1 pc1Var, int i, int i2, k9 k9Var, or orVar, int i3, int i4, long j2, yd1 yd1Var) {
        this.e = z;
        this.f = pc1Var;
        this.g = i;
        this.h = i2;
        this.i = k9Var;
        this.j = orVar;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = yd1Var;
        gx1 gx1Var = g41.a;
        this.a = new gx1();
        this.b = ld1Var;
        this.c = pc1Var;
        this.d = m50.b(0, z ? l50.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : l50.g(j), 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final rd1 a(int i, long j) {
        List list;
        ld1 ld1Var = this.b;
        Object objD = ld1Var.d(i);
        Object objB = ld1Var.b(i);
        gx1 gx1Var = this.a;
        List list2 = (List) gx1Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            pc1 pc1Var = this.c;
            ld1 ld1Var2 = pc1Var.g;
            gx1 gx1Var2 = pc1Var.h;
            List listZ0 = (List) gx1Var2.b(i);
            if (listZ0 == null) {
                Object objD2 = ld1Var2.d(i);
                listZ0 = pc1Var.f.z0(objD2, pc1Var.e.a(i, objD2, ld1Var2.b(i)));
                gx1Var2.h(i, listZ0);
            }
            int size = listZ0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((zq1) listZ0.get(i2)).s(j));
            }
            gx1Var.h(i, arrayList);
            list = arrayList;
        }
        return new rd1(i, list, this.e, this.i, this.j, this.f.f.getLayoutDirection(), this.k, this.l, i != this.g + (-1) ? this.h : 0, this.m, objD, objB, this.n.o, j);
    }
}
