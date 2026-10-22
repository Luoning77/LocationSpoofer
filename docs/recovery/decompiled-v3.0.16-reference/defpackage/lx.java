package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lx {
    public static final u92 b = new u92(29);
    public static final gq0 c = new gq0(7);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final lx e;
    public static final lx f;
    public static final lx g;
    public static final lx h;
    public static final lx i;
    public static final lx j;
    public static final lx k;
    public static final lx l;
    public static final lx m;
    public static final lx n;
    public static final lx o;
    public static final lx p;
    public static final lx q;
    public static final lx r;
    public static final lx s;
    public static final lx t;
    public final String a;

    static {
        u92.n("SSL_RSA_WITH_NULL_MD5");
        u92.n("SSL_RSA_WITH_NULL_SHA");
        u92.n("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        u92.n("SSL_RSA_WITH_RC4_128_MD5");
        u92.n("SSL_RSA_WITH_RC4_128_SHA");
        u92.n("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        u92.n("SSL_RSA_WITH_DES_CBC_SHA");
        e = u92.n("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        u92.n("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        u92.n("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        u92.n("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        u92.n("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        u92.n("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        u92.n("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        u92.n("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        u92.n("SSL_DH_anon_WITH_RC4_128_MD5");
        u92.n("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        u92.n("SSL_DH_anon_WITH_DES_CBC_SHA");
        u92.n("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_KRB5_WITH_DES_CBC_SHA");
        u92.n("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_KRB5_WITH_RC4_128_SHA");
        u92.n("TLS_KRB5_WITH_DES_CBC_MD5");
        u92.n("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        u92.n("TLS_KRB5_WITH_RC4_128_MD5");
        u92.n("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        u92.n("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        u92.n("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        u92.n("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = u92.n("TLS_RSA_WITH_AES_128_CBC_SHA");
        u92.n("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        u92.n("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        u92.n("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = u92.n("TLS_RSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        u92.n("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        u92.n("TLS_RSA_WITH_NULL_SHA256");
        u92.n("TLS_RSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_RSA_WITH_AES_256_CBC_SHA256");
        u92.n("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        u92.n("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        u92.n("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        u92.n("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        u92.n("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        u92.n("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        u92.n("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        u92.n("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        u92.n("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        u92.n("TLS_PSK_WITH_RC4_128_SHA");
        u92.n("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_PSK_WITH_AES_128_CBC_SHA");
        u92.n("TLS_PSK_WITH_AES_256_CBC_SHA");
        u92.n("TLS_RSA_WITH_SEED_CBC_SHA");
        h = u92.n("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = u92.n("TLS_RSA_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        u92.n("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        u92.n("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        u92.n("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        u92.n("TLS_FALLBACK_SCSV");
        u92.n("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        u92.n("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        u92.n("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_ECDH_RSA_WITH_NULL_SHA");
        u92.n("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        u92.n("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        u92.n("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_ECDHE_RSA_WITH_NULL_SHA");
        u92.n("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        u92.n("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = u92.n("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = u92.n("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        u92.n("TLS_ECDH_anon_WITH_NULL_SHA");
        u92.n("TLS_ECDH_anon_WITH_RC4_128_SHA");
        u92.n("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        u92.n("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        u92.n("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        u92.n("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        u92.n("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        u92.n("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        u92.n("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = u92.n("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = u92.n("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        u92.n("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = u92.n("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = u92.n("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        u92.n("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        u92.n("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        u92.n("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = u92.n("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = u92.n("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        u92.n("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        u92.n("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = u92.n("TLS_AES_128_GCM_SHA256");
        s = u92.n("TLS_AES_256_GCM_SHA384");
        t = u92.n("TLS_CHACHA20_POLY1305_SHA256");
        u92.n("TLS_AES_128_CCM_SHA256");
        u92.n("TLS_AES_128_CCM_8_SHA256");
    }

    public lx(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
