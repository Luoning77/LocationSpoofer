package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pe implements n52 {
    public final String a;
    public final q93 b;
    public final List c;
    public final List d;
    public final lq0 e;
    public final xb0 f;
    public final mg g;
    public final CharSequence h;
    public final va1 i;
    public gn j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:218:0x0434  */
    /* JADX WARN: Code duplicated, block: B:234:0x0478  */
    /* JADX WARN: Code duplicated, block: B:246:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:249:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:257:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:259:0x0518  */
    /* JADX WARN: Code duplicated, block: B:262:0x052a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0536  */
    /* JADX WARN: Code duplicated, block: B:273:0x054c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0569  */
    /* JADX WARN: Code duplicated, block: B:289:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:291:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:294:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:296:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:298:0x05e8 A[LOOP:8: B:297:0x05e6->B:298:0x05e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:303:0x0603  */
    /* JADX WARN: Code duplicated, block: B:305:0x060a  */
    /* JADX WARN: Code duplicated, block: B:307:0x060e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0615  */
    /* JADX WARN: Code duplicated, block: B:310:0x061d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0655  */
    /* JADX WARN: Code duplicated, block: B:326:0x0670  */
    /* JADX WARN: Code duplicated, block: B:328:0x067c  */
    /* JADX WARN: Code duplicated, block: B:335:0x0690  */
    /* JADX WARN: Code duplicated, block: B:389:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:391:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:393:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:400:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:414:0x084b  */
    /* JADX WARN: Code duplicated, block: B:416:0x085c  */
    /* JADX WARN: Code duplicated, block: B:417:0x0860  */
    /* JADX WARN: Code duplicated, block: B:419:0x086b  */
    /* JADX WARN: Code duplicated, block: B:422:0x0875 A[LOOP:6: B:421:0x0873->B:422:0x0875, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:425:0x0886  */
    /* JADX WARN: Code duplicated, block: B:427:0x0891  */
    /* JADX WARN: Code duplicated, block: B:429:0x089e A[LOOP:7: B:428:0x089c->B:429:0x089e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:432:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:436:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:448:0x054f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:427:0x0891, please report this as an issue */
    public pe(String str, q93 q93Var, List list, List list2, lq0 lq0Var, xb0 xb0Var) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        jr0 jr0Var;
        int i2;
        Typeface typeface;
        CharSequence charSequence;
        int length;
        int i3;
        k83 k83Var;
        p52 p52Var;
        ArrayList arrayList;
        int size;
        int i4;
        uy2 uy2Var;
        l43 l43Var;
        uy2 uy2Var2;
        bu buVar;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        uy2 uy2VarC;
        int i10;
        ArrayList arrayList2;
        uy2 uy2Var3;
        int i11;
        int i12;
        int i13;
        int size5;
        int i14;
        boolean z;
        List list3;
        xb0 xb0Var2;
        List list4;
        k83 k83Var2;
        int size6;
        int i15;
        int i16;
        cj cjVar;
        long j;
        long jB;
        int size7;
        int i17;
        cj cjVar2;
        zi ziVar;
        int i18;
        int i19;
        int i20;
        cj cjVar3;
        Object obj2;
        int i21;
        xb0 xb0Var3;
        p52 p52Var2;
        int i22;
        int i23;
        cj cjVar4;
        Object obj3;
        uy2 uy2Var4;
        int i24;
        long j2;
        long j3;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        w82 w82Var;
        CharSequence charSequence2;
        w82 w82Var2;
        this.a = str;
        this.b = q93Var;
        this.c = list;
        this.d = list2;
        this.e = lq0Var;
        this.f = xb0Var;
        float fG = xb0Var.g();
        mg mgVar = new mg(1);
        ((TextPaint) mgVar).density = fG;
        mgVar.b = p63.b;
        mgVar.c = 3;
        mgVar.d = xt2.d;
        this.g = mgVar;
        boolean zW = k22.w(q93Var);
        uy2 uy2Var5 = q93Var.a;
        p52 p52Var3 = q93Var.b;
        if (zW) {
            t1 t1Var = aj0.a;
            t1 t1Var2 = aj0.a;
            s03 s03VarW = (s03) t1Var2.f;
            if (s03VarW == null) {
                if (wi0.d()) {
                    s03VarW = t1Var2.w();
                    t1Var2.f = s03VarW;
                } else {
                    s03VarW = xq1.D;
                }
            }
            zBooleanValue = ((Boolean) s03VarW.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.k = zBooleanValue;
        int i25 = p52Var3.b;
        sh1 sh1Var = uy2Var5.k;
        if (i25 == 4) {
            i = 2;
        } else if (i25 == 5) {
            i = 3;
        } else if (i25 == 1) {
            i = 0;
        } else if (i25 == 2) {
            i = 1;
        } else {
            if (i25 != 3 && i25 != 0) {
                fo.n("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((sh1Var == null || (locale = ((rh1) sh1Var.e.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.l = i;
        oe oeVar = new oe(this, 0);
        d93 d93Var = p52Var3.i;
        d93Var = d93Var == null ? d93.c : d93Var;
        mgVar.setFlags(d93Var.b ? mgVar.getFlags() | WorkQueueKt.BUFFER_CAPACITY : mgVar.getFlags() & (-129));
        int i26 = d93Var.a;
        if (i26 == 1) {
            mgVar.setFlags(mgVar.getFlags() | 64);
            mgVar.setHinting(0);
        } else if (i26 == 2) {
            mgVar.getFlags();
            mgVar.setHinting(1);
        } else if (i26 == 3) {
            mgVar.getFlags();
            mgVar.setHinting(0);
        } else {
            mgVar.getFlags();
        }
        int size8 = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i27);
            if (((cj) obj).a instanceof uy2) {
                break;
            } else {
                i27++;
            }
        }
        boolean z2 = obj != null;
        long j4 = uy2Var5.b;
        jr0 jr0Var2 = uy2Var5.c;
        hr0 hr0Var = uy2Var5.d;
        String str2 = uy2Var5.g;
        sh1 sh1Var2 = uy2Var5.k;
        i83 i83Var = uy2Var5.a;
        j83 j83Var = uy2Var5.j;
        long j5 = uy2Var5.h;
        long jB4 = w93.b(j4);
        boolean z3 = z2;
        if (x93.a(jB4, 4294967296L)) {
            mgVar.setTextSize(xb0Var.G0(j4));
        } else if (x93.a(jB4, 8589934592L)) {
            mgVar.setTextSize(w93.c(j4) * mgVar.getTextSize());
        }
        l43 l43Var2 = uy2Var5.f;
        if (l43Var2 != null || hr0Var != null || jr0Var2 != null) {
            if (jr0Var2 == null) {
                jr0Var = jr0.g;
            }
            if (hr0Var != null) {
                jr0Var = jr0Var2;
                i2 = hr0Var.a;
            } else {
                jr0Var = jr0Var2;
                i2 = 0;
            }
            ir0 ir0Var = uy2Var5.e;
            int i28 = ir0Var != null ? ir0Var.a : 65535;
            pe peVar = (pe) oeVar.f;
            he3 he3VarB = ((mq0) peVar.e).b(l43Var2, jr0Var, i2, i28);
            if (he3VarB instanceof he3) {
                Object obj4 = he3VarB.e;
                obj4.getClass();
                typeface = (Typeface) obj4;
            } else {
                gn gnVar = new gn(he3VarB, peVar.j);
                peVar.j = gnVar;
                Object obj5 = gnVar.c;
                obj5.getClass();
                typeface = (Typeface) obj5;
            }
            mgVar.setTypeface(typeface);
        }
        if (sh1Var2 != null) {
            sh1 sh1Var3 = sh1.g;
            if (!sh1Var2.equals(o82.a.k())) {
                ArrayList arrayList3 = new ArrayList(az.Y(sh1Var2, 10));
                Iterator it = sh1Var2.e.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((rh1) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                mgVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            mgVar.setFontFeatureSettings(str2);
        }
        if (j83Var != null && !j83Var.equals(j83.c)) {
            mgVar.setTextScaleX(mgVar.getTextScaleX() * j83Var.a);
            mgVar.setTextSkewX(mgVar.getTextSkewX() + j83Var.b);
        }
        mgVar.d(i83Var.a());
        mgVar.c(i83Var.b(), 9205357640488583168L, i83Var.s());
        mgVar.f(uy2Var5.n);
        mgVar.g(uy2Var5.m);
        mgVar.e(uy2Var5.p);
        if (x93.a(w93.b(j5), 4294967296L) && w93.c(j5) != 0.0f) {
            float textScaleX = mgVar.getTextScaleX() * mgVar.getTextSize();
            float fG0 = xb0Var.G0(j5);
            if (textScaleX != 0.0f) {
                mgVar.setLetterSpacing(fG0 / textScaleX);
            }
        } else if (x93.a(w93.b(j5), 8589934592L)) {
            mgVar.setLetterSpacing(w93.c(j5));
        }
        long j6 = uy2Var5.l;
        qq qqVar = uy2Var5.i;
        boolean z4 = z3 && x93.a(w93.b(j5), 4294967296L) && w93.c(j5) != 0.0f;
        long j7 = hz.g;
        boolean z5 = (ye3.a(j6, j7) || ye3.a(j6, hz.f)) ? false : true;
        boolean z6 = (qqVar == null || Float.compare(qqVar.a, 0.0f) == 0) ? false : true;
        uy2 uy2Var6 = (z4 || z5 || z6) ? new uy2(0L, 0L, (jr0) null, (hr0) null, (ir0) null, (l43) null, (String) null, z4 ? j5 : w93.c, z6 ? qqVar : null, (j83) null, (sh1) null, z5 ? j6 : j7, (p63) null, (xt2) null, 63103) : null;
        List list5 = this.c;
        if (uy2Var6 != null) {
            int size9 = list5.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i29 = 0;
            while (i29 < size9) {
                arrayList4.add(i29 == 0 ? new cj(0, this.a.length(), uy2Var6) : (cj) this.c.get(i29 - 1));
                i29++;
            }
            list5 = arrayList4;
        }
        String str3 = this.a;
        float textSize = this.g.getTextSize();
        q93 q93Var2 = this.b;
        List list6 = this.d;
        xb0 xb0Var4 = this.f;
        boolean z7 = this.k;
        me meVar = ne.a;
        if (z7 && wi0.d()) {
            k92 k92Var = q93Var2.c;
            kj0 kj0Var = (k92Var == null || (w82Var2 = k92Var.b) == null) ? null : new kj0(w82Var2.b);
            CharSequence charSequenceG = wi0.a().g(0, str3.length(), (kj0Var != null && kj0Var.a == 2) ? 1 : 0, str3);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!list5.isEmpty() || !list6.isEmpty() || !o51.f(q93Var2.b.d, k83.c) || (q93Var2.b.c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            uy2 uy2Var7 = q93Var2.a;
            p52 p52Var4 = q93Var2.b;
            if (o51.f(uy2Var7.m, p63.c)) {
                spannableString.setSpan(ne.a, 0, str3.length(), 33);
            }
            k92 k92Var2 = q93Var2.c;
            if (((k92Var2 == null || (w82Var = k92Var2.b) == null) ? false : w82Var.a) && p52Var4.f == null) {
                float fW = mh0.W(p52Var4.c, textSize, xb0Var4);
                if (!Float.isNaN(fW)) {
                    spannableString.setSpan(new of1(fW), 0, spannableString.length(), 33);
                }
            } else {
                sf1 sf1Var = p52Var4.f;
                sf1Var = sf1Var == null ? sf1.d : sf1Var;
                float fW2 = mh0.W(p52Var4.c, textSize, xb0Var4);
                if (!Float.isNaN(fW2)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            b81.y("Char sequence is empty.");
                            throw null;
                        }
                        if (spannableString.charAt(spannableString.length() - 1) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i30 = length;
                    int i31 = sf1Var.b;
                    i3 = 0;
                    spannableString.setSpan(new tf1(fW2, i30, (i31 & 1) > 0, (i31 & 16) > 0, sf1Var.a, sf1Var.c), 0, spannableString.length(), 33);
                }
                k83Var = p52Var4.d;
                if (k83Var != null) {
                    i24 = i3;
                    j2 = k83Var.a;
                    j3 = k83Var.b;
                    if ((!w93.a(j2, v63.c(i24)) && w93.a(j3, v63.c(i24))) || (j2 & 1095216660480L) == r13 || (j3 & 1095216660480L) == 0) {
                        p52Var = p52Var4;
                    } else {
                        jB2 = w93.b(j2);
                        p52Var = p52Var4;
                        if (x93.a(jB2, 4294967296L)) {
                            fC = xb0Var4.G0(j2);
                        } else if (x93.a(jB2, 8589934592L)) {
                            fC = w93.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = w93.b(j3);
                        if (x93.a(jB3, 4294967296L)) {
                            fC2 = xb0Var4.G0(j3);
                        } else if (x93.a(jB3, 8589934592L)) {
                            fC2 = w93.c(j3) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                } else {
                    p52Var = p52Var4;
                }
                arrayList = new ArrayList(list5.size());
                size = list5.size();
                for (i4 = 0; i4 < size; i4++) {
                    cjVar4 = (cj) list5.get(i4);
                    obj3 = cjVar4.a;
                    if (obj3 instanceof uy2) {
                        uy2Var4 = (uy2) obj3;
                        if (uy2Var4.f == null || uy2Var4.d != null || uy2Var4.c != null || ((uy2) obj3).e != null) {
                            arrayList.add(cjVar4);
                        }
                    }
                }
                uy2Var = q93Var2.a;
                l43Var = uy2Var.f;
                if (l43Var != null && uy2Var.d == null && uy2Var.c == null && uy2Var.e == null) {
                    uy2Var2 = null;
                } else {
                    uy2Var2 = new uy2(0L, 0L, uy2Var.c, uy2Var.d, uy2Var.e, l43Var, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65475);
                }
                buVar = new bu(10, spannableString, oeVar);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        cj cjVar5 = (cj) arrayList.get(i6);
                        iArr[i6] = cjVar5.b;
                        iArr[i6 + size2] = cjVar5.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        b81.y("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            uy2Var3 = uy2Var2;
                            i11 = i8;
                        } else {
                            size4 = arrayList.size();
                            uy2VarC = uy2Var2;
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                cj cjVar6 = (cj) arrayList.get(i10);
                                uy2 uy2Var8 = uy2Var2;
                                i12 = cjVar6.b;
                                int i32 = i8;
                                i13 = cjVar6.c;
                                if (i12 == i13 && ej.b(i7, i9, i12, i13)) {
                                    uy2 uy2Var9 = (uy2) cjVar6.a;
                                    uy2VarC = uy2VarC != null ? uy2VarC.c(uy2Var9) : uy2Var9;
                                }
                                i10++;
                                arrayList = arrayList5;
                                uy2Var2 = uy2Var8;
                                i8 = i32;
                            }
                            arrayList2 = arrayList;
                            uy2Var3 = uy2Var2;
                            i11 = i8;
                            if (uy2VarC != null) {
                                buVar.invoke(uy2VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        arrayList = arrayList2;
                        uy2Var2 = uy2Var3;
                    }
                } else if (!arrayList.isEmpty()) {
                    uy2 uy2Var10 = (uy2) ((cj) arrayList.get(0)).a;
                    buVar.invoke(uy2Var2 != null ? uy2Var2.c(uy2Var10) : uy2Var10, Integer.valueOf(((cj) arrayList.get(0)).b), Integer.valueOf(((cj) arrayList.get(0)).c));
                }
                size5 = list5.size();
                i14 = 0;
                z = false;
                while (i14 < size5) {
                    cjVar3 = (cj) list5.get(i14);
                    obj2 = cjVar3.a;
                    if (obj2 instanceof uy2) {
                        i22 = cjVar3.b;
                        int i33 = cjVar3.c;
                        if (i22 >= 0 || i22 >= spannableString.length() || i33 <= i22 || i33 > spannableString.length()) {
                            size5 = size5;
                            i21 = i14;
                            list5 = list5;
                            z = z;
                            xb0Var3 = xb0Var4;
                            p52Var2 = p52Var;
                        } else {
                            uy2 uy2Var11 = (uy2) obj2;
                            long j8 = uy2Var11.h;
                            qq qqVar2 = uy2Var11.i;
                            i83 i83Var2 = uy2Var11.a;
                            if (qqVar2 != null) {
                                spannableString.setSpan(new rq(0, qqVar2.a), i22, i33, 33);
                            }
                            i21 = i14;
                            mh0.Z(spannableString, i83Var2.a(), i22, i33);
                            st stVarB = i83Var2.b();
                            float fS = i83Var2.s();
                            if (stVarB != null) {
                                if (stVarB instanceof qy2) {
                                    mh0.Z(spannableString, ((qy2) stVarB).a, i22, i33);
                                } else {
                                    spannableString.setSpan(new vt2((ut2) stVarB, fS), i22, i33, 33);
                                }
                            }
                            p63 p63Var = uy2Var11.m;
                            if (p63Var != null) {
                                int i34 = p63Var.a;
                                q63 q63Var = new q63((i34 | 1) == i34, (i34 | 2) == i34);
                                i23 = 33;
                                spannableString.setSpan(q63Var, i22, i33, 33);
                            } else {
                                i23 = 33;
                            }
                            int i35 = i23;
                            p52Var2 = p52Var;
                            mh0.a0(spannableString, uy2Var11.b, xb0Var4, i22, i33);
                            String str4 = uy2Var11.g;
                            if (str4 != null) {
                                spannableString.setSpan(new oq0(str4, 0), i22, i33, i35);
                            }
                            j83 j83Var2 = uy2Var11.j;
                            if (j83Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(j83Var2.a), i22, i33, i35);
                                spannableString.setSpan(new rq(1, j83Var2.b), i22, i33, i35);
                            }
                            mh0.b0(spannableString, uy2Var11.k, i22, i33);
                            xb0Var3 = xb0Var4;
                            long j9 = uy2Var11.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(xp1.T(j9)), i22, i33, i35);
                            }
                            xt2 xt2Var = uy2Var11.n;
                            if (xt2Var != null) {
                                long j10 = xt2Var.b;
                                int iT = xp1.T(xt2Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = xt2Var.c;
                                zt2 zt2Var = new zt2(fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f, iT);
                                i35 = 33;
                                spannableString.setSpan(zt2Var, i22, i33, 33);
                            }
                            kg0 kg0Var = uy2Var11.p;
                            if (kg0Var != null) {
                                spannableString.setSpan(new lg0(kg0Var), i22, i33, i35);
                            }
                            z = (x93.a(w93.b(j8), 4294967296L) || x93.a(w93.b(j8), 8589934592L)) ? true : z;
                        }
                        z = z;
                    } else {
                        size5 = size5;
                        i21 = i14;
                        list5 = list5;
                        z = z;
                        xb0Var3 = xb0Var4;
                        p52Var2 = p52Var;
                        z = z;
                    }
                    i14 = i21 + 1;
                    list5 = list5;
                    p52Var = p52Var2;
                    xb0Var4 = xb0Var3;
                    size5 = size5;
                }
                list3 = list5;
                xb0Var2 = xb0Var4;
                p52 p52Var5 = p52Var;
                if (z) {
                    size7 = list3.size();
                    i17 = 0;
                    while (i17 < size7) {
                        List list7 = list3;
                        cjVar2 = (cj) list7.get(i17);
                        ziVar = (zi) cjVar2.a;
                        if (ziVar instanceof uy2) {
                            i20 = cjVar2.b;
                            int i36 = cjVar2.c;
                            if (i20 >= 0 || i20 >= spannableString.length() || i36 <= i20 || i36 > spannableString.length()) {
                                i18 = size7;
                                i19 = i17;
                            } else {
                                long j11 = ((uy2) ziVar).h;
                                long jB5 = w93.b(j11);
                                i18 = size7;
                                i19 = i17;
                                Object qe1Var = x93.a(jB5, 4294967296L) ? new qe1(xb0Var2.G0(j11)) : x93.a(jB5, 8589934592L) ? new pe1(w93.c(j11)) : null;
                                if (qe1Var != null) {
                                    spannableString.setSpan(qe1Var, i20, i36, 33);
                                }
                            }
                        } else {
                            i18 = size7;
                            i19 = i17;
                        }
                        i17 = i19 + 1;
                        list3 = list7;
                        size7 = i18;
                    }
                }
                list4 = list3;
                k83Var2 = p52Var5.d;
                if (k83Var2 != null) {
                    j = k83Var2.a;
                    jB = w93.b(j);
                    if (x93.a(jB, 4294967296L)) {
                        xb0Var2.G0(j);
                    } else if (x93.a(jB, 8589934592L)) {
                        w93.c(j);
                    }
                }
                size6 = list4.size();
                for (i15 = 0; i15 < size6; i15++) {
                    Object obj6 = ((cj) list4.get(i15)).a;
                }
                charSequence2 = spannableString;
                if (list6.size() > 0) {
                    cjVar = (cj) list6.get(0);
                    if (cjVar.a == null) {
                        b81.u();
                        throw null;
                    }
                    for (Object obj7 : spannableString.getSpans(cjVar.b, cjVar.c, fe3.class)) {
                        spannableString.removeSpan((fe3) obj7);
                    }
                    throw null;
                }
            }
            i3 = 0;
            k83Var = p52Var4.d;
            if (k83Var != null) {
                i24 = i3;
                j2 = k83Var.a;
                j3 = k83Var.b;
                if (!w93.a(j2, v63.c(i24))) {
                    jB2 = w93.b(j2);
                    p52Var = p52Var4;
                    if (x93.a(jB2, 4294967296L)) {
                        fC = xb0Var4.G0(j2);
                    } else if (x93.a(jB2, 8589934592L)) {
                        fC = w93.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = w93.b(j3);
                    if (x93.a(jB3, 4294967296L)) {
                        fC2 = xb0Var4.G0(j3);
                    } else if (x93.a(jB3, 8589934592L)) {
                        fC2 = w93.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = w93.b(j2);
                    p52Var = p52Var4;
                    if (x93.a(jB2, 4294967296L)) {
                        fC = xb0Var4.G0(j2);
                    } else if (x93.a(jB2, 8589934592L)) {
                        fC = w93.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = w93.b(j3);
                    if (x93.a(jB3, 4294967296L)) {
                        fC2 = xb0Var4.G0(j3);
                    } else if (x93.a(jB3, 8589934592L)) {
                        fC2 = w93.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            } else {
                p52Var = p52Var4;
            }
            arrayList = new ArrayList(list5.size());
            size = list5.size();
            while (i4 < size) {
                cjVar4 = (cj) list5.get(i4);
                obj3 = cjVar4.a;
                if (obj3 instanceof uy2) {
                    uy2Var4 = (uy2) obj3;
                    if (uy2Var4.f == null) {
                        arrayList.add(cjVar4);
                    } else {
                        arrayList.add(cjVar4);
                    }
                }
            }
            uy2Var = q93Var2.a;
            l43Var = uy2Var.f;
            if (l43Var != null) {
                uy2Var2 = new uy2(0L, 0L, uy2Var.c, uy2Var.d, uy2Var.e, l43Var, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65475);
            } else {
                uy2Var2 = new uy2(0L, 0L, uy2Var.c, uy2Var.d, uy2Var.e, l43Var, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65475);
            }
            buVar = new bu(10, spannableString, oeVar);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    cj cjVar7 = (cj) arrayList.get(i6);
                    iArr[i6] = cjVar7.b;
                    iArr[i6 + size2] = cjVar7.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    b81.y("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        uy2Var3 = uy2Var2;
                        i11 = i8;
                    } else {
                        size4 = arrayList.size();
                        uy2VarC = uy2Var2;
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            cj cjVar8 = (cj) arrayList.get(i10);
                            uy2 uy2Var12 = uy2Var2;
                            i12 = cjVar8.b;
                            int i37 = i8;
                            i13 = cjVar8.c;
                            if (i12 == i13) {
                            }
                            i10++;
                            arrayList = arrayList6;
                            uy2Var2 = uy2Var12;
                            i8 = i37;
                        }
                        arrayList2 = arrayList;
                        uy2Var3 = uy2Var2;
                        i11 = i8;
                        if (uy2VarC != null) {
                            buVar.invoke(uy2VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    arrayList = arrayList2;
                    uy2Var2 = uy2Var3;
                }
            } else if (!arrayList.isEmpty()) {
                uy2 uy2Var13 = (uy2) ((cj) arrayList.get(0)).a;
                buVar.invoke(uy2Var2 != null ? uy2Var2.c(uy2Var13) : uy2Var13, Integer.valueOf(((cj) arrayList.get(0)).b), Integer.valueOf(((cj) arrayList.get(0)).c));
            }
            size5 = list5.size();
            i14 = 0;
            z = false;
            while (i14 < size5) {
                cjVar3 = (cj) list5.get(i14);
                obj2 = cjVar3.a;
                if (obj2 instanceof uy2) {
                    i22 = cjVar3.b;
                    int i38 = cjVar3.c;
                    if (i22 >= 0) {
                        size5 = size5;
                        i21 = i14;
                        list5 = list5;
                        z = z;
                        xb0Var3 = xb0Var4;
                        p52Var2 = p52Var;
                        z = z;
                    } else {
                        size5 = size5;
                        i21 = i14;
                        list5 = list5;
                        z = z;
                        xb0Var3 = xb0Var4;
                        p52Var2 = p52Var;
                        z = z;
                    }
                } else {
                    size5 = size5;
                    i21 = i14;
                    list5 = list5;
                    z = z;
                    xb0Var3 = xb0Var4;
                    p52Var2 = p52Var;
                    z = z;
                }
                i14 = i21 + 1;
                list5 = list5;
                p52Var = p52Var2;
                xb0Var4 = xb0Var3;
                size5 = size5;
            }
            list3 = list5;
            xb0Var2 = xb0Var4;
            p52 p52Var6 = p52Var;
            if (z) {
                size7 = list3.size();
                i17 = 0;
                while (i17 < size7) {
                    List list8 = list3;
                    cjVar2 = (cj) list8.get(i17);
                    ziVar = (zi) cjVar2.a;
                    if (ziVar instanceof uy2) {
                        i20 = cjVar2.b;
                        int i39 = cjVar2.c;
                        if (i20 >= 0) {
                            i18 = size7;
                            i19 = i17;
                        } else {
                            i18 = size7;
                            i19 = i17;
                        }
                    } else {
                        i18 = size7;
                        i19 = i17;
                    }
                    i17 = i19 + 1;
                    list3 = list8;
                    size7 = i18;
                }
            }
            list4 = list3;
            k83Var2 = p52Var6.d;
            if (k83Var2 != null) {
                j = k83Var2.a;
                jB = w93.b(j);
                if (x93.a(jB, 4294967296L)) {
                    xb0Var2.G0(j);
                } else if (x93.a(jB, 8589934592L)) {
                    w93.c(j);
                }
            }
            size6 = list4.size();
            while (i15 < size6) {
                Object obj8 = ((cj) list4.get(i15)).a;
            }
            charSequence2 = spannableString;
            if (list6.size() > 0) {
                cjVar = (cj) list6.get(0);
                if (cjVar.a == null) {
                    b81.u();
                    throw null;
                }
                while (i16 < r1) {
                    spannableString.removeSpan((fe3) obj7);
                }
                throw null;
            }
        }
        charSequence2 = charSequence;
        this.h = charSequence2;
        this.i = new va1(charSequence2, this.g, this.l);
    }

    @Override // defpackage.n52
    public final float a() {
        va1 va1Var = this.i;
        float f = va1Var.e;
        TextPaint textPaint = va1Var.b;
        if (!Float.isNaN(f)) {
            return va1Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = va1Var.a;
        lineInstance.setText(new qw(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, xq1.E);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new k41(i, next, 1));
            } else {
                k41 k41Var = (k41) priorityQueue.peek();
                if (k41Var != null && k41Var.f - k41Var.e < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new k41(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                b81.p();
                return 0.0f;
            }
            k41 k41Var2 = (k41) it.next();
            desiredWidth = Layout.getDesiredWidth(va1Var.b(), k41Var2.e, k41Var2.f, textPaint);
            while (it.hasNext()) {
                k41 k41Var3 = (k41) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(va1Var.b(), k41Var3.e, k41Var3.f, textPaint));
            }
        }
        va1Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.n52
    public final boolean b() {
        gn gnVar = this.j;
        if (gnVar != null ? gnVar.w() : false) {
            return true;
        }
        if (!this.k && k22.w(this.b)) {
            t1 t1Var = aj0.a;
            t1 t1Var2 = aj0.a;
            s03 s03VarW = (s03) t1Var2.f;
            if (s03VarW == null) {
                if (wi0.d()) {
                    s03VarW = t1Var2.w();
                    t1Var2.f = s03VarW;
                } else {
                    s03VarW = xq1.D;
                }
            }
            if (((Boolean) s03VarW.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n52
    public final float c() {
        return this.i.c();
    }
}
