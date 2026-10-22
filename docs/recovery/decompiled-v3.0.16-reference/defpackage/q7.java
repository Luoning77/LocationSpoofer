package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.LatLngQuad;
import org.maplibre.android.geometry.ProjectedMeters;
import org.maplibre.android.log.Logger;
import org.maplibre.android.offline.OfflineGeometryRegionDefinition;
import org.maplibre.android.offline.OfflineTilePyramidRegionDefinition;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ q7(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double[] dArr;
        int i = 0;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new r7(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                zl zlVar = new zl(parcel);
                zlVar.e = parcel.readByte() != 0;
                return zlVar;
            case 2:
                return new dq(parcel);
            case 3:
                return new eq(parcel);
            case 4:
                parcel.getClass();
                double d = parcel.readDouble();
                LatLng latLng = Build.VERSION.SDK_INT > 33 ? (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class) : (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                double d2 = parcel.readDouble();
                double d3 = parcel.readDouble();
                double d4 = parcel.readDouble();
                double d5 = parcel.readDouble();
                double d6 = parcel.readDouble();
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    double[] dArr2 = new double[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        dArr2[i3] = parcel.readDouble();
                    }
                    dArr = dArr2;
                } else {
                    dArr = null;
                }
                return new CameraPosition(latLng, d2, d6, d3, d, d4, d5, dArr);
            case Logger.WARN /* 5 */:
                return new pa0(parcel.readInt());
            case Logger.ERROR /* 6 */:
                return new DefaultStyle(parcel);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ds0 ds0Var = new ds0();
                ds0Var.e = parcel.readString();
                ds0Var.f = parcel.readInt();
                return ds0Var;
            case 8:
                is0 is0Var = new is0();
                is0Var.i = null;
                is0Var.j = new ArrayList();
                is0Var.k = new ArrayList();
                is0Var.e = parcel.createStringArrayList();
                is0Var.f = parcel.createStringArrayList();
                is0Var.g = (dq[]) parcel.createTypedArray(dq.CREATOR);
                is0Var.h = parcel.readInt();
                is0Var.i = parcel.readString();
                is0Var.j = parcel.createStringArrayList();
                is0Var.k = parcel.createTypedArrayList(eq.CREATOR);
                is0Var.l = parcel.createTypedArrayList(ds0.CREATOR);
                return is0Var;
            case mc0.b /* 9 */:
                return new ls0(parcel);
            case mc0.c /* 10 */:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new r41((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                parcel.getClass();
                return new LatLng(parcel);
            case mc0.d /* 12 */:
                parcel.getClass();
                LatLngBounds.Companion.getClass();
                return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            case 13:
                parcel.getClass();
                return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
            case 14:
                parcel.getClass();
                ga1 ga1Var = new ga1();
                ga1Var.e = parcel.readDouble();
                ga1Var.f = parcel.readDouble();
                return ga1Var;
            case a83.e /* 15 */:
                jp1 jp1Var = new jp1();
                jp1Var.g = true;
                jp1Var.h = true;
                jp1Var.i = 8388661;
                jp1Var.l = true;
                jp1Var.m = 8388691;
                jp1Var.o = -1;
                jp1Var.p = true;
                jp1Var.q = 8388691;
                jp1Var.s = 0.0d;
                jp1Var.t = 25.5d;
                jp1Var.u = 0.0d;
                jp1Var.v = 60.0d;
                jp1Var.w = true;
                jp1Var.x = true;
                jp1Var.y = true;
                jp1Var.z = true;
                jp1Var.A = true;
                jp1Var.B = true;
                jp1Var.C = true;
                jp1Var.D = true;
                jp1Var.E = 4;
                jp1Var.F = false;
                jp1Var.G = true;
                jp1Var.O = true;
                jp1Var.P = false;
                jp1Var.Q = "";
                jp1Var.R = 1048576L;
                jp1Var.S = 5L;
                jp1Var.T = 60;
                jp1Var.U = false;
                jp1Var.V = false;
                jp1Var.e = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
                jp1Var.f = parcel.readByte() != 0;
                jp1Var.g = parcel.readByte() != 0;
                jp1Var.i = parcel.readInt();
                jp1Var.j = parcel.createIntArray();
                jp1Var.h = parcel.readByte() != 0;
                Bitmap bitmap = (Bitmap) parcel.readParcelable(jp1.class.getClassLoader());
                if (bitmap != null) {
                    jp1Var.k = new BitmapDrawable(bitmap);
                }
                jp1Var.l = parcel.readByte() != 0;
                jp1Var.m = parcel.readInt();
                jp1Var.n = parcel.createIntArray();
                jp1Var.p = parcel.readByte() != 0;
                jp1Var.q = parcel.readInt();
                jp1Var.r = parcel.createIntArray();
                jp1Var.o = parcel.readInt();
                jp1Var.s = parcel.readDouble();
                jp1Var.t = parcel.readDouble();
                jp1Var.u = parcel.readDouble();
                jp1Var.v = parcel.readDouble();
                jp1Var.w = parcel.readByte() != 0;
                jp1Var.x = parcel.readByte() != 0;
                jp1Var.y = parcel.readByte() != 0;
                jp1Var.z = parcel.readByte() != 0;
                jp1Var.A = parcel.readByte() != 0;
                jp1Var.B = parcel.readByte() != 0;
                jp1Var.C = parcel.readByte() != 0;
                jp1Var.J = parcel.readString();
                jp1Var.K = parcel.readByte() != 0;
                jp1Var.L = parcel.readByte() != 0;
                jp1Var.D = parcel.readByte() != 0;
                jp1Var.E = parcel.readInt();
                jp1Var.F = parcel.readByte() != 0;
                jp1Var.G = parcel.readByte() != 0;
                jp1Var.H = parcel.readString();
                jp1Var.I = parcel.createStringArray();
                jp1Var.N = parcel.readFloat();
                jp1Var.M = parcel.readInt();
                jp1Var.O = parcel.readByte() != 0;
                jp1Var.P = parcel.readByte() != 0;
                jp1Var.Q = parcel.readString();
                jp1Var.R = parcel.readLong();
                jp1Var.S = parcel.readLong();
                jp1Var.T = parcel.readInt();
                jp1Var.U = parcel.readByte() != 0;
                jp1Var.V = parcel.readByte() != 0;
                return jp1Var;
            case 16:
                sq1 sq1Var = new sq1();
                sq1Var.e = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                sq1Var.f = parcel.readString();
                sq1Var.g = parcel.readString();
                if (parcel.readByte() != 0) {
                    sq1Var.h = new n01(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()));
                }
                return sq1Var;
            case 17:
                kz1 kz1Var = new kz1(parcel);
                kz1Var.e = parcel.readInt();
                return kz1Var;
            case 18:
                parcel.getClass();
                return new OfflineGeometryRegionDefinition(parcel);
            case 19:
                parcel.getClass();
                return new OfflineTilePyramidRegionDefinition(parcel);
            case 20:
                return new ParcelImpl(parcel);
            case 21:
                return new s52(parcel.readFloat());
            case 22:
                return new t52(parcel.readInt());
            case 23:
                return new u52(parcel.readLong());
            case 24:
                ha2 ha2Var = new ha2();
                ha2Var.e = new Polygon();
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, LatLng.class.getClassLoader());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ha2Var.e.a((LatLng) obj);
                }
                ArrayList arrayList2 = new ArrayList();
                parcel.readList(arrayList2, LatLng.class.getClassLoader());
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ha2Var.e.f((List) obj2);
                }
                ha2Var.e.d(parcel.readFloat());
                ha2Var.e.j(parcel.readInt());
                ha2Var.e.k(parcel.readInt());
                return ha2Var;
            case 25:
                ia2 ia2Var = new ia2();
                Polyline polyline = new Polyline();
                ia2Var.e = polyline;
                ArrayList arrayList3 = new ArrayList();
                parcel.readList(arrayList3, LatLng.class.getClassLoader());
                ia2Var.a(arrayList3);
                polyline.d(parcel.readFloat());
                polyline.h(parcel.readInt());
                polyline.i(parcel.readFloat());
                return ia2Var;
            case 26:
                parcel.getClass();
                ProjectedMeters projectedMeters = new ProjectedMeters();
                projectedMeters.e = parcel.readDouble();
                projectedMeters.f = parcel.readDouble();
                return projectedMeters;
            default:
                return new TileServerOptions(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new r7[i];
            case 1:
                return new zl[i];
            case 2:
                return new dq[i];
            case 3:
                return new eq[i];
            case 4:
                return new CameraPosition[i];
            case Logger.WARN /* 5 */:
                return new pa0[i];
            case Logger.ERROR /* 6 */:
                return new DefaultStyle[i];
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new ds0[i];
            case 8:
                return new is0[i];
            case mc0.b /* 9 */:
                return new ls0[i];
            case mc0.c /* 10 */:
                return new r41[i];
            case 11:
                return new LatLng[i];
            case mc0.d /* 12 */:
                return new LatLngBounds[i];
            case 13:
                return new LatLngQuad[i];
            case 14:
                return new ga1[i];
            case a83.e /* 15 */:
                return new jp1[i];
            case 16:
                return new sq1[i];
            case 17:
                return new kz1[i];
            case 18:
                return new OfflineGeometryRegionDefinition[i];
            case 19:
                return new OfflineTilePyramidRegionDefinition[i];
            case 20:
                return new ParcelImpl[i];
            case 21:
                return new s52[i];
            case 22:
                return new t52[i];
            case 23:
                return new u52[i];
            case 24:
                return new ha2[i];
            case 25:
                return new ia2[i];
            case 26:
                return new ProjectedMeters[i];
            default:
                return new TileServerOptions[i];
        }
    }
}
