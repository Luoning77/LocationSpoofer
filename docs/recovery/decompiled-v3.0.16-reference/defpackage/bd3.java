package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bd3 extends ad3 {
    public final /* synthetic */ int h;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                int i = this.g;
                this.g = i + 2;
                Object[] objArr = this.e;
                return new yo1(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.g;
                this.g = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.g;
                this.g = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
