package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yf2 {
    public final zz0 a;
    public final String b;
    public final ox0 c;
    public final cg2 d;
    public final Map e;
    public vu f;

    public yf2(zz0 zz0Var, String str, ox0 ox0Var, cg2 cg2Var, Map map) {
        zz0Var.getClass();
        str.getClass();
        this.a = zz0Var;
        this.b = str;
        this.c = ox0Var;
        this.d = cg2Var;
        this.e = map;
    }

    public final xp a() {
        xp xpVar = new xp();
        xpVar.e = new LinkedHashMap();
        xpVar.a = this.a;
        xpVar.b = this.b;
        xpVar.d = this.d;
        Map map = this.e;
        xpVar.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        xpVar.c = this.c.c();
        return xpVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        ox0 ox0Var = this.c;
        if (ox0Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = ox0Var.iterator();
            int i = 0;
            while (true) {
                d0 d0Var = (d0) it;
                if (!d0Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = d0Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    am1.X();
                    throw null;
                }
                i52 i52Var = (i52) next;
                String str = (String) i52Var.e;
                String str2 = (String) i52Var.f;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
