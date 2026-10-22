package kotlinx.coroutines.time;

import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.z70;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class TimeKt {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Duration duration) {
        return FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final Object delay(Duration duration, q60 q60Var) {
        Object objDelay = DelayKt.delay(coerceToMillis(duration), q60Var);
        return objDelay == z70.e ? objDelay : mf3.a;
    }

    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, Duration duration, lu0 lu0Var) {
        OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), lu0Var);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, Duration duration) {
        return FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <T> Object withTimeout(Duration duration, pu0 pu0Var, q60 q60Var) {
        return TimeoutKt.withTimeout(coerceToMillis(duration), pu0Var, q60Var);
    }

    public static final <T> Object withTimeoutOrNull(Duration duration, pu0 pu0Var, q60 q60Var) {
        return TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), pu0Var, q60Var);
    }
}
