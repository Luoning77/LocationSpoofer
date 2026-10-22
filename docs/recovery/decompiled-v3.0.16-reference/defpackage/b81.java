package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class b81 implements pv2, pd0, ak3 {
    public final /* synthetic */ int e;

    public /* synthetic */ b81(int i) {
        this.e = i;
    }

    public static /* synthetic */ void d() {
        throw new iv();
    }

    public static /* synthetic */ void e(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void f(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, long j, String str) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void j(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void s(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void u() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void w(String str) throws CloudException {
        throw new CloudException(str, null, null, null, 14, null);
    }

    public static /* synthetic */ void x(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void y(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // defpackage.ak3
    public bc3 a(dj djVar) {
        return new bc3(djVar, d12.a);
    }

    @Override // defpackage.pv2
    public boolean b() {
        return false;
    }

    @Override // defpackage.pd0
    public double c(double d) {
        return d;
    }
}
