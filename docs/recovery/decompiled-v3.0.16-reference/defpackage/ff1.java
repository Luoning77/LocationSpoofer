package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ff1 extends xe1 {
    public final boolean b;
    public rm0 c;
    public we1 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final MutableStateFlow j;

    public ff1(df1 df1Var, boolean z) {
        this.a = new t1(6);
        this.b = z;
        this.c = new rm0();
        we1 we1Var = we1.f;
        this.d = we1Var;
        this.i = new ArrayList();
        this.e = new WeakReference(df1Var);
        this.j = StateFlowKt.MutableStateFlow(we1Var);
    }

    @Override // defpackage.xe1
    public final void a(cf1 cf1Var) {
        bf1 ta0Var;
        ef1 ef1Var;
        df1 df1Var;
        ve1 ve1Var;
        cf1Var.getClass();
        d("addObserver");
        we1 we1Var = this.d;
        we1 we1Var2 = we1.e;
        if (we1Var != we1Var2) {
            we1Var2 = we1.f;
        }
        ef1 ef1Var2 = new ef1();
        HashMap map = jf1.a;
        boolean z = cf1Var instanceof bf1;
        boolean z2 = cf1Var instanceof ra0;
        int i = 2;
        Object obj = null;
        int i2 = 0;
        if (z && z2) {
            ta0Var = new ta0(i2, (ra0) cf1Var, (bf1) cf1Var);
        } else if (z2) {
            ta0Var = new ta0(i2, (ra0) cf1Var, obj);
        } else if (z) {
            ta0Var = (bf1) cf1Var;
        } else {
            Class<?> cls = cf1Var.getClass();
            if (jf1.b(cls) == 2) {
                Object obj2 = jf1.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    jf1.a((Constructor) list.get(0), cf1Var);
                    throw null;
                }
                int size = list.size();
                tv0[] tv0VarArr = new tv0[size];
                if (size > 0) {
                    jf1.a((Constructor) list.get(0), cf1Var);
                    throw null;
                }
                ta0Var = new oe2(tv0VarArr, i);
            } else {
                ta0Var = new ta0(cf1Var);
            }
        }
        ef1Var2.b = ta0Var;
        ef1Var2.a = we1Var2;
        rm0 rm0Var = this.c;
        el2 el2Var = (el2) rm0Var.i.get(cf1Var);
        if (el2Var != null) {
            ef1Var = el2Var.f;
        } else {
            HashMap map2 = rm0Var.i;
            el2 el2Var2 = new el2(cf1Var, ef1Var2);
            rm0Var.h++;
            el2 el2Var3 = rm0Var.f;
            if (el2Var3 == null) {
                rm0Var.e = el2Var2;
                rm0Var.f = el2Var2;
            } else {
                el2Var3.g = el2Var2;
                el2Var2.h = el2Var3;
                rm0Var.f = el2Var2;
            }
            map2.put(cf1Var, el2Var2);
            ef1Var = null;
        }
        if (ef1Var == null && (df1Var = (df1) this.e.get()) != null) {
            i2 = (this.f != 0 || this.g) ? 1 : 0;
            we1 we1VarC = c(cf1Var);
            this.f++;
            while (ef1Var2.a.compareTo(we1VarC) < 0 && this.c.i.containsKey(cf1Var)) {
                we1 we1Var3 = ef1Var2.a;
                ArrayList arrayList = this.i;
                arrayList.add(we1Var3);
                te1 te1Var = ve1.Companion;
                we1 we1Var4 = ef1Var2.a;
                te1Var.getClass();
                we1Var4.getClass();
                int iOrdinal = we1Var4.ordinal();
                if (iOrdinal == 1) {
                    ve1Var = ve1.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ve1Var = iOrdinal != 3 ? null : ve1.ON_RESUME;
                } else {
                    ve1Var = ve1.ON_START;
                }
                if (ve1Var == null) {
                    b81.i(ef1Var2.a, "no event up from ");
                    return;
                } else {
                    ef1Var2.a(df1Var, ve1Var);
                    arrayList.remove(arrayList.size() - 1);
                    we1VarC = c(cf1Var);
                }
            }
            if (i2 == 0) {
                g();
            }
            this.f--;
        }
    }

    @Override // defpackage.xe1
    public final void b(cf1 cf1Var) {
        cf1Var.getClass();
        d("removeObserver");
        rm0 rm0Var = this.c;
        WeakHashMap weakHashMap = rm0Var.g;
        HashMap map = rm0Var.i;
        el2 el2Var = (el2) map.get(cf1Var);
        if (el2Var != null) {
            rm0Var.h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((gl2) it.next()).a(el2Var);
                }
            }
            el2 el2Var2 = el2Var.h;
            el2 el2Var3 = el2Var.g;
            if (el2Var2 != null) {
                el2Var2.g = el2Var3;
            } else {
                rm0Var.e = el2Var3;
            }
            el2 el2Var4 = el2Var.g;
            if (el2Var4 != null) {
                el2Var4.h = el2Var2;
            } else {
                rm0Var.f = el2Var2;
            }
            el2Var.g = null;
            el2Var.h = null;
        }
        map.remove(cf1Var);
    }

    public final we1 c(cf1 cf1Var) {
        HashMap map = this.c.i;
        el2 el2Var = map.containsKey(cf1Var) ? ((el2) map.get(cf1Var)).h : null;
        we1 we1Var = el2Var != null ? el2Var.f.a : null;
        ArrayList arrayList = this.i;
        we1 we1Var2 = arrayList.isEmpty() ? null : (we1) arrayList.get(arrayList.size() - 1);
        we1 we1Var3 = this.d;
        we1Var3.getClass();
        if (we1Var == null || we1Var.compareTo(we1Var3) >= 0) {
            we1Var = we1Var3;
        }
        return (we1Var2 == null || we1Var2.compareTo(we1Var) >= 0) ? we1Var : we1Var2;
    }

    public final void d(String str) {
        if (this.b) {
            eo.L().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            b81.g(az2.k("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(ve1 ve1Var) {
        ve1Var.getClass();
        d("handleLifecycleEvent");
        f(ve1Var.a());
    }

    public final void f(we1 we1Var) {
        if (this.d == we1Var) {
            return;
        }
        df1 df1Var = (df1) this.e.get();
        we1 we1Var2 = this.d;
        we1Var2.getClass();
        we1 we1Var3 = we1.f;
        we1 we1Var4 = we1.e;
        if (we1Var2 == we1Var3 && we1Var == we1Var4) {
            throw new IllegalStateException(("State must be at least '" + we1.g + "' to be moved to '" + we1Var + "' in component " + df1Var).toString());
        }
        if (we1Var2 == we1Var4 && we1Var2 != we1Var) {
            throw new IllegalStateException(("State is '" + we1Var4 + "' and cannot be moved to `" + we1Var + "` in component " + df1Var).toString());
        }
        this.d = we1Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        g();
        this.g = false;
        if (this.d == we1Var4) {
            this.c = new rm0();
        }
    }

    public final void g() {
        ve1 ve1Var;
        ve1 ve1Var2;
        df1 df1Var = (df1) this.e.get();
        if (df1Var == null) {
            fo.n("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            rm0 rm0Var = this.c;
            if (rm0Var.h != 0) {
                el2 el2Var = rm0Var.e;
                el2Var.getClass();
                we1 we1Var = el2Var.f.a;
                el2 el2Var2 = this.c.f;
                el2Var2.getClass();
                we1 we1Var2 = el2Var2.f.a;
                if (we1Var == we1Var2 && this.d == we1Var2) {
                    break;
                }
                this.h = false;
                we1 we1Var3 = this.d;
                el2 el2Var3 = this.c.e;
                el2Var3.getClass();
                int iCompareTo = we1Var3.compareTo(el2Var3.f.a);
                ArrayList arrayList = this.i;
                if (iCompareTo < 0) {
                    rm0 rm0Var2 = this.c;
                    dl2 dl2Var = new dl2(rm0Var2.f, rm0Var2.e, 1);
                    rm0Var2.g.put(dl2Var, Boolean.FALSE);
                    while (dl2Var.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) dl2Var.next();
                        entry.getClass();
                        cf1 cf1Var = (cf1) entry.getKey();
                        ef1 ef1Var = (ef1) entry.getValue();
                        while (ef1Var.a.compareTo(this.d) > 0 && !this.h && this.c.i.containsKey(cf1Var)) {
                            te1 te1Var = ve1.Companion;
                            we1 we1Var4 = ef1Var.a;
                            te1Var.getClass();
                            we1Var4.getClass();
                            int iOrdinal = we1Var4.ordinal();
                            if (iOrdinal == 2) {
                                ve1Var2 = ve1.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                ve1Var2 = iOrdinal != 4 ? null : ve1.ON_PAUSE;
                            } else {
                                ve1Var2 = ve1.ON_STOP;
                            }
                            if (ve1Var2 == null) {
                                b81.i(ef1Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(ve1Var2.a());
                                ef1Var.a(df1Var, ve1Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                el2 el2Var4 = this.c.f;
                if (!this.h && el2Var4 != null && this.d.compareTo(el2Var4.f.a) > 0) {
                    rm0 rm0Var3 = this.c;
                    rm0Var3.getClass();
                    fl2 fl2Var = new fl2(rm0Var3);
                    rm0Var3.g.put(fl2Var, Boolean.FALSE);
                    while (fl2Var.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) fl2Var.next();
                        cf1 cf1Var2 = (cf1) entry2.getKey();
                        ef1 ef1Var2 = (ef1) entry2.getValue();
                        while (ef1Var2.a.compareTo(this.d) < 0 && !this.h && this.c.i.containsKey(cf1Var2)) {
                            arrayList.add(ef1Var2.a);
                            te1 te1Var2 = ve1.Companion;
                            we1 we1Var5 = ef1Var2.a;
                            te1Var2.getClass();
                            we1Var5.getClass();
                            int iOrdinal2 = we1Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                ve1Var = ve1.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                ve1Var = iOrdinal2 != 3 ? null : ve1.ON_RESUME;
                            } else {
                                ve1Var = ve1.ON_START;
                            }
                            if (ve1Var == null) {
                                b81.i(ef1Var2.a, "no event up from ");
                                return;
                            } else {
                                ef1Var2.a(df1Var, ve1Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.setValue(this.d);
    }
}
