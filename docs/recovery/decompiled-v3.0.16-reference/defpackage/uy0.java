package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class uy0 {
    public static final mx0[] a;
    public static final Map b;

    static {
        mx0 mx0Var = new mx0(mx0.i, "");
        uu uuVar = mx0.f;
        mx0 mx0Var2 = new mx0(uuVar, "GET");
        mx0 mx0Var3 = new mx0(uuVar, "POST");
        uu uuVar2 = mx0.g;
        mx0 mx0Var4 = new mx0(uuVar2, "/");
        mx0 mx0Var5 = new mx0(uuVar2, "/index.html");
        uu uuVar3 = mx0.h;
        mx0 mx0Var6 = new mx0(uuVar3, "http");
        mx0 mx0Var7 = new mx0(uuVar3, "https");
        uu uuVar4 = mx0.e;
        mx0[] mx0VarArr = {mx0Var, mx0Var2, mx0Var3, mx0Var4, mx0Var5, mx0Var6, mx0Var7, new mx0(uuVar4, "200"), new mx0(uuVar4, "204"), new mx0(uuVar4, "206"), new mx0(uuVar4, "304"), new mx0(uuVar4, "400"), new mx0(uuVar4, "404"), new mx0(uuVar4, "500"), new mx0("accept-charset", ""), new mx0("accept-encoding", "gzip, deflate"), new mx0("accept-language", ""), new mx0("accept-ranges", ""), new mx0("accept", ""), new mx0("access-control-allow-origin", ""), new mx0("age", ""), new mx0("allow", ""), new mx0("authorization", ""), new mx0("cache-control", ""), new mx0("content-disposition", ""), new mx0("content-encoding", ""), new mx0("content-language", ""), new mx0("content-length", ""), new mx0("content-location", ""), new mx0("content-range", ""), new mx0("content-type", ""), new mx0("cookie", ""), new mx0("date", ""), new mx0("etag", ""), new mx0("expect", ""), new mx0("expires", ""), new mx0("from", ""), new mx0("host", ""), new mx0("if-match", ""), new mx0("if-modified-since", ""), new mx0("if-none-match", ""), new mx0("if-range", ""), new mx0("if-unmodified-since", ""), new mx0("last-modified", ""), new mx0("link", ""), new mx0("location", ""), new mx0("max-forwards", ""), new mx0("proxy-authenticate", ""), new mx0("proxy-authorization", ""), new mx0("range", ""), new mx0("referer", ""), new mx0("refresh", ""), new mx0("retry-after", ""), new mx0("server", ""), new mx0("set-cookie", ""), new mx0("strict-transport-security", ""), new mx0("transfer-encoding", ""), new mx0("user-agent", ""), new mx0("vary", ""), new mx0("via", ""), new mx0("www-authenticate", "")};
        a = mx0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(mx0VarArr[i].a)) {
                linkedHashMap.put(mx0VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(uu uuVar) throws IOException {
        uuVar.getClass();
        int iA = uuVar.a();
        for (int i = 0; i < iA; i++) {
            byte bD = uuVar.d(i);
            if (65 <= bD && bD < 91) {
                fo.r("PROTOCOL_ERROR response malformed: mixed case name: ".concat(uuVar.h()));
                return;
            }
        }
    }
}
