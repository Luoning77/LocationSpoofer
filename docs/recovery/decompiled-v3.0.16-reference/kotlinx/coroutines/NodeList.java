package kotlinx.coroutines;

import defpackage.az2;
import defpackage.o51;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public final String getString(String str) {
        StringBuilder sbQ = az2.q("List{", str, "}[");
        Object next = getNext();
        next.getClass();
        boolean z = true;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !o51.f(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                if (z) {
                    z = false;
                } else {
                    sbQ.append(", ");
                }
                sbQ.append(nextNode);
            }
        }
        sbQ.append("]");
        return sbQ.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this;
    }
}
