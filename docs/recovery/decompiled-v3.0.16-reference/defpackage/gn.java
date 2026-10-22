package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gn implements sl2 {
    public static volatile gn d;
    public static final Object e = new Object();
    public static gn f;
    public Object a;
    public Object b;
    public Object c;

    public gn(int i) {
        switch (i) {
            case 3:
                this.a = new t1(17);
                this.b = new t1(17);
                this.c = new t1(17);
                break;
            case 8:
                mn2 mn2Var = new mn2();
                mn2Var.e = this;
                HashSet hashSet = new HashSet();
                mn2Var.f = hashSet;
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                mn2Var.g = concurrentHashMap;
                j13 j13Var = mn2.i;
                kn2 kn2Var = new kn2(j13Var, "_root_", true, this);
                mn2Var.h = kn2Var;
                hashSet.add(j13Var);
                concurrentHashMap.put("_root_", kn2Var);
                this.a = mn2Var;
                gn gnVar = new gn();
                gnVar.b = this;
                gnVar.c = new ConcurrentHashMap();
                gnVar.a = new HashMap();
                this.b = gnVar;
                new ConcurrentHashMap();
                new HashMap();
                ee eeVar = new ee(1);
                eeVar.a = re1.i;
                this.c = eeVar;
                break;
            case 13:
                long[] jArr = hn2.a;
                this.a = new zx1();
                break;
            case a83.e /* 15 */:
                this.a = new AtomicReference(zm3.I);
                this.b = new Object();
                break;
            case 20:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
            default:
                this.c = new gt2(5);
                break;
        }
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        fe3[] fe3VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (fe3VarArr = (fe3[]) editable.getSpans(selectionStart, selectionEnd, fe3.class)) != null && fe3VarArr.length > 0) {
                for (fe3 fe3Var : fe3VarArr) {
                    int spanStart = editable.getSpanStart(fe3Var);
                    int spanEnd = editable.getSpanEnd(fe3Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static gn p(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        gn gnVar = new gn();
                        gnVar.c = context.getApplicationContext();
                        gnVar.b = new HashSet();
                        gnVar.a = new HashMap();
                        d = gnVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static boolean s(dj0 dj0Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                fe3[] fe3VarArr = (fe3[]) editable.getSpans(selectionStart, iMin, fe3.class);
                if (fe3VarArr != null && fe3VarArr.length > 0) {
                    for (fe3 fe3Var : fe3VarArr) {
                        int spanStart = editable.getSpanStart(fe3Var);
                        int spanEnd = editable.getSpanEnd(fe3Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    dj0Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    dj0Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static gn y(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new gn(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A() {
        ((TypedArray) this.a).recycle();
    }

    public void B(Object obj) {
        long jB = a83.b();
        if (jB == ea3.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            da3 da3Var = (da3) ((AtomicReference) this.a).get();
            int iA = da3Var.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.a).set(da3Var.b(jB, obj));
            } else {
                da3Var.c[iA] = obj;
            }
        }
    }

    public void C(vv vvVar) {
        ((xv) this.c).e.c = vvVar;
    }

    public void D(xb0 xb0Var) {
        ((xv) this.c).e.a = xb0Var;
    }

    public void E(qa1 qa1Var) {
        ((xv) this.c).e.b = qa1Var;
    }

    public void F(long j) {
        ((xv) this.c).e.d = j;
    }

    public void G() {
        zx1 zx1Var = (zx1) this.a;
        String str = (String) this.b;
        List list = (List) zx1Var.k(str);
        if (list != null) {
            list.remove((au0) this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        zx1Var.m(str, list);
    }

    public double H(double d2) {
        double[] dArr = (double[]) this.a;
        int length = dArr.length;
        double dSin = 0.0d;
        for (int i = 0; i < length; i++) {
            dSin += Math.sin(((6.283185307179586d * d2) / dArr[i]) + ((double[]) this.b)[i]) * ((double[]) this.c)[i];
        }
        return dSin;
    }

    public void a(hb1 hb1Var, w51 w51Var) {
        t1 t1Var = (t1) this.a;
        t1 t1Var2 = (t1) this.b;
        t1 t1Var3 = (t1) this.c;
        int iOrdinal = w51Var.ordinal();
        if (iOrdinal == 0) {
            t1Var.q(hb1Var);
            t1Var3.q(hb1Var);
            return;
        }
        if (iOrdinal == 1) {
            t1Var2.q(hb1Var);
            t1Var3.q(hb1Var);
            return;
        }
        if (iOrdinal == 2) {
            if (hb1Var.m != null) {
                t1Var3.q(hb1Var);
                return;
            } else {
                t1Var.q(hb1Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            b81.d();
        } else if (hb1Var.m != null) {
            t1Var3.q(hb1Var);
        } else {
            t1Var2.q(hb1Var);
        }
    }

    public boolean b(hb1 hb1Var) {
        return !(hb1Var.m == null) && (((ry2) ((t1) this.a).f).contains(hb1Var) || ((ry2) ((t1) this.b).f).contains(hb1Var));
    }

    public void c() {
        t20 t20Var = (t20) this.c;
        t20Var.getClass();
        re1 re1Var = re1.e;
        t20Var.j(re1Var, "Create eager instances ...");
        long jNanoTime = System.nanoTime();
        gn gnVar = (gn) this.b;
        HashMap map = (HashMap) gnVar.a;
        Collection collectionValues = map.values();
        collectionValues.getClass();
        int i = 0;
        vv2[] vv2VarArr = (vv2[]) collectionValues.toArray(new vv2[0]);
        ArrayList arrayListD = am1.d(Arrays.copyOf(vv2VarArr, vv2VarArr.length));
        map.clear();
        gn gnVar2 = (gn) gnVar.b;
        gn gnVar3 = new gn((t20) gnVar2.c, (kn2) ((mn2) gnVar2.a).h, (r52) null);
        int size = arrayListD.size();
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            ((vv2) obj).b(gnVar3);
        }
        double dDoubleValue = Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d).doubleValue();
        t20 t20Var2 = (t20) this.c;
        t20Var2.getClass();
        t20Var2.j(re1Var, "Created eager instances in " + dDoubleValue + " ms");
    }

    public kn2 d(String str, xd3 xd3Var, ContextWrapper contextWrapper) {
        mn2 mn2Var = (mn2) this.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mn2Var.g;
        gn gnVar = (gn) mn2Var.e;
        t20 t20Var = (t20) gnVar.c;
        t20Var.getClass();
        re1 re1Var = re1.e;
        t20Var.j(re1Var, "|- (+) Scope - id:'" + str + "' q:" + xd3Var);
        HashSet hashSet = (HashSet) mn2Var.f;
        if (!hashSet.contains(xd3Var)) {
            t20 t20Var2 = (t20) gnVar.c;
            t20Var2.getClass();
            t20Var2.j(re1Var, "| Scope '" + xd3Var + "' not defined. Creating it ...");
            hashSet.add(xd3Var);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new jb0(az2.k("Scope with id '", str, "' is already created"));
        }
        kn2 kn2Var = new kn2(xd3Var, str, false, gnVar);
        if (contextWrapper != null) {
            t20 t20Var3 = (t20) gnVar.c;
            t20Var3.getClass();
            t20Var3.j(re1Var, "|- Scope source set id:'" + str + "' -> " + contextWrapper);
            kn2Var.f = contextWrapper;
        }
        fz.a0(kn2Var.e, new kn2[]{(kn2) mn2Var.h});
        concurrentHashMap.put(str, kn2Var);
        return kn2Var;
    }

    public void f(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(2131624017);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (k21.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    g((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new iv(e2);
            }
        }
    }

    public Object g(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.a;
        if (r93.b()) {
            try {
                r93.a(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                k21 k21Var = (k21) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = k21Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            g(cls2, hashSet);
                        }
                    }
                }
                objB = k21Var.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new iv(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public Object h() {
        long jB = a83.b();
        if (jB == ea3.a) {
            return this.c;
        }
        da3 da3Var = (da3) ((AtomicReference) this.a).get();
        int iA = da3Var.a(jB);
        if (iA >= 0) {
            return da3Var.c[iA];
        }
        return null;
    }

    public vv i() {
        return ((xv) this.c).e.c;
    }

    public ColorStateList j(int i) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListR = zm3.r((Context) this.c, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListR;
    }

    public sh1 k() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((gt2) this.c)) {
            try {
                sh1 sh1Var = (sh1) this.b;
                if (sh1Var != null && localeList == ((LocaleList) this.a)) {
                    return sh1Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new rh1(localeList.get(i)));
                }
                sh1 sh1Var2 = new sh1(arrayList);
                this.a = localeList;
                this.b = sh1Var2;
                return sh1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public xb0 l() {
        return ((xv) this.c).e.a;
    }

    public Drawable m(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : k22.v((Context) this.c, resourceId);
    }

    public Drawable n(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) {
            return null;
        }
        cl clVarA = cl.a();
        Context context = (Context) this.c;
        synchronized (clVarA) {
            drawableE = clVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface o(int i, int i2, dm dmVar) {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.a).getResourceId(i, 0);
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.b;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.b = typedValue;
            }
            Context context = (Context) this.c;
            ThreadLocal threadLocal = ng2.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    dmVar.a(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                mk1 mk1Var = ae3.b;
                Typeface typeface = (Typeface) mk1Var.c(ae3.b(resources, resourceId, string, i3, i2));
                int i4 = 9;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new ub(i4, dmVar, typeface));
                    return typeface;
                }
                try {
                    try {
                        if (!string.toLowerCase().endsWith(".xml")) {
                            int i5 = typedValue.assetCookie;
                            Typeface typefaceE = ae3.a.e(context, resources, resourceId, string);
                            if (typefaceE != null) {
                                mk1Var.d(ae3.b(resources, resourceId, string, i5, i2), typefaceE);
                            }
                            if (typefaceE != null) {
                                new Handler(Looper.getMainLooper()).post(new ub(i4, dmVar, typefaceE));
                            } else {
                                dmVar.a(-3);
                            }
                            return typefaceE;
                        }
                        ar0 ar0VarY = dh0.y(resources.getXml(resourceId), resources);
                        if (ar0VarY != null) {
                            return ae3.a(context, ar0VarY, resources, resourceId, string, typedValue.assetCookie, i2, dmVar, true);
                        }
                        try {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            dmVar.a(-3);
                            return null;
                        } catch (IOException e2) {
                            iOException = e2;
                        } catch (XmlPullParserException e3) {
                            xmlPullParserException = e3;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            dmVar.a(-3);
                            return null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        iOException = e;
                    } catch (XmlPullParserException e5) {
                        e = e5;
                        xmlPullParserException = e;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        dmVar.a(-3);
                        return null;
                    }
                } catch (IOException e6) {
                    e = e6;
                } catch (XmlPullParserException e7) {
                    e = e7;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                dmVar.a(-3);
                return null;
            }
        }
        return null;
    }

    public qa1 q() {
        return ((xv) this.c).e.b;
    }

    public long r() {
        return ((xv) this.c).e.d;
    }

    public boolean t(CharSequence charSequence, int i, int i2, ee3 ee3Var) {
        if ((ee3Var.c & 3) == 0) {
            ma0 ma0Var = (ma0) this.c;
            ut1 ut1VarB = ee3Var.b();
            int iA = ut1VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) ut1VarB.h).getShort(iA + ut1VarB.e);
            }
            ma0Var.getClass();
            ThreadLocal threadLocal = ma0.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ma0Var.a;
            String string = sb.toString();
            int i3 = d52.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = ee3Var.c & 4;
            ee3Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (ee3Var.c & 3) == 2;
    }

    public double u(double d2) {
        double[] dArr = (double[]) this.b;
        double[] dArr2 = (double[]) this.a;
        int length = dArr2.length;
        double dCos = 0.0d;
        for (int i = 0; i < length; i++) {
            double d3 = 6.283185307179586d / dArr2[i];
            dCos += (Math.cos(dArr[i]) - Math.cos((d3 * d2) + dArr[i])) * (((double[]) this.c)[i] / d3);
        }
        return dCos;
    }

    public boolean v() {
        return !(((ry2) ((t1) this.a).f).isEmpty() && ((ry2) ((t1) this.c).f).isEmpty() && ((ry2) ((t1) this.b).f).isEmpty());
    }

    public boolean w() {
        if (((s03) this.a).getValue() != this.c) {
            return true;
        }
        gn gnVar = (gn) this.b;
        return gnVar != null && gnVar.w();
    }

    public void x(List list, boolean z) {
        LinkedHashSet<iv1> linkedHashSet = new LinkedHashSet();
        gh0.y(list, linkedHashSet);
        gn gnVar = (gn) this.b;
        gnVar.getClass();
        for (iv1 iv1Var : linkedHashSet) {
            for (Map.Entry entry : iv1Var.c.entrySet()) {
                String str = (String) entry.getKey();
                v31 v31Var = (v31) entry.getValue();
                gn gnVar2 = (gn) gnVar.b;
                str.getClass();
                v31Var.getClass();
                ir irVar = v31Var.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gnVar.c;
                if (concurrentHashMap.containsKey(str)) {
                    if (!z) {
                        throw new jb0("Already existing definition for " + irVar + " at " + str);
                    }
                    t20 t20Var = (t20) gnVar2.c;
                    t20Var.getClass();
                    t20Var.j(re1.g, "(+) override index '" + str + "' -> '" + irVar + '\'');
                }
                t20 t20Var2 = (t20) gnVar2.c;
                t20Var2.getClass();
                t20Var2.j(re1.e, "(+) index '" + str + "' -> '" + irVar + '\'');
                concurrentHashMap.put(str, v31Var);
            }
            for (vv2 vv2Var : iv1Var.b) {
                ((HashMap) gnVar.a).put(Integer.valueOf(vv2Var.a.hashCode()), vv2Var);
            }
        }
        mn2 mn2Var = (mn2) this.a;
        mn2Var.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((HashSet) mn2Var.f).addAll(((iv1) it.next()).d);
        }
    }

    public Object z(CharSequence charSequence, int i, int i2, int i3, boolean z, hj0 hj0Var) {
        int i4;
        char c;
        jj0 jj0Var = new jj0((wt1) ((mn2) this.b).g);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zJ = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zJ) {
                    wt1 wt1Var = (wt1) jj0Var.c.a.get(iCodePointAt);
                    if (jj0Var.a == 2) {
                        if (wt1Var != null) {
                            jj0Var.c = wt1Var;
                            jj0Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                jj0Var.a();
                            } else if (iCodePointAt != 65039) {
                                wt1 wt1Var2 = jj0Var.c;
                                if (wt1Var2.b != null) {
                                    if (jj0Var.f != 1) {
                                        jj0Var.d = wt1Var2;
                                        jj0Var.a();
                                    } else if (jj0Var.b()) {
                                        jj0Var.d = jj0Var.c;
                                        jj0Var.a();
                                    } else {
                                        jj0Var.a();
                                    }
                                    c = 3;
                                } else {
                                    jj0Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (wt1Var == null) {
                        jj0Var.a();
                        c = 1;
                    } else {
                        jj0Var.a = 2;
                        jj0Var.c = wt1Var;
                        jj0Var.f = 1;
                        c = 2;
                    }
                    jj0Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && t(charSequence, i4, iCharCount, jj0Var.d.b)) {
                            break;
                        }
                        zJ = hj0Var.j(charSequence, i4, iCharCount, jj0Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (jj0Var.a == 2 && jj0Var.c.b != null && ((jj0Var.f > 1 || jj0Var.b()) && i5 < i3 && zJ && (z || !t(charSequence, i4, iCharCount, jj0Var.c.b)))) {
            hj0Var.j(charSequence, i4, iCharCount, jj0Var.c.b);
        }
        return hj0Var.a();
    }

    public gn(t20 t20Var, kn2 kn2Var, r52 r52Var) {
        t20Var.getClass();
        this.a = t20Var;
        this.b = kn2Var;
        this.c = r52Var;
    }

    public /* synthetic */ gn(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public gn(double d2, double d3, long j) {
        Random random = new Random(j);
        double[] dArr = new double[4];
        for (int i = 0; i < 4; i++) {
            dArr[i] = Math.pow(d3 / d2, random.nextDouble()) * d2;
        }
        this.a = dArr;
        double[] dArr2 = new double[4];
        for (int i2 = 0; i2 < 4; i2++) {
            dArr2[i2] = random.nextDouble() * 2.0d * 3.141592653589793d;
        }
        this.b = dArr2;
        double[] dArr3 = new double[4];
        for (int i3 = 0; i3 < 4; i3++) {
            dArr3[i3] = random.nextDouble() + 0.5d;
        }
        double d4 = 0.0d;
        for (int i4 = 0; i4 < 4; i4++) {
            d4 += dArr3[i4];
        }
        double[] dArr4 = new double[4];
        for (int i5 = 0; i5 < 4; i5++) {
            dArr4[i5] = dArr3[i5] / d4;
        }
        this.c = dArr4;
    }

    public gn(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public gn(he3 he3Var, gn gnVar) {
        this.a = he3Var;
        this.b = gnVar;
        this.c = he3Var.e;
    }
}
