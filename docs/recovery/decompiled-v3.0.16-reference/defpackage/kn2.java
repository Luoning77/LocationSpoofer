package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kn2 {
    public final fd2 a;
    public final String b;
    public final boolean c;
    public final gn d;
    public final ArrayList e;
    public Object f;
    public final ArrayList g;
    public final ThreadLocal h;
    public boolean i;

    public kn2(fd2 fd2Var, String str, boolean z, gn gnVar) {
        fd2Var.getClass();
        this.a = fd2Var;
        this.b = str;
        this.c = z;
        this.d = gnVar;
        this.e = new ArrayList();
        this.g = new ArrayList();
        this.h = new ThreadLocal();
    }

    public final Object a(ox oxVar, au0 au0Var) {
        gn gnVar = this.d;
        t20 t20Var = (t20) gnVar.c;
        re1 re1Var = re1.e;
        if (!t20Var.i(re1Var)) {
            return b(oxVar, au0Var);
        }
        ((t20) gnVar.c).g(re1Var, "|- '" + m81.a(oxVar) + "' ...");
        long jNanoTime = System.nanoTime();
        Object objB = b(oxVar, au0Var);
        double dNanoTime = ((double) (System.nanoTime() - jNanoTime)) / 1000000.0d;
        ((t20) gnVar.c).g(re1Var, "|- '" + m81.a(oxVar) + "' in " + dNanoTime + " ms");
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    public final Object b(ox oxVar, au0 au0Var) throws hy, oz1 {
        mo moVar;
        if (this.i) {
            throw new hy(az2.p(new StringBuilder("Scope '"), this.b, "' is closed"));
        }
        r52 r52Var = au0Var != null ? (r52) au0Var.invoke() : null;
        re1 re1Var = re1.e;
        ThreadLocal threadLocal = this.h;
        gn gnVar = this.d;
        if (r52Var != null) {
            t20 t20Var = (t20) gnVar.c;
            t20Var.getClass();
            if (t20Var.i(re1Var)) {
                t20Var.g(re1Var, "| >> parameters " + r52Var + ' ');
            }
            moVar = (mo) threadLocal.get();
            if (moVar == null) {
                moVar = new mo();
                threadLocal.set(moVar);
            }
            moVar.addFirst(r52Var);
        } else {
            moVar = null;
        }
        gn gnVar2 = new gn((t20) gnVar.c, this, r52Var);
        gn gnVar3 = (gn) gnVar.b;
        gnVar3.getClass();
        fd2 fd2Var = this.a;
        fd2Var.getClass();
        v31 v31Var = (v31) ((ConcurrentHashMap) gnVar3.c).get(zm3.w(oxVar, fd2Var));
        Object objB = v31Var != null ? v31Var.b(gnVar2) : null;
        if (objB == null) {
            objB = null;
        }
        if (objB == null) {
            t20 t20Var2 = (t20) gnVar.c;
            String str = "|- ? t:'" + m81.a(oxVar) + "' - q:'null' look in injected parameters";
            t20Var2.getClass();
            t20Var2.j(re1Var, str);
            mo moVar2 = (mo) threadLocal.get();
            if (moVar2 == null) {
                objB = null;
            } else {
                r52 r52Var2 = (r52) (moVar2.isEmpty() ? null : moVar2.f[moVar2.e]);
                if (r52Var2 != null) {
                    objB = r52Var2.a(oxVar);
                } else {
                    objB = null;
                }
            }
            if (objB == null) {
                if (this.c) {
                    objB = null;
                } else {
                    t20 t20Var3 = (t20) gnVar.c;
                    String str2 = "|- ? t:'" + m81.a(oxVar) + "' - q:'null' look at scope source";
                    t20Var3.getClass();
                    t20Var3.j(re1Var, str2);
                    Object obj = this.f;
                    if (obj == null || !oxVar.d(obj) || (objB = this.f) == null) {
                        objB = null;
                    }
                }
                if (objB == null) {
                    t20 t20Var4 = (t20) gnVar.c;
                    String str3 = "|- ? t:'" + m81.a(oxVar) + "' - q:'null' look in other scopes";
                    t20Var4.getClass();
                    t20Var4.j(re1Var, str3);
                    ArrayList arrayList = this.e;
                    int size = arrayList.size();
                    int i = 0;
                    Object objA = null;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        kn2 kn2Var = (kn2) obj2;
                        gn gnVar4 = kn2Var.d;
                        try {
                            objA = kn2Var.a(oxVar, au0Var);
                        } catch (hy unused) {
                            t20 t20Var5 = (t20) gnVar4.c;
                            String str4 = "* Scope closed - no instance found for " + m81.a(oxVar) + " on scope " + kn2Var;
                            t20Var5.getClass();
                            t20Var5.j(re1Var, str4);
                            objA = null;
                        } catch (oz1 unused2) {
                            t20 t20Var6 = (t20) gnVar4.c;
                            String str5 = "* No instance found for type '" + m81.a(oxVar) + "' on scope '" + kn2Var + '\'';
                            t20Var6.getClass();
                            t20Var6.j(re1Var, str5);
                            objA = null;
                        }
                        if (objA != null) {
                            break;
                        }
                    }
                    objB = objA;
                    if (objB == null) {
                        if (au0Var != null) {
                            threadLocal.remove();
                            t20 t20Var7 = (t20) gnVar.c;
                            t20Var7.getClass();
                            t20Var7.j(re1Var, "|- << parameters");
                        }
                        throw new oz1("No definition found for type '" + m81.a(oxVar) + "'. Check your Modules configuration and add missing type and/or qualifier!");
                    }
                }
            }
        }
        if (moVar != null) {
            t20 t20Var8 = (t20) gnVar.c;
            t20Var8.getClass();
            t20Var8.j(re1Var, "| << parameters");
            if (!moVar.isEmpty()) {
                moVar.removeFirst();
            }
        }
        return objB;
    }

    public final String toString() {
        return az2.p(new StringBuilder("['"), this.b, "']");
    }
}
