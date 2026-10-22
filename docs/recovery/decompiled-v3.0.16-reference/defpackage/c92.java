package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c92 extends k33 implements pu0 {
    public Mutex e;
    public d92 f;
    public CharSequence g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ CharSequence k;
    public final /* synthetic */ long l;
    public final /* synthetic */ d92 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(long j, q60 q60Var, d92 d92Var, CharSequence charSequence) {
        super(2, q60Var);
        this.k = charSequence;
        this.l = j;
        this.m = d92Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        c92 c92Var = new c92(this.l, q60Var, this.m, this.k);
        c92Var.j = obj;
        return c92Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((c92) create((TextClassifier) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        d92 d92Var;
        long j;
        TextSelection textSelection;
        CharSequence charSequence;
        Mutex mutex;
        int i = this.i;
        if (i == 0) {
            ee0.J(obj);
            TextClassifier textClassifier = (TextClassifier) this.j;
            long j2 = this.l;
            int iF = f93.f(j2);
            int iE = f93.e(j2);
            CharSequence charSequence2 = this.k;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            d92Var = this.m;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(d92Var.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jA = g93.a(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            z70 z70Var = z70.e;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.h = jA;
                this.i = 2;
                if (d92Var.a(this.k, jA, textClassifier, this) != z70Var) {
                    j = jA;
                }
            } else {
                Mutex mutex2 = d92Var.e;
                this.j = textSelectionSuggestSelection;
                this.e = mutex2;
                this.f = d92Var;
                this.g = charSequence2;
                this.h = jA;
                this.i = 1;
                if (mutex2.lock(null, this) != z70Var) {
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    mutex = mutex2;
                    j = jA;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    d92Var.g.setValue(new u53(charSequence, j, textClassification));
                }
            }
            return z70Var;
        }
        if (i == 1) {
            j = this.h;
            charSequence = this.g;
            d92Var = this.f;
            mutex = this.e;
            textSelection = (TextSelection) this.j;
            ee0.J(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                d92Var.g.setValue(new u53(charSequence, j, textClassification2));
            } finally {
                mutex.unlock(null);
            }
        } else {
            if (i != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.h;
            ee0.J(obj);
        }
        return new f93(j);
    }
}
