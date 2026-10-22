package defpackage;

import androidx.fragment.app.FragmentActivity;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bh1 extends zg1 {
    public final FragmentActivity a;

    public bh1(FragmentActivity fragmentActivity, oj3 oj3Var) {
        this.a = fragmentActivity;
        oj3Var.getClass();
        b80 b80Var = b80.b;
        b80Var.getClass();
        mn2 mn2Var = new mn2(oj3Var, ah1.c, b80Var);
        ox oxVarA = xe2.a(ah1.class);
        String strB = oxVarA.b();
        if (strB != null) {
        } else {
            fo.i("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(WorkQueueKt.BUFFER_CAPACITY);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        FragmentActivity fragmentActivity = this.a;
        String simpleName = fragmentActivity.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = fragmentActivity.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(fragmentActivity)));
        sb.append("}}");
        return sb.toString();
    }
}
