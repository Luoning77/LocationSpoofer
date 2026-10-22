package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class v31 {
    public final ir a;

    public v31(ir irVar) {
        this.a = irVar;
    }

    public Object a(gn gnVar) throws jb0 {
        t20 t20Var = (t20) gnVar.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        ir irVar = this.a;
        sb.append(irVar);
        sb.append('\'');
        String string = sb.toString();
        t20Var.getClass();
        t20Var.j(re1.e, string);
        try {
            r52 r52Var = (r52) gnVar.c;
            if (r52Var == null) {
                r52Var = new r52(3, null);
            }
            return irVar.c.invoke((kn2) gnVar.b, r52Var);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (l13.c0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(zy.s0(arrayList, "\n\t", null, null, null, 62));
            t20Var.j(re1.h, "* Instance creation error : could not create instance for '" + irVar + "': " + sb2.toString());
            throw new jb0("Could not create instance for '" + irVar + '\'', e);
        }
    }

    public abstract Object b(gn gnVar);

    public final boolean equals(Object obj) {
        v31 v31Var = obj instanceof v31 ? (v31) obj : null;
        return this.a.equals(v31Var != null ? v31Var.a : null);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
