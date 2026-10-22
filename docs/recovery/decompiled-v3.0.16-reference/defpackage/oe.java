package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class oe implements ru0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oe(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        float fIntBitsToFloat;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                pe peVar = (pe) obj5;
                he3 he3VarB = ((mq0) peVar.e).b((l43) obj, (jr0) obj2, ((hr0) obj3).a, ((ir0) obj4).a);
                if (he3VarB instanceof he3) {
                    Object obj6 = he3VarB.e;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                gn gnVar = new gn(he3VarB, peVar.j);
                peVar.j = gnVar;
                Object obj7 = gnVar.c;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((v23) obj5).e(new xt0(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                qu0 qu0Var = (qu0) obj5;
                bc1 bc1Var = (bc1) obj;
                ((Integer) obj2).intValue();
                f30 f30Var = (f30) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).f(bc1Var) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 131) != 130)) {
                    qu0Var.invoke(bc1Var, ov0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            default:
                ar2 ar2Var = (ar2) obj5;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pa1 pa1Var = (pa1) obj2;
                c12 c12Var = (c12) obj3;
                yp2 yp2Var = (yp2) obj4;
                long jF0 = pa1Var.f0();
                float f = (int) (jF0 >> 32);
                float fIntBitsToFloat2 = (int) (jF0 & 4294967295L);
                long j = c12Var.a;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                if (0.0f > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
                    z = false;
                } else {
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (0.0f > fIntBitsToFloat4 || fIntBitsToFloat4 > fIntBitsToFloat2) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                long jFloatToRawIntBits = c12Var.a;
                if (!z) {
                    int i2 = (int) (jFloatToRawIntBits >> 32);
                    if (Float.intBitsToFloat(i2) < 0.0f) {
                        fIntBitsToFloat = 0.0f;
                    } else {
                        fIntBitsToFloat = Float.intBitsToFloat(i2) > f ? f : Float.intBitsToFloat(i2);
                    }
                    int i3 = (int) (jFloatToRawIntBits & 4294967295L);
                    if (Float.intBitsToFloat(i3) < 0.0f) {
                        fIntBitsToFloat2 = 0.0f;
                    } else if (Float.intBitsToFloat(i3) <= fIntBitsToFloat2) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                    }
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                }
                long jA = ar2Var.a(pa1Var, jFloatToRawIntBits);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    ar2Var.k(zBooleanValue);
                    ar2Var.t = null;
                    ar2Var.n(jA, 9205357640488583168L, false, yp2Var);
                    vp0.a(ar2Var.h);
                    ar2Var.x = false;
                    ar2Var.o();
                    ar2Var.u = true;
                }
                return mf3Var;
        }
    }
}
