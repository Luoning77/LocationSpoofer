package defpackage;

import android.util.Log;
import java.io.Writer;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ij1 extends Writer {
    public final StringBuilder e = new StringBuilder(WorkQueueKt.BUFFER_CAPACITY);

    public final void A() {
        StringBuilder sb = this.e;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        A();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                A();
            } else {
                this.e.append(c);
            }
        }
    }
}
