package com.vincenthzr.locationspoofer.xposed.hooks.access;

import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import defpackage.au0;
import defpackage.j41;
import defpackage.k41;
import defpackage.l13;
import defpackage.mh0;
import defpackage.o51;
import defpackage.zj0;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SimulationTargetPolicy {
    public static final SimulationTargetPolicy INSTANCE = new SimulationTargetPolicy();

    private SimulationTargetPolicy() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113 A[EDGE_INSN: B:100:0x0113->B:68:0x0113 BREAK  A[LOOP:1: B:63:0x00fe->B:102:0x00fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[LOOP:3: B:38:0x008b->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c2 A[SYNTHETIC] */
    public final boolean allows(int i, String str, JSONObject jSONObject, Set<String> set, au0 au0Var) {
        Iterator it;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        Iterator it2;
        j41 j41Var;
        String strOptString;
        ArrayList arrayList3;
        jSONObject.getClass();
        set.getClass();
        au0Var.getClass();
        if (jSONObject.optBoolean("active", false)) {
            Set setN0 = null;
            String string = str != null ? l13.D0(l13.A0(str, ":")).toString() : null;
            if (!o51.f(string, SelfHostedUpdates.APPLICATION_ID) && !o51.f(str, SelfHostedUpdates.APPLICATION_ID) && ((i > 1000 || str != null) && (string == null || !set.contains(string)))) {
                Set set2 = (Set) au0Var.invoke();
                boolean z = set2 instanceof Collection;
                if (!z || !set2.isEmpty()) {
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        if (l13.A0((String) it3.next(), ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                        }
                    }
                    if (z || !set2.isEmpty()) {
                        it = set2.iterator();
                        while (it.hasNext()) {
                            if (set.contains(l13.A0((String) it.next(), ":"))) {
                            }
                        }
                        if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                            jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                            if (jSONArrayOptJSONArray != null) {
                                k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
                                arrayList2 = new ArrayList();
                                it2 = k41VarF0.iterator();
                                while (true) {
                                    j41Var = (j41) it2;
                                    if (j41Var.g) {
                                        break;
                                    }
                                    strOptString = jSONArrayOptJSONArray.optString(j41Var.nextInt(), null);
                                    if (strOptString != null) {
                                        arrayList2.add(strOptString);
                                    }
                                }
                                setN0 = zy.N0(arrayList2);
                            }
                            if (setN0 == null) {
                                setN0 = zj0.e;
                            }
                            if (!setN0.isEmpty()) {
                                if (string == null && setN0.contains(string)) {
                                    return true;
                                }
                                if (str == null && setN0.contains(str)) {
                                    return true;
                                }
                                arrayList = new ArrayList();
                                for (Object obj : set2) {
                                    str2 = (String) obj;
                                    if (!setN0.contains(str2) || setN0.contains(l13.A0(str2, ":"))) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    return true;
                                }
                            }
                        } else if (i >= 10000) {
                            if (string == null && !set.contains(string)) {
                                return true;
                            }
                            arrayList3 = new ArrayList();
                            for (Object obj2 : set2) {
                                if (!set.contains(l13.A0((String) obj2, ":"))) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                return true;
                            }
                        }
                    } else if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                        if (jSONArrayOptJSONArray != null) {
                            k41 k41VarF1 = mh0.f0(0, jSONArrayOptJSONArray.length());
                            arrayList2 = new ArrayList();
                            it2 = k41VarF1.iterator();
                            while (true) {
                                j41Var = (j41) it2;
                                if (j41Var.g) {
                                    break;
                                    break;
                                }
                                strOptString = jSONArrayOptJSONArray.optString(j41Var.nextInt(), null);
                                if (strOptString != null) {
                                    arrayList2.add(strOptString);
                                }
                            }
                            setN0 = zy.N0(arrayList2);
                        }
                        if (setN0 == null) {
                            setN0 = zj0.e;
                        }
                        if (!setN0.isEmpty()) {
                            if (string == null) {
                            }
                            if (str == null) {
                            }
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                                str2 = (String) obj;
                                if (!setN0.contains(str2)) {
                                }
                                arrayList.add(obj);
                            }
                            if (!arrayList.isEmpty()) {
                                return true;
                            }
                        }
                    } else if (i >= 10000) {
                        if (string == null) {
                        }
                        arrayList3 = new ArrayList();
                        while (r9.hasNext()) {
                            if (!set.contains(l13.A0((String) obj2, ":"))) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                } else if (z) {
                    it = set2.iterator();
                    while (it.hasNext()) {
                        if (set.contains(l13.A0((String) it.next(), ":"))) {
                        }
                    }
                    if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                        if (jSONArrayOptJSONArray != null) {
                            k41 k41VarF2 = mh0.f0(0, jSONArrayOptJSONArray.length());
                            arrayList2 = new ArrayList();
                            it2 = k41VarF2.iterator();
                            while (true) {
                                j41Var = (j41) it2;
                                if (j41Var.g) {
                                    break;
                                    break;
                                }
                                strOptString = jSONArrayOptJSONArray.optString(j41Var.nextInt(), null);
                                if (strOptString != null) {
                                    arrayList2.add(strOptString);
                                }
                            }
                            setN0 = zy.N0(arrayList2);
                        }
                        if (setN0 == null) {
                            setN0 = zj0.e;
                        }
                        if (!setN0.isEmpty()) {
                            if (string == null) {
                            }
                            if (str == null) {
                            }
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                                str2 = (String) obj;
                                if (!setN0.contains(str2)) {
                                }
                                arrayList.add(obj);
                            }
                            if (!arrayList.isEmpty()) {
                                return true;
                            }
                        }
                    } else if (i >= 10000) {
                        if (string == null) {
                        }
                        arrayList3 = new ArrayList();
                        while (r9.hasNext()) {
                            if (!set.contains(l13.A0((String) obj2, ":"))) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                } else {
                    it = set2.iterator();
                    while (it.hasNext()) {
                        if (set.contains(l13.A0((String) it.next(), ":"))) {
                        }
                    }
                    if (jSONObject.optBoolean("system_hook_global_mode", false)) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                        if (jSONArrayOptJSONArray != null) {
                            k41 k41VarF3 = mh0.f0(0, jSONArrayOptJSONArray.length());
                            arrayList2 = new ArrayList();
                            it2 = k41VarF3.iterator();
                            while (true) {
                                j41Var = (j41) it2;
                                if (j41Var.g) {
                                    break;
                                    break;
                                }
                                strOptString = jSONArrayOptJSONArray.optString(j41Var.nextInt(), null);
                                if (strOptString != null) {
                                    arrayList2.add(strOptString);
                                }
                            }
                            setN0 = zy.N0(arrayList2);
                        }
                        if (setN0 == null) {
                            setN0 = zj0.e;
                        }
                        if (!setN0.isEmpty()) {
                            if (string == null) {
                            }
                            if (str == null) {
                            }
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                                str2 = (String) obj;
                                if (!setN0.contains(str2)) {
                                }
                                arrayList.add(obj);
                            }
                            if (!arrayList.isEmpty()) {
                                return true;
                            }
                        }
                    } else if (i >= 10000) {
                        if (string == null) {
                        }
                        arrayList3 = new ArrayList();
                        while (r9.hasNext()) {
                            if (!set.contains(l13.A0((String) obj2, ":"))) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
