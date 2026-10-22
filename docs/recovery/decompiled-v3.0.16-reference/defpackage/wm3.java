package defpackage;

import io.github.libxposed.service.XposedService;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wm3 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((XposedService) obj2).lambda$getRemotePreferences$0((String) obj);
            default:
                return ((XposedService.OnScopeEventListener) obj2).lambda$asInterface$0((XposedService.OnScopeEventListener) obj);
        }
    }
}
