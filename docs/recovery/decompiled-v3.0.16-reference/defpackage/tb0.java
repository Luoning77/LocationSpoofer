package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tb0 implements ei0 {
    public final int a;
    public final int b;

    public tb0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        q21.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.ei0
    public final void a(mi0 mi0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = mi0Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(mi0Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(mi0Var.b(mi0Var.b - i3))) ? i + 2 : i3;
        }
        int iC = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iC + 1;
            int i7 = mi0Var.c;
            dm dmVar = mi0Var.a;
            if (i7 + i6 >= dmVar.c()) {
                iC = dmVar.c() - mi0Var.c;
                break;
            }
            iC = (Character.isHighSurrogate(mi0Var.b((mi0Var.c + i6) + (-1))) && Character.isLowSurrogate(mi0Var.b(mi0Var.c + i6))) ? iC + 2 : i6;
        }
        int i8 = mi0Var.c;
        mi0Var.a(i8, iC + i8);
        int i9 = mi0Var.b;
        mi0Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb0)) {
            return false;
        }
        tb0 tb0Var = (tb0) obj;
        return this.a == tb0Var.a && this.b == tb0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return az2.o(sb, this.b, ')');
    }
}
