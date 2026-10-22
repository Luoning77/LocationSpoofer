package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface cu extends bw2, WritableByteChannel {
    long B(sy2 sy2Var);

    cu T(String str);

    cu X(uu uuVar);

    @Override // defpackage.bw2, java.io.Flushable
    void flush();

    cu l(long j);

    cu write(byte[] bArr);

    cu write(byte[] bArr, int i, int i2);

    cu writeByte(int i);

    cu writeInt(int i);

    cu writeShort(int i);
}
