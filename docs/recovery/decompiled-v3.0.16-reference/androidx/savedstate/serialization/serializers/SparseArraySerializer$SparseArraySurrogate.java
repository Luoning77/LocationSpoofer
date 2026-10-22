package androidx.savedstate.serialization.serializers;

import defpackage.bt2;
import defpackage.ce1;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.ig0;
import defpackage.m30;
import defpackage.n41;
import defpackage.n92;
import defpackage.oo;
import defpackage.y81;
import defpackage.zb1;
import defpackage.zy2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class SparseArraySerializer$SparseArraySurrogate<T> {
    private static final bt2 $cachedDescriptor;
    private final List<Integer> keys;
    private final List<T> values;
    public static final zy2 Companion = new zy2();
    private static final zb1[] $childSerializers = {ig0.A(ce1.f, new a()), null};

    static {
        n92 n92Var = new n92("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        n92Var.k("keys", false);
        n92Var.k("values", false);
        $cachedDescriptor = n92Var;
    }

    public /* synthetic */ SparseArraySerializer$SparseArraySurrogate(int i, List list, List list2, ht2 ht2Var) {
        if (3 != (i & 3)) {
            dh0.K(i, 3, $cachedDescriptor);
            throw null;
        }
        this.keys = list;
        this.values = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_() {
        return new oo(n41.a);
    }

    public static final /* synthetic */ void write$Self$savedstate(SparseArraySerializer$SparseArraySurrogate sparseArraySerializer$SparseArraySurrogate, m30 m30Var, bt2 bt2Var, y81 y81Var) {
        m30Var.r(bt2Var, 0, (y81) $childSerializers[0].getValue(), sparseArraySerializer$SparseArraySurrogate.keys);
        m30Var.r(bt2Var, 1, new oo(y81Var), sparseArraySerializer$SparseArraySurrogate.values);
    }

    public final List<Integer> getKeys() {
        return this.keys;
    }

    public final List<T> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
        list.getClass();
        list2.getClass();
        this.keys = list;
        this.values = list2;
    }
}
