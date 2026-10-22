package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cf2 {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ Method f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ rd3 h;
    public final /* synthetic */ zw0 i;
    public final /* synthetic */ zd3 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;

    public cf2(String str, Field field, boolean z, boolean z2, Method method, boolean z3, rd3 rd3Var, zw0 zw0Var, zd3 zd3Var, boolean z4, boolean z5) {
        this.f = method;
        this.g = z3;
        this.h = rd3Var;
        this.i = zw0Var;
        this.j = zd3Var;
        this.k = z4;
        this.l = z5;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(i81 i81Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.d) {
            Method method = this.f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new l71(az2.k("Accessor ", bf2.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = this.b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            i81Var.d0(this.a);
            boolean z = this.g;
            rd3 yp1Var = this.h;
            if (!z) {
                yp1Var = new yp1(this.i, yp1Var, this.j.b);
            }
            yp1Var.write(i81Var, objInvoke);
        }
    }
}
