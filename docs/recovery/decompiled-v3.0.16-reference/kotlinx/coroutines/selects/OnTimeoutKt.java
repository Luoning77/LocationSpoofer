package kotlinx.coroutines.selects;

import defpackage.lu0;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OnTimeoutKt {
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, lu0 lu0Var) {
        selectBuilder.invoke(new OnTimeout(j).getSelectClause(), lu0Var);
    }

    /* JADX INFO: renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m102onTimeout8Mi8wO0(SelectBuilder<? super R> selectBuilder, long j, lu0 lu0Var) {
        onTimeout(selectBuilder, DelayKt.m22toDelayMillisLRDsOJo(j), lu0Var);
    }
}
