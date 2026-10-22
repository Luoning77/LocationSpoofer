package kotlinx.coroutines.internal;

import defpackage.az;
import defpackage.az2;
import defpackage.j41;
import defpackage.k41;
import defpackage.lu0;
import defpackage.mh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final lu0 create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    public OnDemandAllocatingPool(int i, lu0 lu0Var) {
        this.maxCapacity = i;
        this.create = lu0Var;
        this.elements = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i) {
        return (Integer.MIN_VALUE & i) != 0;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, i + 1));
        getElements().set(i, this.create.invoke(Integer.valueOf(i)));
        return true;
    }

    public final List<T> close() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        k41 k41VarF0 = mh0.f0(0, i);
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator<T> it = k41VarF0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j41) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i = controlState$volatile$FU.get(this);
        k41 k41VarF0 = mh0.f0(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
        Iterator<T> it = k41VarF0.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((j41) it).nextInt()));
        }
        return az2.y(arrayList.toString(), (i & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
