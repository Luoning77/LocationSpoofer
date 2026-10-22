package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class t1 implements ot1, ks1, km, ts1, q02, b60, d60, cb2, yg2 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r11
      0x002a: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:5:0x0019, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public t1(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int i2 = 5;
        this.e = 5;
        int length = fArr.length - 1;
        bo[][] boVarArr = new bo[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i = i6 != i2 ? i4 : i2;
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            bo[] boVarArr2 = new bo[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                boVarArr2[i11] = new bo(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            boVarArr[i5] = boVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 5;
        }
        this.f = boVarArr;
    }

    public static vc1 C(t1 t1Var, int i) {
        yd1 yd1Var = (yd1) t1Var.f;
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            qd1 qd1Var = (qd1) yd1Var.f.getValue();
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            wc1 wc1Var = yd1Var.q;
            long j = qd1Var.j;
            boolean z = yd1Var.d;
            zs0 zs0Var = new zs0(i, qd1Var);
            ha1 ha1Var = wc1Var.c;
            if (ha1Var == null) {
                return j9.G;
            }
            gn gnVar = wc1Var.b;
            nb2 nb2Var = (nb2) ha1Var.d;
            boolean z2 = nb2Var instanceof mf;
            mb2 mb2Var = new mb2(ha1Var, i, gnVar, zs0Var);
            mb2Var.h = new l50(j);
            if (!z2) {
                nb2Var.a(mb2Var);
            } else if (z) {
                mf mfVar = (mf) nb2Var;
                mfVar.f.add(new ec2(1, mb2Var));
                if (!mfVar.g) {
                    mfVar.g = true;
                    mfVar.e.post(mfVar);
                }
            } else {
                mf mfVar2 = (mf) nb2Var;
                mfVar2.f.add(new ec2(0, mb2Var));
                if (!mfVar2.g) {
                    mfVar2.g = true;
                    mfVar2.e.post(mfVar2);
                }
            }
            ks.e0("compose:lazy:schedule_prefetch:index", i);
            return mb2Var;
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    public void A(float f, long j) {
        vv vvVarI = ((gn) this.f).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vvVarI.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        vvVarI.c(f);
        vvVarI.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void B(float f, float f2, long j) {
        vv vvVarI = ((gn) this.f).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vvVarI.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        vvVarI.b(f, f2);
        vvVarI.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void D(float f, float f2) {
        ((gn) this.f).i().g(f, f2);
    }

    @Override // defpackage.d60
    public ClipData a() {
        return ((ContentInfo) this.f).getClip();
    }

    @Override // defpackage.ot1
    public void b(ms1 ms1Var, boolean z) {
        if (ms1Var instanceof c23) {
            ((c23) ms1Var).z.k().c(false);
        }
        ot1 ot1Var = ((g7) this.f).i;
        if (ot1Var != null) {
            ot1Var.b(ms1Var, z);
        }
    }

    @Override // defpackage.b60
    public e60 build() {
        return new e60(new t1(((ContentInfo.Builder) this.f).build()));
    }

    @Override // defpackage.cb2
    public long c(l41 l41Var, long j, qa1 qa1Var, long j2) {
        long j3 = ((h41) ((au0) this.f).invoke()).a;
        int I = ks.I(l41Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), qa1Var == qa1.e);
        return (((long) ks.I(l41Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) I) << 32);
    }

    @Override // defpackage.ks1
    public boolean e(ms1 ms1Var, MenuItem menuItem) {
        j7 j7Var = ((ActionMenuView) this.f).E;
        if (j7Var != null) {
            Toolbar toolbar = ((za3) j7Var).e;
            toolbar.K.b();
            db3 db3Var = toolbar.M;
            if (db3Var != null ? ((fb3) db3Var).e.b.onMenuItemSelected(0, menuItem) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ts1
    public void f(ms1 ms1Var, MenuItem menuItem) {
        ((iw) this.f).j.removeCallbacksAndMessages(ms1Var);
    }

    @Override // defpackage.d60
    public int g() {
        return ((ContentInfo) this.f).getFlags();
    }

    @Override // defpackage.d60
    public ContentInfo h() {
        return (ContentInfo) this.f;
    }

    @Override // defpackage.ts1
    public void i(ms1 ms1Var, vs1 vs1Var) {
        iw iwVar = (iw) this.f;
        Handler handler = iwVar.j;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = iwVar.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ms1Var == ((hw) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new gw(this, i2 < arrayList.size() ? (hw) arrayList.get(i2) : null, vs1Var, ms1Var), ms1Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.ks1
    public void j(ms1 ms1Var) {
        ks1 ks1Var = ((ActionMenuView) this.f).z;
        if (ks1Var != null) {
            ks1Var.j(ms1Var);
        }
    }

    @Override // defpackage.b60
    public void l(Uri uri) {
        ((ContentInfo.Builder) this.f).setLinkUri(uri);
    }

    @Override // defpackage.d60
    public int m() {
        return ((ContentInfo) this.f).getSource();
    }

    @Override // defpackage.q02
    public Object n() {
        switch (this.e) {
            case 11:
                Class cls = (Class) this.f;
                try {
                    return wf3.a.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.f;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    ke0 ke0Var = bf2.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + bf2.b(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + bf2.b(constructor) + "' with no args", e4.getCause());
                }
        }
    }

    @Override // defpackage.ot1
    public boolean o(ms1 ms1Var) {
        g7 g7Var = (g7) this.f;
        if (ms1Var == g7Var.g) {
            return false;
        }
        vs1 vs1Var = ((c23) ms1Var).A;
        ot1 ot1Var = g7Var.i;
        if (ot1Var != null) {
            return ot1Var.o(ms1Var);
        }
        return false;
    }

    @Override // defpackage.b60
    public void p(int i) {
        ((ContentInfo.Builder) this.f).setFlags(i);
    }

    public void q(hb1 hb1Var) {
        if (!hb1Var.G()) {
            p21.c("DepthSortedSet.add called on an unattached node");
        }
        ((ry2) this.f).add(hb1Var);
    }

    public void s(float f, float f2, float f3, float f4, int i) {
        ((gn) this.f).i().f(f, f2, f3, f4, i);
    }

    @Override // defpackage.b60
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f).setExtras(bundle);
    }

    public r1 t(int i) {
        return null;
    }

    public String toString() {
        switch (this.e) {
            case 14:
                return "ContentInfoCompat{" + ((ContentInfo) this.f) + "}";
            case 17:
                return ((ry2) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((o30) this.f).getClass();
    }

    public r1 v(int i) {
        return null;
    }

    public s03 w() {
        wi0 wi0VarA = wi0.a();
        if (wi0VarA.c() == 1) {
            return new d11(true);
        }
        w52 w52VarH = ke0.H(Boolean.FALSE);
        wi0VarA.h(new na0(w52VarH, this));
        return w52VarH;
    }

    public void x(float f, float f2, float f3, float f4) {
        gn gnVar = (gn) this.f;
        vv vvVarI = gnVar.i();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gnVar.r() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gnVar.r() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            o21.a("Width and height must be greater than or equal to zero");
        }
        gnVar.F(jFloatToRawIntBits);
        vvVarI.g(f, f2);
    }

    public boolean y(int i, int i2, Bundle bundle) {
        return false;
    }

    public boolean z(hb1 hb1Var) {
        if (!hb1Var.G()) {
            p21.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((ry2) this.f).remove(hb1Var);
    }

    public void d(int i) {
    }

    public void k(int i) {
    }

    public /* synthetic */ t1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    public /* synthetic */ t1(int i, boolean z) {
        this.e = i;
    }

    public t1(int i, long j, TimeUnit timeUnit) {
        this.e = 10;
        timeUnit.getClass();
        this.f = new fg0(k53.h, i, j, timeUnit);
    }

    public t1(TextView textView) {
        this.e = 22;
        this.f = new mj0(textView);
    }

    public t1(EditText editText) {
        this.e = 21;
        this.f = new d31(editText, 15);
    }

    public t1(int i) {
        this.e = i;
        switch (i) {
            case Logger.ERROR /* 6 */:
                this.f = new AtomicReference(null);
                break;
            case 17:
                this.f = new ry2(zm3.i);
                break;
            case 18:
                this.f = new ConcurrentHashMap(16);
                break;
            case 29:
                oo1 oo1Var = new oo1();
                this.f = oo1Var;
                if (!oo1Var.f) {
                    if (oo1Var.g) {
                        ib2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    oo1Var.a();
                    oo1Var.g = true;
                    break;
                }
                break;
            default:
                this.f = new s1(this);
                break;
        }
    }

    public t1(ContentInfo contentInfo) {
        this.e = 14;
        contentInfo.getClass();
        this.f = ob.k(contentInfo);
    }

    public t1(ClipData clipData, int i) {
        this.e = 13;
        this.f = ob.i(clipData, i);
    }

    public void r(int i, r1 r1Var, String str, Bundle bundle) {
    }
}
