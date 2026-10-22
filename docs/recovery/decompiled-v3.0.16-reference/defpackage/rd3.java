package defpackage;

import com.google.gson.JsonElement;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class rd3 {
    public final Object fromJson(Reader reader) {
        return read(new z71(reader));
    }

    public final Object fromJsonTree(JsonElement jsonElement) {
        try {
            f81 f81Var = new f81(f81.x);
            f81Var.t = new Object[32];
            f81Var.u = 0;
            f81Var.v = new String[32];
            f81Var.w = new int[32];
            f81Var.I0(jsonElement);
            return read(f81Var);
        } catch (IOException e) {
            throw new l71(e);
        }
    }

    public final rd3 nullSafe() {
        return new b03(this, 3);
    }

    public abstract Object read(z71 z71Var);

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new l71(e);
        }
    }

    public final JsonElement toJsonTree(Object obj) {
        try {
            h81 h81Var = new h81();
            write(h81Var, obj);
            ArrayList arrayList = h81Var.p;
            if (arrayList.isEmpty()) {
                return h81Var.r;
            }
            throw new IllegalStateException("Expected one JSON element but was " + arrayList);
        } catch (IOException e) {
            throw new l71(e);
        }
    }

    public abstract void write(i81 i81Var, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, Object obj) {
        write(new i81(writer), obj);
    }
}
