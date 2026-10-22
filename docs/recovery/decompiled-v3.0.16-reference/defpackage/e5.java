package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.security.KeyPair;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class e5 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e5(ul1 ul1Var, List list, Context context, au0 au0Var, ey1 ey1Var) {
        this.e = 5;
        this.f = ul1Var;
        this.h = list;
        this.i = context;
        this.j = au0Var;
        this.g = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.e;
        char c = 1;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i2) {
            case 0:
                l6 l6Var = (l6) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((ey1) obj5).setValue(Boolean.FALSE);
                ((ey1) obj4).setValue("");
                ((ey1) obj3).setValue("");
                ((ey1) obj2).setValue("");
                l6Var.g(new j6(l6Var, zBooleanValue, null));
                return mf3Var;
            case 1:
                ne1 ne1Var = (ne1) obj;
                ge1 ge1Var = ((zd) obj5).a;
                ne1Var.h = (f83) obj6;
                ne1Var.i = (c11) obj4;
                ne1Var.c = (ji1) obj3;
                ne1Var.d = (lu0) obj2;
                ne1Var.e = ge1Var != null ? ge1Var.t : null;
                ne1Var.f = ge1Var != null ? ge1Var.u : null;
                ne1Var.g = ge1Var != null ? (aj3) xq1.C(ge1Var, z30.u) : null;
                return mf3Var;
            case 2:
                return EncryptedCloudSessionStore.prepareHardwareIdentity$lambda$41((JSONObject) obj6, (EncryptedCloudSessionStore) obj5, (String) obj4, (String) obj3, (String) obj2, (KeyPair) obj);
            case 3:
                AppState appState = (AppState) obj6;
                ul1 ul1Var = (ul1) obj2;
                ey1 ey1Var = (ey1) obj4;
                ey1 ey1Var2 = (ey1) obj3;
                lr2 lr2Var = (lr2) obj;
                lr2Var.getClass();
                ((ey1) obj5).setValue(lr2Var);
                lr2Var.g();
                lr2Var.l(appState.getMapType());
                Double dR = r13.R(appState.getLatitudeInput());
                double dDoubleValue = dR != null ? dR.doubleValue() : 39.9042d;
                Double dR2 = r13.R(appState.getLongitudeInput());
                lr2Var.i(dDoubleValue, dR2 != null ? dR2.doubleValue() : 116.4074d, Float.valueOf(15.0f));
                lr2Var.m = new el1(ul1Var, ey1Var, ey1Var2, 0);
                lr2Var.n = new el1(ul1Var, ey1Var, ey1Var2, c == true ? 1 : 0);
                return mf3Var;
            case 4:
                dw1 dw1Var = (dw1) obj6;
                we2 we2Var = (we2) obj5;
                te2 te2Var = (te2) obj4;
                wo2 wo2Var = (wo2) obj3;
                se2 se2Var = (se2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                zv1 zv1VarG = dw1.g(dw1Var.g);
                if (zv1VarG != null) {
                    d31 d31Var = dw1Var.e;
                    long j = zv1VarG.b;
                    long j2 = zv1VarG.a;
                    ((ai3) d31Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((ai3) d31Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    zv1 zv1VarA = ((zv1) we2Var.e).a(zv1VarG);
                    we2Var.e = zv1VarA;
                    float fI = wo2Var.i(wo2Var.e(zv1VarA.a));
                    te2Var.e = fI;
                    se2Var.e = !wc0.Q(fI - fFloatValue);
                }
                return Boolean.valueOf(zv1VarG != null);
            case Logger.WARN /* 5 */:
                ul1 ul1Var2 = (ul1) obj6;
                List list = (List) obj4;
                Context context = (Context) obj3;
                au0 au0Var = (au0) obj2;
                ey1 ey1Var3 = (ey1) obj5;
                ((l91) obj).getClass();
                if (!l13.k0((String) ey1Var3.getValue())) {
                    String str = (String) ey1Var3.getValue();
                    ul1Var2.getClass();
                    str.getClass();
                    list.getClass();
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var2), Dispatchers.getIO(), null, new m(ul1Var2, str, list, null, 17), 2, null);
                    Toast.makeText(context, context.getString(2131624942), 0).show();
                    au0Var.invoke();
                }
                return mf3Var;
            default:
                e12 e12Var = (e12) obj5;
                f83 f83Var = (f83) obj4;
                me1 me1Var = (me1) obj3;
                st stVar = (st) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.c();
                xv xvVar = jb1Var.e;
                float fG = ((m80) obj6).c.g();
                if (fG == 0.0f) {
                    return mf3Var;
                }
                long j3 = f83Var.b;
                int i3 = f93.c;
                int iR = e12Var.r((int) (j3 >> 32));
                y83 y83VarD = me1Var.d();
                pe2 pe2VarC = y83VarD != null ? y83VarD.a.c(iR) : new pe2(0.0f, 0.0f, 0.0f, 0.0f);
                float fFloor = (float) Math.floor(jb1Var.R(2.0f));
                if (fFloor < 1.0f) {
                    fFloor = 1.0f;
                }
                float f = fFloor / 2.0f;
                float f2 = pe2VarC.a + f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32)) - f;
                if (f2 > fIntBitsToFloat) {
                    f2 = fIntBitsToFloat;
                }
                if (f2 >= f) {
                    f = f2;
                }
                float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(pe2VarC.b)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(pe2VarC.d)) & 4294967295L);
                vv vvVar = xvVar.e.c;
                je jeVarN = xvVar.h;
                if (jeVarN == null) {
                    jeVarN = xq1.n();
                    jeVarN.o(1);
                    xvVar.h = jeVarN;
                }
                Paint paint = (Paint) jeVarN.c;
                if (stVar != null) {
                    stVar.a(fG, xvVar.a(), jeVarN);
                } else if (paint.getAlpha() / 255.0f != fG) {
                    jeVarN.e(fG);
                }
                if (!o51.f((rr) jeVarN.e, null)) {
                    jeVarN.h(null);
                }
                if (jeVarN.b != 3) {
                    jeVarN.f(3);
                }
                if (paint.getStrokeWidth() != fFloor) {
                    jeVarN.n(fFloor);
                }
                if (paint.getStrokeMiter() != 4.0f) {
                    paint.setStrokeMiter(4.0f);
                }
                if (jeVarN.b() == 0) {
                    i = 0;
                } else {
                    i = 0;
                    jeVarN.l(0);
                }
                if (jeVarN.c() != 0) {
                    jeVarN.m(i);
                }
                if (!o51.f(null, null)) {
                    jeVarN.j(null);
                }
                if (!paint.isFilterBitmap()) {
                    jeVarN.i(1);
                }
                vvVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, jeVarN);
                return mf3Var;
        }
    }

    public /* synthetic */ e5(AppState appState, ey1 ey1Var, ul1 ul1Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.e = 3;
        this.f = appState;
        this.g = ey1Var;
        this.j = ul1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
    }

    public /* synthetic */ e5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }
}
