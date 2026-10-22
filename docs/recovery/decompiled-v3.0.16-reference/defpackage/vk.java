package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vk implements Window.Callback {
    public final Window.Callback e;
    public fb3 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ zk j;

    public vk(zk zkVar, Window.Callback callback) {
        this.j = zkVar;
        if (callback != null) {
            this.e = callback;
        } else {
            fo.i("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.g = true;
            callback.onContentChanged();
        } finally {
            this.g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.e.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.e.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        lk3.a(this.e, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.e.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        Window.Callback callback = this.e;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.j.z(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.e.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            zk zkVar = this.j;
            zkVar.F();
            r6 r6Var = zkVar.s;
            if (r6Var == null || !r6Var.i(keyCode, keyEvent)) {
                yk ykVar = zkVar.Q;
                if (ykVar == null || !zkVar.K(ykVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (zkVar.Q == null) {
                        yk ykVarE = zkVar.E(0);
                        zkVar.L(ykVarE, keyEvent);
                        boolean zK = zkVar.K(ykVarE, keyEvent.getKeyCode(), keyEvent);
                        ykVarE.k = false;
                        if (zK) {
                        }
                    }
                    return false;
                }
                yk ykVar2 = zkVar.Q;
                if (ykVar2 != null) {
                    ykVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.e.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.e.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.e.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.e.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.e.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.g) {
            this.e.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ms1)) {
            return this.e.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        fb3 fb3Var = this.f;
        if (fb3Var != null) {
            View view = i == 0 ? new View(fb3Var.e.a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.e.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.e.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.e.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            zk zkVar = this.j;
            zkVar.F();
            r6 r6Var = zkVar.s;
            if (r6Var != null) {
                r6Var.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.i) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        zk zkVar = this.j;
        if (i == 108) {
            zkVar.F();
            r6 r6Var = zkVar.s;
            if (r6Var != null) {
                r6Var.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            yk ykVarE = zkVar.E(i);
            if (ykVarE.m) {
                zkVar.x(ykVarE, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        mk3.a(this.e, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ms1 ms1Var = menu instanceof ms1 ? (ms1) menu : null;
        if (i == 0 && ms1Var == null) {
            return false;
        }
        if (ms1Var != null) {
            ms1Var.x = true;
        }
        fb3 fb3Var = this.f;
        if (fb3Var != null && i == 0) {
            gb3 gb3Var = fb3Var.e;
            if (!gb3Var.d) {
                gb3Var.a.l = true;
                gb3Var.d = true;
            }
        }
        boolean zOnPreparePanel = this.e.onPreparePanel(i, view, menu);
        if (ms1Var != null) {
            ms1Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ms1 ms1Var = this.j.E(0).h;
        if (ms1Var != null) {
            d(list, ms1Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return kk3.a(this.e, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.e.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.e.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return kk3.b(this.e, callback, i);
        }
        zk zkVar = this.j;
        Context context = zkVar.o;
        mn2 mn2Var = new mn2();
        mn2Var.f = context;
        mn2Var.e = callback;
        mn2Var.g = new ArrayList();
        mn2Var.h = new tv2(0);
        l7 l7VarQ = zkVar.q(mn2Var);
        if (l7VarQ != null) {
            return mn2Var.h(l7VarQ);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.e.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
