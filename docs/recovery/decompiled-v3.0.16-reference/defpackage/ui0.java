package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ui0 implements Runnable {
    public final ArrayList e;
    public final int f;

    public ui0(List list, int i, Throwable th) {
        ig0.l(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        if (this.f != 1) {
            while (i < size) {
                ((ti0) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((ti0) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
