package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ck implements pm2 {
    public final /* synthetic */ int a;
    public final Object b;

    public ck(qm2 qm2Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        qm2Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.pm2
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundleJ = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
                List listJ0 = zy.J0((LinkedHashSet) obj);
                bundleJ.putStringArrayList("classes_to_restore", listJ0 instanceof ArrayList ? (ArrayList) listJ0 : new ArrayList<>(listJ0));
                return bundleJ;
        }
    }

    public ck(AppCompatActivity appCompatActivity) {
        this.a = 0;
        this.b = appCompatActivity;
    }
}
