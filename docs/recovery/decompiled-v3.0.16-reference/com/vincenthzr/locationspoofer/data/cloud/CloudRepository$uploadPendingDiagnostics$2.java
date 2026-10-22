package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az;
import defpackage.ee0;
import defpackage.fo;
import defpackage.j41;
import defpackage.k33;
import defpackage.k41;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.cloud.CloudRepository$uploadPendingDiagnostics$2", f = "CloudRepository.kt", l = {1507, 1273}, m = "invokeSuspend")
public final class CloudRepository$uploadPendingDiagnostics$2 extends k33 implements pu0 {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ CloudRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudRepository$uploadPendingDiagnostics$2(CloudRepository cloudRepository, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = cloudRepository;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        CloudRepository$uploadPendingDiagnostics$2 cloudRepository$uploadPendingDiagnostics$2 = new CloudRepository$uploadPendingDiagnostics$2(this.this$0, q60Var);
        cloudRepository$uploadPendingDiagnostics$2.L$0 = obj;
        return cloudRepository$uploadPendingDiagnostics$2;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((CloudRepository$uploadPendingDiagnostics$2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #3 {all -> 0x01b6, blocks: (B:16:0x0068, B:18:0x0081, B:27:0x00aa, B:29:0x00b8, B:32:0x00bf, B:33:0x00d7, B:37:0x00ed), top: B:74:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0161 A[Catch: all -> 0x01b2, LOOP:0: B:44:0x015b->B:46:0x0161, LOOP_END, TryCatch #1 {all -> 0x01b2, blocks: (B:7:0x002c, B:43:0x0138, B:44:0x015b, B:46:0x0161, B:47:0x0170, B:49:0x017a, B:50:0x018d, B:52:0x0193, B:53:0x01a1, B:55:0x01ab), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x017a A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:7:0x002c, B:43:0x0138, B:44:0x015b, B:46:0x0161, B:47:0x0170, B:49:0x017a, B:50:0x018d, B:52:0x0193, B:53:0x01a1, B:55:0x01ab), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0193 A[Catch: all -> 0x01b2, LOOP:1: B:50:0x018d->B:52:0x0193, LOOP_END, TryCatch #1 {all -> 0x01b2, blocks: (B:7:0x002c, B:43:0x0138, B:44:0x015b, B:46:0x0161, B:47:0x0170, B:49:0x017a, B:50:0x018d, B:52:0x0193, B:53:0x01a1, B:55:0x01ab), top: B:70:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ab A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #1 {all -> 0x01b2, blocks: (B:7:0x002c, B:43:0x0138, B:44:0x015b, B:46:0x0161, B:47:0x0170, B:49:0x017a, B:50:0x018d, B:52:0x0193, B:53:0x01a1, B:55:0x01ab), top: B:70:0x002c }] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        CloudRepository cloudRepository;
        int i;
        Mutex mutex2;
        Mutex mutex3;
        Mutex mutex4;
        CloudTokens tokens;
        String accessToken;
        long j;
        Object objRequest$default;
        CloudRepository cloudRepository2;
        List<CloudDiagnostic> list;
        JSONArray jSONArray;
        ArrayList arrayList;
        Iterator it;
        Set setN0;
        ArrayList arrayList2;
        Iterator<T> it2;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i2 = this.label;
        z70 z70Var = z70.e;
        try {
            try {
                if (i2 == 0) {
                    ee0.J(obj);
                    Mutex mutex5 = this.this$0.mutex;
                    CloudRepository cloudRepository3 = this.this$0;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex5;
                    this.L$2 = cloudRepository3;
                    this.I$0 = 0;
                    this.label = 1;
                    if (mutex5.lock(null, this) != z70Var) {
                        mutex = mutex5;
                        cloudRepository = cloudRepository3;
                        i = 0;
                    }
                    return z70Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = this.J$0;
                    list = (List) this.L$4;
                    cloudRepository2 = (CloudRepository) this.L$2;
                    mutex3 = (Mutex) this.L$1;
                    try {
                        ee0.J(obj);
                        j = j2;
                        objRequest$default = obj;
                        cloudRepository2.requireValidated(j);
                        jSONArray = ((JSONObject) objRequest$default).getJSONArray("acceptedIds");
                        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
                        arrayList = new ArrayList(az.Y(k41VarF0, 10));
                        it = k41VarF0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(jSONArray.getString(((j41) it).nextInt()));
                        }
                        if (arrayList.size() == list.size()) {
                            setN0 = zy.N0(arrayList);
                            arrayList2 = new ArrayList(az.Y(list, 10));
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((CloudDiagnostic) it2.next()).getId());
                            }
                            if (setN0.equals(zy.N0(arrayList2))) {
                                cloudRepository2.sessionStore.acknowledgeDiagnostics(list);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    mutex4 = mutex3;
                    return mf3.a;
                }
                i = this.I$0;
                cloudRepository = (CloudRepository) this.L$2;
                mutex = (Mutex) this.L$1;
                ee0.J(obj);
                long j3 = cloudRepository.generation.get();
                cloudRepository.requireValidated(j3);
                List<CloudDiagnostic> listPendingDiagnostics = cloudRepository.sessionStore.pendingDiagnostics();
                if (!listPendingDiagnostics.isEmpty()) {
                    long jMonotonicTimeNanos = cloudRepository.sessionStore.monotonicTimeNanos();
                    Long l = cloudRepository.lastDiagnosticUploadAt;
                    if (l != null) {
                        try {
                            long jLongValue = jMonotonicTimeNanos - l.longValue();
                            if (0 > jLongValue || jLongValue >= 60000000000L) {
                                cloudRepository.lastDiagnosticUploadAt = new Long(jMonotonicTimeNanos);
                                tokens = cloudRepository.readTokens();
                                if (tokens == null && (accessToken = tokens.getAccessToken()) != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    ArrayList arrayList3 = new ArrayList(az.Y(listPendingDiagnostics, 10));
                                    Iterator<T> it3 = listPendingDiagnostics.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((CloudDiagnostic) it3.next()).toJson());
                                    }
                                    JSONObject jSONObjectPut = jSONObject.put("events", new JSONArray((Collection) arrayList3));
                                    Long l2 = new Long(5000L);
                                    this.L$0 = null;
                                    this.L$1 = mutex;
                                    this.L$2 = cloudRepository;
                                    this.L$3 = null;
                                    this.L$4 = listPendingDiagnostics;
                                    this.L$5 = null;
                                    this.I$0 = i;
                                    this.I$1 = 0;
                                    this.I$2 = 0;
                                    this.J$0 = j3;
                                    this.J$1 = jMonotonicTimeNanos;
                                    this.label = 2;
                                    j = j3;
                                    CloudRepository cloudRepository4 = cloudRepository;
                                    mutex2 = mutex;
                                    try {
                                        objRequest$default = CloudRepository.request$default(cloudRepository4, "/v2/client/diagnostics", jSONObjectPut, accessToken, null, "POST", null, l2, null, this, 168, null);
                                        if (objRequest$default != z70Var) {
                                            cloudRepository2 = cloudRepository4;
                                            mutex3 = mutex2;
                                            list = listPendingDiagnostics;
                                            cloudRepository2.requireValidated(j);
                                            jSONArray = ((JSONObject) objRequest$default).getJSONArray("acceptedIds");
                                            k41 k41VarF1 = mh0.f0(0, jSONArray.length());
                                            arrayList = new ArrayList(az.Y(k41VarF1, 10));
                                            it = k41VarF1.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(jSONArray.getString(((j41) it).nextInt()));
                                            }
                                            if (arrayList.size() == list.size()) {
                                                setN0 = zy.N0(arrayList);
                                                arrayList2 = new ArrayList(az.Y(list, 10));
                                                it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList2.add(((CloudDiagnostic) it2.next()).getId());
                                                }
                                                if (setN0.equals(zy.N0(arrayList2))) {
                                                    cloudRepository2.sessionStore.acknowledgeDiagnostics(list);
                                                }
                                            }
                                            mutex4 = mutex3;
                                        }
                                        return z70Var;
                                    } catch (Throwable unused2) {
                                        mutex3 = mutex2;
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            mutex3 = mutex;
                        }
                    } else {
                        cloudRepository.lastDiagnosticUploadAt = new Long(jMonotonicTimeNanos);
                        tokens = cloudRepository.readTokens();
                        if (tokens == null) {
                        }
                    }
                    return mf3.a;
                }
                mutex4 = mutex;
            } catch (Throwable unused4) {
                mutex2 = mutex;
            }
            return mf3.a;
        } finally {
            mutex4.unlock(null);
        }
    }
}
