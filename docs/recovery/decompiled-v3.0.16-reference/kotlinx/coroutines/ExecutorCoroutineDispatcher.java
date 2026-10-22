package kotlinx.coroutines;

import defpackage.a0;
import defpackage.ca0;
import defpackage.my;
import defpackage.w70;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    public static final Key Key = new Key(null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key extends a0 {
        private Key() {
            super(CoroutineDispatcher.Key, new my(27));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExecutorCoroutineDispatcher _init_$lambda$0(w70 w70Var) {
            if (w70Var instanceof ExecutorCoroutineDispatcher) {
                return (ExecutorCoroutineDispatcher) w70Var;
            }
            return null;
        }

        public /* synthetic */ Key(ca0 ca0Var) {
            this();
        }
    }
}
