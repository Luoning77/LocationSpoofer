package com.vincenthzr.locationspoofer.data.repository;

import com.vincenthzr.locationspoofer.data.model.HookStatusReport;
import defpackage.ay0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.jq1;
import defpackage.k33;
import defpackage.l13;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s13;
import defpackage.s90;
import defpackage.wi2;
import defpackage.ym2;
import defpackage.zy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HookStatusRepository {
    private final wi2 rootManager;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.repository.HookStatusRepository$readAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.repository.HookStatusRepository$readAll$2", f = "HookStatusRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        int label;

        public AnonymousClass2(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return HookStatusRepository.this.new AnonymousClass2(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            LinkedHashMap linkedHashMap = ay0.a;
            HookStatusRepository hookStatusRepository = HookStatusRepository.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(jq1.M(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List<String> list = (List) entry.getValue();
                wi2 wi2Var = hookStatusRepository.rootManager;
                list.getClass();
                if (!list.isEmpty()) {
                    if (!list.isEmpty()) {
                        for (String str : list) {
                            if (!s13.Z(str, "/data/", false) || l13.u0(str, new char[]{'/'}, 6).contains("..")) {
                            }
                        }
                    }
                    String strS0 = zy.s0(list, " || ", null, null, new ym2(25), 30);
                    wi2Var.getClass();
                    linkedHashMap2.put(key, HookStatusReport.Companion.parse(wi2.a(strS0, null)));
                }
                fo.i("Failed requirement.");
                return null;
            }
            return linkedHashMap2;
        }
    }

    public HookStatusRepository(wi2 wi2Var) {
        wi2Var.getClass();
        this.rootManager = wi2Var;
    }

    public final Object readAll(q60 q60Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), q60Var);
    }
}
