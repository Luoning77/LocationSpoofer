package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fz0 extends i53 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz0(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.i53
    public final long a() {
        int i;
        long jA;
        sz0[] sz0VarArr;
        switch (this.e) {
            case 0:
                lz0 lz0Var = (lz0) this.f;
                lz0Var.e.a(lz0Var, (qt2) ((we2) this.g).e);
                return -1L;
            case 1:
                try {
                    ((lz0) this.f).e.b((sz0) this.g);
                    break;
                } catch (IOException e) {
                    l82 l82Var = l82.a;
                    l82 l82Var2 = l82.a;
                    String str = "Http2Connection.Listener failure for " + ((lz0) this.f).g;
                    l82Var2.getClass();
                    l82.i(str, 4, e);
                    try {
                        ((sz0) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                bn bnVar = (bn) this.f;
                qt2 qt2Var = (qt2) this.g;
                we2 we2Var = new we2();
                lz0 lz0Var2 = (lz0) bnVar.f;
                synchronized (lz0Var2.A) {
                    try {
                        synchronized (lz0Var2) {
                            try {
                                qt2 qt2Var2 = lz0Var2.u;
                                qt2 qt2Var3 = new qt2();
                                qt2Var2.getClass();
                                i = 0;
                                for (int i2 = 0; i2 < 10; i2++) {
                                    if (((1 << i2) & qt2Var2.a) != 0) {
                                        qt2Var3.b(i2, qt2Var2.b[i2]);
                                    }
                                }
                                for (int i3 = 0; i3 < 10; i3++) {
                                    if (((1 << i3) & qt2Var.a) != 0) {
                                        qt2Var3.b(i3, qt2Var.b[i3]);
                                    }
                                }
                                we2Var.e = qt2Var3;
                                jA = ((long) qt2Var3.a()) - ((long) qt2Var2.a());
                                sz0VarArr = (jA == 0 || lz0Var2.f.isEmpty()) ? null : (sz0[]) lz0Var2.f.values().toArray(new sz0[0]);
                                qt2 qt2Var4 = (qt2) we2Var.e;
                                qt2Var4.getClass();
                                lz0Var2.u = qt2Var4;
                                lz0Var2.n.c(new fz0(lz0Var2.g + " onSettings", lz0Var2, we2Var, i), 0L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            lz0Var2.A.A((qt2) we2Var.e);
                        } catch (IOException e2) {
                            lz0Var2.A(2, 2, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (sz0VarArr != null) {
                    int length = sz0VarArr.length;
                    while (i < length) {
                        sz0 sz0Var = sz0VarArr[i];
                        synchronized (sz0Var) {
                            sz0Var.f += jA;
                            if (jA > 0) {
                                sz0Var.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
