package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.model.AppMapType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.g;
import org.maplibre.android.maps.k;
import org.maplibre.android.maps.m;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.sources.RasterSource;
import org.maplibre.android.style.types.Formatted;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lr2 {
    public final g a;
    public final k b;
    public final Context c;
    public final CloudRepository d;
    public final vu1 e;
    public final h2 f;
    public final vu1 g;
    public final xj2 h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public el1 m;
    public el1 n;

    public lr2(g gVar, k kVar, Context context, CloudRepository cloudRepository, vu1 vu1Var, h2 h2Var, vu1 vu1Var2, h2 h2Var2, xj2 xj2Var) {
        gVar.getClass();
        kVar.getClass();
        context.getClass();
        this.a = gVar;
        this.b = kVar;
        this.c = context;
        this.d = cloudRepository;
        this.e = vu1Var;
        this.f = h2Var;
        this.g = vu1Var2;
        this.h = xj2Var;
        hp1 hp1Var = new hp1() { // from class: hr2
            @Override // defpackage.hp1
            public final void a() {
                bs2 bs2VarE;
                el1 el1Var;
                lr2 lr2Var = this.a;
                if (lr2Var.i || (bs2VarE = lr2Var.e()) == null || (el1Var = lr2Var.n) == null) {
                    return;
                }
                el1Var.invoke(Double.valueOf(bs2VarE.a), Double.valueOf(bs2VarE.b));
            }
        };
        kv kvVar = gVar.e;
        kvVar.f.add(hp1Var);
        kvVar.g.add(new gp1() { // from class: ir2
            @Override // defpackage.gp1
            public final void b() {
                el1 el1Var;
                lr2 lr2Var = this.a;
                if (lr2Var.i) {
                    return;
                }
                LatLng latLng = lr2Var.a.h().target;
                if (latLng != null) {
                    vu1 vu1Var3 = lr2Var.e;
                    double dA = latLng.a();
                    double dB = latLng.b();
                    vu1Var3.invoke(Boolean.valueOf((3.0d <= dA && dA <= 55.0d && 72.0d <= dB && dB <= 136.0d) || (-12.0d <= dA && dA <= 7.0d && 92.0d <= dB && dB <= 142.0d) || ((24.0d <= dA && dA <= 50.0d && -125.0d <= dB && dB <= -66.0d) || ((51.0d <= dA && dA <= 72.0d && ((-180.0d <= dB && dB <= -129.0d) || (172.0d <= dB && dB <= 180.0d))) || ((18.0d <= dA && dA <= 23.0d && -161.0d <= dB && dB <= -154.0d) || (17.5d <= dA && dA <= 19.5d && -68.5d <= dB && dB <= -64.0d))))));
                }
                bs2 bs2VarE = lr2Var.e();
                if (bs2VarE == null || (el1Var = lr2Var.m) == null) {
                    return;
                }
                el1Var.invoke(Double.valueOf(bs2VarE.a), Double.valueOf(bs2VarE.b));
            }
        });
    }

    public static LatLng j(double d, double d2) {
        z60 z60VarE = xq1.E(d, d2);
        return new LatLng(z60VarE.a, z60VarE.b);
    }

    public final void a(double d, double d2, double d3, int i, int i2, float f) {
        Iterable<bs2> iterableW0;
        if (this.i) {
            return;
        }
        z60 z60VarE = xq1.E(d, d2);
        double d4 = z60VarE.a;
        double d5 = z60VarE.b;
        if (Math.abs(d3) > Double.MAX_VALUE || d3 <= 0.0d || Math.abs(d4) > Double.MAX_VALUE || Math.abs(d5) > Double.MAX_VALUE) {
            iterableW0 = uj0.e;
        } else {
            double radians = Math.toRadians(d4);
            double radians2 = Math.toRadians(d5);
            double d6 = d3 / 6371008.8d;
            k41 k41VarF0 = mh0.f0(0, 72);
            ArrayList arrayList = new ArrayList(az.Y(k41VarF0, 10));
            Iterator it = k41VarF0.iterator();
            while (true) {
                j41 j41Var = (j41) it;
                if (!j41Var.g) {
                    break;
                }
                double dNextInt = (((double) j41Var.nextInt()) * 6.283185307179586d) / 72.0d;
                double dAsin = Math.asin((Math.cos(dNextInt) * Math.sin(d6) * Math.cos(radians)) + (Math.cos(d6) * Math.sin(radians)));
                arrayList.add(new bs2(Math.toDegrees(dAsin), ((Math.toDegrees(Math.atan2(Math.cos(radians) * (Math.sin(d6) * Math.sin(dNextInt)), Math.cos(d6) - (Math.sin(dAsin) * Math.sin(radians))) + radians2) + 540.0d) % 360.0d) - 180.0d));
                d6 = d6;
            }
            iterableW0 = zy.w0(arrayList, zy.n0(arrayList));
        }
        ArrayList arrayList2 = new ArrayList(az.Y(iterableW0, 10));
        for (bs2 bs2Var : iterableW0) {
            arrayList2.add(new LatLng(bs2Var.a, bs2Var.b));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ha2 ha2Var = new ha2();
        Polygon polygon = new Polygon();
        ha2Var.e = polygon;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ha2Var.e.a((LatLng) obj);
        }
        polygon.j(i);
        polygon.k(0);
        g gVar = this.a;
        gVar.b(ha2Var);
        ia2 ia2Var = new ia2();
        ia2Var.a(arrayList2);
        ia2Var.e.h(i2);
        ia2Var.e.i(f / this.c.getResources().getDisplayMetrics().density);
        gVar.c(ia2Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x00b7, please report this as an issue */
    public final kr2 b(double d, double d2, String str, tq1 tq1Var) {
        String str2;
        Bitmap bitmap;
        int i;
        int i2;
        float f;
        float f2;
        Canvas canvas;
        int iOrdinal;
        int color;
        float f3;
        float f4;
        int i3;
        Marker markerA;
        lr2 lr2Var = this;
        str.getClass();
        if (lr2Var.i) {
            markerA = null;
        } else {
            sq1 sq1Var = new sq1();
            sq1Var.e = j(d, d2);
            sq1Var.g = str;
            Context context = lr2Var.c;
            q01 q01VarF = q01.f(context);
            LinkedHashMap linkedHashMap = op1.a;
            context.getClass();
            String str3 = "centered_" + tq1Var.name() + "_" + str;
            LinkedHashMap linkedHashMap2 = op1.a;
            Bitmap bitmapCreateBitmap = (Bitmap) linkedHashMap2.get(str3);
            if (bitmapCreateBitmap != null) {
                if (bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap != null) {
                    sq1Var = sq1Var;
                } else if (tq1Var == tq1.i) {
                    i3 = (int) (30.0f * context.getResources().getDisplayMetrics().density);
                    if (i3 < 1) {
                        i3 = 1;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f5 = i3;
                    float f6 = f5 / 2.0f;
                    Paint paint = new Paint(1);
                    paint.setColor(Color.parseColor("#30388BFD"));
                    canvas2.drawCircle(f6, f6, 0.48f * f5, paint);
                    paint.setColor(-1);
                    canvas2.drawCircle(f6, f6, 0.3f * f5, paint);
                    paint.setColor(Color.parseColor("#388BFD"));
                    canvas2.drawCircle(f6, f6, f5 * 0.22f, paint);
                    linkedHashMap2.put(str3, bitmapCreateBitmap);
                    sq1Var = sq1Var;
                } else {
                    str2 = tq1Var.name() + "_" + str;
                    bitmap = (Bitmap) linkedHashMap2.get(str2);
                    if (bitmap != null) {
                        float f7 = context.getResources().getDisplayMetrics().density;
                        i = (int) (32.0f * f7);
                        if (i < 1) {
                            i = 1;
                        }
                        i2 = (int) (f7 * 44.0f);
                        if (i2 < 1) {
                            i2 = 1;
                        }
                        f = 2.0f;
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap2.getClass();
                        f2 = 0.88f;
                        canvas = new Canvas(bitmapCreateBitmap2);
                        iOrdinal = tq1Var.ordinal();
                        if (iOrdinal == 0) {
                            color = Color.parseColor("#00B578");
                        } else if (iOrdinal == 1) {
                            color = Color.parseColor("#FA5151");
                        } else if (iOrdinal == 2) {
                            if (iOrdinal == 3) {
                            }
                            color = Color.parseColor("#388BFD");
                        } else {
                            color = Color.parseColor("#FF7A00");
                        }
                        Paint paint2 = new Paint(1);
                        paint2.setColor(color);
                        Paint.Style style = Paint.Style.FILL;
                        paint2.setStyle(style);
                        paint2.setDither(true);
                        Paint paint3 = new Paint(1);
                        paint3.setColor(Color.parseColor("#33000000"));
                        paint3.setStyle(style);
                        float f8 = i;
                        float f9 = i2;
                        float f10 = f9 * 0.88f;
                        canvas.drawOval(new RectF(f8 * 0.2f, f10, f8 * 0.8f, f9 * 0.98f), paint3);
                        Path path = new Path();
                        f3 = f8 / 2.0f;
                        path.moveTo(f3, f10);
                        float f11 = f9 * 0.55f;
                        float f12 = f9 * 0.35f;
                        path.cubicTo(f8 * 0.95f, f11, f8, f12, f8, f3);
                        path.arcTo(new RectF(0.0f, 0.0f, f8, f8), 0.0f, -180.0f, false);
                        path.cubicTo(0.0f, f12, f8 * 0.05f, f11, f3, f10);
                        path.close();
                        canvas.drawPath(path, paint2);
                        Paint paint4 = new Paint(1);
                        paint4.setColor(-1);
                        paint4.setStyle(style);
                        f4 = 0.65f * f3;
                        canvas.drawCircle(f3, f3, f4, paint4);
                        if (!l13.k0(str)) {
                            Paint paint5 = new Paint(1);
                            paint5.setColor(color);
                            paint5.setTextAlign(Paint.Align.CENTER);
                            paint5.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                            if (str.length() <= 2) {
                                f4 = f3 * 0.85f;
                            }
                            paint5.setTextSize(f4);
                            Paint.FontMetrics fontMetrics = paint5.getFontMetrics();
                            canvas.drawText(str, f3, f3 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint5);
                        }
                        linkedHashMap2.put(str2, bitmapCreateBitmap2);
                        bitmap = bitmapCreateBitmap2;
                    } else {
                        float f13 = context.getResources().getDisplayMetrics().density;
                        i = (int) (32.0f * f13);
                        if (i < 1) {
                            i = 1;
                        }
                        i2 = (int) (f13 * 44.0f);
                        if (i2 < 1) {
                            i2 = 1;
                        }
                        f = 2.0f;
                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap3.getClass();
                        f2 = 0.88f;
                        canvas = new Canvas(bitmapCreateBitmap3);
                        iOrdinal = tq1Var.ordinal();
                        if (iOrdinal == 0) {
                            color = Color.parseColor("#00B578");
                        } else if (iOrdinal == 1) {
                            color = Color.parseColor("#FA5151");
                        } else if (iOrdinal == 2) {
                            if (iOrdinal == 3) {
                            }
                            color = Color.parseColor("#388BFD");
                        } else {
                            color = Color.parseColor("#FF7A00");
                        }
                        Paint paint6 = new Paint(1);
                        paint6.setColor(color);
                        Paint.Style style2 = Paint.Style.FILL;
                        paint6.setStyle(style2);
                        paint6.setDither(true);
                        Paint paint7 = new Paint(1);
                        paint7.setColor(Color.parseColor("#33000000"));
                        paint7.setStyle(style2);
                        float f14 = i;
                        float f15 = i2;
                        float f16 = f15 * 0.88f;
                        canvas.drawOval(new RectF(f14 * 0.2f, f16, f14 * 0.8f, f15 * 0.98f), paint7);
                        Path path2 = new Path();
                        f3 = f14 / 2.0f;
                        path2.moveTo(f3, f16);
                        float f17 = f15 * 0.55f;
                        float f18 = f15 * 0.35f;
                        path2.cubicTo(f14 * 0.95f, f17, f14, f18, f14, f3);
                        path2.arcTo(new RectF(0.0f, 0.0f, f14, f14), 0.0f, -180.0f, false);
                        path2.cubicTo(0.0f, f18, f14 * 0.05f, f17, f3, f16);
                        path2.close();
                        canvas.drawPath(path2, paint6);
                        Paint paint8 = new Paint(1);
                        paint8.setColor(-1);
                        paint8.setStyle(style2);
                        f4 = 0.65f * f3;
                        canvas.drawCircle(f3, f3, f4, paint8);
                        if (!l13.k0(str)) {
                            Paint paint9 = new Paint(1);
                            paint9.setColor(color);
                            paint9.setTextAlign(Paint.Align.CENTER);
                            paint9.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                            if (str.length() <= 2) {
                                f4 = f3 * 0.85f;
                            }
                            paint9.setTextSize(f4);
                            Paint.FontMetrics fontMetrics2 = paint9.getFontMetrics();
                            canvas.drawText(str, f3, f3 - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), paint9);
                        }
                        linkedHashMap2.put(str2, bitmapCreateBitmap3);
                        bitmap = bitmapCreateBitmap3;
                    }
                    float height = bitmap.getHeight() * f2;
                    int iCeil = (int) Math.ceil(((double) height) * 2.0d);
                    float f19 = (iCeil / f) - height;
                    Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap.getWidth(), iCeil, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap4.getClass();
                    bitmapCreateBitmap4.setDensity(bitmap.getDensity());
                    new Canvas(bitmapCreateBitmap4).drawBitmap(bitmap, 0.0f, f19, new Paint(1));
                    linkedHashMap2.put(str3, bitmapCreateBitmap4);
                    bitmapCreateBitmap = bitmapCreateBitmap4;
                }
            } else if (tq1Var == tq1.i) {
                i3 = (int) (30.0f * context.getResources().getDisplayMetrics().density);
                if (i3 < 1) {
                    i3 = 1;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                float f20 = i3;
                float f21 = f20 / 2.0f;
                Paint paint10 = new Paint(1);
                paint10.setColor(Color.parseColor("#30388BFD"));
                canvas3.drawCircle(f21, f21, 0.48f * f20, paint10);
                paint10.setColor(-1);
                canvas3.drawCircle(f21, f21, 0.3f * f20, paint10);
                paint10.setColor(Color.parseColor("#388BFD"));
                canvas3.drawCircle(f21, f21, f20 * 0.22f, paint10);
                linkedHashMap2.put(str3, bitmapCreateBitmap);
                sq1Var = sq1Var;
            } else {
                str2 = tq1Var.name() + "_" + str;
                bitmap = (Bitmap) linkedHashMap2.get(str2);
                if (bitmap != null || bitmap.isRecycled()) {
                    float f110 = context.getResources().getDisplayMetrics().density;
                    i = (int) (32.0f * f110);
                    if (i < 1) {
                        i = 1;
                    }
                    i2 = (int) (f110 * 44.0f);
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    f = 2.0f;
                    Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap5.getClass();
                    f2 = 0.88f;
                    canvas = new Canvas(bitmapCreateBitmap5);
                    iOrdinal = tq1Var.ordinal();
                    if (iOrdinal == 0) {
                        color = Color.parseColor("#00B578");
                    } else if (iOrdinal == 1) {
                        color = Color.parseColor("#FA5151");
                    } else if (iOrdinal == 2) {
                        color = Color.parseColor("#FF7A00");
                    } else {
                        if (iOrdinal == 3 && iOrdinal != 4) {
                            b81.d();
                            return null;
                        }
                        color = Color.parseColor("#388BFD");
                    }
                    Paint paint11 = new Paint(1);
                    paint11.setColor(color);
                    Paint.Style style3 = Paint.Style.FILL;
                    paint11.setStyle(style3);
                    paint11.setDither(true);
                    Paint paint12 = new Paint(1);
                    paint12.setColor(Color.parseColor("#33000000"));
                    paint12.setStyle(style3);
                    float f111 = i;
                    float f112 = i2;
                    float f113 = f112 * 0.88f;
                    canvas.drawOval(new RectF(f111 * 0.2f, f113, f111 * 0.8f, f112 * 0.98f), paint12);
                    Path path3 = new Path();
                    f3 = f111 / 2.0f;
                    path3.moveTo(f3, f113);
                    float f114 = f112 * 0.55f;
                    float f115 = f112 * 0.35f;
                    path3.cubicTo(f111 * 0.95f, f114, f111, f115, f111, f3);
                    path3.arcTo(new RectF(0.0f, 0.0f, f111, f111), 0.0f, -180.0f, false);
                    path3.cubicTo(0.0f, f115, f111 * 0.05f, f114, f3, f113);
                    path3.close();
                    canvas.drawPath(path3, paint11);
                    Paint paint13 = new Paint(1);
                    paint13.setColor(-1);
                    paint13.setStyle(style3);
                    f4 = 0.65f * f3;
                    canvas.drawCircle(f3, f3, f4, paint13);
                    if (!l13.k0(str)) {
                        Paint paint14 = new Paint(1);
                        paint14.setColor(color);
                        paint14.setTextAlign(Paint.Align.CENTER);
                        paint14.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                        if (str.length() <= 2) {
                            f4 = f3 * 0.85f;
                        }
                        paint14.setTextSize(f4);
                        Paint.FontMetrics fontMetrics3 = paint14.getFontMetrics();
                        canvas.drawText(str, f3, f3 - ((fontMetrics3.ascent + fontMetrics3.descent) / 2.0f), paint14);
                    }
                    linkedHashMap2.put(str2, bitmapCreateBitmap5);
                    bitmap = bitmapCreateBitmap5;
                } else {
                    f = 2.0f;
                    f2 = 0.88f;
                }
                float height2 = bitmap.getHeight() * f2;
                int iCeil2 = (int) Math.ceil(((double) height2) * 2.0d);
                float f116 = (iCeil2 / f) - height2;
                Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(bitmap.getWidth(), iCeil2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap6.getClass();
                bitmapCreateBitmap6.setDensity(bitmap.getDensity());
                new Canvas(bitmapCreateBitmap6).drawBitmap(bitmap, 0.0f, f116, new Paint(1));
                linkedHashMap2.put(str3, bitmapCreateBitmap6);
                bitmapCreateBitmap = bitmapCreateBitmap6;
            }
            sq1 sq1Var2 = sq1Var;
            sq1Var2.h = q01VarF.c(bitmapCreateBitmap);
            lr2Var = this;
            markerA = lr2Var.a.a(sq1Var2);
        }
        return new kr2(lr2Var, markerA);
    }

    public final void c(ArrayList arrayList, int i, float f) {
        if (this.i || arrayList.size() < 2) {
            return;
        }
        ia2 ia2Var = new ia2();
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i52 i52Var = (i52) obj;
            arrayList2.add(j(((Number) i52Var.e).doubleValue(), ((Number) i52Var.f).doubleValue()));
        }
        ia2Var.a(arrayList2);
        ia2Var.e.h(i);
        ia2Var.e.i(f / this.c.getResources().getDisplayMetrics().density);
        this.a.c(ia2Var);
    }

    public final void d(double d, double d2, Float f) {
        if (this.i) {
            return;
        }
        LatLng latLngJ = j(d, d2);
        this.a.d(f == null ? xq1.J(latLngJ) : new nv(latLngJ, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, f.floatValue(), null));
    }

    public final bs2 e() {
        if (this.i) {
            return null;
        }
        k kVar = this.b;
        int width = kVar.getWidth();
        int height = kVar.getHeight();
        g gVar = this.a;
        gVar.getClass();
        if (width <= 0 || height <= 0) {
            return null;
        }
        LatLng latLngA = gVar.c.a(new PointF(width / 2.0f, height / 2.0f));
        latLngA.getClass();
        z60 z60VarS = xq1.S(latLngA.a(), latLngA.b());
        return new bs2(z60VarS.a, z60VarS.b);
    }

    public final void f() {
        if (this.i) {
            return;
        }
        this.a.e();
    }

    public final void g() {
        if (this.i) {
            return;
        }
        jf3 jf3Var = this.a.b;
        jf3Var.e(false);
        jf3Var.n = true;
        jf3Var.k = true;
        jf3Var.m = true;
        jf3Var.p = true;
        jf3Var.q = true;
        jf3Var.l = false;
    }

    public final void h(ArrayList arrayList, int i, int i2, int i3, int i4) {
        if (this.i || arrayList.isEmpty()) {
            return;
        }
        List<i52> listH0 = zy.h0(arrayList);
        ArrayList arrayList2 = new ArrayList(az.Y(listH0, 10));
        for (i52 i52Var : listH0) {
            arrayList2.add(j(((Number) i52Var.e).doubleValue(), ((Number) i52Var.f).doubleValue()));
        }
        int size = arrayList2.size();
        g gVar = this.a;
        if (size == 1) {
            gVar.d(xq1.J((LatLng) zy.n0(arrayList2)));
            return;
        }
        nx0 nx0Var = new nx0(2);
        nx0Var.a.addAll(arrayList2);
        CameraPosition cameraPositionF = gVar.f(nx0Var.d(), new int[]{i, i2, i3, i4});
        if (cameraPositionF != null) {
            gVar.d(xq1.I(cameraPositionF));
        }
    }

    public final void i(double d, double d2, Float f) {
        if (this.i) {
            return;
        }
        nv nvVar = new nv(j(d, d2), -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, f.floatValue(), null);
        g gVar = this.a;
        gVar.j();
        gVar.d.f(gVar, nvVar);
    }

    public final void k(Context context, boolean z) {
        String strMapStyleUrl;
        context.getClass();
        if (this.i || (strMapStyleUrl = this.d.mapStyleUrl(z)) == null || o51.f(this.k, strMapStyleUrl)) {
            return;
        }
        this.k = strMapStyleUrl;
        this.a.l(strMapStyleUrl, new jr2(this, strMapStyleUrl));
    }

    public final void l(AppMapType appMapType) {
        double d;
        double d2;
        LatLng latLng;
        double[] dArr;
        appMapType.getClass();
        if (this.i) {
            return;
        }
        g gVar = this.a;
        CameraPosition cameraPositionH = gVar.h();
        if (cameraPositionH != null) {
            double d3 = cameraPositionH.bearing;
            LatLng latLng2 = cameraPositionH.target;
            double d4 = cameraPositionH.zoom;
            dArr = cameraPositionH.padding;
            d2 = d3;
            d = d4;
            latLng = latLng2;
        } else {
            d = -1.0d;
            d2 = -1.0d;
            latLng = null;
            dArr = null;
        }
        nv nvVarI = xq1.I(new CameraPosition(latLng, d, Math.max(0.0d, Math.min(60.0d, 0.0d)), d2, dArr));
        gVar.j();
        gVar.d.f(gVar, nvVarI);
    }

    public final boolean m(boolean z) {
        if (this.i) {
            return false;
        }
        CloudRepository cloudRepository = this.d;
        if (z && !cloudRepository.satelliteAvailable()) {
            return false;
        }
        this.l = z;
        cloudRepository.setSatelliteView(z);
        m mVarI = this.a.i();
        if (mVarI != null) {
            return n(mVarI);
        }
        return !z;
    }

    public final boolean n(m mVar) {
        String strNativeGetId;
        Object next;
        String strNativeGetId2;
        Float fValueOf = Float.valueOf(0.0f);
        mVar.f();
        mVar.g();
        boolean z = this.l;
        CloudRepository cloudRepository = this.d;
        if (!z || !cloudRepository.satelliteAvailable()) {
            this.l = false;
            cloudRepository.setSatelliteView(false);
            return true;
        }
        String strSatelliteTileUrl = cloudRepository.satelliteTileUrl();
        if (strSatelliteTileUrl == null) {
            return false;
        }
        try {
            String[] strArr = {strSatelliteTileUrl};
            gn gnVar = new gn();
            gnVar.a = (String[]) Arrays.copyOf(strArr, strArr.length);
            gnVar.b = fValueOf;
            gnVar.c = Float.valueOf(14.0f);
            mVar.c(new RasterSource(gnVar));
            RasterLayer rasterLayer = new RasterLayer();
            q73.a("Mbgl-Layer");
            rasterLayer.initialize("subscriber-satellite", "subscriber-satellite");
            e52[] e52VarArr = {new e52("nearest", "raster-resampling"), new e52(fValueOf, "raster-fade-duration")};
            if (!rasterLayer.a) {
                q73.a("Mbgl-Layer");
                for (int i = 0; i < 2; i++) {
                    e52 e52Var = e52VarArr[i];
                    Object array = e52Var.b;
                    if (array instanceof Formatted) {
                        array = ((Formatted) array).toArray();
                    }
                    rasterLayer.nativeSetPaintProperty(e52Var.a, array);
                }
            }
            List listE = mVar.e();
            listE.getClass();
            Iterator it = listE.iterator();
            do {
                strNativeGetId = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Layer layer = (Layer) next;
                if (layer instanceof SymbolLayer) {
                    break;
                }
                layer.getClass();
                q73.a("Mbgl-Layer");
                String strNativeGetId3 = layer.nativeGetId();
                strNativeGetId3.getClass();
                if (s13.Z(strNativeGetId3, "com.mapbox.annotations", false)) {
                    break;
                }
                q73.a("Mbgl-Layer");
                strNativeGetId2 = layer.nativeGetId();
                strNativeGetId2.getClass();
            } while (!s13.Z(strNativeGetId2, "com.maplibre.annotations", false));
            Layer layer2 = (Layer) next;
            if (layer2 != null) {
                q73.a("Mbgl-Layer");
                strNativeGetId = layer2.nativeGetId();
            }
            if (strNativeGetId == null) {
                mVar.a(rasterLayer);
                return true;
            }
            mVar.b(rasterLayer, strNativeGetId);
            return true;
        } catch (Exception unused) {
            mVar.f();
            mVar.g();
            cloudRepository.setSatelliteView(false);
            return false;
        }
    }
}
