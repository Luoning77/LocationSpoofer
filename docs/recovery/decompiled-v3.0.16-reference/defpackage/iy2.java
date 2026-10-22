package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class iy2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ iy2(a93 a93Var, int i) {
        this.e = 5;
        this.f = a93Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0222 A[LOOP:0: B:50:0x01f2->B:61:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x025c A[LOOP:2: B:67:0x022d->B:78:0x025c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        Collection collectionX0;
        Object next;
        String str;
        i52 i52Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        String str5;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ky2 ky2Var = (ky2) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = ky2Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionX0 = collection;
                    } else if (obj4 instanceof Set) {
                        collectionX0 = am1.G(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            j30.b("Unexpected notification");
                            fo.d();
                            return null;
                        }
                        collectionX0 = zy.x0((Collection) obj4, am1.F(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, collectionX0)) {
                            if (ky2Var.b()) {
                                ky2Var.a.invoke(new ol2(ky2Var, 9));
                            }
                            return mf3Var;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iJ0 = l13.j0(charSequence, (char[]) obj3, iIntValue, false);
                if (iJ0 < 0) {
                    return null;
                }
                return new i52(Integer.valueOf(iJ0), 1);
            case 2:
                List list = (List) obj3;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list.size() == 1) {
                    String str6 = (String) zy.A0(list);
                    int iI0 = l13.i0(charSequence2, str6, iIntValue2, false, 4);
                    if (iI0 < 0) {
                        i52Var = null;
                    } else {
                        i52Var = new i52(Integer.valueOf(iI0), str6);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    k41 k41Var = new k41(iIntValue2, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i2 = k41Var.g;
                    int i3 = k41Var.f;
                    if (z) {
                        if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                            i52Var = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        i52Var = new i52(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i3) {
                                        iIntValue2 += i2;
                                    } else {
                                        i52Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence2, iIntValue2, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    i52Var = new i52(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                } else {
                                    i52Var = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                        i52Var = null;
                    } else {
                        int i4 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    i52Var = new i52(Integer.valueOf(i4), str);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                } else {
                                    i52Var = null;
                                }
                            } while (!l13.p0(str2, 0, charSequence2, i4, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                i52Var = new i52(Integer.valueOf(i4), str);
                            } else if (i4 != i3) {
                                i4 += i2;
                            } else {
                                i52Var = null;
                            }
                        }
                    }
                }
                if (i52Var != null) {
                    return new i52(i52Var.e, Integer.valueOf(((String) i52Var.f).length()));
                }
                return null;
            case 3:
                ((Integer) obj2).getClass();
                ov0 ov0Var = (ov0) ((f30) obj);
                ov0Var.c0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                ov0Var.p(false);
                return strValueOf;
            case 4:
                ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) ((f30) obj);
                ov0Var2.c0(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                ov0Var2.p(false);
                return string;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                ((a93) obj3).a(wc0.m0(1), (f30) obj);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                GithubRelease githubRelease = (GithubRelease) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var3, 0);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL = ov0Var3.l();
                    dv1 dv1VarH = xp1.H(ov0Var3, av1.a);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, yzVarA);
                    q73.h(ov0Var3, v20.d, l72VarL);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH);
                    String versionName = githubRelease.getVersionName();
                    if (githubRelease.isPrerelease()) {
                        ov0Var3.c0(86688919);
                        str5 = " · " + ke0.N(2131624821, ov0Var3);
                        ov0Var3.p(false);
                    } else {
                        ov0Var3.c0(-1607557704);
                        ov0Var3.p(false);
                        str5 = "";
                    }
                    s83.b(az2.k("v", versionName, str5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                    s83.b(l13.B0(10, githubRelease.getPublishedAt()), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(le3.a)).l, ov0Var3, 0, 0, 131070);
                    ov0Var3.p(true);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((lu0) obj3).invoke(obj);
                return mf3Var;
            case 8:
                return new h41(((long) ((nr) obj3).a(0, (int) (((p41) obj).a >> 32), (qa1) obj2)) << 32);
            case mc0.b /* 9 */:
                return new h41(((long) ((or) obj3).a(0, (int) (((p41) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new h41(((pr) obj3).a(0L, ((p41) obj).a, (qa1) obj2));
        }
    }

    public /* synthetic */ iy2(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
