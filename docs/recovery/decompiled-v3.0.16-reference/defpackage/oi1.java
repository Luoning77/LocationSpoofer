package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class oi1 implements au0 {
    public final /* synthetic */ int e;

    public /* synthetic */ oi1(u02 u02Var) {
        this.e = 10;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return LocationSpooferDataPackage._childSerializers$_anonymous_$1();
            case 1:
                return LocationSpooferDataPackage._childSerializers$_anonymous_$2();
            case 2:
                return LocationSpooferDataPackage._childSerializers$_anonymous_$3();
            case 3:
                return ke0.H(uj0.e);
            case 4:
                return new t52(js.Location.ordinal());
            case Logger.WARN /* 5 */:
                return mf3.a;
            case Logger.ERROR /* 6 */:
                return Boolean.FALSE;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return uv1.a;
            case 8:
                return ke0.H(Boolean.FALSE);
            case mc0.b /* 9 */:
                return Boolean.valueOf(MotionController._init_$lambda$0());
            case mc0.c /* 10 */:
                u13 u13Var = u13.h;
                bt2[] bt2VarArr = new bt2[0];
                if (l13.k0("kotlin.Unit")) {
                    fo.i("Blank serial names are prohibited");
                } else {
                    if (!(u13Var == u13.e)) {
                        px pxVar = new px("kotlin.Unit");
                        return new dt2("kotlin.Unit", u13Var, pxVar.b.size(), yo.F0(bt2VarArr), pxVar);
                    }
                    fo.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 11:
                return new m42();
            case mc0.d /* 12 */:
                return new l42();
            case 13:
                return Dispatchers.getIO();
            case 14:
                return mf3.a;
            case a83.e /* 15 */:
                return null;
            case 16:
                return new ph2();
            case 17:
                return Long.valueOf(System.nanoTime() / 1000000);
            case 18:
                return new xk2();
            case 19:
                return new rl2(new LinkedHashMap());
            case 20:
                return null;
            case 21:
                return new co2(0);
            case 22:
                return new er2(1L);
            case 23:
                return null;
            case 24:
                return new gu2();
            case 25:
                byte[] bArr = (byte[]) jq.b.getValue();
                bArr.getClass();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ALPHA_8);
                bitmapCreateBitmap.getClass();
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                Bitmap bitmapL = n51.l(new td(bitmapCreateBitmap));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmapL, tileMode, tileMode);
                if (q1.e()) {
                    bitmapShader.setFilterMode(2);
                }
                return bitmapShader;
            case 26:
                return new td0(0.0f);
            case 27:
                return ke0.H("");
            case 28:
                return ke0.H(o43.e);
            default:
                return SystemHookUtils.EXEMPT_PACKAGES_delegate$lambda$0();
        }
    }

    public /* synthetic */ oi1(int i) {
        this.e = i;
    }
}
