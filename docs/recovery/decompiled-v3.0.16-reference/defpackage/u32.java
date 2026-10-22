package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u32 extends hd0 {
    public int g;
    public int i;
    public int k;
    public s32[] f = new s32[16];
    public int[] h = new int[16];
    public Object[] j = new Object[16];

    public final void S() {
        this.g = 0;
        this.i = 0;
        Arrays.fill(this.j, 0, this.k, (Object) null);
        this.k = 0;
    }

    public final void T(un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) throws IllegalAccessException, InvocationTargetException {
        if (this.g != 0) {
            jv0 jv0Var = new jv0(this);
            u32 u32Var = (u32) jv0Var.e;
            while (true) {
                s32 s32Var = u32Var.f[jv0Var.b];
                iv0 iv0VarB = s32Var.b(jv0Var);
                un unVar2 = unVar;
                kx2 kx2Var2 = kx2Var;
                lj ljVar2 = ljVar;
                t32 t32Var2 = t32Var;
                try {
                    s32Var.a(jv0Var, unVar2, kx2Var2, ljVar2, t32Var2);
                    int i = jv0Var.b;
                    int i2 = u32Var.g;
                    if (i < i2) {
                        s32 s32Var2 = u32Var.f[i];
                        jv0Var.c += s32Var2.a;
                        jv0Var.d += s32Var2.b;
                        int i3 = i + 1;
                        jv0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        unVar = unVar2;
                        kx2Var = kx2Var2;
                        ljVar = ljVar2;
                        t32Var = t32Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (t32Var2 == null) {
                        throw th;
                    }
                    o51.H(th, new a6(iv0VarB, kx2Var2, t32Var2, 15));
                    throw th;
                }
            }
        }
        S();
    }

    public final boolean U() {
        return this.g == 0;
    }

    public final void V(s32 s32Var) {
        int i = this.g;
        s32[] s32VarArr = this.f;
        int length = s32VarArr.length;
        int i2 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i == length) {
            s32[] s32VarArr2 = new s32[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(s32VarArr, 0, s32VarArr2, 0, i);
            this.f = s32VarArr2;
        }
        int i3 = this.i;
        int i4 = s32Var.a;
        int i5 = s32Var.b;
        int i6 = i3 + i4;
        int[] iArr = this.h;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            yo.k0(0, 0, length2, iArr, iArr2);
            this.h = iArr2;
        }
        int i8 = this.k + i5;
        Object[] objArr = this.j;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.j = objArr2;
        }
        s32[] s32VarArr3 = this.f;
        int i10 = this.g;
        this.g = i10 + 1;
        s32VarArr3[i10] = s32Var;
        this.i += s32Var.a;
        this.k += i5;
    }
}
