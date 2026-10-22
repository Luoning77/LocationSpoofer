package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.am1;
import defpackage.md0;
import defpackage.yo;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRepository$Companion$cloudDefaultDns$1 implements md0 {
    @Override // defpackage.md0
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        str.getClass();
        if (str.equals("server.vincenthzr.org")) {
            return am1.F(InetAddress.getByName("127.0.0.1"));
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return yo.F0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
