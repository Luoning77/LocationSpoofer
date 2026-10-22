package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.sharing.SharingUiState;
import com.vincenthzr.locationspoofer.data.sync.SyncCategory;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.coroutines.sync.MutexImpl;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bu implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bu(au0 au0Var, lu0 lu0Var) {
        this.e = 8;
        this.g = au0Var;
        this.f = lu0Var;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ey1 ey1Var = (ey1) this.f;
        s03 s03Var = (s03) this.g;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bc1) obj).getClass();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new xj2(ey1Var, 14);
                ov0Var.m0(objQ);
            }
            au0 au0Var = (au0) objQ;
            boolean z = (((SharingUiState) s03Var.getValue()).getLoading() || ((SharingUiState) s03Var.getValue()).getUploading()) ? false : true;
            b52 b52Var = hu.a;
            n51.j(au0Var, null, z, null, hu.f(bk.g, ov0Var), null, ym3.l, ov0Var, 805306374, 490);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.f;
        oe oeVar = (oe) this.g;
        uy2 uy2Var = (uy2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        l43 l43Var = uy2Var.f;
        jr0 jr0Var = uy2Var.c;
        if (jr0Var == null) {
            jr0Var = jr0.g;
        }
        hr0 hr0Var = uy2Var.d;
        int i = hr0Var != null ? hr0Var.a : 0;
        ir0 ir0Var = uy2Var.e;
        int i2 = ir0Var != null ? ir0Var.a : 65535;
        pe peVar = (pe) oeVar.f;
        he3 he3VarB = ((mq0) peVar.e).b(l43Var, jr0Var, i, i2);
        if (he3VarB instanceof he3) {
            Object obj4 = he3VarB.e;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            gn gnVar = new gn(he3VarB, peVar.j);
            peVar.j = gnVar;
            Object obj5 = gnVar.c;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new oq0(typeface, 1), iIntValue, iIntValue2, 33);
        return mf3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        SyncSelection syncSelection = (SyncSelection) this.f;
        Object obj4 = (tt2) this.g;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nr nrVar = j9.r;
        ho hoVar = am1.g;
        ((zz) obj).getClass();
        int i3 = 1;
        boolean z = false;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            av1 av1Var = av1.a;
            dv1 dv1VarH = xp1.H(ov0Var, av1Var);
            w20.b.getClass();
            au0 au0Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(au0Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, yzVarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            ov0Var.c0(-542622901);
            Iterator it = SyncCategory.getEntries().iterator();
            ov0 ov0Var2 = ov0Var;
            while (it.hasNext()) {
                SyncCategory syncCategory = (SyncCategory) it.next();
                int[] iArr = h43.a;
                int i4 = iArr[syncCategory.ordinal()];
                if (i4 == i3) {
                    i = 2131625072;
                } else if (i4 == 2) {
                    i = 2131625077;
                } else if (i4 == 3) {
                    i = 2131625085;
                } else if (i4 == 4) {
                    i = 2131625083;
                } else {
                    if (i4 != 5) {
                        b81.d();
                        return null;
                    }
                    i = 2131625070;
                }
                int i5 = iArr[syncCategory.ordinal()];
                if (i5 == i3) {
                    i2 = 2131625073;
                } else if (i5 == 2) {
                    i2 = 2131625078;
                } else if (i5 == 3) {
                    i2 = 2131625086;
                } else if (i5 == 4) {
                    i2 = 2131625084;
                } else {
                    if (i5 != 5) {
                        b81.d();
                        return null;
                    }
                    i2 = 2131625071;
                }
                boolean zContains = syncSelection.getCategories().contains(syncCategory);
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                boolean enabled = syncSelection.getEnabled();
                vh2 vh2Var = new vh2(i3);
                boolean zH = ov0Var2.h(obj4) | ov0Var2.d(syncCategory.ordinal());
                Object objQ = ov0Var2.Q();
                if (zH || objQ == d30.a) {
                    objQ = new jl1(22, obj4, syncCategory);
                    ov0Var2.m0(objQ);
                }
                dv1 dv1VarE2 = zm3.E(ks.d0(dv1VarE, zContains, enabled, vh2Var, null, (lu0) objQ), 12.0f, 10.0f);
                kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
                int iHashCode2 = Long.hashCode(ov0Var2.T);
                l72 l72VarL2 = ov0Var2.l();
                dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE2);
                w20.b.getClass();
                au0 au0Var2 = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(au0Var2);
                } else {
                    ov0Var2.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var2, ghVar, kk2VarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var2, ghVar2, l72VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                gh ghVar3 = v20.f;
                q73.h(ov0Var2, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var2, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var2, ghVar4, dv1VarH2);
                boolean enabled2 = syncSelection.getEnabled();
                int i6 = i;
                long j = bk.g;
                long j2 = hz.c;
                Object obj5 = obj4;
                cd2 cd2Var = mz.a;
                SyncSelection syncSelection2 = syncSelection;
                Iterator it2 = it;
                ov0 ov0Var3 = ov0Var2;
                ym3.f(zContains, null, null, enabled2, da0.q(j, ((kz) ov0Var2.j(cd2Var)).s, j2, hz.c(0.35f, j), hz.c(0.35f, ((kz) ov0Var2.j(cd2Var)).s), ov0Var3, 32), ov0Var3, 48, 36);
                dv1 dv1VarG = zm3.G(new wb1(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var3, 0);
                int iHashCode3 = Long.hashCode(ov0Var3.T);
                l72 l72VarL3 = ov0Var3.l();
                dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarG);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(au0Var2);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, yzVarA2);
                q73.h(ov0Var3, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
                q73.h(ov0Var3, ghVar4, dv1VarH3);
                s83.b(ke0.N(i6, ov0Var3), null, hz.c(syncSelection2.getEnabled() ? 1.0f : 0.5f, ((kz) ov0Var3.j(cd2Var)).q), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                s83.b(ke0.N(i2, ov0Var3), null, hz.c(syncSelection2.getEnabled() ? 1.0f : 0.5f, ((kz) ov0Var3.j(cd2Var)).s), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(le3.a)).l, ov0Var3, 0, 0, 131066);
                ov0 ov0Var4 = ov0Var3;
                ov0Var4.p(true);
                ov0Var4.p(true);
                it = it2;
                i3 = 1;
                obj4 = obj5;
                syncSelection = syncSelection2;
                z = false;
                ov0Var2 = ov0Var4;
            }
            ov0Var2.p(z);
            ov0Var2.p(i3);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        long jC;
        String strH;
        boolean z;
        String strH2;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = this.e;
        q60 q60Var = null;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        boolean z6 = false;
        switch (i2) {
            case 0:
                return BufferedChannel.bindCancellationFun$lambda$89((lu0) obj5, obj4, (Throwable) obj, obj2, (y70) obj3);
            case 1:
                lu0 lu0Var = (lu0) obj5;
                k60 k60Var = (k60) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ = ov0Var.Q();
                    if (objQ == c30Var) {
                        objQ = new l60();
                        ov0Var.m0(objQ);
                    }
                    l60 l60Var = (l60) objQ;
                    l60Var.a.clear();
                    lu0Var.invoke(l60Var);
                    l60Var.a(k60Var, ov0Var, 0);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 2:
                AppState appState = (AppState) obj5;
                ul1 ul1Var = (ul1) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                    return mf3Var;
                }
                kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
                int iHashCode = Long.hashCode(ov0Var2.T);
                l72 l72VarL = ov0Var2.l();
                dv1 dv1VarH = xp1.H(ov0Var2, av1Var);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var2, ghVar, kk2VarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var2, ghVar2, l72VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                gh ghVar3 = v20.f;
                q73.h(ov0Var2, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var2, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var2, ghVar4, dv1VarH);
                dv1 dv1VarN = xp1.n(iw2.k(av1Var, 9.0f), cj2.a);
                if (appState.isContinuousScanning()) {
                    ov0Var2.c0(-1932106759);
                    i = 0;
                    ov0Var2.p(false);
                    jC = bk.h;
                } else {
                    i = 0;
                    ov0Var2.c0(-1932104031);
                    jC = hz.c(0.35f, ((kz) ov0Var2.j(mz.a)).q);
                    ov0Var2.p(false);
                }
                ws.a(xp1.k(dv1VarN, jC, o51.p0), ov0Var2, i);
                gh0.h(ov0Var2, iw2.o(av1Var, 8.0f));
                if (appState.isContinuousScanning()) {
                    ov0Var2.c0(234531085);
                    strH = ke0.O(2131624952, new Object[]{Integer.valueOf(appState.getEnvironmentRecordCount())}, ov0Var2);
                    ov0Var2.p(false);
                } else {
                    strH = az2.h(ov0Var2, 234670027, 2131624953, ov0Var2, false);
                }
                String str = strH;
                long jC2 = v63.c(14);
                jr0 jr0Var = jr0.i;
                hh0 hh0Var = mz.a;
                s83.b(str, null, ((kz) ov0Var2.j(hh0Var)).q, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                ov0Var2.p(true);
                gh0.h(ov0Var2, iw2.g(av1Var, 14.0f));
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                kk2 kk2VarA2 = jk2.a(new jo(10.0f, true, new fo(0)), j9.o, ov0Var2, 6);
                int iHashCode2 = Long.hashCode(ov0Var2.T);
                l72 l72VarL2 = ov0Var2.l();
                dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, kk2VarA2);
                q73.h(ov0Var2, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH2);
                x01 x01VarI = k93.i();
                long j2 = bk.g;
                String strO = ke0.O(2131624950, new Object[]{Integer.valueOf(appState.getScannedWifiCount())}, ov0Var2);
                lk2 lk2Var = lk2.a;
                k22.g(x01VarI, j2, strO, lk2.a(lk2Var, av1Var, 1.0f), ov0Var2, 48);
                x01 x01VarR = ks.R();
                long j3 = bk.h;
                k22.g(x01VarR, j3, ke0.O(2131624949, new Object[]{Integer.valueOf(appState.getScannedCellCount())}, ov0Var2), lk2.a(lk2Var, av1Var, 1.0f), ov0Var2, 48);
                long j4 = j3;
                k22.g(am1.v(), bk.i, ke0.O(2131624948, new Object[]{Integer.valueOf(appState.getScannedBluetoothCount())}, ov0Var2), lk2.a(lk2Var, av1Var, 1.0f), ov0Var2, 48);
                ov0Var2.p(true);
                gh0.h(ov0Var2, iw2.g(av1Var, 14.0f));
                s83.b(ke0.N(2131624372, ov0Var2), null, hz.c(0.5f, ((kz) ov0Var2.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, v63.c(17), 0, false, 0, 0, null, ov0Var2, 24576, 48, 260074);
                gh0.h(ov0Var2, iw2.g(av1Var, 14.0f));
                boolean z7 = !appState.isStoppingCollection();
                dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 48.0f);
                bj2 bj2VarA = cj2.a(14.0f);
                b52 b52Var = hu.a;
                if (appState.isContinuousScanning()) {
                    ov0Var2.c0(-567207689);
                    j4 = ((kz) ov0Var2.j(hh0Var)).w;
                    z = false;
                } else {
                    z = false;
                    ov0Var2.c0(-567207331);
                }
                ov0Var2.p(z);
                gu guVarA = hu.a(j4, 0L, 0L, 0L, ov0Var2, 14);
                boolean zH = ov0Var2.h(ul1Var);
                Object objQ2 = ov0Var2.Q();
                if (zH || objQ2 == c30Var) {
                    objQ2 = new m6(ul1Var, 4);
                    ov0Var2.m0(objQ2);
                }
                n51.a((au0) objQ2, dv1VarG, z7, bj2VarA, guVarA, null, null, null, sb.a0(513062210, new n6(appState, 2), ov0Var2), ov0Var2, 805306416, 480);
                return mf3Var;
            case 3:
                AppState appState2 = (AppState) obj5;
                no1 no1Var = (no1) obj4;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else if (appState2.getEnvironmentRecordCount() > 0) {
                    ov0Var3.c0(-520164596);
                    boolean zH2 = ov0Var3.h(no1Var);
                    Object objQ3 = ov0Var3.Q();
                    if (zH2 || objQ3 == c30Var) {
                        objQ3 = new d5(no1Var, 1);
                        ov0Var3.m0(objQ3);
                    }
                    dv1 dv1VarG2 = iw2.g(iw2.e(av1Var, 1.0f), 48.0f);
                    bj2 bj2VarA2 = cj2.a(14.0f);
                    b52 b52Var2 = hu.a;
                    n51.a((au0) objQ3, dv1VarG2, false, bj2VarA2, hu.a(bk.g, 0L, 0L, 0L, ov0Var3, 14), null, null, null, xp1.f, ov0Var3, 805306416, 484);
                    ov0Var3.p(false);
                } else {
                    ov0Var3.c0(-519438142);
                    s83.b(ke0.N(2131624795, ov0Var3), null, hz.c(0.5f, ((kz) ov0Var3.j(mz.a)).q), v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                    ov0Var3.p(false);
                }
                return mf3Var;
            case 4:
                AppState appState3 = (AppState) obj4;
                f30 f30Var4 = (f30) obj2;
                ((Integer) obj3).getClass();
                ((mi) obj).getClass();
                av1 av1Var2 = av1.a;
                dv1 dv1VarG3 = iw2.g(zm3.G(av1Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 52.0f);
                bj2 bj2VarA3 = cj2.a(26.0f);
                long jC3 = hz.c(0.08f, hz.b);
                long j5 = bk.g;
                dv1 dv1VarA = bk.a(xp1.k(xp1.n(hd0.O(dv1VarG3, 6.0f, bj2VarA3, jC3, hz.c(0.32f, j5), 4), cj2.a(26.0f)), j5, o51.p0), (au0) obj5);
                er1 er1VarC = ws.c(j9.j, false);
                ov0 ov0Var4 = (ov0) f30Var4;
                int iHashCode3 = Long.hashCode(ov0Var4.T);
                l72 l72VarL3 = ov0Var4.l();
                dv1 dv1VarH3 = xp1.H(f30Var4, dv1VarA);
                w20.b.getClass();
                x30 x30Var2 = v20.b;
                ov0 ov0Var5 = (ov0) f30Var4;
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var2);
                } else {
                    ov0Var5.p0();
                }
                gh ghVar5 = v20.e;
                q73.h(f30Var4, ghVar5, er1VarC);
                gh ghVar6 = v20.d;
                q73.h(f30Var4, ghVar6, l72VarL3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                gh ghVar7 = v20.f;
                q73.h(f30Var4, ghVar7, numValueOf2);
                wa waVar2 = v20.g;
                q73.g(f30Var4, waVar2);
                gh ghVar8 = v20.c;
                q73.h(f30Var4, ghVar8, dv1VarH3);
                dv1 dv1VarF = zm3.F(iw2.c(av1Var2, 1.0f), 16.0f, 0.0f, 2);
                kk2 kk2VarA3 = jk2.a(am1.h, j9.p, f30Var4, 54);
                int iHashCode4 = Long.hashCode(ov0Var5.T);
                l72 l72VarL4 = ov0Var5.l();
                dv1 dv1VarH4 = xp1.H(f30Var4, dv1VarF);
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var2);
                } else {
                    ov0Var5.p0();
                }
                q73.h(f30Var4, ghVar5, kk2VarA3);
                q73.h(f30Var4, ghVar6, l72VarL4);
                q73.h(f30Var4, ghVar7, Integer.valueOf(iHashCode4));
                q73.g(f30Var4, waVar2);
                q73.h(f30Var4, ghVar8, dv1VarH4);
                if (appState3.isSavingConfig()) {
                    ov0Var5.c0(-1299197960);
                    dv1 dv1VarK = iw2.k(av1Var2, 18.0f);
                    long j6 = hz.c;
                    vc2.a(dv1VarK, j6, 2.0f, 0L, 0, 0.0f, f30Var4, 438, 56);
                    gh0.h(f30Var4, iw2.o(av1Var2, 6.0f));
                    s83.b(ke0.N(2131625048, f30Var4), null, j6, v63.b(13.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, f30Var4, 1597824, 0, 262058);
                    ov0Var5.p(false);
                } else {
                    ov0Var5.c0(-1298500150);
                    x01 x01VarY = vd0.y();
                    long j7 = hz.c;
                    t01.a(x01VarY, null, iw2.k(av1Var2, 18.0f), j7, f30Var4, 3504, 0);
                    gh0.h(f30Var4, iw2.o(av1Var2, 6.0f));
                    s83.b(ke0.N(2131624463, f30Var4), null, j7, v63.b(13.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, f30Var4, 1597824, 0, 262058);
                    ov0Var5.p(false);
                }
                ov0Var5.p(true);
                ov0Var5.p(true);
                return mf3Var;
            case Logger.WARN /* 5 */:
                s03 s03Var = (s03) obj5;
                au0 au0Var = (au0) obj4;
                f30 f30Var5 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var5;
                if (ov0Var6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 20.0f);
                    jo joVar = new jo(14.0f, true, new fo(0));
                    nr nrVar = j9.r;
                    yz yzVarA = wz.a(joVar, nrVar, ov0Var6, 6);
                    int iHashCode5 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL5 = ov0Var6.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var6, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var3);
                    } else {
                        ov0Var6.p0();
                    }
                    gh ghVar9 = v20.e;
                    q73.h(ov0Var6, ghVar9, yzVarA);
                    gh ghVar10 = v20.d;
                    q73.h(ov0Var6, ghVar10, l72VarL5);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    gh ghVar11 = v20.f;
                    q73.h(ov0Var6, ghVar11, numValueOf3);
                    wa waVar3 = v20.g;
                    q73.g(ov0Var6, waVar3);
                    gh ghVar12 = v20.c;
                    q73.h(ov0Var6, ghVar12, dv1VarH5);
                    CloudAccount account = ((CloudAccountState) s03Var.getValue()).getAccount();
                    if (!((CloudAccountState) s03Var.getValue()).getValidated()) {
                        account = null;
                    }
                    boolean z8 = o51.f(account != null ? account.getPlan() : null, "pro") && !account.isGuest();
                    kk2 kk2VarA4 = jk2.a(am1.e, j9.p, ov0Var6, 48);
                    int iHashCode6 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL6 = ov0Var6.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var6, av1Var);
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var3);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, ghVar9, kk2VarA4);
                    q73.h(ov0Var6, ghVar10, l72VarL6);
                    az2.s(iHashCode6, ov0Var6, ghVar11, ov0Var6, waVar3);
                    q73.h(ov0Var6, ghVar12, dv1VarH6);
                    x01 x01VarC = ke0.C();
                    long j8 = bk.g;
                    t01.a(x01VarC, null, iw2.k(av1Var, 32.0f), j8, ov0Var6, 3504, 0);
                    gh0.h(ov0Var6, iw2.o(av1Var, 12.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var6, 0);
                    int iHashCode7 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL7 = ov0Var6.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var6, wb1Var);
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var3);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, ghVar9, yzVarA2);
                    q73.h(ov0Var6, ghVar10, l72VarL7);
                    az2.s(iHashCode7, ov0Var6, ghVar11, ov0Var6, waVar3);
                    q73.h(ov0Var6, ghVar12, dv1VarH7);
                    if (z8) {
                        ov0Var6.c0(-248516041);
                        account.getClass();
                        strH2 = account.getMembershipPlanName();
                        if (strH2 == null) {
                            z5 = false;
                            strH2 = az2.h(ov0Var6, 1654552238, 2131624744, ov0Var6, false);
                        } else {
                            z5 = false;
                            ov0Var6.c0(1654551339);
                            ov0Var6.p(false);
                        }
                        ov0Var6.p(z5);
                    } else {
                        strH2 = az2.h(ov0Var6, 1654553927, 2131624719, ov0Var6, false);
                    }
                    s83.b(strH2, null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var6).g, ov0Var6, 1572864, 0, 131006);
                    if (account == null) {
                        ov0Var6.c0(-248249070);
                    } else {
                        ov0Var6.c0(-248249069);
                        s83.b(account.getUsername(), null, dh0.p(ov0Var6).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var6).l, ov0Var6, 0, 0, 131066);
                    }
                    ov0Var6.p(false);
                    ov0Var6.p(true);
                    n51.j(au0Var, null, false, null, null, null, xq1.e, ov0Var6, 805306368, 510);
                    ov0Var6.p(true);
                    ld0.g(null, 0.0f, dh0.p(ov0Var6).B, ov0Var6, 0);
                    if (z8) {
                        ov0Var6.c0(2084108935);
                        Long subscriptionExpiresAt = account != null ? account.getSubscriptionExpiresAt() : null;
                        if (subscriptionExpiresAt == null) {
                            ov0Var6.c0(182867546);
                            z2 = false;
                            ov0Var6.p(false);
                            j = j8;
                        } else {
                            ov0Var6.c0(182867547);
                            String strA = wc0.A(subscriptionExpiresAt.longValue());
                            strA.getClass();
                            s83.b(ke0.O(2131624764, new Object[]{strA}, ov0Var6), null, j8, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 384, 0, 262138);
                            j = j8;
                            z2 = false;
                            ov0Var6.p(false);
                        }
                    } else {
                        j = j8;
                        z2 = false;
                        ov0Var6.c0(176130441);
                    }
                    ov0Var6.p(z2);
                    if (account == null) {
                        ov0Var6.c0(183002489);
                    } else {
                        ov0Var6.c0(183002490);
                        s83.b(ke0.O(o51.f(account.getQuotaScope(), "device") ? 2131624163 : 2131624241, new Object[]{Integer.valueOf(account.getSearchUsed()), Integer.valueOf(account.getSearchLimit())}, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                        String strA2 = wc0.A(account.getResetsAt());
                        strA2.getClass();
                        s83.b(ke0.O(2131624425, new Object[]{strA2}, ov0Var6), null, dh0.p(ov0Var6).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var6).l, ov0Var6, 0, 0, 131066);
                        if (account.getCallBillingEnabled()) {
                            ov0Var6.c0(1550525708);
                            s83.b(ke0.O(2131624084, new Object[]{Integer.valueOf(account.getMapTileRemainder())}, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                            s83.b(ke0.N(2131624075, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var6).l, ov0Var6, 0, 0, 131070);
                            z3 = false;
                        } else {
                            z3 = false;
                            ov0Var6.c0(1543269042);
                        }
                        ov0Var6.p(z3);
                        if (account.getExtraQuotaRemaining() > 0) {
                            ov0Var6.c0(-227070648);
                            s83.b(ke0.O(2131624417, new Object[]{Integer.valueOf(account.getExtraQuotaRemaining())}, ov0Var6), null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 384, 0, 262138);
                            z4 = false;
                        } else {
                            z4 = false;
                            ov0Var6.c0(1543269042);
                        }
                        ov0Var6.p(z4);
                        Integer loginDeviceLimit = account.getLoginDeviceLimit();
                        s83.b(ke0.O(2131623968, new Object[]{Integer.valueOf(loginDeviceLimit != null ? loginDeviceLimit.intValue() : 1)}, ov0Var6), null, dh0.p(ov0Var6).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var6).l, ov0Var6, 0, 0, 131066);
                        z2 = false;
                    }
                    ov0Var6.p(z2);
                    ov0Var6.p(true);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0((MutexImpl) obj5, obj4, (Throwable) obj, obj2, (y70) obj3);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                CloudAccount cloudAccount = (CloudAccount) obj5;
                au0 au0Var2 = (au0) obj4;
                f30 f30Var6 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var7 = (ov0) f30Var6;
                if (ov0Var7.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dv1 dv1VarD2 = zm3.D(av1Var, 20.0f);
                    yz yzVarA3 = wz.a(new jo(10.0f, true, new fo(0)), j9.r, ov0Var7, 6);
                    int iHashCode8 = Long.hashCode(ov0Var7.T);
                    l72 l72VarL8 = ov0Var7.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var7, dv1VarD2);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var7.g0();
                    if (ov0Var7.S) {
                        ov0Var7.k(x30Var4);
                    } else {
                        ov0Var7.p0();
                    }
                    q73.h(ov0Var7, v20.e, yzVarA3);
                    q73.h(ov0Var7, v20.d, l72VarL8);
                    q73.h(ov0Var7, v20.f, Integer.valueOf(iHashCode8));
                    q73.g(ov0Var7, v20.g);
                    q73.h(ov0Var7, v20.c, dv1VarH8);
                    String username = cloudAccount.getUsername();
                    hh0 hh0Var2 = le3.a;
                    s83.b(username, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var7.j(hh0Var2)).f, ov0Var7, 0, 0, 131070);
                    String membershipPlanName = cloudAccount.getMembershipPlanName();
                    if (membershipPlanName == null) {
                        ov0Var7.c0(-1046597926);
                        membershipPlanName = ke0.N(o51.f(cloudAccount.getPlan(), "pro") ? 2131624237 : 2131624236, ov0Var7);
                    } else {
                        ov0Var7.c0(-1046598856);
                    }
                    ov0Var7.p(false);
                    s83.b(membershipPlanName, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                    Long subscriptionExpiresAt2 = cloudAccount.getSubscriptionExpiresAt();
                    if (subscriptionExpiresAt2 == null) {
                        ov0Var7.c0(1915346751);
                    } else {
                        ov0Var7.c0(1915346752);
                        String str2 = DateFormat.getDateTimeInstance().format(new Date(subscriptionExpiresAt2.longValue()));
                        str2.getClass();
                        s83.b(ke0.O(2131624181, new Object[]{str2}, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                    }
                    ov0Var7.p(false);
                    Integer numValueOf4 = Integer.valueOf(cloudAccount.getSearchUsed());
                    Integer numValueOf5 = Integer.valueOf(cloudAccount.getSearchLimit());
                    int searchLimit = cloudAccount.getSearchLimit() - cloudAccount.getSearchUsed();
                    if (searchLimit < 0) {
                        searchLimit = 0;
                    }
                    s83.b(ke0.O(2131623990, new Object[]{numValueOf4, numValueOf5, Integer.valueOf(cloudAccount.getExtraQuotaRemaining() + searchLimit)}, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                    if (cloudAccount.getCallBillingEnabled()) {
                        ov0Var7.c0(1915697238);
                        s83.b(ke0.O(2131624084, new Object[]{Integer.valueOf(cloudAccount.getMapTileRemainder())}, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                        s83.b(ke0.N(2131624075, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var7.j(hh0Var2)).l, ov0Var7, 0, 0, 131070);
                    } else {
                        ov0Var7.c0(1911294308);
                    }
                    ov0Var7.p(false);
                    String str3 = DateFormat.getDateTimeInstance().format(new Date(cloudAccount.getResetsAt()));
                    str3.getClass();
                    s83.b(ke0.O(2131624425, new Object[]{str3}, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                    if (cloudAccount.getExtraQuotaRemaining() > 0) {
                        ov0Var7.c0(-1046568530);
                        s83.b(ke0.O(2131623973, new Object[]{Integer.valueOf(cloudAccount.getExtraQuotaRemaining())}, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                    } else {
                        ov0Var7.c0(1911294308);
                    }
                    ov0Var7.p(false);
                    n51.a(au0Var2, iw2.e(av1Var, 1.0f), false, null, null, null, null, null, da0.p, ov0Var7, 805306416, 508);
                    ov0Var7.p(true);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case 8:
                au0 au0Var3 = (au0) obj4;
                lu0 lu0Var2 = (lu0) obj5;
                ((Integer) obj3).getClass();
                ov0 ov0Var8 = (ov0) ((f30) obj2);
                ov0Var8.c0(759876635);
                Object objQ4 = ov0Var8.Q();
                if (objQ4 == c30Var) {
                    objQ4 = by2.b(au0Var3);
                    ov0Var8.m0(objQ4);
                }
                s03 s03Var2 = (s03) objQ4;
                Object objQ5 = ov0Var8.Q();
                if (objQ5 == c30Var) {
                    c12 c12Var = (c12) s03Var2.getValue();
                    long j9 = c12Var.a;
                    objQ5 = new oh(c12Var, xq2.b, new c12(xq2.c), 8);
                    ov0Var8.m0(objQ5);
                }
                oh ohVar = (oh) objQ5;
                boolean zH3 = ov0Var8.h(ohVar);
                Object objQ6 = ov0Var8.Q();
                if (zH3 || objQ6 == c30Var) {
                    objQ6 = new m(s03Var2, ohVar, q60Var, 25);
                    ov0Var8.m0(objQ6);
                }
                oi0.e(ov0Var8, (pu0) objQ6, mf3Var);
                ti tiVar = ohVar.c;
                boolean zF = ov0Var8.f(tiVar);
                Object objQ7 = ov0Var8.Q();
                if (zF || objQ7 == c30Var) {
                    objQ7 = new wq2(tiVar, 0);
                    ov0Var8.m0(objQ7);
                }
                dv1 dv1Var = (dv1) lu0Var2.invoke((au0) objQ7);
                ov0Var8.p(false);
                return dv1Var;
            case mc0.b /* 9 */:
                return f(obj, obj2, obj3);
            case mc0.c /* 10 */:
                return g(obj, obj2, obj3);
            case 11:
                return h(obj, obj2, obj3);
            default:
                xc xcVar = (xc) obj5;
                ix1 ix1Var = (ix1) obj4;
                ((Integer) obj3).getClass();
                ov0 ov0Var9 = (ov0) ((f30) obj2);
                ov0Var9.c0(-102778667);
                Object objQ8 = ov0Var9.Q();
                if (objQ8 == c30Var) {
                    objQ8 = oi0.j(ov0Var9);
                    ov0Var9.m0(objQ8);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objQ8;
                Object objQ9 = ov0Var9.Q();
                if (objQ9 == c30Var) {
                    objQ9 = ke0.H(null);
                    ov0Var9.m0(objQ9);
                }
                ey1 ey1Var = (ey1) objQ9;
                ey1 ey1VarL = ke0.L(xcVar, ov0Var9);
                boolean zF2 = ov0Var9.f(ix1Var);
                Object objQ10 = ov0Var9.Q();
                if (zF2 || objQ10 == c30Var) {
                    objQ10 = new jl1(26, ey1Var, ix1Var, z6);
                    ov0Var9.m0(objQ10);
                }
                oi0.a(ix1Var, (lu0) objQ10, ov0Var9);
                boolean zH4 = ov0Var9.h(coroutineScope) | ov0Var9.f(ix1Var) | ov0Var9.f(ey1VarL);
                Object objQ11 = ov0Var9.Q();
                if (zH4 || objQ11 == c30Var) {
                    objQ11 = new n73(coroutineScope, ey1Var, ix1Var, ey1VarL);
                    ov0Var9.m0(objQ11);
                }
                dv1 dv1VarA2 = m33.a(av1Var, ix1Var, (PointerInputEventHandler) objQ11);
                ov0Var9.p(false);
                return dv1VarA2;
        }
    }

    public /* synthetic */ bu(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
