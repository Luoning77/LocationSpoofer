package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wi0 {
    public static final Object j = new Object();
    public static volatile wi0 k;
    public final ReentrantReadWriteLock a;
    public final vo b;
    public volatile int c;
    public final Handler d;
    public final si0 e;
    public final vi0 f;
    public final c30 g;
    public final int h;
    public final ma0 i;

    public wi0(vq0 vq0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        vi0 vi0Var = vq0Var.a;
        this.f = vi0Var;
        int i = vq0Var.b;
        this.h = i;
        this.i = vq0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new vo(0);
        this.g = new c30(18);
        si0 si0Var = new si0(this);
        this.e = si0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                vi0Var.a(new ri0(si0Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static wi0 a() {
        wi0 wi0Var;
        synchronized (j) {
            try {
                wi0Var = k;
                if (!(wi0Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wi0Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            fo.n("Not initialized yet");
            return 0;
        }
        ig0.l(charSequence, "charSequence cannot be null");
        gn gnVar = this.e.b;
        gnVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            fe3[] fe3VarArr = (fe3[]) spanned.getSpans(i, i + 1, fe3.class);
            if (fe3VarArr.length > 0) {
                return spanned.getSpanStart(fe3VarArr[0]);
            }
        }
        return ((ij0) gnVar.z(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new ij0(i))).f;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            fo.n("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            si0 si0Var = this.e;
            wi0 wi0Var = si0Var.a;
            try {
                wi0Var.f.a(new ri0(si0Var));
            } catch (Throwable th) {
                wi0Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ui0(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        fe3[] fe3VarArr;
        int spanStart;
        qf3 qf3Var = null;
        if (!(c() == 1)) {
            fo.n("Not initialized yet");
            return null;
        }
        if (i < 0) {
            fo.i("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            fo.i("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            fo.i("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            fo.i("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            fo.i("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        gn gnVar = this.e.b;
        gnVar.getClass();
        boolean z2 = charSequence instanceof xy2;
        if (z2) {
            ((xy2) charSequence).a();
        }
        if (z2) {
            qf3Var = new qf3((Spannable) charSequence);
            if (qf3Var != null) {
                for (fe3 fe3Var : fe3VarArr) {
                    spanStart = qf3Var.f.getSpanStart(fe3Var);
                    int spanEnd = qf3Var.f.getSpanEnd(fe3Var);
                    if (spanStart != i2) {
                        qf3Var.removeSpan(fe3Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((xy2) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    qf3Var = new qf3((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((xy2) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, fe3.class) <= i2) {
                qf3Var = new qf3();
                qf3Var.e = false;
                qf3Var.f = new SpannableString(charSequence);
            }
            if (qf3Var != null && (fe3VarArr = (fe3[]) qf3Var.f.getSpans(i, i2, fe3.class)) != null && fe3VarArr.length > 0) {
                while (i < r0) {
                    spanStart = qf3Var.f.getSpanStart(fe3Var);
                    int spanEnd2 = qf3Var.f.getSpanEnd(fe3Var);
                    if (spanStart != i2) {
                        qf3Var.removeSpan(fe3Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    qf3 qf3Var2 = (qf3) gnVar.z(charSequence2, i4, i5, Integer.MAX_VALUE, z, new d31(16, qf3Var, (c30) gnVar.a));
                    if (qf3Var2 != null) {
                        Spannable spannable = qf3Var2.f;
                        if (z2) {
                            ((xy2) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((xy2) charSequence2).b();
                    throw th;
                }
            }
            ((xy2) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((xy2) charSequence2).b();
        throw th;
    }

    public final void h(ti0 ti0Var) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ui0(Arrays.asList(ti0Var), this.c, null));
            } else {
                this.b.add(ti0Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        si0 si0Var = this.e;
        si0Var.getClass();
        Bundle bundle = editorInfo.extras;
        vt1 vt1Var = (vt1) si0Var.c.e;
        int iA = vt1Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) vt1Var.h).getInt(iA + vt1Var.e) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
