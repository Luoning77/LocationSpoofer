package defpackage;

import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f4 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ f4(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ey1Var.setValue(l13.B0(60, str2));
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                ey1Var.setValue(l13.B0(32, str3));
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str4));
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str5));
                break;
            case Logger.WARN /* 5 */:
                String str6 = (String) obj;
                str6.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str6));
                break;
            case Logger.ERROR /* 6 */:
                String str7 = (String) obj;
                str7.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str7));
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                String str8 = (String) obj;
                str8.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str8));
                break;
            case 8:
                String str9 = (String) obj;
                str9.getClass();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str9));
                break;
            case mc0.b /* 9 */:
                String str10 = (String) obj;
                str10.getClass();
                ey1Var.setValue(str10);
                break;
            case mc0.c /* 10 */:
                ey1Var.setValue((pa1) obj);
                break;
            case 11:
                String str11 = (String) obj;
                str11.getClass();
                ey1Var.setValue(str11);
                break;
            case mc0.d /* 12 */:
                ey1Var.setValue((pa1) obj);
                break;
            case 13:
                r53 r53Var = (r53) obj;
                ey1Var.setValue(r53Var.c ? r53Var.b : r53Var.a);
                break;
            case 14:
                List list = (List) obj;
                if (ey1Var != null) {
                    ey1Var.setValue(list);
                }
                break;
            case a83.e /* 15 */:
                String str12 = (String) obj;
                str12.getClass();
                ey1Var.setValue(str12);
                break;
            case 16:
                String str13 = (String) obj;
                str13.getClass();
                ey1Var.setValue(str13);
                break;
            case 17:
                String str14 = (String) obj;
                str14.getClass();
                ey1Var.setValue(str14);
                break;
            case 18:
                String str15 = (String) obj;
                str15.getClass();
                ey1Var.setValue(str15);
                break;
            case 19:
                String str16 = (String) obj;
                str16.getClass();
                String upperCase = str16.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                StringBuilder sb = new StringBuilder();
                int length = upperCase.length();
                while (i2 < length) {
                    char cCharAt = upperCase.charAt(i2);
                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-') {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                ey1Var.setValue(l13.B0(12, sb.toString()));
                break;
            case 20:
                String str17 = (String) obj;
                str17.getClass();
                ey1Var.setValue(str17);
                break;
            case 21:
                String str18 = (String) obj;
                str18.getClass();
                ey1Var.setValue(str18);
                break;
            case 22:
                Float f = (Float) obj;
                f.getClass();
                ((lu0) ey1Var.getValue()).invoke(f);
                break;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ey1Var.setValue(bool);
                break;
            case 24:
                String str19 = (String) obj;
                str19.getClass();
                ey1Var.setValue(str19);
                break;
            case 25:
                String str20 = (String) obj;
                str20.getClass();
                String upperCase2 = str20.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                ey1Var.setValue(upperCase2);
                break;
            case 26:
                String str21 = (String) obj;
                str21.getClass();
                ey1Var.setValue(str21);
                break;
            case 27:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ey1Var.setValue(bool2);
                break;
            case 28:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ey1Var.setValue(bool3);
                break;
            default:
                String str22 = (String) obj;
                str22.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str22.length();
                while (i2 < length2) {
                    char cCharAt2 = str22.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i2++;
                }
                ey1Var.setValue(sb2.toString());
                break;
        }
        return mf3Var;
    }
}
