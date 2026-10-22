package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yi3 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final mi3 d = new mi3();
    public static final oi3 e = new oi3();

    public static sj3 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        sj3 sj3Var = (sj3) weakHashMap.get(view);
        if (sj3Var != null) {
            return sj3Var;
        }
        sj3 sj3Var2 = new sj3(view);
        a.put(view, sj3Var2);
        return sj3Var2;
    }

    public static void b(View view, ql3 ql3Var) {
        WindowInsets windowInsetsB = ql3Var.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? vi3.a(view, windowInsetsB) : pi3.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            ql3.c(windowInsetsA, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = xi3.d;
        xi3 xi3Var = (xi3) view.getTag(2131230918);
        if (xi3Var == null) {
            xi3Var = new xi3();
            xi3Var.a = null;
            xi3Var.b = null;
            xi3Var.c = null;
            view.setTag(2131230918, xi3Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = xi3Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = xi3.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (xi3Var.a == null) {
                            xi3Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = xi3.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                xi3Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    xi3Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = xi3Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = xi3Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    xi3Var.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = xi3.d;
            xi3 xi3Var = (xi3) view.getTag(2131230918);
            WeakReference weakReference = null;
            if (xi3Var == null) {
                xi3Var = new xi3();
                xi3Var.a = null;
                xi3Var.b = null;
                xi3Var.c = null;
                view.setTag(2131230918, xi3Var);
            }
            WeakReference weakReference2 = xi3Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                xi3Var.c = new WeakReference(keyEvent);
                SparseArray sparseArray = xi3Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    xi3Var.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131230919)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    b81.u();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ui3.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] f(el elVar) {
        return Build.VERSION.SDK_INT >= 31 ? wi3.a(elVar) : (String[]) elVar.getTag(2131230913);
    }

    public static void g(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i2 >= 28) {
                tag = ti3.a(view);
            } else {
                tag = view.getTag(2131230909);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i2 >= 28) {
                        objA = ti3.a(view);
                    } else {
                        Object tag2 = view.getTag(2131230909);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i2 >= 28) {
                objA = ti3.a(view);
            } else {
                Object tag3 = view.getTag(2131230909);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e60 h(View view, e60 e60Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + e60Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return wi3.b(view, e60Var);
        }
        z93 z93Var = (z93) view.getTag(2131230912);
        d22 d22Var = d;
        if (z93Var == null) {
            if (view instanceof d22) {
                d22Var = (d22) view;
            }
            return d22Var.a(e60Var);
        }
        e60 e60VarA = z93.a(view, e60Var);
        if (e60VarA == null) {
            return null;
        }
        if (view instanceof d22) {
            d22Var = (d22) view;
        }
        return d22Var.a(e60VarA);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ui3.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void j(View view, c1 c1Var) {
        if (c1Var == null && (e(view) instanceof b1)) {
            c1Var = new c1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1Var == null ? null : c1Var.f);
    }

    public static void k(View view, CharSequence charSequence) {
        new ni3(2131230909, CharSequence.class, 8, 28, 1).f(view, charSequence);
        oi3 oi3Var = e;
        if (charSequence == null) {
            oi3Var.e.remove(view);
            view.removeOnAttachStateChangeListener(oi3Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(oi3Var);
        } else {
            oi3Var.e.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(oi3Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(oi3Var);
            }
        }
    }
}
