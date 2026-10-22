package kotlinx.coroutines.selects;

import defpackage.lu0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    private final List<SelectImplementation<R>.ClauseData> clausesToRegister;

    public UnbiasedSelectImplementation(y70 y70Var) {
        super(y70Var);
        this.clausesToRegister = new ArrayList();
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(UnbiasedSelectImplementation<R> unbiasedSelectImplementation, q60 q60Var) {
        unbiasedSelectImplementation.shuffleAndRegisterClauses();
        return super.doSelect(q60Var);
    }

    private final void shuffleAndRegisterClauses() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                SelectImplementation.register$default(this, (SelectImplementation.ClauseData) it.next(), false, 1, null);
            }
            this.clausesToRegister.clear();
        } catch (Throwable th) {
            this.clausesToRegister.clear();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public Object doSelect(q60 q60Var) {
        return doSelect$suspendImpl((UnbiasedSelectImplementation) this, q60Var);
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, lu0 lu0Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lu0Var, selectClause0.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, pu0 pu0Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, pu0Var, selectClause1.getOnCancellationConstructor()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, pu0 pu0Var) {
        this.clausesToRegister.add(new SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, pu0Var, selectClause2.getOnCancellationConstructor()));
    }
}
