package org.maplibre.android.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.ij;
import defpackage.j21;
import defpackage.n01;
import java.lang.ref.WeakReference;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.g;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@Deprecated
public class Marker extends ij {
    public final String g;
    public n01 h;
    public final String i;
    private String iconId;
    public j21 j;
    public boolean k;
    public int l;
    private LatLng position;

    public Marker(LatLng latLng, n01 n01Var, String str, String str2) {
        this.position = latLng;
        this.i = str;
        this.g = str2;
        b(n01Var);
    }

    public final LatLng a() {
        return this.position;
    }

    public final void b(n01 n01Var) {
        this.h = n01Var;
        this.iconId = n01Var != null ? n01Var.b : null;
        g gVar = this.f;
        if (gVar != null) {
            gVar.m(this);
        }
    }

    public final void c(LatLng latLng) {
        this.position = latLng;
        g gVar = this.f;
        if (gVar != null) {
            gVar.m(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    public final j21 d(g gVar, k kVar) {
        boolean z;
        int i;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        this.f = gVar;
        Object obj = gVar.j.d;
        if (this.j == null && kVar.getContext() != null) {
            g gVar2 = this.f;
            j21 j21Var = new j21();
            j21Var.b(LayoutInflater.from(kVar.getContext()).inflate(2131427360, (ViewGroup) kVar, false), gVar2);
            this.j = j21Var;
        }
        j21 j21Var2 = this.j;
        if (kVar.getContext() != null) {
            View viewInflate = (View) j21Var2.c.get();
            if (viewInflate == null) {
                viewInflate = LayoutInflater.from(kVar.getContext()).inflate(2131427360, (ViewGroup) kVar, false);
                j21Var2.b(viewInflate, gVar);
            }
            j21Var2.b = new WeakReference(gVar);
            TextView textView = (TextView) viewInflate.findViewById(2131230840);
            String str = this.i;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
            TextView textView2 = (TextView) viewInflate.findViewById(2131230839);
            String str2 = this.g;
            if (TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str2);
                textView2.setVisibility(0);
            }
        }
        LatLng latLng = this.position;
        int i2 = this.l;
        j21Var2.getClass();
        j21Var2.a = new WeakReference(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        g gVar3 = (g) j21Var2.b.get();
        View view = (View) j21Var2.c.get();
        if (view == null || gVar3 == null) {
            z = true;
        } else {
            view.measure(0, 0);
            j21Var2.d = 0.0f;
            PointF pointFD = gVar3.c.d(latLng);
            j21Var2.g = pointFD;
            float measuredWidth = (pointFD.x - (view.getMeasuredWidth() / 2)) + 0.0f;
            float measuredHeight = (j21Var2.g.y - view.getMeasuredHeight()) + i2;
            if (view instanceof BubbleLayout) {
                Resources resources = kVar.getContext().getResources();
                float measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
                float right = kVar.getRight();
                float left = kVar.getLeft();
                float dimension = resources.getDimension(2131099754);
                f = 0.0f;
                float dimension2 = resources.getDimension(2131099755) / 2.0f;
                float measuredWidth3 = (view.getMeasuredWidth() / 2) - dimension2;
                float f3 = j21Var2.g.x;
                if (f3 >= 0.0f && f3 <= kVar.getWidth()) {
                    float f4 = j21Var2.g.y;
                    if (f4 >= 0.0f && f4 <= kVar.getHeight()) {
                        if (measuredWidth2 > right) {
                            float f5 = measuredWidth2 - right;
                            f2 = measuredWidth - f5;
                            measuredWidth3 += f5 + dimension2;
                            measuredWidth2 = f2 + view.getMeasuredWidth();
                            z2 = true;
                        } else {
                            f2 = measuredWidth;
                            z2 = false;
                        }
                        if (measuredWidth < left) {
                            float f6 = left - measuredWidth;
                            f2 += f6;
                            measuredWidth3 -= f6 + dimension2;
                            measuredWidth = f2;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            float f7 = right - measuredWidth2;
                            if (f7 < dimension) {
                                float f8 = dimension - f7;
                                f2 -= f8;
                                measuredWidth3 = (f8 - dimension2) + measuredWidth3;
                                measuredWidth = f2;
                            }
                        }
                        if (z3) {
                            float f9 = measuredWidth - left;
                            if (f9 < dimension) {
                                float f10 = dimension - f9;
                                measuredWidth = f2 + f10;
                                measuredWidth3 -= f10 - dimension2;
                            } else {
                                measuredWidth = f2;
                            }
                        } else {
                            measuredWidth = f2;
                        }
                    }
                }
                BubbleLayout bubbleLayout = (BubbleLayout) view;
                float f11 = bubbleLayout.f;
                float f12 = bubbleLayout.g;
                int paddingLeft = bubbleLayout.getPaddingLeft();
                int paddingRight = bubbleLayout.getPaddingRight();
                int paddingTop = bubbleLayout.getPaddingTop();
                int paddingBottom = bubbleLayout.getPaddingBottom();
                float f13 = measuredWidth;
                int i3 = bubbleLayout.e.a;
                if (i3 != 0) {
                    i = i2;
                    if (i3 == 1) {
                        paddingRight = (int) (paddingRight - f11);
                    } else if (i3 == 2) {
                        paddingTop = (int) (paddingTop - f12);
                    } else if (i3 == 3) {
                        paddingBottom = (int) (paddingBottom - f12);
                    }
                } else {
                    i = i2;
                    paddingLeft = (int) (paddingLeft - f11);
                }
                float f14 = bubbleLayout.l;
                if (f14 > 0.0f) {
                    paddingLeft = (int) (paddingLeft - f14);
                    paddingRight = (int) (paddingRight - f14);
                    paddingTop = (int) (paddingTop - f14);
                    paddingBottom = (int) (paddingBottom - f14);
                }
                bubbleLayout.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                bubbleLayout.h = measuredWidth3;
                bubbleLayout.a();
                measuredWidth = f13;
            } else {
                i = i2;
                f = 0.0f;
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            j21Var2.e = (measuredWidth - j21Var2.g.x) - f;
            j21Var2.f = (-view.getMeasuredHeight()) + i;
            j21Var2.a();
            kVar.addView(view, layoutParams);
            z = true;
            j21Var2.h = true;
        }
        this.k = z;
        return j21Var2;
    }

    public final String toString() {
        return "Marker [position[" + this.position + "]]";
    }
}
