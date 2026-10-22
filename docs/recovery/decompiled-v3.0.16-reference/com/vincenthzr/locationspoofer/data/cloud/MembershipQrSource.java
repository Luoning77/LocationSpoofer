package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.b81;
import defpackage.bh3;
import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.j12;
import defpackage.ji2;
import defpackage.k12;
import defpackage.k33;
import defpackage.l13;
import defpackage.mf3;
import defpackage.nx0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qg2;
import defpackage.r60;
import defpackage.s90;
import defpackage.tg2;
import defpackage.xd2;
import defpackage.xp;
import defpackage.yf2;
import defpackage.yo;
import defpackage.yz0;
import defpackage.z70;
import defpackage.zz0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipQrSource {
    private static final int MAX_BYTES = 524288;
    private static final int MAX_REDIRECTS = 3;
    private final k12 http;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> REDIRECT_CODES = yo.H0(new Integer[]{301, 302, 303, 307, 308});
    private static final Set<String> IMAGE_TYPES = yo.H0(new String[]{"image/png", "image/jpeg", "image/gif", "image/webp"});

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipQrSource$read$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipQrSource", f = "MembershipQrSource.kt", l = {17}, m = "read")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipQrSource.this.read(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipQrSource$read$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipQrSource$read$2", f = "MembershipQrSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ MembershipQrSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, MembershipQrSource membershipQrSource, q60 q60Var) {
            super(2, q60Var);
            this.$url = str;
            this.this$0 = membershipQrSource;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass2(this.$url, this.this$0, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws CloudException {
            int i;
            yz0 yz0Var;
            if (this.label != 0) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            String strValidate = MembershipPaymentUrls.INSTANCE.validate(this.$url);
            int i2 = 0;
            while (i2 < 4) {
                k12 k12Var = this.this$0.http;
                xp xpVar = new xp(4);
                xpVar.r(strValidate);
                ((nx0) xpVar.c).q("Cache-Control", "no-store");
                yf2 yf2VarF = xpVar.f();
                k12Var.getClass();
                qg2 qg2VarExecute = new xd2(k12Var, yf2VarF).execute();
                try {
                    if (!MembershipQrSource.REDIRECT_CODES.contains(new Integer(qg2VarExecute.h))) {
                        tg2 tg2Var = qg2VarExecute.k;
                        if (tg2Var == null) {
                            throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                        }
                        String strA = qg2.A(qg2VarExecute, "Content-Type");
                        if (strA == null) {
                            strA = "";
                        }
                        String string = l13.D0(l13.z0(strA, ';')).toString();
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        String lowerCase = string.toLowerCase(locale);
                        lowerCase.getClass();
                        if (!qg2VarExecute.F() || !MembershipQrSource.IMAGE_TYPES.contains(lowerCase) || tg2Var.contentLength() > 524288) {
                            throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                        }
                        InputStream inputStreamByteStream = tg2Var.byteStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (byteArrayOutputStream.size() <= MembershipQrSource.MAX_BYTES && (i = inputStreamByteStream.read(bArr, 0, Math.min(8192, 524289 - byteArrayOutputStream.size()))) >= 0) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ji2.z(inputStreamByteStream, null);
                            byteArray.getClass();
                            if (byteArray.length == 0 || byteArray.length > MembershipQrSource.MAX_BYTES) {
                                throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                            }
                            qg2VarExecute.close();
                            return byteArray;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ji2.z(inputStreamByteStream, th);
                                throw th2;
                            }
                        }
                    }
                    if (i2 == 3) {
                        throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                    }
                    String strA2 = qg2.A(qg2VarExecute, "Location");
                    if (strA2 == null) {
                        throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                    }
                    zz0 zz0Var = qg2VarExecute.e.a;
                    zz0Var.getClass();
                    try {
                        yz0Var = new yz0();
                        yz0Var.f(zz0Var, strA2);
                    } catch (IllegalArgumentException unused) {
                        yz0Var = null;
                    }
                    zz0 zz0VarA = yz0Var != null ? yz0Var.a() : null;
                    if (zz0VarA == null) {
                        throw new CloudException("payment_qr_unavailable", null, null, null, 14, null);
                    }
                    String strValidate2 = MembershipPaymentUrls.INSTANCE.validate(zz0VarA.h);
                    qg2VarExecute.close();
                    i2++;
                    strValidate = strValidate2;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ji2.z(qg2VarExecute, th3);
                        throw th4;
                    }
                }
            }
            b81.w("payment_qr_unavailable");
            return null;
        }
    }

    public MembershipQrSource(k12 k12Var) {
        k12Var.getClass();
        this.http = k12Var;
        if (k12Var.l || k12Var.m) {
            fo.i("Failed requirement.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object read(String str, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        Object objWithContext = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ee0.J(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, this, null);
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 1;
            objWithContext = BuildersKt.withContext(io2, anonymousClass2, anonymousClass1);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objWithContext);
        }
        objWithContext.getClass();
        return objWithContext;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final k12 defaultClient() {
            j12 j12Var = new j12();
            j12Var.b(new Ipv4PreferredDns(null, 1, null));
            j12Var.h = false;
            j12Var.i = false;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            timeUnit.getClass();
            j12Var.x = bh3.b(5L);
            timeUnit.getClass();
            j12Var.y = bh3.b(8L);
            j12Var.a(12L);
            return new k12(j12Var);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MembershipQrSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MembershipQrSource(k12 k12Var, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? Companion.defaultClient() : k12Var);
    }
}
