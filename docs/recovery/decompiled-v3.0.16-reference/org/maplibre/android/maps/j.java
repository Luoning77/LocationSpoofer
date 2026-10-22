package org.maplibre.android.maps;

import defpackage.eq1;
import defpackage.fq1;
import defpackage.gq1;
import defpackage.hq1;
import defpackage.iv;
import defpackage.jf3;
import defpackage.jr2;
import defpackage.mn2;
import defpackage.r00;
import defpackage.vo1;
import defpackage.xp1;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.log.Logger;
import org.maplibre.android.style.layers.CannotAddLayerException;
import org.maplibre.android.style.sources.CannotAddSourceException;
import org.maplibre.android.style.sources.Source;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j implements gq1, hq1, eq1, fq1 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ k b;

    public j(k kVar) {
        this.b = kVar;
        vo1 vo1Var = kVar.e;
        vo1Var.m.add(this);
        vo1Var.i.add(this);
        vo1Var.e.add(this);
        vo1Var.b.add(this);
        vo1Var.c.add(this);
        vo1Var.f.add(this);
    }

    @Override // defpackage.gq1
    public final void a() {
        g gVar = this.b.i;
        if (gVar != null) {
            ArrayList arrayList = gVar.f;
            if (((NativeMapView) gVar.a).f) {
                return;
            }
            m mVar = gVar.k;
            if (mVar != null) {
                mn2 mn2Var = mVar.e;
                int i = 0;
                if (!mVar.f) {
                    mVar.f = true;
                    ArrayList arrayList2 = (ArrayList) mn2Var.e;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        try {
                            mVar.c((Source) obj);
                        } catch (CannotAddSourceException e) {
                            Logger.e("Style", "Failed to add source", e);
                        }
                    }
                    try {
                        Iterator it = ((ArrayList) mn2Var.f).iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (CannotAddLayerException e2) {
                        Logger.e("Style", "Failed to add layer", e2);
                    }
                    ArrayList arrayList3 = (ArrayList) mn2Var.g;
                    if (arrayList3.size() > 0) {
                        throw null;
                    }
                }
                gVar.i.getClass();
                jr2 jr2Var = gVar.h;
                if (jr2Var != null) {
                    jr2Var.a(gVar.k);
                }
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((jr2) obj2).a(gVar.k);
                }
            } else if (xp1.a) {
                throw new iv("No style to provide.");
            }
            gVar.h = null;
            arrayList.clear();
        }
    }

    @Override // defpackage.eq1
    public final void b(boolean z) {
        g gVar = this.b.i;
        if (gVar != null) {
            gVar.k();
        }
    }

    @Override // defpackage.hq1
    public final void c() {
        CameraPosition cameraPositionD;
        g gVar = this.b.i;
        if (gVar == null || (cameraPositionD = gVar.d.d()) == null) {
            return;
        }
        jf3 jf3Var = gVar.b;
        double d = -cameraPositionD.bearing;
        jf3Var.B = d;
        r00 r00Var = jf3Var.d;
        if (r00Var != null) {
            r00Var.c(d);
        }
    }

    @Override // defpackage.fq1
    public final void d() {
        g gVar = this.b.i;
        if (gVar != null) {
            gVar.h = null;
        }
    }
}
