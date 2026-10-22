package defpackage;

import android.database.SQLException;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class sy implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sy(s40 s40Var, boolean z) {
        this.e = 1;
        this.g = s40Var;
        this.f = z;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        MutableSharedFlow mutableSharedFlowJ;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ul1 ul1Var = (ul1) obj;
                if (!z) {
                    on1.g(ul1Var);
                }
                return mf3Var;
            case 1:
                s40 s40Var = (s40) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                s40Var.f.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                s40Var.e.d(sb);
                try {
                    mh0.d0(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return mf3Var;
                }
            case 2:
                ie1 ie1Var = (ie1) obj;
                if (z && (mutableSharedFlowJ = ((zd) ie1Var).j()) != null) {
                    mutableSharedFlowJ.tryEmit(mf3Var);
                }
                return mf3Var;
            default:
                ey1 ey1Var = (ey1) obj;
                if (z) {
                    ey1Var.setValue("alipay_app");
                }
                return mf3Var;
        }
    }

    public /* synthetic */ sy(boolean z, Object obj, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
