package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pk0 {
    public static final pk0 b = new pk0(new nc3((om0) null, (lw2) null, (lw) null, (hd0) null, (LinkedHashMap) null, WorkQueueKt.MASK));
    public final nc3 a;

    public pk0(nc3 nc3Var) {
        this.a = nc3Var;
    }

    public final pk0 a(pk0 pk0Var) {
        nc3 nc3Var = pk0Var.a;
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
        return new pk0(new nc3(om0Var, lw2Var, lwVar, (hd0) null, jq1.O(nc3Var2.e, nc3Var.e), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pk0) && ((pk0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb.toString();
    }
}
