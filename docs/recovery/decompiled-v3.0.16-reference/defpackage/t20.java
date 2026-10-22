package defpackage;

import android.graphics.RenderEffect;
import java.util.ArrayList;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class t20 {
    public Object a;

    public t20(int i) {
        switch (i) {
            case 3:
                this.a = new Object();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(int i, qv0 qv0Var, Object obj) {
        ArrayList arrayList = qv0Var.a;
        if (arrayList == null) {
            b(i, qv0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof iv0)) {
                if (!(obj2 instanceof qv0)) {
                    fo.o(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (qv0) obj2, obj)) {
                    b(0, qv0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, qv0Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void b(int i, qv0 qv0Var, Object obj) {
        ((ArrayList) this.a).add(new u20(i, null, null));
    }

    public RenderEffect c() {
        RenderEffect renderEffect = (RenderEffect) this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectF = f();
        this.a = renderEffectF;
        return renderEffectF;
    }

    public abstract void d(SendChannel sendChannel);

    public abstract void e();

    public abstract RenderEffect f();

    public abstract void g(re1 re1Var, String str);

    public abstract void h();

    public boolean i(re1 re1Var) {
        return ((re1) this.a).compareTo(re1Var) <= 0;
    }

    public void j(re1 re1Var, String str) {
        if (i(re1Var)) {
            g(re1Var, str);
        }
    }

    public void k(int i, Object obj, qv0 qv0Var, Object obj2) {
        if (o51.f(obj, d30.a)) {
            b(i, qv0Var, null);
        }
    }

    public abstract lu0 l(SendChannel sendChannel);

    public abstract void m(Channel channel);
}
