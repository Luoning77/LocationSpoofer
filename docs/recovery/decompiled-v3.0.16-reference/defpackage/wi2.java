package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wi2 {
    public static String a(String str, Long l) {
        String str2;
        try {
            Process processStart = new ProcessBuilder("su", "-c", str).redirectErrorStream(true).start();
            we2 we2Var = new we2();
            we2Var.e = "";
            fa3 fa3VarF = g83.f("LocationSpoofer-root-output", new qi2(2, we2Var, processStart));
            try {
                OutputStream outputStream = processStart.getOutputStream();
                outputStream.getClass();
                new BufferedWriter(new OutputStreamWriter(outputStream, sw.a), 8192).close();
                if (l != null && !processStart.waitFor(l.longValue(), TimeUnit.MILLISECONDS)) {
                    processStart.destroyForcibly();
                    fa3VarF.join(1000L);
                    Log.w("LocationSpoofer", "Root background protection timed out");
                    return "ERROR";
                }
                int iWaitFor = l == null ? processStart.waitFor() : processStart.exitValue();
                if (l == null) {
                    fa3VarF.join();
                } else {
                    fa3VarF.join(1000L);
                }
                Object obj = we2Var.e;
                if (iWaitFor == 0) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() == 0) {
                        charSequence = "SUCCESS";
                    }
                    str2 = (String) charSequence;
                } else {
                    Log.e("LocationSpoofer", "Root command failed (" + iWaitFor + "): " + l13.B0(2000, (String) obj));
                    str2 = "ERROR";
                }
                return str2;
            } finally {
                processStart.destroy();
            }
        } catch (Exception e) {
            Log.e("LocationSpoofer", "Root command failed", e);
            return "ERROR";
        }
    }
}
