package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l53 implements Iterable {
    public final ArrayList e = new ArrayList();
    public final AppCompatActivity f;

    public l53(AppCompatActivity appCompatActivity) {
        this.f = appCompatActivity;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.e.iterator();
    }
}
