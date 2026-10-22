package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rp0 implements op0 {
    public final db a;
    public final db b;
    public final mp0 d;
    public mx1 f;
    public dq0 h;
    public final dq0 c = new dq0(2, null, 14);
    public final pp0 e = new pp0(this);
    public final sx1 g = new sx1(1);

    public rp0(db dbVar, db dbVar2) {
        this.a = dbVar;
        this.b = dbVar2;
        this.d = new mp0(this, dbVar2);
    }

    public final boolean b(boolean z) {
        tz1 tz1Var;
        if (g() != null) {
            dq0 dq0VarG = g();
            j(null);
            if (dq0VarG != null) {
                zp0 zp0Var = zp0.e;
                zp0 zp0Var2 = zp0.g;
                dq0VarG.n1(zp0Var, zp0Var2);
                if (!dq0VarG.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1 cv1Var = dq0VarG.e.i;
                hb1 hb1VarO = xp1.O(dq0VarG);
                while (hb1VarO != null) {
                    if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (cv1Var != null) {
                            if ((cv1Var.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                cv1 cv1VarJ = cv1Var;
                                gy1 gy1Var = null;
                                while (cv1VarJ != null) {
                                    if (cv1VarJ instanceof dq0) {
                                        ((dq0) cv1VarJ).n1(zp0.f, zp0Var2);
                                    } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                        int i = 0;
                                        for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                            if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    cv1VarJ = cv1Var2;
                                                } else {
                                                    if (gy1Var == null) {
                                                        gy1Var = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ != null) {
                                                        gy1Var.b(cv1VarJ);
                                                        cv1VarJ = null;
                                                    }
                                                    gy1Var.b(cv1Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    cv1VarJ = xp1.J(gy1Var);
                                }
                            }
                            cv1Var = cv1Var.i;
                        }
                    }
                    hb1VarO = hb1VarO.u();
                    cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = ld0.F(this.c, i).ordinal()) == 0) {
            b(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                b81.d();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        db dbVar = this.a;
        if (dbVar.isFocused() || dbVar.hasFocus()) {
            dbVar.clearFocus();
        } else if (dbVar.hasFocus()) {
            View viewFindFocus = dbVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            dbVar.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0151 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x015f A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0158 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0143 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[ADDED_TO_REGION, LOOP:12: B:39:0x0076->B:67:0x00c2, LOOP_START, PHI: r6
      0x0076: PHI (r6v27 cv1) = (r6v22 cv1), (r6v28 cv1) binds: [B:38:0x0074, B:67:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc A[ADDED_TO_REGION, LOOP:16: B:85:0x00fc->B:113:0x0148, LOOP_START, PHI: r12
      0x00fc: PHI (r12v13 cv1) = (r12v8 cv1), (r12v14 cv1) binds: [B:84:0x00fa, B:113:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010d A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0113 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [gy1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [gy1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v24, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v28, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v29, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v33, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [gy1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    public final boolean e(KeyEvent keyEvent, au0 au0Var) {
        cv1 cv1Var;
        hb1 hb1VarO;
        kb0 kb0Var;
        kb0 kb0Var2;
        cv1 cv1Var2;
        tz1 tz1Var;
        cv1 cv1VarJ;
        gy1 gy1Var;
        cv1 cv1Var3;
        hb1 hb1VarO2;
        kb0 kb0Var3;
        kb0 kb0Var4;
        tz1 tz1Var2;
        gy1 gy1Var2;
        cv1 cv1VarJ2;
        int size;
        tz1 tz1Var3;
        boolean z;
        dq0 dq0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!k(keyEvent)) {
                Trace.endSection();
                return false;
            }
            dq0 dq0VarP = vd0.p(dq0Var);
            if (dq0VarP != null) {
                if (!dq0VarP.e.r) {
                    p21.c("visitLocalDescendants called on an unattached node");
                }
                cv1 cv1Var4 = dq0VarP.e;
                if ((cv1Var4.h & 9216) != 0) {
                    cv1Var2 = null;
                    for (cv1 cv1Var5 = cv1Var4.j; cv1Var5 != null; cv1Var5 = cv1Var5.j) {
                        int i = cv1Var5.g;
                        if ((i & 9216) != 0) {
                            if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                break;
                            }
                            cv1Var2 = cv1Var5;
                        }
                    }
                } else {
                    cv1Var2 = null;
                }
                if (cv1Var2 == null) {
                    if (dq0VarP == null) {
                        if (!dq0Var.e.r) {
                            p21.c("visitAncestors called on an unattached node");
                        }
                        cv1Var = dq0Var.e.i;
                        hb1VarO = xp1.O(dq0Var);
                        loop15: while (true) {
                            if (hb1VarO != null) {
                                kb0Var = null;
                                break;
                            }
                            if ((hb1VarO.K.f.h & 8192) != 0) {
                                while (cv1Var != null) {
                                    if ((cv1Var.g & 8192) != 0) {
                                        cv1VarJ = cv1Var;
                                        gy1Var = null;
                                        while (cv1VarJ != null) {
                                            if (cv1VarJ instanceof i91) {
                                                kb0Var = cv1VarJ;
                                                break loop15;
                                            }
                                            if ((cv1VarJ.g & 8192) == 0) {
                                            }
                                            cv1VarJ = xp1.J(gy1Var);
                                        }
                                    }
                                    cv1Var = cv1Var.i;
                                }
                            }
                            hb1VarO = hb1VarO.u();
                            if (hb1VarO != null) {
                            }
                        }
                        kb0Var2 = (i91) kb0Var;
                        if (kb0Var2 != null) {
                            cv1Var2 = ((cv1) kb0Var2).e;
                        } else {
                            cv1Var2 = null;
                        }
                    } else {
                        if (!dq0VarP.e.r) {
                            p21.c("visitAncestors called on an unattached node");
                        }
                        cv1Var3 = dq0VarP.e;
                        hb1VarO2 = xp1.O(dq0VarP);
                        loop11: while (true) {
                            if (hb1VarO2 != null) {
                                kb0Var3 = null;
                                break;
                            }
                            if ((hb1VarO2.K.f.h & 8192) != 0) {
                                while (cv1Var3 != null) {
                                    if ((cv1Var3.g & 8192) != 0) {
                                        gy1Var2 = null;
                                        cv1VarJ2 = cv1Var3;
                                        while (cv1VarJ2 != null) {
                                            if (cv1VarJ2 instanceof i91) {
                                                kb0Var3 = cv1VarJ2;
                                                break loop11;
                                            }
                                            if ((cv1VarJ2.g & 8192) == 0) {
                                            }
                                            cv1VarJ2 = xp1.J(gy1Var2);
                                        }
                                    }
                                    cv1Var3 = cv1Var3.i;
                                }
                            }
                            hb1VarO2 = hb1VarO2.u();
                            if (hb1VarO2 != null) {
                            }
                        }
                        kb0Var4 = (i91) kb0Var3;
                        if (kb0Var4 != null) {
                            cv1Var2 = ((cv1) kb0Var4).e;
                        } else {
                            if (!dq0Var.e.r) {
                                p21.c("visitAncestors called on an unattached node");
                            }
                            cv1Var = dq0Var.e.i;
                            hb1VarO = xp1.O(dq0Var);
                            loop15: while (true) {
                                if (hb1VarO != null) {
                                    kb0Var = null;
                                    break;
                                }
                                if ((hb1VarO.K.f.h & 8192) != 0) {
                                    while (cv1Var != null) {
                                        if ((cv1Var.g & 8192) != 0) {
                                            cv1VarJ = cv1Var;
                                            gy1Var = null;
                                            while (cv1VarJ != null) {
                                                if (cv1VarJ instanceof i91) {
                                                    kb0Var = cv1VarJ;
                                                    break loop15;
                                                }
                                                if ((cv1VarJ.g & 8192) == 0) {
                                                }
                                                cv1VarJ = xp1.J(gy1Var);
                                            }
                                        }
                                        cv1Var = cv1Var.i;
                                    }
                                }
                                hb1VarO = hb1VarO.u();
                                if (hb1VarO != null) {
                                }
                            }
                            kb0Var2 = (i91) kb0Var;
                            if (kb0Var2 != null) {
                                cv1Var2 = ((cv1) kb0Var2).e;
                            } else {
                                cv1Var2 = null;
                            }
                        }
                    }
                }
            } else if (dq0VarP == null) {
                if (!dq0Var.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1Var = dq0Var.e.i;
                hb1VarO = xp1.O(dq0Var);
                loop15: while (true) {
                    if (hb1VarO != null) {
                        kb0Var = null;
                        break;
                    }
                    if ((hb1VarO.K.f.h & 8192) != 0) {
                        while (cv1Var != null) {
                            if ((cv1Var.g & 8192) != 0) {
                                cv1VarJ = cv1Var;
                                gy1Var = null;
                                while (cv1VarJ != null) {
                                    if (cv1VarJ instanceof i91) {
                                        kb0Var = cv1VarJ;
                                        break loop15;
                                    }
                                    if ((cv1VarJ.g & 8192) == 0 && (cv1VarJ instanceof lb0)) {
                                        cv1 cv1Var6 = ((lb0) cv1VarJ).t;
                                        int i2 = 0;
                                        while (cv1Var6 != null) {
                                            if ((cv1Var6.g & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cv1VarJ = cv1VarJ;
                                                    gy1Var = gy1Var;
                                                    gy1Var = gy1Var;
                                                    cv1VarJ = cv1Var6;
                                                } else {
                                                    if (gy1Var == null) {
                                                        gy1Var = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ != null) {
                                                        gy1Var.b(cv1VarJ);
                                                        cv1VarJ = null;
                                                    }
                                                    gy1Var.b(cv1Var6);
                                                }
                                            } else {
                                                cv1VarJ = cv1VarJ;
                                                gy1Var = gy1Var;
                                            }
                                            cv1Var6 = cv1Var6.j;
                                            cv1VarJ = cv1VarJ;
                                            gy1Var = gy1Var;
                                        }
                                        if (i2 == 1) {
                                            cv1VarJ = cv1VarJ;
                                            gy1Var = gy1Var;
                                        } else {
                                            cv1VarJ = cv1VarJ;
                                            gy1Var = gy1Var;
                                        }
                                    }
                                    cv1VarJ = xp1.J(gy1Var);
                                }
                            }
                            cv1Var = cv1Var.i;
                        }
                    }
                    hb1VarO = hb1VarO.u();
                    cv1Var = (hb1VarO != null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
                }
                kb0Var2 = (i91) kb0Var;
                if (kb0Var2 != null) {
                    cv1Var2 = ((cv1) kb0Var2).e;
                } else {
                    cv1Var2 = null;
                }
            } else {
                if (!dq0VarP.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1Var3 = dq0VarP.e;
                hb1VarO2 = xp1.O(dq0VarP);
                loop11: while (true) {
                    if (hb1VarO2 != null) {
                        kb0Var3 = null;
                        break;
                    }
                    if ((hb1VarO2.K.f.h & 8192) != 0) {
                        while (cv1Var3 != null) {
                            if ((cv1Var3.g & 8192) != 0) {
                                gy1Var2 = null;
                                cv1VarJ2 = cv1Var3;
                                while (cv1VarJ2 != null) {
                                    if (cv1VarJ2 instanceof i91) {
                                        kb0Var3 = cv1VarJ2;
                                        break loop11;
                                    }
                                    if ((cv1VarJ2.g & 8192) == 0 && (cv1VarJ2 instanceof lb0)) {
                                        cv1 cv1Var7 = ((lb0) cv1VarJ2).t;
                                        int i3 = 0;
                                        while (cv1Var7 != null) {
                                            if ((cv1Var7.g & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cv1VarJ2 = cv1VarJ2;
                                                    gy1Var2 = gy1Var2;
                                                    gy1Var2 = gy1Var2;
                                                    cv1VarJ2 = cv1Var7;
                                                } else {
                                                    if (gy1Var2 == null) {
                                                        gy1Var2 = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ2 != null) {
                                                        gy1Var2.b(cv1VarJ2);
                                                        cv1VarJ2 = null;
                                                    }
                                                    gy1Var2.b(cv1Var7);
                                                }
                                            } else {
                                                cv1VarJ2 = cv1VarJ2;
                                                gy1Var2 = gy1Var2;
                                            }
                                            cv1Var7 = cv1Var7.j;
                                            cv1VarJ2 = cv1VarJ2;
                                            gy1Var2 = gy1Var2;
                                        }
                                        if (i3 == 1) {
                                            cv1VarJ2 = cv1VarJ2;
                                            gy1Var2 = gy1Var2;
                                        } else {
                                            cv1VarJ2 = cv1VarJ2;
                                            gy1Var2 = gy1Var2;
                                        }
                                    }
                                    cv1VarJ2 = xp1.J(gy1Var2);
                                }
                            }
                            cv1Var3 = cv1Var3.i;
                        }
                    }
                    hb1VarO2 = hb1VarO2.u();
                    cv1Var3 = (hb1VarO2 != null || (tz1Var2 = hb1VarO2.K) == null) ? null : tz1Var2.e;
                }
                kb0Var4 = (i91) kb0Var3;
                if (kb0Var4 != null) {
                    cv1Var2 = ((cv1) kb0Var4).e;
                } else {
                    if (!dq0Var.e.r) {
                        p21.c("visitAncestors called on an unattached node");
                    }
                    cv1Var = dq0Var.e.i;
                    hb1VarO = xp1.O(dq0Var);
                    loop15: while (true) {
                        if (hb1VarO != null) {
                            kb0Var = null;
                            break;
                        }
                        if ((hb1VarO.K.f.h & 8192) != 0) {
                            while (cv1Var != null) {
                                if ((cv1Var.g & 8192) != 0) {
                                    cv1VarJ = cv1Var;
                                    gy1Var = null;
                                    while (cv1VarJ != null) {
                                        if (cv1VarJ instanceof i91) {
                                            kb0Var = cv1VarJ;
                                            break loop15;
                                        }
                                        if ((cv1VarJ.g & 8192) == 0) {
                                        }
                                        cv1VarJ = xp1.J(gy1Var);
                                    }
                                }
                                cv1Var = cv1Var.i;
                            }
                        }
                        hb1VarO = hb1VarO.u();
                        if (hb1VarO != null) {
                        }
                    }
                    kb0Var2 = (i91) kb0Var;
                    if (kb0Var2 != null) {
                        cv1Var2 = ((cv1) kb0Var2).e;
                    } else {
                        cv1Var2 = null;
                    }
                }
            }
            if (cv1Var2 != null) {
                if (!cv1Var2.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1 cv1Var8 = cv1Var2.e.i;
                hb1 hb1VarO3 = xp1.O(cv1Var2);
                ArrayList arrayList = null;
                while (hb1VarO3 != null) {
                    if ((hb1VarO3.K.f.h & 8192) != 0) {
                        while (cv1Var8 != null) {
                            if ((cv1Var8.g & 8192) != 0) {
                                cv1 cv1VarJ3 = cv1Var8;
                                gy1 gy1Var3 = null;
                                while (cv1VarJ3 != null) {
                                    if (cv1VarJ3 instanceof i91) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cv1VarJ3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cv1VarJ3.g & 8192) != 0 && (cv1VarJ3 instanceof lb0)) {
                                        int i4 = 0;
                                        for (cv1 cv1Var9 = ((lb0) cv1VarJ3).t; cv1Var9 != null; cv1Var9 = cv1Var9.j) {
                                            if ((cv1Var9.g & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    cv1VarJ3 = cv1Var9;
                                                } else {
                                                    if (gy1Var3 == null) {
                                                        gy1Var3 = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ3 != null) {
                                                        gy1Var3.b(cv1VarJ3);
                                                        cv1VarJ3 = null;
                                                    }
                                                    gy1Var3.b(cv1Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    cv1VarJ3 = xp1.J(gy1Var3);
                                }
                            }
                            cv1Var8 = cv1Var8.i;
                        }
                    }
                    hb1VarO3 = hb1VarO3.u();
                    cv1Var8 = (hb1VarO3 == null || (tz1Var3 = hb1VarO3.K) == null) ? null : tz1Var3.e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((i91) arrayList.get(size)).C(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? J = cv1Var2.e;
                ?? gy1Var4 = 0;
                while (J != 0) {
                    if (J instanceof i91) {
                        if (((i91) J).C(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((J.g & 8192) != 0 && (J instanceof lb0)) {
                        cv1 cv1Var10 = ((lb0) J).t;
                        int i6 = 0;
                        while (cv1Var10 != null) {
                            if ((cv1Var10.g & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    gy1Var4 = gy1Var4;
                                    J = J;
                                    gy1Var4 = gy1Var4;
                                    J = cv1Var10;
                                } else {
                                    if (gy1Var4 == 0) {
                                        gy1Var4 = new gy1(new cv1[16]);
                                    }
                                    if (J != 0) {
                                        gy1Var4.b(J);
                                        J = 0;
                                    }
                                    gy1Var4.b(cv1Var10);
                                }
                            } else {
                                gy1Var4 = gy1Var4;
                                J = J;
                            }
                            cv1Var10 = cv1Var10.j;
                            gy1Var4 = gy1Var4;
                            J = J;
                        }
                        if (i6 == 1) {
                            gy1Var4 = gy1Var4;
                            J = J;
                        } else {
                            gy1Var4 = gy1Var4;
                            J = J;
                        }
                    }
                    J = xp1.J(gy1Var4);
                }
                if (((Boolean) au0Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? J2 = cv1Var2.e;
                ?? gy1Var5 = 0;
                while (J2 != 0) {
                    if (J2 instanceof i91) {
                        if (((i91) J2).s0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((J2.g & 8192) != 0 && (J2 instanceof lb0)) {
                        cv1 cv1Var11 = ((lb0) J2).t;
                        int i7 = 0;
                        while (cv1Var11 != null) {
                            if ((cv1Var11.g & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    J2 = J2;
                                    gy1Var5 = gy1Var5;
                                    gy1Var5 = gy1Var5;
                                    J2 = cv1Var11;
                                } else {
                                    if (gy1Var5 == 0) {
                                        gy1Var5 = new gy1(new cv1[16]);
                                    }
                                    if (J2 != 0) {
                                        gy1Var5.b(J2);
                                        J2 = 0;
                                    }
                                    gy1Var5.b(cv1Var11);
                                }
                            } else {
                                J2 = J2;
                                gy1Var5 = gy1Var5;
                            }
                            cv1Var11 = cv1Var11.j;
                            J2 = J2;
                            gy1Var5 = gy1Var5;
                        }
                        if (i7 == 1) {
                            J2 = J2;
                            gy1Var5 = gy1Var5;
                        } else {
                            J2 = J2;
                            gy1Var5 = gy1Var5;
                        }
                    }
                    J2 = xp1.J(gy1Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((i91) arrayList.get(i8)).s0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean f(int i, pe2 pe2Var, lu0 lu0Var) {
        boolean zM;
        dq0 dq0Var;
        tz1 tz1Var;
        dq0 dq0Var2 = this.c;
        dq0 dq0VarP = vd0.p(dq0Var2);
        int i2 = 4;
        db dbVar = this.b;
        boolean zBooleanValue = false;
        if (dq0VarP != null) {
            qa1 layoutDirection = dbVar.getLayoutDirection();
            tp0 tp0VarO1 = dq0VarP.o1();
            vp0 vp0Var = tp0VarO1.h;
            vp0 vp0Var2 = tp0VarO1.i;
            if (i == 1) {
                vp0Var = tp0VarO1.b;
            } else if (i == 2) {
                vp0Var = tp0VarO1.c;
            } else if (i == 5) {
                vp0Var = tp0VarO1.d;
            } else if (i == 6) {
                vp0Var = tp0VarO1.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        b81.d();
                        return null;
                    }
                    vp0Var = vp0Var2;
                }
                if (vp0Var == vp0.b) {
                    vp0Var = null;
                }
                if (vp0Var == null) {
                    vp0Var = tp0VarO1.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    vp0Var = vp0Var2;
                } else if (iOrdinal2 != 1) {
                    b81.d();
                    return null;
                }
                if (vp0Var == vp0.b) {
                    vp0Var = null;
                }
                if (vp0Var == null) {
                    vp0Var = tp0VarO1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    fo.n("invalid FocusDirection");
                    return null;
                }
                pv pvVar = new pv(i);
                rp0 rp0Var = (rp0) ((db) xp1.P(dq0VarP)).getFocusOwner();
                dq0 dq0VarG = rp0Var.g();
                if (i == 7) {
                    tp0VarO1.j.invoke(pvVar);
                } else {
                    tp0VarO1.k.invoke(pvVar);
                }
                vp0Var = pvVar.b ? vp0.c : dq0VarG != rp0Var.g() ? vp0.d : vp0.b;
            }
            vp0 vp0Var3 = vp0.c;
            if (!o51.f(vp0Var, vp0Var3)) {
                if (o51.f(vp0Var, vp0.d)) {
                    dq0 dq0VarP2 = vd0.p(dq0Var2);
                    if (dq0VarP2 != null) {
                        return (Boolean) lu0Var.invoke(dq0VarP2);
                    }
                } else {
                    vp0 vp0Var4 = vp0.b;
                    if (!o51.f(vp0Var, vp0Var4)) {
                        if (vp0Var == vp0Var4) {
                            fo.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (vp0Var == vp0Var3) {
                            fo.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        gy1 gy1Var = vp0Var.a;
                        int i3 = gy1Var.g;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = gy1Var.e;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                kb0 kb0Var = (xp0) objArr[i4];
                                if (!((cv1) kb0Var).e.r) {
                                    p21.c("visitChildren called on an unattached node");
                                }
                                gy1 gy1Var2 = new gy1(new cv1[16]);
                                cv1 cv1Var = ((cv1) kb0Var).e;
                                cv1 cv1Var2 = cv1Var.j;
                                if (cv1Var2 == null) {
                                    xp1.h(gy1Var2, cv1Var);
                                } else {
                                    gy1Var2.b(cv1Var2);
                                }
                                while (true) {
                                    int i5 = gy1Var2.g;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    cv1 cv1VarJ = (cv1) gy1Var2.k(i5 - 1);
                                    if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                                        xp1.h(gy1Var2, cv1VarJ);
                                    } else {
                                        while (cv1VarJ != null) {
                                            if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                gy1 gy1Var3 = null;
                                                while (cv1VarJ != null) {
                                                    if (cv1VarJ instanceof dq0) {
                                                        if (((Boolean) lu0Var.invoke((dq0) cv1VarJ)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                                        int i6 = 0;
                                                        for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                                            if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    cv1VarJ = cv1Var3;
                                                                } else {
                                                                    if (gy1Var3 == null) {
                                                                        gy1Var3 = new gy1(new cv1[16]);
                                                                    }
                                                                    if (cv1VarJ != null) {
                                                                        gy1Var3.b(cv1VarJ);
                                                                        cv1VarJ = null;
                                                                    }
                                                                    gy1Var3.b(cv1Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    cv1VarJ = xp1.J(gy1Var3);
                                                }
                                                break;
                                            }
                                            cv1VarJ = cv1VarJ.j;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        dq0VarP = null;
        qa1 layoutDirection2 = dbVar.getLayoutDirection();
        ah ahVar = new ah(dq0VarP, this, lu0Var, 7);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zM = mh0.E(dq0Var2, ahVar);
            } else {
                if (i != 2) {
                    fo.n("This function should only be used for 1-D focus search");
                    return null;
                }
                zM = mh0.m(dq0Var2, ahVar);
            }
            return Boolean.valueOf(zM);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return v83.q(i, ahVar, dq0Var2, pe2Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    b81.d();
                    return null;
                }
                i2 = 3;
            }
            dq0 dq0VarP3 = vd0.p(dq0Var2);
            if (dq0VarP3 != null) {
                return v83.q(i2, ahVar, dq0VarP3, pe2Var);
            }
            return null;
        }
        if (i != 8) {
            b81.v(ep0.a(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        dq0 dq0VarP4 = vd0.p(dq0Var2);
        if (dq0VarP4 == null) {
            dq0Var = null;
            break;
        }
        if (!dq0VarP4.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var4 = dq0VarP4.e.i;
        hb1 hb1VarO = xp1.O(dq0VarP4);
        loop5: while (true) {
            if (hb1VarO == null) {
                dq0Var = null;
                break;
            }
            if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (cv1Var4 != null) {
                    if ((cv1Var4.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        cv1 cv1VarJ2 = cv1Var4;
                        gy1 gy1Var4 = null;
                        while (cv1VarJ2 != null) {
                            if (cv1VarJ2 instanceof dq0) {
                                dq0 dq0Var3 = (dq0) cv1VarJ2;
                                if (dq0Var3.o1().a) {
                                    dq0Var = dq0Var3;
                                    break loop5;
                                }
                            } else if ((cv1VarJ2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ2 instanceof lb0)) {
                                int i7 = 0;
                                for (cv1 cv1Var5 = ((lb0) cv1VarJ2).t; cv1Var5 != null; cv1Var5 = cv1Var5.j) {
                                    if ((cv1Var5.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            cv1VarJ2 = cv1Var5;
                                        } else {
                                            if (gy1Var4 == null) {
                                                gy1Var4 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ2 != null) {
                                                gy1Var4.b(cv1VarJ2);
                                                cv1VarJ2 = null;
                                            }
                                            gy1Var4.b(cv1Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    cv1VarJ2 = xp1.J(gy1Var4);
                                }
                            }
                            cv1VarJ2 = xp1.J(gy1Var4);
                        }
                    }
                    cv1Var4 = cv1Var4.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var4 = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        if (dq0Var != null && dq0Var != dq0Var2) {
            zBooleanValue = ((Boolean) ahVar.invoke(dq0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final dq0 g() {
        dq0 dq0Var = this.h;
        if (dq0Var == null || !dq0Var.r) {
            return null;
        }
        return dq0Var;
    }

    public final boolean h(int i, boolean z) {
        dq0 dq0VarG = g();
        db dbVar = this.a;
        if (dq0VarG == null || !dq0VarG.s || !dbVar.t(i)) {
            we2 we2Var = new we2();
            we2Var.e = Boolean.FALSE;
            dq0 dq0VarG2 = g();
            Boolean boolF = f(i, dbVar.getEmbeddedViewFocusRect(), new qp0(i, we2Var));
            if (!o51.f(boolF, Boolean.TRUE) || dq0VarG2 == g()) {
                if (boolF != null && we2Var.e != null) {
                    if (!boolF.booleanValue() || !((Boolean) we2Var.e).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean boolF2 = f(i, null, new za(i, 3));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!c(i, false, false)) {
            return false;
        }
        Boolean boolF = f(i, null, new za(i, 2));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(dq0 dq0Var) {
        dq0 dq0Var2 = this.h;
        this.h = dq0Var;
        sx1 sx1Var = this.g;
        Object[] objArr = sx1Var.a;
        int i = sx1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((np0) objArr[i2]).a(dq0Var2, dq0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public final boolean k(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i;
        long jI = mh0.I(keyEvent);
        int iL = mh0.L(keyEvent);
        int i2 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i3 = 0;
        boolean z2 = true;
        if (iL != 2) {
            if (iL != 1) {
                return true;
            }
            mx1 mx1Var = this.f;
            if (mx1Var == null || !mx1Var.a(jI)) {
                return false;
            }
            mx1 mx1Var2 = this.f;
            if (mx1Var2 != null) {
                int iHashCode = Long.hashCode(jI) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int i5 = i4 & WorkQueueKt.MASK;
                int i6 = mx1Var2.c;
                int i7 = i4 >>> 7;
                loop5: while (true) {
                    int i8 = i7 & i6;
                    long[] jArr2 = mx1Var2.a;
                    int i9 = i8 >> 3;
                    int i10 = (i8 & 7) << 3;
                    long j3 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
                    long j4 = (((long) i5) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                        if (mx1Var2.b[iNumberOfTrailingZeros] == jI) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i3 += 8;
                    i7 = i8 + i3;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    mx1Var2.d--;
                    long[] jArr3 = mx1Var2.a;
                    int i11 = mx1Var2.c;
                    int i12 = iNumberOfTrailingZeros >> 3;
                    int i13 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i12] & (~(255 << i13))) | (254 << i13);
                    jArr3[i12] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i11) + (i11 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        mx1 mx1Var3 = this.f;
        if (mx1Var3 == null) {
            mx1Var3 = new mx1(3);
            this.f = mx1Var3;
        }
        mx1 mx1Var4 = mx1Var3;
        int iHashCode2 = Long.hashCode(jI) * (-862048943);
        int i14 = iHashCode2 ^ (iHashCode2 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & WorkQueueKt.MASK;
        int i17 = mx1Var4.c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr4 = mx1Var4.a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j7 = (jArr4[i20] >>> i21) | ((jArr4[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
            int i22 = i2;
            long j8 = i16;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i18 + (Long.numberOfTrailingZeros(j10) >> 3)) & i17;
                long j11 = j2;
                if (mx1Var4.b[iNumberOfTrailingZeros2] == jI) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = mx1Var4.b(i15);
                if (mx1Var4.e != 0 || ((mx1Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i23 = mx1Var4.c;
                    if (i23 <= 8 || Long.compareUnsigned(((long) mx1Var4.d) * 32, ((long) i23) * 25) > 0) {
                        z = true;
                        j = 128;
                        int iB2 = hn2.b(mx1Var4.c);
                        long[] jArr5 = mx1Var4.a;
                        long[] jArr6 = mx1Var4.b;
                        int i24 = mx1Var4.c;
                        mx1Var4.c(iB2);
                        long[] jArr7 = mx1Var4.a;
                        long[] jArr8 = mx1Var4.b;
                        int i25 = mx1Var4.c;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr5[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i26];
                                int iHashCode3 = Long.hashCode(j13) * i22;
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                jArr = jArr7;
                                int iB3 = mx1Var4.b(i27 >>> 7);
                                long j14 = i27 & WorkQueueKt.MASK;
                                int i28 = iB3 >> 3;
                                int i29 = (iB3 & 7) << 3;
                                long j15 = (jArr[i28] & (~(255 << i29))) | (j14 << i29);
                                jArr[i28] = j15;
                                jArr[(((iB3 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                                jArr8[iB3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i26++;
                            jArr7 = jArr;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                    } else {
                        long[] jArr9 = mx1Var4.a;
                        int i30 = mx1Var4.c;
                        long[] jArr10 = mx1Var4.b;
                        int i31 = (i30 + 7) >> 3;
                        int i32 = 0;
                        while (i32 < i31) {
                            long j16 = jArr9[i32] & (-9187201950435737472L);
                            jArr9[i32] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i32++;
                            c = c;
                            i30 = i30;
                        }
                        char c2 = c;
                        int i33 = i30;
                        j = 128;
                        int iW0 = yo.w0(jArr9);
                        int i34 = iW0 - 1;
                        long j17 = 72057594037927935L;
                        jArr9[i34] = (jArr9[i34] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iW0] = jArr9[0];
                        int i35 = i33;
                        int i36 = 0;
                        while (i36 != i35) {
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            long j18 = (jArr9[i37] >> i38) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i36]) * i22;
                                int i39 = iHashCode4 ^ (iHashCode4 << 16);
                                long j19 = j17;
                                int i40 = i39 >>> 7;
                                int iB4 = mx1Var4.b(i40);
                                int i41 = i40 & i35;
                                char c3 = c2;
                                if (((iB4 - i41) & i35) / 8 == ((i36 - i41) & i35) / 8) {
                                    jArr9[i37] = ((~(255 << i38)) & jArr9[i37]) | (((long) (i39 & WorkQueueKt.MASK)) << i38);
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36++;
                                } else {
                                    int i42 = iB4 >> 3;
                                    long j20 = jArr9[i42];
                                    int i43 = (iB4 & 7) << 3;
                                    if (((j20 >> i43) & 255) == 128) {
                                        int i44 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & WorkQueueKt.MASK)) << i43);
                                        jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (128 << i38);
                                        jArr10[iB4] = jArr10[i44];
                                        jArr10[i44] = j12;
                                        i = i44;
                                    } else {
                                        int i45 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & WorkQueueKt.MASK)) << i43);
                                        long j21 = jArr10[iB4];
                                        jArr10[iB4] = jArr10[i45];
                                        jArr10[i45] = j21;
                                        i = i45 - 1;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36 = i + 1;
                                    i35 = i35;
                                }
                                j17 = j19;
                                c2 = c3;
                                z2 = z2;
                            } else {
                                i36++;
                            }
                        }
                        z = z2;
                        mx1Var4.e = hn2.a(mx1Var4.c) - mx1Var4.d;
                    }
                    iB = mx1Var4.b(i15);
                }
                iNumberOfTrailingZeros2 = iB;
                mx1Var4.d++;
                int i46 = mx1Var4.e;
                long[] jArr11 = mx1Var4.a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                mx1Var4.e = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = mx1Var4.c;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i2 = i22;
            j2 = j12;
        }
        mx1Var4.b[iNumberOfTrailingZeros2] = jI;
        return z;
    }
}
