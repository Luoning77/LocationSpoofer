package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e63 extends w53 {
    public final String b;
    public final int c;
    public final lu0 d;

    public e63(Object obj, String str, int i, lu0 lu0Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = lu0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return az2.o(sb, this.c, ')');
    }
}
