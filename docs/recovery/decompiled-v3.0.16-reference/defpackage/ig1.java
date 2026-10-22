package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ig1 extends AbstractMap implements Serializable {
    public static final gq0 m = new gq0(12);
    public final boolean f;
    public hg1 g;
    public final hg1 j;
    public gg1 k;
    public gg1 l;
    public int h = 0;
    public int i = 0;
    public final Comparator e = m;

    public ig1(boolean z) {
        this.f = z;
        this.j = new hg1(z);
    }

    public final hg1 a(Object obj, boolean z) {
        int iCompareTo;
        hg1 hg1Var;
        hg1 hg1Var2 = this.g;
        gq0 gq0Var = m;
        Comparator comparator = this.e;
        if (hg1Var2 != null) {
            Comparable comparable = comparator == gq0Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = hg1Var2.j;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return hg1Var2;
                }
                hg1 hg1Var3 = iCompareTo < 0 ? hg1Var2.f : hg1Var2.g;
                if (hg1Var3 == null) {
                    break;
                }
                hg1Var2 = hg1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        hg1 hg1Var4 = hg1Var2;
        if (!z) {
            return null;
        }
        hg1 hg1Var5 = this.j;
        if (hg1Var4 != null) {
            hg1Var = new hg1(this.f, hg1Var4, obj, hg1Var5, hg1Var5.i);
            if (iCompareTo < 0) {
                hg1Var4.f = hg1Var;
            } else {
                hg1Var4.g = hg1Var;
            }
            b(hg1Var4, true);
        } else {
            if (comparator == gq0Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            hg1Var = new hg1(this.f, hg1Var4, obj, hg1Var5, hg1Var5.i);
            this.g = hg1Var;
        }
        this.h++;
        this.i++;
        return hg1Var;
    }

    public final void b(hg1 hg1Var, boolean z) {
        while (hg1Var != null) {
            hg1 hg1Var2 = hg1Var.f;
            hg1 hg1Var3 = hg1Var.g;
            int i = hg1Var2 != null ? hg1Var2.m : 0;
            int i2 = hg1Var3 != null ? hg1Var3.m : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                hg1 hg1Var4 = hg1Var3.f;
                hg1 hg1Var5 = hg1Var3.g;
                int i4 = (hg1Var4 != null ? hg1Var4.m : 0) - (hg1Var5 != null ? hg1Var5.m : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(hg1Var);
                } else {
                    f(hg1Var3);
                    e(hg1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                hg1 hg1Var6 = hg1Var2.f;
                hg1 hg1Var7 = hg1Var2.g;
                int i5 = (hg1Var6 != null ? hg1Var6.m : 0) - (hg1Var7 != null ? hg1Var7.m : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(hg1Var);
                } else {
                    e(hg1Var2);
                    f(hg1Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                hg1Var.m = i + 1;
                if (z) {
                    return;
                }
            } else {
                hg1Var.m = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            hg1Var = hg1Var.e;
        }
    }

    public final void c(hg1 hg1Var, boolean z) {
        hg1 hg1Var2;
        hg1 hg1Var3;
        int i;
        if (z) {
            hg1 hg1Var4 = hg1Var.i;
            hg1Var4.h = hg1Var.h;
            hg1Var.h.i = hg1Var4;
        }
        hg1 hg1Var5 = hg1Var.f;
        hg1 hg1Var6 = hg1Var.g;
        hg1 hg1Var7 = hg1Var.e;
        int i2 = 0;
        if (hg1Var5 == null || hg1Var6 == null) {
            if (hg1Var5 != null) {
                d(hg1Var, hg1Var5);
                hg1Var.f = null;
            } else if (hg1Var6 != null) {
                d(hg1Var, hg1Var6);
                hg1Var.g = null;
            } else {
                d(hg1Var, null);
            }
            b(hg1Var7, false);
            this.h--;
            this.i++;
            return;
        }
        if (hg1Var5.m > hg1Var6.m) {
            hg1 hg1Var8 = hg1Var5.g;
            while (true) {
                hg1 hg1Var9 = hg1Var8;
                hg1Var3 = hg1Var5;
                hg1Var5 = hg1Var9;
                if (hg1Var5 == null) {
                    break;
                } else {
                    hg1Var8 = hg1Var5.g;
                }
            }
        } else {
            hg1 hg1Var10 = hg1Var6.f;
            while (true) {
                hg1Var2 = hg1Var6;
                hg1Var6 = hg1Var10;
                if (hg1Var6 == null) {
                    break;
                } else {
                    hg1Var10 = hg1Var6.f;
                }
            }
            hg1Var3 = hg1Var2;
        }
        c(hg1Var3, false);
        hg1 hg1Var11 = hg1Var.f;
        if (hg1Var11 != null) {
            i = hg1Var11.m;
            hg1Var3.f = hg1Var11;
            hg1Var11.e = hg1Var3;
            hg1Var.f = null;
        } else {
            i = 0;
        }
        hg1 hg1Var12 = hg1Var.g;
        if (hg1Var12 != null) {
            i2 = hg1Var12.m;
            hg1Var3.g = hg1Var12;
            hg1Var12.e = hg1Var3;
            hg1Var.g = null;
        }
        hg1Var3.m = Math.max(i, i2) + 1;
        d(hg1Var, hg1Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = null;
        this.h = 0;
        this.i++;
        hg1 hg1Var = this.j;
        hg1Var.i = hg1Var;
        hg1Var.h = hg1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        hg1 hg1VarA = null;
        if (obj != null) {
            try {
                hg1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return hg1VarA != null;
    }

    public final void d(hg1 hg1Var, hg1 hg1Var2) {
        hg1 hg1Var3 = hg1Var.e;
        hg1Var.e = null;
        if (hg1Var2 != null) {
            hg1Var2.e = hg1Var3;
        }
        if (hg1Var3 == null) {
            this.g = hg1Var2;
        } else if (hg1Var3.f == hg1Var) {
            hg1Var3.f = hg1Var2;
        } else {
            hg1Var3.g = hg1Var2;
        }
    }

    public final void e(hg1 hg1Var) {
        hg1 hg1Var2 = hg1Var.f;
        hg1 hg1Var3 = hg1Var.g;
        hg1 hg1Var4 = hg1Var3.f;
        hg1 hg1Var5 = hg1Var3.g;
        hg1Var.g = hg1Var4;
        if (hg1Var4 != null) {
            hg1Var4.e = hg1Var;
        }
        d(hg1Var, hg1Var3);
        hg1Var3.f = hg1Var;
        hg1Var.e = hg1Var3;
        int iMax = Math.max(hg1Var2 != null ? hg1Var2.m : 0, hg1Var4 != null ? hg1Var4.m : 0) + 1;
        hg1Var.m = iMax;
        hg1Var3.m = Math.max(iMax, hg1Var5 != null ? hg1Var5.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        gg1 gg1Var = this.k;
        if (gg1Var != null) {
            return gg1Var;
        }
        gg1 gg1Var2 = new gg1(this, 0);
        this.k = gg1Var2;
        return gg1Var2;
    }

    public final void f(hg1 hg1Var) {
        hg1 hg1Var2 = hg1Var.f;
        hg1 hg1Var3 = hg1Var.g;
        hg1 hg1Var4 = hg1Var2.f;
        hg1 hg1Var5 = hg1Var2.g;
        hg1Var.f = hg1Var5;
        if (hg1Var5 != null) {
            hg1Var5.e = hg1Var;
        }
        d(hg1Var, hg1Var2);
        hg1Var2.g = hg1Var;
        hg1Var.e = hg1Var2;
        int iMax = Math.max(hg1Var3 != null ? hg1Var3.m : 0, hg1Var5 != null ? hg1Var5.m : 0) + 1;
        hg1Var.m = iMax;
        hg1Var2.m = Math.max(iMax, hg1Var4 != null ? hg1Var4.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        hg1 hg1VarA;
        if (obj != null) {
            try {
                hg1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                hg1VarA = null;
            }
        } else {
            hg1VarA = null;
        }
        if (hg1VarA != null) {
            return hg1VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        gg1 gg1Var = this.l;
        if (gg1Var != null) {
            return gg1Var;
        }
        gg1 gg1Var2 = new gg1(this, 1);
        this.l = gg1Var2;
        return gg1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            b81.k("key == null");
            return null;
        }
        if (obj2 == null && !this.f) {
            b81.k("value == null");
            return null;
        }
        hg1 hg1VarA = a(obj, true);
        Object obj3 = hg1VarA.l;
        hg1VarA.l = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        hg1 hg1VarA;
        if (obj != null) {
            try {
                hg1VarA = a(obj, false);
            } catch (ClassCastException unused) {
                hg1VarA = null;
            }
        } else {
            hg1VarA = null;
        }
        if (hg1VarA != null) {
            c(hg1VarA, true);
        }
        if (hg1VarA != null) {
            return hg1VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }
}
