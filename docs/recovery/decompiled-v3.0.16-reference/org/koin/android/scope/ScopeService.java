package org.koin.android.scope;

import android.app.Service;
import defpackage.fo;
import defpackage.i43;
import defpackage.kn2;
import defpackage.qf;
import defpackage.ye;
import defpackage.zb1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ScopeService extends Service implements qf {
    private final zb1 scope$delegate = new i43(new ye(this, 22));

    @Override // defpackage.qf
    public kn2 getScope() {
        return (kn2) this.scope$delegate.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (getScope() != null) {
            return;
        }
        fo.n("Required value was null.");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        kn2 scope = getScope();
        scope.getClass();
        ye yeVar = new ye(scope, 21);
        synchronized (scope) {
            yeVar.invoke();
        }
    }

    @Override // defpackage.qf
    public void onCloseScope() {
    }
}
