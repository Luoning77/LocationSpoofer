package org.maplibre.android.maps;

import android.graphics.PointF;
import android.view.View;
import defpackage.kv;
import defpackage.r00;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ kv e;
    public final /* synthetic */ k f;

    public h(k kVar, kv kvVar) {
        this.f = kVar;
        this.e = kvVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f;
        g gVar = kVar.i;
        if (gVar != null) {
            n nVar = gVar.d;
            if (kVar.o != null) {
                PointF pointF = kVar.p;
                if (pointF != null) {
                    float f = pointF.x;
                    float f2 = pointF.y;
                    gVar.j();
                    ((NativeMapView) nVar.a).I(0.0d, f, f2, 150L);
                } else {
                    float fC = gVar.c.c() / 2.0f;
                    float fB = kVar.i.c.b() / 2.0f;
                    gVar.j();
                    ((NativeMapView) nVar.a).I(0.0d, fC, fB, 150L);
                }
                this.e.c(3);
                r00 r00Var = kVar.o;
                r00Var.i = true;
                r00Var.postDelayed(r00Var, 650L);
            }
        }
    }
}
