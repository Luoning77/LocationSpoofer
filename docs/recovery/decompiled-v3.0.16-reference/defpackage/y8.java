package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y8 extends k10 implements DialogInterface, hk {
    public zk h;
    public final al i;
    public final w8 j;

    /* JADX WARN: Type inference failed for: r2v2, types: [al] */
    public y8(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iF = f(contextThemeWrapper, i);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130903149, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iF;
        }
        super(contextThemeWrapper, i2);
        this.i = new f91() { // from class: al
            @Override // defpackage.f91
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.e.h(keyEvent);
            }
        };
        ok okVarD = d();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130903149, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((zk) okVarD).X = iF;
        okVarD.g();
        this.j = new w8(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903081, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        zk zkVar = (zk) d();
        zkVar.B();
        ((ViewGroup) zkVar.E.findViewById(R.id.content)).addView(view, layoutParams);
        zkVar.q.a(zkVar.p.getCallback());
    }

    public final ok d() {
        zk zkVar = this.h;
        if (zkVar != null) {
            return zkVar;
        }
        in inVar = ok.e;
        zk zkVar2 = new zk(getContext(), getWindow(), this, this);
        this.h = zkVar2;
        return zkVar2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return gh0.u(this.i, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        d().c();
        super.onCreate(bundle);
        d().g();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        zk zkVar = (zk) d();
        zkVar.B();
        return zkVar.p.findViewById(i);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().p(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().d();
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        e(bundle);
        w8 w8Var = this.j;
        w8Var.b.setContentView(w8Var.q);
        Context context = w8Var.a;
        Window window = w8Var.c;
        View viewFindViewById2 = window.findViewById(2131230863);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131230930);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131230807);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131230793);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131230809);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(2131230930);
        View viewFindViewById7 = viewGroup.findViewById(2131230807);
        View viewFindViewById8 = viewGroup.findViewById(2131230793);
        ViewGroup viewGroupA = w8.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = w8.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = w8.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131230879);
        w8Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        w8Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(R.id.message);
        w8Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            w8Var.i.removeView(w8Var.m);
            if (w8Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) w8Var.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(w8Var.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(w8Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(R.id.button1);
        w8Var.f = button;
        t6 t6Var = w8Var.w;
        button.setOnClickListener(t6Var);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = w8Var.f;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            w8Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupA3.findViewById(R.id.button2);
        w8Var.g = button3;
        button3.setOnClickListener(t6Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = w8Var.g;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            w8Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupA3.findViewById(R.id.button3);
        w8Var.h = button5;
        button5.setOnClickListener(t6Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = w8Var.h;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            w8Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903079, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = w8Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = w8Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = w8Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (w8Var.n != null) {
            viewGroupA.addView(w8Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131230928).setVisibility(8);
        } else {
            w8Var.k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(w8Var.d) || !w8Var.u) {
                window.findViewById(2131230928).setVisibility(8);
                w8Var.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131230780);
                w8Var.l = textView2;
                textView2.setText(w8Var.d);
                Drawable drawable = w8Var.j;
                if (drawable != null) {
                    w8Var.k.setImageDrawable(drawable);
                } else {
                    w8Var.l.setPadding(w8Var.k.getPaddingLeft(), w8Var.k.getPaddingTop(), w8Var.k.getPaddingRight(), w8Var.k.getPaddingBottom());
                    w8Var.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupA3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(2131230923)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = w8Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = w8Var.e != null ? viewGroupA.findViewById(2131230927) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(2131230924);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = w8Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.e, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f);
        }
        if (!z) {
            View view = w8Var.e;
            if (view == null) {
                view = w8Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(2131230878);
                View viewFindViewById12 = window.findViewById(2131230877);
                WeakHashMap weakHashMap = yi3.a;
                si3.b(view, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = w8Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = w8Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = w8Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void onStop() {
        super.onStop();
        zk zkVar = (zk) d();
        zkVar.F();
        r6 r6Var = zkVar.s;
        if (r6Var != null) {
            r6Var.m(false);
        }
    }

    @Override // defpackage.hk
    public final l7 onWindowStartingSupportActionMode(k7 k7Var) {
        return null;
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void setContentView(int i) {
        d().m(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().p(getContext().getString(i));
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void setContentView(View view) {
        d().n(view);
    }

    @Override // defpackage.k10, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().o(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        w8 w8Var = this.j;
        w8Var.d = charSequence;
        TextView textView = w8Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.hk
    public final void onSupportActionModeFinished(l7 l7Var) {
    }

    @Override // defpackage.hk
    public final void onSupportActionModeStarted(l7 l7Var) {
    }
}
