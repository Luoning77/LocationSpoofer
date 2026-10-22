package kotlinx.coroutines.selects;

import defpackage.ca0;
import defpackage.qu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {
    private final Object clauseObject;
    private final qu0 onCancellationConstructor;
    private final qu0 processResFunc;
    private final qu0 regFunc;

    public SelectClause1Impl(Object obj, qu0 qu0Var, qu0 qu0Var2, qu0 qu0Var3) {
        this.clauseObject = obj;
        this.regFunc = qu0Var;
        this.processResFunc = qu0Var2;
        this.onCancellationConstructor = qu0Var3;
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

    public /* synthetic */ SelectClause1Impl(Object obj, qu0 qu0Var, qu0 qu0Var2, qu0 qu0Var3, int i, ca0 ca0Var) {
        this(obj, qu0Var, qu0Var2, (i & 8) != 0 ? null : qu0Var3);
    }
}
