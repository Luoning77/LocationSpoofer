package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class vg0 extends ListView {
    public final Rect e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public tg0 k;
    public boolean l;
    public final boolean m;
    public boolean n;
    public yg1 o;
    public ab p;

    public vg0(Context context, boolean z) {
        super(context, null, 2130903167);
        this.e = new Rect();
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.m = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zA;
        View childAt;
        View childAt2;
        yg1 yg1Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.n = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.j - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            yg1Var = this.o;
            if (z) {
                if (yg1Var == null) {
                    yg1Var = new yg1(this);
                    this.o = yg1Var;
                }
                yg1Var.s = true;
                yg1Var.onTouch(this, motionEvent);
            } else if (yg1Var != null) {
                if (yg1Var.s) {
                    yg1Var.d();
                }
                yg1Var.s = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.n = true;
                qg0.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.j;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.j = iPointToPosition;
                qg0.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.e;
                rect.set(left, top, right, bottom);
                rect.left -= this.f;
                rect.top -= this.g;
                rect.right += this.h;
                rect.bottom += this.i;
                if (eu.a()) {
                    zA = sg0.a(this);
                } else {
                    Field field = ug0.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z4 = !zA;
                    if (eu.a()) {
                        sg0.b(this, z4);
                    } else {
                        Field field2 = ug0.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z4));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                tg0 tg0Var = this.k;
                if (tg0Var != null) {
                    tg0Var.f = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.n = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.j - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.n = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.j - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        yg1Var = this.o;
        if (z) {
            if (yg1Var == null) {
                yg1Var = new yg1(this);
                this.o = yg1Var;
            }
            yg1Var.s = true;
            yg1Var.onTouch(this, motionEvent);
        } else if (yg1Var != null) {
            if (yg1Var.s) {
                yg1Var.d();
            }
            yg1Var.s = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.p != null) {
            return;
        }
        super.drawableStateChanged();
        tg0 tg0Var = this.k;
        if (tg0Var != null) {
            tg0Var.f = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.n && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.m || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.m || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.m || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.m && this.l) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.p == null) {
            ab abVar = new ab(this, 2);
            this.p = abVar;
            post(abVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !rg0.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        rg0.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        rg0.b.invoke(this, Integer.valueOf(iPointToPosition));
                        rg0.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.n && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ab abVar = this.p;
        if (abVar != null) {
            vg0 vg0Var = (vg0) abVar.f;
            vg0Var.p = null;
            vg0Var.removeCallbacks(abVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.l = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        tg0 tg0Var = null;
        if (drawable != null) {
            tg0 tg0Var2 = new tg0();
            Drawable drawable2 = tg0Var2.e;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            tg0Var2.e = drawable;
            drawable.setCallback(tg0Var2);
            tg0Var2.f = true;
            tg0Var = tg0Var2;
        }
        this.k = tg0Var;
        super.setSelector(tg0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f = rect.left;
        this.g = rect.top;
        this.h = rect.right;
        this.i = rect.bottom;
    }
}
