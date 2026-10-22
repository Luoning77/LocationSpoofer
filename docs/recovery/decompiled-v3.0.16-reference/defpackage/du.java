package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface du extends sy2, ReadableByteChannel {
    String G(long j);

    int M(v32 v32Var);

    void S(long j);

    long Y();

    String Z(Charset charset);

    InputStream b0();

    String j(long j);

    uu n();

    uu o(long j);

    byte readByte();

    int readInt();

    short readShort();

    boolean s(long j);

    void skip(long j);

    String u();

    byte[] v();

    xt x();

    String y();
}
