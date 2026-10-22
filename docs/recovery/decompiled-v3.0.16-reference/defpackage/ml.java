package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ml {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        b60 t1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                t1Var = new t1(clipData, 3);
            } else {
                c60 c60Var = new c60(0);
                c60Var.f = clipData;
                c60Var.g = 3;
                t1Var = c60Var;
            }
            yi3.h(textView, t1Var.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        b60 t1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            t1Var = new t1(clipData, 3);
        } else {
            c60 c60Var = new c60(0);
            c60Var.f = clipData;
            c60Var.g = 3;
            t1Var = c60Var;
        }
        yi3.h(view, t1Var.build());
        return true;
    }
}
