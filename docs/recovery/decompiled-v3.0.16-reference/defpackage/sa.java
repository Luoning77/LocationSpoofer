package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sa extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ db g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa(db dbVar, int i) {
        super(0);
        this.f = i;
        this.g = dbVar;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int actionMasked;
        int i = this.f;
        db dbVar = this.g;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) dbVar.u.getValue();
                bool.getClass();
                return bool;
            case 1:
                uh1 uh1Var = new uh1(new vh1(dbVar.getConfiguration().getLocales()));
                if (uh1Var.b()) {
                    uh1Var = new uh1(new vh1(LocaleList.getDefault()));
                }
                vh1 vh1Var = uh1Var.a;
                int size = vh1Var.a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = vh1Var.a.get(i2);
                    locale.getClass();
                    arrayList.add(new rh1(locale));
                }
                return new sh1(arrayList);
            case 2:
                MotionEvent motionEvent = dbVar.A0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    dbVar.B0 = SystemClock.uptimeMillis();
                    dbVar.post(dbVar.G0);
                }
                return mf3.a;
            default:
                dbVar.get_viewTreeOwners();
                return null;
        }
    }
}
