package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fx2 extends vg2 implements pu0 {
    public Object e;
    public Iterator f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Iterator m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(int i, int i2, Iterator it, q60 q60Var) {
        super(2, q60Var);
        this.k = i;
        this.l = i2;
        this.m = it;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        fx2 fx2Var = new fx2(this.k, this.l, this.m, q60Var);
        fx2Var.j = obj;
        return fx2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((fx2) create((ws2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        nh2 nh2Var;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        nh2 nh2Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        ws2 ws2Var = (ws2) this.j;
        int i9 = this.i;
        int i10 = this.l;
        boolean z2 = true;
        int i11 = this.k;
        z70 z70Var = z70.e;
        if (i9 == 0) {
            ee0.J(obj);
            int i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i11 <= 1024) {
                i12 = i11;
            }
            i = i10 - i11;
            Iterator it3 = this.m;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.j = ws2Var;
                            this.e = arrayList;
                            this.f = it2;
                            this.g = i4;
                            this.h = i;
                            this.i = 1;
                            ws2Var.a(arrayList, this);
                            return z70Var;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.j = null;
                    this.e = null;
                    this.f = null;
                    this.g = i4;
                    this.h = i;
                    this.i = 2;
                    ws2Var.a(arrayList, this);
                    return z70Var;
                }
            } else {
                nh2 nh2Var3 = new nh2(new Object[i12], 0);
                i2 = i12;
                i3 = i;
                it = it3;
                nh2Var = nh2Var3;
                while (true) {
                    i6 = nh2Var.f;
                    objArr = nh2Var.e;
                    if (it.hasNext()) {
                        i7 = i2;
                        nh2Var2 = nh2Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (nh2Var.a() != i6) {
                        fo.n("ring buffer is full");
                        return null;
                    }
                    int i13 = nh2Var.g;
                    int i14 = nh2Var.h;
                    objArr[(i13 + i14) % i6] = next2;
                    nh2Var.h = i14 + 1;
                    if (nh2Var.a() != i6) {
                        if (nh2Var.h < i11) {
                            ArrayList arrayList2 = new ArrayList(nh2Var);
                            this.j = ws2Var;
                            this.e = nh2Var;
                            this.f = it;
                            this.g = i2;
                            this.h = i3;
                            this.i = 3;
                            ws2Var.a(arrayList2, this);
                            return z70Var;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (nh2Var.g == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = nh2Var.toArray(new Object[i8]);
                        }
                        nh2Var = new nh2(array, nh2Var.h);
                    }
                    z2 = z;
                }
                if (nh2Var2.h > i10) {
                    ArrayList arrayList3 = new ArrayList(nh2Var2);
                    this.j = ws2Var;
                    this.e = nh2Var2;
                    this.f = null;
                    this.g = i7;
                    this.h = i3;
                    this.i = 4;
                    ws2Var.a(arrayList3, this);
                    return z70Var;
                }
                if (!nh2Var2.isEmpty()) {
                    this.j = null;
                    this.e = null;
                    this.f = null;
                    this.g = i7;
                    this.h = i3;
                    this.i = 5;
                    ws2Var.a(nh2Var2, this);
                    return z70Var;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.h;
                    i2 = this.g;
                    it = this.f;
                    nh2Var = (nh2) this.e;
                    ee0.J(obj);
                    nh2Var.b(i10);
                    while (true) {
                        i6 = nh2Var.f;
                        objArr = nh2Var.e;
                        if (it.hasNext()) {
                            i7 = i2;
                            nh2Var2 = nh2Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (nh2Var.a() != i6) {
                            fo.n("ring buffer is full");
                            return null;
                        }
                        int i15 = nh2Var.g;
                        int i16 = nh2Var.h;
                        objArr[(i15 + i16) % i6] = next2;
                        nh2Var.h = i16 + 1;
                        if (nh2Var.a() != i6) {
                            if (nh2Var.h < i11) {
                                ArrayList arrayList4 = new ArrayList(nh2Var);
                                this.j = ws2Var;
                                this.e = nh2Var;
                                this.f = it;
                                this.g = i2;
                                this.h = i3;
                                this.i = 3;
                                ws2Var.a(arrayList4, this);
                                return z70Var;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (nh2Var.g == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = nh2Var.toArray(new Object[i8]);
                            }
                            nh2Var = new nh2(array, nh2Var.h);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.h;
                    i7 = this.g;
                    nh2Var2 = (nh2) this.e;
                    ee0.J(obj);
                    nh2Var2.b(i10);
                } else {
                    if (i9 != 5) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (nh2Var2.h > i10) {
                    ArrayList arrayList5 = new ArrayList(nh2Var2);
                    this.j = ws2Var;
                    this.e = nh2Var2;
                    this.f = null;
                    this.g = i7;
                    this.h = i3;
                    this.i = 4;
                    ws2Var.a(arrayList5, this);
                    return z70Var;
                }
                if (!nh2Var2.isEmpty()) {
                    this.j = null;
                    this.e = null;
                    this.f = null;
                    this.g = i7;
                    this.h = i3;
                    this.i = 5;
                    ws2Var.a(nh2Var2, this);
                    return z70Var;
                }
            }
            ee0.J(obj);
        } else {
            i5 = this.h;
            i4 = this.g;
            it2 = this.f;
            ee0.J(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.j = ws2Var;
                        this.e = arrayList;
                        this.f = it2;
                        this.g = i4;
                        this.h = i;
                        this.i = 1;
                        ws2Var.a(arrayList, this);
                        return z70Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.j = null;
                this.e = null;
                this.f = null;
                this.g = i4;
                this.h = i;
                this.i = 2;
                ws2Var.a(arrayList, this);
                return z70Var;
            }
        }
        return mf3.a;
    }
}
