package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
    public static final class AnonymousClass1<T, C extends Collection<? super T>> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.toCollection(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, final C c, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Collection collection = (Collection) anonymousClass1.L$0;
            ee0.J(obj);
            return collection;
        }
        ee0.J(obj);
        FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CollectionKt.toCollection.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, q60 q60Var2) {
                c.add(t);
                return mf3.a;
            }
        };
        anonymousClass1.L$0 = c;
        anonymousClass1.label = 1;
        Object objCollect = flow.collect(flowCollector, anonymousClass1);
        z70 z70Var = z70.e;
        return objCollect == z70Var ? z70Var : c;
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, q60 q60Var) {
        return FlowKt.toCollection(flow, list, q60Var);
    }

    public static /* synthetic */ Object toList$default(Flow flow, List list, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return FlowKt.toList(flow, list, q60Var);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, q60 q60Var) {
        return FlowKt.toCollection(flow, set, q60Var);
    }

    public static /* synthetic */ Object toSet$default(Flow flow, Set set, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return FlowKt.toSet(flow, set, q60Var);
    }
}
