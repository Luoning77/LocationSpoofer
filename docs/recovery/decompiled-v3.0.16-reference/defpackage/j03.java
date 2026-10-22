package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j03 extends pq {
    public final GestureDetector i;

    public j03(Context context, pd pdVar) {
        super(context, pdVar);
        this.i = new GestureDetector(context, new h03(this));
    }

    @Override // defpackage.pq
    public final boolean a(MotionEvent motionEvent) {
        return this.i.onTouchEvent(motionEvent);
    }
}
