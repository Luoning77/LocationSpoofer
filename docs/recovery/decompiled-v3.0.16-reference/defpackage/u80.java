package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u80 extends k33 implements pu0 {
    public wb3 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ii2 i;
    public final /* synthetic */ m4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(boolean z, ii2 ii2Var, q60 q60Var, m4 m4Var) {
        super(2, q60Var);
        this.h = z;
        this.i = ii2Var;
        this.j = m4Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        u80 u80Var = new u80(this.h, this.i, q60Var, this.j);
        u80Var.g = obj;
        return u80Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((u80) create((xb3) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f A[PHI: r0 r12
      0x008f: PHI (r0v8 xb3) = (r0v5 xb3), (r0v13 xb3) binds: [B:29:0x008c, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r12v14 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:29:0x008c, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        wb3 wb3Var;
        xb3 xb3Var;
        wb3 wb3Var2;
        xb3 xb3Var2;
        xb3 xb3Var3;
        Boolean boolC;
        Object obj2;
        int i = this.f;
        m4 m4Var = this.j;
        q60 q60Var = null;
        ii2 ii2Var = this.i;
        int i2 = 1;
        z70 z70Var = z70.e;
        if (i == 0) {
            ee0.J(obj);
            xb3 xb3Var4 = (xb3) this.g;
            if (!this.h) {
                xb3Var4.getClass();
                return m4Var.invoke(((pd2) xb3Var4).b());
            }
            this.g = xb3Var4;
            wb3Var = wb3.f;
            this.e = wb3Var;
            this.f = 1;
            Boolean boolC2 = xb3Var4.c(this);
            if (boolC2 != z70Var) {
                xb3Var = xb3Var4;
                obj = boolC2;
            }
            return z70Var;
        }
        if (i == 1) {
            wb3Var = this.e;
            xb3Var = (xb3) this.g;
            ee0.J(obj);
        } else {
            if (i == 2) {
                wb3Var = this.e;
                xb3Var3 = (xb3) this.g;
                ee0.J(obj);
                wb3Var2 = wb3Var;
                xb3Var2 = xb3Var3;
                l80 l80Var = new l80(q60Var, m4Var, i2);
                this.g = xb3Var2;
                this.e = null;
                this.f = 3;
                obj = xb3Var2.a(wb3Var2, l80Var, this);
                if (obj != z70Var) {
                    this.g = obj;
                    this.f = 4;
                    boolC = xb3Var2.c(this);
                    if (boolC != z70Var) {
                        Object obj3 = obj;
                        obj = boolC;
                        obj2 = obj3;
                    }
                }
                return z70Var;
            }
            if (i == 3) {
                xb3Var2 = (xb3) this.g;
                ee0.J(obj);
                this.g = obj;
                this.f = 4;
                boolC = xb3Var2.c(this);
                if (boolC != z70Var) {
                    Object obj4 = obj;
                    obj = boolC;
                    obj2 = obj4;
                }
                return z70Var;
            }
            if (i != 4) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.g;
            ee0.J(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            a61 invalidationTracker = ii2Var.getInvalidationTracker();
            invalidationTracker.c.c(invalidationTracker.f, invalidationTracker.g);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            wb3Var2 = wb3Var;
            xb3Var2 = xb3Var;
            l80 l80Var2 = new l80(q60Var, m4Var, i2);
            this.g = xb3Var2;
            this.e = null;
            this.f = 3;
            obj = xb3Var2.a(wb3Var2, l80Var2, this);
            if (obj != z70Var) {
                this.g = obj;
                this.f = 4;
                boolC = xb3Var2.c(this);
                if (boolC != z70Var) {
                    Object obj5 = obj;
                    obj = boolC;
                    obj2 = obj5;
                    if (!((Boolean) obj).booleanValue()) {
                        a61 invalidationTracker2 = ii2Var.getInvalidationTracker();
                        invalidationTracker2.c.c(invalidationTracker2.f, invalidationTracker2.g);
                    }
                    return obj2;
                }
            }
        } else {
            a61 invalidationTracker3 = ii2Var.getInvalidationTracker();
            this.g = xb3Var;
            this.e = wb3Var;
            this.f = 2;
            if (invalidationTracker3.b(this) != z70Var) {
                xb3Var3 = xb3Var;
                wb3Var2 = wb3Var;
                xb3Var2 = xb3Var3;
                l80 l80Var3 = new l80(q60Var, m4Var, i2);
                this.g = xb3Var2;
                this.e = null;
                this.f = 3;
                obj = xb3Var2.a(wb3Var2, l80Var3, this);
                if (obj != z70Var) {
                    this.g = obj;
                    this.f = 4;
                    boolC = xb3Var2.c(this);
                    if (boolC != z70Var) {
                        Object obj6 = obj;
                        obj = boolC;
                        obj2 = obj6;
                        if (!((Boolean) obj).booleanValue()) {
                            a61 invalidationTracker4 = ii2Var.getInvalidationTracker();
                            invalidationTracker4.c.c(invalidationTracker4.f, invalidationTracker4.g);
                        }
                        return obj2;
                    }
                }
            }
        }
        return z70Var;
    }
}
