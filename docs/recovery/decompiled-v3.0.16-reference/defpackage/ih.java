package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ih extends aa1 implements au0 {
    public final /* synthetic */ Context f;
    public final /* synthetic */ lu0 g;
    public final /* synthetic */ mv0 h;
    public final /* synthetic */ tl2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, lu0 lu0Var, mv0 mv0Var, tl2 tl2Var, int i, View view) {
        super(0);
        this.f = context;
        this.g = lu0Var;
        this.h = mv0Var;
        this.i = tl2Var;
        this.j = i;
        this.k = view;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        KeyEvent.Callback callback = this.k;
        callback.getClass();
        return new bj3(this.f, this.g, this.h, this.i, this.j, (t42) callback).getLayoutNode();
    }
}
