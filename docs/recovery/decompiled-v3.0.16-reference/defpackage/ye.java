package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.service.BootCompletedReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.koin.android.scope.ScopeService;
import org.koin.androidx.scope.RetainedScopeActivity;
import org.koin.androidx.scope.ScopeActivity;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ye extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye(Object obj, int i) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[LOOP:0: B:13:0x0045->B:23:0x007a, LOOP_END] */
    @Override // defpackage.au0
    public final Object invoke() {
        t30 t30Var;
        int i = this.f;
        boolean z = false;
        int i2 = 0;
        z = false;
        boolean z2 = false;
        z = false;
        pa1 pa1Var = null;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                CoroutineScopeKt.cancel$default(((af) obj).g, null, 1, null);
                return mf3Var;
            case 1:
                return mf3Var;
            case 2:
                mc3 mc3Var = (mc3) obj;
                Object objC = mc3Var.c();
                ck0 ck0Var = ck0.g;
                if (objC == ck0Var && mc3Var.d.getValue() == ck0Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((kn2) ((mn2) ((BootCompletedReceiver) obj).a().a).h).a(xe2.a(LocationRepository.class), null);
            case 4:
                return (pe2) obj;
            case Logger.WARN /* 5 */:
                wu wuVar = (wu) obj;
                nn2 nn2Var = wuVar.u;
                if (nn2Var == null) {
                    nn2Var = new nn2();
                    wuVar.u = nn2Var;
                }
                if (nn2Var.b == null) {
                    iw0 iw0VarM = xp1.M(wuVar);
                    nn2Var.c();
                    nn2Var.b = iw0VarM;
                }
                return nn2Var;
            case Logger.ERROR /* 6 */:
                RetainedScopeActivity retainedScopeActivity = (RetainedScopeActivity) obj;
                ox oxVarA = xe2.a(ln2.class);
                oj3 viewModelStore = retainedScopeActivity.getViewModelStore();
                viewModelStore.getClass();
                mj3 defaultViewModelProviderFactory = retainedScopeActivity.getDefaultViewModelProviderFactory();
                defaultViewModelProviderFactory.getClass();
                c80 defaultViewModelCreationExtras = retainedScopeActivity.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                mn2 mn2Var = new mn2(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                String strB = oxVarA.b();
                if (strB == null) {
                    fo.i("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                ln2 ln2Var = (ln2) mn2Var.r(oxVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                kn2 kn2Var = ln2Var.b;
                if (kn2Var != null) {
                    return kn2Var;
                }
                kn2 kn2VarD = zm3.u(retainedScopeActivity).d(ke0.A(retainedScopeActivity), new xd3(xe2.a(retainedScopeActivity.getClass())), null);
                ln2Var.b = kn2VarD;
                return kn2VarD;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ScopeActivity scopeActivity = (ScopeActivity) obj;
                gn gnVarU = zm3.u(scopeActivity);
                String strA = ke0.A(scopeActivity);
                mn2 mn2Var2 = (mn2) gnVarU.a;
                mn2Var2.getClass();
                kn2 kn2Var2 = (kn2) ((ConcurrentHashMap) mn2Var2.g).get(strA);
                if (kn2Var2 != null) {
                    return kn2Var2;
                }
                kn2 kn2VarD2 = zm3.u(scopeActivity).d(ke0.A(scopeActivity), new xd3(xe2.a(scopeActivity.getClass())), scopeActivity);
                kn2VarD2.g.add(new h10(scopeActivity));
                scopeActivity.getLifecycle().a(new i10(kn2VarD2));
                return kn2VarD2;
            case 8:
                boolean zB = p41.b(0L, 0L);
                View view = ((a30) obj).a;
                return zB ? n51.n(view) : new dc0(0L, zm3.d(view.getContext()).P(mc0.J(0L)));
            case mc0.b /* 9 */:
                ((dq0) obj).o1();
                return mf3Var;
            case mc0.c /* 10 */:
                return (List) obj;
            case 11:
                try {
                    return (List) ((au0) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return uj0.e;
                }
            case mc0.d /* 12 */:
                Object systemService = ((View) ((gn) obj).a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                return (qe) obj;
            case 14:
                lb1 lb1Var = ((hb1) obj).L;
                lb1Var.p.D = true;
                ik1 ik1Var = lb1Var.q;
                if (ik1Var != null) {
                    ik1Var.x = true;
                }
                return mf3Var;
            case a83.e /* 15 */:
                nb1 nb1Var = (nb1) obj;
                if (!((Boolean) nb1Var.g.getValue()).booleanValue() && (t30Var = nb1Var.c) != null) {
                    t30Var.l();
                }
                return mf3Var;
            case 16:
                oo1 oo1Var = (oo1) ((hf1) obj).a.f;
                if (!oo1Var.f) {
                    if (oo1Var.g) {
                        ib2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    oo1Var.a();
                    oo1Var.g = true;
                }
                return mf3Var;
            case 17:
                return ((dz1) obj).d;
            case 18:
                return ((hz1) obj).m1();
            case 19:
                ya2 ya2Var = (ya2) obj;
                pa1 parentLayoutCoordinates = ya2Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.U()) {
                    pa1Var = parentLayoutCoordinates;
                }
                if (pa1Var != null && ya2Var.m106getPopupContentSizebOM6tXw() != null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 20:
                re2 re2Var = (re2) obj;
                re2Var.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    re2Var.a();
                    return mf3Var;
                } finally {
                    Trace.endSection();
                }
            case 21:
                kn2 kn2Var3 = (kn2) obj;
                gn gnVar = kn2Var3.d;
                t20 t20Var = (t20) gnVar.c;
                StringBuilder sb = new StringBuilder("|- (-) Scope - id:'");
                String str = kn2Var3.b;
                sb.append(str);
                sb.append('\'');
                String string = sb.toString();
                t20Var.getClass();
                t20Var.j(re1.e, string);
                ArrayList arrayList = kn2Var3.g;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    h10 h10Var = (h10) obj2;
                    h10Var.getClass();
                    h10Var.a.onCloseScope();
                }
                arrayList.clear();
                kn2Var3.f = null;
                kn2Var3.i = true;
                mn2 mn2Var3 = (mn2) gnVar.a;
                mn2Var3.getClass();
                gn gnVar2 = (gn) ((gn) mn2Var3.e).b;
                gnVar2.getClass();
                Collection collectionValues = ((ConcurrentHashMap) gnVar2.c).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    throw az2.g(it2);
                }
                ((ConcurrentHashMap) mn2Var3.g).remove(str);
                return mf3Var;
            case 22:
                ScopeService scopeService = (ScopeService) obj;
                gn gnVarU2 = zm3.u(scopeService);
                String strA2 = ke0.A(scopeService);
                mn2 mn2Var4 = (mn2) gnVarU2.a;
                mn2Var4.getClass();
                kn2 kn2Var4 = (kn2) ((ConcurrentHashMap) mn2Var4.g).get(strA2);
                return kn2Var4 == null ? gnVarU2.d(ke0.A(scopeService), new xd3(xe2.a(scopeService.getClass())), scopeService) : kn2Var4;
            case 23:
                Collection collectionValues2 = ((wu2) obj).l.e().c.values();
                if (!((u) collectionValues2).isEmpty()) {
                    Iterator it3 = ((v72) collectionValues2).iterator();
                    while (it3.hasNext() && !((nu2) it3.next()).d()) {
                    }
                }
                return mf3Var;
            case 24:
                vb1 vb1VarA = ((g23) obj).a();
                hb1 hb1Var = vb1VarA.e;
                if (vb1VarA.r != ((gy1) ((qx1) hb1Var.o()).f).g) {
                    zx1 zx1Var = vb1VarA.j;
                    Object[] objArr = zx1Var.c;
                    long[] jArr = zx1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((nb1) objArr[(i3 << 3) + i5]).d = true;
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
                    if (hb1Var.m != null) {
                        if (!hb1Var.L.e) {
                            hb1.T(hb1Var, false, 7);
                        }
                    } else if (!hb1Var.q()) {
                        hb1.V(hb1Var, false, 7);
                    }
                }
                return mf3Var;
            case 25:
                return new BaseInputConnection(((n83) obj).a, false);
            default:
                ((ph3) obj).h.setValue(mf3Var);
                return mf3Var;
        }
    }
}
