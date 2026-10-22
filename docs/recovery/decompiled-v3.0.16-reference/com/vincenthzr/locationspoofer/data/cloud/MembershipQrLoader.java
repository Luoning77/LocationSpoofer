package com.vincenthzr.locationspoofer.data.cloud;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mc0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipQrLoader {
    public static final MembershipQrLoader INSTANCE = new MembershipQrLoader();
    private static final MembershipQrSource source = new MembershipQrSource(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.cloud.MembershipQrLoader$load$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.cloud.MembershipQrLoader$load$2", f = "MembershipQrLoader.kt", l = {mc0.d}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, q60 q60Var) {
            super(2, q60Var);
            this.$url = str;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass2(this.$url, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws CloudException {
            int i;
            int i2 = this.label;
            if (i2 == 0) {
                ee0.J(obj);
                MembershipQrSource membershipQrSource = MembershipQrLoader.source;
                String str = this.$url;
                this.label = 1;
                obj = membershipQrSource.read(str, this);
                z70 z70Var = z70.e;
                if (obj == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            byte[] bArr = (byte[]) obj;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            if (1 > i3 || i3 >= 2049 || 1 > (i = options.outHeight) || i >= 2049) {
                b81.w("payment_qr_unavailable");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray != null) {
                return bitmapDecodeByteArray;
            }
            b81.w("payment_qr_unavailable");
            return null;
        }
    }

    private MembershipQrLoader() {
    }

    public final Object load(String str, q60 q60Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), q60Var);
    }
}
