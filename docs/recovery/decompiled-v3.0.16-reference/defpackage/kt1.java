package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kt1 extends vg0 {
    public final int q;
    public final int r;
    public ts1 s;
    public vs1 t;

    public kt1(Context context, boolean z) {
        super(context, z);
        if (1 == jt1.a(context.getResources().getConfiguration())) {
            this.q = 21;
            this.r = 22;
        } else {
            this.q = 22;
            this.r = 21;
        }
    }

    @Override // defpackage.vg0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        js1 js1Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.s != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                js1Var = (js1) headerViewListAdapter.getWrappedAdapter();
            } else {
                js1Var = (js1) adapter;
                headersCount = 0;
            }
            vs1 vs1VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= js1Var.getCount()) ? null : js1Var.getItem(i);
            vs1 vs1Var = this.t;
            if (vs1Var != vs1VarB) {
                ms1 ms1Var = js1Var.e;
                if (vs1Var != null) {
                    this.s.f(ms1Var, vs1Var);
                }
                this.t = vs1VarB;
                if (vs1VarB != null) {
                    this.s.i(ms1Var, vs1VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.q) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.r) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (js1) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (js1) adapter).e.c(false);
        return true;
    }

    public void setHoverListener(ts1 ts1Var) {
        this.s = ts1Var;
    }

    @Override // defpackage.vg0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
