package defpackage;

import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class di0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ di0(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Object objD0;
        int i = this.e;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                ey1Var.setValue(sb.toString());
                return mf3Var;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str2.length();
                while (i2 < length2) {
                    char cCharAt2 = str2.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i2++;
                }
                ey1Var.setValue(sb2.toString());
                return mf3Var;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str3.length();
                while (i2 < length3) {
                    char cCharAt3 = str3.charAt(i2);
                    if (Character.isDigit(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                    i2++;
                }
                ey1Var.setValue(sb3.toString());
                return mf3Var;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                StringBuilder sb4 = new StringBuilder();
                int length4 = str4.length();
                while (i2 < length4) {
                    char cCharAt4 = str4.charAt(i2);
                    if (Character.isDigit(cCharAt4)) {
                        sb4.append(cCharAt4);
                    }
                    i2++;
                }
                ey1Var.setValue(sb4.toString());
                return mf3Var;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                ey1Var.setValue(str5);
                return mf3Var;
            case Logger.WARN /* 5 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ey1Var.setValue(bool);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ey1Var.setValue(bool2);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                String str6 = (String) obj;
                str6.getClass();
                ey1Var.setValue(str6);
                return mf3Var;
            case 8:
                String str7 = (String) obj;
                str7.getClass();
                String upperCase = str7.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ey1Var.setValue(upperCase);
                return mf3Var;
            case mc0.b /* 9 */:
                ImportExportCounts importExportCounts = (ImportExportCounts) obj;
                importExportCounts.getClass();
                ey1Var.setValue(importExportCounts);
                return mf3Var;
            case mc0.c /* 10 */:
                ((xb0) obj).getClass();
                return new h41((((long) xq1.P(Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) xq1.P(Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a >> 32)))) << 32));
            case 11:
                String str8 = (String) obj;
                str8.getClass();
                ey1Var.setValue(str8);
                return mf3Var;
            case mc0.d /* 12 */:
                ey1Var.setValue(ImportExportSelection.copy$default((ImportExportSelection) ey1Var.getValue(), ((Boolean) obj).booleanValue(), false, false, false, false, 30, null));
                return mf3Var;
            case 13:
                ey1Var.setValue(ImportExportSelection.copy$default((ImportExportSelection) ey1Var.getValue(), false, ((Boolean) obj).booleanValue(), false, false, false, 29, null));
                return mf3Var;
            case 14:
                ey1Var.setValue(ImportExportSelection.copy$default((ImportExportSelection) ey1Var.getValue(), false, false, ((Boolean) obj).booleanValue(), false, false, 27, null));
                return mf3Var;
            case a83.e /* 15 */:
                ey1Var.setValue(ImportExportSelection.copy$default((ImportExportSelection) ey1Var.getValue(), false, false, false, ((Boolean) obj).booleanValue(), false, 23, null));
                return mf3Var;
            case 16:
                ey1Var.setValue(ImportExportSelection.copy$default((ImportExportSelection) ey1Var.getValue(), false, false, false, false, ((Boolean) obj).booleanValue(), 15, null));
                return mf3Var;
            case 17:
                jb1 jb1Var = (jb1) obj;
                jb1Var.getClass();
                ((lu0) ey1Var.getValue()).invoke(jb1Var);
                return mf3Var;
            case 18:
                String str9 = (String) obj;
                str9.getClass();
                ey1Var.setValue(str9);
                return mf3Var;
            case 19:
                ((ed0) obj).getClass();
                return new gj1(ey1Var, 0);
            case 20:
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                ey1Var.setValue(wc0.F(pa1Var).d0(pa1Var, true));
                return mf3Var;
            case 21:
                mi1 mi1Var = (mi1) obj;
                mi1Var.getClass();
                ey1Var.setValue(mi1Var);
                return mf3Var;
            case 22:
                pa1 pa1Var2 = (pa1) obj;
                pa1Var2.getClass();
                ey1Var.setValue(wc0.F(pa1Var2).d0(pa1Var2, true));
                return mf3Var;
            case 23:
                ml1 ml1Var = (ml1) obj;
                ml1Var.getClass();
                List list = (List) ey1Var.getValue();
                list.getClass();
                if (ml1Var == ml1.e) {
                    objD0 = uj0.e;
                } else {
                    int iIndexOf = list.indexOf(ml1Var);
                    objD0 = iIndexOf >= 0 ? zy.D0(list, iIndexOf + 1) : zy.w0(list, ml1Var);
                }
                ey1Var.setValue(objD0);
                return mf3Var;
            case 24:
                lr2 lr2Var = (lr2) obj;
                lr2Var.getClass();
                ey1Var.setValue(lr2Var);
                lr2Var.g();
                return mf3Var;
            case 25:
                String str10 = (String) obj;
                str10.getClass();
                ey1Var.setValue(str10);
                return mf3Var;
            case 26:
                String str11 = (String) obj;
                str11.getClass();
                ey1Var.setValue(str11);
                return mf3Var;
            case 27:
                String str12 = (String) obj;
                str12.getClass();
                ey1Var.setValue(str12);
                return mf3Var;
            case 28:
                ey1Var.setValue((String) obj);
                return mf3Var;
            default:
                String str13 = (String) obj;
                str13.getClass();
                ey1Var.setValue(str13);
                return mf3Var;
        }
    }
}
