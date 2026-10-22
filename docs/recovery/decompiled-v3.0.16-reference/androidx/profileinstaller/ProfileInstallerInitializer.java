package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.fx0;
import defpackage.k21;
import defpackage.k91;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ProfileInstallerInitializer implements k21 {
    @Override // defpackage.k21
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.k21
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new fx0(this, context.getApplicationContext()));
        return new k91(22);
    }
}
