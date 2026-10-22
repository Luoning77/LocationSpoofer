package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p23 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public p23(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        o23 o23Var = new o23(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = o23Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.p);
                        o23Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        o23Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        o23Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        o23Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        o23Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        o23Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, jd2.q);
                        o23Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        o23Var.j = (typedArrayObtainStyledAttributes2.getInt(5, o23Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, o23Var.d) & 65535);
                        o23Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        o23Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        o23Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        o23Var.n = string == null ? (char) 0 : string.charAt(0);
                        o23Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        o23Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        o23Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            o23Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            o23Var.r = o23Var.e;
                        }
                        o23Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        o23Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, o23Var.f);
                        o23Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, o23Var.g);
                        o23Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        o23Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        o23Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        o23Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && o23Var.w == 0 && o23Var.x == null) {
                            o23Var.z = (ws1) o23Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            o23Var.z = null;
                        }
                        o23Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        o23Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            o23Var.D = pg0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), o23Var.D);
                        } else {
                            o23Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = zm3.r(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            o23Var.C = colorStateList;
                        } else {
                            o23Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        o23Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        o23Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(o23Var.b, o23Var.i, o23Var.j, o23Var.k);
                        o23Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        o23Var.b = 0;
                        o23Var.c = 0;
                        o23Var.d = 0;
                        o23Var.e = 0;
                        o23Var.f = true;
                        o23Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!o23Var.h) {
                            ws1 ws1Var = o23Var.z;
                            if (ws1Var == null || !ws1Var.a.hasSubMenu()) {
                                o23Var.h = true;
                                o23Var.b(menu2.add(o23Var.b, o23Var.i, o23Var.j, o23Var.k));
                            } else {
                                o23Var.h = true;
                                o23Var.b(menu2.addSubMenu(o23Var.b, o23Var.i, o23Var.j, o23Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof ms1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
