package defpackage;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x50 {
    public final jt a;
    public final CancellableContinuationImpl b;

    public x50(jt jtVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = jtVar;
        this.b = cancellableContinuationImpl;
    }

    public final String toString() {
        CancellableContinuationImpl cancellableContinuationImpl = this.b;
        CoroutineName coroutineName = (CoroutineName) cancellableContinuationImpl.getContext().get(CoroutineName.Key);
        String name = coroutineName != null ? coroutineName.getName() : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        xp1.m(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(name != null ? az2.k("[", name, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(cancellableContinuationImpl);
        sb.append(')');
        return sb.toString();
    }
}
