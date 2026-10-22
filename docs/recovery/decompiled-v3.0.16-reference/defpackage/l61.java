package defpackage;

import android.content.Intent;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l61 implements m61 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ JobIntentService c;

    public l61(JobIntentService jobIntentService, Intent intent, int i) {
        this.c = jobIntentService;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.m61
    public final void complete() {
        this.c.stopSelf(this.b);
    }

    @Override // defpackage.m61
    public final Intent getIntent() {
        return this.a;
    }
}
