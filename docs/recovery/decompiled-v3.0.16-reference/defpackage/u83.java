package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.GeometryCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class u83 {
    public static double[] a(Geometry geometry) {
        if (geometry instanceof Point) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Point) geometry);
            return b(arrayList);
        }
        if (geometry instanceof MultiPoint) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(((MultiPoint) geometry).coordinates());
            return b(arrayList2);
        }
        if (geometry instanceof LineString) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(((LineString) geometry).coordinates());
            return b(arrayList3);
        }
        if (geometry instanceof MultiLineString) {
            MultiLineString multiLineString = (MultiLineString) geometry;
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < multiLineString.coordinates().size(); i++) {
                arrayList4.addAll(multiLineString.coordinates().get(i));
            }
            return b(arrayList4);
        }
        if (geometry instanceof Polygon) {
            Polygon polygon = (Polygon) geometry;
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < polygon.coordinates().size(); i2++) {
                for (int i3 = 0; i3 < polygon.coordinates().get(i2).size(); i3++) {
                    arrayList5.add(polygon.coordinates().get(i2).get(i3));
                }
            }
            return b(arrayList5);
        }
        if (geometry instanceof MultiPolygon) {
            MultiPolygon multiPolygon = (MultiPolygon) geometry;
            ArrayList arrayList6 = new ArrayList();
            for (int i4 = 0; i4 < multiPolygon.coordinates().size(); i4++) {
                for (int i5 = 0; i5 < multiPolygon.coordinates().get(i4).size(); i5++) {
                    for (int i6 = 0; i6 < multiPolygon.coordinates().get(i4).get(i5).size(); i6++) {
                        arrayList6.add(multiPolygon.coordinates().get(i4).get(i5).get(i6));
                    }
                }
            }
            return b(arrayList6);
        }
        if (!(geometry instanceof GeometryCollection)) {
            throw new RuntimeException("Unknown geometry class: " + geometry.getClass());
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator<Geometry> it = ((GeometryCollection) geometry).geometries().iterator();
        while (it.hasNext()) {
            double[] dArrA = a(it.next());
            arrayList7.add(Point.fromLngLat(dArrA[0], dArrA[1]));
            arrayList7.add(Point.fromLngLat(dArrA[2], dArrA[1]));
            arrayList7.add(Point.fromLngLat(dArrA[2], dArrA[3]));
            arrayList7.add(Point.fromLngLat(dArrA[0], dArrA[3]));
        }
        MultiPoint multiPointFromLngLats = MultiPoint.fromLngLats(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(multiPointFromLngLats.coordinates());
        return b(arrayList8);
    }

    public static double[] b(ArrayList arrayList) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Point point = (Point) obj;
            if (dArr[0] > point.longitude()) {
                dArr[0] = point.longitude();
            }
            if (dArr[1] > point.latitude()) {
                dArr[1] = point.latitude();
            }
            if (dArr[2] < point.longitude()) {
                dArr[2] = point.longitude();
            }
            if (dArr[3] < point.latitude()) {
                dArr[3] = point.latitude();
            }
        }
        return dArr;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final pj3 d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131230949);
            pj3 pj3Var = tag instanceof pj3 ? (pj3) tag : null;
            if (pj3Var != null) {
                return pj3Var;
            }
            Object objF = q73.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final float e(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int f(t83 t83Var, Layout layout, xp xpVar, int i, RectF rectF, kp2 kp2Var, s5 s5Var, boolean z) {
        sa1[] sa1VarArr;
        sa1[] sa1VarArr2;
        int i2;
        int iB;
        int i3;
        int i4;
        int iA;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = t83Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = t83Var.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            q21.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ey0 ey0Var = new ey0(t83Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = ey0Var.a(lineStart2, z2, z2, true);
                fA3 = ey0Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = ey0Var.a(lineStart2, false, false, false);
                fA = ey0Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = ey0Var.a(lineStart2, false, false, true);
                    fA = ey0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = ey0Var.a(lineStart2, false, false, false);
                    fA2 = ey0Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) xpVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iK = xpVar.k(lineStart3, false);
        int iL = xpVar.l(iK);
        int i7 = lineStart3 - iL;
        int i8 = lineEnd2 - iL;
        Bidi bidiE = xpVar.e(iK);
        if (bidiE == null || (bidiCreateLineBidi = bidiE.createLineBidi(i7, i8)) == null) {
            sa1VarArr = new sa1[]{new sa1(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            sa1VarArr = new sa1[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                sa1VarArr[i9] = new sa1(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        i41 k41Var = z ? new k41(0, sa1VarArr.length - 1, 1) : new i41(sa1VarArr.length - 1, 0, -1);
        int i11 = k41Var.e;
        int i12 = k41Var.f;
        int i13 = k41Var.g;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            sa1 sa1Var = sa1VarArr[i11];
            boolean z4 = sa1Var.c;
            int iF2 = sa1Var.a;
            int iG = sa1Var.b;
            float f = z4 ? fArr[((iG - 1) - lineStart) * 2] : fArr[(iF2 - lineStart) * 2];
            float fE = z4 ? e(iF2, lineStart, fArr) : e(iG - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                sa1VarArr2 = sa1VarArr;
                if (fE < f2) {
                    iG = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fE) && (!z4 || f2 > f)) {
                        int i15 = iG;
                        int i16 = iF2;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iG - 1;
                    }
                    int iA2 = kp2Var.a(i2 + 1);
                    if (iA2 == -1 || (iB = kp2Var.b(iA2)) <= iF2) {
                        iG = -1;
                        break;
                    }
                    if (iA2 < iF2) {
                        iA2 = iF2;
                    }
                    if (iB <= iG) {
                        iG = iB;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iA3 = iA2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iG - 1) - lineStart) * 2] : fArr[(iA3 - lineStart) * 2];
                        rectF2.right = z4 ? e(iA3, lineStart, fArr) : e(iG - 1, lineStart, fArr);
                        if (((Boolean) s5Var.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iG = kp2Var.g(iG);
                        if (iG == -1 || iG <= iF2) {
                            iG = -1;
                            break;
                        }
                        iA3 = kp2Var.a(iG);
                        if (iA3 < iF2) {
                            iA3 = iF2;
                        }
                    }
                } else {
                    iG = -1;
                    break;
                }
                iF2 = iG;
            } else {
                if (fE < f2) {
                    sa1VarArr2 = sa1VarArr;
                    iF2 = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fE)) {
                        int i19 = iG;
                        int i20 = iF2;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iF2;
                    }
                    int iB2 = kp2Var.b(i4);
                    if (iB2 != -1 && (iA = kp2Var.a(iB2)) < iG) {
                        if (iA >= iF2) {
                            iF2 = iA;
                        }
                        if (iB2 > iG) {
                            iB2 = iG;
                        }
                        sa1VarArr2 = sa1VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iB3 = iB2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iB3 - 1) - lineStart) * 2] : fArr[(iF2 - lineStart) * 2];
                            rectF3.right = z4 ? e(iF2, lineStart, fArr) : e(iB3 - 1, lineStart, fArr);
                            if (((Boolean) s5Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iF2 = kp2Var.f(iF2);
                            if (iF2 != -1 && iF2 < iG) {
                                iB3 = kp2Var.b(iF2);
                                if (iB3 > iG) {
                                    iB3 = iG;
                                }
                            }
                        }
                    } else {
                        sa1VarArr2 = sa1VarArr;
                    }
                    iF2 = -1;
                    break;
                } else {
                    sa1VarArr2 = sa1VarArr;
                    iF2 = -1;
                    break;
                }
            }
            if (iF2 >= 0) {
                return iF2;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            sa1VarArr = sa1VarArr2;
        }
    }

    public static boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static String h(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }
}
