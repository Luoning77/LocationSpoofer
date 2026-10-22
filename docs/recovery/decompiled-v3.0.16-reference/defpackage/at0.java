package defpackage;

import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import io.github.libxposed.service.XposedService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class at0 {
    public boolean a;
    public long b;

    public final void a(String str, d31 d31Var) {
        Object wg2Var;
        XposedService xposedService = (XposedService) d31Var.g;
        byte[] bytes = str.getBytes(sw.a);
        bytes.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = Math.max(jCurrentTimeMillis, this.b + 1);
        Object obj = null;
        String str2 = bytes.length > 131072 ? "locationspoofer-config-" + UUID.randomUUID() + ".json" : null;
        boolean z = false;
        if (str2 != null) {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(xposedService.openRemoteFile(str2));
                try {
                    autoCloseOutputStream.write(bytes);
                    autoCloseOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(autoCloseOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                e = e;
                if (str2 != null && !z) {
                    try {
                        xposedService.deleteRemoteFile(str2);
                    } catch (Throwable unused) {
                    }
                }
                this.a = true;
                throw e;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 2);
        jSONObject.put("id", UUID.randomUUID().toString());
        jSONObject.put("published_at", jCurrentTimeMillis);
        jSONObject.put("sequence", this.b);
        try {
            wg2Var = new JSONObject(str).optJSONObject("runtime_permit");
        } catch (Throwable th3) {
            wg2Var = new wg2(th3);
        }
        if (!(wg2Var instanceof wg2)) {
            obj = wg2Var;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 != null) {
            jSONObject.put("binding_declaration", new JSONObject(jSONObject2.toString()));
        }
        if (str2 == null) {
            jSONObject.put("payload", str);
        } else {
            jSONObject.put("file", str2);
        }
        try {
            String string = jSONObject.toString();
            string.getClass();
            SharedPreferences.Editor editorEdit = ((SharedPreferences) d31Var.f).edit();
            JSONObject jSONObjectOptJSONObject = new JSONObject(string).optJSONObject("binding_declaration");
            if (jSONObjectOptJSONObject != null) {
                editorEdit.putString("runtime_binding_declaration", jSONObjectOptJSONObject.toString());
            }
            editorEdit.putString("snapshot", string);
            if (!editorEdit.commit()) {
                throw new IllegalStateException("Framework rejected config publication");
            }
            if (this.a || str2 != null) {
                try {
                    String[] strArrListRemoteFiles = xposedService.listRemoteFiles();
                    strArrListRemoteFiles.getClass();
                    List listF0 = yo.F0(strArrListRemoteFiles);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listF0) {
                        String str3 = (String) obj2;
                        str3.getClass();
                        if (s13.Z(str3, "locationspoofer-config-", false) && str3.endsWith(".json") && !l13.d0(str3, '/') && !l13.d0(str3, '\\') && !l13.c0(str3, "..", false) && !str3.equals(str2)) {
                            arrayList.add(obj2);
                        }
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        String str4 = (String) obj3;
                        str4.getClass();
                        xposedService.deleteRemoteFile(str4);
                    }
                    this.a = str2 != null;
                } catch (Throwable unused2) {
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
            if (str2 != null) {
                xposedService.deleteRemoteFile(str2);
            }
            this.a = true;
            throw e;
        }
    }
}
