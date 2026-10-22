package defpackage;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dk implements z12 {
    public final /* synthetic */ AppCompatActivity a;

    public dk(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // defpackage.z12
    public final void a(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.a;
        ok delegate = appCompatActivity.getDelegate();
        delegate.c();
        appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.g();
    }
}
