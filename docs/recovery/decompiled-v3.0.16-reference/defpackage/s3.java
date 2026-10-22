package defpackage;

import android.content.Context;
import android.net.Uri;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(ul1 ul1Var, Context context, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 4;
        this.g = ul1Var;
        this.f = context;
        this.h = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new s3((Context) this.f, (Uri) obj3, (String) obj2, q60Var, 0);
            case 1:
                s3 s3Var = new s3((ca2) obj3, (s63) obj2, q60Var);
                s3Var.f = obj;
                return s3Var;
            case 2:
                return new s3((List) this.f, (List) obj3, (ey1) obj2, q60Var, 2);
            case 3:
                return new s3((vp0) this.f, (ny2) obj3, (ey1) obj2, q60Var, 3);
            default:
                return new s3((ul1) obj3, (Context) this.f, (ey1) obj2, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((s3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case 1:
                return ((s3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 2:
                ((s3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            case 3:
                ((s3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            default:
                ((s3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = this.e;
        int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                OutputStream outputStreamOpenOutputStream = ((Context) this.f).getContentResolver().openOutputStream((Uri) obj3);
                if (outputStreamOpenOutputStream == null) {
                    throw new IOException();
                }
                try {
                    byte[] bytes = ((String) obj2).getBytes(sw.a);
                    bytes.getClass();
                    outputStreamOpenOutputStream.write(bytes);
                    outputStreamOpenOutputStream.close();
                    return mf3Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(outputStreamOpenOutputStream, th);
                        throw th2;
                    }
                }
            case 1:
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                ca2 ca2Var = (ca2) obj3;
                s63 s63Var = (s63) obj2;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new n70(ca2Var, s63Var, objArr2 == true ? 1 : 0, i2), 1, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new n70(ca2Var, s63Var, objArr == true ? 1 : 0, 2), 1, null);
            case 2:
                List list = (List) obj3;
                ee0.J(obj);
                lr2 lr2Var = (lr2) ((ey1) obj2).getValue();
                if (lr2Var != null) {
                    lr2Var.f();
                    List list2 = (List) this.f;
                    ArrayList arrayList = new ArrayList(az.Y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CompleteLocation) it.next()).getLocation());
                    }
                    LocationRecord locationRecord = (LocationRecord) zy.u0(arrayList);
                    ld0.r(lr2Var, arrayList, locationRecord != null ? new Double(locationRecord.getLat()) : null, locationRecord != null ? new Double(locationRecord.getLng()) : null);
                    Iterator it2 = zy.D0(list, 20).iterator();
                    while (it2.hasNext()) {
                        o51.p(lr2Var, ((CompleteCollectionRoute) it2.next()).getRoute(), Math.max(8, 160 / Math.max(1, list.size())));
                    }
                    if (!list.isEmpty()) {
                        List<z60> listGeometry = CollectionRouteGeometryKt.geometry(((CompleteCollectionRoute) zy.n0(list)).getRoute());
                        if (!listGeometry.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList(az.Y(listGeometry, 10));
                            for (z60 z60Var : listGeometry) {
                                arrayList2.add(new i52(new Double(z60Var.a), new Double(z60Var.b)));
                            }
                            lr2Var.h(arrayList2, 80, 80, 80, 80);
                        }
                    } else if (locationRecord != null) {
                        lr2Var.i(locationRecord.getLat(), locationRecord.getLng(), new Float(15.0f));
                    }
                }
                return mf3Var;
            case 3:
                ee0.J(obj);
                if (((Boolean) ((ey1) obj2).getValue()).booleanValue()) {
                    vp0.a((vp0) this.f);
                    ny2 ny2Var = (ny2) obj3;
                    if (ny2Var != null) {
                        ((nb0) ny2Var).b();
                    }
                }
                return mf3Var;
            default:
                ee0.J(obj);
                rm1.d((ul1) obj3, (Context) this.f, new i3((ey1) obj2, 19));
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(ca2 ca2Var, s63 s63Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 1;
        this.g = ca2Var;
        this.h = s63Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
