package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.jy;
import defpackage.lg;
import defpackage.mf3;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 extends FilterInputStream {
    final /* synthetic */ CloudMapResourceCallFactory.ResourceCall.GuardedBody this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1(Object obj, CloudMapResourceCallFactory.ResourceCall.GuardedBody guardedBody) {
        super((InputStream) obj);
        this.this$0 = guardedBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 reset$lambda$4(CloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1 cloudMapResourceCallFactory$ResourceCall$GuardedBody$guardedSource$1$1$1) throws IOException {
        super.reset();
        return mf3.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return ((Number) this.this$0.guarded(new jy(this, 2))).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(final byte[] bArr, final int i, final int i2) {
        bArr.getClass();
        return ((Number) this.this$0.guarded(new au0() { // from class: ky
            @Override // defpackage.au0
            public final Object invoke() {
                return Integer.valueOf(super/*java.io.FilterInputStream*/.read(bArr, i, i2));
            }
        })).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        this.this$0.guarded(new jy(this, 0));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return ((Number) this.this$0.guarded(new lg(1, j, this))).longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return ((Number) this.this$0.guarded(new jy(this, 1))).intValue();
    }
}
