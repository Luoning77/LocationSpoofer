package kotlinx.coroutines;

import defpackage.ca0;
import defpackage.l13;
import defpackage.x70;
import defpackage.y70;
import defpackage.z;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoroutineId extends z implements ThreadContextElement<String> {
    public static final Key Key = new Key(null);
    private final long id;

    public CoroutineId(long j) {
        super(Key);
        this.id = j;
    }

    public static /* synthetic */ CoroutineId copy$default(CoroutineId coroutineId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineId.id;
        }
        return coroutineId.copy(j);
    }

    public final long component1() {
        return this.id;
    }

    public final CoroutineId copy(long j) {
        return new CoroutineId(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.id == ((CoroutineId) obj).id;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(y70 y70Var, String str) {
        Thread.currentThread().setName(str);
    }

    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public String updateThreadContext(y70 y70Var) {
        String name;
        CoroutineName coroutineName = (CoroutineName) y70Var.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iL0 = l13.l0(6, name2, " @");
        if (iL0 < 0) {
            iL0 = name2.length();
        }
        StringBuilder sb = new StringBuilder(name.length() + iL0 + 10);
        sb.append(name2.substring(0, iL0));
        sb.append(" @");
        sb.append(name);
        sb.append('#');
        sb.append(this.id);
        threadCurrentThread.setName(sb.toString());
        return name2;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key implements x70 {
        public /* synthetic */ Key(ca0 ca0Var) {
            this();
        }

        private Key() {
        }
    }
}
