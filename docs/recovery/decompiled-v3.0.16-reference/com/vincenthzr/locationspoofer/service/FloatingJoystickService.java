package com.vincenthzr.locationspoofer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.view.WindowManager;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import defpackage.au0;
import defpackage.c30;
import defpackage.ce1;
import defpackage.d30;
import defpackage.df1;
import defpackage.ee0;
import defpackage.eo0;
import defpackage.f30;
import defpackage.ff1;
import defpackage.ho0;
import defpackage.ig0;
import defpackage.jo0;
import defpackage.k;
import defpackage.ko0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.oj3;
import defpackage.ol2;
import defpackage.ov0;
import defpackage.p10;
import defpackage.pj3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qm2;
import defpackage.rm2;
import defpackage.s03;
import defpackage.sb;
import defpackage.sm2;
import defpackage.t;
import defpackage.tm2;
import defpackage.ve1;
import defpackage.wo0;
import defpackage.wq1;
import defpackage.x20;
import defpackage.xe1;
import defpackage.xq1;
import defpackage.zb1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FloatingJoystickService extends Service implements df1, pj3, tm2 {
    public static final int $stable = 8;
    public static final ho0 Companion = new ho0();
    public static final String EXTRA_ALLOW_IDLE = "allow_idle";
    private static volatile boolean isShowing;
    private x20 composeView;
    private boolean keepIdleWindow;
    private final ff1 lifecycleRegistry;
    private final zb1 motionController$delegate;
    private boolean observingState;
    private WindowManager.LayoutParams params;
    private final zb1 runtimeAuthorization$delegate;
    private final rm2 savedStateRegistryController;
    private final oj3 store;
    private WindowManager windowManager;

    public FloatingJoystickService() {
        ko0 ko0Var = new ko0(this, 0);
        ce1 ce1Var = ce1.e;
        this.motionController$delegate = ig0.A(ce1Var, ko0Var);
        this.runtimeAuthorization$delegate = ig0.A(ce1Var, new ko0(this, 1));
        this.lifecycleRegistry = new ff1(this, true);
        this.store = new oj3();
        this.savedStateRegistryController = new rm2(new sm2(this, new ol2(this, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionController getMotionController() {
        return (MotionController) this.motionController$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RuntimeAuthorizationManager getRuntimeAuthorization() {
        return (RuntimeAuthorizationManager) this.runtimeAuthorization$delegate.getValue();
    }

    private final void moveWindow(float f, float f2) {
        WindowManager.LayoutParams layoutParams = this.params;
        if (layoutParams == null) {
            o51.F("params");
            throw null;
        }
        layoutParams.x = xq1.P(f) + layoutParams.x;
        WindowManager.LayoutParams layoutParams2 = this.params;
        if (layoutParams2 == null) {
            o51.F("params");
            throw null;
        }
        layoutParams2.y = xq1.P(f2) + layoutParams2.y;
        x20 x20Var = this.composeView;
        if (x20Var != null) {
            WindowManager windowManager = this.windowManager;
            if (windowManager == null) {
                o51.F("windowManager");
                throw null;
            }
            WindowManager.LayoutParams layoutParams3 = this.params;
            if (layoutParams3 != null) {
                windowManager.updateViewLayout(x20Var, layoutParams3);
            } else {
                o51.F("params");
                throw null;
            }
        }
    }

    private final void observeState() {
        q60 q60Var = null;
        BuildersKt__Builders_commonKt.launch$default(ig0.t(this), null, null, new jo0(this, q60Var, 0), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ig0.t(this), null, null, new jo0(this, q60Var, 1), 3, null);
    }

    private final void saveRecording(String str) {
        BuildersKt__Builders_commonKt.launch$default(ig0.t(this), null, null, new k(this, str, null, 24), 3, null);
    }

    private final void setFocusable(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = this.params;
        if (z) {
            if (layoutParams == null) {
                o51.F("params");
                throw null;
            }
            i = layoutParams.flags & (-9);
        } else {
            if (layoutParams == null) {
                o51.F("params");
                throw null;
            }
            i = layoutParams.flags | 8;
        }
        if (layoutParams == null) {
            o51.F("params");
            throw null;
        }
        if (i == layoutParams.flags) {
            return;
        }
        if (layoutParams == null) {
            o51.F("params");
            throw null;
        }
        layoutParams.flags = i;
        x20 x20Var = this.composeView;
        if (x20Var != null) {
            WindowManager windowManager = this.windowManager;
            if (windowManager == null) {
                o51.F("windowManager");
                throw null;
            }
            if (layoutParams != null) {
                windowManager.updateViewLayout(x20Var, layoutParams);
            } else {
                o51.F("params");
                throw null;
            }
        }
    }

    private final void showFloatingWindow() {
        float f = getResources().getDisplayMetrics().density;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 40, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = (int) (16.0f * f);
        layoutParams.y = (int) (160.0f * f);
        this.params = layoutParams;
        x20 x20Var = new x20(this);
        x20Var.setTag(2131230945, this);
        x20Var.setTag(2131230949, this);
        x20Var.setTag(2131230948, this);
        x20Var.setContent(new p10(new eo0(this, x20Var, 1), true, -231971965));
        this.composeView = x20Var;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            o51.F("windowManager");
            throw null;
        }
        WindowManager.LayoutParams layoutParams2 = this.params;
        if (layoutParams2 != null) {
            windowManager.addView(x20Var, layoutParams2);
        } else {
            o51.F("params");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23(FloatingJoystickService floatingJoystickService, x20 x20Var, f30 f30Var, int i) {
        int i2 = 0;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            wq1.b(null, null, null, sb.a0(-1678891945, new eo0(floatingJoystickService, x20Var, i2), ov0Var), ov0Var, 3072, 7);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22(final FloatingJoystickService floatingJoystickService, x20 x20Var, f30 f30Var, int i) {
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            MotionController.State stateShowFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$1 = showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$1(ee0.s(floatingJoystickService.getMotionController().getState(), ov0Var));
            boolean zH = ov0Var.h(floatingJoystickService);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new pu0(floatingJoystickService) { // from class: do0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i2;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$3$lambda$2(floatingJoystickService2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$5$lambda$4(floatingJoystickService2, ((Double) obj).doubleValue(), ((Float) obj2).floatValue());
                        }
                    }
                };
                ov0Var.m0(objQ);
            }
            pu0 pu0Var = (pu0) objQ;
            boolean zH2 = ov0Var.h(floatingJoystickService);
            Object objQ2 = ov0Var.Q();
            if (zH2 || objQ2 == c30Var) {
                objQ2 = new pu0(floatingJoystickService) { // from class: do0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i3;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$3$lambda$2(floatingJoystickService2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$5$lambda$4(floatingJoystickService2, ((Double) obj).doubleValue(), ((Float) obj2).floatValue());
                        }
                    }
                };
                ov0Var.m0(objQ2);
            }
            pu0 pu0Var2 = (pu0) objQ2;
            boolean zH3 = ov0Var.h(floatingJoystickService);
            Object objQ3 = ov0Var.Q();
            if (zH3 || objQ3 == c30Var) {
                objQ3 = new au0(floatingJoystickService) { // from class: fo0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i5 = i2;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(floatingJoystickService2);
                            case 1:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(floatingJoystickService2);
                            case 2:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(floatingJoystickService2);
                            case 3:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(floatingJoystickService2);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(floatingJoystickService2);
                        }
                    }
                };
                ov0Var.m0(objQ3);
            }
            au0 au0Var = (au0) objQ3;
            boolean zH4 = ov0Var.h(floatingJoystickService);
            Object objQ4 = ov0Var.Q();
            if (zH4 || objQ4 == c30Var) {
                objQ4 = new au0(floatingJoystickService) { // from class: fo0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i5 = i3;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(floatingJoystickService2);
                            case 1:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(floatingJoystickService2);
                            case 2:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(floatingJoystickService2);
                            case 3:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(floatingJoystickService2);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(floatingJoystickService2);
                        }
                    }
                };
                ov0Var.m0(objQ4);
            }
            au0 au0Var2 = (au0) objQ4;
            boolean zH5 = ov0Var.h(floatingJoystickService);
            Object objQ5 = ov0Var.Q();
            if (zH5 || objQ5 == c30Var) {
                objQ5 = new lu0(floatingJoystickService) { // from class: go0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        int i5 = i2;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$11$lambda$10(floatingJoystickService2, (MotionController.SpeedPreset) obj);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$17$lambda$16(floatingJoystickService2, (String) obj);
                        }
                    }
                };
                ov0Var.m0(objQ5);
            }
            lu0 lu0Var = (lu0) objQ5;
            boolean zH6 = ov0Var.h(floatingJoystickService);
            Object objQ6 = ov0Var.Q();
            if (zH6 || objQ6 == c30Var) {
                objQ6 = new au0(floatingJoystickService) { // from class: fo0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i5 = i4;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i5) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(floatingJoystickService2);
                            case 1:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(floatingJoystickService2);
                            case 2:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(floatingJoystickService2);
                            case 3:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(floatingJoystickService2);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(floatingJoystickService2);
                        }
                    }
                };
                ov0Var.m0(objQ6);
            }
            au0 au0Var3 = (au0) objQ6;
            boolean zH7 = ov0Var.h(floatingJoystickService);
            Object objQ7 = ov0Var.Q();
            if (zH7 || objQ7 == c30Var) {
                final int i5 = 3;
                objQ7 = new au0(floatingJoystickService) { // from class: fo0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i6 = i5;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i6) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(floatingJoystickService2);
                            case 1:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(floatingJoystickService2);
                            case 2:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(floatingJoystickService2);
                            case 3:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(floatingJoystickService2);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(floatingJoystickService2);
                        }
                    }
                };
                ov0Var.m0(objQ7);
            }
            au0 au0Var4 = (au0) objQ7;
            boolean zH8 = ov0Var.h(floatingJoystickService);
            Object objQ8 = ov0Var.Q();
            if (zH8 || objQ8 == c30Var) {
                objQ8 = new lu0(floatingJoystickService) { // from class: go0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        int i6 = i3;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i6) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$11$lambda$10(floatingJoystickService2, (MotionController.SpeedPreset) obj);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$17$lambda$16(floatingJoystickService2, (String) obj);
                        }
                    }
                };
                ov0Var.m0(objQ8);
            }
            lu0 lu0Var2 = (lu0) objQ8;
            boolean zH9 = ov0Var.h(floatingJoystickService);
            Object objQ9 = ov0Var.Q();
            if (zH9 || objQ9 == c30Var) {
                final int i6 = 4;
                objQ9 = new au0(floatingJoystickService) { // from class: fo0
                    public final /* synthetic */ FloatingJoystickService f;

                    {
                        this.f = floatingJoystickService;
                    }

                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i7 = i6;
                        FloatingJoystickService floatingJoystickService2 = this.f;
                        switch (i7) {
                            case 0:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(floatingJoystickService2);
                            case 1:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(floatingJoystickService2);
                            case 2:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(floatingJoystickService2);
                            case 3:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(floatingJoystickService2);
                            default:
                                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(floatingJoystickService2);
                        }
                    }
                };
                ov0Var.m0(objQ9);
            }
            au0 au0Var5 = (au0) objQ9;
            boolean zH10 = ov0Var.h(x20Var);
            Object objQ10 = ov0Var.Q();
            if (zH10 || objQ10 == c30Var) {
                objQ10 = new t(x20Var, 16);
                ov0Var.m0(objQ10);
            }
            wo0.c(stateShowFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$1, pu0Var, pu0Var2, au0Var, au0Var2, lu0Var, au0Var3, au0Var4, lu0Var2, au0Var5, (lu0) objQ10, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    private static final MotionController.State showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$1(s03 s03Var) {
        return (MotionController.State) s03Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$11$lambda$10(FloatingJoystickService floatingJoystickService, MotionController.SpeedPreset speedPreset) {
        speedPreset.getClass();
        floatingJoystickService.getMotionController().setSpeedPreset(speedPreset);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$13$lambda$12(FloatingJoystickService floatingJoystickService) {
        floatingJoystickService.getMotionController().startRecording();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$15$lambda$14(FloatingJoystickService floatingJoystickService) {
        floatingJoystickService.getMotionController().stopRecording();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$17$lambda$16(FloatingJoystickService floatingJoystickService, String str) {
        str.getClass();
        floatingJoystickService.saveRecording(str);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$19$lambda$18(FloatingJoystickService floatingJoystickService) {
        floatingJoystickService.getMotionController().discardRecording();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20(x20 x20Var, boolean z) {
        x20Var.setFocusable(z);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$3$lambda$2(FloatingJoystickService floatingJoystickService, float f, float f2) {
        floatingJoystickService.moveWindow(f, f2);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$5$lambda$4(FloatingJoystickService floatingJoystickService, double d, float f) {
        floatingJoystickService.getMotionController().joystick(d, f);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$7$lambda$6(FloatingJoystickService floatingJoystickService) {
        floatingJoystickService.getMotionController().pause();
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$9$lambda$8(FloatingJoystickService floatingJoystickService) {
        floatingJoystickService.getMotionController().resume();
        return mf3.a;
    }

    @Override // defpackage.df1
    public xe1 getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // defpackage.tm2
    public qm2 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.pj3
    public oj3 getViewModelStore() {
        return this.store;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.savedStateRegistryController.a(null);
        this.lifecycleRegistry.e(ve1.ON_CREATE);
        Object systemService = getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        this.lifecycleRegistry.e(ve1.ON_START);
        this.lifecycleRegistry.e(ve1.ON_RESUME);
    }

    @Override // android.app.Service
    public void onDestroy() {
        isShowing = false;
        if (getMotionController().getState().getValue().getActive()) {
            getMotionController().joystick(0.0d, 0.0f);
        }
        this.lifecycleRegistry.e(ve1.ON_DESTROY);
        x20 x20Var = this.composeView;
        if (x20Var != null) {
            WindowManager windowManager = this.windowManager;
            if (windowManager == null) {
                o51.F("windowManager");
                throw null;
            }
            windowManager.removeView(x20Var);
        }
        this.composeView = null;
        this.store.a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z = false;
        if (intent != null && intent.getBooleanExtra(EXTRA_ALLOW_IDLE, false) && !getMotionController().getState().getValue().getActive()) {
            z = true;
        }
        this.keepIdleWindow = z;
        if (!Settings.canDrawOverlays(this) || (!this.keepIdleWindow && !RuntimeAuthorizationManager.isAuthorized$default(getRuntimeAuthorization(), null, 1, null))) {
            stopSelf();
            return 2;
        }
        if (this.composeView == null) {
            showFloatingWindow();
            isShowing = true;
        }
        if (!this.observingState) {
            this.observingState = true;
            observeState();
        }
        return 2;
    }
}
