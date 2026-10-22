package defpackage;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qy2 extends st {
    public final long a;

    public qy2(long j) {
        this.a = j;
    }

    @Override // defpackage.st
    public final void a(float f, long j, je jeVar) {
        jeVar.e(1.0f);
        long jC = this.a;
        if (f != 1.0f) {
            jC = hz.c(hz.d(jC) * f, jC);
        }
        jeVar.g(jC);
        if (((Shader) jeVar.d) != null) {
            jeVar.k(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy2)) {
            return false;
        }
        long j = ((qy2) obj).a;
        int i = hz.h;
        return ye3.a(this.a, j);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) hz.i(this.a)) + ')';
    }
}
