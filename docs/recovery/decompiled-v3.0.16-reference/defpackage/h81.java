package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h81 extends i81 {
    public static final g81 s = new g81();
    public static final JsonPrimitive t = new JsonPrimitive("closed");
    public final ArrayList p;
    public String q;
    public JsonElement r;

    public h81() {
        super(s);
        this.p = new ArrayList();
        this.r = r71.e;
    }

    @Override // defpackage.i81
    public final void F() {
        JsonArray jsonArray = new JsonArray();
        q0(jsonArray);
        this.p.add(jsonArray);
    }

    @Override // defpackage.i81
    public final void O() {
        JsonObject jsonObject = new JsonObject();
        q0(jsonObject);
        this.p.add(jsonObject);
    }

    @Override // defpackage.i81
    public final void U() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(p0() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.i81
    public final void c0() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(p0() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.i81, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            arrayList.add(t);
        } else {
            fo.r("Incomplete document");
        }
    }

    @Override // defpackage.i81
    public final void d0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(p0() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.q = str;
    }

    @Override // defpackage.i81
    public final i81 f0() {
        q0(r71.e);
        return this;
    }

    @Override // defpackage.i81
    public final void i0(double d) {
        if (this.i || !(Double.isNaN(d) || Double.isInfinite(d))) {
            q0(new JsonPrimitive(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // defpackage.i81
    public final void j0(long j) {
        q0(new JsonPrimitive(Long.valueOf(j)));
    }

    @Override // defpackage.i81
    public final void k0(Boolean bool) {
        if (bool == null) {
            q0(r71.e);
        } else {
            q0(new JsonPrimitive(bool));
        }
    }

    @Override // defpackage.i81
    public final void l0(Number number) {
        if (number == null) {
            q0(r71.e);
            return;
        }
        if (!this.i) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                fo.q(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        q0(new JsonPrimitive(number));
    }

    @Override // defpackage.i81
    public final void m0(String str) {
        if (str == null) {
            q0(r71.e);
        } else {
            q0(new JsonPrimitive(str));
        }
    }

    @Override // defpackage.i81
    public final void n0(boolean z) {
        q0(new JsonPrimitive(Boolean.valueOf(z)));
    }

    public final JsonElement p0() {
        ArrayList arrayList = this.p;
        return (JsonElement) arrayList.get(arrayList.size() - 1);
    }

    public final void q0(JsonElement jsonElement) {
        if (this.q != null) {
            if (!jsonElement.isJsonNull() || this.l) {
                ((JsonObject) p0()).add(this.q, jsonElement);
            }
            this.q = null;
            return;
        }
        if (this.p.isEmpty()) {
            this.r = jsonElement;
            return;
        }
        JsonElement jsonElementP0 = p0();
        if (!(jsonElementP0 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementP0).add(jsonElement);
    }

    @Override // defpackage.i81, java.io.Flushable
    public final void flush() {
    }
}
