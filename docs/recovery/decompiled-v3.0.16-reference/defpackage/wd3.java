package defpackage;

import com.google.gson.JsonElement;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wd3 {
    public static final td3 A;
    public static final wo B;
    public static final td3 a;
    public static final td3 b;
    public static final p02 c;
    public static final gf2 d;
    public static final gf2 e;
    public static final gf2 f;
    public static final gf2 g;
    public static final td3 h;
    public static final td3 i;
    public static final td3 j;
    public static final p02 k;
    public static final gf2 l;
    public static final p02 m;
    public static final p02 n;
    public static final p02 o;
    public static final td3 p;
    public static final td3 q;
    public static final td3 r;
    public static final td3 s;
    public static final td3 t;
    public static final td3 u;
    public static final td3 v;
    public static final td3 w;
    public static final o02 x;
    public static final td3 y;
    public static final p02 z;

    static {
        int i2 = 0;
        a = new td3(Class.class, new p02(13).nullSafe(), i2);
        b = new td3(BitSet.class, new p02(23).nullSafe(), i2);
        p02 p02Var = new p02(24);
        c = new p02(25);
        d = new gf2(Boolean.TYPE, Boolean.class, p02Var);
        e = new gf2(Byte.TYPE, Byte.class, new p02(26));
        f = new gf2(Short.TYPE, Short.class, new p02(27));
        g = new gf2(Integer.TYPE, Integer.class, new p02(28));
        int i3 = 0;
        h = new td3(AtomicInteger.class, new ud3(1).nullSafe(), i3);
        i = new td3(AtomicBoolean.class, new ud3(0).nullSafe(), i3);
        j = new td3(AtomicIntegerArray.class, new p02(3).nullSafe(), i3);
        k = new p02(4);
        l = new gf2(Character.TYPE, Character.class, new p02(7));
        p02 p02Var2 = new p02(8);
        m = new p02(9);
        n = new p02(10);
        o = new p02(11);
        int i4 = 0;
        p = new td3(String.class, p02Var2, i4);
        q = new td3(StringBuilder.class, new p02(12), i4);
        r = new td3(StringBuffer.class, new p02(14), i4);
        s = new td3(URL.class, new p02(15), i4);
        t = new td3(URI.class, new p02(16), i4);
        u = new td3(InetAddress.class, new p02(17), 1);
        int i5 = 0;
        v = new td3(UUID.class, new p02(18), i5);
        w = new td3(Currency.class, new p02(19).nullSafe(), i5);
        x = new o02(new p02(20), 1);
        y = new td3(Locale.class, new p02(21), 0);
        p02 p02Var3 = new p02(22);
        z = p02Var3;
        A = new td3(JsonElement.class, p02Var3, 1);
        B = new wo(6);
    }
}
