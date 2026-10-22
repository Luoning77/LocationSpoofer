package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w61 implements bt2 {
    public static final w61 b = new w61();
    public static final String c = "kotlinx.serialization.json.JsonArray";
    public final /* synthetic */ no a;

    public w61() {
        bt2 descriptor = g71.a.getDescriptor();
        descriptor.getClass();
        this.a = new no(descriptor);
    }

    @Override // defpackage.bt2
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.bt2
    public final String b() {
        return c;
    }

    @Override // defpackage.bt2
    public final mh0 c() {
        return u13.f;
    }

    @Override // defpackage.bt2
    public final int d() {
        return 1;
    }

    @Override // defpackage.bt2
    public final String e(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.bt2
    public final boolean g() {
        return false;
    }

    @Override // defpackage.bt2
    public final List getAnnotations() {
        return uj0.e;
    }

    @Override // defpackage.bt2
    public final List h(int i) {
        this.a.h(i);
        return uj0.e;
    }

    @Override // defpackage.bt2
    public final bt2 i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.bt2
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.bt2
    public final boolean j(int i) {
        this.a.j(i);
        return false;
    }
}
