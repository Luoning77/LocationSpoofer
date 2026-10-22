package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class oq implements q60, a80, Serializable {
    private final q60 completion;

    public oq(q60 q60Var) {
        this.completion = q60Var;
    }

    public q60 create(q60 q60Var) {
        q60Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public a80 getCallerFrame() {
        q60 q60Var = this.completion;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    public final q60 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        s90 s90Var = (s90) getClass().getAnnotation(s90.class);
        String str = null;
        if (s90Var == null || s90Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? s90Var.l()[iIntValue] : -1;
        dy dyVar = am1.E;
        dy dyVar2 = am1.F;
        if (dyVar2 == null) {
            try {
                dy dyVar3 = new dy(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                am1.F = dyVar3;
                dyVar2 = dyVar3;
            } catch (Exception unused2) {
                am1.F = dyVar;
                dyVar2 = dyVar;
            }
        }
        if (dyVar2 != dyVar && (method = dyVar2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = dyVar2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = dyVar2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = s90Var.c();
        } else {
            strC = str + '/' + s90Var.c();
        }
        return new StackTraceElement(strC, s90Var.m(), s90Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.q60
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            oq oqVar = (oq) r2;
            q60 q60Var = oqVar.completion;
            q60Var.getClass();
            try {
                obj = oqVar.invokeSuspend(obj);
                if (obj == z70.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new wg2(th);
            }
            oqVar.releaseIntercepted();
            if (!(q60Var instanceof oq)) {
                q60Var.resumeWith(obj);
                return;
            }
            r2 = q60Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public q60 create(Object obj, q60 q60Var) {
        q60Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
