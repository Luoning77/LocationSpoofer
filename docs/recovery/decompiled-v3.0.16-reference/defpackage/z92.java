package defpackage;

import android.view.WindowInsetsAnimation;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z92 implements wm2, v23, kp2 {
    public final /* synthetic */ int e;
    public Object f;
    public Object g;

    public z92(int i) {
        this.e = i;
        switch (i) {
            case 4:
                this.g = hb3.e;
                break;
            case Logger.WARN /* 5 */:
                this.f = new gt2(5);
                this.g = new mk1(16);
                break;
            case mc0.b /* 9 */:
                this.f = new gy1(new Reference[16]);
                this.g = new ReferenceQueue();
                break;
            default:
                this.f = new LinkedHashMap();
                this.g = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.kp2
    public int a(int i) {
        do {
            i = ((dm) this.g).l(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i)));
        return i;
    }

    @Override // defpackage.kp2
    public int b(int i) {
        do {
            i = ((dm) this.g).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.wm2
    public Object c(Object obj) {
        return ((lu0) this.g).invoke(obj);
    }

    @Override // defpackage.v23
    public String d() {
        return (String) this.f;
    }

    @Override // defpackage.v23
    public void e(u23 u23Var) {
        Object[] objArr = (Object[]) this.g;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                u23Var.b(i);
            } else if (obj instanceof byte[]) {
                u23Var.Q(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                u23Var.a(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                u23Var.a(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                u23Var.e(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                u23Var.e(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                u23Var.e(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                u23Var.e(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                u23Var.r(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                u23Var.e(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    @Override // defpackage.kp2
    public int f(int i) {
        CharSequence charSequence = (CharSequence) this.f;
        do {
            i = ((dm) this.g).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.kp2
    public int g(int i) {
        do {
            i = ((dm) this.g).l(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.wm2
    public Object h(pl2 pl2Var, Object obj) {
        return ((pu0) this.f).invoke(pl2Var, obj);
    }

    public Object i(long j, au0 au0Var, k33 k33Var) {
        return BuildersKt.withContext((CoroutineDispatcher) this.g, new eg3(this, j, au0Var, null), k33Var);
    }

    public void j() {
        g63 g63Var;
        if (((hb3) this.g) == hb3.e) {
            s21.c("ToolbarRequester is not initialized.");
        }
        o63 o63Var = (o63) this.f;
        if (o63Var == null || !o63Var.r) {
            return;
        }
        Job job = o63Var.y;
        if ((job == null || !job.isActive()) && (g63Var = (g63) xq1.C(o63Var, i63.b)) != null) {
            o63Var.y = BuildersKt__Builders_commonKt.launch$default(o63Var.a1(), null, CoroutineStart.UNDISPATCHED, new n63(o63Var, g63Var, null), 1, null);
        }
    }

    public String toString() {
        switch (this.e) {
            case mc0.c /* 10 */:
                return "Bounds{lower=" + ((j31) this.f) + " upper=" + ((j31) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public z92(w12 w12Var) {
        this.e = 7;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        immediate.getClass();
        this.f = w12Var;
        this.g = immediate;
    }

    public z92(File file, String str) {
        this.e = 8;
        file.getClass();
        this.f = file;
        this.g = str;
    }

    public /* synthetic */ z92(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public z92(WindowInsetsAnimation.Bounds bounds) {
        this.e = 10;
        this.f = j31.c(bounds.getLowerBound());
        this.g = j31.c(bounds.getUpperBound());
    }
}
