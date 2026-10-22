package kotlinx.coroutines.selects;

import defpackage.am1;
import defpackage.b81;
import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.y70;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private final y70 context;
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.STATE_REG;
    private List<SelectImplementation<R>.ClauseData> clauses = new ArrayList(2);
    private int indexInSegment = -1;
    private Object internalResult = SelectKt.NO_RESULT;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final qu0 onCancellationConstructor;
        private final Object param;
        private final qu0 processResFunc;
        private final qu0 regFunc;

        public ClauseData(Object obj, qu0 qu0Var, qu0 qu0Var2, Object obj2, Object obj3, qu0 qu0Var3) {
            this.clauseObject = obj;
            this.regFunc = qu0Var;
            this.processResFunc = qu0Var2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qu0Var3;
        }

        public final qu0 createOnCancellationAction(SelectInstance<?> selectInstance, Object obj) {
            qu0 qu0Var = this.onCancellationConstructor;
            if (qu0Var != null) {
                return (qu0) qu0Var.invoke(selectInstance, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, q60 q60Var) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                obj2.getClass();
                return ((lu0) obj2).invoke(q60Var);
            }
            obj2.getClass();
            return ((pu0) obj2).invoke(obj, q60Var);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> selectImplementation) {
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            return ((SelectImplementation) selectImplementation).internalResult == SelectKt.NO_RESULT;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectImplementation<R> selectImplementation, q60 q60Var) {
            super(q60Var);
            this.this$0 = selectImplementation;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {729}, m = "processResultAndInvokeBlockRecoveringException")
    public static final class C01531 extends r60 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01531(SelectImplementation<R> selectImplementation, q60 q60Var) {
            super(q60Var);
            this.this$0 = selectImplementation;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    public SelectImplementation(y70 y70Var) {
        this.context = y70Var;
    }

    private final void checkClauseObject(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == obj) {
                b81.q(obj, "Cannot use select clauses on the same object: ");
                return;
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData clauseData) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        state$volatile$FU.set(this, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(q60 q60Var) {
        Object obj = state$volatile$FU.get(this);
        obj.getClass();
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj2), q60Var);
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, q60 q60Var) {
        return selectImplementation.isSelected() ? selectImplementation.complete(q60Var) : selectImplementation.doSelectSuspend(q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object doSelectSuspend(q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (waitUntilSelected(anonymousClass1) != z70Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ee0.J(obj);
                return obj;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (SelectImplementation) anonymousClass1.L$0;
        ee0.J(obj);
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        Object objComplete = this.complete(anonymousClass1);
        return objComplete == z70Var ? z70Var : objComplete;
    }

    private final SelectImplementation<R>.ClauseData findClause(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((ClauseData) obj3).clauseObject == obj) {
                obj2 = obj3;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Object obj = state$volatile$FU.get(this);
        return obj == SelectKt.STATE_REG || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        return state$volatile$FU.get(this) == SelectKt.STATE_CANCELLED;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processResultAndInvokeBlockRecoveringException(SelectImplementation<R>.ClauseData clauseData, Object obj, q60 q60Var) {
        C01531 c01531;
        if (q60Var instanceof C01531) {
            c01531 = (C01531) q60Var;
            int i = c01531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01531.label = i - Integer.MIN_VALUE;
            } else {
                c01531 = new C01531(this, q60Var);
            }
        } else {
            c01531 = new C01531(this, q60Var);
        }
        Object obj2 = c01531.result;
        int i2 = c01531.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ee0.J(obj2);
                return obj2;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj2);
        Object objProcessResult = clauseData.processResult(obj);
        c01531.label = 1;
        Object objInvokeBlock = clauseData.invokeBlock(objProcessResult, c01531);
        Object obj3 = z70.e;
        return objInvokeBlock == obj3 ? obj3 : objInvokeBlock;
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: register");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
        clauseDataFindClause.getClass();
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        while (true) {
            Object obj3 = state$volatile$FU.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (o51.f(obj3, SelectKt.STATE_COMPLETED) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (o51.f(obj3, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (o51.f(obj3, SelectKt.STATE_REG)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
                    List listF = am1.F(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listF)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    fo.o(obj3, "Unexpected state: ");
                    return 0;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                ArrayList arrayListW0 = zy.w0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, arrayListW0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                    }
                }
                return 1;
            }
            SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
            if (clauseDataFindClause == null) {
                continue;
            } else {
                qu0 qu0VarCreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj3, clauseDataFindClause)) {
                        this.internalResult = obj2;
                        if (SelectKt.tryResume((CancellableContinuation) obj3, qu0VarCreateOnCancellationAction)) {
                            return 0;
                        }
                        this.internalResult = SelectKt.NO_RESULT;
                        return 2;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj3);
            }
        }
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lu0Var.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitUntilSelected(q60 q60Var) {
        mf3 mf3Var;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = SelectKt.STATE_REG;
            mf3Var = mf3.a;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, cancellableContinuationImpl)) {
                        CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl, this);
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof ClauseData) {
                        cancellableContinuationImpl.resume(mf3Var, ((ClauseData) obj).createOnCancellationAction(this, this.internalResult));
                        break;
                    }
                    fo.o(obj, "unexpected state: ");
                    return null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                Symbol symbol2 = SelectKt.STATE_REG;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, symbol2)) {
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            reregisterClause(it.next());
                        }
                        break;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == z70.e ? result : mf3Var;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(q60 q60Var) {
        return doSelect$suspendImpl(this, q60Var);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public y70 getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_COMPLETED) {
                return;
            }
            Symbol symbol = SelectKt.STATE_CANCELLED;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    List<SelectImplementation<R>.ClauseData> list = this.clauses;
                    if (list == null) {
                        return;
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((ClauseData) it.next()).dispose();
                    }
                    this.internalResult = SelectKt.NO_RESULT;
                    this.clauses = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @cc0
    public void onTimeout(long j, lu0 lu0Var) {
        SelectBuilder.DefaultImpls.onTimeout(this, j, lu0Var);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z) {
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z) {
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            list.getClass();
            list.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        return SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, lu0 lu0Var) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lu0Var, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, pu0 pu0Var) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, pu0Var, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, pu0 pu0Var) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, pu0Var, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, pu0 pu0Var) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, pu0Var);
    }
}
