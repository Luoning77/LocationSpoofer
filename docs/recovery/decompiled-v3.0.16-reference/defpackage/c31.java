package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c31 extends InputConnectionWrapper {
    public final /* synthetic */ g8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(InputConnection inputConnection, g8 g8Var) {
        super(inputConnection, false);
        this.a = g8Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        b60 t1Var;
        t1 t1Var2 = inputContentInfo == null ? null : new t1(new t1(inputContentInfo, 24), 25);
        el elVar = (el) this.a.e;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((t1) t1Var2.f).f).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((t1) t1Var2.f).f;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((t1) t1Var2.f).f;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            t1Var = new t1(clipData, 2);
        } else {
            c60 c60Var = new c60(0);
            c60Var.f = clipData;
            c60Var.g = 2;
            t1Var = c60Var;
        }
        t1Var.l(inputContentInfo3.getLinkUri());
        t1Var.setExtras(bundle2);
        if (yi3.h(elVar, t1Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
