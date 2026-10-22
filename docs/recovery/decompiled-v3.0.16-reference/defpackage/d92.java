package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d92 implements z82 {
    public final y70 a;
    public final Context b;
    public final vp2 c;
    public final sh1 d;
    public TextClassifier f;
    public final Mutex e = MutexKt.Mutex$default(false, 1, null);
    public final w52 g = ke0.H(null);
    public final Object h = new Object();

    public d92(y70 y70Var, Context context, vp2 vp2Var, sh1 sh1Var) {
        this.a = y70Var;
        this.b = context;
        this.c = vp2Var;
        this.d = sh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(CharSequence charSequence, long j, TextClassifier textClassifier, r60 r60Var) throws Throwable {
        a92 a92Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        Mutex mutex;
        Object obj;
        Object obj2;
        TextClassification textClassificationClassifyText;
        Object obj3;
        Mutex mutex2;
        long j3;
        CharSequence charSequence3;
        if (r60Var instanceof a92) {
            a92Var = (a92) r60Var;
            int i = a92Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a92Var.k = i - Integer.MIN_VALUE;
            } else {
                a92Var = new a92(this, r60Var);
            }
        } else {
            a92Var = new a92(this, r60Var);
        }
        Object obj4 = a92Var.i;
        int i2 = a92Var.k;
        w52 w52Var = this.g;
        mf3 mf3Var = mf3.a;
        Mutex mutex3 = this.e;
        z70 z70Var = z70.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = a92Var.h;
                    mutex = a92Var.g;
                    textClassifier2 = (TextClassifier) a92Var.f;
                    charSequence2 = a92Var.e;
                    ee0.J(obj4);
                } else {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = a92Var.h;
                    Mutex mutex4 = a92Var.g;
                    textClassificationClassifyText = (TextClassification) a92Var.f;
                    charSequence3 = a92Var.e;
                    ee0.J(obj4);
                    mutex2 = mutex4;
                    obj3 = null;
                }
                try {
                    w52Var.setValue(new u53(charSequence3, j3, textClassificationClassifyText));
                    return mf3Var;
                } finally {
                    mutex2.unlock(obj3);
                }
            }
            ee0.J(obj4);
            a92Var.e = charSequence;
            a92Var.f = textClassifier;
            a92Var.g = mutex3;
            j2 = j;
            a92Var.h = j2;
            a92Var.k = 1;
            if (mutex3.lock(null, a92Var) == z70Var) {
                return z70Var;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            mutex = mutex3;
            u53 u53Var = (u53) w52Var.getValue();
            if (u53Var != null) {
                try {
                    if (f93.b(j2, u53Var.b) && o51.f(charSequence2, u53Var.a)) {
                        mutex.unlock(null);
                        return mf3Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    mutex.unlock(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            mutex.unlock(obj2);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, f93.f(j2), f93.e(j2)).setDefaultLocales(b()).build());
            a92Var.e = charSequence2;
            a92Var.f = textClassificationClassifyText;
            a92Var.g = mutex3;
            a92Var.h = j2;
            a92Var.k = 2;
            obj3 = null;
            if (mutex3.lock(null, a92Var) == z70Var) {
                return z70Var;
            }
            mutex2 = mutex3;
            j3 = j2;
            charSequence3 = charSequence2;
            w52Var.setValue(new u53(charSequence3, j3, textClassificationClassifyText));
            return mf3Var;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final LocaleList b() {
        sh1 sh1Var = this.d;
        if (sh1Var == null) {
            return new LocaleList(((rh1) o82.a.k().e.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(az.Y(sh1Var, 10));
        Iterator it = sh1Var.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((rh1) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object c(CharSequence charSequence, long j, k33 k33Var) {
        if (charSequence.length() == 0 || f93.c(j)) {
            return mf3.a;
        }
        return BuildersKt.withContext(this.a, new t3(this, new n(j, null, this, charSequence), null, 10), k33Var);
    }
}
