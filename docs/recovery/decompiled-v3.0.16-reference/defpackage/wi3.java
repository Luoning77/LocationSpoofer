package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wi3 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static e60 b(View view, e60 e60Var) {
        ContentInfo contentInfoH = e60Var.a.h();
        Objects.requireNonNull(contentInfoH);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoH ? e60Var : new e60(new t1(contentInfoPerformReceiveContent));
    }
}
