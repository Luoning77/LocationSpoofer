package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xr0 implements LayoutInflater.Factory2 {
    public final gs0 e;

    public xr0(gs0 gs0Var) {
        this.e = gs0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        boolean zEquals = vr0.class.getName().equals(str);
        gs0 gs0Var = this.e;
        if (zEquals) {
            return new vr0(context, attributeSet, gs0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hd2.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = tr0.class.isAssignableFrom(cs0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        gs0Var.j();
                    }
                    if (string != null) {
                        mn2 mn2Var = gs0Var.c;
                        ArrayList arrayList = (ArrayList) mn2Var.e;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (arrayList.get(size) != null) {
                                b81.u();
                                return null;
                            }
                        }
                        Iterator it = ((HashMap) mn2Var.f).values().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                b81.u();
                                return null;
                            }
                        }
                    }
                    if (id != -1) {
                        gs0Var.j();
                    }
                    cs0 cs0Var = gs0Var.w;
                    context.getClassLoader();
                    cs0Var.a(attributeValue);
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
