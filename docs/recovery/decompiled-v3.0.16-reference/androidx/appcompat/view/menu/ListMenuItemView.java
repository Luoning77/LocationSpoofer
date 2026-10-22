package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.gn;
import defpackage.jd2;
import defpackage.ms1;
import defpackage.rt1;
import defpackage.vs1;
import defpackage.yi3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ListMenuItemView extends LinearLayout implements rt1, AbsListView.SelectionBoundsAdjuster {
    public vs1 e;
    public ImageView f;
    public RadioButton g;
    public TextView h;
    public CheckBox i;
    public TextView j;
    public ImageView k;
    public ImageView l;
    public LinearLayout m;
    public final Drawable n;
    public final int o;
    public final Context p;
    public boolean q;
    public final Drawable r;
    public final boolean s;
    public LayoutInflater t;
    public boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gn gnVarY = gn.y(getContext(), attributeSet, jd2.r, 2130903221);
        this.n = gnVarY.m(5);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        this.o = typedArray.getResourceId(1, -1);
        this.q = typedArray.getBoolean(7, false);
        this.p = context;
        this.r = gnVarY.m(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130903167, 0);
        this.s = typedArrayObtainStyledAttributes.hasValue(0);
        gnVarY.A();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.t;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.t = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // defpackage.rt1
    public final void a(vs1 vs1Var) {
        boolean z;
        int i;
        String string;
        this.e = vs1Var;
        boolean zIsVisible = vs1Var.isVisible();
        ms1 ms1Var = vs1Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(vs1Var.e);
        setCheckable(vs1Var.isCheckable());
        if (ms1Var.o()) {
            if ((ms1Var.n() ? vs1Var.j : vs1Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ms1Var.n();
        if (z) {
            vs1 vs1Var2 = this.e;
            ms1 ms1Var2 = vs1Var2.n;
            if (ms1Var2.o()) {
                i = (ms1Var2.n() ? vs1Var2.j : vs1Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.j;
            vs1 vs1Var3 = this.e;
            ms1 ms1Var3 = vs1Var3.n;
            Context context = ms1Var3.a;
            char c = ms1Var3.n() ? vs1Var3.j : vs1Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131623953));
                }
                int i2 = ms1Var3.n() ? vs1Var3.k : vs1Var3.i;
                vs1.c(sb, i2, 65536, resources.getString(2131623949));
                vs1.c(sb, i2, 4096, resources.getString(2131623945));
                vs1.c(sb, i2, 2, resources.getString(2131623944));
                vs1.c(sb, i2, 1, resources.getString(2131623950));
                vs1.c(sb, i2, 4, resources.getString(2131623952));
                vs1.c(sb, i2, 8, resources.getString(2131623948));
                if (c == '\b') {
                    sb.append(resources.getString(2131623946));
                } else if (c == '\n') {
                    sb.append(resources.getString(2131623947));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(2131623951));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        setIcon(vs1Var.getIcon());
        setEnabled(vs1Var.isEnabled());
        setSubMenuArrowVisible(vs1Var.hasSubMenu());
        setContentDescription(vs1Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
        rect.top = this.l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.rt1
    public vs1 getItemData() {
        return this.e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = yi3.a;
        setBackground(this.n);
        TextView textView = (TextView) findViewById(2131230926);
        this.h = textView;
        int i = this.o;
        if (i != -1) {
            textView.setTextAppearance(this.p, i);
        }
        this.j = (TextView) findViewById(2131230891);
        ImageView imageView = (ImageView) findViewById(2131230902);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.l = (ImageView) findViewById(2131230828);
        this.m = (LinearLayout) findViewById(2131230806);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.g == null && this.i == null) {
            return;
        }
        if ((this.e.x & 4) != 0) {
            if (this.g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.g = radioButton;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.g;
            compoundButton2 = this.i;
            compoundButton3 = compoundButton2;
        } else {
            if (this.i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.i = checkBox;
                LinearLayout linearLayout2 = this.m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.i;
            compoundButton2 = this.g;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.g;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.e.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.e.x & 4) != 0) {
            if (this.g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.g = radioButton;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.g;
        } else {
            if (this.i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.i = checkBox;
                LinearLayout linearLayout2 = this.m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        ms1 ms1Var = this.e.n;
        boolean z = this.u;
        if (z || this.q) {
            ImageView imageView = this.f;
            if (imageView == null && drawable == null && !this.q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131427343, (ViewGroup) this, false);
                this.f = imageView2;
                LinearLayout linearLayout = this.m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.q) {
                this.f.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.h;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.h.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        }
    }
}
