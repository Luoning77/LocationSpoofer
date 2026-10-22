package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fs implements lu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;

    public /* synthetic */ fs(long j, float[] fArr, ue2 ue2Var, te2 te2Var) {
        this.f = j;
        this.g = fArr;
        this.h = ue2Var;
        this.i = te2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j;
        mf3 mf3Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        int i2 = this.e;
        mf3 mf3Var2 = mf3.a;
        Object obj2 = this.i;
        Serializable serializable = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                pe2 pe2Var = (pe2) obj3;
                we2 we2Var = (we2) serializable;
                long j2 = this.f;
                rr rrVar = (rr) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.c();
                float f = pe2Var.a;
                float f2 = pe2Var.b;
                xv xvVar = jb1Var.e;
                ((t1) xvVar.f.a).D(f, f2);
                try {
                    jg0.q0(jb1Var, (td) we2Var.e, j2, 0L, 0.0f, rrVar, 0, 890);
                    return mf3Var2;
                } finally {
                    ((t1) xvVar.f.a).D(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                ue2 ue2Var = (ue2) serializable;
                te2 te2Var = (te2) obj2;
                l52 l52Var = (l52) obj;
                int i3 = l52Var.b;
                le leVar = l52Var.a;
                int iE = l52Var.c;
                long j3 = this.f;
                int iF = i3 > f93.f(j3) ? l52Var.b : f93.f(j3);
                if (iE >= f93.e(j3)) {
                    iE = f93.e(j3);
                }
                long jA = g93.a(l52Var.d(iF), l52Var.d(iE));
                int i4 = ue2Var.e;
                t83 t83Var = leVar.d;
                int iF2 = f93.f(jA);
                int iE2 = f93.e(jA);
                Layout layout = t83Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    q21.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    q21.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    q21.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    q21.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iE2 - iF2) * 4) {
                    q21.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = t83Var.g(iF2);
                int iG2 = t83Var.g(iE2 - 1);
                ey0 ey0Var = new ey0(t83Var);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        j = jA;
                        int iF3 = t83Var.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fH = t83Var.h(iG);
                        float fE = t83Var.e(iG);
                        mf3Var = mf3Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iG) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = ey0Var.a(i6, false, false, false);
                                    i = iMin;
                                    fA = ey0Var.a(i6 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = ey0Var.a(i6, false, false, false);
                                        fA2 = ey0Var.a(i6 + 1, true, true, false);
                                    } else {
                                        fA2 = ey0Var.a(i6, false, false, true);
                                        fA = ey0Var.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fH;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fA = ey0Var.a(i6, z, z, true);
                                i = iMin;
                                fA2 = ey0Var.a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fH;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (iG != iG2) {
                            iG++;
                            jA = j;
                            i4 = i5;
                            mf3Var2 = mf3Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jA;
                    mf3Var = mf3Var2;
                    fArr = fArr2;
                }
                int iD = (f93.d(j) * 4) + ue2Var.e;
                for (int i7 = ue2Var.e; i7 < iD; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = te2Var.e;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                ue2Var.e = iD;
                te2Var.e = leVar.b() + te2Var.e;
                return mf3Var;
        }
    }

    public /* synthetic */ fs(pe2 pe2Var, we2 we2Var, long j, rr rrVar) {
        this.g = pe2Var;
        this.h = we2Var;
        this.f = j;
        this.i = rrVar;
    }
}
