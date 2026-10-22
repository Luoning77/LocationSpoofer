package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class be3 extends k93 {
    public static Class j = null;
    public static Constructor k = null;
    public static Method l = null;
    public static Method m = null;
    public static boolean n = false;
    public final Class c;
    public final Constructor d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public be3() throws NoSuchMethodException {
        Method methodR;
        Constructor<?> constructor;
        Method methodQ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodQ = q(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodR = r(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodR = null;
            constructor = null;
            methodQ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.e = methodQ;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = methodR;
    }

    public static boolean m(int i, Object obj, String str, boolean z) throws NoSuchMethodException {
        p();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void p() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static Method q(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.k93
    public final Typeface b(Context context, br0 br0Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        cr0[] cr0VarArr = br0Var.a;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            p();
            try {
                Object objNewInstance2 = k.newInstance(null);
                for (cr0 cr0Var : cr0VarArr) {
                    File fileC = l93.c(context);
                    if (fileC != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(cr0Var.f);
                                try {
                                    boolean zB = l93.b(fileC, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zB) {
                                        fileC.delete();
                                        return null;
                                    }
                                    if (!m(cr0Var.b, objNewInstance2, fileC.getPath(), cr0Var.c)) {
                                        fileC.delete();
                                        return null;
                                    }
                                    fileC.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileC.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileC.delete();
                            throw th4;
                        }
                    }
                }
                p();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) j, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) m.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = cr0VarArr.length;
            while (i2 < length) {
                cr0 cr0Var2 = cr0VarArr[i2];
                be3 be3Var = this;
                Context context2 = context;
                if (be3Var.l(context2, objNewInstance, cr0Var2.a, cr0Var2.e, cr0Var2.b, cr0Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cr0Var2.d))) {
                    i2++;
                    this = be3Var;
                    context = context2;
                } else {
                    try {
                        be3Var.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            be3 be3Var2 = this;
            if (be3Var2.o(objNewInstance)) {
                return be3Var2.n(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.k93
    public final Typeface c(Context context, lr0[] lr0VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceN;
        boolean zBooleanValue;
        if (lr0VarArr.length >= 1) {
            Method method = this.e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (lr0 lr0Var : lr0VarArr) {
                        if (lr0Var.e == 0) {
                            Uri uri = lr0Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, l93.d(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lr0VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.h;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!o(objNewInstance) || (typefaceN = n(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceN, i);
                            }
                            lr0 lr0Var2 = lr0VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lr0Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f.invoke(objNewInstance, byteBuffer, Integer.valueOf(lr0Var2.b), null, Integer.valueOf(lr0Var2.c), Integer.valueOf(lr0Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    lr0 lr0Var3 = null;
                    for (lr0 lr0Var4 : lr0VarArr) {
                        int iAbs = (Math.abs(lr0Var4.c - i3) * 2) + (lr0Var4.d == z2 ? 0 : 1);
                        if (lr0Var3 == null || i4 > iAbs) {
                            lr0Var3 = lr0Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lr0Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lr0Var3.c).setItalic(lr0Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.k93
    public final Typeface e(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!l(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (o(objNewInstance)) {
                    return n(objNewInstance);
                }
            }
        } else {
            File fileC = l93.c(context);
            try {
                if (fileC != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zB = l93.b(fileC, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zB) {
                                fileC.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
                            fileC.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileC.delete();
            }
        }
        return null;
    }

    public final boolean l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface n(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean o(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method r(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
