package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class s70 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t70 f;

    public /* synthetic */ s70(t70 t70Var, ss2 ss2Var) {
        this.e = 3;
        this.f = t70Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        StringBuilder sb = null;
        boolean z = true;
        t70 t70Var = this.f;
        switch (i) {
            case 0:
                w52 w52Var = t70Var.w.t;
                Boolean bool = Boolean.TRUE;
                w52Var.setValue(bool);
                t70Var.w.s.setValue(bool);
                me1 me1Var = t70Var.w;
                AutofillValue autofillValue = ((tc) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                t70.p1(me1Var, (String) textValue, t70Var.x);
                return bool;
            case 1:
                List list = (List) obj;
                if (t70Var.w.d() != null) {
                    y83 y83VarD = t70Var.w.d();
                    y83VarD.getClass();
                    list.add(y83VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                t70.p1(t70Var.w, ((dj) obj).f, t70Var.x);
                return Boolean.TRUE;
            default:
                dj djVar = (dj) obj;
                if (t70Var.x) {
                    p83 p83Var = t70Var.w.e;
                    if (p83Var != null) {
                        List listG = am1.G(new kn0(), new h00(djVar, 1));
                        me1 me1Var2 = t70Var.w;
                        d31 d31Var = me1Var2.d;
                        f70 f70Var = me1Var2.v;
                        f83 f83VarM = d31Var.m(listG);
                        p83Var.a(null, f83VarM);
                        f70Var.invoke(f83VarM);
                    } else {
                        f83 f83Var = t70Var.v;
                        String str = f83Var.a.f;
                        long j = f83Var.b;
                        int i2 = f93.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        djVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) djVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            b81.e(i4, i3, ") is less than start index (", "End index (");
                        }
                        String string = sb.toString();
                        int length = djVar.f.length() + ((int) (t70Var.v.b >> 32));
                        t70Var.w.v.invoke(new f83(string, g93.a(length, length), 4));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ s70(t70 t70Var, int i) {
        this.e = i;
        this.f = t70Var;
    }
}
