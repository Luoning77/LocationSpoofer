package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z50 extends k33 implements pu0 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ long g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(a60 a60Var, dg3 dg3Var, ot otVar, long j, q60 q60Var) {
        super(2, q60Var);
        this.i = a60Var;
        this.j = dg3Var;
        this.k = otVar;
        this.g = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                z50 z50Var = new z50((a60) this.i, (dg3) obj3, (ot) obj2, this.g, q60Var);
                z50Var.h = obj;
                return z50Var;
            default:
                return new z50((xg3) obj3, (UpdateArtifact) obj2, this.g, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((z50) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b A[Catch: CancellationException -> 0x0052, Exception -> 0x0163, TryCatch #10 {CancellationException -> 0x0052, blocks: (B:14:0x0042, B:61:0x0151, B:64:0x015b, B:65:0x0162, B:21:0x005d, B:24:0x0070, B:27:0x0084, B:30:0x008c, B:32:0x00a6), top: B:136:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [we2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [we2] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        CancellationException cancellationException;
        int i;
        long j;
        xg3 xg3Var;
        File file;
        File file2;
        z92 z92Var;
        tg3 tg3Var;
        we2 we2VarJ;
        File fileB;
        CloudRepository cloudRepository;
        JSONObject jSONObjectPut;
        File file3;
        ?? r7;
        int i2;
        long j2;
        Object objAuthenticatedJson$default;
        ?? r6;
        File file4;
        JSONObject jSONObject;
        SelfHostedUpdates selfHostedUpdates;
        jl0 jl0Var;
        int i3;
        long j3;
        UpdateArtifact updateArtifact;
        File file5;
        Object objI;
        z50 z50Var = this;
        int i4 = z50Var.e;
        mf3 mf3Var = mf3.a;
        ?? r1 = "call to 'resume' before 'invoke' with coroutine";
        z70 z70Var = z70.e;
        Object obj2 = z50Var.j;
        Object obj3 = z50Var.k;
        switch (i4) {
            case 0:
                a60 a60Var = (a60) z50Var.i;
                dt dtVar = a60Var.w;
                int i5 = z50Var.f;
                try {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            ee0.J(obj);
                        } catch (Throwable th) {
                            th = th;
                            cancellationException = null;
                            a60Var.z = false;
                            dtVar.a(cancellationException);
                            a60Var.x = false;
                            throw th;
                        }
                        break;
                    } else {
                        ee0.J(obj);
                        Job job = JobKt.getJob(((CoroutineScope) z50Var.h).getCoroutineContext());
                        try {
                            a60Var.z = true;
                            wo2 wo2Var = a60Var.t;
                            jy1 jy1Var = jy1.e;
                            y50 y50Var = new y50((dg3) obj2, a60Var, (ot) obj3, z50Var.g, job, null);
                            z50Var.f = 1;
                            if (wo2Var.f(jy1Var, y50Var, z50Var) == z70Var) {
                                return z70Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cancellationException = null;
                            a60Var.z = false;
                            dtVar.a(cancellationException);
                            a60Var.x = false;
                            throw th;
                        }
                    }
                    dtVar.b();
                    a60Var.z = false;
                    dtVar.a(null);
                    a60Var.x = false;
                    return mf3Var;
                } catch (CancellationException e) {
                    cancellationException = e;
                    try {
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        a60Var.z = false;
                        dtVar.a(cancellationException);
                        a60Var.x = false;
                        throw th;
                    }
                }
            default:
                UpdateArtifact updateArtifact2 = (UpdateArtifact) obj3;
                xg3 xg3Var2 = (xg3) obj2;
                int i6 = z50Var.f;
                long j4 = z50Var.g;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (i6 == 0) {
                                            we2VarJ = p91.j(obj);
                                            fg3 fg3Var = xg3Var2.g;
                                            CloudRepository cloudRepository2 = xg3Var2.b;
                                            fileB = fg3Var.b(updateArtifact2);
                                            we2VarJ.e = fileB;
                                            r1 = we2VarJ;
                                            if (!cloudRepository2.getState().getValue().getValidated()) {
                                                z50Var.h = we2VarJ;
                                                z50Var.i = fileB;
                                                z50Var.f = 1;
                                                if (cloudRepository2.refreshAccount(z50Var) != z70Var) {
                                                }
                                            }
                                            r1 = we2VarJ;
                                            return z70Var;
                                        }
                                        if (i6 == 1) {
                                            fileB = (File) z50Var.i;
                                            we2 we2Var = (we2) z50Var.h;
                                            ee0.J(obj);
                                            r1 = we2Var;
                                        } else {
                                            if (i6 == 2) {
                                                File file6 = (File) z50Var.i;
                                                we2 we2Var2 = (we2) z50Var.h;
                                                ee0.J(obj);
                                                file4 = file6;
                                                i2 = 3;
                                                j2 = j4;
                                                objAuthenticatedJson$default = obj;
                                                r6 = we2Var2;
                                                try {
                                                    try {
                                                        jSONObject = (JSONObject) objAuthenticatedJson$default;
                                                        ue2 ue2Var = new ue2();
                                                        ue2Var.e = -1;
                                                        selfHostedUpdates = xg3Var2.e;
                                                        i3 = 2;
                                                        try {
                                                            jl0Var = new jl0(ue2Var, xg3Var2, j2, 2);
                                                            xg3Var = xg3Var2;
                                                            j3 = j2;
                                                            try {
                                                                z50Var.h = r6;
                                                                z50Var.i = file4;
                                                                z50Var.f = i2;
                                                                updateArtifact = updateArtifact2;
                                                                if (selfHostedUpdates.download(updateArtifact, jSONObject, file4, jl0Var, z50Var) == z70Var) {
                                                                    file5 = file4;
                                                                    r6 = r6;
                                                                    y70 context = z50Var.getContext();
                                                                    fg3 fg3Var2 = xg3Var.g;
                                                                    vg3 vg3Var = new vg3(context, i3);
                                                                    fg3Var2.getClass();
                                                                    file5.getClass();
                                                                    fg3Var2.e(file5, updateArtifact, vg3Var);
                                                                    z92 z92Var2 = xg3Var.i;
                                                                    a6 a6Var = new a6(xg3Var, file5, updateArtifact, 21);
                                                                    z50Var.h = r6;
                                                                    z50Var.i = null;
                                                                    i = 4;
                                                                    z50Var.f = 4;
                                                                    j = j3;
                                                                    objI = z92Var2.i(j, a6Var, z50Var);
                                                                    if (objI != z70Var) {
                                                                        r1 = r6;
                                                                    }
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                j = j3;
                                                                r6 = r6;
                                                                i = 4;
                                                                r1 = r6;
                                                                file2 = (File) r1.e;
                                                                if (file2 != null) {
                                                                    file2.delete();
                                                                }
                                                                z92Var = xg3Var.i;
                                                                tg3Var = new tg3(xg3Var, e, i);
                                                                z50Var.h = null;
                                                                z50Var.i = null;
                                                                z50Var.f = 5;
                                                                if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                                                    return mf3Var;
                                                                }
                                                                r1 = we2VarJ;
                                                                return z70Var;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            xg3Var = xg3Var2;
                                                            j = j2;
                                                            r6 = r6;
                                                            i = 4;
                                                            r1 = r6;
                                                            file2 = (File) r1.e;
                                                            if (file2 != null) {
                                                                file2.delete();
                                                            }
                                                            z92Var = xg3Var.i;
                                                            tg3Var = new tg3(xg3Var, e, i);
                                                            z50Var.h = null;
                                                            z50Var.i = null;
                                                            z50Var.f = 5;
                                                            if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                                                return mf3Var;
                                                            }
                                                            r1 = we2VarJ;
                                                            return z70Var;
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        xg3Var = xg3Var2;
                                                    }
                                                    r1 = we2VarJ;
                                                    return z70Var;
                                                } catch (CancellationException e5) {
                                                    e = e5;
                                                    r1 = r6;
                                                    file = (File) r1.e;
                                                    if (file != null) {
                                                        file.delete();
                                                    }
                                                    throw e;
                                                }
                                            }
                                            if (i6 == 3) {
                                                file5 = (File) z50Var.i;
                                                we2 we2Var3 = (we2) z50Var.h;
                                                ee0.J(obj);
                                                r6 = we2Var3;
                                                j3 = j4;
                                                updateArtifact = updateArtifact2;
                                                xg3Var = xg3Var2;
                                                i3 = 2;
                                                y70 context2 = z50Var.getContext();
                                                fg3 fg3Var3 = xg3Var.g;
                                                vg3 vg3Var2 = new vg3(context2, i3);
                                                try {
                                                    fg3Var3.getClass();
                                                    file5.getClass();
                                                    fg3Var3.e(file5, updateArtifact, vg3Var2);
                                                    z92 z92Var3 = xg3Var.i;
                                                    a6 a6Var2 = new a6(xg3Var, file5, updateArtifact, 21);
                                                    z50Var.h = r6;
                                                    z50Var.i = null;
                                                    i = 4;
                                                    try {
                                                        z50Var.f = 4;
                                                        j = j3;
                                                        try {
                                                            objI = z92Var3.i(j, a6Var2, z50Var);
                                                            if (objI != z70Var) {
                                                                r1 = r6;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            r1 = r6;
                                                            file2 = (File) r1.e;
                                                            if (file2 != null) {
                                                                file2.delete();
                                                            }
                                                            z92Var = xg3Var.i;
                                                            tg3Var = new tg3(xg3Var, e, i);
                                                            z50Var.h = null;
                                                            z50Var.i = null;
                                                            z50Var.f = 5;
                                                            if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                                                return mf3Var;
                                                            }
                                                            r1 = we2VarJ;
                                                            return z70Var;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        j = j3;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    j = j3;
                                                    r6 = r6;
                                                    i = 4;
                                                    r1 = r6;
                                                    file2 = (File) r1.e;
                                                    if (file2 != null) {
                                                        file2.delete();
                                                    }
                                                    z92Var = xg3Var.i;
                                                    tg3Var = new tg3(xg3Var, e, i);
                                                    z50Var.h = null;
                                                    z50Var.i = null;
                                                    z50Var.f = 5;
                                                    if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                                        return mf3Var;
                                                    }
                                                    r1 = we2VarJ;
                                                    return z70Var;
                                                }
                                                r1 = we2VarJ;
                                                return z70Var;
                                            }
                                            if (i6 != 4) {
                                                if (i6 != 5) {
                                                    fo.n("call to 'resume' before 'invoke' with coroutine");
                                                    return null;
                                                }
                                                ee0.J(obj);
                                                return mf3Var;
                                            }
                                            we2 we2Var4 = (we2) z50Var.h;
                                            ee0.J(obj);
                                            objI = obj;
                                            i = 4;
                                            j = j4;
                                            xg3Var = xg3Var2;
                                            r1 = we2Var4;
                                        }
                                        try {
                                            if (((Boolean) objI).booleanValue()) {
                                                return mf3Var;
                                            }
                                            throw new CancellationException("下载状态已改变");
                                        } catch (Exception e9) {
                                            e = e9;
                                            file2 = (File) r1.e;
                                            if (file2 != null) {
                                                file2.delete();
                                            }
                                            z92Var = xg3Var.i;
                                            tg3Var = new tg3(xg3Var, e, i);
                                            z50Var.h = null;
                                            z50Var.i = null;
                                            z50Var.f = 5;
                                            if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                                return mf3Var;
                                            }
                                            r1 = we2VarJ;
                                            return z70Var;
                                        }
                                        objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/client/download-ticket", null, jSONObjectPut, "POST", null, null, this, 50, null);
                                        z50Var = this;
                                        if (objAuthenticatedJson$default != z70Var) {
                                            r6 = r7;
                                            file4 = file3;
                                            jSONObject = (JSONObject) objAuthenticatedJson$default;
                                            ue2 ue2Var2 = new ue2();
                                            ue2Var2.e = -1;
                                            selfHostedUpdates = xg3Var2.e;
                                            i3 = 2;
                                            jl0Var = new jl0(ue2Var2, xg3Var2, j2, 2);
                                            xg3Var = xg3Var2;
                                            j3 = j2;
                                            z50Var.h = r6;
                                            z50Var.i = file4;
                                            z50Var.f = i2;
                                            updateArtifact = updateArtifact2;
                                            if (selfHostedUpdates.download(updateArtifact, jSONObject, file4, jl0Var, z50Var) == z70Var) {
                                                file5 = file4;
                                                r6 = r6;
                                                y70 context3 = z50Var.getContext();
                                                fg3 fg3Var4 = xg3Var.g;
                                                vg3 vg3Var3 = new vg3(context3, i3);
                                                fg3Var4.getClass();
                                                file5.getClass();
                                                fg3Var4.e(file5, updateArtifact, vg3Var3);
                                                z92 z92Var4 = xg3Var.i;
                                                a6 a6Var3 = new a6(xg3Var, file5, updateArtifact, 21);
                                                z50Var.h = r6;
                                                z50Var.i = null;
                                                i = 4;
                                                z50Var.f = 4;
                                                j = j3;
                                                objI = z92Var4.i(j, a6Var3, z50Var);
                                                if (objI != z70Var) {
                                                    r1 = r6;
                                                    if (((Boolean) objI).booleanValue()) {
                                                        return mf3Var;
                                                    }
                                                    throw new CancellationException("下载状态已改变");
                                                }
                                            }
                                        }
                                    } catch (CancellationException e10) {
                                        e = e10;
                                        r1 = r7;
                                        file = (File) r1.e;
                                        if (file != null) {
                                            file.delete();
                                        }
                                        throw e;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z50Var = this;
                                        xg3Var = xg3Var2;
                                        j = j2;
                                        i = 4;
                                        r1 = r7;
                                        file2 = (File) r1.e;
                                        if (file2 != null) {
                                            file2.delete();
                                        }
                                        z92Var = xg3Var.i;
                                        tg3Var = new tg3(xg3Var, e, i);
                                        z50Var.h = null;
                                        z50Var.i = null;
                                        z50Var.f = 5;
                                        if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                            return mf3Var;
                                        }
                                        r1 = we2VarJ;
                                        return z70Var;
                                    }
                                    jSONObjectPut = new JSONObject().put("artifactId", updateArtifact2.getId());
                                    z50Var.h = r1;
                                    z50Var.i = fileB;
                                    z50Var.f = 2;
                                    file3 = fileB;
                                    r7 = r1;
                                    i2 = 3;
                                    j2 = j4;
                                } catch (Exception e12) {
                                    e = e12;
                                    j = j4;
                                    xg3Var = xg3Var2;
                                    i = 4;
                                }
                                r1 = we2VarJ;
                                cloudRepository = xg3Var2.b;
                            } catch (CancellationException e13) {
                                e = e13;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            i = 4;
                            j = j4;
                            xg3Var = xg3Var2;
                            file2 = (File) r1.e;
                            if (file2 != null) {
                                file2.delete();
                            }
                            z92Var = xg3Var.i;
                            tg3Var = new tg3(xg3Var, e, i);
                            z50Var.h = null;
                            z50Var.i = null;
                            z50Var.f = 5;
                            if (z92Var.i(j, tg3Var, z50Var) != z70Var) {
                                return mf3Var;
                            }
                            r1 = we2VarJ;
                            return z70Var;
                        }
                        break;
                    } catch (Exception e15) {
                        e = e15;
                    }
                    r1 = we2VarJ;
                    return z70Var;
                } catch (CancellationException e16) {
                    e = e16;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(xg3 xg3Var, UpdateArtifact updateArtifact, long j, q60 q60Var) {
        super(2, q60Var);
        this.j = xg3Var;
        this.k = updateArtifact;
        this.g = j;
    }
}
