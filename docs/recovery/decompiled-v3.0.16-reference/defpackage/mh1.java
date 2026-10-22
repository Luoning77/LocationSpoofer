package defpackage;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import org.maplibre.android.http.NativeHttpRequest;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mh1 extends AsyncTask {
    public final AssetManager a;
    public final wz0 b;

    public mh1(AssetManager assetManager, wz0 wz0Var) {
        this.a = assetManager;
        this.b = wz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        byte[] bArr;
        InputStream inputStream = null;
        byte[] bArr2 = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = this.a.open("integration/" + ((String[]) objArr)[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
            try {
                bArr2 = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr2);
                try {
                    inputStreamOpen.close();
                    return bArr2;
                } catch (IOException e) {
                    Logger.e("Mbgl-LocalRequestTask", "Load file failed", e);
                    xp1.R("Load file failed", e);
                    return bArr2;
                }
            } catch (IOException e2) {
                e = e2;
                byte[] bArr3 = bArr2;
                inputStream = inputStreamOpen;
                bArr = bArr3;
                try {
                    Logger.e("Mbgl-LocalRequestTask", "Load file failed", e);
                    xp1.R("Load file failed", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            Logger.e("Mbgl-LocalRequestTask", "Load file failed", e3);
                            xp1.R("Load file failed", e3);
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            Logger.e("Mbgl-LocalRequestTask", "Load file failed", e4);
                            xp1.R("Load file failed", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bArr = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        byte[] bArr = (byte[]) obj;
        super.onPostExecute(bArr);
        if (bArr != null) {
            NativeHttpRequest nativeHttpRequest = this.b.a;
            nativeHttpRequest.lock.lock();
            if (nativeHttpRequest.nativePtr != 0) {
                nativeHttpRequest.nativeOnResponse(200, null, null, null, null, null, null, bArr);
            }
            nativeHttpRequest.lock.unlock();
        }
    }
}
