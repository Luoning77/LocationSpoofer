package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gc0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public gc0(AssetManager assetManager, Executor executor, lc2 lc2Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = lc2Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = sb.g0;
                    break;
                case 27:
                    bArr = sb.f0;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = sb.e0;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = sb.d0;
        }
        this.d = bArr;
    }

    public void a(qa1 qa1Var) {
        xp xpVar = (xp) this.g;
        if (xpVar == null || qa1Var != ((qa1) this.h) || xpVar.b()) {
            this.h = qa1Var;
            xpVar = new xp((dj) this.b, r93.c((q93) this.c, qa1Var), (List) this.f, (xb0) this.d, (lq0) this.e);
        }
        this.g = xpVar;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((lc2) this.c).f();
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new e10(i, 2, this, serializable));
    }

    public gc0(dj djVar, q93 q93Var, boolean z, xb0 xb0Var, lq0 lq0Var, List list) {
        this.b = djVar;
        this.c = q93Var;
        this.a = z;
        this.d = xb0Var;
        this.e = lq0Var;
        this.f = list;
    }
}
