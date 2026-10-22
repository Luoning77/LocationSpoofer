package org.maplibre.android.log;

import android.util.Log;
import defpackage.jj1;
import defpackage.k91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Logger {
    public static final int DEBUG = 3;
    private static final jj1 DEFAULT;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 99;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static int logLevel;
    private static volatile jj1 logger;

    static {
        k91 k91Var = new k91(4);
        DEFAULT = k91Var;
        logger = k91Var;
    }

    public static void d(String str, String str2) {
        if (logLevel <= 3) {
            ((k91) logger).getClass();
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (logLevel <= 6) {
            ((k91) logger).getClass();
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (logLevel <= 4) {
            ((k91) logger).getClass();
            Log.i(str, str2);
        }
    }

    public static void log(int i, String str, String str2) {
        if (i == 2) {
            v(str, str2);
            return;
        }
        if (i == 3) {
            d(str, str2);
            return;
        }
        if (i == 4) {
            i(str, str2);
        } else if (i == 5) {
            w(str, str2);
        } else {
            if (i != 6) {
                throw new UnsupportedOperationException();
            }
            e(str, str2);
        }
    }

    public static void setLoggerDefinition(jj1 jj1Var) {
        logger = jj1Var;
    }

    public static void setVerbosity(int i) {
        logLevel = i;
    }

    public static void v(String str, String str2) {
        if (logLevel <= 2) {
            ((k91) logger).getClass();
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (logLevel <= 5) {
            ((k91) logger).getClass();
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (logLevel <= 3) {
            ((k91) logger).getClass();
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (logLevel <= 6) {
            ((k91) logger).getClass();
            Log.e(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (logLevel <= 4) {
            ((k91) logger).getClass();
            Log.i(str, str2, th);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (logLevel <= 2) {
            ((k91) logger).getClass();
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (logLevel <= 5) {
            ((k91) logger).getClass();
            Log.w(str, str2, th);
        }
    }
}
