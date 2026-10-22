package defpackage;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ef2 extends df2 {
    public final q02 b;

    public ef2(q02 q02Var, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = q02Var;
    }

    @Override // defpackage.df2
    public final Object a() {
        return this.b.n();
    }

    @Override // defpackage.df2
    public final void c(Object obj, z71 z71Var, cf2 cf2Var) throws IllegalAccessException {
        Field field = cf2Var.b;
        Object obj2 = cf2Var.h.read(z71Var);
        if (obj2 == null && cf2Var.k) {
            return;
        }
        if (cf2Var.l) {
            throw new l71("Cannot set value of 'static final' ".concat(bf2.d(field, false)));
        }
        field.set(obj, obj2);
    }

    @Override // defpackage.df2
    public final Object b(Object obj) {
        return obj;
    }
}
