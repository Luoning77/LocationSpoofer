package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class rq1 {
    public static final if2 a = new if2("^\\|?\\s*:?-{2,}:?\\s*(\\|\\s*:?-{2,}:?\\s*)*\\|?$");
    public static final if2 b = new if2("^([-*_])(\\s*\\1){2,}$");

    public static final void a(pq1 pq1Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1268251124);
        int i2 = (ov0Var.h(pq1Var) ? 4 : 2) | i;
        boolean z = true;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            Iterator it = pq1Var.a.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (l13.c0(lowerCase, "状态", false) || l13.c0(lowerCase, "status", false)) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3;
            jo joVar = new jo(6.0f, true, new fo(0));
            av1 av1Var = av1.a;
            dv1 dv1VarF = zm3.F(av1Var, 0.0f, 2.0f, 1);
            yz yzVarA = wz.a(joVar, j9.r, ov0Var, 6);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, yzVarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            ov0Var.c0(1976985459);
            Iterator it2 = pq1Var.b.iterator();
            while (it2.hasNext()) {
                e33.a(iw2.e(av1Var, 1.0f), cj2.a(10.0f), hz.c(0.35f, ((kz) ov0Var.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(1753965404, new fj((List) it2.next(), i4, pq1Var), ov0Var), ov0Var, 12582918, 120);
                av1Var = av1Var;
                i4 = i4;
                z = true;
            }
            ov0Var.p(false);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new s5(i, 16, pq1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    public static final void b(String str, dv1 dv1Var, f30 f30Var, int i) {
        ?? r15;
        dv1 dv1Var2;
        ov0 ov0Var;
        ArrayList arrayList;
        Object obj;
        Object obj2;
        av1 av1Var;
        String str2;
        boolean z;
        boolean z2;
        char c;
        ov0 ov0Var2;
        str.getClass();
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(-1253359301);
        int i2 = i | (ov0Var3.f(str) ? 4 : 2) | 48;
        int i3 = 1;
        boolean z3 = false;
        if (ov0Var3.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z4 = (i2 & 14) == 4;
            Object objQ = ov0Var3.Q();
            String str3 = "";
            if (z4 || objQ == d30.a) {
                obj2 = objQ;
                if (l13.k0(str)) {
                    obj = uj0.e;
                } else {
                    arrayList = new ArrayList();
                    List<String> listV0 = l13.v0(s13.X(s13.X(str, "\r\n", "\n", false), "\r", "\n", false), new String[]{"\n"});
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (String str4 : listV0) {
                        String string = l13.D0(str4).toString();
                        if (i4 == 0 && s13.Z(string, "|", false)) {
                            arrayList3.add(string);
                        } else {
                            d(arrayList3, arrayList);
                            if (s13.Z(string, "```", false)) {
                                if (i4 != 0) {
                                    arrayList.add(new lq1(zy.s0(arrayList2, "\n", null, null, null, 62)));
                                    arrayList2.clear();
                                    i4 = 0;
                                } else {
                                    i4 = i3;
                                }
                            } else if (i4 != 0) {
                                arrayList2.add(str4);
                            } else if (string.length() != 0 && !b.b(string)) {
                                Pattern patternCompile = Pattern.compile("^(#{1,6})\\s+(.*)");
                                patternCompile.getClass();
                                Matcher matcher = patternCompile.matcher(string);
                                matcher.getClass();
                                vq1 vq1Var = !matcher.matches() ? null : new vq1(matcher, string);
                                if (vq1Var != null) {
                                    int length = ((String) ((uq1) vq1Var.a()).get(i3)).length();
                                    String string2 = l13.D0((String) ((uq1) vq1Var.a()).get(2)).toString();
                                    String lowerCase = string2.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    String str5 = "feature";
                                    if (!l13.c0(lowerCase, "功能", false) && !l13.c0(lowerCase, "feature", false) && !l13.c0(lowerCase, "新增", false) && !l13.c0(lowerCase, "优化", false) && !l13.c0(lowerCase, "ميزة", false) && !l13.c0(lowerCase, "تحسين", false)) {
                                        str5 = "fix";
                                        if (!l13.c0(lowerCase, "修复", false) && !l13.c0(lowerCase, "fix", false) && !l13.c0(lowerCase, "bug", false) && !l13.c0(lowerCase, "解决", false) && !l13.c0(lowerCase, "إصلاح", false) && !l13.c0(lowerCase, "حل", false)) {
                                            str5 = "other";
                                        }
                                    }
                                    if (string2.length() > 0) {
                                        arrayList.add(new mq1(length, string2, str5));
                                    }
                                } else if (s13.Z(string, ">", false)) {
                                    String string3 = l13.D0(l13.q0(string, ">")).toString();
                                    if (string3.length() > 0) {
                                        arrayList.add(new kq1(string3));
                                    }
                                } else {
                                    boolean z5 = s13.Z(string, "- ", false) || s13.Z(string, "* ", false) || s13.Z(string, "+ ", false) || s13.Z(string, "• ", false);
                                    Pattern patternCompile2 = Pattern.compile("^\\d+[\\.\\)]\\s+.*");
                                    patternCompile2.getClass();
                                    boolean zMatches = patternCompile2.matcher(string).matches();
                                    if (z5) {
                                        String string4 = l13.D0(string.substring(2)).toString();
                                        if (string4.length() > 0) {
                                            arrayList.add(new nq1(string4, "bullet"));
                                        }
                                    } else if (zMatches) {
                                        Pattern patternCompile3 = Pattern.compile("^\\d+[\\.\\)]\\s*");
                                        patternCompile3.getClass();
                                        String strReplaceAll = patternCompile3.matcher(string).replaceAll("");
                                        strReplaceAll.getClass();
                                        String string5 = l13.D0(strReplaceAll).toString();
                                        if (string5.length() > 0) {
                                            arrayList.add(new nq1(string5, "number"));
                                        }
                                    } else {
                                        arrayList.add(new oq1(string));
                                    }
                                }
                            }
                        }
                        i3 = 1;
                    }
                    d(arrayList3, arrayList);
                    obj = arrayList;
                    if (i4 != 0 && !arrayList2.isEmpty()) {
                        obj = arrayList;
                        arrayList.add(new lq1(zy.s0(arrayList2, "\n", null, null, null, 62)));
                        obj = arrayList;
                    }
                }
                obj = arrayList;
                Object obj3 = obj;
                ov0Var3.m0(obj3);
                obj2 = obj3;
            }
            obj2 = objQ;
            List<qq1> list = (List) obj2;
            av1 av1Var2 = av1.a;
            char c2 = 0;
            dv1 dv1VarE = iw2.e(av1Var2, 1.0f);
            boolean z6 = true;
            yz yzVarA = wz.a(new jo(6.0f, true, new fo(0)), j9.r, ov0Var3, 6);
            int iHashCode = Long.hashCode(ov0Var3.T);
            l72 l72VarL = ov0Var3.l();
            dv1 dv1VarH = xp1.H(ov0Var3, dv1VarE);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, v20.e, yzVarA);
            q73.h(ov0Var3, v20.d, l72VarL);
            q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var3, v20.g);
            q73.h(ov0Var3, v20.c, dv1VarH);
            ov0Var3.c0(-1558043958);
            ov0 ov0Var4 = ov0Var3;
            for (qq1 qq1Var : list) {
                if (qq1Var instanceof mq1) {
                    ov0Var4.c0(-1683829969);
                    gh0.h(ov0Var4, iw2.g(av1Var2, 4.0f));
                    String str6 = ((mq1) qq1Var).b;
                    Pattern patternCompile4 = Pattern.compile("^[#🌟🛠📝\\s]+");
                    patternCompile4.getClass();
                    String strReplaceAll2 = patternCompile4.matcher(str6).replaceAll(str3);
                    strReplaceAll2.getClass();
                    String string6 = l13.D0(strReplaceAll2).toString();
                    long jB = v63.b(14.5d);
                    jr0 jr0Var = jr0.j;
                    long j = ((kz) ov0Var4.j(mz.a)).q;
                    ov0 ov0Var5 = ov0Var4;
                    str2 = str3;
                    z = z3 ? 1 : 0;
                    av1Var = av1Var2;
                    s83.b(string6, null, j, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                    ov0Var4 = ov0Var5;
                    ov0Var4.p(z);
                    z2 = true;
                    c = 0;
                } else {
                    av1Var = av1Var2;
                    str2 = str3;
                    z = z3;
                    if (qq1Var instanceof nq1) {
                        ov0Var4.c0(-1683395473);
                        dv1 dv1VarG = zm3.G(iw2.e(av1Var, 1.0f), 4.0f, 2.0f, 0.0f, 2.0f, 4);
                        kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var4, 48);
                        int iHashCode2 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL2 = ov0Var4.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var4, dv1VarG);
                        w20.b.getClass();
                        x30 x30Var2 = v20.b;
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var2);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, v20.e, kk2VarA);
                        q73.h(ov0Var4, v20.d, l72VarL2);
                        q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode2));
                        q73.g(ov0Var4, v20.g);
                        q73.h(ov0Var4, v20.c, dv1VarH2);
                        ws.a(xp1.k(xp1.n(iw2.k(zm3.G(av1Var, 0.0f, 7.0f, 8.0f, 0.0f, 9), 5.0f), cj2.a), bk.g, o51.p0), ov0Var4, z ? 1 : 0);
                        ov0 ov0Var6 = ov0Var4;
                        av1Var = av1Var;
                        s83.c(c(((nq1) qq1Var).a), null, hz.c(0.9f, ((kz) ov0Var4.j(mz.a)).q), v63.c(13), null, 0L, v63.c(19), 0, false, 0, 0, null, null, null, ov0Var6, 24576, 48, 522218);
                        ov0 ov0Var7 = ov0Var6;
                        ov0Var7.p(true);
                        ov0Var7.p(z);
                        z2 = true;
                        ov0Var2 = ov0Var7;
                    } else if (qq1Var instanceof oq1) {
                        ov0Var4.c0(-1682424057);
                        ov0 ov0Var8 = ov0Var4;
                        s83.c(c(((oq1) qq1Var).a), zm3.F(av1Var, 0.0f, 2.0f, 1), hz.c(0.85f, ((kz) ov0Var4.j(mz.a)).q), v63.c(13), null, 0L, v63.c(19), 0, false, 0, 0, null, null, null, ov0Var8, 24624, 48, 522216);
                        ov0 ov0Var9 = ov0Var8;
                        ov0Var9.p(z);
                        z2 = true;
                        ov0Var2 = ov0Var9;
                    } else {
                        if (qq1Var instanceof kq1) {
                            ov0Var4.c0(-1681969411);
                            z2 = true;
                            e33.a(zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 1), cj2.a(8.0f), hz.c(0.4f, ((kz) ov0Var4.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(654192612, new s5((kq1) qq1Var, 14), ov0Var4), ov0Var4, 12582918, 120);
                            ov0Var4.p(z);
                            ov0Var4 = ov0Var4;
                        } else {
                            z2 = true;
                            if (qq1Var instanceof pq1) {
                                ov0Var4.c0(-1301141742);
                                a((pq1) qq1Var, ov0Var4, z ? 1 : 0);
                                ov0Var4.p(z);
                                ov0Var4 = ov0Var4;
                            } else if (!(qq1Var instanceof lq1)) {
                                ov0Var4.c0(-1301241286);
                                ov0Var4.p(z);
                                b81.d();
                                return;
                            } else {
                                ov0Var4.c0(-1680599490);
                                c = 0;
                                e33.a(zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 1), cj2.a(8.0f), hz.c(0.6f, ((kz) ov0Var4.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(-534599962, new s5((lq1) qq1Var, 15), ov0Var4), ov0Var4, 12582918, 120);
                                ov0Var4.p(z);
                            }
                        }
                        c = 0;
                    }
                    ov0Var4 = ov0Var2;
                    c = 0;
                }
                z3 = z;
                av1Var2 = av1Var;
                z6 = z2;
                str3 = str2;
                c2 = c;
                ov0Var4 = ov0Var4;
            }
            dv1Var2 = av1Var2;
            boolean z7 = z6;
            ov0Var4.p(z3);
            ov0Var4.p(z7);
            ov0Var = ov0Var4;
            r15 = z7;
        } else {
            r15 = 1;
            ov0Var3.W();
            dv1Var2 = dv1Var;
            ov0Var = ov0Var3;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new zm(str, dv1Var2, i, r15);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:98:0x0228  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final dj c(String str) {
        String str2;
        int i;
        String str3;
        boolean z;
        boolean z2;
        int i2;
        int iI0;
        int i3;
        int iI1;
        int i4;
        int i5;
        int iI2;
        int i6;
        int iI3;
        int iF;
        str.getClass();
        bj bjVar = new bj();
        boolean z3 = false;
        int i7 = 0;
        while (i7 < str.length()) {
            int iI4 = l13.i0(str, "**", i7, z3, 4);
            int iI5 = l13.i0(str, "__", i7, z3, 4);
            int iI6 = l13.i0(str, "`", i7, z3, 4);
            int iI7 = l13.i0(str, "[", i7, z3, 4);
            int iI8 = l13.i0(str, "*", i7, z3, 4);
            if (i7 > iI4 || iI4 >= Integer.MAX_VALUE) {
                str2 = "";
                i = Integer.MAX_VALUE;
            } else {
                i = iI4;
                str2 = "bold1";
            }
            if (i7 > iI5 || iI5 >= i) {
                iI5 = i;
            } else {
                str2 = "bold2";
            }
            if (i7 > iI6 || iI6 >= iI5) {
                iI6 = iI5;
            } else {
                str2 = "code";
            }
            if (i7 > iI7 || iI7 >= iI6) {
                iI7 = iI6;
            } else {
                str2 = "link";
            }
            if (i7 > iI8 || iI8 >= iI7 || iI8 == iI4) {
                iI8 = iI7;
                str3 = str2;
            } else {
                str3 = "italic";
            }
            if (iI8 == Integer.MAX_VALUE) {
                bjVar.c(str.substring(i7));
                return bjVar.g();
            }
            if (iI8 > i7) {
                bjVar.c(str.substring(i7, iI8));
            }
            int iHashCode = str3.hashCode();
            StringBuilder sb = bjVar.e;
            switch (iHashCode) {
                case -1178781136:
                    if (str3.equals("italic")) {
                        int i8 = iI8 + 1;
                        z = false;
                        int iI9 = l13.i0(str, "*", i8, false, 4);
                        if (iI9 != -1) {
                            int iF2 = bjVar.f(new uy2(0L, 0L, (jr0) null, new hr0(1), (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65527));
                            try {
                                bjVar.c(str.substring(i8, iI9));
                                bjVar.e(iF2);
                                i7 = iI9 + 1;
                                z2 = true;
                            } catch (Throwable th) {
                                bjVar.e(iF2);
                                throw th;
                            }
                        }
                        if (!z2) {
                            sb.append(str.charAt(i7));
                            i7++;
                        }
                        z3 = z;
                    } else {
                        z = false;
                    }
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
                case 3059181:
                    if (str3.equals("code") && (iI0 = l13.i0(str, "`", (i2 = iI8 + 1), false, 4)) != -1) {
                        int iF3 = bjVar.f(new uy2(bk.g, 0L, (jr0) null, (hr0) null, (ir0) null, l43.c, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65502));
                        try {
                            bjVar.c(str.substring(i2, iI0));
                            bjVar.e(iF3);
                            i7 = iI0 + 1;
                            z = false;
                            z2 = true;
                            if (!z2) {
                                sb.append(str.charAt(i7));
                                i7++;
                            }
                            z3 = z;
                        } catch (Throwable th2) {
                            bjVar.e(iF3);
                            throw th2;
                        }
                    }
                    z = false;
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
                case 3321850:
                    if (str3.equals("link") && (iI1 = l13.i0(str, "]", (i3 = iI8 + 1), false, 4)) != -1 && (i4 = iI1 + 1) < str.length() && str.charAt(i4) == '(' && (iI2 = l13.i0(str, ")", (i5 = iI1 + 2), false, 4)) != -1) {
                        String strSubstring = str.substring(i3, iI1);
                        String strSubstring2 = str.substring(i5, iI2);
                        int iF4 = bjVar.f(new uy2(bk.g, 0L, (jr0) null, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, p63.c, (xt2) null, 61438));
                        try {
                            aj ajVar = new aj(new h13(strSubstring2), sb.length(), 0, 4);
                            ArrayList arrayList = bjVar.f;
                            arrayList.add(ajVar);
                            bjVar.g.add(ajVar);
                            arrayList.size();
                            bjVar.c(strSubstring);
                            bjVar.d();
                            bjVar.e(iF4);
                            i7 = iI2 + 1;
                            z = false;
                            z2 = true;
                            if (!z2) {
                                sb.append(str.charAt(i7));
                                i7++;
                            }
                            z3 = z;
                        } catch (Throwable th3) {
                            bjVar.e(iF4);
                            throw th3;
                        }
                    }
                    z = false;
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
                case 93918796:
                    if (str3.equals("bold1")) {
                        i6 = iI8 + 2;
                        iI3 = l13.i0(str, str3.equals("bold1") ? "**" : "__", i6, false, 4);
                        if (iI3 != -1) {
                            iF = bjVar.f(new uy2(0L, 0L, jr0.j, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65531));
                            try {
                                bjVar.c(str.substring(i6, iI3));
                                bjVar.e(iF);
                                i7 = iI3 + 2;
                                z = false;
                                z2 = true;
                                if (!z2) {
                                    sb.append(str.charAt(i7));
                                    i7++;
                                }
                                z3 = z;
                            } catch (Throwable th4) {
                                bjVar.e(iF);
                                throw th4;
                            }
                        }
                    }
                    z = false;
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
                case 93918797:
                    if (str3.equals("bold2")) {
                        i6 = iI8 + 2;
                        iI3 = l13.i0(str, str3.equals("bold1") ? "**" : "__", i6, false, 4);
                        if (iI3 != -1) {
                            iF = bjVar.f(new uy2(0L, 0L, jr0.j, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65531));
                            bjVar.c(str.substring(i6, iI3));
                            bjVar.e(iF);
                            i7 = iI3 + 2;
                            z = false;
                            z2 = true;
                            if (!z2) {
                                sb.append(str.charAt(i7));
                                i7++;
                            }
                            z3 = z;
                        }
                    }
                    z = false;
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
                default:
                    z = false;
                    z2 = z;
                    i7 = iI8;
                    if (!z2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    z3 = z;
                    break;
            }
        }
        return bjVar.g();
    }

    public static final void d(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!a.b((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(az.Y(arrayList3, 10));
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            List listV0 = l13.v0(l13.r0(l13.q0(l13.D0((String) obj2).toString(), "|"), "|"), new String[]{"|"});
            ArrayList arrayList5 = new ArrayList(az.Y(listV0, 10));
            Iterator it = listV0.iterator();
            while (it.hasNext()) {
                arrayList5.add(l13.D0((String) it.next()).toString());
            }
            arrayList4.add(arrayList5);
        }
        arrayList.clear();
        if (arrayList4.isEmpty()) {
            return;
        }
        arrayList2.add(new pq1((List) zy.n0(arrayList4), zy.i0(arrayList4, 1)));
    }
}
