package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface bt2 {
    int a(String str);

    String b();

    mh0 c();

    int d();

    String e(int i);

    default boolean g() {
        return false;
    }

    default List getAnnotations() {
        return uj0.e;
    }

    List h(int i);

    bt2 i(int i);

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
