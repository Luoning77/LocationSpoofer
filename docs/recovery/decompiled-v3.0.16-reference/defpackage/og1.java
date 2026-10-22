package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class og1 extends BaseAdapter {
    public int e = -1;
    public final /* synthetic */ pg1 f;

    public og1(pg1 pg1Var) {
        this.f = pg1Var;
        a();
    }

    public final void a() {
        ms1 ms1Var = this.f.g;
        vs1 vs1Var = ms1Var.v;
        if (vs1Var != null) {
            ms1Var.i();
            ArrayList arrayList = ms1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vs1) arrayList.get(i)) == vs1Var) {
                    this.e = i;
                    return;
                }
            }
        }
        this.e = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vs1 getItem(int i) {
        ms1 ms1Var = this.f.g;
        ms1Var.i();
        ArrayList arrayList = ms1Var.j;
        int i2 = this.e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vs1) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ms1 ms1Var = this.f.g;
        ms1Var.i();
        int size = ms1Var.j.size();
        return this.e < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.f.inflate(2131427344, viewGroup, false);
        }
        ((rt1) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
