package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ kf(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return o51.m(((ec2) obj2).a, ((ec2) obj).a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return o51.m(((x51) obj).b, ((x51) obj2).b);
            case 3:
                k41 k41Var = (k41) obj;
                k41 k41Var2 = (k41) obj2;
                return (k41Var.f - k41Var.e) - (k41Var2.f - k41Var2.e);
            case 4:
                hb1 hb1Var = (hb1) obj;
                hb1 hb1Var2 = (hb1) obj2;
                float f = hb1Var.L.p.I;
                float f2 = hb1Var2.L.p.I;
                return f == f2 ? o51.m(hb1Var.v(), hb1Var2.v()) : Float.compare(f, f2);
            default:
                return o51.m(((rd1) obj).a, ((rd1) obj2).a);
        }
    }
}
