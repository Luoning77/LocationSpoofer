package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nj0 extends ti0 implements Runnable {
    public final WeakReference e;

    public nj0(EditText editText) {
        this.e = new WeakReference(editText);
    }

    @Override // defpackage.ti0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.e.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.a((EditText) this.e.get(), 1);
    }
}
