package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w7 extends u7 {
    public final /* synthetic */ int a;

    public /* synthetic */ w7(int i) {
        this.a = i;
    }

    @Override // defpackage.u7
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 3:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            default:
                r41 r41Var = (r41) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = r41Var.f;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        r41Var = new r41(r41Var.e, null, r41Var.g, r41Var.h);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r41Var);
                if (gs0.l(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // defpackage.u7
    public t7 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new t7(vj0.e);
                }
                for (String str : strArr) {
                    if (zm3.k(context, str) != 0) {
                        return null;
                    }
                }
                int iM = jq1.M(strArr.length);
                if (iM < 16) {
                    iM = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new t7(linkedHashMap);
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                if (zm3.k(context, str3) == 0) {
                    return new t7(Boolean.TRUE);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.u7
    public final Object c(Intent intent, int i) {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListV0 = yo.v0(stringArrayExtra);
                        Iterator it = arrayListV0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(az.Y(arrayListV0, 10), az.Y(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new i52(it.next(), it2.next()));
                        }
                        return jq1.Q(arrayList2);
                    }
                }
                return vj0.e;
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                return new r7(intent, i);
            default:
                return new r7(intent, i);
        }
    }
}
