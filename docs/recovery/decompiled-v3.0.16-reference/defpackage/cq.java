package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cq implements es0 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final hs0 q;
    public boolean r;
    public int s;

    public cq(hs0 hs0Var) {
        a aVar = hs0Var.u;
        if (aVar != null) {
            aVar.e.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = hs0Var;
    }

    @Override // defpackage.es0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (gs0.l(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(int i) {
        if (this.g) {
            if (gs0.l(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ms0) arrayList.get(i2)).getClass();
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ms0 ms0Var = (ms0) arrayList.get(size);
            if (ms0Var.b) {
                if (ms0Var.a != 8) {
                    throw null;
                }
                ms0Var.b = false;
                arrayList.remove(size - 1);
                size--;
            }
            size--;
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            fo.n("commit already called");
            return 0;
        }
        if (gs0.l(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new ij1());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        hs0 hs0Var = this.q;
        if (z2) {
            this.s = hs0Var.j.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z) {
            hs0Var.f(this);
        }
        return this.s;
    }

    public final void e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ms0 ms0Var = (ms0) arrayList.get(i);
            switch (ms0Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case Logger.WARN /* 5 */:
                    str2 = "SHOW";
                    break;
                case Logger.ERROR /* 6 */:
                    str2 = "DETACH";
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case mc0.b /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case mc0.c /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + ms0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println((Object) null);
            if (z) {
                if (ms0Var.c != 0 || ms0Var.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(ms0Var.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(ms0Var.d));
                }
                if (ms0Var.e != 0 || ms0Var.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(ms0Var.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(ms0Var.f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(WorkQueueKt.BUFFER_CAPACITY);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
