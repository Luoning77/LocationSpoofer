package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.md0;
import defpackage.zy;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Ipv4PreferredDns implements md0 {
    private final md0 delegate;

    public /* synthetic */ Ipv4PreferredDns(md0 md0Var, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? md0.d : md0Var);
    }

    @Override // defpackage.md0
    public List<InetAddress> lookup(String str) {
        str.getClass();
        return zy.C0(this.delegate.lookup(str), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.cloud.Ipv4PreferredDns$lookup$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(!(((InetAddress) t) instanceof Inet4Address) ? 1 : 0).compareTo(Integer.valueOf(!(((InetAddress) t2) instanceof Inet4Address) ? 1 : 0));
            }
        });
    }

    public Ipv4PreferredDns(md0 md0Var) {
        md0Var.getClass();
        this.delegate = md0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ipv4PreferredDns() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
