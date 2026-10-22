package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p12 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x12 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p12(x12 x12Var, int i) {
        super(1);
        this.f = i;
        this.g = x12Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        o12 o12Var;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        Object obj2 = null;
        x12 x12Var = this.g;
        switch (i) {
            case 0:
                yp ypVar = (yp) obj;
                ypVar.getClass();
                mo moVar = x12Var.b;
                ListIterator listIterator = moVar.listIterator(moVar.a());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((o12) objPrevious).a) {
                        obj2 = objPrevious;
                        o12Var = (o12) obj2;
                        if (x12Var.c != null) {
                            x12Var.b();
                        }
                        x12Var.c = o12Var;
                        if (o12Var != null) {
                            o12Var.d(ypVar);
                        }
                        break;
                    }
                }
                o12Var = (o12) obj2;
                if (x12Var.c != null) {
                    x12Var.b();
                }
                x12Var.c = o12Var;
                if (o12Var != null) {
                    o12Var.d(ypVar);
                }
                break;
            default:
                yp ypVar2 = (yp) obj;
                ypVar2.getClass();
                o12 o12Var2 = x12Var.c;
                if (o12Var2 == null) {
                    mo moVar2 = x12Var.b;
                    ListIterator listIterator2 = moVar2.listIterator(moVar2.a());
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((o12) objPrevious2).a) {
                            obj2 = objPrevious2;
                            o12Var2 = (o12) obj2;
                        }
                    }
                    o12Var2 = (o12) obj2;
                }
                if (o12Var2 != null) {
                    o12Var2.c(ypVar2);
                }
                break;
        }
        return mf3Var;
    }
}
