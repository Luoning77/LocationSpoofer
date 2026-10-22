package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v03 implements Map.Entry, r81 {
    public final Object e;
    public Object f;
    public final /* synthetic */ w03 g;

    public v03(w03 w03Var) {
        this.g = w03Var;
        Map.Entry entry = w03Var.h;
        entry.getClass();
        this.e = entry.getKey();
        Map.Entry entry2 = w03Var.h;
        entry2.getClass();
        this.f = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        w03 w03Var = this.g;
        hy2 hy2Var = w03Var.e;
        if (hy2Var.e().d != w03Var.g) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f;
        hy2Var.put(this.e, obj);
        this.f = obj;
        return obj2;
    }
}
