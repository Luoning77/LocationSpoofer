package defpackage;

import java.nio.charset.Charset;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vk2 {
    public final Map a;
    public final au0 b;
    public final au0 c;
    public final LinkedHashMap d;
    public final LinkedHashSet e;
    public uk2 f;
    public long g;
    public long h;
    public pk2 i;
    public long j;
    public long k;
    public boolean l;
    public final Base64.Decoder m;
    public final Base64.Encoder n;

    public vk2(int i, au0 au0Var) {
        Map map = sk2.a;
        tk2 tk2Var = tk2.e;
        au0Var = (i & 4) != 0 ? new oi1(17) : au0Var;
        map.getClass();
        au0Var.getClass();
        this.a = map;
        this.b = tk2Var;
        this.c = au0Var;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashSet();
        this.g = Long.MIN_VALUE;
        this.h = Long.MIN_VALUE;
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
        this.m = Base64.getUrlDecoder();
        this.n = Base64.getUrlEncoder().withoutPadding();
    }

    public static final String c(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitiveF = e71.f((JsonElement) jq1.L(str, jsonObject));
        if (jsonPrimitiveF.isString()) {
            return jsonPrimitiveF.getContent();
        }
        fo.i("Failed requirement.");
        return null;
    }

    public final synchronized qk2 a(rk2 rk2Var, pk2 pk2Var, Set set) {
        qk2 qk2VarB;
        try {
            rk2Var.getClass();
            pk2Var.getClass();
            set.getClass();
            qk2VarB = b(rk2Var);
            if (!qk2VarB.b.equals(pk2Var) || !qk2VarB.c.containsAll(set)) {
                throw new IllegalArgumentException("运行许可身份或权限不匹配");
            }
            i52 i52VarI = i();
            long jLongValue = ((Number) i52VarI.e).longValue();
            long jLongValue2 = ((Number) i52VarI.f).longValue();
            long j = qk2VarB.d;
            if (j > 60000 + jLongValue || qk2VarB.e <= jLongValue) {
                throw new IllegalArgumentException("运行许可已过期");
            }
            if (j < this.g || this.e.contains(qk2VarB.b.d)) {
                throw new IllegalArgumentException("运行许可回放");
            }
            if (qk2VarB.d <= this.h) {
                throw new IllegalArgumentException("已停止的许可不能再次运行");
            }
            pk2 pk2Var2 = this.i;
            if (pk2Var2 != null && !pk2Var2.equals(qk2VarB.b) && o51.f(qk2VarB.b.d, pk2Var2.d)) {
                throw new IllegalArgumentException("同一会话不能改变设备绑定");
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = rk2Var.a.getBytes(sw.a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            String strZ0 = yo.z0(bArrDigest, new yk1(25));
            uk2 uk2Var = (uk2) this.d.get(strZ0);
            if (uk2Var == null) {
                long j2 = qk2VarB.e;
                uk2Var = new uk2(qk2VarB, Math.min(j2 - jLongValue, j2 - qk2VarB.d) + jLongValue2);
            }
            if (jLongValue2 >= uk2Var.b) {
                throw new IllegalArgumentException("运行许可单调有效期已结束");
            }
            if (pk2Var2 != null && !pk2Var2.equals(qk2VarB.b)) {
                this.e.add(pk2Var2.d);
            }
            this.d.put(strZ0, uk2Var);
            this.f = uk2Var;
            this.g = qk2VarB.d;
            this.i = qk2VarB.b;
            while (this.d.size() > 256) {
                LinkedHashMap linkedHashMap = this.d;
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                linkedHashMap.remove(zy.m0(setKeySet));
            }
            while (this.e.size() > 256) {
                LinkedHashSet linkedHashSet = this.e;
                linkedHashSet.remove(zy.m0(linkedHashSet));
            }
        } catch (Throwable th) {
            throw th;
        }
        return qk2VarB;
    }

    public final synchronized qk2 b(rk2 rk2Var) {
        int length;
        String strC;
        pk2 pk2Var;
        ArrayList arrayList;
        long jG;
        long jG2;
        try {
            rk2Var.getClass();
            int length2 = rk2Var.a.length();
            if (1 > length2 || length2 >= 16385 || 1 > (length = rk2Var.b.length()) || length >= 108) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            byte[] bArrE = e(12288, rk2Var.a);
            Charset charset = sw.a;
            String str = new String(bArrE, charset);
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            if (!Arrays.equals(bytes, bArrE)) {
                throw new IllegalArgumentException("许可必须是有效 UTF-8");
            }
            JsonObject jsonObjectE = e71.e(t61.d.c(str));
            if (!o51.f(jsonObjectE.keySet(), yo.H0(new String[]{"keyId", "userId", "deviceId", "publicKeyFingerprint", "sessionId", "capabilities", "issuedAt", "expiresAt"}))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            strC = c(jsonObjectE, "keyId");
            String str2 = (String) this.a.get(strC);
            if (str2 == null) {
                throw new IllegalStateException("未知许可签名密钥");
            }
            ECPublicKey eCPublicKeyG = g(str2);
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(eCPublicKeyG);
            byte[] bytes2 = ("locationspoofer-runtime-v2\n" + rk2Var.a).getBytes(charset);
            bytes2.getClass();
            signature.update(bytes2);
            if (!signature.verify(e(80, rk2Var.b))) {
                throw new IllegalArgumentException("运行许可签名无效");
            }
            String strC2 = c(jsonObjectE, "userId");
            String strC3 = c(jsonObjectE, "deviceId");
            String strC4 = c(jsonObjectE, "publicKeyFingerprint");
            String strC5 = c(jsonObjectE, "sessionId");
            pk2Var = new pk2(strC2, strC3, strC4, strC5);
            List<String> listG = am1.G(strC2, strC3, strC5);
            if (!listG.isEmpty()) {
                for (String str3 : listG) {
                    Pattern patternCompile = Pattern.compile("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}");
                    patternCompile.getClass();
                    str3.getClass();
                    if (!patternCompile.matcher(str3).matches()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            String str4 = pk2Var.c;
            Pattern patternCompile2 = Pattern.compile("[a-f0-9]{64}");
            patternCompile2.getClass();
            str4.getClass();
            if (!patternCompile2.matcher(str4).matches()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            JsonArray jsonArrayD = e71.d((JsonElement) jq1.L("capabilities", jsonObjectE));
            arrayList = new ArrayList(az.Y(jsonArrayD, 10));
            Iterator<JsonElement> it = jsonArrayD.iterator();
            while (it.hasNext()) {
                JsonPrimitive jsonPrimitiveF = e71.f(it.next());
                if (!jsonPrimitiveF.isString()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                arrayList.add(jsonPrimitiveF.getContent());
            }
            if (arrayList.isEmpty() || arrayList.size() > 3 || zy.h0(arrayList).size() != arrayList.size()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (!yo.H0(new String[]{"spoof", "route", "environment"}).contains((String) obj)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            JsonPrimitive jsonPrimitiveF2 = e71.f((JsonElement) jq1.L("issuedAt", jsonObjectE));
            if (jsonPrimitiveF2.isString()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            jG = e71.g(jsonPrimitiveF2);
            JsonPrimitive jsonPrimitiveF3 = e71.f((JsonElement) jq1.L("expiresAt", jsonObjectE));
            if (jsonPrimitiveF3.isString()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            jG2 = e71.g(jsonPrimitiveF3);
            if (jG <= 0 || jG2 <= jG || jG2 - jG > 120000) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return new qk2(strC, pk2Var, zy.N0(arrayList), jG, jG2);
    }

    public final synchronized void d() {
        try {
            uk2 uk2Var = this.f;
            if (uk2Var != null) {
                this.h = Math.max(this.h, uk2Var.a.d);
            }
            this.f = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final byte[] e(int i, String str) {
        Pattern patternCompile = Pattern.compile("[A-Za-z0-9_-]+");
        patternCompile.getClass();
        str.getClass();
        if (!patternCompile.matcher(str).matches()) {
            fo.i("Failed requirement.");
            return null;
        }
        byte[] bArrDecode = this.m.decode(str);
        if (bArrDecode.length <= i && o51.f(this.n.encodeToString(bArrDecode), str)) {
            return bArrDecode;
        }
        fo.i("Failed requirement.");
        return null;
    }

    public final synchronized boolean f(pk2 pk2Var, Set set) {
        Object wg2Var;
        set.getClass();
        try {
            uk2 uk2Var = this.f;
            boolean z = false;
            if (uk2Var == null) {
                return false;
            }
            i52 i52VarI = i();
            long jLongValue = ((Number) i52VarI.e).longValue();
            if (((Number) i52VarI.f).longValue() < uk2Var.b) {
                qk2 qk2Var = uk2Var.a;
                if (jLongValue < qk2Var.e && (pk2Var == null || pk2Var.equals(qk2Var.b))) {
                    if (uk2Var.a.c.containsAll(set)) {
                        z = true;
                    }
                }
            }
            wg2Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        Object obj = Boolean.FALSE;
        if (wg2Var instanceof wg2) {
            wg2Var = obj;
        }
        return ((Boolean) wg2Var).booleanValue();
    }

    public final ECPublicKey g(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(e(200, str)));
        publicKeyGeneratePublic.getClass();
        ECPublicKey eCPublicKey = (ECPublicKey) publicKeyGeneratePublic;
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class);
        if (o51.f(eCPublicKey.getParams().getCurve(), eCParameterSpec.getCurve()) && o51.f(eCPublicKey.getParams().getGenerator(), eCParameterSpec.getGenerator()) && o51.f(eCPublicKey.getParams().getOrder(), eCParameterSpec.getOrder()) && eCPublicKey.getParams().getCofactor() == eCParameterSpec.getCofactor()) {
            return eCPublicKey;
        }
        fo.i("Failed requirement.");
        return null;
    }

    public final synchronized long h(pk2 pk2Var, Set set) {
        Object wg2Var;
        set.getClass();
        try {
            uk2 uk2Var = this.f;
            if (uk2Var == null) {
                return 0L;
            }
            i52 i52VarI = i();
            long jLongValue = ((Number) i52VarI.e).longValue();
            long jLongValue2 = ((Number) i52VarI.f).longValue();
            if (pk2Var == null || pk2Var.equals(uk2Var.a.b)) {
                if (uk2Var.a.c.containsAll(set)) {
                    long jMin = Math.min(uk2Var.b - jLongValue2, uk2Var.a.e - jLongValue);
                    if (jMin < 0) {
                        jMin = 0;
                    }
                    wg2Var = Long.valueOf(jMin);
                }
            }
            return 0L;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = 0L;
        }
        return ((Number) wg2Var).longValue();
    }

    public final i52 i() {
        long jLongValue = ((Number) this.b.invoke()).longValue();
        long jLongValue2 = ((Number) this.c.invoke()).longValue();
        long j = this.j;
        if ((j != Long.MIN_VALUE && jLongValue < j - 1000) || jLongValue2 < this.k) {
            this.l = true;
        }
        if (this.l) {
            fo.i("运行许可时钟回拨");
            return null;
        }
        this.j = Math.max(j, jLongValue);
        this.k = Math.max(this.k, jLongValue2);
        return new i52(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
    }
}
