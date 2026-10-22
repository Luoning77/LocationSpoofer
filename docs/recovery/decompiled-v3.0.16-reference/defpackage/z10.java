package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class z10 implements su0 {
    public final /* synthetic */ int e;

    public /* synthetic */ z10(int i) {
        this.e = i;
    }

    @Override // defpackage.su0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.e;
        int i2 = WorkQueueKt.BUFFER_CAPACITY;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                k63 k63Var = (k63) obj;
                y53 y53Var = (y53) obj2;
                au0 au0Var = (au0) obj3;
                f30 f30Var = (f30) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i3 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((ov0) f30Var).f(k63Var) : ((ov0) f30Var).h(k63Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? ((ov0) f30Var).f(y53Var) : ((ov0) f30Var).h(y53Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (((ov0) f30Var).h(au0Var)) {
                        i2 = 256;
                    }
                    i3 |= i2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
                    ov0Var.W();
                } else {
                    eb0.c(k63Var, y53Var, au0Var, ov0Var, i3 & 1022);
                }
                break;
            case 1:
                k63 k63Var2 = (k63) obj;
                y53 y53Var2 = (y53) obj2;
                au0 au0Var2 = (au0) obj3;
                f30 f30Var2 = (f30) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((ov0) f30Var2).f(k63Var2) : ((ov0) f30Var2).h(k63Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= (iIntValue2 & 64) == 0 ? ((ov0) f30Var2).f(y53Var2) : ((ov0) f30Var2).h(y53Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (((ov0) f30Var2).h(au0Var2)) {
                        i2 = 256;
                    }
                    i4 |= i2;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
                    ov0Var2.W();
                } else {
                    eb0.c(k63Var2, y53Var2, au0Var2, ov0Var2, i4 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((f93) obj5).a;
                String string = ((CharSequence) obj4).subSequence(f93.f(j), f93.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return mf3Var;
    }
}
