package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class c1 {
    public static final View.AccessibilityDelegate g = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate e;
    public final b1 f;

    public c1(View.AccessibilityDelegate accessibilityDelegate) {
        this.e = accessibilityDelegate;
        this.f = new b1(this);
    }

    public t1 a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.e.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new t1(accessibilityNodeProvider, 0);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.e.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, r1 r1Var) {
        this.e.onInitializeAccessibilityNodeInfo(view, r1Var.a);
    }

    public boolean d(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131230906);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((o1) list.get(i2)).a).getId() != i; i2++) {
        }
        boolean zPerformAccessibilityAction = this.e.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != 2131230726 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131230907);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public c1() {
        this(g);
    }
}
