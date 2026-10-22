package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i73 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ i73(int i) {
        this.e = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        b93 b93VarA;
        uy2 uy2Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                m73 m73Var = (m73) obj;
                Integer numE = m73Var.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j = m73Var.f;
                int i2 = f93.c;
                return new sb0(((int) (j & 4294967295L)) - iIntValue, 0);
            case 1:
                m73 m73Var2 = (m73) obj;
                Integer numD = m73Var2.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j2 = m73Var2.f;
                int i3 = f93.c;
                return new sb0(0, iIntValue2 - ((int) (j2 & 4294967295L)));
            case 2:
                m73 m73Var3 = (m73) obj;
                Integer numC = m73Var3.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j3 = m73Var3.f;
                int i4 = f93.c;
                return new sb0(((int) (j3 & 4294967295L)) - iIntValue3, 0);
            case 3:
                m73 m73Var4 = (m73) obj;
                Integer numB = m73Var4.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j4 = m73Var4.f;
                int i5 = f93.c;
                return new sb0(0, iIntValue4 - ((int) (j4 & 4294967295L)));
            case 4:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                x32 x32Var = ((Boolean) obj2).booleanValue() ? x32.e : x32.f;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new r73(x32Var, ((Float) obj3).floatValue());
            case Logger.WARN /* 5 */:
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                cj cjVar = (cj) obj;
                Object obj4 = cjVar.a;
                if (!(obj4 instanceof bg1) || (b93VarA = ((bg1) obj4).a()) == null || (b93VarA.a == null && b93VarA.b == null && b93VarA.c == null && b93VarA.d == null)) {
                    return am1.d(cjVar);
                }
                Object obj5 = cjVar.a;
                obj5.getClass();
                b93 b93VarA2 = ((bg1) obj5).a();
                if (b93VarA2 == null || (uy2Var = b93VarA2.a) == null) {
                    uy2Var = new uy2(0L, 0L, (jr0) null, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65535);
                }
                return am1.d(cjVar, new cj(cjVar.b, cjVar.c, uy2Var));
            case 8:
                ((ss2) obj).a(os2.B, mf3Var);
                return mf3Var;
            case mc0.b /* 9 */:
                bl2 bl2Var = (bl2) obj;
                bl2Var.getClass();
                return Boolean.valueOf(bl2Var.R());
            case mc0.c /* 10 */:
                bl2 bl2Var2 = (bl2) obj;
                bl2Var2.getClass();
                lt2 lt2Var = new lt2();
                while (bl2Var2.R()) {
                    lt2Var.add(Integer.valueOf((int) bl2Var2.getLong(0)));
                }
                return mc0.l(lt2Var);
            case 11:
                return ((ZipEntry) obj).getName();
            case mc0.d /* 12 */:
                String str = (String) obj;
                str.getClass();
                Pattern patternCompile = Pattern.compile("lib/[^/]+/[^/]+\\.so");
                patternCompile.getClass();
                return Boolean.valueOf(patternCompile.matcher(str).matches());
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return (String) l13.u0(str2, new char[]{'/'}, 6).get(1);
            case 14:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case a83.e /* 15 */:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 16:
                return new ui(((Float) obj).floatValue());
            case 17:
                return new ui(((Integer) obj).intValue());
            case 18:
                return Integer.valueOf((int) ((ui) obj).a);
            case 19:
                return new ui(((td0) obj).e);
            case 20:
                return new td0(((ui) obj).a);
            case 21:
                wd0 wd0Var = (wd0) obj;
                return new vi(Float.intBitsToFloat((int) (wd0Var.a >> 32)), Float.intBitsToFloat((int) (wd0Var.a & 4294967295L)));
            case 22:
                vi viVar = (vi) obj;
                return new wd0((((long) Float.floatToRawIntBits(viVar.a)) << 32) | (((long) Float.floatToRawIntBits(viVar.b)) & 4294967295L));
            case 23:
                cw2 cw2Var = (cw2) obj;
                return new vi(Float.intBitsToFloat((int) (cw2Var.a >> 32)), Float.intBitsToFloat((int) (cw2Var.a & 4294967295L)));
            case 24:
                vi viVar2 = (vi) obj;
                return new cw2((((long) Float.floatToRawIntBits(viVar2.a)) << 32) | (((long) Float.floatToRawIntBits(viVar2.b)) & 4294967295L));
            case 25:
                c12 c12Var = (c12) obj;
                return new vi(Float.intBitsToFloat((int) (c12Var.a >> 32)), Float.intBitsToFloat((int) (c12Var.a & 4294967295L)));
            case 26:
                vi viVar3 = (vi) obj;
                return new c12((((long) Float.floatToRawIntBits(viVar3.a)) << 32) | (((long) Float.floatToRawIntBits(viVar3.b)) & 4294967295L));
            case 27:
                long j5 = ((h41) obj).a;
                return new vi((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 28:
                vi viVar4 = (vi) obj;
                return new h41((((long) Math.round(viVar4.a)) << 32) | (((long) Math.round(viVar4.b)) & 4294967295L));
            default:
                long j6 = ((p41) obj).a;
                return new vi((int) (j6 >> 32), (int) (j6 & 4294967295L));
        }
    }
}
