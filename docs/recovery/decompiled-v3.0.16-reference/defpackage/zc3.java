package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zc3 {
    public static final zc3 e = new zc3(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final k91 c;
    public Object[] d;

    public zc3(int i, int i2, Object[] objArr, k91 k91Var) {
        this.a = i;
        this.b = i2;
        this.c = k91Var;
        this.d = objArr;
    }

    public static zc3 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, k91 k91Var) {
        if (i3 > 30) {
            return new zc3(0, 0, new Object[]{obj, obj2, obj3, obj4}, k91Var);
        }
        int iD = a83.d(i, i3);
        int iD2 = a83.d(i2, i3);
        if (iD != iD2) {
            return new zc3((1 << iD) | (1 << iD2), 0, iD < iD2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, k91Var);
        }
        return new zc3(0, 1 << iD, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, k91Var)}, k91Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, k91 k91Var) {
        Object obj3 = this.d[i];
        zc3 zc3VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, k91Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        yo.p0(objArr, objArr2, 0, i, 6);
        yo.n0(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = zc3VarJ;
        yo.n0(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        i41 i41VarC0 = mh0.c0(mh0.f0(0, this.d.length), 2);
        int i = i41VarC0.e;
        int i2 = i41VarC0.f;
        int i3 = i41VarC0.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!o51.f(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iD = 1 << a83.d(i, i2);
        if (h(iD)) {
            return o51.f(obj, this.d[f(iD)]);
        }
        if (!i(iD)) {
            return false;
        }
        zc3 zc3VarS = s(t(iD));
        return i2 == 30 ? zc3VarS.c(obj) : zc3VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(zc3 zc3Var) {
        if (this == zc3Var) {
            return true;
        }
        if (this.b == zc3Var.b && this.a == zc3Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == zc3Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iD = 1 << a83.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (o51.f(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iD)) {
            return null;
        }
        zc3 zc3VarS = s(t(iD));
        if (i2 != 30) {
            return zc3VarS.g(i, i2 + 5, obj);
        }
        i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3VarS.d.length), 2);
        int i3 = i41VarC0.e;
        int i4 = i41VarC0.f;
        int i5 = i41VarC0.g;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!o51.f(obj, zc3VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return zc3VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final zc3 k(int i, o72 o72Var) {
        o72Var.c(o72Var.size() - 1);
        o72Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != o72Var.f) {
            return new zc3(0, 0, a83.h(objArr, i), o72Var.f);
        }
        this.d = a83.h(objArr, i);
        return this;
    }

    public final zc3 l(int i, Object obj, Object obj2, int i2, o72 o72Var) {
        o72 o72Var2;
        zc3 zc3VarL;
        int iD = 1 << a83.d(i, i2);
        boolean zH = h(iD);
        k91 k91Var = this.c;
        if (zH) {
            int iF = f(iD);
            if (!o51.f(obj, this.d[iF])) {
                o72Var.c(o72Var.size() + 1);
                k91 k91Var2 = o72Var.f;
                if (k91Var != k91Var2) {
                    return new zc3(this.a ^ iD, this.b | iD, a(iF, iD, i, obj, obj2, i2, k91Var2), k91Var2);
                }
                this.d = a(iF, iD, i, obj, obj2, i2, k91Var2);
                this.a ^= iD;
                this.b |= iD;
                return this;
            }
            o72Var.h = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (k91Var == o72Var.f) {
                this.d[iF + 1] = obj2;
                return this;
            }
            o72Var.i++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new zc3(this.a, this.b, objArrCopyOf, o72Var.f);
        }
        if (!i(iD)) {
            o72Var.c(o72Var.size() + 1);
            k91 k91Var3 = o72Var.f;
            int iF2 = f(iD);
            Object[] objArr2 = this.d;
            if (k91Var != k91Var3) {
                return new zc3(this.a | iD, this.b, a83.f(objArr2, iF2, obj, obj2), k91Var3);
            }
            this.d = a83.f(objArr2, iF2, obj, obj2);
            this.a |= iD;
            return this;
        }
        int iT = t(iD);
        zc3 zc3VarS = s(iT);
        if (i2 == 30) {
            i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3VarS.d.length), 2);
            int i3 = i41VarC0.e;
            int i4 = i41VarC0.f;
            int i5 = i41VarC0.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!o51.f(obj, zc3VarS.d[i3])) {
                        if (i3 == i4) {
                            o72Var.c(o72Var.size() + 1);
                            zc3VarL = new zc3(0, 0, a83.f(zc3VarS.d, 0, obj, obj2), o72Var.f);
                            break;
                        }
                        i3 += i5;
                    } else {
                        o72Var.h = zc3VarS.x(i3);
                        if (zc3VarS.c != o72Var.f) {
                            o72Var.i++;
                            Object[] objArr3 = zc3VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            zc3VarL = new zc3(0, 0, objArrCopyOf2, o72Var.f);
                            break;
                        }
                        zc3VarS.d[i3 + 1] = obj2;
                        zc3VarL = zc3VarS;
                        break;
                    }
                }
            } else {
                o72Var.c(o72Var.size() + 1);
                zc3VarL = new zc3(0, 0, a83.f(zc3VarS.d, 0, obj, obj2), o72Var.f);
                break;
            }
            o72Var2 = o72Var;
        } else {
            o72Var2 = o72Var;
            zc3VarL = zc3VarS.l(i, obj, obj2, i2 + 5, o72Var2);
        }
        return zc3VarS == zc3VarL ? this : r(iT, zc3VarL, o72Var2.f);
    }

    public final zc3 m(zc3 zc3Var, int i, wb0 wb0Var, o72 o72Var) {
        zc3 zc3Var2;
        Object[] objArr;
        zc3 zc3VarJ;
        o72 o72Var2 = o72Var;
        if (this == zc3Var) {
            wb0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            k91 k91Var = o72Var2.f;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + zc3Var.d.length);
            int length = this.d.length;
            i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3Var.d.length), 2);
            int i3 = i41VarC0.e;
            int i4 = i41VarC0.f;
            int i5 = i41VarC0.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(zc3Var.d[i3])) {
                        wb0Var.a++;
                    } else {
                        Object[] objArr3 = zc3Var.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != zc3Var.d.length) {
                    return length == objArrCopyOf.length ? new zc3(0, 0, objArrCopyOf, k91Var) : new zc3(0, 0, Arrays.copyOf(objArrCopyOf, length), k91Var);
                }
            }
            return this;
        }
        int i6 = this.b | zc3Var.b;
        int i7 = this.a;
        int i8 = zc3Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (o51.f(this.d[f(iLowestOneBit)], zc3Var.d[zc3Var.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            hb2.b("Check failed.");
        }
        if (o51.f(this.c, o72Var2.f) && this.a == i11 && this.b == i6) {
            zc3Var2 = this;
        } else {
            zc3Var2 = new zc3(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = zc3Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(iLowestOneBit2)) {
                zc3VarJ = s(t(iLowestOneBit2));
                if (zc3Var.i(iLowestOneBit2)) {
                    zc3VarJ = zc3VarJ.m(zc3Var.s(zc3Var.t(iLowestOneBit2)), i + 5, wb0Var, o72Var2);
                    objArr = objArr4;
                } else {
                    if (zc3Var.h(iLowestOneBit2)) {
                        int iF = zc3Var.f(iLowestOneBit2);
                        Object obj = zc3Var.d[iF];
                        Object objX = zc3Var.x(iF);
                        int size = o72Var2.size();
                        objArr = objArr4;
                        zc3VarJ = zc3VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, o72Var2);
                        if (o72Var.size() == size) {
                            wb0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                    o72Var2 = o72Var;
                }
            } else {
                objArr = objArr4;
                if (zc3Var.i(iLowestOneBit2)) {
                    zc3 zc3VarS = zc3Var.s(zc3Var.t(iLowestOneBit2));
                    if (h(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i14 = i + 5;
                        if (zc3VarS.d(obj2 != null ? obj2.hashCode() : 0, i14, obj2)) {
                            wb0Var.a++;
                            o72Var2 = o72Var;
                            zc3VarJ = zc3VarS;
                        } else {
                            o72Var2 = o72Var;
                            zc3VarJ = zc3VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i14, o72Var2);
                        }
                    } else {
                        o72Var2 = o72Var;
                        zc3VarJ = zc3VarS;
                    }
                } else {
                    o72Var2 = o72Var;
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = zc3Var.f(iLowestOneBit2);
                    Object obj4 = zc3Var.d[iF4];
                    zc3VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, zc3Var.x(iF4), i + 5, o72Var2.f);
                }
            }
            objArr[length2] = zc3VarJ;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i15 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i16 = i15 * 2;
            if (zc3Var.h(iLowestOneBit3)) {
                int iF5 = zc3Var.f(iLowestOneBit3);
                Object[] objArr5 = zc3Var2.d;
                objArr5[i16] = zc3Var.d[iF5];
                objArr5[i16 + 1] = zc3Var.x(iF5);
                if (h(iLowestOneBit3)) {
                    wb0Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = zc3Var2.d;
                objArr6[i16] = this.d[iF6];
                objArr6[i16 + 1] = x(iF6);
            }
            i15++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(zc3Var2)) {
            return zc3Var.e(zc3Var2) ? zc3Var : zc3Var2;
        }
        return this;
    }

    public final zc3 n(int i, Object obj, int i2, o72 o72Var) {
        zc3 zc3VarN;
        int iD = 1 << a83.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (o51.f(obj, this.d[iF])) {
                return p(iF, iD, o72Var);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            zc3 zc3VarS = s(iT);
            if (i2 == 30) {
                i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3VarS.d.length), 2);
                int i3 = i41VarC0.e;
                int i4 = i41VarC0.f;
                int i5 = i41VarC0.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!o51.f(obj, zc3VarS.d[i3])) {
                            if (i3 == i4) {
                                zc3VarN = zc3VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            zc3VarN = zc3VarS.k(i3, o72Var);
                            break;
                        }
                    }
                } else {
                    zc3VarN = zc3VarS;
                    break;
                }
            } else {
                zc3VarN = zc3VarS.n(i, obj, i2 + 5, o72Var);
            }
            return q(zc3VarS, zc3VarN, iT, iD, o72Var.f);
        }
        return this;
    }

    public final zc3 o(int i, Object obj, Object obj2, int i2, o72 o72Var) {
        o72 o72Var2;
        zc3 zc3VarO;
        int iD = 1 << a83.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            return (o51.f(obj, this.d[iF]) && o51.f(obj2, x(iF))) ? p(iF, iD, o72Var) : this;
        }
        if (!i(iD)) {
            return this;
        }
        int iT = t(iD);
        zc3 zc3VarS = s(iT);
        if (i2 == 30) {
            i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3VarS.d.length), 2);
            int i3 = i41VarC0.e;
            int i4 = i41VarC0.f;
            int i5 = i41VarC0.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!o51.f(obj, zc3VarS.d[i3]) || !o51.f(obj2, zc3VarS.x(i3))) {
                        if (i3 == i4) {
                            zc3VarO = zc3VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        zc3VarO = zc3VarS.k(i3, o72Var);
                        break;
                    }
                }
            } else {
                zc3VarO = zc3VarS;
                break;
            }
            o72Var2 = o72Var;
        } else {
            o72Var2 = o72Var;
            zc3VarO = zc3VarS.o(i, obj, obj2, i2 + 5, o72Var2);
        }
        return q(zc3VarS, zc3VarO, iT, iD, o72Var2.f);
    }

    public final zc3 p(int i, int i2, o72 o72Var) {
        o72Var.c(o72Var.size() - 1);
        o72Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != o72Var.f) {
            return new zc3(i2 ^ this.a, this.b, a83.h(objArr, i), o72Var.f);
        }
        this.d = a83.h(objArr, i);
        this.a ^= i2;
        return this;
    }

    public final zc3 q(zc3 zc3Var, zc3 zc3Var2, int i, int i2, k91 k91Var) {
        k91 k91Var2 = this.c;
        if (zc3Var2 != null) {
            return (k91Var2 == k91Var || zc3Var != zc3Var2) ? r(i, zc3Var2, k91Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (k91Var2 != k91Var) {
            return new zc3(this.a, this.b ^ i2, a83.i(objArr, i), k91Var);
        }
        this.d = a83.i(objArr, i);
        this.b ^= i2;
        return this;
    }

    public final zc3 r(int i, zc3 zc3Var, k91 k91Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && zc3Var.d.length == 2 && zc3Var.b == 0) {
            zc3Var.a = this.b;
            return zc3Var;
        }
        if (this.c == k91Var) {
            objArr[i] = zc3Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = zc3Var;
        return new zc3(this.a, this.b, objArrCopyOf, k91Var);
    }

    public final zc3 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (zc3) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.c = w(r7, r2, (defpackage.zc3) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.x8 u(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc3.u(int, int, java.lang.Object, java.lang.Object):x8");
    }

    public final zc3 v(int i, int i2, Object obj) {
        zc3 zc3VarV;
        int iD = 1 << a83.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (!o51.f(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new zc3(this.a ^ iD, this.b, a83.h(objArr, iF), null);
            }
        } else {
            if (!i(iD)) {
                return this;
            }
            int iT = t(iD);
            zc3 zc3VarS = s(iT);
            if (i2 == 30) {
                i41 i41VarC0 = mh0.c0(mh0.f0(0, zc3VarS.d.length), 2);
                int i3 = i41VarC0.e;
                int i4 = i41VarC0.f;
                int i5 = i41VarC0.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!o51.f(obj, zc3VarS.d[i3])) {
                            if (i3 == i4) {
                                zc3VarV = zc3VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = zc3VarS.d;
                            if (objArr2.length != 2) {
                                zc3VarV = new zc3(0, 0, a83.h(objArr2, i3), null);
                                break;
                            }
                            zc3VarV = null;
                            break;
                        }
                    }
                } else {
                    zc3VarV = zc3VarS;
                    break;
                }
            } else {
                zc3VarV = zc3VarS.v(i, i2 + 5, obj);
            }
            if (zc3VarV != null) {
                return zc3VarS != zc3VarV ? w(iT, iD, zc3VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new zc3(this.a, this.b ^ iD, a83.i(objArr3, iT), null);
            }
        }
        return null;
    }

    public final zc3 w(int i, int i2, zc3 zc3Var) {
        Object[] objArr = zc3Var.d;
        if (objArr.length != 2 || zc3Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = zc3Var;
            return new zc3(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            zc3Var.a = this.b;
            return zc3Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        yo.n0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        yo.n0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new zc3(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
