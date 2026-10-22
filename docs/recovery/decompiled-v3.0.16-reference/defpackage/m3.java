package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m3 implements lu0 {
    public static final m3 f = new m3(0);
    public static final m3 g = new m3(1);
    public static final m3 h = new m3(2);
    public static final m3 i = new m3(3);
    public final /* synthetic */ int e;

    public /* synthetic */ m3(int i2) {
        this.e = i2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                return xq1.u(str) + " " + ((Number) entry.getValue()).intValue();
            case 1:
                return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                return s13.X(s13.X(s13.X(s13.X(s13.X(str2, "(", "", false), ")", "", false), "（", "", false), "）", "", false), " ", "", false);
            default:
                if (o51.f(obj, Boolean.FALSE)) {
                    return new hz(hz.g);
                }
                obj.getClass();
                return new hz(xp1.c(((Integer) obj).intValue()));
        }
    }
}
