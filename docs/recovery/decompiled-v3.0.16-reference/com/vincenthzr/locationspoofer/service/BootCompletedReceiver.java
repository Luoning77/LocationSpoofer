package com.vincenthzr.locationspoofer.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ce1;
import defpackage.fo;
import defpackage.gn;
import defpackage.ig0;
import defpackage.j9;
import defpackage.q60;
import defpackage.t3;
import defpackage.w91;
import defpackage.ye;
import defpackage.zb1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BootCompletedReceiver extends BroadcastReceiver implements w91 {
    public static final /* synthetic */ int b = 0;
    public final zb1 a = ig0.A(ce1.e, new ye(this, 3));

    @Override // defpackage.w91
    public final gn a() {
        gn gnVar = j9.O;
        if (gnVar != null) {
            return gnVar;
        }
        fo.n("KoinApplication has not been started");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 798292259) {
                if (iHashCode != 1737074039 || !action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new t3(intent, goAsync(), this, applicationContext, (q60) null), 3, null);
        }
    }
}
