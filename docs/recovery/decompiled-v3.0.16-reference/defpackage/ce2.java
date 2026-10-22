package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ce2 extends tg2 {
    public final /* synthetic */ int e;
    public final long f;
    public final Object g;
    public final du h;

    public /* synthetic */ ce2(Object obj, long j, du duVar, int i) {
        this.e = i;
        this.g = obj;
        this.f = j;
        this.h = duVar;
    }

    @Override // defpackage.tg2
    public final long contentLength() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.f;
    }

    @Override // defpackage.tg2
    public final kr1 contentType() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = kr1.e;
                try {
                    return mc0.p(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (kr1) obj;
        }
    }

    @Override // defpackage.tg2
    public final du source() {
        int i = this.e;
        du duVar = this.h;
        switch (i) {
            case 0:
                return (td2) duVar;
            default:
                return duVar;
        }
    }
}
