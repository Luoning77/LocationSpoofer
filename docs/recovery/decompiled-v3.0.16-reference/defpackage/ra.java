package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ra extends c1 {
    public final /* synthetic */ db h;
    public final /* synthetic */ hb1 i;
    public final /* synthetic */ db j;

    public ra(db dbVar, hb1 hb1Var, db dbVar2) {
        this.h = dbVar;
        this.i = hb1Var;
        this.j = dbVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // defpackage.c1
    public final void c(View view, r1 r1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = r1Var.a;
        this.e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        db dbVar = this.h;
        jb jbVar = dbVar.D;
        if (jbVar.q()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        hb1 hb1Var = this.i;
        hb1 hb1VarU = hb1Var.u();
        while (true) {
            if (hb1VarU == null) {
                hb1VarU = null;
                break;
            } else if (hb1VarU.K.c(8)) {
                break;
            } else {
                hb1VarU = hb1VarU.u();
            }
        }
        Integer numValueOf = hb1VarU != null ? Integer.valueOf(hb1VarU.f) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == dbVar.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        r1Var.b = iIntValue;
        db dbVar2 = this.j;
        accessibilityNodeInfo.setParent(dbVar2, iIntValue);
        int i = hb1Var.f;
        int iD = jbVar.F.d(i);
        if (iD != -1) {
            eh ehVarI = ig0.I(dbVar.getAndroidViewsHandler$ui(), iD);
            if (ehVarI != null) {
                accessibilityNodeInfo.setTraversalBefore(ehVarI);
            } else {
                accessibilityNodeInfo.setTraversalBefore(dbVar2, iD);
            }
            dbVar.d(i, accessibilityNodeInfo, jbVar.H);
        }
        int iD2 = jbVar.G.d(i);
        if (iD2 != -1) {
            eh ehVarI2 = ig0.I(dbVar.getAndroidViewsHandler$ui(), iD2);
            if (ehVarI2 != null) {
                accessibilityNodeInfo.setTraversalAfter(ehVarI2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(dbVar2, iD2);
            }
            dbVar.d(i, accessibilityNodeInfo, jbVar.I);
        }
    }
}
