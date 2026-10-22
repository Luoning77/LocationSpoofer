package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class j80 extends BaseAdapter implements Filterable {
    public boolean e;
    public boolean f;
    public Cursor g;
    public int h;
    public h80 i;
    public i80 j;
    public n80 k;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                h80 h80Var = this.i;
                if (h80Var != null) {
                    cursor2.unregisterContentObserver(h80Var);
                }
                i80 i80Var = this.j;
                if (i80Var != null) {
                    cursor2.unregisterDataSetObserver(i80Var);
                }
            }
            this.g = cursor;
            if (cursor != null) {
                h80 h80Var2 = this.i;
                if (h80Var2 != null) {
                    cursor.registerContentObserver(h80Var2);
                }
                i80 i80Var2 = this.j;
                if (i80Var2 != null) {
                    cursor.registerDataSetObserver(i80Var2);
                }
                this.h = cursor.getColumnIndexOrThrow("_id");
                this.e = true;
                notifyDataSetChanged();
            } else {
                this.h = -1;
                this.e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.e || (cursor = this.g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.e) {
            return null;
        }
        this.g.moveToPosition(i);
        if (view == null) {
            l23 l23Var = (l23) this;
            view = l23Var.n.inflate(l23Var.m, viewGroup, false);
        }
        a(view, this.g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        n80 n80Var = this.k;
        if (n80Var != null) {
            return n80Var;
        }
        n80 n80Var2 = new n80();
        n80Var2.a = this;
        this.k = n80Var2;
        return n80Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.e || (cursor = this.g) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.e && (cursor = this.g) != null && cursor.moveToPosition(i)) {
            return this.g.getLong(this.h);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.e) {
            fo.n("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.g.moveToPosition(i)) {
            fo.n(p91.l(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            l23 l23Var = (l23) this;
            view = l23Var.n.inflate(l23Var.l, viewGroup, false);
            view.setTag(new k23(view));
            ((ImageView) view.findViewById(2131230815)).setImageResource(l23Var.s);
        }
        a(view, this.g);
        return view;
    }
}
