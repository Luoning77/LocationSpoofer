package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x80 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public wb3 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ii2 i;
    public final /* synthetic */ lu0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x80(int i, q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        super(2, q60Var);
        this.e = i;
        this.i = ii2Var;
        this.j = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                x80 x80Var = new x80(0, q60Var, this.j, this.i);
                x80Var.h = obj;
                return x80Var;
            default:
                x80 x80Var2 = new x80(1, q60Var, this.j, this.i);
                x80Var2.h = obj;
                return x80Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        xb3 xb3Var = (xb3) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((x80) create(xb3Var, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[PHI: r0 r1
      0x0085: PHI (r0v16 wb3) = (r0v15 wb3), (r0v15 wb3), (r0v22 wb3) binds: [B:23:0x0072, B:25:0x0082, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r1v12 xb3) = (r1v11 xb3), (r1v11 xb3), (r1v18 xb3) binds: [B:23:0x0072, B:25:0x0082, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[PHI: r0 r14
      0x0099: PHI (r0v18 xb3) = (r0v17 xb3), (r0v24 xb3) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r14v32 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:28:0x0096, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[PHI: r0 r1
      0x0130: PHI (r0v4 wb3) = (r0v3 wb3), (r0v3 wb3), (r0v10 wb3) binds: [B:58:0x011d, B:60:0x012d, B:50:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r1v3 xb3) = (r1v2 xb3), (r1v2 xb3), (r1v9 xb3) binds: [B:58:0x011d, B:60:0x012d, B:50:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0145 A[PHI: r0 r14
      0x0145: PHI (r0v6 xb3) = (r0v5 xb3), (r0v12 xb3) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r14v12 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:63:0x0142, B:49:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        wb3 wb3Var;
        xb3 xb3Var;
        wb3 wb3Var2;
        xb3 xb3Var2;
        Boolean boolC;
        Object obj2;
        wb3 wb3Var3;
        xb3 xb3Var3;
        wb3 wb3Var4;
        xb3 xb3Var4;
        Boolean boolC2;
        Object obj3;
        int i = this.e;
        wb3 wb3Var5 = wb3.f;
        z70 z70Var = z70.e;
        ii2 ii2Var = this.i;
        lu0 lu0Var = this.j;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ee0.J(obj);
                    xb3 xb3Var5 = (xb3) this.h;
                    this.h = xb3Var5;
                    this.f = wb3Var5;
                    this.g = 1;
                    Boolean boolC3 = xb3Var5.c(this);
                    if (boolC3 != z70Var) {
                        wb3Var = wb3Var5;
                        xb3Var = xb3Var5;
                        obj = boolC3;
                    }
                    return z70Var;
                }
                if (i2 == 1) {
                    wb3 wb3Var6 = this.f;
                    xb3 xb3Var6 = (xb3) this.h;
                    ee0.J(obj);
                    wb3Var = wb3Var6;
                    xb3Var = xb3Var6;
                } else {
                    if (i2 == 2) {
                        wb3Var2 = this.f;
                        xb3Var = (xb3) this.h;
                        ee0.J(obj);
                        wb3 wb3Var7 = wb3Var2;
                        xb3Var2 = xb3Var;
                        w80 w80Var = new w80(null, lu0Var, 0);
                        this.h = xb3Var2;
                        this.f = null;
                        this.g = 3;
                        obj = xb3Var2.a(wb3Var7, w80Var, this);
                        if (obj != z70Var) {
                            this.h = obj;
                            this.g = 4;
                            boolC = xb3Var2.c(this);
                            if (boolC != z70Var) {
                                Object obj4 = obj;
                                obj = boolC;
                                obj2 = obj4;
                            }
                        }
                        return z70Var;
                    }
                    if (i2 == 3) {
                        xb3Var2 = (xb3) this.h;
                        ee0.J(obj);
                        this.h = obj;
                        this.g = 4;
                        boolC = xb3Var2.c(this);
                        if (boolC != z70Var) {
                            Object obj5 = obj;
                            obj = boolC;
                            obj2 = obj5;
                        }
                        return z70Var;
                    }
                    if (i2 != 4) {
                        if (i2 == 5) {
                            ee0.J(obj);
                            return obj;
                        }
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.h;
                    ee0.J(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    a61 invalidationTracker = ii2Var.getInvalidationTracker();
                    invalidationTracker.c.c(invalidationTracker.f, invalidationTracker.g);
                }
                return obj2;
                wb3Var2 = wb3Var;
                if (((Boolean) obj).booleanValue()) {
                    wb3 wb3Var8 = wb3Var2;
                    xb3Var2 = xb3Var;
                    w80 w80Var2 = new w80(null, lu0Var, 0);
                    this.h = xb3Var2;
                    this.f = null;
                    this.g = 3;
                    obj = xb3Var2.a(wb3Var8, w80Var2, this);
                    if (obj != z70Var) {
                        this.h = obj;
                        this.g = 4;
                        boolC = xb3Var2.c(this);
                        if (boolC != z70Var) {
                            Object obj6 = obj;
                            obj = boolC;
                            obj2 = obj6;
                            if (!((Boolean) obj).booleanValue()) {
                                a61 invalidationTracker2 = ii2Var.getInvalidationTracker();
                                invalidationTracker2.c.c(invalidationTracker2.f, invalidationTracker2.g);
                            }
                            return obj2;
                        }
                    }
                } else {
                    a61 invalidationTracker3 = ii2Var.getInvalidationTracker();
                    this.h = xb3Var;
                    this.f = wb3Var2;
                    this.g = 2;
                    if (invalidationTracker3.b(this) != z70Var) {
                        wb3 wb3Var9 = wb3Var2;
                        xb3Var2 = xb3Var;
                        w80 w80Var3 = new w80(null, lu0Var, 0);
                        this.h = xb3Var2;
                        this.f = null;
                        this.g = 3;
                        obj = xb3Var2.a(wb3Var9, w80Var3, this);
                        if (obj != z70Var) {
                            this.h = obj;
                            this.g = 4;
                            boolC = xb3Var2.c(this);
                            if (boolC != z70Var) {
                                Object obj7 = obj;
                                obj = boolC;
                                obj2 = obj7;
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
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ee0.J(obj);
                    xb3 xb3Var7 = (xb3) this.h;
                    this.h = xb3Var7;
                    this.f = wb3Var5;
                    this.g = 1;
                    Boolean boolC4 = xb3Var7.c(this);
                    if (boolC4 != z70Var) {
                        wb3Var3 = wb3Var5;
                        xb3Var3 = xb3Var7;
                        obj = boolC4;
                    }
                    return z70Var;
                }
                if (i3 == 1) {
                    wb3 wb3Var10 = this.f;
                    xb3 xb3Var8 = (xb3) this.h;
                    ee0.J(obj);
                    wb3Var3 = wb3Var10;
                    xb3Var3 = xb3Var8;
                } else {
                    if (i3 == 2) {
                        wb3Var4 = this.f;
                        xb3Var3 = (xb3) this.h;
                        ee0.J(obj);
                        wb3 wb3Var11 = wb3Var4;
                        xb3Var4 = xb3Var3;
                        w80 w80Var4 = new w80(null, lu0Var, 1);
                        this.h = xb3Var4;
                        this.f = null;
                        this.g = 3;
                        obj = xb3Var4.a(wb3Var11, w80Var4, this);
                        if (obj != z70Var) {
                            this.h = obj;
                            this.g = 4;
                            boolC2 = xb3Var4.c(this);
                            if (boolC2 != z70Var) {
                                Object obj8 = obj;
                                obj = boolC2;
                                obj3 = obj8;
                            }
                        }
                        return z70Var;
                    }
                    if (i3 == 3) {
                        xb3Var4 = (xb3) this.h;
                        ee0.J(obj);
                        this.h = obj;
                        this.g = 4;
                        boolC2 = xb3Var4.c(this);
                        if (boolC2 != z70Var) {
                            Object obj9 = obj;
                            obj = boolC2;
                            obj3 = obj9;
                        }
                        return z70Var;
                    }
                    if (i3 != 4) {
                        if (i3 == 5) {
                            ee0.J(obj);
                            return obj;
                        }
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.h;
                    ee0.J(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    a61 invalidationTracker5 = ii2Var.getInvalidationTracker();
                    invalidationTracker5.c.c(invalidationTracker5.f, invalidationTracker5.g);
                }
                return obj3;
                wb3Var4 = wb3Var3;
                if (((Boolean) obj).booleanValue()) {
                    wb3 wb3Var12 = wb3Var4;
                    xb3Var4 = xb3Var3;
                    w80 w80Var5 = new w80(null, lu0Var, 1);
                    this.h = xb3Var4;
                    this.f = null;
                    this.g = 3;
                    obj = xb3Var4.a(wb3Var12, w80Var5, this);
                    if (obj != z70Var) {
                        this.h = obj;
                        this.g = 4;
                        boolC2 = xb3Var4.c(this);
                        if (boolC2 != z70Var) {
                            Object obj10 = obj;
                            obj = boolC2;
                            obj3 = obj10;
                            if (!((Boolean) obj).booleanValue()) {
                                a61 invalidationTracker6 = ii2Var.getInvalidationTracker();
                                invalidationTracker6.c.c(invalidationTracker6.f, invalidationTracker6.g);
                            }
                            return obj3;
                        }
                    }
                } else {
                    a61 invalidationTracker7 = ii2Var.getInvalidationTracker();
                    this.h = xb3Var3;
                    this.f = wb3Var4;
                    this.g = 2;
                    if (invalidationTracker7.b(this) != z70Var) {
                        wb3 wb3Var13 = wb3Var4;
                        xb3Var4 = xb3Var3;
                        w80 w80Var6 = new w80(null, lu0Var, 1);
                        this.h = xb3Var4;
                        this.f = null;
                        this.g = 3;
                        obj = xb3Var4.a(wb3Var13, w80Var6, this);
                        if (obj != z70Var) {
                            this.h = obj;
                            this.g = 4;
                            boolC2 = xb3Var4.c(this);
                            if (boolC2 != z70Var) {
                                Object obj11 = obj;
                                obj = boolC2;
                                obj3 = obj11;
                                if (!((Boolean) obj).booleanValue()) {
                                    a61 invalidationTracker8 = ii2Var.getInvalidationTracker();
                                    invalidationTracker8.c.c(invalidationTracker8.f, invalidationTracker8.g);
                                }
                                return obj3;
                            }
                        }
                    }
                }
                return z70Var;
        }
    }
}
