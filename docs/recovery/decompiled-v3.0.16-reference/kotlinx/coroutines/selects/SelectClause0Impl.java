package kotlinx.coroutines.selects;

import defpackage.ca0;
import defpackage.qu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final qu0 onCancellationConstructor;
    private final qu0 processResFunc;
    private final qu0 regFunc;

    public SelectClause0Impl(Object obj, qu0 qu0Var, qu0 qu0Var2) {
        this.clauseObject = obj;
        this.regFunc = qu0Var;
        this.onCancellationConstructor = qu0Var2;
        this.processResFunc = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public qu0 getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public qu0 getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public qu0 getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, qu0 qu0Var, qu0 qu0Var2, int i, ca0 ca0Var) {
        this(obj, qu0Var, (i & 4) != 0 ? null : qu0Var2);
    }
}
