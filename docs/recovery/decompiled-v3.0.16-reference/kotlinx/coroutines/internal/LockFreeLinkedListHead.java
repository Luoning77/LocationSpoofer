package kotlinx.coroutines.internal;

import defpackage.lu0;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    public final void forEach(lu0 lu0Var) {
        Object next = getNext();
        next.getClass();
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !o51.f(nextNode, this); nextNode = nextNode.getNextNode()) {
            lu0Var.invoke(nextNode);
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo89remove() {
        return ((Boolean) remove()).booleanValue();
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed");
    }
}
