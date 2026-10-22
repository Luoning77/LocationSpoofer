package kotlinx.coroutines.flow.internal;

import defpackage.b81;
import defpackage.sj0;
import defpackage.y70;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface FusibleFlow<T> extends Flow<T> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow fuse$default(FusibleFlow fusibleFlow, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: fuse");
                return null;
            }
            if ((i2 & 1) != 0) {
                y70Var = sj0.e;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fusibleFlow.fuse(y70Var, i, bufferOverflow);
        }
    }

    Flow<T> fuse(y70 y70Var, int i, BufferOverflow bufferOverflow);
}
