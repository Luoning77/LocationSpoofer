package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ib extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ jb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(jb jbVar, int i) {
        super(1);
        this.f = i;
        this.g = jbVar;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        jb jbVar = this.g;
        switch (i) {
            case 0:
                View view = jbVar.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                zn2 zn2Var = (zn2) obj;
                if (zn2Var.f.contains(zn2Var)) {
                    v42 snapshotObserver = jbVar.h.getSnapshotObserver();
                    snapshotObserver.a.c(zn2Var, jbVar.Q, new ta(1, zn2Var, jbVar));
                }
                return mf3.a;
        }
    }
}
