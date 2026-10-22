package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e1 {
    public Object a;
    public Object b;

    public e1() {
        this.b = new int[2];
    }

    public void c() {
        ae aeVar = (ae) this.a;
        if (aeVar != null) {
            try {
                ((zk) this.b).o.unregisterReceiver(aeVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof q23)) {
            return menuItem;
        }
        q23 q23Var = (q23) menuItem;
        tv2 tv2Var = (tv2) this.b;
        if (tv2Var == null) {
            tv2Var = new tv2(0);
            this.b = tv2Var;
        }
        MenuItem menuItem2 = (MenuItem) tv2Var.get(q23Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zs1 zs1Var = new zs1((Context) this.a, q23Var);
        ((tv2) this.b).put(q23Var, zs1Var);
        return zs1Var;
    }

    public int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        o51.F("text");
        throw null;
    }

    public abstract void j();

    public abstract int[] k(int i);

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        ae aeVar = (ae) this.a;
        if (aeVar == null) {
            aeVar = new ae(this, 1);
            this.a = aeVar;
        }
        ((zk) this.b).o.registerReceiver(aeVar, intentFilterD);
    }

    public e1(Context context) {
        this.a = context;
    }

    public e1(zk zkVar) {
        this.b = zkVar;
    }
}
