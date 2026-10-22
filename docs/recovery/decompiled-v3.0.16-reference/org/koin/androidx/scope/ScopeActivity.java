package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.ca0;
import defpackage.fo;
import defpackage.i43;
import defpackage.kn2;
import defpackage.qf;
import defpackage.ye;
import defpackage.zb1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ScopeActivity extends AppCompatActivity implements qf {
    private final zb1 scope$delegate;

    public ScopeActivity(int i) {
        super(i);
        this.scope$delegate = new i43(new ye(this, 7));
    }

    @Override // defpackage.qf
    public kn2 getScope() {
        return (kn2) this.scope$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getScope() != null) {
            return;
        }
        fo.n("Required value was null.");
    }

    public /* synthetic */ ScopeActivity(int i, int i2, ca0 ca0Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ScopeActivity() {
        this(0, 1, null);
    }

    @Override // defpackage.qf
    public void onCloseScope() {
    }
}
