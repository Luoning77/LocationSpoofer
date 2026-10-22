package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bu1 extends cv1 implements u30, ya1 {
    public LinkedHashMap s;

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        float f = ((td0) xq1.C(this, v41.c)).e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        h82 h82VarS = zq1Var.s(j);
        boolean z = this.r && !Float.isNaN(f) && td0.a(f, 0.0f) > 0;
        int iN0 = !Float.isNaN(f) ? gr1Var.n0(f) : 0;
        int iMax = h82VarS.e;
        if (z) {
            iMax = Math.max(iMax, iN0);
        }
        int iMax2 = h82VarS.f;
        if (z) {
            iMax2 = Math.max(iMax2, iN0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.s = linkedHashMap;
            }
            ji3 ji3Var = v41.b;
            int iRound = Math.round((iN0 - h82VarS.e) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(ji3Var, Integer.valueOf(iRound));
            dy0 dy0Var = v41.a;
            int iRound2 = Math.round((iN0 - h82VarS.f) / 2.0f);
            linkedHashMap.put(dy0Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.s;
        if (map == null) {
            map = vj0.e;
        }
        return gr1Var.H0(iMax, iMax2, map, new p31(iMax, iMax2, h82VarS));
    }
}
