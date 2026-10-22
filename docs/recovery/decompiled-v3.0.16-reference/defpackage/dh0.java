package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class dh0 {
    public static x01 a = null;
    public static boolean b = true;
    public static x01 c;
    public static x01 d;
    public static x01 e;
    public static x01 f;

    public static String A(yi2 yi2Var) {
        String strU = u(yi2Var);
        int i = yi2Var.b;
        return m13.O("\n        " + strU + "\n        prior_adj=$(cat /proc/" + i + "/oom_score_adj) || exit 1\n        if [ \"$prior_adj\" -gt -700 ]; then\n            echo -700 > /proc/" + i + "/oom_score_adj || exit 1\n        fi\n        echo \"$prior_adj $(cat /proc/" + i + "/oom_score_adj)\"\n    ");
    }

    public static String B(String str) {
        return az2.k("'", s13.X(str, "'", "'\\''", false), "'");
    }

    public static List C(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void D(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static String E(yi2 yi2Var, int i) {
        if (-1000 > i || i >= 1001) {
            fo.i("Failed requirement.");
            return null;
        }
        String strU = u(yi2Var);
        int i2 = yi2Var.b;
        return m13.O("\n            " + strU + "\n            if [ \"$(cat /proc/" + i2 + "/oom_score_adj)\" = \"-700\" ]; then\n                echo " + i + " > /proc/" + i2 + "/oom_score_adj || exit 1\n            fi\n        ");
    }

    public static void F(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            p1.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            p1.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            G(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            G(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            G(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        G(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void G(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void H(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final String I(Object[] objArr, int i, int i2, j0 j0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == j0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int J(fx1 fx1Var) {
        int iC;
        int i = fx1Var.b;
        int iC2 = fx1Var.c(0);
        while (fx1Var.b != 0 && fx1Var.c(0) == iC2) {
            int i2 = fx1Var.b;
            if (i2 == 0) {
                b81.y("IntList is empty.");
                return 0;
            }
            fx1Var.e(0, fx1Var.a[i2 - 1]);
            fx1Var.d(fx1Var.b - 1);
            int i3 = fx1Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = fx1Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = fx1Var.c(i7);
                if (i6 < i3 && (iC = fx1Var.c(i6)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    fx1Var.e(i5, iC);
                    fx1Var.e(i6, iC3);
                    i5 = i6;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    fx1Var.e(i5, iC4);
                    fx1Var.e(i7, iC3);
                    i5 = i7;
                }
            }
        }
        return iC2;
    }

    public static final void K(int i, int i2, bt2 bt2Var) {
        bt2Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(bt2Var.e(i4));
            }
            i3 >>>= 1;
        }
        String strB = bt2Var.b();
        strB.getClass();
        throw new du1(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null, arrayList, strB);
    }

    public static final long L(long j, fh0 fh0Var) {
        TimeUnit timeUnit = fh0Var.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            c30 c30Var = ah0.f;
            long j2 = jConvert2 << 1;
            int i = ch0.a;
            return j2;
        }
        if (fh0Var.compareTo(fh0.MILLISECONDS) < 0) {
            return n(mh0.w(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return n(gh0.t(Math.abs(j), fh0Var) * jSignum);
    }

    public static final ExtractedText M(f83 f83Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = f83Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = f83Var.b;
        extractedText.selectionStart = f93.f(j);
        extractedText.selectionEnd = f93.e(j);
        extractedText.flags = !l13.d0(f83Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x0734  */
    /* JADX WARN: Code duplicated, block: B:153:0x0738  */
    /* JADX WARN: Code duplicated, block: B:156:0x0749  */
    /* JADX WARN: Code duplicated, block: B:158:0x074f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0756  */
    /* JADX WARN: Code duplicated, block: B:162:0x076a  */
    /* JADX WARN: Code duplicated, block: B:165:0x07da  */
    /* JADX WARN: Code duplicated, block: B:166:0x07de  */
    /* JADX WARN: Code duplicated, block: B:169:0x081a  */
    /* JADX WARN: Code duplicated, block: B:170:0x081e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0837  */
    /* JADX WARN: Code duplicated, block: B:176:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:178:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:182:0x093a  */
    /* JADX WARN: Code duplicated, block: B:185:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:190:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:193:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:194:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:202:0x0aea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:208:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:209:0x0b26  */
    /* JADX WARN: Instruction removed from duplicated block: B:185:0x09b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List list, String str, boolean z, final lu0 lu0Var, au0 au0Var, final lu0 lu0Var2, final lu0 lu0Var3, f30 f30Var, int i) {
        hh0 hh0Var;
        long jC;
        jr0 jr0Var;
        long jC2;
        long j;
        long jC3;
        long jC4;
        c30 c30Var;
        boolean z2;
        boolean z3;
        x30 x30Var;
        gh ghVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        c30 c30Var2;
        x01 x01VarR;
        long jC5;
        long j2;
        String str2;
        String str3;
        jr0 jr0Var2;
        hh0 hh0Var2;
        ov0 ov0Var;
        boolean zF;
        Object objQ;
        c30 c30Var3;
        boolean zF2;
        Object objQ2;
        final int i2;
        iy0 iy0Var = o51.p0;
        pr prVar = j9.j;
        pr prVar2 = j9.f;
        go goVar = am1.e;
        or orVar = j9.p;
        nr nrVar = j9.r;
        list.getClass();
        lu0Var.getClass();
        au0Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1354443156);
        int i3 = i | (ov0Var2.h(list) ? 4 : 2) | (ov0Var2.f(str) ? 32 : 16) | (ov0Var2.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            long jD = xp1.d(4288423856L);
            av1 av1Var = av1.a;
            dv1 dv1VarK = xp1.k(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(16.0f)), z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b), iy0Var);
            hh0 hh0Var3 = mz.a;
            dv1 dv1VarD = zm3.D(ji2.w(dv1VarK, 0.8f, hz.c(z ? 0.12f : 0.06f, ((kz) ov0Var2.j(hh0Var3)).A), cj2.a(16.0f)), 14.0f);
            yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), nrVar, ov0Var2, 6);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            gh ghVar5 = v20.e;
            q73.h(ov0Var2, ghVar5, yzVarA);
            gh ghVar6 = v20.d;
            q73.h(ov0Var2, ghVar6, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar7 = v20.f;
            q73.h(ov0Var2, ghVar7, numValueOf);
            wa waVar2 = v20.g;
            q73.g(ov0Var2, waVar2);
            gh ghVar8 = v20.c;
            q73.h(ov0Var2, ghVar8, dv1VarH);
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(am1.i, orVar, ov0Var2, 54);
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA);
            q73.h(ov0Var2, ghVar6, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH2);
            kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA2);
            q73.h(ov0Var2, ghVar6, l72VarL3);
            az2.s(iHashCode3, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH3);
            av1 av1Var2 = av1Var;
            t01.a(am1.v(), null, iw2.k(av1Var, 18.0f), jD, ov0Var2, 3504, 0);
            s83.b(az2.i(av1Var2, 8.0f, ov0Var2, 2131624665, ov0Var2), null, ((kz) ov0Var2.j(hh0Var3)).q, v63.b(14.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            ov0Var2.p(true);
            dv1 dv1VarE2 = zm3.E(bk.a(xp1.k(xp1.n(av1Var2, cj2.a(8.0f)), hz.c(0.12f, jD), iy0Var), au0Var), 10.0f, 5.0f);
            er1 er1VarC = ws.c(prVar2, false);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarE2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, er1VarC);
            q73.h(ov0Var2, ghVar6, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH4);
            kk2 kk2VarA3 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode5 = Long.hashCode(ov0Var2.T);
            l72 l72VarL5 = ov0Var2.l();
            dv1 dv1VarH5 = xp1.H(ov0Var2, av1Var2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA3);
            q73.h(ov0Var2, ghVar6, l72VarL5);
            az2.s(iHashCode5, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH5);
            pr prVar3 = prVar2;
            t01.a(n51.t(), null, iw2.k(av1Var2, 14.0f), jD, ov0Var2, 3504, 0);
            String strI = az2.i(av1Var2, 3.0f, ov0Var2, 2131623997, ov0Var2);
            long jC6 = v63.c(12);
            jr0 jr0Var3 = jr0.i;
            s83.b(strI, null, jD, jC6, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597824, 0, 262058);
            ov0Var2.p(true);
            ov0Var2.p(true);
            ov0Var2.p(true);
            s83.b(ke0.N(2131624387, ov0Var2), null, hz.c(0.48f, ((kz) ov0Var2.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var2, 24576, 48, 260074);
            boolean z4 = str == null;
            dv1 dv1VarW = ji2.w(xp1.k(xp1.n(iw2.e(av1Var2, 1.0f), cj2.a(10.0f)), z4 ? hz.c(0.08f, jD) : hz.f, iy0Var), 0.8f, z4 ? hz.c(0.35f, jD) : hz.f, cj2.a(10.0f));
            int i4 = i3 & 7168;
            boolean z5 = i4 == 2048;
            Object objQ3 = ov0Var2.Q();
            iy0 iy0Var2 = iy0Var;
            c30 c30Var4 = d30.a;
            if (z5 || objQ3 == c30Var4) {
                objQ3 = new hl1(4, lu0Var);
                ov0Var2.m0(objQ3);
            }
            dv1 dv1VarE3 = zm3.E(bk.a(dv1VarW, (au0) objQ3), 10.0f, 8.0f);
            kk2 kk2VarA4 = jk2.a(goVar, orVar, ov0Var2, 48);
            or orVar2 = orVar;
            go goVar2 = goVar;
            int iHashCode6 = Long.hashCode(ov0Var2.T);
            l72 l72VarL6 = ov0Var2.l();
            dv1 dv1VarH6 = xp1.H(ov0Var2, dv1VarE3);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA4);
            q73.h(ov0Var2, ghVar6, l72VarL6);
            az2.s(iHashCode6, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH6);
            x01 x01VarB = z4 ? ee0.B() : r();
            if (z4) {
                ov0Var2.c0(2033910851);
                ov0Var2.p(false);
                hh0Var = hh0Var3;
                jC = jD;
            } else {
                ov0Var2.c0(2033912499);
                hh0Var = hh0Var3;
                jC = hz.c(0.4f, ((kz) ov0Var2.j(hh0Var)).q);
                ov0Var2.p(false);
            }
            hh0 hh0Var4 = hh0Var;
            c30 c30Var5 = c30Var4;
            long j3 = jD;
            int i5 = i4;
            t01.a(x01VarB, null, iw2.k(av1Var2, 17.0f), jC, ov0Var2, 432, 0);
            String strI2 = az2.i(av1Var2, 8.0f, ov0Var2, 2131624796, ov0Var2);
            long jC7 = v63.c(13);
            if (!z4) {
                jr0Var = jr0.g;
            }
            if (z4) {
                jr0Var = jr0Var3;
                ov0Var2.c0(2033925763);
                ov0Var2.p(false);
                jC2 = j3;
            } else {
                jr0Var = jr0Var3;
                ov0Var2.c0(2033927411);
                jC2 = hz.c(0.8f, ((kz) ov0Var2.j(hh0Var4)).q);
                ov0Var2.p(false);
            }
            s83.b(strI2, null, jC2, jC7, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262058);
            ov0Var2 = ov0Var2;
            ov0Var2.p(true);
            float f2 = 12.0f;
            if (list.isEmpty()) {
                ov0Var2.c0(1900256571);
                dv1 dv1VarF = zm3.F(iw2.e(av1Var2, 1.0f), 0.0f, 12.0f, 1);
                er1 er1VarC2 = ws.c(prVar, false);
                int iHashCode7 = Long.hashCode(ov0Var2.T);
                l72 l72VarL7 = ov0Var2.l();
                dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarF);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar5, er1VarC2);
                q73.h(ov0Var2, ghVar6, l72VarL7);
                az2.s(iHashCode7, ov0Var2, ghVar7, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar8, dv1VarH7);
                s83.b(ke0.N(2131624792, ov0Var2), null, hz.c(0.4f, ((kz) ov0Var2.j(hh0Var4)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                ov0Var2 = ov0Var2;
                ov0Var2.p(true);
                ov0Var2.p(false);
            } else {
                pr prVar4 = prVar;
                ov0Var2.c0(1900913430);
                nr nrVar2 = nrVar;
                yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), nrVar2, ov0Var2, 6);
                int iHashCode8 = Long.hashCode(ov0Var2.T);
                l72 l72VarL8 = ov0Var2.l();
                dv1 dv1VarH8 = xp1.H(ov0Var2, av1Var2);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar5, yzVarA2);
                q73.h(ov0Var2, ghVar6, l72VarL8);
                az2.s(iHashCode8, ov0Var2, ghVar7, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar8, dv1VarH8);
                ov0Var2.c0(8241978);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final ji0 ji0Var = (ji0) it.next();
                    boolean z6 = str != null && str.equalsIgnoreCase(ji0Var.a);
                    dv1 dv1VarN = xp1.n(iw2.e(av1Var2, 1.0f), cj2.a(f2));
                    if (z6) {
                        j = j3;
                        jC3 = hz.c(0.09f, j);
                    } else {
                        j = j3;
                        jC3 = z ? hz.c(0.03f, hz.c) : hz.c(0.02f, hz.b);
                    }
                    dv1 dv1VarK2 = xp1.k(dv1VarN, jC3, iy0Var2);
                    if (z6) {
                        ov0Var2.c0(964744872);
                        ov0Var2.p(false);
                        jC4 = hz.c(0.4f, j);
                    } else {
                        ov0Var2.c0(964747776);
                        jC4 = hz.c(z ? 0.08f : 0.04f, ((kz) ov0Var2.j(mz.a)).A);
                        ov0Var2.p(false);
                    }
                    nr nrVar3 = nrVar2;
                    dv1 dv1VarW2 = ji2.w(dv1VarK2, 0.8f, jC4, cj2.a(f2));
                    int i6 = i5;
                    boolean zF3 = (i6 == 2048) | ov0Var2.f(ji0Var);
                    Object objQ4 = ov0Var2.Q();
                    if (zF3) {
                        c30Var = c30Var5;
                    } else {
                        c30Var = c30Var5;
                        if (objQ4 != c30Var) {
                            z2 = false;
                        }
                        dv1 dv1VarE4 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                        pr prVar5 = prVar3;
                        er1 er1VarC3 = ws.c(prVar5, z2);
                        z3 = z6;
                        int iHashCode9 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL9 = ov0Var2.l();
                        dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarE4);
                        w20.b.getClass();
                        x30Var = v20.b;
                        ov0Var2.g0();
                        Iterator it2 = it;
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        ghVar = v20.e;
                        q73.h(ov0Var2, ghVar, er1VarC3);
                        ghVar2 = v20.d;
                        q73.h(ov0Var2, ghVar2, l72VarL9);
                        Integer numValueOf2 = Integer.valueOf(iHashCode9);
                        ghVar3 = v20.f;
                        q73.h(ov0Var2, ghVar3, numValueOf2);
                        waVar = v20.g;
                        q73.g(ov0Var2, waVar);
                        iy0Var2 = iy0Var2;
                        ghVar4 = v20.c;
                        q73.h(ov0Var2, ghVar4, dv1VarH9);
                        i5 = i6;
                        dv1 dv1VarE5 = iw2.e(av1Var2, 1.0f);
                        prVar3 = prVar5;
                        pr prVar6 = prVar4;
                        c30Var2 = c30Var;
                        go goVar3 = goVar2;
                        or orVar3 = orVar2;
                        kk2 kk2VarA5 = jk2.a(goVar3, orVar3, ov0Var2, 48);
                        int iHashCode10 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL10 = ov0Var2.l();
                        dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE5);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA5);
                        q73.h(ov0Var2, ghVar2, l72VarL10);
                        az2.s(iHashCode10, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH10);
                        if (z3) {
                            x01VarR = ee0.B();
                        } else {
                            x01VarR = r();
                        }
                        x01 x01Var = x01VarR;
                        if (z3) {
                            ov0Var2.c0(-1305247628);
                            ov0Var2.p(false);
                            jC5 = j;
                            j2 = jC5;
                        } else {
                            ov0Var2.c0(-1305245948);
                            jC5 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                            ov0Var2.p(false);
                            j2 = j;
                        }
                        float f3 = f2;
                        long j4 = j2;
                        t01.a(x01Var, null, iw2.k(av1Var2, 17.0f), jC5, ov0Var2, 432, 0);
                        gh0.h(ov0Var2, iw2.o(av1Var2, 8.0f));
                        wb1 wb1Var = new wb1(1.0f, true);
                        yz yzVarA3 = wz.a(am1.g, nrVar3, ov0Var2, 0);
                        int iHashCode11 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL11 = ov0Var2.l();
                        dv1 dv1VarH11 = xp1.H(ov0Var2, wb1Var);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, yzVarA3);
                        q73.h(ov0Var2, ghVar2, l72VarL11);
                        az2.s(iHashCode11, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH11);
                        kk2 kk2VarA6 = jk2.a(new jo(6.0f, true, new fo(0)), orVar3, ov0Var2, 54);
                        int iHashCode12 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL12 = ov0Var2.l();
                        dv1 dv1VarH12 = xp1.H(ov0Var2, av1Var2);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA6);
                        q73.h(ov0Var2, ghVar2, l72VarL12);
                        az2.s(iHashCode12, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH12);
                        str2 = ji0Var.b;
                        str3 = ji0Var.c;
                        if (l13.k0(str2)) {
                            str2 = "<Unknown Device>";
                        }
                        long jB = v63.b(13.5d);
                        jr0Var2 = jr0.j;
                        hh0Var2 = mz.a;
                        orVar2 = orVar3;
                        ov0 ov0Var3 = ov0Var2;
                        s83.b(str2, null, ((kz) ov0Var2.j(hh0Var2)).q, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                        ov0Var = ov0Var3;
                        if (z3) {
                            ov0Var.c0(1399077156);
                            dv1 dv1VarN2 = xp1.n(av1Var2, cj2.a(4.0f));
                            long j5 = bk.g;
                            dv1 dv1VarE6 = zm3.E(xp1.l(dv1VarN2, hz.c(0.15f, j5)), 5.0f, 1.0f);
                            er1 er1VarC4 = ws.c(prVar3, false);
                            int iHashCode13 = Long.hashCode(ks.U(ov0Var));
                            l72 l72VarZ = ov0Var.z();
                            dv1 dv1VarH13 = xp1.H(ov0Var, dv1VarE6);
                            ov0Var.g0();
                            if (ov0Var.D()) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, er1VarC4);
                            q73.h(ov0Var, ghVar2, l72VarZ);
                            az2.s(iHashCode13, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH13);
                            prVar3 = prVar3;
                            s83.b(ke0.N(2131624386, ov0Var), null, j5, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                            ov0Var = ov0Var;
                            ov0Var.r();
                        } else {
                            ov0Var.c0(1390456304);
                        }
                        ov0Var.s();
                        ov0Var.r();
                        av1Var2 = av1Var2;
                        gh0.h(ov0Var, iw2.g(av1Var2, 3.0f));
                        ov0 ov0Var4 = ov0Var;
                        s83.b(ji0Var.a + "  •  " + ji0Var.d + " dBm", null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                        ov0Var2 = ov0Var4;
                        if (l13.k0(str3)) {
                            ov0Var2.c0(-1809602804);
                        } else {
                            ov0Var2.c0(-1799626570);
                            s83.b("Hex: " + str3, null, hz.c(0.38f, ((kz) ov0Var2.j(hh0Var2)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var2, 24576, 24576, 245738);
                            ov0Var2 = ov0Var2;
                        }
                        ov0Var2.s();
                        ov0Var2.r();
                        dv1 dv1VarK3 = iw2.k(av1Var2, 28.0f);
                        bj2 bj2Var = cj2.a;
                        dv1 dv1VarL = xp1.l(xp1.n(dv1VarK3, bj2Var), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var2)).q));
                        zF = ov0Var2.f(ji0Var);
                        objQ = ov0Var2.Q();
                        if (zF) {
                            c30Var3 = c30Var2;
                        } else {
                            c30Var3 = c30Var2;
                            if (objQ == c30Var3) {
                            }
                            dv1 dv1VarA = bk.a(dv1VarL, (au0) objQ);
                            er1 er1VarC5 = ws.c(prVar6, false);
                            int iHashCode14 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ2 = ov0Var2.z();
                            dv1 dv1VarH14 = xp1.H(ov0Var2, dv1VarA);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC5);
                            q73.h(ov0Var2, ghVar2, l72VarZ2);
                            az2.s(iHashCode14, ov0Var2, ghVar3, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar4, dv1VarH14);
                            c30 c30Var6 = c30Var3;
                            t01.a(vd0.w(), null, iw2.k(av1Var2, 13.0f), j4, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            gh0.h(ov0Var2, iw2.o(av1Var2, 6.0f));
                            dv1 dv1VarL2 = xp1.l(xp1.n(iw2.k(av1Var2, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ji0Var);
                            objQ2 = ov0Var2.Q();
                            if (!zF2 || objQ2 == c30Var6) {
                                i2 = 2;
                                objQ2 = new au0() { // from class: rn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i7 = i2;
                                        mf3 mf3Var = mf3.a;
                                        ji0 ji0Var2 = ji0Var;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i7) {
                                            case 0:
                                                lu0Var4.invoke(ji0Var2.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ji0Var2);
                                                break;
                                            default:
                                                lu0Var4.invoke(ji0Var2.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i2 = 2;
                            }
                            dv1 dv1VarA2 = bk.a(dv1VarL2, (au0) objQ2);
                            er1 er1VarC6 = ws.c(prVar6, false);
                            int iHashCode15 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ3 = ov0Var2.z();
                            dv1 dv1VarH15 = xp1.H(ov0Var2, dv1VarA2);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC6);
                            q73.h(ov0Var2, ghVar2, l72VarZ3);
                            az2.s(iHashCode15, ov0Var2, ghVar3, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar4, dv1VarH15);
                            t01.a(ji2.F(), null, iw2.k(av1Var2, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            c30Var5 = c30Var6;
                            prVar4 = prVar6;
                            j3 = j4;
                            f2 = f3;
                            it = it2;
                            nrVar2 = nrVar3;
                            goVar2 = goVar3;
                        }
                        final int i7 = 1;
                        objQ = new au0() { // from class: rn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i8 = i7;
                                mf3 mf3Var = mf3.a;
                                ji0 ji0Var2 = ji0Var;
                                lu0 lu0Var4 = lu0Var2;
                                switch (i8) {
                                    case 0:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ji0Var2);
                                        break;
                                    default:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ);
                        dv1 dv1VarA3 = bk.a(dv1VarL, (au0) objQ);
                        er1 er1VarC7 = ws.c(prVar6, false);
                        int iHashCode16 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ4 = ov0Var2.z();
                        dv1 dv1VarH16 = xp1.H(ov0Var2, dv1VarA3);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC7);
                        q73.h(ov0Var2, ghVar2, l72VarZ4);
                        az2.s(iHashCode16, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH16);
                        c30 c30Var7 = c30Var3;
                        t01.a(vd0.w(), null, iw2.k(av1Var2, 13.0f), j4, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        gh0.h(ov0Var2, iw2.o(av1Var2, 6.0f));
                        dv1 dv1VarL3 = xp1.l(xp1.n(iw2.k(av1Var2, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ji0Var);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i2 = 2;
                            objQ2 = new au0() { // from class: rn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i8 = i2;
                                    mf3 mf3Var = mf3.a;
                                    ji0 ji0Var2 = ji0Var;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i8) {
                                        case 0:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ji0Var2);
                                            break;
                                        default:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i2 = 2;
                            objQ2 = new au0() { // from class: rn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i8 = i2;
                                    mf3 mf3Var = mf3.a;
                                    ji0 ji0Var2 = ji0Var;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i8) {
                                        case 0:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ji0Var2);
                                            break;
                                        default:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA4 = bk.a(dv1VarL3, (au0) objQ2);
                        er1 er1VarC8 = ws.c(prVar6, false);
                        int iHashCode17 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ5 = ov0Var2.z();
                        dv1 dv1VarH17 = xp1.H(ov0Var2, dv1VarA4);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC8);
                        q73.h(ov0Var2, ghVar2, l72VarZ5);
                        az2.s(iHashCode17, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH17);
                        t01.a(ji2.F(), null, iw2.k(av1Var2, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        c30Var5 = c30Var7;
                        prVar4 = prVar6;
                        j3 = j4;
                        f2 = f3;
                        it = it2;
                        nrVar2 = nrVar3;
                        goVar2 = goVar3;
                    }
                    z2 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objQ4 = new au0() { // from class: rn1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i8 = objArr;
                            mf3 mf3Var = mf3.a;
                            ji0 ji0Var2 = ji0Var;
                            lu0 lu0Var4 = lu0Var;
                            switch (i8) {
                                case 0:
                                    lu0Var4.invoke(ji0Var2.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(ji0Var2);
                                    break;
                                default:
                                    lu0Var4.invoke(ji0Var2.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ4);
                    dv1 dv1VarE7 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                    pr prVar7 = prVar3;
                    er1 er1VarC9 = ws.c(prVar7, z2);
                    z3 = z6;
                    int iHashCode18 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL13 = ov0Var2.l();
                    dv1 dv1VarH18 = xp1.H(ov0Var2, dv1VarE7);
                    w20.b.getClass();
                    x30Var = v20.b;
                    ov0Var2.g0();
                    Iterator it3 = it;
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, er1VarC9);
                    ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarL13);
                    Integer numValueOf3 = Integer.valueOf(iHashCode18);
                    ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf3);
                    waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    iy0Var2 = iy0Var2;
                    ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH18);
                    i5 = i6;
                    dv1 dv1VarE8 = iw2.e(av1Var2, 1.0f);
                    prVar3 = prVar7;
                    pr prVar8 = prVar4;
                    c30Var2 = c30Var;
                    go goVar4 = goVar2;
                    or orVar4 = orVar2;
                    kk2 kk2VarA7 = jk2.a(goVar4, orVar4, ov0Var2, 48);
                    int iHashCode19 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL14 = ov0Var2.l();
                    dv1 dv1VarH19 = xp1.H(ov0Var2, dv1VarE8);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA7);
                    q73.h(ov0Var2, ghVar2, l72VarL14);
                    az2.s(iHashCode19, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH19);
                    if (z3) {
                        x01VarR = ee0.B();
                    } else {
                        x01VarR = r();
                    }
                    x01 x01Var2 = x01VarR;
                    if (z3) {
                        ov0Var2.c0(-1305247628);
                        ov0Var2.p(false);
                        jC5 = j;
                        j2 = jC5;
                    } else {
                        ov0Var2.c0(-1305245948);
                        jC5 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                        ov0Var2.p(false);
                        j2 = j;
                    }
                    float f4 = f2;
                    long j6 = j2;
                    t01.a(x01Var2, null, iw2.k(av1Var2, 17.0f), jC5, ov0Var2, 432, 0);
                    gh0.h(ov0Var2, iw2.o(av1Var2, 8.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA4 = wz.a(am1.g, nrVar3, ov0Var2, 0);
                    int iHashCode110 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL15 = ov0Var2.l();
                    dv1 dv1VarH110 = xp1.H(ov0Var2, wb1Var2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, yzVarA4);
                    q73.h(ov0Var2, ghVar2, l72VarL15);
                    az2.s(iHashCode110, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH110);
                    kk2 kk2VarA8 = jk2.a(new jo(6.0f, true, new fo(0)), orVar4, ov0Var2, 54);
                    int iHashCode111 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL16 = ov0Var2.l();
                    dv1 dv1VarH111 = xp1.H(ov0Var2, av1Var2);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA8);
                    q73.h(ov0Var2, ghVar2, l72VarL16);
                    az2.s(iHashCode111, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH111);
                    str2 = ji0Var.b;
                    str3 = ji0Var.c;
                    if (l13.k0(str2)) {
                        str2 = "<Unknown Device>";
                    }
                    long jB2 = v63.b(13.5d);
                    jr0Var2 = jr0.j;
                    hh0Var2 = mz.a;
                    orVar2 = orVar4;
                    ov0 ov0Var5 = ov0Var2;
                    s83.b(str2, null, ((kz) ov0Var2.j(hh0Var2)).q, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                    ov0Var = ov0Var5;
                    if (z3) {
                        ov0Var.c0(1399077156);
                        dv1 dv1VarN3 = xp1.n(av1Var2, cj2.a(4.0f));
                        long j7 = bk.g;
                        dv1 dv1VarE9 = zm3.E(xp1.l(dv1VarN3, hz.c(0.15f, j7)), 5.0f, 1.0f);
                        er1 er1VarC10 = ws.c(prVar3, false);
                        int iHashCode112 = Long.hashCode(ks.U(ov0Var));
                        l72 l72VarZ6 = ov0Var.z();
                        dv1 dv1VarH112 = xp1.H(ov0Var, dv1VarE9);
                        ov0Var.g0();
                        if (ov0Var.D()) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC10);
                        q73.h(ov0Var, ghVar2, l72VarZ6);
                        az2.s(iHashCode112, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH112);
                        prVar3 = prVar3;
                        s83.b(ke0.N(2131624386, ov0Var), null, j7, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                        ov0Var = ov0Var;
                        ov0Var.r();
                    } else {
                        ov0Var.c0(1390456304);
                    }
                    ov0Var.s();
                    ov0Var.r();
                    av1Var2 = av1Var2;
                    gh0.h(ov0Var, iw2.g(av1Var2, 3.0f));
                    ov0 ov0Var6 = ov0Var;
                    s83.b(ji0Var.a + "  •  " + ji0Var.d + " dBm", null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                    ov0Var2 = ov0Var6;
                    if (l13.k0(str3)) {
                        ov0Var2.c0(-1799626570);
                        s83.b("Hex: " + str3, null, hz.c(0.38f, ((kz) ov0Var2.j(hh0Var2)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var2, 24576, 24576, 245738);
                        ov0Var2 = ov0Var2;
                    } else {
                        ov0Var2.c0(-1809602804);
                    }
                    ov0Var2.s();
                    ov0Var2.r();
                    dv1 dv1VarK4 = iw2.k(av1Var2, 28.0f);
                    bj2 bj2Var2 = cj2.a;
                    dv1 dv1VarL4 = xp1.l(xp1.n(dv1VarK4, bj2Var2), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var2)).q));
                    zF = ov0Var2.f(ji0Var);
                    objQ = ov0Var2.Q();
                    if (zF) {
                        c30Var3 = c30Var2;
                        if (objQ == c30Var3) {
                        }
                        dv1 dv1VarA5 = bk.a(dv1VarL4, (au0) objQ);
                        er1 er1VarC11 = ws.c(prVar8, false);
                        int iHashCode113 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ7 = ov0Var2.z();
                        dv1 dv1VarH113 = xp1.H(ov0Var2, dv1VarA5);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC11);
                        q73.h(ov0Var2, ghVar2, l72VarZ7);
                        az2.s(iHashCode113, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH113);
                        c30 c30Var8 = c30Var3;
                        t01.a(vd0.w(), null, iw2.k(av1Var2, 13.0f), j6, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        gh0.h(ov0Var2, iw2.o(av1Var2, 6.0f));
                        dv1 dv1VarL5 = xp1.l(xp1.n(iw2.k(av1Var2, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ji0Var);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i2 = 2;
                            objQ2 = new au0() { // from class: rn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i8 = i2;
                                    mf3 mf3Var = mf3.a;
                                    ji0 ji0Var2 = ji0Var;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i8) {
                                        case 0:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ji0Var2);
                                            break;
                                        default:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i2 = 2;
                            objQ2 = new au0() { // from class: rn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i8 = i2;
                                    mf3 mf3Var = mf3.a;
                                    ji0 ji0Var2 = ji0Var;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i8) {
                                        case 0:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ji0Var2);
                                            break;
                                        default:
                                            lu0Var4.invoke(ji0Var2.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA6 = bk.a(dv1VarL5, (au0) objQ2);
                        er1 er1VarC12 = ws.c(prVar8, false);
                        int iHashCode114 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ8 = ov0Var2.z();
                        dv1 dv1VarH114 = xp1.H(ov0Var2, dv1VarA6);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC12);
                        q73.h(ov0Var2, ghVar2, l72VarZ8);
                        az2.s(iHashCode114, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH114);
                        t01.a(ji2.F(), null, iw2.k(av1Var2, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        c30Var5 = c30Var8;
                        prVar4 = prVar8;
                        j3 = j6;
                        f2 = f4;
                        it = it3;
                        nrVar2 = nrVar3;
                        goVar2 = goVar4;
                    } else {
                        c30Var3 = c30Var2;
                    }
                    final int i8 = 1;
                    objQ = new au0() { // from class: rn1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i9 = i8;
                            mf3 mf3Var = mf3.a;
                            ji0 ji0Var2 = ji0Var;
                            lu0 lu0Var4 = lu0Var2;
                            switch (i9) {
                                case 0:
                                    lu0Var4.invoke(ji0Var2.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(ji0Var2);
                                    break;
                                default:
                                    lu0Var4.invoke(ji0Var2.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ);
                    dv1 dv1VarA7 = bk.a(dv1VarL4, (au0) objQ);
                    er1 er1VarC13 = ws.c(prVar8, false);
                    int iHashCode115 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ9 = ov0Var2.z();
                    dv1 dv1VarH115 = xp1.H(ov0Var2, dv1VarA7);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC13);
                    q73.h(ov0Var2, ghVar2, l72VarZ9);
                    az2.s(iHashCode115, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH115);
                    c30 c30Var9 = c30Var3;
                    t01.a(vd0.w(), null, iw2.k(av1Var2, 13.0f), j6, ov0Var2, 3504, 0);
                    ov0Var2.r();
                    gh0.h(ov0Var2, iw2.o(av1Var2, 6.0f));
                    dv1 dv1VarL6 = xp1.l(xp1.n(iw2.k(av1Var2, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                    zF2 = ov0Var2.f(ji0Var);
                    objQ2 = ov0Var2.Q();
                    if (zF2) {
                        i2 = 2;
                        objQ2 = new au0() { // from class: rn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i9 = i2;
                                mf3 mf3Var = mf3.a;
                                ji0 ji0Var2 = ji0Var;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i9) {
                                    case 0:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ji0Var2);
                                        break;
                                    default:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    } else {
                        i2 = 2;
                        objQ2 = new au0() { // from class: rn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i9 = i2;
                                mf3 mf3Var = mf3.a;
                                ji0 ji0Var2 = ji0Var;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i9) {
                                    case 0:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ji0Var2);
                                        break;
                                    default:
                                        lu0Var4.invoke(ji0Var2.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    }
                    dv1 dv1VarA8 = bk.a(dv1VarL6, (au0) objQ2);
                    er1 er1VarC14 = ws.c(prVar8, false);
                    int iHashCode116 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ10 = ov0Var2.z();
                    dv1 dv1VarH116 = xp1.H(ov0Var2, dv1VarA8);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC14);
                    q73.h(ov0Var2, ghVar2, l72VarZ10);
                    az2.s(iHashCode116, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH116);
                    t01.a(ji2.F(), null, iw2.k(av1Var2, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                    ov0Var2.r();
                    ov0Var2.r();
                    ov0Var2.r();
                    c30Var5 = c30Var9;
                    prVar4 = prVar8;
                    j3 = j6;
                    f2 = f4;
                    it = it3;
                    nrVar2 = nrVar3;
                    goVar2 = goVar4;
                }
                ov0Var2.s();
                ov0Var2.r();
                ov0Var2.s();
            }
            ov0Var2.r();
        } else {
            ov0Var2.W();
        }
        ee2 ee2VarT = ov0Var2.t();
        if (ee2VarT != null) {
            ee2VarT.e(new sn1(list, str, z, lu0Var, au0Var, lu0Var2, lu0Var3, i, 0));
        }
    }

    public static le b(String str, q93 q93Var, long j, xb0 xb0Var, lq0 lq0Var, int i, int i2) {
        uj0 uj0Var = uj0.e;
        return new le(new pe(str, q93Var, uj0Var, uj0Var, lq0Var, xb0Var), i, 1, j);
    }

    public static final void c(List list, au0 au0Var, lu0 lu0Var, lu0 lu0Var2, f30 f30Var, int i) {
        au0 au0Var2;
        list.getClass();
        au0Var.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-591485409);
        int i2 = (ov0Var.h(list) ? 4 : 2) | i | (ov0Var.h(au0Var) ? 32 : 16) | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            au0Var2 = au0Var;
            sb.F(au0Var2, new qc0(3), sb.a0(740343016, new am2(list, lu0Var, lu0Var2, au0Var), ov0Var), ov0Var, ((i2 >> 3) & 14) | 432, 0);
        } else {
            au0Var2 = au0Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new am2(list, au0Var2, lu0Var, lu0Var2, i);
        }
    }

    public static final void d(dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1854833411);
        int i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = lc.i;
                ov0Var.m0(objQ);
            }
            er1 er1Var = (er1) objQ;
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1Var);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            p10Var.invoke(ov0Var, 6);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new cq2(dv1Var, p10Var, i, i3);
        }
    }

    public static final void e(ld1 ld1Var, Object obj, int i, Object obj2, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1439843069);
        int i3 = (ov0Var.f(ld1Var) ? 4 : 2) | i2 | (ov0Var.f(obj) ? 32 : 16) | (ov0Var.d(i) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(obj2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ((ql2) obj).e(obj2, sb.a0(980966366, new nc1(i, ld1Var, obj2), ov0Var), ov0Var, 48);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(ld1Var, obj, i, obj2, i2);
        }
    }

    public static final void f(final AppState appState, final boolean z, au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final au0 au0Var5, final au0 au0Var6, final au0 au0Var7, final lu0 lu0Var, final lu0 lu0Var2, final lu0 lu0Var3, f30 f30Var, final int i) {
        int i2;
        au0 au0Var8;
        au0 au0Var9;
        au0 au0Var10;
        au0 au0Var11;
        au0 au0Var12;
        final au0 au0Var13 = au0Var;
        appState.getClass();
        au0Var13.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        au0Var5.getClass();
        au0Var6.getClass();
        au0Var7.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(323563208);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var13) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            au0Var8 = au0Var3;
            i2 |= ov0Var.h(au0Var8) ? 16384 : 8192;
        } else {
            au0Var8 = au0Var3;
        }
        if ((196608 & i) == 0) {
            au0Var9 = au0Var4;
            i2 |= ov0Var.h(au0Var9) ? 131072 : 65536;
        } else {
            au0Var9 = au0Var4;
        }
        if ((1572864 & i) == 0) {
            au0Var10 = au0Var5;
            i2 |= ov0Var.h(au0Var10) ? 1048576 : 524288;
        } else {
            au0Var10 = au0Var5;
        }
        if ((12582912 & i) == 0) {
            au0Var11 = au0Var6;
            i2 |= ov0Var.h(au0Var11) ? 8388608 : 4194304;
        } else {
            au0Var11 = au0Var6;
        }
        if ((100663296 & i) == 0) {
            au0Var12 = au0Var7;
            i2 |= ov0Var.h(au0Var12) ? 67108864 : 33554432;
        } else {
            au0Var12 = au0Var7;
        }
        if ((i & 805306368) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (ov0Var.T(i3 & 1, ((i3 & 306783379) == 306783378 && (((ov0Var.h(lu0Var2) ? (char) 4 : (char) 2) | (ov0Var.h(lu0Var3) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            qc0 qc0Var = new qc0(231, false, false);
            final au0 au0Var14 = au0Var8;
            final au0 au0Var15 = au0Var9;
            final au0 au0Var16 = au0Var10;
            final au0 au0Var17 = au0Var11;
            final au0 au0Var18 = au0Var12;
            pu0 pu0Var = new pu0() { // from class: p03
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e33.a(ji2.H(iw2.e(av1.a, 0.92f)), cj2.a(16.0f), z ? bk.b : bk.e, 0L, 0.0f, 0.0f, null, sb.a0(-39868755, new fj2(appState, lu0Var, lu0Var2, lu0Var3, au0Var14, au0Var15, au0Var16, au0Var17, au0Var18, au0Var13, au0Var2), ov0Var2), ov0Var2, 12582912, 120);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            };
            au0Var13 = au0Var13;
            sb.H(au0Var13, qc0Var, sb.a0(-1373590958, pu0Var, ov0Var), ov0Var, ((i3 >> 6) & 14) | 432);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: q03
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    dh0.f(appState, z, au0Var13, au0Var2, au0Var3, au0Var4, au0Var5, au0Var6, au0Var7, lu0Var, lu0Var2, lu0Var3, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void g(fx1 fx1Var, int i) {
        if (fx1Var.b == 0 || !(fx1Var.c(0) == i || fx1Var.c(fx1Var.b - 1) == i)) {
            int i2 = fx1Var.b;
            fx1Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = fx1Var.c(i3);
                if (i <= iC) {
                    break;
                }
                fx1Var.e(i2, iC);
                i2 = i3;
            }
            fx1Var.e(i2, i);
        }
    }

    public static final long h(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : mh0.w(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final Context i(kn2 kn2Var) throws cu1 {
        kn2Var.getClass();
        try {
            return (Context) kn2Var.a(xe2.a(Context.class), null);
        } catch (Exception unused) {
            throw new cu1("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static void j(StringBuilder sb, Object obj, lu0 lu0Var) {
        if (lu0Var != null) {
            sb.append((CharSequence) lu0Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final x53 k(kb0 kb0Var) {
        j63 j63Var;
        v53 v53Var = new v53();
        q73.i(kb0Var, z53.a, new ge2(new ge2(v53Var, 19), new l(1, v53Var, v53.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 25)));
        sx1 sx1Var = new sx1();
        sx1 sx1Var2 = v53Var.a;
        Object[] objArr = sx1Var2.a;
        int i = sx1Var2.b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        w53 w53Var = null;
        while (true) {
            j63Var = j63.b;
            if (i3 >= i) {
                break;
            }
            w53 w53Var2 = (w53) objArr[i3];
            if (!z || w53Var2 != j63Var) {
                if (w53Var2 == j63Var && w53Var == j63Var) {
                    z = false;
                } else {
                    if (w53Var2 != j63Var) {
                        sx1 sx1Var3 = v53Var.b;
                        Object[] objArr2 = sx1Var3.a;
                        int i4 = sx1Var3.b;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (((Boolean) ((lu0) objArr2[i5]).invoke(w53Var2)).booleanValue()) {
                                    i5++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    sx1Var.a(w53Var2);
                    z = false;
                    w53Var = w53Var2;
                }
            }
            i3++;
        }
        if (((w53) (sx1Var.h() ? null : sx1Var.a[sx1Var.b - 1])) == j63Var) {
            sx1Var.k(sx1Var.b - 1);
        }
        qx1 qx1Var = sx1Var.c;
        if (qx1Var == null) {
            qx1Var = new qx1(sx1Var, i2);
            sx1Var.c = qx1Var;
        }
        return new x53(qx1Var);
    }

    public static hj3 l(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (hj3) objNewInstance;
            } catch (IllegalAccessException e2) {
                b81.m("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                b81.m("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            b81.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final void m(jg0 jg0Var, kw0 kw0Var) {
        boolean z;
        float f2;
        vv vvVarI = jg0Var.X().i();
        kw0 kw0Var2 = (kw0) jg0Var.X().b;
        mw0 mw0Var = kw0Var.a;
        if (kw0Var.s) {
            return;
        }
        kw0Var.a();
        if (!mw0Var.O()) {
            try {
                kw0Var.a.G(kw0Var.b, kw0Var.c, kw0Var, kw0Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = mw0Var.N() > 0.0f;
        if (z2) {
            vvVarI.r();
        }
        Canvas canvasA = ha.a(vvVarI);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = kw0Var.t;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            long j2 = kw0Var.u;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = ((int) (j2 & 4294967295L)) + f4;
            float fS = mw0Var.s();
            rr rrVarH = mw0Var.H();
            int iQ = mw0Var.Q();
            if (fS < 1.0f || iQ != 3 || rrVarH != null || mw0Var.E() == 1) {
                je jeVarN = kw0Var.p;
                if (jeVarN == null) {
                    jeVarN = xq1.n();
                    kw0Var.p = jeVarN;
                }
                jeVarN.e(fS);
                jeVarN.f(iQ);
                jeVarN.h(rrVarH);
                canvasA = canvasA;
                f2 = f3;
                canvasA.saveLayer(f2, f4, f5, f6, (Paint) jeVarN.c);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f2 = f3;
            }
            canvasA.translate(f2, f4);
            canvasA.concat(mw0Var.K());
        }
        boolean z3 = !zIsHardwareAccelerated && kw0Var.w;
        if (z3) {
            vvVarI.l();
            vd0 vd0VarD = kw0Var.d();
            if (vd0VarD instanceof a42) {
                vv.k(vvVarI, ((a42) vd0VarD).i);
            } else if (vd0VarD instanceof b42) {
                re reVarA = kw0Var.m;
                if (reVarA != null) {
                    reVarA.h();
                } else {
                    reVarA = ue.a();
                    kw0Var.m = reVarA;
                }
                re.c(reVarA, ((b42) vd0VarD).i);
                vvVarI.s(reVarA);
            } else {
                if (!(vd0VarD instanceof z32)) {
                    b81.d();
                    return;
                }
                vvVarI.s(((z32) vd0VarD).i);
            }
        }
        if (kw0Var2 != null) {
            ax axVar = kw0Var2.r;
            if (!axVar.a) {
                o21.a("Only add dependencies during a tracking");
            }
            ay1 ay1Var = (ay1) axVar.d;
            if (ay1Var != null) {
                ay1Var.a(kw0Var);
            } else if (((kw0) axVar.b) != null) {
                ay1 ay1Var2 = in2.a;
                ay1 ay1Var3 = new ay1();
                kw0 kw0Var3 = (kw0) axVar.b;
                kw0Var3.getClass();
                ay1Var3.a(kw0Var3);
                ay1Var3.a(kw0Var);
                axVar.d = ay1Var3;
                axVar.b = null;
            } else {
                axVar.b = kw0Var;
            }
            ay1 ay1Var4 = (ay1) axVar.e;
            if (ay1Var4 != null) {
                z = !ay1Var4.l(kw0Var);
            } else if (((kw0) axVar.c) != kw0Var) {
                z = true;
            } else {
                axVar.c = null;
                z = false;
            }
            if (z) {
                kw0Var.q++;
            }
        }
        if (((ga) vvVarI).a.isHardwareAccelerated()) {
            mw0Var.D(vvVarI);
        } else {
            xv xvVar = kw0Var.o;
            if (xvVar == null) {
                xvVar = new xv();
                kw0Var.o = xvVar;
            }
            gn gnVar = xvVar.f;
            xb0 xb0Var = kw0Var.b;
            qa1 qa1Var = kw0Var.c;
            long J = mc0.J(kw0Var.u);
            xb0 xb0VarL = gnVar.l();
            qa1 qa1VarQ = gnVar.q();
            vv vvVarI2 = gnVar.i();
            long jR = gnVar.r();
            kw0 kw0Var4 = (kw0) gnVar.b;
            gnVar.D(xb0Var);
            gnVar.E(qa1Var);
            gnVar.C(vvVarI);
            gnVar.F(J);
            gnVar.b = kw0Var;
            vvVarI.l();
            try {
                kw0Var.c(xvVar);
                vvVarI.i();
                gnVar.D(xb0VarL);
                gnVar.E(qa1VarQ);
                gnVar.C(vvVarI2);
                gnVar.F(jR);
                gnVar.b = kw0Var4;
            } catch (Throwable th) {
                vvVarI.i();
                gnVar.D(xb0VarL);
                gnVar.E(qa1VarQ);
                gnVar.C(vvVarI2);
                gnVar.F(jR);
                gnVar.b = kw0Var4;
                throw th;
            }
        }
        if (z3) {
            vvVarI.i();
        }
        if (z2) {
            vvVarI.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public static final long n(long j) {
        long j2 = (j << 1) + 1;
        ah0.f.getClass();
        int i = ch0.a;
        return j2;
    }

    public static final vq1 o(Matcher matcher, int i, String str) {
        if (matcher.find(i)) {
            return new vq1(matcher, str);
        }
        return null;
    }

    public static kz p(f30 f30Var) {
        return (kz) ((ov0) f30Var).j(mz.a);
    }

    public static final x01 q() {
        x01 x01Var = c;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(11.99f, 2.0f);
        nx0VarI.f(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nx0VarI.o(4.47f, 10.0f, 9.99f, 10.0f);
        nx0VarI.f(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        nx0VarI.n(17.52f, 2.0f, 11.99f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(18.92f, 8.0f);
        nx0VarI.i(-2.95f);
        nx0VarI.g(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
        nx0VarI.g(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 4.04f);
        nx0VarI.g(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
        nx0VarI.i(-3.82f);
        nx0VarI.g(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
        nx0VarI.e();
        nx0VarI.m(4.26f, 14.0f);
        nx0VarI.f(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        nx0VarI.o(0.1f, -1.36f, 0.26f, -2.0f);
        nx0VarI.i(3.38f);
        nx0VarI.g(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
        nx0VarI.o(0.06f, 1.34f, 0.14f, 2.0f);
        nx0VarI.k(4.26f, 14.0f);
        nx0VarI.e();
        nx0VarI.m(5.08f, 16.0f);
        nx0VarI.i(2.95f);
        nx0VarI.g(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
        nx0VarI.g(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
        nx0VarI.e();
        nx0VarI.m(8.03f, 8.0f);
        nx0VarI.k(5.08f, 8.0f);
        nx0VarI.g(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
        nx0VarI.f(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 19.96f);
        nx0VarI.g(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
        nx0VarI.i(3.82f);
        nx0VarI.g(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
        nx0VarI.e();
        nx0VarI.m(14.34f, 14.0f);
        nx0VarI.k(9.66f, 14.0f);
        nx0VarI.g(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
        nx0VarI.o(0.07f, -1.35f, 0.16f, -2.0f);
        nx0VarI.i(4.68f);
        nx0VarI.g(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
        nx0VarI.o(-0.07f, 1.34f, -0.16f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(14.59f, 19.56f);
        nx0VarI.g(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
        nx0VarI.i(2.95f);
        nx0VarI.g(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
        nx0VarI.e();
        nx0VarI.m(16.36f, 14.0f);
        nx0VarI.g(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
        nx0VarI.o(-0.06f, -1.34f, -0.14f, -2.0f);
        nx0VarI.i(3.38f);
        nx0VarI.g(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
        nx0VarI.o(-0.1f, 1.36f, -0.26f, 2.0f);
        nx0VarI.i(-3.38f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        c = x01VarB;
        return x01VarB;
    }

    public static final x01 r() {
        x01 x01Var = e;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.RadioButtonUnchecked", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
        nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
        nx0VarI.n(17.52f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 20.0f);
        nx0VarI.g(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        nx0VarI.o(3.58f, -8.0f, 8.0f, -8.0f);
        nx0VarI.o(8.0f, 3.58f, 8.0f, 8.0f);
        nx0VarI.o(-3.58f, 8.0f, -8.0f, 8.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        e = x01VarB;
        return x01VarB;
    }

    public static final x01 s() {
        x01 x01Var = f;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(15.5f, 14.0f);
        nx0Var.i(-0.79f);
        nx0Var.l(-0.28f, -0.27f);
        nx0Var.g(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        nx0Var.g(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
        nx0Var.g(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
        nx0Var.g(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
        nx0Var.g(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
        nx0Var.l(0.27f, 0.28f);
        nx0Var.s(0.79f);
        nx0Var.l(4.25f, 4.25f);
        nx0Var.g(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        nx0Var.g(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        nx0Var.k(15.5f, 14.0f);
        nx0Var.e();
        nx0Var.m(9.5f, 14.0f);
        nx0Var.f(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        nx0Var.n(7.01f, 5.0f, 9.5f, 5.0f);
        nx0Var.n(14.0f, 7.01f, 14.0f, 9.5f);
        nx0Var.n(11.99f, 14.0f, 9.5f, 14.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        f = x01VarB;
        return x01VarB;
    }

    public static je3 t(ov0 ov0Var) {
        return (je3) ov0Var.j(le3.a);
    }

    public static String u(yi2 yi2Var) {
        int i = yi2Var.b;
        String str = yi2Var.a;
        int i2 = yi2Var.c;
        long j = yi2Var.d;
        StringBuilder sb = new StringBuilder("\n        [ \"$(tr '\\000' '\\n' < /proc/");
        sb.append(i);
        sb.append("/cmdline | head -n 1)\" = \"");
        sb.append(str);
        sb.append("\" ] || exit 1\n        [ \"$(awk '/^Uid:/{print $2}' /proc/");
        az2.w(sb, i, "/status)\" = \"", i2, "\" ] || exit 1\n        [ \"$(sed 's/^.*) //' /proc/");
        sb.append(i);
        sb.append("/stat | awk '{print $20}')\" = \"");
        sb.append(j);
        sb.append("\" ] || exit 1\n        ");
        return m13.O(sb.toString());
    }

    public static vs2 v(pu0 pu0Var) {
        vs2 vs2Var = new vs2();
        vs2Var.g = hd0.r(pu0Var, vs2Var, vs2Var);
        return vs2Var;
    }

    public static void w(int i, String str) {
        if (b) {
            Logger.log(i, "Mbgl-HttpRequest", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float x(g82 g82Var, boolean z, gy0[] gy0VarArr, float f2) {
        float f3 = Float.NaN;
        for (gy0 gy0Var : gy0VarArr) {
            float fC = g82Var.c(gy0Var);
            if (Float.isNaN(f3)) {
                f3 = fC;
            } else if (z == (fC > f3)) {
                f3 = fC;
            }
        }
        return Float.isNaN(f3) ? f2 : f3;
    }

    public static ar0 y(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            H(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gd2.b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                H(xmlResourceParser);
            }
            List listC = C(resources, resourceId);
            return new dr0(new tq0(string, string2, string3, listC), string4 != null ? new tq0(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gd2.c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        H(xmlResourceParser);
                    }
                    arrayList.add(new cr0(i, i3, resourceId2, string7, string6, z));
                } else {
                    H(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new br0((cr0[]) arrayList.toArray(new cr0[0]));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long z(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        fh0 fh0Var;
        char cCharAt2;
        fh0 fh0Var2;
        long jH;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d2;
        long jQ;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            fo.i("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            fo.i("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            fo.i("");
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            fo.i("");
            return 0L;
        }
        int i21 = 0;
        fh0 fh0Var3 = null;
        long jT = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                oj1 oj1Var = oj1.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c3) {
                    if (cCharAt10 != c2) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = oj1Var.a;
                                if (j > j4 || (j == j4 && i17 > oj1Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    fo.i("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                oj1Var = oj1Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            fh0Var = fh0.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            fo.i("");
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d3 = j5;
                                        switch (fh0Var.ordinal()) {
                                            case 0:
                                                d2 = 1.0E-15d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case 1:
                                                d2 = 1.0E-12d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case 2:
                                                d2 = 1.0E-9d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case 3:
                                                d2 = 1.0E-6d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case 4:
                                                d2 = 6.0E-5d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case Logger.WARN /* 5 */:
                                                d2 = 0.0036d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            case Logger.ERROR /* 6 */:
                                                d2 = 0.0864d;
                                                jQ = xq1.Q(d3 * d2);
                                                break;
                                            default:
                                                fo.o(fh0Var, "Unknown unit: ");
                                                jQ = 0;
                                                break;
                                        }
                                        j3 = jQ * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                fo.i("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            fh0Var2 = fh0.DAYS;
                            if (cCharAt2 == 'D') {
                                fh0Var = fh0Var2;
                            } else if (cCharAt2 == 'H') {
                                fh0Var = fh0.HOURS;
                            } else if (cCharAt2 == 'M') {
                                fh0Var = fh0.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                fh0Var = null;
                            }
                            if (fh0Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (fh0Var3 == null && fh0Var3.compareTo(fh0Var) <= 0) {
                                fo.i("Unexpected order of duration components");
                                return 0L;
                            }
                            if (fh0Var == fh0Var2) {
                                if (i21 != 0) {
                                    fo.i("");
                                    return 0L;
                                }
                                jT = gh0.t(j2, fh0Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    fo.i("");
                                    return 0L;
                                }
                                jH = h(jT, gh0.t(j2, fh0Var) * ((long) i4));
                                if (jH == 9223372036854759646L) {
                                    fo.i("");
                                    return 0L;
                                }
                                jT = jH;
                            }
                            i20 = i3 + 1;
                            fh0Var3 = fh0Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            fh0Var = fh0.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    fo.i("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                fo.i("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            fh0Var2 = fh0.DAYS;
                            if (cCharAt2 == 'D') {
                                fh0Var = fh0Var2;
                            } else if (cCharAt2 == 'H') {
                                fh0Var = fh0.HOURS;
                            } else if (cCharAt2 == 'M') {
                                fh0Var = fh0.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                fh0Var = null;
                            }
                            if (fh0Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (fh0Var3 == null) {
                            }
                            if (fh0Var == fh0Var2) {
                                if (i21 != 0) {
                                    fo.i("");
                                    return 0L;
                                }
                                jT = gh0.t(j2, fh0Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    fo.i("");
                                    return 0L;
                                }
                                jH = h(jT, gh0.t(j2, fh0Var) * ((long) i4));
                                if (jH == 9223372036854759646L) {
                                    fo.i("");
                                    return 0L;
                                }
                                jT = jH;
                            }
                            i20 = i3 + 1;
                            fh0Var3 = fh0Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        }
                        fo.i("");
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        fh0Var = fh0.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                fo.i("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            fo.i("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        fh0Var2 = fh0.DAYS;
                        if (cCharAt2 == 'D') {
                            fh0Var = fh0Var2;
                        } else if (cCharAt2 == 'H') {
                            fh0Var = fh0.HOURS;
                        } else if (cCharAt2 == 'M') {
                            fh0Var = fh0.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            fh0Var = null;
                        }
                        if (fh0Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (fh0Var3 == null) {
                        }
                        if (fh0Var == fh0Var2) {
                            if (i21 != 0) {
                                fo.i("");
                                return 0L;
                            }
                            jT = gh0.t(j2, fh0Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                fo.i("");
                                return 0L;
                            }
                            jH = h(jT, gh0.t(j2, fh0Var) * ((long) i4));
                            if (jH == 9223372036854759646L) {
                                fo.i("");
                                return 0L;
                            }
                            jT = jH;
                        }
                        i20 = i3 + 1;
                        fh0Var3 = fh0Var;
                        i19 = i22;
                        i = i6;
                        c2 = '-';
                        c3 = '+';
                    }
                    fo.i("");
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    oj1Var = oj1Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    fo.i("");
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jG = ah0.g(L(jT, fh0.MILLISECONDS), L(j3, fh0.NANOSECONDS));
        return (i23 == 0 || jG == ah0.i) ? jG : ah0.j(jG);
    }
}
