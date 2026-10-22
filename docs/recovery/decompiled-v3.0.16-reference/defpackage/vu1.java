package defpackage;

import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vu1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ vu1(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue((String) obj);
                return mf3Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                ey1Var.setValue(str);
                return mf3Var;
            case 2:
                ey1Var.setValue((String) obj);
                return mf3Var;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ey1Var.setValue(str2);
                return mf3Var;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                ey1Var.setValue(str3);
                return mf3Var;
            case Logger.WARN /* 5 */:
                String str4 = (String) obj;
                str4.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str4));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                String str5 = (String) obj;
                str5.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str5));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ey1Var.setValue((pa1) obj);
                return mf3Var;
            case 8:
                ((ed0) obj).getClass();
                return new gj1(ey1Var, 1);
            case mc0.b /* 9 */:
                String str6 = (String) obj;
                str6.getClass();
                ey1Var.setValue(str6);
                return mf3Var;
            case mc0.c /* 10 */:
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                ey1Var.setValue(wc0.F(pa1Var).d0(pa1Var, true));
                return mf3Var;
            case 11:
                String str7 = (String) obj;
                str7.getClass();
                ey1Var.setValue(str7);
                return mf3Var;
            case mc0.d /* 12 */:
                pa1 pa1Var2 = (pa1) obj;
                pa1Var2.getClass();
                ey1Var.setValue(wc0.F(pa1Var2).d0(pa1Var2, true));
                return mf3Var;
            case 13:
                String str8 = (String) obj;
                str8.getClass();
                ey1Var.setValue(str8);
                return mf3Var;
            case 14:
                String str9 = (String) obj;
                str9.getClass();
                ey1Var.setValue(str9);
                return mf3Var;
            case a83.e /* 15 */:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((lu0) ey1Var.getValue()).invoke(f)).floatValue());
            case 16:
                ey1Var.setValue((xp2) obj);
                return mf3Var;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ey1Var.setValue(bool);
                return mf3Var;
            case 18:
                lr2 lr2Var = (lr2) obj;
                lr2Var.getClass();
                ((lu0) ey1Var.getValue()).invoke(lr2Var);
                return mf3Var;
            case 19:
                String str10 = (String) obj;
                str10.getClass();
                ey1Var.setValue(str10);
                return mf3Var;
            case 20:
                ((lu0) ey1Var.getValue()).invoke((c12) obj);
                return mf3Var;
            default:
                GithubRelease githubRelease = (GithubRelease) obj;
                githubRelease.getClass();
                ey1Var.setValue(Integer.valueOf(githubRelease.getVersionCode()));
                return mf3Var;
        }
    }
}
