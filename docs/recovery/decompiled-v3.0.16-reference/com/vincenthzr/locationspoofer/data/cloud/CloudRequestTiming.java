package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.bd2;
import defpackage.dv;
import defpackage.fo;
import defpackage.gx0;
import defpackage.mo;
import defpackage.n40;
import defpackage.o51;
import defpackage.qg2;
import defpackage.s13;
import defpackage.yf2;
import defpackage.yl0;
import defpackage.zl0;
import defpackage.zy;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRequestTiming {
    public static final CloudRequestTiming INSTANCE = new CloudRequestTiming();
    private static final mo samples = new mo();
    private static final AtomicLong sequence = new AtomicLong();
    private static final yl0 listenerFactory = new fo(8);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Sample {
        private final long nanos;
        private final String phase;

        public Sample(String str, long j) {
            str.getClass();
            this.phase = str;
            this.nanos = j;
        }

        public static /* synthetic */ Sample copy$default(Sample sample, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sample.phase;
            }
            if ((i & 2) != 0) {
                j = sample.nanos;
            }
            return sample.copy(str, j);
        }

        public final String component1() {
            return this.phase;
        }

        public final long component2() {
            return this.nanos;
        }

        public final Sample copy(String str, long j) {
            str.getClass();
            return new Sample(str, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sample)) {
                return false;
            }
            Sample sample = (Sample) obj;
            return o51.f(this.phase, sample.phase) && this.nanos == sample.nanos;
        }

        public final long getNanos() {
            return this.nanos;
        }

        public final String getPhase() {
            return this.phase;
        }

        public int hashCode() {
            return Long.hashCode(this.nanos) + (this.phase.hashCode() * 31);
        }

        public String toString() {
            return "Sample(phase=" + this.phase + ", nanos=" + this.nanos + ")";
        }
    }

    private CloudRequestTiming() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zl0 listenerFactory$lambda$4(final dv dvVar) {
        dvVar.getClass();
        return new zl0(dvVar) { // from class: com.vincenthzr.locationspoofer.data.cloud.CloudRequestTiming$listenerFactory$1$1
            private final String category;
            private long connect;
            private long dns;
            private final long id = CloudRequestTiming.sequence.incrementAndGet();
            private long responseWait;
            private long started;
            private long tls;

            {
                this.category = CloudRequestTiming.INSTANCE.category(dvVar.request().a.b());
            }

            @Override // defpackage.zl0
            public void callEnd(dv dvVar2) {
                dvVar2.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".total"), this.started);
            }

            @Override // defpackage.zl0
            public void callFailed(dv dvVar2, IOException iOException) {
                dvVar2.getClass();
                iOException.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".failed"), this.started);
            }

            @Override // defpackage.zl0
            public void callStart(dv dvVar2) {
                dvVar2.getClass();
                this.started = System.nanoTime();
            }

            @Override // defpackage.zl0
            public void connectEnd(dv dvVar2, InetSocketAddress inetSocketAddress, Proxy proxy, bd2 bd2Var) {
                dvVar2.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".connect"), this.connect);
            }

            @Override // defpackage.zl0
            public void connectStart(dv dvVar2, InetSocketAddress inetSocketAddress, Proxy proxy) {
                dvVar2.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                this.connect = System.nanoTime();
            }

            @Override // defpackage.zl0
            public void connectionAcquired(dv dvVar2, n40 n40Var) {
                dvVar2.getClass();
                n40Var.getClass();
            }

            @Override // defpackage.zl0
            public void dnsEnd(dv dvVar2, String str, List<? extends InetAddress> list) {
                dvVar2.getClass();
                str.getClass();
                list.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".dns"), this.dns);
            }

            @Override // defpackage.zl0
            public void dnsStart(dv dvVar2, String str) {
                dvVar2.getClass();
                str.getClass();
                this.dns = System.nanoTime();
            }

            @Override // defpackage.zl0
            public void requestHeadersEnd(dv dvVar2, yf2 yf2Var) {
                dvVar2.getClass();
                yf2Var.getClass();
                this.responseWait = System.nanoTime();
            }

            @Override // defpackage.zl0
            public void responseHeadersEnd(dv dvVar2, qg2 qg2Var) {
                dvVar2.getClass();
                qg2Var.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".response"), this.responseWait);
                qg2.A(qg2Var, "Server-Timing");
            }

            @Override // defpackage.zl0
            public void secureConnectEnd(dv dvVar2, gx0 gx0Var) {
                dvVar2.getClass();
                CloudRequestTiming.INSTANCE.record(az2.y(this.category, ".tls"), this.tls);
            }

            @Override // defpackage.zl0
            public void secureConnectStart(dv dvVar2) {
                dvVar2.getClass();
                this.tls = System.nanoTime();
            }
        };
    }

    public final String category(String str) {
        str.getClass();
        if (s13.Z(str, "/v2/maps/", false)) {
            return "map";
        }
        if (str.equals("/v2/devices/enroll")) {
            return "enroll";
        }
        if (s13.Z(str, "/v2/auth/", false)) {
            return "auth";
        }
        if (str.equals("/v2/account")) {
            return "account";
        }
        return s13.Z(str, "/v2/runtime/", false) ? "runtime" : "data";
    }

    public final yl0 getListenerFactory() {
        return listenerFactory;
    }

    public final void record(String str, long j) {
        str.getClass();
        long jNanoTime = System.nanoTime() - j;
        if (jNanoTime < 0) {
            jNanoTime = 0;
        }
        Sample sample = new Sample(str, jNanoTime);
        mo moVar = samples;
        synchronized (moVar) {
            try {
                if (moVar.a() == 512) {
                    moVar.removeFirst();
                }
                moVar.addLast(sample);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void reset() {
        mo moVar = samples;
        synchronized (moVar) {
            moVar.clear();
        }
    }

    public final List<Sample> snapshot() {
        List<Sample> listJ0;
        mo moVar = samples;
        synchronized (moVar) {
            listJ0 = zy.J0(moVar);
        }
        return listJ0;
    }
}
