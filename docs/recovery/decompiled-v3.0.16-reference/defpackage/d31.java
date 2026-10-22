package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class d31 implements k7, al2, hj0, z31, j23, tv, t32 {
    public static final int[] h = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final d31 i;
    public final /* synthetic */ int e;
    public Object f;
    public Object g;

    static {
        Object obj = null;
        i = new d31(2, obj, obj);
    }

    public d31(EditText editText, int i2) {
        this.e = i2;
        switch (i2) {
            case a83.e /* 15 */:
                this.f = editText;
                oj0 oj0Var = new oj0(editText);
                this.g = oj0Var;
                editText.addTextChangedListener(oj0Var);
                if (bj0.b == null) {
                    synchronized (bj0.a) {
                        try {
                            if (bj0.b == null) {
                                bj0 bj0Var = new bj0();
                                try {
                                    bj0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, bj0.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                bj0.b = bj0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(bj0.b);
                return;
            default:
                this.f = editText;
                this.g = new t1(editText);
                return;
        }
    }

    public static String n(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static d31 o(d31 d31Var, xz1 xz1Var, x83 x83Var, int i2) {
        pa1 pa1Var = xz1Var;
        if ((i2 & 1) != 0) {
            pa1Var = (pa1) d31Var.f;
        }
        int i3 = 2;
        if ((i2 & 2) != 0) {
            x83Var = (x83) d31Var.g;
        }
        d31Var.getClass();
        return new d31(i3, pa1Var, x83Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void q(hb1 hb1Var) {
        if (hb1Var.U > 0) {
            if (hb1Var.L.d == db1.i && !hb1Var.p() && !hb1Var.q() && !hb1Var.V && hb1Var.H()) {
                cv1 cv1Var = hb1Var.K.f;
                if ((cv1Var.h & 256) != 0) {
                    while (cv1Var != null) {
                        if ((cv1Var.g & 256) != 0) {
                            ?? J = cv1Var;
                            ?? gy1Var = 0;
                            while (J != 0) {
                                if (J instanceof aw0) {
                                    aw0 aw0Var = (aw0) J;
                                    aw0Var.L(xp1.L(aw0Var, 256));
                                } else if ((J.g & 256) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var2 = ((lb0) J).t;
                                    int i2 = 0;
                                    J = J;
                                    gy1Var = gy1Var;
                                    while (cv1Var2 != null) {
                                        if ((cv1Var2.g & 256) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                gy1Var = gy1Var;
                                                J = cv1Var2;
                                            } else {
                                                if (gy1Var == 0) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var.b(J);
                                                    J = 0;
                                                }
                                                gy1Var.b(cv1Var2);
                                            }
                                        }
                                        cv1Var2 = cv1Var2.j;
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = xp1.J(gy1Var);
                            }
                        }
                        if ((cv1Var.h & 256) == 0) {
                            break;
                        } else {
                            cv1Var = cv1Var.j;
                        }
                    }
                }
            }
            hb1Var.T = false;
            gy1 gy1VarY = hb1Var.y();
            Object[] objArr = gy1VarY.e;
            int i3 = gy1VarY.g;
            for (int i4 = 0; i4 < i3; i4++) {
                q((hb1) objArr[i4]);
            }
        }
    }

    public static boolean w(Location location) {
        location.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos();
        if (0 > jElapsedRealtimeNanos || jElapsedRealtimeNanos >= 10000000001L || Math.abs(location.getLatitude()) > Double.MAX_VALUE || Math.abs(location.getLongitude()) > Double.MAX_VALUE) {
            return false;
        }
        double latitude = location.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = location.getLongitude();
        if (-180.0d > longitude || longitude > 180.0d) {
            return false;
        }
        return !(Build.VERSION.SDK_INT >= 31 ? vb.e(location) : location.isFromMockProvider());
    }

    public dj0 A(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        t1 t1Var = (t1) this.g;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            d31 d31Var = (d31) t1Var.f;
            if (!(inputConnection instanceof dj0)) {
                inputConnection = new dj0(editorInfo, inputConnection, (EditText) d31Var.f);
            }
            inputConnection2 = inputConnection;
        }
        return (dj0) inputConnection2;
    }

    public void B(yq0 yq0Var) {
        eg2 eg2Var = (eg2) this.g;
        us1 us1Var = (us1) this.f;
        int i2 = yq0Var.b;
        if (i2 != 0) {
            eg2Var.execute(new hv(us1Var, i2));
        } else {
            eg2Var.execute(new e7(4, us1Var, yq0Var.a));
        }
    }

    public m5 C(String str, g80 g80Var) throws Exception {
        LocationManager locationManager = (LocationManager) this.g;
        str.getClass();
        be beVar = new be(g80Var);
        try {
            locationManager.requestLocationUpdates(str, 1000L, 0.0f, beVar, Looper.getMainLooper());
            return new m5(3, this, beVar);
        } catch (Exception e) {
            try {
                locationManager.removeUpdates(beVar);
                throw e;
            } catch (Throwable unused) {
                throw e;
            }
        }
    }

    public void D(boolean z) {
        oj0 oj0Var = (oj0) ((d31) ((t1) this.g).f).g;
        if (oj0Var.g != z) {
            if (oj0Var.f != null) {
                wi0 wi0VarA = wi0.a();
                nj0 nj0Var = oj0Var.f;
                wi0VarA.getClass();
                ig0.l(nj0Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = wi0VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    wi0VarA.b.remove(nj0Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            oj0Var.g = z;
            if (z) {
                oj0.a(oj0Var.e, wi0.a().c());
            }
        }
    }

    public Drawable E(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.g) == null) {
                this.g = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = E(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    public void F() {
        CameraPosition cameraPositionH = ((g) this.f).h();
        CameraPosition cameraPosition = (CameraPosition) this.g;
        if (cameraPosition == null) {
            this.g = cameraPositionH;
            double d = cameraPositionH.bearing;
            throw null;
        }
        if (cameraPositionH.bearing != cameraPosition.bearing || cameraPositionH.tilt != cameraPosition.tilt) {
            throw null;
        }
        if (cameraPositionH.zoom != cameraPosition.zoom) {
            throw new iv("The LocationComponent has to be activated with one of the LocationComponent#activateLocationComponent overloads before any other methods are invoked.");
        }
        this.g = cameraPositionH;
    }

    @Override // defpackage.hj0
    public Object a() {
        return (qf3) this.f;
    }

    @Override // defpackage.t32
    public List b(Integer num) {
        List listB = ((t32) this.f).b(null);
        kx2 kx2Var = (kx2) this.g;
        int i2 = kx2Var.v;
        return i2 < 0 ? listB : zy.x0(n51.m(kx2Var, num, i2, Integer.valueOf(kx2Var.D(kx2Var.b, i2))), listB);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b9, please report this as an issue */
    @Override // defpackage.al2
    public zk2 c(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        bi2 bi2Var = (bi2) this.g;
        if (!str.equals(":memory:")) {
            str = bi2Var.c.a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        km0 km0Var = new km0(str, (bi2Var.a || bi2Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = km0Var.a;
        reentrantLock.lock();
        d31 d31Var = km0Var.b;
        if (d31Var != null) {
            try {
                d31Var.y();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                if (bi2Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                zk2 zk2VarC = ((al2) this.f).c(str);
                if (bi2Var.a) {
                    bi2.a(zk2VarC);
                    if (bi2Var.c.g == ei2.f) {
                        mh0.D("PRAGMA synchronous = NORMAL", zk2VarC);
                    } else {
                        mh0.D("PRAGMA synchronous = FULL", zk2VarC);
                    }
                    bi2Var.d.onOpen(zk2VarC);
                } else {
                    try {
                        bi2Var.b = true;
                        bi2Var.b(zk2VarC);
                        bi2Var.b = false;
                    } catch (Throwable th3) {
                        bi2Var.b = false;
                        throw th3;
                    }
                }
                if (d31Var != null && (fileChannel2 = (FileChannel) d31Var.g) != null) {
                    try {
                        fileChannel2.close();
                        d31Var.g = null;
                    } catch (Throwable th4) {
                        d31Var.g = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return zk2VarC;
            } catch (Throwable th5) {
                th = th5;
                if (z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th6) {
            if (d31Var != null && (fileChannel = (FileChannel) d31Var.g) != null) {
                try {
                    fileChannel.close();
                } finally {
                    d31Var.g = null;
                }
            }
            throw th6;
        }
    }

    @Override // defpackage.tv
    public void cancel() {
        if (((gp) this.g).compareAndSet(1, 1)) {
            return;
        }
        ((a6) this.f).invoke();
    }

    @Override // defpackage.k7
    public boolean d(l7 l7Var, MenuItem menuItem) {
        return ((k7) this.f).d(l7Var, menuItem);
    }

    @Override // defpackage.j23
    public void e(i23 i23Var) {
        ox1 ox1Var = (ox1) this.g;
        ox1Var.a();
        tx1 tx1Var = (tx1) i23Var.f;
        Object[] objArr = tx1Var.b;
        long[] jArr = tx1Var.c;
        int i2 = tx1Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object objB = ((mc1) this.f).b(obj);
            int iD = ox1Var.d(objB);
            int i4 = iD >= 0 ? ox1Var.c[iD] : 0;
            if (i4 == 7) {
                i23Var.remove(obj);
            } else {
                ox1Var.g(i4 + 1, objB);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.k7
    public boolean f(l7 l7Var, Menu menu) {
        ViewGroup viewGroup = ((zk) this.g).E;
        WeakHashMap weakHashMap = yi3.a;
        pi3.c(viewGroup);
        return ((k7) this.f).f(l7Var, menu);
    }

    @Override // defpackage.k7
    public void g(l7 l7Var) {
        ((k7) this.f).g(l7Var);
        zk zkVar = (zk) this.g;
        if (zkVar.A != null) {
            zkVar.p.getDecorView().removeCallbacks(zkVar.B);
        }
        if (zkVar.z != null) {
            sj3 sj3Var = zkVar.C;
            if (sj3Var != null) {
                sj3Var.b();
            }
            sj3 sj3VarA = yi3.a(zkVar.z);
            sj3VarA.a(0.0f);
            zkVar.C = sj3VarA;
            sj3VarA.d(new rk(this, 2));
        }
        zkVar.r.onSupportActionModeFinished(zkVar.y);
        zkVar.y = null;
        ViewGroup viewGroup = zkVar.E;
        WeakHashMap weakHashMap = yi3.a;
        pi3.c(viewGroup);
        zkVar.N();
    }

    @Override // defpackage.t32
    public boolean h() {
        return ((t32) this.f).h();
    }

    @Override // defpackage.k7
    public boolean i(l7 l7Var, ms1 ms1Var) {
        return ((k7) this.f).i(l7Var, ms1Var);
    }

    @Override // defpackage.hj0
    public boolean j(CharSequence charSequence, int i2, int i3, ee3 ee3Var) {
        if ((ee3Var.c & 4) > 0) {
            return true;
        }
        if (((qf3) this.f) == null) {
            this.f = new qf3(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((c30) this.g).getClass();
        ((qf3) this.f).setSpan(new fe3(ee3Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.al2
    public boolean k() {
        return ((al2) this.f).k();
    }

    @Override // defpackage.j23
    public boolean l(Object obj, Object obj2) {
        mc1 mc1Var = (mc1) this.f;
        return o51.f(mc1Var.b(obj), mc1Var.b(obj2));
    }

    public f83 m(List list) {
        ei0 ei0Var;
        Exception e;
        try {
            int size = list.size();
            int i2 = 0;
            ei0Var = null;
            while (i2 < size) {
                try {
                    ei0 ei0Var2 = (ei0) list.get(i2);
                    try {
                        ei0Var2.a((mi0) this.g);
                        i2++;
                        ei0Var = ei0Var2;
                    } catch (Exception e2) {
                        e = e2;
                        ei0Var = ei0Var2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((mi0) this.g).a.c());
                        sb2.append(", composition=");
                        sb2.append(((mi0) this.g).c());
                        sb2.append(", selection=");
                        mi0 mi0Var = (mi0) this.g;
                        sb2.append((Object) f93.h(g93.a(mi0Var.b, mi0Var.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        zy.r0(list, sb, new t(ei0Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            mi0 mi0Var2 = (mi0) this.g;
            mi0Var2.getClass();
            dj djVar = new dj(mi0Var2.a.toString());
            mi0 mi0Var3 = (mi0) this.g;
            long jA = g93.a(mi0Var3.b, mi0Var3.c);
            f93 f93Var = f93.g(((f83) this.f).b) ? null : new f93(jA);
            f83 f83Var = new f83(djVar, f93Var != null ? f93Var.a : g93.a(f93.e(jA), f93.f(jA)), ((mi0) this.g).c());
            this.f = f83Var;
            return f83Var;
        } catch (Exception e4) {
            ei0Var = null;
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p() {
        Object[] objArr;
        gy1 gy1Var = (gy1) this.f;
        Arrays.sort(gy1Var.e, 0, gy1Var.g, gq0.d);
        int i2 = gy1Var.g;
        hb1[] hb1VarArr = (hb1[]) this.g;
        if (hb1VarArr == null || hb1VarArr.length < i2) {
            objArr = hb1VarArr;
            objArr = new hb1[Math.max(16, i2)];
        }
        objArr = hb1VarArr;
        this.g = null;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = gy1Var.e[i3];
        }
        gy1Var.g();
        while (true) {
            i2--;
            if (-1 >= i2) {
                this.g = objArr;
                return;
            }
            hb1 hb1Var = objArr[i2];
            hb1Var.getClass();
            if (hb1Var.T) {
                q(hb1Var);
            }
            objArr[i2] = 0;
        }
    }

    public ArrayList r() {
        LocationManager locationManager = (LocationManager) this.g;
        Context context = (Context) this.f;
        boolean z = zm3.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = zm3.k(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (!z && !z2) {
            throw new SecurityException("Location permission required");
        }
        List<String> allProviders = locationManager.getAllProviders();
        allProviders.getClass();
        Set setN0 = zy.N0(allProviders);
        List listG = am1.G("gps", "network");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            String str = (String) obj;
            if (setN0.contains(str) && (!o51.f(str, "gps") || z)) {
                if (locationManager.isProviderEnabled(str)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    public q02 s(zd3 zd3Var) {
        o50 o50Var;
        String str;
        q02 n50Var;
        Type type = zd3Var.b;
        Class cls = zd3Var.a;
        HashMap map = (HashMap) this.f;
        c30 c30Var = null;
        if (map.get(type) != null) {
            b81.u();
            return null;
        }
        if (map.get(cls) != null) {
            b81.u();
            return null;
        }
        int i2 = 1;
        int i3 = 0;
        if (EnumSet.class.isAssignableFrom(cls)) {
            o50Var = new o50(type, i3);
        } else {
            o50Var = cls == EnumMap.class ? new o50(type, i2) : null;
        }
        if (o50Var != null) {
            return o50Var;
        }
        ee0.x((ArrayList) this.g);
        if (Modifier.isAbstract(cls.getModifiers())) {
            n50Var = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                ke0 ke0Var = bf2.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + bf2.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                }
                n50Var = str != null ? new n50(str, i2) : new t1(declaredConstructor, 12);
            } catch (NoSuchMethodException unused) {
                n50Var = null;
            }
        }
        if (n50Var != null) {
            return n50Var;
        }
        int i4 = 11;
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                c30Var = new c30(3);
            } else if (Set.class.isAssignableFrom(cls)) {
                c30Var = new c30(4);
            } else {
                c30Var = Queue.class.isAssignableFrom(cls) ? new c30(5) : new c30(6);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c30Var = new c30(7);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                c30Var = new c30(8);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                c30Var = new c30(9);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeJ = sb.J(type2);
                Class clsV = sb.V(typeJ);
                typeJ.hashCode();
                if (String.class.isAssignableFrom(clsV)) {
                    c30Var = new c30(i4);
                } else {
                    c30Var = new c30(10);
                }
            } else {
                c30Var = new c30(i4);
            }
        }
        if (c30Var != null) {
            return c30Var;
        }
        String strN = n(cls);
        return strN != null ? new n50(strN, i3) : new t1(cls, i4);
    }

    public InputMethodManager t() {
        return (InputMethodManager) ((zb1) this.g).getValue();
    }

    @Override // defpackage.z31
    public w31 toInstant() {
        throw new x31(((String) this.f) + " when parsing an Instant from \"" + ji2.W(64, (String) this.g) + '\"');
    }

    public String toString() {
        switch (this.e) {
            case 11:
                return ((HashMap) this.f).toString();
            default:
                return super.toString();
        }
    }

    public KeyListener u(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof gj0)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new gj0(keyListener);
    }

    public er1 v() {
        return (er1) ((w52) this.g).getValue();
    }

    public void x(AttributeSet attributeSet, int i2) {
        boolean z = true;
        switch (this.e) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f;
                gn gnVarY = gn.y(absSeekBar.getContext(), attributeSet, h, i2);
                Drawable drawableN = gnVarY.n(0);
                if (drawableN != null) {
                    if (drawableN instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableN;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableE = E(animationDrawable.getFrame(i3), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableN = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableN);
                }
                Drawable drawableN2 = gnVarY.n(1);
                if (drawableN2 != null) {
                    absSeekBar.setProgressDrawable(E(drawableN2, false));
                }
                gnVarY.A();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f).getContext().obtainStyledAttributes(attributeSet, jd2.i, i2, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    D(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void y() throws IOException {
        String str = (String) this.f;
        if (((FileChannel) this.g) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.g = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.g;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.g = null;
            throw new IllegalStateException(az2.k("Unable to lock file: '", str, "'."), th);
        }
    }

    public AutofillId z(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return rn.c(fa.e(this.g), ((View) this.f).getAutofillId(), j);
        }
        return null;
    }

    public /* synthetic */ d31(int i2, Object obj, Object obj2, boolean z) {
        this.e = i2;
        this.g = obj;
        this.f = obj2;
    }

    public /* synthetic */ d31(int i2, boolean z) {
        this.e = i2;
    }

    public d31(int i2) {
        this.e = i2;
        switch (i2) {
            case 26:
                this.f = new zx1();
                this.g = new zx1();
                break;
            case 27:
                this.f = new gy1(new hb1[16]);
                break;
            default:
                this.f = new ai3(0);
                this.g = new ai3(0);
                break;
        }
    }

    public d31(hb1 hb1Var, er1 er1Var) {
        this.e = 20;
        this.f = hb1Var;
        this.g = ke0.H(er1Var);
    }

    public d31(String str) {
        this.e = 17;
        this.f = str.concat(".lck");
    }

    public d31(Context context) {
        this.e = 3;
        context.getClass();
        this.f = context;
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        this.g = (LocationManager) systemService;
    }

    public d31(a6 a6Var) {
        this.e = 28;
        this.f = a6Var;
        this.g = new gp(0);
    }

    public d31(AbsSeekBar absSeekBar) {
        this.e = 1;
        this.f = absSeekBar;
    }

    public /* synthetic */ d31(int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    public d31(View view) {
        this.e = 0;
        this.f = view;
        this.g = ig0.A(ce1.g, new hd(this, 18));
    }

    public d31(bi2 bi2Var, al2 al2Var) {
        this.e = 7;
        al2Var.getClass();
        this.g = bi2Var;
        this.f = al2Var;
    }

    public d31(mc1 mc1Var) {
        this.e = 21;
        this.f = mc1Var;
        ox1 ox1Var = r02.a;
        this.g = new ox1();
    }

    public d31(g gVar, ArrayList arrayList) {
        this.e = 22;
        new WeakReference(this);
        new WeakReference(this);
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new xh1(this);
        new yh1(this);
        wh1 wh1Var = new wh1(this);
        this.f = gVar;
        arrayList.add(wh1Var);
    }
}
