package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ul2 implements tl2 {
    public final lu0 e;
    public final zx1 f;
    public zx1 g;

    public ul2(Map map, lu0 lu0Var) {
        zx1 zx1Var;
        this.e = lu0Var;
        if (map == null || map.isEmpty()) {
            zx1Var = null;
        } else {
            zx1Var = new zx1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                zx1Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f = zx1Var;
    }

    @Override // defpackage.tl2
    public final sl2 a(String str, au0 au0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!xp1.C(str.charAt(i))) {
                zx1 zx1Var = this.g;
                if (zx1Var == null) {
                    long[] jArr = hn2.a;
                    zx1Var = new zx1();
                    this.g = zx1Var;
                }
                Object objG = zx1Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    zx1Var.m(str, objG);
                }
                ((List) objG).add(au0Var);
                return new gn(zx1Var, str, au0Var);
            }
        }
        fo.i("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.tl2
    public final boolean b(Object obj) {
        return ((Boolean) this.e.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.tl2
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        zx1 zx1Var = this.f;
        if (zx1Var == null && this.g == null) {
            return vj0.e;
        }
        int i3 = 0;
        int i4 = zx1Var != null ? zx1Var.e : 0;
        zx1 zx1Var2 = this.g;
        HashMap map = new HashMap(i4 + (zx1Var2 != null ? zx1Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (zx1Var != null) {
            Object[] objArr = zx1Var.b;
            Object[] objArr2 = zx1Var.c;
            long[] jArr3 = zx1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        zx1 zx1Var3 = this.g;
        if (zx1Var3 != null) {
            Object[] objArr3 = zx1Var3.b;
            Object[] objArr4 = zx1Var3.c;
            long[] jArr4 = zx1Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((au0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!b(objInvoke)) {
                                            b81.g(wc0.G(objInvoke));
                                            return null;
                                        }
                                        map.put(str, am1.d(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((au0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !b(objInvoke2)) {
                                            b81.g(wc0.G(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.tl2
    public final Object d(String str) {
        zx1 zx1Var = this.f;
        List list = zx1Var != null ? (List) zx1Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && zx1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = zx1Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = zx1Var.c;
            Object obj = objArr[iF];
            zx1Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
