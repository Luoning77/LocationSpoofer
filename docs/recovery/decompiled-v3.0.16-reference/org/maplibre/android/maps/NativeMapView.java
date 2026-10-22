package org.maplibre.android.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.vincenthzr.locationspoofer.data.cloud.MapStartupTiming;
import defpackage.az2;
import defpackage.eq1;
import defpackage.fq1;
import defpackage.gq1;
import defpackage.hq1;
import defpackage.iv;
import defpackage.jp1;
import defpackage.se1;
import defpackage.se2;
import defpackage.tr2;
import defpackage.ty1;
import defpackage.vo1;
import defpackage.xp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.ProjectedMeters;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.light.Light;
import org.maplibre.android.style.sources.Source;
import org.maplibre.android.tile.TileOperation;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class NativeMapView implements ty1 {
    public final FileSource a;
    public final MapRenderer b;
    public final Thread c;
    public final vo1 d;
    public final float e;
    public boolean f;
    private long nativePtr;

    static {
        se1.a();
    }

    public NativeMapView(Context context, jp1 jp1Var, k kVar, vo1 vo1Var, MapRenderer mapRenderer) {
        NativeMapOptions nativeMapOptions = new NativeMapOptions(jp1Var);
        this.f = false;
        this.nativePtr = 0L;
        this.b = mapRenderer;
        FileSource fileSourceB = FileSource.b(context);
        this.a = fileSourceB;
        this.e = nativeMapOptions.pixelRatio();
        this.c = Thread.currentThread();
        this.d = vo1Var;
        nativeInitialize(this, fileSourceB, mapRenderer, nativeMapOptions);
    }

    private native void nativeAddAnnotationIcon(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddImage(String str, Bitmap bitmap, float f, boolean z);

    private native void nativeAddImages(Image[] imageArr);

    private native void nativeAddLayer(long j, String str);

    private native void nativeAddLayerAbove(long j, String str);

    private native void nativeAddLayerAt(long j, int i);

    private native long[] nativeAddMarkers(Marker[] markerArr);

    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    private native void nativeAddSource(Source source, long j);

    private native void nativeCancelTransitions();

    private native void nativeClearActionJournalLog();

    private native void nativeDestroy();

    private native void nativeEaseTo(double d, double d2, double d3, long j, double d4, double d5, double[] dArr, boolean z);

    private native void nativeEnableRenderingStatsView(boolean z);

    private native void nativeFlyTo(double d, double d2, double d3, long j, double d4, double d5, double[] dArr);

    private native String[] nativeGetActionJournalLog();

    private native String[] nativeGetActionJournalLogFiles();

    private native double nativeGetBearing();

    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d, double d2, double d3, double d4, double d5, double d6);

    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d, double d2, double d3, double d4, double d5, double d6);

    private native CameraPosition nativeGetCameraPosition();

    private native boolean nativeGetDebug();

    private native JsonObject nativeGetFeatureState(String str, String str2, String str3);

    private native Bitmap nativeGetImage(String str);

    private native LatLng nativeGetLatLng();

    private native Layer nativeGetLayer(String str);

    private native Layer[] nativeGetLayers();

    private native Light nativeGetLight();

    private native double nativeGetMaxPitch();

    private native double nativeGetMaxZoom();

    private native double nativeGetMetersPerPixelAtLatitude(double d, double d2);

    private native double nativeGetMinPitch();

    private native double nativeGetMinZoom();

    private native double nativeGetPitch();

    private native boolean nativeGetPrefetchTiles();

    private native int nativeGetPrefetchZoomDelta();

    private native Source nativeGetSource(String str);

    private native Source[] nativeGetSources();

    private native String nativeGetStyleJson();

    private native String nativeGetStyleUrl();

    private native boolean nativeGetTileCacheEnabled();

    private native double nativeGetTileLodMinRadius();

    private native double nativeGetTileLodPitchThreshold();

    private native double nativeGetTileLodScale();

    private native double nativeGetTileLodZoomShift();

    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    private native long nativeGetTransitionDelay();

    private native long nativeGetTransitionDuration();

    private native TransitionOptions nativeGetTransitionOptions();

    private native void nativeGetVisibleCoordinateBounds(double[] dArr);

    private native double nativeGetZoom();

    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, NativeMapOptions nativeMapOptions);

    private native boolean nativeIsFullyLoaded();

    private native boolean nativeIsRenderingStatsViewEnabled();

    private native void nativeJumpTo(double d, double d2, double d3, double d4, double d5, double[] dArr);

    private native LatLng nativeLatLngForPixel(float f, float f2);

    private native LatLng nativeLatLngForProjectedMeters(double d, double d2);

    private native void nativeLatLngsForPixels(double[] dArr, double[] dArr2, float f);

    private native void nativeMoveBy(double d, double d2, long j);

    private native void nativeOnLowMemory();

    private native PointF nativePixelForLatLng(double d, double d2);

    private native void nativePixelsForLatLngs(double[] dArr, double[] dArr2, float f);

    private native ProjectedMeters nativeProjectedMetersForLatLng(double d, double d2);

    private native long[] nativeQueryPointAnnotations(RectF rectF);

    private native Feature[] nativeQueryRenderedFeaturesForBox(float f, float f2, float f3, float f4, String[] strArr, Object[] objArr);

    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f, float f2, String[] strArr, Object[] objArr);

    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    private native void nativeRemoveAnnotationIcon(String str);

    private native void nativeRemoveAnnotations(long[] jArr);

    private native void nativeRemoveFeatureState(String str, String str2, String str3, String str4);

    private native void nativeRemoveImage(String str);

    private native boolean nativeRemoveLayer(long j);

    private native boolean nativeRemoveLayerAt(int i);

    private native boolean nativeRemoveSource(Source source, long j);

    private native void nativeResetNorth();

    private native void nativeResetPosition();

    private native void nativeResetZoom();

    private native void nativeResizeView(int i, int i2);

    private native void nativeRotateBy(double d, double d2, double d3, double d4, long j);

    private native void nativeSetBearing(double d, long j);

    private native void nativeSetBearingXY(double d, double d2, double d3, long j);

    private native void nativeSetDebug(boolean z);

    private native void nativeSetFeatureState(String str, String str2, String str3, JsonObject jsonObject);

    private native void nativeSetFrustumOffset(RectF rectF);

    private native void nativeSetGestureInProgress(boolean z);

    private native void nativeSetLatLng(double d, double d2, double[] dArr, long j);

    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    private native void nativeSetMaxPitch(double d);

    private native void nativeSetMaxZoom(double d);

    private native void nativeSetMinPitch(double d);

    private native void nativeSetMinZoom(double d);

    private native void nativeSetPitch(double d, long j);

    private native void nativeSetPrefetchTiles(boolean z);

    private native void nativeSetPrefetchZoomDelta(int i);

    private native void nativeSetReachability(boolean z);

    private native void nativeSetStyleJson(String str);

    private native void nativeSetStyleUrl(String str);

    private native void nativeSetTileCacheEnabled(boolean z);

    private native void nativeSetTileLodMinRadius(double d);

    private native void nativeSetTileLodPitchThreshold(double d);

    private native void nativeSetTileLodScale(double d);

    private native void nativeSetTileLodZoomShift(double d);

    private native void nativeSetTransitionDelay(long j);

    private native void nativeSetTransitionDuration(long j);

    private native void nativeSetTransitionOptions(TransitionOptions transitionOptions);

    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j);

    private native void nativeSetZoom(double d, double d2, double d3, long j);

    private native void nativeTakeSnapshot();

    private native void nativeTriggerRepaint();

    private native void nativeUpdateMarker(long j, double d, double d2, String str);

    private native void nativeUpdatePolygon(long j, Polygon polygon);

    private native void nativeUpdatePolyline(long j, Polyline polyline);

    private void onCameraDidChange(boolean z) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.c;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((eq1) it.next()).b(z);
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraDidChange", th);
                throw th;
            }
        }
    }

    private void onCameraIsChanging() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.b;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    g gVar = ((j) it.next()).b.i;
                    if (gVar != null) {
                        gVar.k();
                    }
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraIsChanging", th);
                throw th;
            }
        }
    }

    private void onCameraWillChange(boolean z) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.a;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraWillChange", th);
                throw th;
            }
        }
    }

    private boolean onCanRemoveUnusedStyleImage(String str) {
        vo1 vo1Var = this.d;
        if (vo1Var == null) {
            return true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.p;
        if (copyOnWriteArrayList.isEmpty()) {
            return true;
        }
        try {
            if (copyOnWriteArrayList.isEmpty()) {
                return true;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            if (!it.hasNext()) {
                return true;
            }
            if (it.next() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCanRemoveUnusedStyleImage", th);
            throw th;
        }
    }

    private void onDidBecomeIdle() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.l;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidBecomeIdle", th);
                throw th;
            }
        }
    }

    private void onDidFailLoadingMap(String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.f;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((fq1) it.next()).d();
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFailLoadingMap", th);
                throw th;
            }
        }
    }

    private void onDidFinishLoadingMap() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.e;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    g gVar = ((j) it.next()).b.i;
                    if (gVar != null) {
                        gVar.k();
                    }
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingMap", th);
                throw th;
            }
        }
    }

    private void onDidFinishLoadingStyle() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.m;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((gq1) it.next()).a();
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingStyle", th);
                throw th;
            }
        }
    }

    private void onDidFinishRenderingFrame(boolean z, RenderingStats renderingStats) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.i;
            CopyOnWriteArrayList<tr2> copyOnWriteArrayList2 = vo1Var.h;
            try {
                if (!copyOnWriteArrayList2.isEmpty()) {
                    for (tr2 tr2Var : copyOnWriteArrayList2) {
                        double d = renderingStats.encodingTime;
                        se2 se2Var = tr2Var.a;
                        if (z && se2Var.e) {
                            MapStartupTiming.INSTANCE.mark(MapStartupTiming.Phase.MAP_FIRST_FRAME);
                        }
                    }
                }
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((hq1) it.next()).c();
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingFrame", th);
                throw th;
            }
        }
    }

    private void onDidFinishRenderingMap(boolean z) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.k;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingMap", th);
                throw th;
            }
        }
    }

    private void onGlyphsError(String[] strArr, int i, int i2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.u;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsError", th);
                throw th;
            }
        }
    }

    private void onGlyphsLoaded(String[] strArr, int i, int i2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.t;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsLoaded", th);
                throw th;
            }
        }
    }

    private void onGlyphsRequested(String[] strArr, int i, int i2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.v;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsRequested", th);
                throw th;
            }
        }
    }

    private void onPostCompileShader(int i, int i2, String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.r;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onPostCompileShader", th);
                throw th;
            }
        }
    }

    private void onPreCompileShader(int i, int i2, String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.q;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onPreCompileShader", th);
                throw th;
            }
        }
    }

    private void onRenderError() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.A;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onRenderError", th);
                throw th;
            }
        }
    }

    private void onShaderCompileFailed(int i, int i2, String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.s;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onShaderCompileFailed", th);
                throw th;
            }
        }
    }

    private void onSourceChanged(String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.n;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onSourceChanged", th);
                throw th;
            }
        }
    }

    private void onSpriteError(String str, String str2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.y;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteError", th);
                throw th;
            }
        }
    }

    private void onSpriteLoaded(String str, String str2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.x;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteLoaded", th);
                throw th;
            }
        }
    }

    private void onSpriteRequested(String str, String str2) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.z;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteRequested", th);
                throw th;
            }
        }
    }

    private void onStyleImageMissing(String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.o;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onStyleImageMissing", th);
                throw th;
            }
        }
    }

    private void onSymbolError(String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            try {
                Iterator it = vo1Var.B.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onSymbolError", th);
            }
        }
    }

    private void onTileAction(TileOperation tileOperation, int i, int i2, int i3, int i4, int i5, String str) {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.w;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onTileAction", th);
                throw th;
            }
        }
    }

    private void onWillStartLoadingMap() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.d;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartLoadingMap", th);
                throw th;
            }
        }
    }

    private void onWillStartRenderingFrame() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.g;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingFrame", th);
                throw th;
            }
        }
    }

    private void onWillStartRenderingMap() {
        vo1 vo1Var = this.d;
        if (vo1Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = vo1Var.j;
            try {
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingMap", th);
                throw th;
            }
        }
    }

    public final long[] A(RectF rectF) {
        return i("queryPointAnnotations") ? new long[0] : nativeQueryPointAnnotations(rectF);
    }

    public final long[] B(RectF rectF) {
        return i("queryShapeAnnotations") ? new long[0] : nativeQueryShapeAnnotations(rectF);
    }

    public final void C(String str) {
        if (i("removeAnnotationIcon")) {
            return;
        }
        nativeRemoveAnnotationIcon(str);
    }

    public final void D(long[] jArr) {
        if (i("removeAnnotations")) {
            return;
        }
        nativeRemoveAnnotations(jArr);
    }

    public final void E(String str) {
        if (i("removeImage")) {
            return;
        }
        nativeRemoveImage(str);
    }

    public final boolean F() {
        if (!i("removeLayer")) {
            Layer layerNativeGetLayer = i("getLayer") ? null : nativeGetLayer("subscriber-satellite");
            if (layerNativeGetLayer != null && !i("removeLayer")) {
                if (layerNativeGetLayer.a) {
                    Logger.w("Mbgl-NativeMapView", "Ignoring removeLayer() call on detached layer reference.");
                    return false;
                }
                long jA = layerNativeGetLayer.a();
                if (jA != 0) {
                    return nativeRemoveLayer(jA);
                }
                Logger.w("Mbgl-NativeMapView", "Ignoring removeLayer() call on released layer pointer.");
                return false;
            }
        }
        return false;
    }

    public final boolean G() {
        if (i("removeSource")) {
            return false;
        }
        Source sourceNativeGetSource = i("getSource") ? null : nativeGetSource("subscriber-satellite");
        if (sourceNativeGetSource == null || i("removeSource")) {
            return false;
        }
        return nativeRemoveSource(sourceNativeGetSource, sourceNativeGetSource.getNativePtr());
    }

    public final void H(int i, int i2) {
        if (i("resizeView")) {
            return;
        }
        float f = this.e;
        int iCeil = (int) Math.ceil(i / f);
        int iCeil2 = (int) Math.ceil(i2 / f);
        if (iCeil < 0) {
            Logger.e("Mbgl-NativeMapView", "Device returned a negative width size, setting value to 0 instead of " + iCeil);
            iCeil = 0;
        }
        if (iCeil2 < 0) {
            Logger.e("Mbgl-NativeMapView", "Device returned a negative height size, setting value to 0 instead of " + iCeil2);
            iCeil2 = 0;
        }
        if (iCeil > 65535) {
            Logger.e("Mbgl-NativeMapView", "Device returned an out of range width size, capping value at 65535 instead of " + iCeil);
            iCeil = 65535;
        }
        if (iCeil2 > 65535) {
            Logger.e("Mbgl-NativeMapView", "Device returned an out of range height size, capping value at 65535 instead of " + iCeil2);
            iCeil2 = 65535;
        }
        nativeResizeView(iCeil, iCeil2);
    }

    public final void I(double d, double d2, double d3, long j) {
        if (i("setBearing")) {
            return;
        }
        double d4 = this.e;
        nativeSetBearingXY(d, d2 / d4, d3 / d4, j);
    }

    public final void J(boolean z) {
        if (i("setDebug")) {
            return;
        }
        nativeSetDebug(z);
    }

    public final void K(boolean z) {
        if (i("setGestureInProgress")) {
            return;
        }
        nativeSetGestureInProgress(z);
    }

    public final void L(double d) {
        if (i("setMaxPitch")) {
            return;
        }
        nativeSetMaxPitch(d);
    }

    public final void M(double d) {
        if (i("setMaxZoom")) {
            return;
        }
        nativeSetMaxZoom(d);
    }

    public final void N(double d) {
        if (i("setMinPitch")) {
            return;
        }
        nativeSetMinPitch(d);
    }

    public final void O(double d) {
        if (i("setMinZoom")) {
            return;
        }
        nativeSetMinZoom(d);
    }

    public final void P(double d) {
        if (i("setPitch")) {
            return;
        }
        nativeSetPitch(d, 0L);
    }

    public final void Q(int i) {
        if (i("nativeSetPrefetchZoomDelta")) {
            return;
        }
        nativeSetPrefetchZoomDelta(i);
    }

    public final void R(boolean z) {
        if (i("setReachability")) {
            return;
        }
        nativeSetReachability(z);
    }

    public final void S(String str) {
        if (i("setStyleJson")) {
            return;
        }
        nativeSetStyleJson(str);
    }

    public final void T(String str) {
        if (i("setStyleUri")) {
            return;
        }
        nativeSetStyleUrl(str);
    }

    public final void U(double d, PointF pointF) {
        if (i("setZoom")) {
            return;
        }
        float f = pointF.x;
        float f2 = this.e;
        nativeSetZoom(d, f / f2, pointF.y / f2, 0L);
    }

    public final void V(Marker marker) {
        if (i("updateMarker")) {
            return;
        }
        LatLng latLngA = marker.a();
        nativeUpdateMarker(marker.e, latLngA.a(), latLngA.b(), marker.h.b);
    }

    public final void W(Polygon polygon) {
        if (i("updatePolygon")) {
            return;
        }
        nativeUpdatePolygon(polygon.e, polygon);
    }

    public final void X(Polyline polyline) {
        if (i("updatePolyline")) {
            return;
        }
        nativeUpdatePolyline(polyline.e, polyline);
    }

    public final void a(String str, int i, int i2, float f, byte[] bArr) {
        if (i("addAnnotationIcon")) {
            return;
        }
        nativeAddAnnotationIcon(str, i, i2, f, bArr);
    }

    public final void b(RasterLayer rasterLayer) {
        if (i("addLayer")) {
            return;
        }
        nativeAddLayer(rasterLayer.a(), null);
    }

    public final void c(RasterLayer rasterLayer, String str) {
        if (i("addLayerBelow")) {
            return;
        }
        nativeAddLayer(rasterLayer.a(), str);
    }

    public final long d(Marker marker) {
        if (i("addMarker")) {
            return 0L;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    public final long e(Polygon polygon) {
        if (i("addPolygon")) {
            return 0L;
        }
        return nativeAddPolygons(new Polygon[]{polygon})[0];
    }

    public final long f(Polyline polyline) {
        if (i("addPolyline")) {
            return 0L;
        }
        return nativeAddPolylines(new Polyline[]{polyline})[0];
    }

    public final void g(Source source) {
        if (i("addSource")) {
            return;
        }
        nativeAddSource(source, source.getNativePtr());
    }

    public final void h() {
        if (i("cancelTransitions")) {
            return;
        }
        nativeCancelTransitions();
    }

    public final boolean i(String str) {
        if (this.c != Thread.currentThread()) {
            throw new iv(az2.k("Map interactions should happen on the UI thread. Method invoked from wrong thread is ", str, "."));
        }
        if (this.f && !TextUtils.isEmpty(str)) {
            String str2 = "You're calling `" + str + "` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?";
            Logger.e("Mbgl-NativeMapView", str2);
            if (xp1.a) {
                throw new iv(str2);
            }
        }
        return this.f;
    }

    public final void j() {
        this.f = true;
        nativeDestroy();
    }

    public final void k(LatLng latLng, double d, double d2, double d3, double[] dArr, long j) {
        if (i("flyTo")) {
            return;
        }
        nativeFlyTo(d2, latLng.a(), latLng.b(), j, d3, d, l(dArr));
    }

    public final double[] l(double[] dArr) {
        if (dArr == null) {
            dArr = null;
        }
        if (dArr == null) {
            return null;
        }
        double d = dArr[1];
        double d2 = this.e;
        return new double[]{d / d2, dArr[0] / d2, dArr[3] / d2, dArr[2] / d2};
    }

    public final double m() {
        if (i("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    public final CameraPosition n(LatLngBounds latLngBounds, int[] iArr, double d, double d2) {
        if (i("getCameraForLatLngBounds")) {
            return null;
        }
        float f = iArr[1];
        float f2 = this.e;
        return nativeGetCameraForLatLngBounds(latLngBounds, f / f2, iArr[0] / f2, iArr[3] / f2, iArr[2] / f2, d, d2);
    }

    public final CameraPosition o() {
        return i("getCameraValues") ? new CameraPosition(null, -1.0d, -1.0d, -1.0d, null) : nativeGetCameraPosition();
    }

    public void onSnapshotReady(Bitmap bitmap) {
        i("OnSnapshotReady");
    }

    public final List p() {
        return i("getLayers") ? new ArrayList() : Arrays.asList(nativeGetLayers());
    }

    public final double q() {
        if (i("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    public final List r() {
        return i("getSources") ? new ArrayList() : Arrays.asList(nativeGetSources());
    }

    public final String s() {
        return i("getStyleUri") ? "" : nativeGetStyleUrl();
    }

    public final double t(String str) {
        if (i("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    public final double u() {
        if (i("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    public final void v(LatLng latLng, double d, double d2, double d3, double[] dArr) {
        if (i("jumpTo")) {
            return;
        }
        nativeJumpTo(d3, latLng.a(), latLng.b(), d2, d, l(dArr));
    }

    public final LatLng w(PointF pointF) {
        if (i("latLngForPixel")) {
            return new LatLng();
        }
        float f = pointF.x;
        float f2 = this.e;
        return nativeLatLngForPixel(f / f2, pointF.y / f2);
    }

    public final void x(double d, double d2, long j) {
        if (i("moveBy")) {
            return;
        }
        try {
            double d3 = this.e;
            nativeMoveBy(d / d3, d2 / d3, j);
        } catch (Error e) {
            Logger.d("Mbgl-NativeMapView", "Error when executing NativeMapView#moveBy", e);
        }
    }

    public final void y() {
        if (i("onLowMemory")) {
            return;
        }
        nativeOnLowMemory();
    }

    public final PointF z(LatLng latLng) {
        if (i("pixelForLatLng")) {
            return new PointF();
        }
        PointF pointFNativePixelForLatLng = nativePixelForLatLng(latLng.a(), latLng.b());
        float f = pointFNativePixelForLatLng.x;
        float f2 = this.e;
        pointFNativePixelForLatLng.set(f * f2, pointFNativePixelForLatLng.y * f2);
        return pointFNativePixelForLatLng;
    }
}
