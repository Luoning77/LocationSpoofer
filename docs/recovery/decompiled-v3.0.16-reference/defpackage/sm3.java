package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sm3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final qm3 a(y yVar, a30 a30Var, p10 p10Var) {
        db dbVar;
        qm3 qm3Var;
        Object[] objArr = 0;
        if (dw0.a.compareAndSet(false, true)) {
            Channel channelChannel$default = ChannelKt.Channel$default(1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope((y70) qg.o.getValue()), null, null, new m(channelChannel$default, objArr == true ? 1 : 0, 12), 3, null);
            q9 q9Var = new q9(channelChannel$default, 14);
            synchronized (tx2.c) {
                tx2.i = zy.w0(tx2.i, q9Var);
            }
            tx2.c();
        }
        if (yVar.getChildCount() > 0) {
            View childAt = yVar.getChildAt(0);
            dbVar = childAt instanceof db ? (db) childAt : null;
            if (dbVar != null) {
                dbVar.setComposeViewContext(a30Var);
            }
            if (dbVar == null) {
                dbVar = new db(yVar.getContext(), a30Var);
                yVar.addView(dbVar.getView(), a);
            }
            dbVar.setComposeViewContext(a30Var);
            if (yVar.getComposeViewContext$ui() != null) {
                a30Var.c();
                dbVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = dbVar.getTag(2131230953);
            qm3Var = tag instanceof qm3 ? (qm3) tag : null;
            if (qm3Var == null) {
                qm3Var = new qm3(dbVar, new t30(a30Var.b, new if3(dbVar.getRoot())));
                dbVar.setTag(2131230953, qm3Var);
            }
            qm3Var.b(p10Var);
            dbVar.setFrameEndScheduler$ui(new rm3(a30Var.b));
            return qm3Var;
        }
        yVar.removeAllViews();
        dbVar = null;
        if (dbVar == null) {
            dbVar = new db(yVar.getContext(), a30Var);
            yVar.addView(dbVar.getView(), a);
        }
        dbVar.setComposeViewContext(a30Var);
        if (yVar.getComposeViewContext$ui() != null) {
            a30Var.c();
            dbVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = dbVar.getTag(2131230953);
        if (tag2 instanceof qm3) {
        }
        if (qm3Var == null) {
            qm3Var = new qm3(dbVar, new t30(a30Var.b, new if3(dbVar.getRoot())));
            dbVar.setTag(2131230953, qm3Var);
        }
        qm3Var.b(p10Var);
        dbVar.setFrameEndScheduler$ui(new rm3(a30Var.b));
        return qm3Var;
    }
}
