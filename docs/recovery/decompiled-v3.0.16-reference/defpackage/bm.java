package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bm extends Spinner {
    public static final int[] m = {R.attr.spinnerMode};
    public final fk e;
    public final Context f;
    public final pl g;
    public SpinnerAdapter h;
    public final boolean i;
    public final am j;
    public int k;
    public final Rect l;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public bm(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, 2130903385);
        this.l = new Rect();
        ca3.a(this, getContext());
        int[] iArr = jd2.v;
        gn gnVarY = gn.y(context, attributeSet, iArr, 2130903385);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        this.e = new fk(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f = new p60(context, resourceId);
        } else {
            this.f = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m, 2130903385, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        ul ulVar = new ul(this);
                        this.j = ulVar;
                        ulVar.g = typedArray.getString(2);
                    } else if (i == 1) {
                        yl ylVar = new yl(this, this.f, attributeSet);
                        gn gnVarY2 = gn.y(this.f, attributeSet, iArr, 2130903385);
                        this.k = ((TypedArray) gnVarY2.a).getLayoutDimension(3, -2);
                        ylVar.g(gnVarY2.m(1));
                        ylVar.F = typedArray.getString(2);
                        gnVarY2.A();
                        this.j = ylVar;
                        this.g = new pl(this, this, ylVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(2131427371);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    gnVarY.A();
                    this.i = true;
                    spinnerAdapter = this.h;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.h = null;
                    }
                    this.e.r(attributeSet, 2130903385);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            ul ulVar2 = new ul(this);
            this.j = ulVar2;
            ulVar2.g = typedArray.getString(2);
        } else if (i == 1) {
            yl ylVar2 = new yl(this, this.f, attributeSet);
            gn gnVarY3 = gn.y(this.f, attributeSet, iArr, 2130903385);
            this.k = ((TypedArray) gnVarY3.a).getLayoutDimension(3, -2);
            ylVar2.g(gnVarY3.m(1));
            ylVar2.F = typedArray.getString(2);
            gnVarY3.A();
            this.j = ylVar2;
            this.g = new pl(this, this, ylVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(2131427371);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        gnVarY.A();
        this.i = true;
        spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.e.r(attributeSet, 2130903385);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.l;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        am amVar = this.j;
        return amVar != null ? amVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        am amVar = this.j;
        return amVar != null ? amVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.j != null ? this.k : super.getDropDownWidth();
    }

    public final am getInternalPopup() {
        return this.j;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        am amVar = this.j;
        return amVar != null ? amVar.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        am amVar = this.j;
        return amVar != null ? amVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fk fkVar = this.e;
        if (fkVar != null) {
            return fkVar.q();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        am amVar = this.j;
        if (amVar == null || !amVar.a()) {
            return;
        }
        amVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.j == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        zl zlVar = (zl) parcelable;
        super.onRestoreInstanceState(zlVar.getSuperState());
        if (!zlVar.e || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ql(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        zl zlVar = new zl(super.onSaveInstanceState());
        am amVar = this.j;
        zlVar.e = amVar != null && amVar.a();
        return zlVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pl plVar = this.g;
        if (plVar == null || !plVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        am amVar = this.j;
        if (amVar == null) {
            return super.performClick();
        }
        if (amVar.a()) {
            return true;
        }
        amVar.m(sl.b(this), sl.a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        am amVar = this.j;
        if (amVar != null) {
            Context context = this.f;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            vl vlVar = new vl();
            vlVar.e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                vlVar.f = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                tl.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            amVar.p(vlVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.s();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.t(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        am amVar = this.j;
        if (amVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            amVar.k(i);
            amVar.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        am amVar = this.j;
        if (amVar != null) {
            amVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.j != null) {
            this.k = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        am amVar = this.j;
        if (amVar != null) {
            amVar.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(k22.v(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        am amVar = this.j;
        if (amVar != null) {
            amVar.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fk fkVar = this.e;
        if (fkVar != null) {
            fkVar.y(mode);
        }
    }
}
