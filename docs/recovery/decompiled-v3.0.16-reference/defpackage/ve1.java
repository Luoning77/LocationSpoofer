package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ve1 {
    private static final /* synthetic */ vk0 $ENTRIES;
    private static final /* synthetic */ ve1[] $VALUES;
    public static final te1 Companion;
    public static final ve1 ON_ANY;
    public static final ve1 ON_CREATE;
    public static final ve1 ON_DESTROY;
    public static final ve1 ON_PAUSE;
    public static final ve1 ON_RESUME;
    public static final ve1 ON_START;
    public static final ve1 ON_STOP;

    static {
        ve1 ve1Var = new ve1("ON_CREATE", 0);
        ON_CREATE = ve1Var;
        ve1 ve1Var2 = new ve1("ON_START", 1);
        ON_START = ve1Var2;
        ve1 ve1Var3 = new ve1("ON_RESUME", 2);
        ON_RESUME = ve1Var3;
        ve1 ve1Var4 = new ve1("ON_PAUSE", 3);
        ON_PAUSE = ve1Var4;
        ve1 ve1Var5 = new ve1("ON_STOP", 4);
        ON_STOP = ve1Var5;
        ve1 ve1Var6 = new ve1("ON_DESTROY", 5);
        ON_DESTROY = ve1Var6;
        ve1 ve1Var7 = new ve1("ON_ANY", 6);
        ON_ANY = ve1Var7;
        ve1[] ve1VarArr = {ve1Var, ve1Var2, ve1Var3, ve1Var4, ve1Var5, ve1Var6, ve1Var7};
        $VALUES = ve1VarArr;
        $ENTRIES = new wk0(ve1VarArr);
        Companion = new te1();
    }

    public static ve1 valueOf(String str) {
        return (ve1) Enum.valueOf(ve1.class, str);
    }

    public static ve1[] values() {
        return (ve1[]) $VALUES.clone();
    }

    public final we1 a() {
        switch (ue1.a[ordinal()]) {
            case 1:
            case 2:
                return we1.g;
            case 3:
            case 4:
                return we1.h;
            case Logger.WARN /* 5 */:
                return we1.i;
            case Logger.ERROR /* 6 */:
                return we1.e;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                b81.d();
                return null;
        }
    }
}
