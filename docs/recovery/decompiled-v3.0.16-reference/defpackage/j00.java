package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class j00 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ar2 f;
    public final /* synthetic */ p10 g;

    public /* synthetic */ j00(p10 p10Var, ar2 ar2Var) {
        this.e = 2;
        this.g = p10Var;
        this.f = ar2Var;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        wp2 wp2Var;
        bx1 bx1VarC;
        wp2 wp2Var2;
        bx1 bx1VarC2;
        boolean z;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ar2 ar2Var = this.f;
        p10 p10Var = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ji2.p(ar2Var, p10Var, (f30) obj, wc0.m0(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                n51.c(ar2Var, p10Var, (f30) obj, wc0.m0(49));
                break;
            default:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                int i3 = 0;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    p10Var.invoke(ov0Var, 0);
                    if (ar2Var.g() && ((Boolean) ar2Var.i.getValue()).booleanValue()) {
                        xp2 xp2VarF = ar2Var.f();
                        if (!(xp2VarF == null ? true : o51.f(xp2VarF.a, xp2VarF.b))) {
                            ov0Var.c0(-1736224054);
                            xp2 xp2VarF2 = ar2Var.f();
                            if (xp2VarF2 == null) {
                                ov0Var.c0(2011629175);
                                ov0Var.p(false);
                                z = false;
                            } else {
                                ov0Var.c0(2011629176);
                                ov0Var.c0(-1736222526);
                                List listG = am1.G(Boolean.TRUE, Boolean.FALSE);
                                int size = listG.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    boolean zBooleanValue = ((Boolean) listG.get(i4)).booleanValue();
                                    boolean zG = ov0Var.g(zBooleanValue);
                                    Object objQ = ov0Var.Q();
                                    Object obj3 = d30.a;
                                    if (zG || objQ == obj3) {
                                        objQ = new zq2(zBooleanValue, ar2Var);
                                        ov0Var.m0(objQ);
                                    }
                                    s63 s63Var = (s63) objQ;
                                    boolean zG2 = ov0Var.g(zBooleanValue);
                                    Object objQ2 = ov0Var.Q();
                                    if (zG2 || objQ2 == obj3) {
                                        objQ2 = zBooleanValue ? new bq2(ar2Var, i3) : new bq2(ar2Var, i2);
                                        ov0Var.m0(objQ2);
                                    }
                                    au0 au0Var = (au0) objQ2;
                                    hg2 hg2Var = zBooleanValue ? xp2VarF2.a.a : xp2VarF2.b.a;
                                    float fJ = 0.0f;
                                    if (zBooleanValue) {
                                        xp2 xp2VarF3 = ar2Var.f();
                                        if (xp2VarF3 != null && (bx1VarC2 = ar2Var.c((wp2Var2 = xp2VarF3.a))) != null) {
                                            int i5 = wp2Var2.b;
                                            x83 x83Var = (x83) bx1VarC2.c.invoke();
                                            if (x83Var != null) {
                                                fJ = v83.j(x83Var, i5);
                                            }
                                        }
                                    } else {
                                        xp2 xp2VarF4 = ar2Var.f();
                                        if (xp2VarF4 != null && (bx1VarC = ar2Var.c((wp2Var = xp2VarF4.b))) != null) {
                                            int i6 = wp2Var.b;
                                            x83 x83Var2 = (x83) bx1VarC.c.invoke();
                                            if (x83Var2 != null) {
                                                fJ = v83.j(x83Var2, i6);
                                            }
                                        }
                                    }
                                    hg2 hg2Var2 = hg2Var;
                                    float f = fJ;
                                    fq2 fq2Var = new fq2(au0Var);
                                    boolean z2 = xp2VarF2.c;
                                    boolean zH = ov0Var.h(s63Var);
                                    Object objQ3 = ov0Var.Q();
                                    if (zH || objQ3 == obj3) {
                                        objQ3 = new eq2(s63Var, 0);
                                        ov0Var.m0(objQ3);
                                    }
                                    ji2.u(fq2Var, zBooleanValue, hg2Var2, z2, 0L, f, m33.a(av1.a, s63Var, (PointerInputEventHandler) objQ3), ov0Var, 0);
                                    i4++;
                                    i2 = 1;
                                    i3 = 0;
                                }
                                boolean z3 = i3;
                                ov0Var.p(z3);
                                ov0Var.p(z3);
                                z = z3;
                            }
                            ov0Var.p(z);
                        } else {
                            ov0Var.c0(2013602667);
                            ov0Var.p(false);
                        }
                    } else {
                        ov0Var.c0(2013602667);
                        ov0Var.p(false);
                    }
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ j00(ar2 ar2Var, p10 p10Var, int i, int i2) {
        this.e = i2;
        this.f = ar2Var;
        this.g = p10Var;
    }
}
