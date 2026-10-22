package kotlinx.coroutines.selects;

import defpackage.cc0;
import defpackage.lu0;
import defpackage.pu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface SelectBuilder<R> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, pu0 pu0Var) {
            selectBuilder.invoke(selectClause2, null, pu0Var);
        }

        @cc0
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, lu0 lu0Var) {
            OnTimeoutKt.onTimeout(selectBuilder, j, lu0Var);
        }
    }

    void invoke(SelectClause0 selectClause0, lu0 lu0Var);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, pu0 pu0Var);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, pu0 pu0Var);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, pu0 pu0Var);

    @cc0
    void onTimeout(long j, lu0 lu0Var);
}
