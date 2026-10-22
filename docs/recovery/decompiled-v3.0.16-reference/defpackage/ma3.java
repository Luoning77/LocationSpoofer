package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ma3 {
    public static void a(Object... objArr) {
        for (ma3 ma3Var : na3.c) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            ma3Var.getClass();
            a(objArrCopyOf);
        }
    }
}
