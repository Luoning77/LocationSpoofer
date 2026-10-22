package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.sync.SyncCategory;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jl1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jl1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x05df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x05e1 A[LOOP:3: B:213:0x05ab->B:223:0x05e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [ey1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [q60] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v52, types: [ow0] */
    /* JADX WARN: Type inference failed for: r2v86, types: [au2] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        xp2 xp2Var;
        b93 b93VarA;
        b93 b93VarA2;
        b93 b93VarA3;
        x83 x83Var;
        re reVarI;
        w83 w83Var;
        int i = 7;
        ?? r11 = 0;
        uy2VarC = null;
        uy2 uy2VarC = null;
        boolean zF = false;
        zF = false;
        zF = false;
        int i2 = 1;
        switch (this.e) {
            case 0:
                ul1 ul1Var = (ul1) this.f;
                ey1 ey1Var = (ey1) this.g;
                String str = (String) obj;
                str.getClass();
                ul1Var.getClass();
                ul1Var.c.setIgnoredVersion(str);
                ey1Var.setValue(Boolean.FALSE);
                return mf3.a;
            case 1:
                i5 i5Var = (i5) this.g;
                ul1 ul1Var2 = (ul1) this.f;
                LocationSpooferDataPackage locationSpooferDataPackage = (LocationSpooferDataPackage) obj;
                if (locationSpooferDataPackage == null) {
                    i5Var.invoke();
                } else {
                    ig0.j(ul1Var2, locationSpooferDataPackage, new ImportExportSelection(false, false, false, false, false, 31, null), i5Var);
                }
                return mf3.a;
            case 2:
                s52 s52Var = (s52) this.f;
                ey1 ey1Var2 = (ey1) this.g;
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                s52Var.h(Float.intBitsToFloat((int) (pa1Var.h0(0L) & 4294967295L)));
                ey1Var2.setValue(Boolean.TRUE);
                return mf3.a;
            case 3:
                xe1 xe1Var = (xe1) this.f;
                is1 is1Var = (is1) this.g;
                ((ed0) obj).getClass();
                or1 or1Var = new or1(is1Var, zF ? 1 : 0);
                xe1Var.a(or1Var);
                if (((ff1) xe1Var).d.compareTo(we1.h) >= 0) {
                    is1Var.n(true);
                }
                return new sh(xe1Var, or1Var, is1Var, i2);
            case 4:
                h82 h82Var = (h82) this.f;
                pu1 pu1Var = (pu1) this.g;
                g82 g82Var = (g82) obj;
                g82Var.getClass();
                g82.E(g82Var, h82Var, 0, 0, new nu1(pu1Var, i2), 4);
                return mf3.a;
            case Logger.WARN /* 5 */:
                qp2 qp2Var = (qp2) obj;
                vw1.n((lx1) this.f, (xp2) this.g, qp2Var, 0, qp2Var.f.a.a.f.length());
                return mf3.a;
            case Logger.ERROR /* 6 */:
                ((zw1) this.f).c.add(new ww1((SendChannel) this.g, obj));
                return mf3.a;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                Set set = (Set) this.f;
                zw1 zw1Var = (zw1) this.g;
                if (set.contains(obj)) {
                    zx1 zx1Var = zw1Var.b;
                    ay1 ay1Var = zw1Var.d;
                    Object objG = zx1Var.g(obj);
                    if (objG != null) {
                        if (objG instanceof ay1) {
                            ay1 ay1Var2 = (ay1) objG;
                            Object[] objArr = ay1Var2.b;
                            long[] jArr = ay1Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j) < 128) {
                                                ay1Var.a((SendChannel) objArr[(i3 << 3) + i5]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 != length) {
                                                i3++;
                                            }
                                        }
                                    } else if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        } else {
                            ay1Var.a((SendChannel) objG);
                        }
                    }
                }
                return mf3.a;
            case 8:
                h12 h12Var = (h12) this.f;
                h82 h82Var2 = (h82) this.g;
                g82 g82Var2 = (g82) obj;
                long j2 = ((h41) h12Var.s.invoke(g82Var2)).a;
                if (h12Var.t) {
                    g82.C(g82Var2, h82Var2, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                } else {
                    g82.E(g82Var2, h82Var2, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                }
                return mf3.a;
            case mc0.b /* 9 */:
                y42 y42Var = (y42) this.f;
                h82 h82Var3 = (h82) this.g;
                g82 g82Var3 = (g82) obj;
                boolean z = y42Var.w;
                float f = y42Var.s;
                if (z) {
                    g82.B(g82Var3, h82Var3, g82Var3.n0(f), g82Var3.n0(y42Var.t));
                } else {
                    g82.z(g82Var3, h82Var3, g82Var3.n0(f), g82Var3.n0(y42Var.t));
                }
                return mf3.a;
            case mc0.c /* 10 */:
                s03 s03Var = (s03) this.f;
                s03 s03Var2 = (s03) this.g;
                jg0 jg0Var = (jg0) obj;
                float fR = jg0Var.R(2.0f);
                float f2 = fR / 2.0f;
                jg0.Y(jg0Var, ((hz) s03Var.getValue()).a, jg0Var.R(n51.L / 2.0f) - f2, 0L, new t13(fR, 0.0f, 0, 0, null, 30), 108);
                if (td0.a(((td0) s03Var2.getValue()).e, 0.0f) > 0) {
                    jg0.Y(jg0Var, ((hz) s03Var.getValue()).a, jg0Var.R(((td0) s03Var2.getValue()).e) - f2, 0L, en0.a, 108);
                }
                return mf3.a;
            case 11:
                t30 t30Var = (t30) this.f;
                ay1 ay1Var3 = (ay1) this.g;
                t30Var.z(obj);
                if (ay1Var3 != null) {
                    ay1Var3.a(obj);
                }
                return mf3.a;
            case mc0.d /* 12 */:
                ke2 ke2Var = (ke2) this.f;
                Throwable th = (Throwable) this.g;
                Throwable th2 = (Throwable) obj;
                synchronized (ke2Var.c) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                Throwable th3 = th2 instanceof CancellationException ? null : th2;
                                if (th3 != null) {
                                    vd0.d(th, th3);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        r11 = th;
                    }
                    ke2Var.e = r11;
                    ke2Var.u.setValue(ie2.e);
                }
                return mf3.a;
            case 13:
                lu0 lu0Var = (lu0) this.f;
                ey1 ey1Var3 = (ey1) this.g;
                ((l91) obj).getClass();
                if (!l13.k0((String) ey1Var3.getValue())) {
                    lu0Var.invoke((String) ey1Var3.getValue());
                }
                return mf3.a;
            case 14:
                ((iy1) this.f).a.setValue(new hm0((sk3) this.g, (sk3) obj));
                return mf3.a;
            case a83.e /* 15 */:
                AppState appState = (AppState) this.f;
                ?? r0 = (ey1) this.g;
                lr2 lr2Var = (lr2) obj;
                lr2Var.getClass();
                r0.setValue(lr2Var);
                lr2Var.g();
                Double dR = r13.R(appState.getLatitudeInput());
                double dDoubleValue = dR != null ? dR.doubleValue() : 39.9042d;
                Double dR2 = r13.R(appState.getLongitudeInput());
                lr2Var.i(dDoubleValue, dR2 != null ? dR2.doubleValue() : 116.4074d, Float.valueOf(16.5f));
                return mf3.a;
            case 16:
                uo2 uo2Var = (uo2) this.f;
                wo2 wo2Var = (wo2) this.g;
                me0 me0Var = (me0) obj;
                float f3 = me0Var.b ? -1.0f : 1.0f;
                long j3 = me0Var.a;
                uo2Var.a(1, c12.f(f3, wo2Var.d == x32.f ? c12.a(0.0f, 1, j3) : c12.a(0.0f, 2, j3)));
                return mf3.a;
            case 17:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f, null, CoroutineStart.UNDISPATCHED, new wr1((zx) this.g, (dj) obj, r11, 10), 1, null);
                return mf3.a;
            case 18:
                ar2 ar2Var = (ar2) this.f;
                lu0 lu0Var2 = (lu0) this.g;
                xp2 xp2Var2 = (xp2) obj;
                ar2Var.l(xp2Var2);
                lu0Var2.invoke(xp2Var2);
                return mf3.a;
            case 19:
                ar2 ar2Var2 = (ar2) this.f;
                Context context = (Context) this.g;
                v53 v53Var = (v53) obj;
                v53Var.a();
                sx1 sx1Var = v53Var.a;
                f63 f63Var = f63.Autofill;
                boolean zH = ar2Var2.h();
                bq2 bq2Var = new bq2(ar2Var2, 5);
                Resources resources = context.getResources();
                cr2 cr2Var = new cr2(bq2Var, null, 0);
                if (zH) {
                    sx1Var.a(new e63(da0.Y, resources.getString(R.string.copy), R.attr.actionModeCopyDrawable, cr2Var));
                }
                f63 f63Var2 = f63.Autofill;
                er2 er2Var = ar2Var2.a;
                ArrayList arrayListC = er2Var.c(ar2Var2.j());
                if (!arrayListC.isEmpty()) {
                    int size = arrayListC.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        bx1 bx1Var = (bx1) arrayListC.get(i6);
                        dj djVarD = bx1Var.d();
                        if (djVarD.f.length() != 0 && ((xp2Var = (xp2) er2Var.a().e(bx1Var.a)) == null || Math.abs(xp2Var.a.b - xp2Var.b.b) != djVarD.f.length())) {
                            i2 = 0;
                        }
                    }
                }
                bq2 bq2Var2 = new bq2(ar2Var2, 6);
                bq2 bq2Var3 = new bq2(ar2Var2, i);
                Resources resources2 = context.getResources();
                cr2 cr2Var2 = new cr2(bq2Var3, bq2Var2, 0);
                if (i2 == 0) {
                    sx1Var.a(new e63(da0.a0, resources2.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, cr2Var2));
                }
                v53Var.a();
                return mf3.a;
            case 20:
                tt2 tt2Var = (tt2) this.f;
                SavedLocation savedLocation = (SavedLocation) this.g;
                SavedLocation savedLocation2 = (SavedLocation) obj;
                savedLocation2.getClass();
                tt2Var.getClass();
                if (savedLocation2.getSourceLocationId() != null && savedLocation.getSourceLocationId() != null) {
                    zF = o51.f(savedLocation2.getSourceLocationId(), savedLocation.getSourceLocationId());
                } else if (o51.f(savedLocation2.getName(), savedLocation.getName()) && savedLocation2.getLat() == savedLocation.getLat() && savedLocation2.getLng() == savedLocation.getLng()) {
                    zF = true;
                }
                return Boolean.valueOf(zF);
            case 21:
                e03 e03Var = (e03) this.f;
                hz hzVar = (hz) this.g;
                xu xuVar = (xu) obj;
                xuVar.getClass();
                je jeVarN = xq1.n();
                ye yeVar = xuVar.g;
                yeVar.getClass();
                return xuVar.c(new lh(e03Var, hzVar, ((iw0) yeVar.invoke()).b(), jeVarN, 13));
            case 22:
                tt2 tt2Var2 = (tt2) this.f;
                SyncCategory syncCategory = (SyncCategory) this.g;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SyncSelection syncSelectionD = tt2Var2.d();
                tt2Var2.h(SyncSelection.copy$default(syncSelectionD, false, zBooleanValue ? pt2.O(syncSelectionD.getCategories(), syncCategory) : pt2.L(syncSelectionD.getCategories(), syncCategory), 1, null));
                return mf3.a;
            case 23:
                s03 s03Var3 = (s03) this.f;
                ey1 ey1Var4 = (ey1) this.g;
                cw2 cw2Var = (cw2) obj;
                float fFloatValue = ((Number) s03Var3.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cw2Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cw2Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((cw2) ey1Var4.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((cw2) ey1Var4.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    ey1Var4.setValue(new cw2((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return mf3.a;
            case 24:
                xu xuVar2 = (xu) obj;
                return xuVar2.c(new q9(new jl1(25, ((au2) this.f).a(xuVar2.e.a(), xuVar2.e.getLayoutDirection(), xuVar2), (u63) this.g), 9));
            case 25:
                ce0.p((jg0) obj, (vd0) this.f, ((hz) ((u63) this.g).a.invoke()).a);
                return mf3.a;
            case 26:
                return new nn(3, (ey1) this.g, (ix1) this.f);
            case 27:
                cj cjVar = (cj) this.f;
                t52 t52Var = ((cg1) this.g).b;
                t53 t53Var = (t53) obj;
                bg1 bg1Var = (bg1) cjVar.a;
                b93 b93VarA4 = bg1Var.a();
                uy2 uy2Var = b93VarA4 != null ? b93VarA4.a : null;
                uy2 uy2VarC2 = ((t52Var.g() & 1) == 0 || (b93VarA3 = bg1Var.a()) == null) ? null : b93VarA3.b;
                if (uy2Var != null) {
                    uy2VarC2 = uy2Var.c(uy2VarC2);
                }
                uy2 uy2VarC3 = ((t52Var.g() & 2) == 0 || (b93VarA2 = bg1Var.a()) == null) ? null : b93VarA2.c;
                if (uy2VarC2 != null) {
                    uy2VarC3 = uy2VarC2.c(uy2VarC3);
                }
                if ((t52Var.g() & 4) != 0 && (b93VarA = bg1Var.a()) != null) {
                    uy2VarC = b93VarA.d;
                }
                if (uy2VarC3 != null) {
                    uy2VarC = uy2VarC3.c(uy2VarC);
                }
                t53Var.b = t53Var.a.b(new ji1(new se2(), cjVar, uy2VarC, 19));
                return mf3.a;
            case 28:
                a93 a93Var = (a93) this.f;
                cj cjVar2 = (cj) this.g;
                ?? r1 = (ow0) obj;
                dj djVar = a93Var.b;
                w52 w52Var = a93Var.a;
                x83 x83Var2 = (x83) w52Var.getValue();
                if (o51.f(djVar, (x83Var2 == null || (w83Var = x83Var2.a) == null) ? null : w83Var.a) && (x83Var = (x83) w52Var.getValue()) != null) {
                    sw1 sw1Var = x83Var.b;
                    cj cjVarC = a93.c(cjVar2, x83Var);
                    if (cjVarC == null) {
                        reVarI = null;
                    } else {
                        int i7 = cjVarC.c;
                        int i8 = cjVarC.b;
                        reVarI = x83Var.i(i8, i7);
                        pe2 pe2VarB = x83Var.b(i8);
                        int i9 = i7 - 1;
                        reVarI.i(((((long) Float.floatToRawIntBits(sw1Var.d(i8) == sw1Var.d(i9) ? Math.min(x83Var.b(i9).a, pe2VarB.a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(pe2VarB.b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    reVarI = null;
                }
                du2 du2Var = reVarI != null ? new du2(reVarI, i2) : null;
                if (du2Var != null) {
                    r1.N(du2Var);
                    r1.n(true);
                }
                return mf3.a;
            default:
                List list = (List) this.f;
                List list2 = (List) this.g;
                g82 g82Var4 = (g82) obj;
                if (list != null) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        i52 i52Var = (i52) list.get(i10);
                        g82.A(g82Var4, (h82) i52Var.e, ((h41) i52Var.f).a);
                    }
                }
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        i52 i52Var2 = (i52) list2.get(i11);
                        h82 h82Var4 = (h82) i52Var2.e;
                        au0 au0Var = (au0) i52Var2.f;
                        g82.A(g82Var4, h82Var4, au0Var != null ? ((h41) au0Var.invoke()).a : 0L);
                    }
                }
                return mf3.a;
        }
    }

    public /* synthetic */ jl1(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
    }

    public /* synthetic */ jl1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj2;
        this.g = obj3;
    }
}
