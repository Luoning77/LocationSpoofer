package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bj implements Appendable {
    public final StringBuilder e;
    public final ArrayList f;
    public final ArrayList g;

    public bj() {
        this.e = new StringBuilder(16);
        this.f = new ArrayList();
        this.g = new ArrayList();
        new ArrayList();
    }

    public final void a(dj djVar) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append(djVar.f);
        List list = djVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cj cjVar = (cj) list.get(i);
                this.g.add(new aj(cjVar.b + length, cjVar.c + length, cjVar.a, cjVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof dj) {
            a((dj) charSequence);
            return this;
        }
        this.e.append(charSequence);
        return this;
    }

    public final void b(dj djVar, int i, int i2) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append((CharSequence) djVar.f, i, i2);
        List listA = ej.a(djVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                cj cjVar = (cj) listA.get(i3);
                this.g.add(new aj(cjVar.b + length, cjVar.c + length, cjVar.a, cjVar.d));
            }
        }
    }

    public final void c(String str) {
        this.e.append(str);
    }

    public final void d() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            q21.b("Nothing to pop.");
        }
        ((aj) arrayList.remove(arrayList.size() - 1)).c = this.e.length();
    }

    public final void e(int i) {
        ArrayList arrayList = this.f;
        if (i >= arrayList.size()) {
            q21.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            d();
        }
    }

    public final int f(uy2 uy2Var) {
        aj ajVar = new aj(uy2Var, this.e.length(), 0, 12);
        ArrayList arrayList = this.f;
        arrayList.add(ajVar);
        this.g.add(ajVar);
        return arrayList.size() - 1;
    }

    public final dj g() {
        StringBuilder sb = this.e;
        String string = sb.toString();
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((aj) arrayList.get(i)).a(sb.length()));
        }
        return new dj(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof dj) {
            b((dj) charSequence, i, i2);
            return this;
        }
        this.e.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.e.append(c);
        return this;
    }

    public bj(dj djVar) {
        this();
        a(djVar);
    }
}
