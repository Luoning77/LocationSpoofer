package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lm0 {
    public static final lm0 b;
    public static final lm0 c;
    public final nc3 a;

    static {
        LinkedHashMap linkedHashMap = null;
        om0 om0Var = null;
        lw2 lw2Var = null;
        lw lwVar = null;
        hd0 hd0Var = null;
        b = new lm0(new nc3(om0Var, lw2Var, lwVar, hd0Var, linkedHashMap, WorkQueueKt.MASK));
        c = new lm0(new nc3(om0Var, lw2Var, lwVar, hd0Var, linkedHashMap, 95));
    }

    public lm0(nc3 nc3Var) {
        this.a = nc3Var;
    }

    public final lm0 a(lm0 lm0Var) {
        nc3 nc3Var = lm0Var.a;
        om0 om0Var = nc3Var.a;
        nc3 nc3Var2 = this.a;
        if (om0Var == null) {
            om0Var = nc3Var2.a;
        }
        lw2 lw2Var = nc3Var.b;
        if (lw2Var == null) {
            lw2Var = nc3Var2.b;
        }
        lw lwVar = nc3Var.c;
        if (lwVar == null) {
            lwVar = nc3Var2.c;
        }
        return new lm0(new nc3(om0Var, lw2Var, lwVar, (hd0) null, nc3Var.d || nc3Var2.d, jq1.O(nc3Var2.e, nc3Var.e)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lm0) && ((lm0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        nc3 nc3Var = this.a;
        om0 om0Var = nc3Var.a;
        sb.append(om0Var != null ? om0Var.toString() : null);
        sb.append(",\nSlide - ");
        lw2 lw2Var = nc3Var.b;
        sb.append(lw2Var != null ? lw2Var.toString() : null);
        sb.append(",\nShrink - ");
        lw lwVar = nc3Var.c;
        sb.append(lwVar != null ? lwVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(nc3Var.d);
        return sb.toString();
    }
}
