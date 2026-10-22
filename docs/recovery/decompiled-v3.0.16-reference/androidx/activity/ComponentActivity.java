package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import defpackage.au0;
import defpackage.b10;
import defpackage.b8;
import defpackage.b80;
import defpackage.b81;
import defpackage.bf1;
import defpackage.bs0;
import defpackage.c10;
import defpackage.c80;
import defpackage.cc0;
import defpackage.cx1;
import defpackage.d10;
import defpackage.d8;
import defpackage.da0;
import defpackage.df1;
import defpackage.dx1;
import defpackage.e82;
import defpackage.f10;
import defpackage.f8;
import defpackage.ff1;
import defpackage.fo;
import defpackage.g10;
import defpackage.gs0;
import defpackage.i43;
import defpackage.j60;
import defpackage.j8;
import defpackage.k22;
import defpackage.lj3;
import defpackage.lx0;
import defpackage.mj3;
import defpackage.mm2;
import defpackage.oe2;
import defpackage.oj3;
import defpackage.ol2;
import defpackage.pj3;
import defpackage.qm2;
import defpackage.qs1;
import defpackage.qt1;
import defpackage.r50;
import defpackage.r93;
import defpackage.rm2;
import defpackage.rs1;
import defpackage.s7;
import defpackage.sm2;
import defpackage.t00;
import defpackage.tm2;
import defpackage.u7;
import defpackage.v00;
import defpackage.ve1;
import defpackage.vf2;
import defpackage.w00;
import defpackage.we1;
import defpackage.x00;
import defpackage.x12;
import defpackage.x7;
import defpackage.xe1;
import defpackage.xf2;
import defpackage.y00;
import defpackage.y12;
import defpackage.z00;
import defpackage.z12;
import defpackage.zb1;
import defpackage.zt0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements pj3, lx0, tm2, y12, j8 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final z00 Companion = new z00();
    private oj3 _viewModelStore;
    private final f8 activityResultRegistry;
    private int contentLayoutId;
    private final j60 contextAwareHelper;
    private final zb1 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final zb1 fullyDrawnReporter$delegate;
    private final rs1 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final zb1 onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<r50> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<r50> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<r50> onNewIntentListeners;
    private final CopyOnWriteArrayList<r50> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<r50> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final c10 reportFullyDrawnExecutor;
    private final rm2 savedStateRegistryController;

    public ComponentActivity() {
        this.contextAwareHelper = new j60();
        final int i = 0;
        this.menuHostHelper = new rs1(new t00(this, i));
        int i2 = 3;
        sm2 sm2Var = new sm2(this, new ol2(this, i2));
        this.savedStateRegistryController = new rm2(sm2Var);
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = new i43(new g10(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f10(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            fo.n("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new bf1(this) { // from class: u00
            public final /* synthetic */ ComponentActivity f;

            {
                this.f = this;
            }

            @Override // defpackage.bf1
            public final void U(df1 df1Var, ve1 ve1Var) {
                int i3 = i;
                ComponentActivity componentActivity = this.f;
                switch (i3) {
                    case 0:
                        ComponentActivity._init_$lambda$2(componentActivity, df1Var, ve1Var);
                        break;
                    default:
                        ComponentActivity._init_$lambda$3(componentActivity, df1Var, ve1Var);
                        break;
                }
            }
        });
        final int i3 = 1;
        getLifecycle().a(new bf1(this) { // from class: u00
            public final /* synthetic */ ComponentActivity f;

            {
                this.f = this;
            }

            @Override // defpackage.bf1
            public final void U(df1 df1Var, ve1 ve1Var) {
                int i4 = i3;
                ComponentActivity componentActivity = this.f;
                switch (i4) {
                    case 0:
                        ComponentActivity._init_$lambda$2(componentActivity, df1Var, ve1Var);
                        break;
                    default:
                        ComponentActivity._init_$lambda$3(componentActivity, df1Var, ve1Var);
                        break;
                }
            }
        });
        getLifecycle().a(new oe2(this, i3));
        sm2Var.a();
        we1 we1Var = ((ff1) getLifecycle()).d;
        if (we1Var != we1.f && we1Var != we1.g) {
            fo.i("Failed requirement.");
            throw null;
        }
        if (getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            mm2 mm2Var = new mm2(getSavedStateRegistry(), this);
            getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", mm2Var);
            getLifecycle().a(new oe2(mm2Var, i2));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new v00(this, i));
        addOnContextAvailableListener(new w00(this, i));
        this.defaultViewModelProviderFactory$delegate = new i43(new g10(this, i));
        this.onBackPressedDispatcher$delegate = new i43(new g10(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, df1 df1Var, ve1 ve1Var) {
        Window window;
        View viewPeekDecorView;
        componentActivity.getClass();
        df1Var.getClass();
        ve1Var.getClass();
        if (ve1Var != ve1.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, df1 df1Var, ve1 ve1Var) {
        componentActivity.getClass();
        df1Var.getClass();
        ve1Var.getClass();
        if (ve1Var == ve1.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            d10 d10Var = (d10) componentActivity.reportFullyDrawnExecutor;
            ComponentActivity componentActivity2 = d10Var.h;
            componentActivity2.getWindow().getDecorView().removeCallbacks(d10Var);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(d10Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        f8 f8Var = componentActivity.activityResultRegistry;
        f8Var.getClass();
        LinkedHashMap linkedHashMap = f8Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(f8Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(f8Var.g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        componentActivity.getClass();
        context.getClass();
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            f8 f8Var = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = f8Var.b;
            LinkedHashMap linkedHashMap2 = f8Var.a;
            Bundle bundle = f8Var.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                f8Var.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        da0.l(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                f8Var.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(x12 x12Var) {
        getLifecycle().a(new x00(0, x12Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(x12 x12Var, ComponentActivity componentActivity, df1 df1Var, ve1 ve1Var) {
        x12Var.getClass();
        componentActivity.getClass();
        df1Var.getClass();
        ve1Var.getClass();
        if (ve1Var == ve1.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = y00.a.a(componentActivity);
            onBackInvokedDispatcherA.getClass();
            x12Var.e = onBackInvokedDispatcherA;
            x12Var.d(x12Var.g);
        }
    }

    private final c10 createFullyDrawnExecutor() {
        return new d10(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            b10 b10Var = (b10) getLastNonConfigurationInstance();
            if (b10Var != null) {
                this._viewModelStore = b10Var.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new oj3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        componentActivity.getClass();
        componentActivity.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        c10 c10Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((d10) c10Var).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(qt1 qt1Var, df1 df1Var) {
        qt1Var.getClass();
        df1Var.getClass();
        rs1 rs1Var = this.menuHostHelper;
        rs1Var.b.add(qt1Var);
        rs1Var.a.run();
        xe1 lifecycle = df1Var.getLifecycle();
        HashMap map = rs1Var.c;
        qs1 qs1Var = (qs1) map.remove(qt1Var);
        if (qs1Var != null) {
            qs1Var.a.b(qs1Var.b);
            qs1Var.b = null;
        }
        map.put(qt1Var, new qs1(lifecycle, new x00(1, rs1Var, qt1Var)));
    }

    public final void addOnConfigurationChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onConfigurationChangedListeners.add(r50Var);
    }

    public final void addOnContextAvailableListener(z12 z12Var) {
        z12Var.getClass();
        j60 j60Var = this.contextAwareHelper;
        j60Var.getClass();
        ComponentActivity componentActivity = j60Var.b;
        if (componentActivity != null) {
            z12Var.a(componentActivity);
        }
        j60Var.a.add(z12Var);
    }

    public final void addOnMultiWindowModeChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onMultiWindowModeChangedListeners.add(r50Var);
    }

    public final void addOnNewIntentListener(r50 r50Var) {
        r50Var.getClass();
        this.onNewIntentListeners.add(r50Var);
    }

    public final void addOnPictureInPictureModeChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(r50Var);
    }

    public final void addOnTrimMemoryListener(r50 r50Var) {
        r50Var.getClass();
        this.onTrimMemoryListeners.add(r50Var);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // defpackage.j8
    public final f8 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.lx0
    public c80 getDefaultViewModelCreationExtras() {
        dx1 dx1Var = new dx1(b80.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dx1Var.a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(lj3.d, application2);
        }
        linkedHashMap.put(k22.x, this);
        linkedHashMap.put(k22.y, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(k22.z, extras);
        }
        return dx1Var;
    }

    public mj3 getDefaultViewModelProviderFactory() {
        return (mj3) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public zt0 getFullyDrawnReporter() {
        return (zt0) this.fullyDrawnReporter$delegate.getValue();
    }

    @cc0
    public Object getLastCustomNonConfigurationInstance() {
        b10 b10Var = (b10) getLastNonConfigurationInstance();
        if (b10Var != null) {
            return b10Var.a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, defpackage.df1
    public xe1 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.y12
    public final x12 getOnBackPressedDispatcher() {
        return (x12) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.tm2
    public final qm2 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.pj3
    public oj3 getViewModelStore() {
        if (getApplication() == null) {
            fo.n("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        oj3 oj3Var = this._viewModelStore;
        oj3Var.getClass();
        return oj3Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(2131230945, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131230949, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131230948, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131230947, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131230869, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @cc0
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @cc0
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<r50> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        j60 j60Var = this.contextAwareHelper;
        j60Var.getClass();
        j60Var.b = this;
        Iterator it = j60Var.a.iterator();
        while (it.hasNext()) {
            ((z12) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = xf2.f;
        vf2.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        rs1 rs1Var = this.menuHostHelper;
        getMenuInflater();
        rs1Var.a();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        this.menuHostHelper.b();
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<r50> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new cx1(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<r50> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            gs0 gs0Var = ((bs0) ((qt1) it.next())).a;
            if (gs0Var.t >= 1) {
                Iterator it2 = gs0Var.c.k().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        b81.u();
                        return;
                    }
                }
            }
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<r50> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new e82(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.menuHostHelper.c();
        return true;
    }

    @Override // android.app.Activity
    @cc0
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @cc0
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b10 b10Var;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        oj3 oj3Var = this._viewModelStore;
        if (oj3Var == null && (b10Var = (b10) getLastNonConfigurationInstance()) != null) {
            oj3Var = b10Var.b;
        }
        if (oj3Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        b10 b10Var2 = new b10();
        b10Var2.a = objOnRetainCustomNonConfigurationInstance;
        b10Var2.b = oj3Var;
        return b10Var2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof ff1) {
            xe1 lifecycle = getLifecycle();
            lifecycle.getClass();
            ff1 ff1Var = (ff1) lifecycle;
            ff1Var.d("setCurrentState");
            ff1Var.f(we1.g);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<r50> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> x7 registerForActivityResult(final u7 u7Var, final f8 f8Var, final s7 s7Var) {
        u7Var.getClass();
        f8Var.getClass();
        s7Var.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = f8Var.c;
        xe1 lifecycle = getLifecycle();
        if (((ff1) lifecycle).d.compareTo(we1.h) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            we1 we1Var = ((ff1) lifecycle).d;
            sb.append(" is attempting to register while current state is ");
            sb.append(we1Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        f8Var.d(str);
        b8 b8Var = (b8) linkedHashMap.get(str);
        if (b8Var == null) {
            b8Var = new b8(lifecycle);
        }
        bf1 bf1Var = new bf1() { // from class: z7
            @Override // defpackage.bf1
            public final void U(df1 df1Var, ve1 ve1Var) {
                f8 f8Var2 = f8Var;
                Bundle bundle = f8Var2.g;
                LinkedHashMap linkedHashMap2 = f8Var2.e;
                LinkedHashMap linkedHashMap3 = f8Var2.f;
                ve1 ve1Var2 = ve1.ON_START;
                String str2 = str;
                if (ve1Var2 != ve1Var) {
                    if (ve1.ON_STOP == ve1Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (ve1.ON_DESTROY == ve1Var) {
                            f8Var2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                u7 u7Var2 = u7Var;
                s7 s7Var2 = s7Var;
                linkedHashMap2.put(str2, new a8(u7Var2, s7Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    s7Var2.b(obj);
                }
                r7 r7Var = (r7) sb.U(str2, bundle);
                if (r7Var != null) {
                    bundle.remove(str2);
                    s7Var2.b(u7Var2.c(r7Var.f, r7Var.e));
                }
            }
        };
        b8Var.a.a(bf1Var);
        b8Var.b.add(bf1Var);
        linkedHashMap.put(str, b8Var);
        return new d8();
    }

    public void removeMenuProvider(qt1 qt1Var) {
        qt1Var.getClass();
        this.menuHostHelper.d(qt1Var);
    }

    public final void removeOnConfigurationChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onConfigurationChangedListeners.remove(r50Var);
    }

    public final void removeOnContextAvailableListener(z12 z12Var) {
        z12Var.getClass();
        j60 j60Var = this.contextAwareHelper;
        j60Var.getClass();
        j60Var.a.remove(z12Var);
    }

    public final void removeOnMultiWindowModeChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(r50Var);
    }

    public final void removeOnNewIntentListener(r50 r50Var) {
        r50Var.getClass();
        this.onNewIntentListeners.remove(r50Var);
    }

    public final void removeOnPictureInPictureModeChangedListener(r50 r50Var) {
        r50Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(r50Var);
    }

    public final void removeOnTrimMemoryListener(r50 r50Var) {
        r50Var.getClass();
        this.onTrimMemoryListeners.remove(r50Var);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (r93.b()) {
                r93.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            zt0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((au0) obj).invoke();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        c10 c10Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((d10) c10Var).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @cc0
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @cc0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @cc0
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @cc0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        c10 c10Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((d10) c10Var).a(decorView);
        super.setContentView(view);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        c10 c10Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((d10) c10Var).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @cc0
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<r50> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new cx1(z));
        }
    }

    @Override // android.app.Activity
    @cc0
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<r50> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new e82(z));
        }
    }

    public void addMenuProvider(qt1 qt1Var) {
        qt1Var.getClass();
        rs1 rs1Var = this.menuHostHelper;
        rs1Var.b.add(qt1Var);
        rs1Var.a.run();
    }

    public void addMenuProvider(final qt1 qt1Var, df1 df1Var, final we1 we1Var) {
        qt1Var.getClass();
        df1Var.getClass();
        we1Var.getClass();
        final rs1 rs1Var = this.menuHostHelper;
        rs1Var.getClass();
        xe1 lifecycle = df1Var.getLifecycle();
        HashMap map = rs1Var.c;
        qs1 qs1Var = (qs1) map.remove(qt1Var);
        if (qs1Var != null) {
            qs1Var.a.b(qs1Var.b);
            qs1Var.b = null;
        }
        map.put(qt1Var, new qs1(lifecycle, new bf1() { // from class: ps1
            @Override // defpackage.bf1
            public final void U(df1 df1Var2, ve1 ve1Var) {
                ve1 ve1Var2;
                rs1 rs1Var2 = rs1Var;
                rs1Var2.getClass();
                Runnable runnable = rs1Var2.a;
                CopyOnWriteArrayList copyOnWriteArrayList = rs1Var2.b;
                ve1.Companion.getClass();
                we1 we1Var2 = we1Var;
                int iOrdinal = we1Var2.ordinal();
                ve1 ve1Var3 = null;
                if (iOrdinal == 2) {
                    ve1Var2 = ve1.ON_CREATE;
                } else if (iOrdinal != 3) {
                    ve1Var2 = iOrdinal != 4 ? null : ve1.ON_RESUME;
                } else {
                    ve1Var2 = ve1.ON_START;
                }
                qt1 qt1Var2 = qt1Var;
                if (ve1Var == ve1Var2) {
                    copyOnWriteArrayList.add(qt1Var2);
                    runnable.run();
                    return;
                }
                ve1 ve1Var4 = ve1.ON_DESTROY;
                if (ve1Var == ve1Var4) {
                    rs1Var2.d(qt1Var2);
                    return;
                }
                int iOrdinal2 = we1Var2.ordinal();
                if (iOrdinal2 == 2) {
                    ve1Var3 = ve1Var4;
                } else if (iOrdinal2 == 3) {
                    ve1Var3 = ve1.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    ve1Var3 = ve1.ON_PAUSE;
                }
                if (ve1Var == ve1Var3) {
                    copyOnWriteArrayList.remove(qt1Var2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> x7 registerForActivityResult(u7 u7Var, s7 s7Var) {
        u7Var.getClass();
        s7Var.getClass();
        return registerForActivityResult(u7Var, this.activityResultRegistry, s7Var);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
