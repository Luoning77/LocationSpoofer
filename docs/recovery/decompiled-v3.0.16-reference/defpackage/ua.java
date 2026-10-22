package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ua extends bv0 implements qu0 {
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            b81.u();
            return null;
        }
        db dbVar = (db) this.receiver;
        Resources resources = dbVar.getContext().getResources();
        return Boolean.valueOf(mb.a.a(dbVar, null, new j20(new ac0(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((cw2) obj2).a, (lu0) obj3)));
    }
}
