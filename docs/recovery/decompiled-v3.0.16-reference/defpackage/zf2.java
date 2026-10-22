package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zf2 extends cg2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zf2(kr1 kr1Var, Object obj, int i) {
        this.a = i;
        this.b = kr1Var;
        this.c = obj;
    }

    @Override // defpackage.cg2
    public final long contentLength() {
        switch (this.a) {
            case 0:
                return ((File) this.c).length();
            default:
                return ((uu) this.c).a();
        }
    }

    @Override // defpackage.cg2
    public final kr1 contentType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.cg2
    public final void writeTo(cu cuVar) {
        int i = this.a;
        Object obj = this.c;
        cuVar.getClass();
        switch (i) {
            case 0:
                File file = (File) obj;
                Logger logger = l12.a;
                file.getClass();
                ep epVar = new ep(1, new FileInputStream(file), pa3.d);
                try {
                    cuVar.B(epVar);
                    epVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(epVar, th);
                        throw th2;
                    }
                }
            default:
                cuVar.X((uu) obj);
                return;
        }
    }
}
