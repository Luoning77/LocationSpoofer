package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class os0 implements au0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ FrameworkBleDelivery g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ os0(XposedInterface.Chain chain, FrameworkBleDelivery frameworkBleDelivery, Object obj, int i) {
        this.h = chain;
        this.g = frameworkBleDelivery;
        this.i = obj;
        this.f = i;
    }

    private final Object f() {
        return FrameworkBleDelivery.install$lambda$27$lambda$7$lambda$6((XposedInterface.Chain) this.h, this.g, this.i, this.f);
    }

    @Override // defpackage.au0
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return f();
            default:
                return FrameworkBleDelivery.results$lambda$45$lambda$44((JSONArray) this.h, this.f, this.g, (Method) this.i);
        }
    }

    public /* synthetic */ os0(JSONArray jSONArray, int i, FrameworkBleDelivery frameworkBleDelivery, Method method) {
        this.h = jSONArray;
        this.f = i;
        this.g = frameworkBleDelivery;
        this.i = method;
    }
}
