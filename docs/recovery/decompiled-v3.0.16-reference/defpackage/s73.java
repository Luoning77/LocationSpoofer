package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s73 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ x73 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(x73 x73Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = x73Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        x73 x73Var = this.g;
        switch (i) {
            case 0:
                s73 s73Var = new s73(x73Var, q60Var, 0);
                long j = ((c12) obj).a;
                return s73Var;
            case 1:
                return new s73(x73Var, q60Var, 1);
            default:
                return new s73(x73Var, q60Var, 2);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                long j = ((c12) obj).a;
                return new s73(this.g, (q60) obj2, 0).invokeSuspend(mf3Var);
            case 1:
                return ((s73) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((s73) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i;
        dj djVarC;
        zx zxVar;
        Object yxVar;
        Object djVar;
        CharSequence text;
        Spanned spanned;
        int i2;
        dj djVar2;
        int i3 = this.e;
        dx0 dx0Var = dx0.e;
        z70 z70Var = z70.e;
        byte b = 1;
        x73 x73Var = this.g;
        mf3 mf3Var = mf3.a;
        switch (i3) {
            case 0:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ee0.J(obj);
                    } else {
                        if (i4 != 2) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    return mf3Var;
                }
                ee0.J(obj);
                this.f = 1;
                if (x73Var.t(this) == z70Var) {
                    return z70Var;
                }
                i52 i52VarF = x73Var.f();
                if (i52VarF != null) {
                    String str = (String) i52VarF.e;
                    long j = ((f93) i52VarF.f).a;
                    z82 z82Var = x73Var.j;
                    if (z82Var != null) {
                        this.f = 2;
                        Object objC = ((d92) z82Var).c(str, j, this);
                        if (objC != z70Var) {
                            objC = mf3Var;
                        }
                        if (objC == z70Var) {
                            return z70Var;
                        }
                    }
                }
                return mf3Var;
            case 1:
                int i5 = this.f;
                if (i5 == 0) {
                    ee0.J(obj);
                    if (f93.c(x73Var.l().b) || !x73Var.h() || (x73Var.f instanceof j62)) {
                        i = 1;
                        djVarC = null;
                    } else {
                        djVarC = g83.c(x73Var.l());
                        dj djVarE = g83.e(x73Var.l(), x73Var.l().a.f.length());
                        dj djVarD = g83.d(x73Var.l(), x73Var.l().a.f.length());
                        bj bjVar = new bj(djVarE);
                        bjVar.a(djVarD);
                        dj djVarG = bjVar.g();
                        int iF = f93.f(x73Var.l().b);
                        x73Var.c.invoke(x73.b(djVarG, g93.a(iF, iF)));
                        x73Var.r(dx0Var);
                        i = 1;
                        x73Var.a.e = true;
                    }
                    if (djVarC != null && (zxVar = x73Var.h) != null) {
                        yx yxVarR = xq1.R(djVarC);
                        this.f = i;
                        ((ja) zxVar).a(yxVarR);
                        if (mf3Var == z70Var) {
                            return z70Var;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                int i6 = this.f;
                if (i6 == 0) {
                    ee0.J(obj);
                    zx zxVar2 = x73Var.h;
                    if (zxVar2 != null) {
                        this.f = 1;
                        ClipData primaryClip = ((ja) zxVar2).a.a().getPrimaryClip();
                        yxVar = primaryClip != null ? new yx(primaryClip) : null;
                        if (yxVar == z70Var) {
                            return z70Var;
                        }
                    }
                    return mf3Var;
                }
                if (i6 == 1) {
                    ee0.J(obj);
                    yxVar = obj;
                } else {
                    if (i6 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                    djVar = obj;
                }
                djVar2 = (dj) djVar;
                if (djVar2 != null && x73Var.h()) {
                    bj bjVar2 = new bj(g83.e(x73Var.l(), x73Var.l().a.f.length()));
                    bjVar2.a(djVar2);
                    dj djVarG2 = bjVar2.g();
                    dj djVarD2 = g83.d(x73Var.l(), x73Var.l().a.f.length());
                    bj bjVar3 = new bj(djVarG2);
                    bjVar3.a(djVarD2);
                    dj djVarG3 = bjVar3.g();
                    int length = djVar2.f.length() + f93.f(x73Var.l().b);
                    x73Var.c.invoke(x73.b(djVarG3, g93.a(length, length)));
                    x73Var.r(dx0Var);
                    x73Var.a.e = true;
                }
                return mf3Var;
                yx yxVar2 = (yx) yxVar;
                if (yxVar2 != null) {
                    this.f = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = yxVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        djVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                int i9 = i7;
                                if (o51.f(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    v90 v90Var = new v90(annotation.getValue());
                                    Parcel parcel = v90Var.b;
                                    long jA = hz.g;
                                    long jA2 = jA;
                                    long jB = w93.c;
                                    long jB2 = jB;
                                    jr0 jr0Var = null;
                                    hr0 hr0Var = null;
                                    ir0 ir0Var = null;
                                    String string = null;
                                    qq qqVar = null;
                                    j83 j83Var = null;
                                    p63 p63Var = null;
                                    xt2 xt2Var = null;
                                    while (true) {
                                        if (parcel.dataAvail() > b) {
                                            byte b2 = parcel.readByte();
                                            text = text;
                                            if (b2 == b) {
                                                if (parcel.dataAvail() >= 8) {
                                                    jA = v90Var.a();
                                                    text = text;
                                                }
                                            } else if (b2 == 2) {
                                                if (parcel.dataAvail() >= 5) {
                                                    jB = v90Var.b();
                                                    b = 1;
                                                }
                                            } else if (b2 == 3) {
                                                if (parcel.dataAvail() >= 4) {
                                                    jr0Var = new jr0(parcel.readInt());
                                                    b = 1;
                                                    text = text;
                                                }
                                            } else if (b2 == 4) {
                                                if (parcel.dataAvail() >= 1) {
                                                    byte b3 = parcel.readByte();
                                                    hr0 hr0Var2 = new hr0((b3 != 0 && b3 == 1) ? 1 : i9);
                                                    text = text;
                                                    hr0Var = hr0Var2;
                                                    b = 1;
                                                }
                                            } else if (b2 != 5) {
                                                if (b2 == 6) {
                                                    string = parcel.readString();
                                                } else if (b2 == 7) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        jB2 = v90Var.b();
                                                    }
                                                } else if (b2 == 8) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        qqVar = new qq(parcel.readFloat());
                                                        b = 1;
                                                    }
                                                } else if (b2 == 9) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        j83Var = new j83(parcel.readFloat(), parcel.readFloat());
                                                        b = 1;
                                                        text = text;
                                                    }
                                                } else if (b2 == 10) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        jA2 = v90Var.a();
                                                    }
                                                } else if (b2 != 11) {
                                                    if (b2 == 12) {
                                                        if (parcel.dataAvail() >= 20) {
                                                            spanned2 = spanned2;
                                                            xt2Var = new xt2(v90Var.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                        }
                                                    }
                                                    b = 1;
                                                } else if (parcel.dataAvail() >= 4) {
                                                    int i10 = parcel.readInt();
                                                    int i11 = (i10 & 2) != 0 ? 1 : i9;
                                                    int i12 = (i10 & 1) != 0 ? 1 : i9;
                                                    p63 p63Var2 = p63.d;
                                                    int i13 = i12;
                                                    p63 p63Var3 = p63.c;
                                                    if (i11 != 0 && i13 != 0) {
                                                        List listG = am1.G(p63Var2, p63Var3);
                                                        Integer numValueOf = Integer.valueOf(i9);
                                                        int size = listG.size();
                                                        Integer numValueOf2 = numValueOf;
                                                        int i14 = i9;
                                                        while (i14 < size) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() | ((p63) listG.get(i14)).a);
                                                            i14++;
                                                            listG = listG;
                                                        }
                                                        p63Var = new p63(numValueOf2.intValue());
                                                    } else if (i11 != 0) {
                                                        p63Var = p63Var2;
                                                    } else {
                                                        if (i13 == 0) {
                                                            p63Var3 = p63.b;
                                                        }
                                                        p63Var = p63Var3;
                                                    }
                                                }
                                                b = 1;
                                            } else if (parcel.dataAvail() >= 1) {
                                                byte b4 = parcel.readByte();
                                                if (b4 == 0) {
                                                    i2 = i9;
                                                } else if (b4 == 1) {
                                                    i2 = 65535;
                                                } else if (b4 == 3) {
                                                    i2 = 2;
                                                } else if (b4 == 2) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = i9;
                                                }
                                                ir0Var = new ir0(i2);
                                                b = 1;
                                            }
                                        } else {
                                            text = text;
                                        }
                                    }
                                    spanned = spanned2;
                                    arrayList.add(new cj(spanStart, spanEnd, new uy2(jA, jB, jr0Var, hr0Var, ir0Var, (l43) null, string, jB2, qqVar, j83Var, (sh1) null, jA2, p63Var, xt2Var, 49152)));
                                } else {
                                    text = text;
                                    spanned = spanned2;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    i7 = i9;
                                    text = text;
                                    spanned2 = spanned;
                                    b = 1;
                                }
                            }
                        } else {
                            text = text;
                        }
                        String string2 = text.toString();
                        dj djVar3 = ej.a;
                        djVar = new dj(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        djVar = new dj(text.toString());
                    }
                    if (djVar == z70Var) {
                        return z70Var;
                    }
                    djVar2 = (dj) djVar;
                    if (djVar2 != null) {
                        bj bjVar4 = new bj(g83.e(x73Var.l(), x73Var.l().a.f.length()));
                        bjVar4.a(djVar2);
                        dj djVarG4 = bjVar4.g();
                        dj djVarD3 = g83.d(x73Var.l(), x73Var.l().a.f.length());
                        bj bjVar5 = new bj(djVarG4);
                        bjVar5.a(djVarD3);
                        dj djVarG5 = bjVar5.g();
                        int length3 = djVar2.f.length() + f93.f(x73Var.l().b);
                        x73Var.c.invoke(x73.b(djVarG5, g93.a(length3, length3)));
                        x73Var.r(dx0Var);
                        x73Var.a.e = true;
                    }
                }
                return mf3Var;
        }
    }
}
