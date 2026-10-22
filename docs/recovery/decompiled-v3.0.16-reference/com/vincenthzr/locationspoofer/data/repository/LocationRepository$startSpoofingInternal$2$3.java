package com.vincenthzr.locationspoofer.data.repository;

import android.content.Context;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "com.vincenthzr.locationspoofer.data.repository.LocationRepository$startSpoofingInternal$2$3", f = "LocationRepository.kt", l = {250}, m = "invokeSuspend")
public final class LocationRepository$startSpoofingInternal$2$3 extends k33 implements pu0 {
    final /* synthetic */ Context $context;
    final /* synthetic */ Throwable $error;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LocationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepository$startSpoofingInternal$2$3(Throwable th, LocationRepository locationRepository, Context context, q60 q60Var) {
        super(2, q60Var);
        this.$error = th;
        this.this$0 = locationRepository;
        this.$context = context;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        LocationRepository$startSpoofingInternal$2$3 locationRepository$startSpoofingInternal$2$3 = new LocationRepository$startSpoofingInternal$2$3(this.$error, this.this$0, this.$context, q60Var);
        locationRepository$startSpoofingInternal$2$3.L$0 = obj;
        return locationRepository$startSpoofingInternal$2$3;
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((LocationRepository$startSpoofingInternal$2$3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object wg2Var;
        int i = this.label;
        mf3 mf3Var = mf3.a;
        try {
            if (i == 0) {
                ee0.J(obj);
                LocationRepository locationRepository = this.this$0;
                Context context = this.$context;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                Object objStopLocked = locationRepository.stopLocked(context, this);
                z70 z70Var = z70.e;
                if (objStopLocked == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            wg2Var = mf3Var;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        Throwable thA = xg2.a(wg2Var);
        if (thA == null) {
            return null;
        }
        this.$error.addSuppressed(thA);
        return mf3Var;
    }
}
