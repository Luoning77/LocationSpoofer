package defpackage;

import android.net.Uri;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o70 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(ProducerScope producerScope, ve2 ve2Var, d31 d31Var, ArrayList arrayList, q60 q60Var) {
        super(2, q60Var);
        this.e = 1;
        this.f = producerScope;
        this.g = ve2Var;
        this.h = d31Var;
        this.i = arrayList;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                o70 o70Var = new o70((ca2) obj4, (s63) obj3, (x73) obj2, q60Var, 0);
                o70Var.f = obj;
                return o70Var;
            case 1:
                return new o70((ProducerScope) this.f, (ve2) obj4, (d31) obj3, (ArrayList) obj2, q60Var);
            default:
                o70 o70Var2 = new o70((ul1) obj4, (Uri) obj3, (lu0) obj2, q60Var, 2);
                o70Var2.f = obj;
                return o70Var2;
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
                ((o70) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((o70) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((o70) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        LocationSpooferDataPackage locationSpooferDataPackageG;
        int i = this.e;
        int i2 = 0;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                ca2 ca2Var = (ca2) obj4;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new n70(ca2Var, (s63) obj3, q60Var, i2), 1, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new k(ca2Var, (x73) obj2, q60Var, 16), 1, null);
                break;
            case 1:
                ProducerScope producerScope = (ProducerScope) this.f;
                ee0.J(obj);
                try {
                    yd.h(producerScope, (ve2) obj4, (d31) obj3, (ArrayList) obj2, false);
                } catch (Exception e) {
                    producerScope.close(e);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f;
                ee0.J(obj);
                try {
                    locationSpooferDataPackageG = ig0.G((ul1) obj4, (Uri) obj3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    locationSpooferDataPackageG = null;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new l80((lu0) obj2, locationSpooferDataPackageG, q60Var, 9), 2, null);
                break;
        }
        return mf3Var;
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o70(Object obj, Object obj2, Object obj3, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
