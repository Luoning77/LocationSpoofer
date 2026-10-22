package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xp implements n52 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public xp(dj djVar, q93 q93Var, List list, xb0 xb0Var, lq0 lq0Var) {
        int i;
        dj djVar2 = djVar;
        q93 q93Var2 = q93Var;
        this.a = djVar2;
        this.b = list;
        final int i2 = 0;
        au0 au0Var = new au0(this) { // from class: tw1
            public final /* synthetic */ xp f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i2;
                Object obj = null;
                int i4 = 1;
                xp xpVar = this.f;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xpVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((m52) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i4);
                                    float fA2 = ((m52) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        m52 m52Var = (m52) obj;
                        return Float.valueOf(m52Var != null ? m52Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xpVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((m52) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i4);
                                    float fC2 = ((m52) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        m52 m52Var2 = (m52) obj;
                        return Float.valueOf(m52Var2 != null ? m52Var2.a.i.c() : 0.0f);
                }
            }
        };
        ce1 ce1Var = ce1.g;
        this.c = ig0.A(ce1Var, au0Var);
        final int i3 = 1;
        this.d = ig0.A(ce1Var, new au0(this) { // from class: tw1
            public final /* synthetic */ xp f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                xp xpVar = this.f;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xpVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((m52) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((m52) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        m52 m52Var = (m52) obj;
                        return Float.valueOf(m52Var != null ? m52Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xpVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((m52) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((m52) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        m52 m52Var2 = (m52) obj;
                        return Float.valueOf(m52Var2 != null ? m52Var2.a.i.c() : 0.0f);
                }
            }
        });
        p52 p52Var = q93Var2.b;
        dj djVar3 = ej.a;
        ArrayList arrayList = djVar2.h;
        String str = djVar2.f;
        uj0 uj0Var = uj0.e;
        List listC0 = arrayList != null ? zy.C0(arrayList, new gq0(6)) : uj0Var;
        ArrayList arrayList2 = new ArrayList();
        mo moVar = new mo();
        int size = listC0.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            cj cjVar = (cj) listC0.get(i4);
            cj cjVarA = cj.a(cjVar, p52Var.a((p52) cjVar.a), i2, 14);
            Object obj = cjVarA.a;
            int i6 = cjVarA.c;
            int i7 = cjVarA.b;
            while (i5 < i7 && !moVar.isEmpty()) {
                cj cjVar2 = (cj) moVar.last();
                listC0 = listC0;
                int i8 = cjVar2.c;
                uj0Var = uj0Var;
                Object obj2 = cjVar2.a;
                if (i7 < i8) {
                    arrayList2.add(new cj(i5, i7, obj2));
                    i5 = i7;
                } else {
                    int i9 = size;
                    arrayList2.add(new cj(i5, i8, obj2));
                    i5 = cjVar2.c;
                    while (!moVar.isEmpty() && i5 == ((cj) moVar.last()).c) {
                        moVar.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listC0;
            uj0 uj0Var2 = uj0Var;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new cj(i5, i7, p52Var));
                i5 = i7;
            }
            cj cjVar3 = (cj) moVar.f();
            if (cjVar3 != null) {
                int i11 = cjVar3.c;
                Object obj3 = cjVar3.a;
                int i12 = cjVar3.b;
                if (i12 == i7 && i11 == i6) {
                    moVar.removeLast();
                    moVar.addLast(new cj(i7, i6, ((p52) obj3).a((p52) obj)));
                } else if (i12 == i11) {
                    arrayList2.add(new cj(i12, i11, obj3));
                    moVar.removeLast();
                    moVar.addLast(new cj(i7, i6, obj));
                } else {
                    if (i11 < i6) {
                        throw new IllegalArgumentException();
                    }
                    moVar.addLast(new cj(i7, i6, ((p52) obj3).a((p52) obj)));
                }
            } else {
                moVar.addLast(new cj(i7, i6, obj));
            }
            i4++;
            listC0 = list2;
            uj0Var = uj0Var2;
            size = i10;
            i2 = 0;
        }
        uj0 uj0Var3 = uj0Var;
        while (i5 <= str.length() && !moVar.isEmpty()) {
            cj cjVar4 = (cj) moVar.last();
            Object obj4 = cjVar4.a;
            int i13 = cjVar4.c;
            arrayList2.add(new cj(i5, i13, obj4));
            while (!moVar.isEmpty() && i13 == ((cj) moVar.last()).c) {
                moVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new cj(i5, str.length(), p52Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new cj(0, 0, p52Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i14 = i;
        for (int size2 = arrayList2.size(); i14 < size2; size2 = size2) {
            cj cjVar5 = (cj) arrayList2.get(i14);
            int i15 = cjVar5.b;
            int i16 = cjVar5.c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listA = ej.a(djVar2, i15, i16, new v1(13));
            dj djVar4 = new dj(strSubstring, listA == null ? uj0Var3 : listA);
            p52 p52Var2 = (p52) cjVar5.a;
            if (p52Var2.b == 0) {
                p52Var2 = new p52(p52Var2.a, p52Var.b, p52Var2.c, p52Var2.d, p52Var2.e, p52Var2.f, p52Var2.g, p52Var2.h, p52Var2.i);
            }
            q93 q93Var3 = new q93(q93Var2.a, p52Var.a(p52Var2));
            List list3 = djVar4.e;
            List list4 = list3 == null ? uj0Var3 : list3;
            List list5 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                cj cjVar6 = (cj) list5.get(i17);
                int i18 = cjVar6.b;
                p52 p52Var3 = p52Var;
                int i19 = cjVar6.c;
                if (ej.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        q21.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new cj(i18 - i15, i19 - i15, cjVar6.a));
                }
                i17++;
                list5 = list5;
                p52Var = p52Var3;
            }
            arrayList3.add(new m52(new pe(strSubstring, q93Var3, list4, arrayList4, lq0Var, xb0Var), i15, i16));
            i14++;
            djVar2 = djVar;
            q93Var2 = q93Var;
            str = str;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.n52
    public float a() {
        return ((Number) ((zb1) this.c).getValue()).floatValue();
    }

    @Override // defpackage.n52
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((m52) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n52
    public float c() {
        return ((Number) ((zb1) this.d).getValue()).floatValue();
    }

    public tv d(wp wpVar, au0 au0Var) {
        int i;
        int i2;
        int i3;
        ue2 ue2Var = new ue2();
        ue2Var.e = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                wpVar.b(th);
                return j9.y;
            }
            gp gpVar = (gp) this.c;
            do {
                i = gpVar.get();
                i2 = i + 1;
            } while (!gpVar.compareAndSet(i, i2));
            int i4 = 1;
            boolean z = (134217727 & i2) == 1;
            ue2Var.e = (i2 >>> 27) & 15;
            ((sx1) this.d).a(wpVar);
            if (z) {
                try {
                    au0Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                sx1 sx1Var = (sx1) this.d;
                                Object[] objArr = sx1Var.a;
                                int i5 = sx1Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((wp) objArr[i6]).b(th2);
                                }
                                ((sx1) this.d).d();
                                gp gpVar2 = (gp) this.c;
                                do {
                                    i3 = gpVar2.get();
                                } while (!gpVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new d31(new a6(wpVar, this, ue2Var, i4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi e(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(l(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public yf2 f() {
        Map mapUnmodifiableMap;
        zz0 zz0Var = (zz0) this.a;
        if (zz0Var == null) {
            fo.n("url == null");
            return null;
        }
        String str = (String) this.b;
        ox0 ox0VarC = ((nx0) this.c).c();
        cg2 cg2Var = (cg2) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        byte[] bArr = bh3.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = vj0.e;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            mapUnmodifiableMap.getClass();
        }
        return new yf2(zz0Var, str, ox0VarC, cg2Var, mapUnmodifiableMap);
    }

    public zw0 g() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = c03.a;
        jm0 jm0Var = (jm0) this.a;
        HashMap map = new HashMap((HashMap) this.b);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new zw0(jm0Var, map, arrayList3, new ArrayList((LinkedList) this.e));
    }

    public void h(lu0 lu0Var) {
        int i;
        synchronized (this.a) {
            try {
                sx1 sx1Var = (sx1) this.d;
                this.d = (sx1) this.e;
                this.e = sx1Var;
                gp gpVar = (gp) this.c;
                do {
                    i = gpVar.get();
                } while (!gpVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = sx1Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    lu0Var.invoke(sx1Var.f(i3));
                }
                sx1Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float i(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float j(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return i(i, z);
        }
        int iT = mc0.t(layout, i, z2);
        int lineStart = layout.getLineStart(iT);
        int lineEnd = layout.getLineEnd(iT);
        if (i != lineStart && i != lineEnd) {
            return i(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return i(i, z);
        }
        int iK = k(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(l(iK))) == -1;
        int iM = m(lineEnd, lineStart);
        int iL = l(iK);
        int i4 = lineStart - iL;
        int i5 = iM - iL;
        Bidi bidiE = e(iK);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iT) : layout.getLineRight(iT);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        sa1[] sa1VarArr = new sa1[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            sa1VarArr[i6] = new sa1(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, sa1VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (sa1VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == sa1VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iT);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(sa1VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(sa1VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iT);
        }
        int iM2 = i > iM ? m(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (sa1VarArr[i9].b == iM2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == sa1VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iT);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(sa1VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(sa1VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iT);
    }

    public int k(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int iE = am1.e(arrayList, Integer.valueOf(i));
        int i2 = iE < 0 ? -(iE + 1) : iE + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public int m(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((o51.m(cCharAt, 8192) < 0 || o51.m(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void n(String str, cg2 cg2Var) {
        str.getClass();
        if (str.length() <= 0) {
            fo.i("method.isEmpty() == true");
            return;
        }
        if (cg2Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                fo.f(az2.k("method ", str, " must have a request body."));
                return;
            }
        } else if (!gh0.K(str)) {
            fo.f(az2.k("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = cg2Var;
    }

    public void o(BoundingBoxTypeAdapter boundingBoxTypeAdapter) {
        zd3 zd3Var = new zd3(BoundingBox.class);
        td3 td3Var = wd3.a;
        ((ArrayList) this.c).add(new td3(zd3Var, boundingBoxTypeAdapter, 2));
    }

    public void p(sd3 sd3Var) {
        Objects.requireNonNull(sd3Var);
        ((ArrayList) this.c).add(sd3Var);
    }

    public void q(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ((LinkedHashMap) this.c).get(str);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) ((LinkedHashMap) this.d).get(str);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }

    public void r(String str) {
        str.getClass();
        if (s13.Z(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (s13.Z(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        yz0 yz0Var = new yz0();
        yz0Var.f(null, str);
        this.a = yz0Var.a();
    }

    public xp(int i) {
        switch (i) {
            case 1:
                this.a = jm0.g;
                this.b = new HashMap();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new LinkedList();
                break;
            case 4:
                this.e = new LinkedHashMap();
                this.b = "GET";
                this.c = new nx0(0);
                break;
            default:
                this.a = new Object();
                this.c = new gp(0);
                this.d = new sx1();
                this.e = new sx1();
                break;
        }
    }

    public xp(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new v00(this, 4);
    }
}
