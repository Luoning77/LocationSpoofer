package com.vincenthzr.locationspoofer.data.sync;

import android.content.Context;
import android.util.AtomicFile;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.db.AppDatabase;
import defpackage.az;
import defpackage.az2;
import defpackage.e71;
import defpackage.ee0;
import defpackage.fo;
import defpackage.j41;
import defpackage.ji2;
import defpackage.jq1;
import defpackage.k33;
import defpackage.k41;
import defpackage.k50;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.rt2;
import defpackage.s90;
import defpackage.sw;
import defpackage.t61;
import defpackage.tt2;
import defpackage.us2;
import defpackage.v1;
import defpackage.vj0;
import defpackage.we2;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.xs2;
import defpackage.y61;
import defpackage.yo;
import defpackage.z70;
import defpackage.zy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONArray;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AccountSyncManager {
    private final MutableStateFlow<AccountSyncState> _state;
    private final CloudRepository cloud;
    private final AppDatabase database;
    private final AtomicFile file;
    private JsonObject journal;
    private final t61 json;
    private final LocalSyncData local;
    private final Mutex mutex;
    private final SyncPermissionPause permissionPause;
    private final CoroutineScope scope;
    private final tt2 settings;
    private boolean started;
    private final StateFlow<AccountSyncState> state;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$activate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager", f = "AccountSyncManager.kt", l = {157, 162, 167}, m = "activate")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSyncManager.this.activate(null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$applyLogged$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$applyLogged$2", f = "AccountSyncManager.kt", l = {132}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ String $account;
        final /* synthetic */ Map<String, String> $baseline;
        final /* synthetic */ Set<String> $categories;
        final /* synthetic */ Map<String, String> $expectedLocal;
        final /* synthetic */ long $revision;
        final /* synthetic */ SyncSelection $selection;
        final /* synthetic */ Map<String, String> $target;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Map<String, String> map, Map<String, String> map2, String str, SyncSelection syncSelection, Map<String, String> map3, long j, Set<String> set, q60 q60Var) {
            super(2, q60Var);
            this.$target = map;
            this.$expectedLocal = map2;
            this.$account = str;
            this.$selection = syncSelection;
            this.$baseline = map3;
            this.$revision = j;
            this.$categories = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf3 invokeSuspend$lambda$2(AccountSyncManager accountSyncManager, String str, SyncSelection syncSelection, we2 we2Var, Map map, long j, Set set, Map map2, Map map3) throws IOException {
            accountSyncManager.requireScope(str);
            if (syncSelection != null) {
                accountSyncManager.requireSelection(syncSelection);
            }
            we2Var.e = accountSyncManager.syncProfile(str, map2, map, j, set);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonPrimitive jsonPrimitiveB = e71.b(str);
            jsonPrimitiveB.getClass();
            Object obj = we2Var.e;
            if (obj == null) {
                o51.F("value");
                throw null;
            }
            JsonObject jsonObjectObjectEntries = accountSyncManager.objectEntries(map3);
            jsonObjectObjectEntries.getClass();
            JsonObject jsonObject = new JsonObject(linkedHashMap);
            LinkedHashMap linkedHashMapS = jq1.S(accountSyncManager.load());
            linkedHashMapS.put("pending", jsonObject);
            accountSyncManager.save(new JsonObject(linkedHashMapS));
            return mf3.a;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return AccountSyncManager.this.new AnonymousClass2(this.$target, this.$expectedLocal, this.$account, this.$selection, this.$baseline, this.$revision, this.$categories, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws IOException {
            we2 we2Var;
            int i = this.label;
            if (i == 0) {
                final we2 we2VarJ = p91.j(obj);
                LocalSyncData localSyncData = AccountSyncManager.this.local;
                Map<String, String> map = this.$target;
                Map<String, String> map2 = this.$expectedLocal;
                final AccountSyncManager accountSyncManager = AccountSyncManager.this;
                final String str = this.$account;
                final SyncSelection syncSelection = this.$selection;
                final Map<String, String> map3 = this.$baseline;
                final long j = this.$revision;
                final Set<String> set = this.$categories;
                pu0 pu0Var = new pu0() { // from class: com.vincenthzr.locationspoofer.data.sync.a
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj2, Object obj3) {
                        return AccountSyncManager.AnonymousClass2.invokeSuspend$lambda$2(accountSyncManager, str, syncSelection, we2VarJ, map3, j, set, (Map) obj2, (Map) obj3);
                    }
                };
                this.L$0 = we2VarJ;
                this.label = 1;
                Object objApply = localSyncData.apply(map, map2, pu0Var, this);
                z70 z70Var = z70.e;
                if (objApply == z70Var) {
                    return z70Var;
                }
                we2Var = we2VarJ;
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2Var = (we2) this.L$0;
                ee0.J(obj);
            }
            AccountSyncManager accountSyncManager2 = AccountSyncManager.this;
            JsonObject jsonObjectLoad = accountSyncManager2.load();
            String str2 = this.$account;
            Object obj2 = we2Var.e;
            if (obj2 == null) {
                o51.F("value");
                throw null;
            }
            LinkedHashMap linkedHashMapS = jq1.S(accountSyncManager2.withProfile(jsonObjectLoad, str2, (JsonObject) obj2));
            linkedHashMapS.put("owner", e71.b(this.$account));
            linkedHashMapS.remove("pending");
            accountSyncManager2.save(new JsonObject(linkedHashMapS));
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$checkpointBeforeImport$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager", f = "AccountSyncManager.kt", l = {50, 248, 57, 59}, m = "checkpointBeforeImport")
    public static final class C00861 extends r60 {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00861(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSyncManager.this.checkpointBeforeImport(this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$recoverPending$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$recoverPending$2", f = "AccountSyncManager.kt", l = {148}, m = "invokeSuspend")
    public static final class C00872 extends k33 implements pu0 {
        final /* synthetic */ String $owner;
        final /* synthetic */ JsonObject $pending;
        final /* synthetic */ we2 $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00872(we2 we2Var, JsonObject jsonObject, String str, q60 q60Var) {
            super(2, q60Var);
            this.$value = we2Var;
            this.$pending = jsonObject;
            this.$owner = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf3 invokeSuspend$lambda$3(we2 we2Var, AccountSyncManager accountSyncManager, String str, Map map, Map map2) throws IOException {
            LinkedHashMap linkedHashMapS = jq1.S((Map) we2Var.e);
            linkedHashMapS.put("local", accountSyncManager.objectEntries(map));
            we2Var.e = new JsonObject(linkedHashMapS);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonPrimitive jsonPrimitiveB = e71.b(str);
            jsonPrimitiveB.getClass();
            JsonElement jsonElement = (JsonElement) we2Var.e;
            jsonElement.getClass();
            JsonObject jsonObjectObjectEntries = accountSyncManager.objectEntries(map2);
            jsonObjectObjectEntries.getClass();
            JsonObject jsonObject = new JsonObject(linkedHashMap);
            LinkedHashMap linkedHashMapS2 = jq1.S(accountSyncManager.load());
            linkedHashMapS2.put("pending", jsonObject);
            accountSyncManager.save(new JsonObject(linkedHashMapS2));
            return mf3.a;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return AccountSyncManager.this.new C00872(this.$value, this.$pending, this.$owner, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00872) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws IOException {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                LocalSyncData localSyncData = AccountSyncManager.this.local;
                Map<String, String> mapEntries = AccountSyncManager.this.entries((JsonElement) ((JsonObject) this.$value.e).get((Object) "local"));
                JsonElement jsonElement = (JsonElement) this.$pending.get((Object) "previous");
                Map<String, String> mapEntries2 = jsonElement != null ? AccountSyncManager.this.entries(jsonElement) : null;
                final we2 we2Var = this.$value;
                final AccountSyncManager accountSyncManager = AccountSyncManager.this;
                final String str = this.$owner;
                pu0 pu0Var = new pu0() { // from class: com.vincenthzr.locationspoofer.data.sync.b
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj2, Object obj3) {
                        return AccountSyncManager.C00872.invokeSuspend$lambda$3(we2Var, accountSyncManager, str, (Map) obj2, (Map) obj3);
                    }
                };
                this.label = 1;
                Object objApply = localSyncData.apply(mapEntries, mapEntries2, pu0Var, this);
                z70 z70Var = z70.e;
                if (objApply == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            AccountSyncManager accountSyncManager2 = AccountSyncManager.this;
            LinkedHashMap linkedHashMapS = jq1.S(accountSyncManager2.withProfile(accountSyncManager2.load(), this.$owner, (JsonObject) this.$value.e));
            linkedHashMapS.put("owner", e71.b(this.$owner));
            linkedHashMapS.remove("pending");
            accountSyncManager2.save(new JsonObject(linkedHashMapS));
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$refresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$refresh$1", f = "AccountSyncManager.kt", l = {47}, m = "invokeSuspend")
    public static final class C00881 extends k33 implements pu0 {
        int label;

        public C00881(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return AccountSyncManager.this.new C00881(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00881) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                AccountSyncManager accountSyncManager = AccountSyncManager.this;
                this.label = 1;
                Object objRunSync = accountSyncManager.runSync(true, this);
                z70 z70Var = z70.e;
                if (objRunSync == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$restoreArchive$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager", f = "AccountSyncManager.kt", l = {248, 72, 74, 78, 86, 89}, m = "restoreArchive")
    public static final class C00891 extends r60 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C00891(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSyncManager.this.restoreArchive(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$runSync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager", f = "AccountSyncManager.kt", l = {248, 185, 196, 197, 204, 211, 215, 219}, m = "runSync")
    public static final class C00901 extends r60 {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C00901(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountSyncManager.this.runSync(false, this);
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1", f = "AccountSyncManager.kt", l = {39}, m = "invokeSuspend")
    public static final class C00911 extends k33 implements pu0 {
        int label;

        /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$2", f = "AccountSyncManager.kt", l = {39}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends k33 implements pu0 {
            int label;
            final /* synthetic */ AccountSyncManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AccountSyncManager accountSyncManager, q60 q60Var) {
                super(2, q60Var);
                this.this$0 = accountSyncManager;
            }

            @Override // defpackage.oq
            public final q60 create(Object obj, q60 q60Var) {
                return new AnonymousClass2(this.this$0, q60Var);
            }

            @Override // defpackage.pu0
            public final Object invoke(SyncAccess.AccountKey accountKey, q60 q60Var) {
                return ((AnonymousClass2) create(accountKey, q60Var)).invokeSuspend(mf3.a);
            }

            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ee0.J(obj);
                    AccountSyncManager accountSyncManager = this.this$0;
                    this.label = 1;
                    Object objRunSync$default = AccountSyncManager.runSync$default(accountSyncManager, false, this, 1, null);
                    z70 z70Var = z70.e;
                    if (objRunSync$default == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3.a;
            }
        }

        public C00911(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return AccountSyncManager.this.new C00911(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00911) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                final StateFlow<CloudAccountState> state = AccountSyncManager.this.cloud.getState();
                final SyncAccess syncAccess = SyncAccess.INSTANCE;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<SyncAccess.AccountKey>() { // from class: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ SyncAccess receiver$inlined;

                        /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
                        @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$1$invokeSuspend$$inlined$map$1$2", f = "AccountSyncManager.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends r60 {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(q60 q60Var) {
                                super(q60Var);
                            }

                            @Override // defpackage.oq
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, SyncAccess syncAccess) {
                            this.$this_unsafeFlow = flowCollector;
                            this.receiver$inlined = syncAccess;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, q60 q60Var) {
                            AnonymousClass1 anonymousClass1;
                            if (q60Var instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) q60Var;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(q60Var);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(q60Var);
                            }
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ee0.J(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                SyncAccess.AccountKey accountKey = this.receiver$inlined.accountKey((CloudAccountState) obj);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object objEmit = flowCollector.emit(accountKey, anonymousClass1);
                                z70 z70Var = z70.e;
                                if (objEmit == z70Var) {
                                    return z70Var;
                                }
                            } else {
                                if (i2 != 1) {
                                    fo.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ee0.J(obj2);
                            }
                            return mf3.a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super SyncAccess.AccountKey> flowCollector, q60 q60Var) {
                        Object objCollect = state.collect(new AnonymousClass2(flowCollector, syncAccess), q60Var);
                        return objCollect == z70.e ? objCollect : mf3.a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AccountSyncManager.this, null);
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this);
                z70 z70Var = z70.e;
                if (objCollectLatest == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2", f = "AccountSyncManager.kt", l = {43}, m = "invokeSuspend")
    public static final class C00922 extends k33 implements pu0 {
        int label;

        public C00922(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return AccountSyncManager.this.new C00922(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((C00922) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            q60 q60Var = null;
            if (i == 0) {
                ee0.J(obj);
                tt2 tt2Var = AccountSyncManager.this.settings;
                tt2Var.getClass();
                Flow flowCallbackFlow = FlowKt.callbackFlow(new rt2(tt2Var, q60Var, 0));
                final Flow flowA = AccountSyncManager.this.database.getInvalidationTracker().a(new String[]{"location_records", "collection_routes", "saved_routes", "wifi_devices", "location_wifi", "location_connected_wifi", "cell_devices", "location_cells", "bluetooth_devices", "location_bluetooth"});
                Flow flowDebounce = FlowKt.debounce(FlowKt.merge(flowCallbackFlow, new Flow<mf3>() { // from class: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
                        @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$2$invokeSuspend$$inlined$map$1$2", f = "AccountSyncManager.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends r60 {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(q60 q60Var) {
                                super(q60Var);
                            }

                            @Override // defpackage.oq
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, q60 q60Var) {
                            AnonymousClass1 anonymousClass1;
                            if (q60Var instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) q60Var;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(q60Var);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(q60Var);
                            }
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            mf3 mf3Var = mf3.a;
                            if (i2 == 0) {
                                ee0.J(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object objEmit = flowCollector.emit(mf3Var, anonymousClass1);
                                z70 z70Var = z70.e;
                                if (objEmit == z70Var) {
                                    return z70Var;
                                }
                            } else {
                                if (i2 != 1) {
                                    fo.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ee0.J(obj2);
                            }
                            return mf3Var;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super mf3> flowCollector, q60 q60Var2) {
                        Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), q60Var2);
                        return objCollect == z70.e ? objCollect : mf3.a;
                    }
                }), 2000L);
                final AccountSyncManager accountSyncManager = AccountSyncManager.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager.start.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(mf3 mf3Var, q60 q60Var2) {
                        Object objRunSync$default = AccountSyncManager.runSync$default(accountSyncManager, false, q60Var2, 1, null);
                        return objRunSync$default == z70.e ? objRunSync$default : mf3.a;
                    }
                };
                this.label = 1;
                Object objCollect = flowDebounce.collect(flowCollector, this);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "com.vincenthzr.locationspoofer.data.sync.AccountSyncManager$start$3", f = "AccountSyncManager.kt", l = {45, 45}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements pu0 {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass3 anonymousClass3 = AccountSyncManager.this.new AnonymousClass3(q60Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0025  */
        /* JADX WARN: Code duplicated, block: B:16:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:11:0x001f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                int r1 = r8.label
                r2 = 0
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 != r3) goto L12
                goto L1c
            L12:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r8)
                return r2
            L18:
                defpackage.ee0.J(r9)
                goto L33
            L1c:
                defpackage.ee0.J(r9)
            L1f:
                boolean r9 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r9 == 0) goto L41
                r8.L$0 = r0
                r8.label = r4
                r6 = 60000(0xea60, double:2.9644E-319)
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                if (r9 != r5) goto L33
                goto L40
            L33:
                com.vincenthzr.locationspoofer.data.sync.AccountSyncManager r9 = com.vincenthzr.locationspoofer.data.sync.AccountSyncManager.this
                r8.L$0 = r0
                r8.label = r3
                r1 = 0
                java.lang.Object r9 = com.vincenthzr.locationspoofer.data.sync.AccountSyncManager.runSync$default(r9, r1, r8, r4, r2)
                if (r9 != r5) goto L1f
            L40:
                return r5
            L41:
                mf3 r8 = defpackage.mf3.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AccountSyncManager(Context context, CloudRepository cloudRepository, tt2 tt2Var, AppDatabase appDatabase) throws NoSuchAlgorithmException {
        context.getClass();
        cloudRepository.getClass();
        tt2Var.getClass();
        appDatabase.getClass();
        this.cloud = cloudRepository;
        this.settings = tt2Var;
        this.database = appDatabase;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.local = new LocalSyncData(tt2Var, appDatabase);
        File noBackupFilesDir = context.getNoBackupFilesDir();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = cloudRepository.getOriginScope().getBytes(sw.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        this.file = new AtomicFile(new File(noBackupFilesDir, az2.k("account-sync-", zy.s0(yo.E0(12, bArrDigest), "", null, null, new v1(7), 30), ".json")));
        this.json = ee0.d(new v1(8));
        MutableStateFlow<AccountSyncState> MutableStateFlow = StateFlowKt.MutableStateFlow(new AccountSyncState(false, null, null, null, 15, null));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        this.permissionPause = new SyncPermissionPause();
    }

    private final String accountScope() {
        CloudAccount account;
        CloudAccountState value = this.cloud.getState().getValue();
        if (value.getValidated() && (account = value.getAccount()) != null) {
            return account.isGuest() ? "guest" : account.getId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0125  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object activate(String str, q60 q60Var) throws IOException {
        AnonymousClass1 anonymousClass1;
        String str2;
        String str3;
        JsonObject jsonObject;
        String str4;
        Map<String, String> mapEntries;
        JsonObject jsonObjectProfile;
        JsonElement jsonElement;
        long jG;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        int i2 = anonymousClass2.label;
        mf3 mf3Var = mf3.a;
        Object obj2 = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            str2 = str;
            anonymousClass2.L$0 = str2;
            anonymousClass2.label = 1;
            if (recoverPending(anonymousClass2) != obj2) {
            }
        }
        if (i2 == 1) {
            String str5 = (String) anonymousClass2.L$0;
            ee0.J(obj);
            str2 = str5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                return mf3Var;
            }
            str4 = (String) anonymousClass2.L$2;
            jsonObject = (JsonObject) anonymousClass2.L$1;
            str3 = (String) anonymousClass2.L$0;
            ee0.J(obj);
        }
        mapEntries = (Map) obj;
        LinkedHashMap linkedHashMapS = jq1.S(profile(jsonObject, str4));
        linkedHashMapS.put("local", objectEntries(mapEntries));
        JsonObject jsonObjectWithProfile = withProfile(jsonObject, str4, new JsonObject(linkedHashMapS));
        save(jsonObjectWithProfile);
        jsonObjectProfile = profile(jsonObjectWithProfile, str3);
        if (!jsonObjectProfile.isEmpty()) {
            mapEntries = entries((JsonElement) jsonObjectProfile.get("local"));
        } else if (o51.f(str4, "guest") || o51.f(str3, "guest")) {
            mapEntries = vj0.e;
        }
        Map<String, String> map = mapEntries;
        Map<String, String> mapEntries2 = entries((JsonElement) jsonObjectProfile.get("base"));
        jsonElement = (JsonElement) jsonObjectProfile.get("revision");
        if (jsonElement != null) {
            jG = e71.g(e71.f(jsonElement));
        } else {
            jG = 0;
        }
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = null;
        anonymousClass2.L$5 = null;
        anonymousClass2.label = 3;
        return applyLogged$default(this, str3, map, mapEntries2, jG, null, null, null, anonymousClass2, 112, null) == obj2 ? obj2 : mf3Var;
        JsonObject jsonObjectLoad = load();
        String content = e71.f((JsonElement) jq1.L("owner", jsonObjectLoad)).getContent();
        if (!o51.f(content, str2)) {
            this._state.setValue(new AccountSyncState(true, null, null, null, 14, null));
            LocalSyncData localSyncData = this.local;
            anonymousClass2.L$0 = str2;
            anonymousClass2.L$1 = jsonObjectLoad;
            anonymousClass2.L$2 = content;
            anonymousClass2.label = 2;
            Object objCapture = localSyncData.capture(anonymousClass2);
            if (objCapture != obj2) {
                str3 = str2;
                obj = objCapture;
                jsonObject = jsonObjectLoad;
                str4 = content;
                mapEntries = (Map) obj;
                LinkedHashMap linkedHashMapS2 = jq1.S(profile(jsonObject, str4));
                linkedHashMapS2.put("local", objectEntries(mapEntries));
                JsonObject jsonObjectWithProfile2 = withProfile(jsonObject, str4, new JsonObject(linkedHashMapS2));
                save(jsonObjectWithProfile2);
                jsonObjectProfile = profile(jsonObjectWithProfile2, str3);
                if (!jsonObjectProfile.isEmpty()) {
                    mapEntries = entries((JsonElement) jsonObjectProfile.get("local"));
                } else if (o51.f(str4, "guest")) {
                    mapEntries = vj0.e;
                } else {
                    mapEntries = vj0.e;
                }
                Map<String, String> map2 = mapEntries;
                Map<String, String> mapEntries3 = entries((JsonElement) jsonObjectProfile.get("base"));
                jsonElement = (JsonElement) jsonObjectProfile.get("revision");
                if (jsonElement != null) {
                    jG = e71.g(e71.f(jsonElement));
                } else {
                    jG = 0;
                }
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.L$4 = null;
                anonymousClass2.L$5 = null;
                anonymousClass2.label = 3;
                if (applyLogged$default(this, str3, map2, mapEntries3, jG, null, null, null, anonymousClass2, 112, null) == obj2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object applyLogged(String str, Map<String, String> map, Map<String, String> map2, long j, Map<String, String> map3, SyncSelection syncSelection, Set<String> set, q60 q60Var) {
        requireScope(str);
        this.local.validate(map);
        Object objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new AnonymousClass2(map, map3, str, syncSelection, map2, j, set, null), q60Var);
        return objWithContext == z70.e ? objWithContext : mf3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object applyLogged$default(AccountSyncManager accountSyncManager, String str, Map map, Map map2, long j, Map map3, SyncSelection syncSelection, Set set, q60 q60Var, int i, Object obj) {
        if ((i & 16) != 0) {
            map3 = null;
        }
        if ((i & 32) != 0) {
            syncSelection = null;
        }
        if ((i & 64) != 0) {
            set = null;
        }
        return accountSyncManager.applyLogged(str, map, map2, j, map3, syncSelection, set, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> entries(JsonElement jsonElement) {
        LinkedHashMap linkedHashMap = null;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            linkedHashMap = new LinkedHashMap(jq1.M(jsonObject.size()));
            Iterator<T> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), e71.f((JsonElement) entry.getValue()).getContent());
            }
        }
        return linkedHashMap == null ? vj0.e : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence file$lambda$0(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 json$lambda$1(y61 y61Var) {
        y61Var.getClass();
        y61Var.c = true;
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject load() {
        JsonObject jsonObject = this.journal;
        if (jsonObject != null) {
            return jsonObject;
        }
        try {
            FileInputStream fileInputStreamOpenRead = this.file.openRead();
            try {
                t61 t61Var = this.json;
                fileInputStreamOpenRead.getClass();
                JsonObject jsonObjectE = e71.e(t61Var.c(new String(o51.w(fileInputStreamOpenRead), sw.a)));
                ji2.z(fileInputStreamOpenRead, null);
                return jsonObjectE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ji2.z(fileInputStreamOpenRead, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonPrimitive jsonPrimitiveB = e71.b("guest");
            jsonPrimitiveB.getClass();
            return new JsonObject(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject objectEntries(Map<String, String> map) {
        map.getClass();
        TreeMap treeMap = new TreeMap(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(jq1.M(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), e71.b((String) entry.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }

    private final JsonObject profile(JsonObject jsonObject, String str) {
        JsonElement jsonElement;
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("profiles");
        return (jsonElement2 == null || (jsonElement = (JsonElement) e71.e(jsonElement2).get((Object) str)) == null) ? new JsonObject(vj0.e) : e71.e(jsonElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recoverPending(q60 q60Var) {
        JsonElement jsonElement = (JsonElement) load().get("pending");
        mf3 mf3Var = mf3.a;
        if (jsonElement != null) {
            JsonObject jsonObjectE = e71.e(jsonElement);
            String content = e71.f((JsonElement) jq1.L("owner", jsonObjectE)).getContent();
            we2 we2Var = new we2();
            we2Var.e = e71.e((JsonElement) jq1.L("profile", jsonObjectE));
            Object objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new C00872(we2Var, jsonObjectE, content, null), q60Var);
            if (objWithContext == z70.e) {
                return objWithContext;
            }
        }
        return mf3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireScope(String str) {
        if (!o51.f(accountScope(), str)) {
            throw new CancellationException("账号已切换");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requireSelection(SyncSelection syncSelection) {
        if (!this.settings.d().equals(syncSelection) || !SyncAccess.INSTANCE.allowed(this.cloud.getState().getValue())) {
            throw new CancellationException("同步选择或会员权益已改变");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x06aa -> B:357:0x06c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0883 -> B:210:0x086d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object runSync(boolean r42, defpackage.q60 r43) {
        /*
            Method dump skipped, instruction units count: 2626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.data.sync.AccountSyncManager.runSync(boolean, q60):java.lang.Object");
    }

    public static /* synthetic */ Object runSync$default(AccountSyncManager accountSyncManager, boolean z, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return accountSyncManager.runSync(z, q60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save(JsonObject jsonObject) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = this.file.startWrite();
        try {
            byte[] bytes = jsonObject.toString().getBytes(sw.a);
            bytes.getClass();
            fileOutputStreamStartWrite.write(bytes);
            this.file.finishWrite(fileOutputStreamStartWrite);
            this.journal = jsonObject;
        } catch (Throwable th) {
            this.file.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject syncProfile(String str, Map<String, String> map, Map<String, String> map2, long j, Set<String> set) {
        LinkedHashMap linkedHashMapS = jq1.S(profile(load(), str));
        linkedHashMapS.put("local", objectEntries(map));
        linkedHashMapS.put("base", objectEntries(map2));
        linkedHashMapS.put("revision", e71.a(Long.valueOf(j)));
        if (set != null) {
            List listB0 = zy.B0(set);
            ArrayList arrayList = new ArrayList(az.Y(listB0, 10));
            Iterator it = listB0.iterator();
            while (it.hasNext()) {
                arrayList.add(e71.b((String) it.next()));
            }
            linkedHashMapS.put("syncedCategories", new JsonArray(arrayList));
        }
        return new JsonObject(linkedHashMapS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonObject syncProfile$default(AccountSyncManager accountSyncManager, String str, Map map, Map map2, long j, Set set, int i, Object obj) {
        if ((i & 16) != 0) {
            set = null;
        }
        return accountSyncManager.syncProfile(str, map, map2, j, set);
    }

    private final Set<String> syncedCategories(JsonObject jsonObject) {
        SyncSelection.Companion companion = SyncSelection.Companion;
        Object obj = jsonObject.get("syncedCategories");
        Set<String> setN0 = null;
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        if (jsonArray != null) {
            ArrayList arrayList = new ArrayList(az.Y(jsonArray, 10));
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(e71.f(it.next()).getContent());
            }
            setN0 = zy.N0(arrayList);
        }
        JsonElement jsonElement = (JsonElement) jsonObject.get("revision");
        return companion.syncedCategories(setN0, jsonElement != null ? e71.g(e71.f(jsonElement)) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject withProfile(JsonObject jsonObject, String str, JsonObject jsonObject2) {
        LinkedHashMap linkedHashMapS = jq1.S(jsonObject);
        JsonElement jsonElement = (JsonElement) jsonObject.get("profiles");
        LinkedHashMap linkedHashMap = new LinkedHashMap(jsonElement != null ? e71.e(jsonElement) : new JsonObject(vj0.e));
        linkedHashMap.put(str, jsonObject2);
        linkedHashMapS.put("profiles", new JsonObject(linkedHashMap));
        return new JsonObject(linkedHashMapS);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x01cd, TryCatch #6 {all -> 0x01cd, blocks: (B:36:0x00a9, B:38:0x00af, B:44:0x00bf, B:46:0x00d8, B:49:0x00ed), top: B:102:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[Catch: all -> 0x01cd, TryCatch #6 {all -> 0x01cd, blocks: (B:36:0x00a9, B:38:0x00af, B:44:0x00bf, B:46:0x00d8, B:49:0x00ed), top: B:102:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:71:0x018b, B:73:0x0191, B:75:0x0195, B:77:0x0199, B:79:0x01a4, B:82:0x01c9), top: B:95:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0195 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:71:0x018b, B:73:0x0191, B:75:0x0195, B:77:0x0199, B:79:0x01a4, B:82:0x01c9), top: B:95:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:71:0x018b, B:73:0x0191, B:75:0x0195, B:77:0x0199, B:79:0x01a4, B:82:0x01c9), top: B:95:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9 A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #2 {all -> 0x01c7, blocks: (B:71:0x018b, B:73:0x0191, B:75:0x0195, B:77:0x0199, B:79:0x01a4, B:82:0x01c9), top: B:95:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object checkpointBeforeImport(q60 q60Var) throws Throwable {
        C00861 c00861;
        Mutex mutex;
        int i;
        Object obj;
        String strAccountScope;
        String str;
        z70 z70Var;
        int i2;
        AccountSyncManager accountSyncManager;
        int i3;
        int i4;
        Mutex mutex2;
        Object wg2Var;
        Throwable thA;
        if (q60Var instanceof C00861) {
            c00861 = (C00861) q60Var;
            int i5 = c00861.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c00861.label = i5 - Integer.MIN_VALUE;
            } else {
                c00861 = new C00861(q60Var);
            }
        } else {
            c00861 = new C00861(q60Var);
        }
        C00861 c00862 = c00861;
        Object objAuthenticatedJson$default = c00862.result;
        int i6 = c00862.label;
        z70 z70Var2 = z70.e;
        if (i6 == 0) {
            ee0.J(objAuthenticatedJson$default);
            c00862.label = 1;
            if (runSync$default(this, false, c00862, 1, null) != z70Var2) {
            }
            return z70Var2;
        }
        if (i6 == 1) {
            ee0.J(objAuthenticatedJson$default);
        } else {
            if (i6 == 2) {
                int i7 = c00862.I$0;
                Mutex mutex3 = (Mutex) c00862.L$0;
                ee0.J(objAuthenticatedJson$default);
                i = i7;
                mutex = mutex3;
                try {
                    strAccountScope = accountScope();
                    if (strAccountScope != null) {
                        if (strAccountScope.equals("guest")) {
                            str = null;
                        } else {
                            str = strAccountScope;
                        }
                        if (str != null) {
                            SyncPermissionPause.update$default(this.permissionPause, this.cloud.getState().getValue(), false, 2, null);
                            if (this.permissionPause.getCode() != null && SyncAccess.INSTANCE.allowed(this.cloud.getState().getValue()) && this.settings.d().getActive()) {
                                try {
                                    CloudRepository cloudRepository = this.cloud;
                                    c00862.L$0 = mutex;
                                    c00862.L$1 = this;
                                    c00862.L$2 = str;
                                    c00862.I$0 = i;
                                    c00862.I$1 = 0;
                                    c00862.I$2 = 0;
                                    c00862.label = 3;
                                    z70Var = z70Var2;
                                    obj = null;
                                    try {
                                        Object objAuthenticatedJson$default2 = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/account/sync", null, null, null, str, null, c00862, 46, null);
                                        if (objAuthenticatedJson$default2 == z70Var) {
                                            return z70Var;
                                        }
                                        i2 = i;
                                        objAuthenticatedJson$default = objAuthenticatedJson$default2;
                                        accountSyncManager = this;
                                        i3 = 0;
                                        i4 = 0;
                                        JSONObject jSONObject = (JSONObject) objAuthenticatedJson$default;
                                        accountSyncManager.requireScope(str);
                                        CloudRepository cloudRepository2 = accountSyncManager.cloud;
                                        JSONObject jSONObjectPut = new JSONObject().put("baseRevision", jSONObject.getLong("revision")).put("entries", jSONObject.getJSONObject("entries")).put("reason", "before_import");
                                        c00862.L$0 = mutex;
                                        c00862.L$1 = obj;
                                        c00862.L$2 = obj;
                                        c00862.L$3 = obj;
                                        c00862.I$0 = i2;
                                        c00862.I$1 = i3;
                                        c00862.I$2 = i4;
                                        c00862.label = 4;
                                        objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository2, "/v2/account/sync", null, jSONObjectPut, null, str, null, c00862, 42, null);
                                        if (objAuthenticatedJson$default == z70Var) {
                                            return z70Var;
                                        }
                                        mutex2 = mutex;
                                        wg2Var = (JSONObject) objAuthenticatedJson$default;
                                        mutex = mutex2;
                                        thA = xg2.a(wg2Var);
                                        if (thA != null) {
                                            if (!(thA instanceof CancellationException)) {
                                                throw thA;
                                            }
                                            if (thA instanceof Exception) {
                                                this.permissionPause.reject((Exception) thA);
                                                MutableStateFlow<AccountSyncState> mutableStateFlow = this._state;
                                                mutableStateFlow.setValue(AccountSyncState.copy$default(mutableStateFlow.getValue(), false, null, null, this.permissionPause.getCode(), 3, null));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        mutex2 = mutex;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = null;
                                    mutex2 = mutex;
                                }
                            }
                            mutex.unlock(obj);
                            return mf3.a;
                        }
                    }
                    obj = null;
                    mutex.unlock(obj);
                    return mf3.a;
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                    mutex.unlock(obj);
                    throw th;
                }
            }
            try {
                try {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = (Mutex) c00862.L$0;
                        try {
                            ee0.J(objAuthenticatedJson$default);
                            obj = null;
                            try {
                                wg2Var = (JSONObject) objAuthenticatedJson$default;
                            } catch (Throwable th4) {
                                th = th4;
                                wg2Var = new wg2(th);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = null;
                        }
                        mutex = mutex2;
                        thA = xg2.a(wg2Var);
                        if (thA != null) {
                            if (!(thA instanceof CancellationException)) {
                                throw thA;
                            }
                            if ((thA instanceof Exception) && SyncAccess.INSTANCE.denied((Exception) thA)) {
                                this.permissionPause.reject((Exception) thA);
                                MutableStateFlow<AccountSyncState> mutableStateFlow2 = this._state;
                                mutableStateFlow2.setValue(AccountSyncState.copy$default(mutableStateFlow2.getValue(), false, null, null, this.permissionPause.getCode(), 3, null));
                            }
                        }
                        mutex.unlock(obj);
                        return mf3.a;
                    }
                    int i8 = c00862.I$2;
                    int i9 = c00862.I$1;
                    i2 = c00862.I$0;
                    String str2 = (String) c00862.L$2;
                    accountSyncManager = (AccountSyncManager) c00862.L$1;
                    Mutex mutex4 = (Mutex) c00862.L$0;
                    try {
                        ee0.J(objAuthenticatedJson$default);
                        i3 = i9;
                        mutex = mutex4;
                        str = str2;
                        obj = null;
                        i4 = i8;
                        z70Var = z70Var2;
                        JSONObject jSONObject2 = (JSONObject) objAuthenticatedJson$default;
                        accountSyncManager.requireScope(str);
                        CloudRepository cloudRepository3 = accountSyncManager.cloud;
                        JSONObject jSONObjectPut2 = new JSONObject().put("baseRevision", jSONObject2.getLong("revision")).put("entries", jSONObject2.getJSONObject("entries")).put("reason", "before_import");
                        c00862.L$0 = mutex;
                        c00862.L$1 = obj;
                        c00862.L$2 = obj;
                        c00862.L$3 = obj;
                        c00862.I$0 = i2;
                        c00862.I$1 = i3;
                        c00862.I$2 = i4;
                        c00862.label = 4;
                        objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository3, "/v2/account/sync", null, jSONObjectPut2, null, str, null, c00862, 42, null);
                        if (objAuthenticatedJson$default == z70Var) {
                            return z70Var;
                        }
                        mutex2 = mutex;
                        wg2Var = (JSONObject) objAuthenticatedJson$default;
                        mutex = mutex2;
                        thA = xg2.a(wg2Var);
                        if (thA != null) {
                            if (!(thA instanceof CancellationException)) {
                                throw thA;
                            }
                            if (thA instanceof Exception) {
                                this.permissionPause.reject((Exception) thA);
                                MutableStateFlow<AccountSyncState> mutableStateFlow3 = this._state;
                                mutableStateFlow3.setValue(AccountSyncState.copy$default(mutableStateFlow3.getValue(), false, null, null, this.permissionPause.getCode(), 3, null));
                            }
                        }
                        mutex.unlock(obj);
                        return mf3.a;
                    } catch (Throwable th6) {
                        th = th6;
                        obj = null;
                        mutex2 = mutex4;
                    }
                    thA = xg2.a(wg2Var);
                    if (thA != null) {
                        if (!(thA instanceof CancellationException)) {
                            throw thA;
                        }
                        if (thA instanceof Exception) {
                            this.permissionPause.reject((Exception) thA);
                            MutableStateFlow<AccountSyncState> mutableStateFlow4 = this._state;
                            mutableStateFlow4.setValue(AccountSyncState.copy$default(mutableStateFlow4.getValue(), false, null, null, this.permissionPause.getCode(), 3, null));
                        }
                    }
                    mutex.unlock(obj);
                    return mf3.a;
                } catch (Throwable th7) {
                    th = th7;
                    mutex.unlock(obj);
                    throw th;
                }
                wg2Var = new wg2(th);
                mutex = mutex2;
            } catch (Throwable th8) {
                th = th8;
                mutex = mutex2;
                mutex.unlock(obj);
                throw th;
            }
        }
        Mutex mutex5 = this.mutex;
        c00862.L$0 = mutex5;
        c00862.I$0 = 0;
        c00862.label = 2;
        if (mutex5.lock(null, c00862) != z70Var2) {
            mutex = mutex5;
            i = 0;
            strAccountScope = accountScope();
            if (strAccountScope != null) {
                if (strAccountScope.equals("guest")) {
                    str = strAccountScope;
                } else {
                    str = null;
                }
                if (str != null) {
                    SyncPermissionPause.update$default(this.permissionPause, this.cloud.getState().getValue(), false, 2, null);
                    if (this.permissionPause.getCode() != null) {
                    }
                }
            }
            obj = null;
            mutex.unlock(obj);
            return mf3.a;
        }
        return z70Var2;
    }

    public final StateFlow<AccountSyncState> getState() {
        return this.state;
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C00881(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x019c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0235 A[Catch: all -> 0x026b, LOOP:3: B:50:0x022f->B:52:0x0235, LOOP_END, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d6 A[Catch: all -> 0x026b, LOOP:0: B:60:0x02d0->B:62:0x02d6, LOOP_END, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x02f8 A[Catch: all -> 0x026b, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0317 A[Catch: all -> 0x026b, LOOP:1: B:66:0x0310->B:68:0x0317, LOOP_END, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x033d A[Catch: all -> 0x026b, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0386  */
    /* JADX WARN: Code duplicated, block: B:82:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0402 A[Catch: all -> 0x026b, TRY_ENTER, TryCatch #5 {all -> 0x026b, blocks: (B:83:0x03dd, B:59:0x02ae, B:60:0x02d0, B:62:0x02d6, B:63:0x02e5, B:65:0x02f8, B:66:0x0310, B:68:0x0317, B:69:0x0326, B:70:0x0337, B:72:0x033d, B:74:0x034f, B:75:0x035b, B:88:0x0402, B:89:0x040f, B:49:0x01fa, B:50:0x022f, B:52:0x0235, B:55:0x026f, B:45:0x01a5), top: B:103:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00eb: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:236), block:B:27:0x00eb */
    public final Object restoreArchive(String str, String str2, Map<String, ? extends Set<String>> map, String str3, q60 q60Var) throws Throwable {
        C00891 c00891;
        Mutex mutex;
        Mutex mutex2;
        Object obj;
        Mutex mutex3;
        String str4;
        String str5;
        Map<String, ? extends Set<String>> map2;
        String str6;
        int i;
        String str7;
        int i2;
        Map<String, ? extends Set<String>> map3;
        String str8;
        String str9;
        int i3;
        Map<String, String> mapEntries;
        String str10;
        Map<String, ? extends Set<String>> map4;
        String str11;
        int i4;
        Object obj2;
        Object objAuthenticatedJson$default;
        String str12;
        String str13;
        Map<String, ? extends Set<String>> map5;
        String str14;
        Map<String, String> map6;
        int i5;
        int i6;
        ArrayList arrayList;
        Iterator<Map.Entry<String, ? extends Set<String>>> it;
        Map<String, String> map7;
        String str15;
        int i7;
        String str16;
        Map<String, String> map8;
        int i8;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArray;
        ArrayList arrayList2;
        Iterator it2;
        Set setN0;
        LinkedHashMap linkedHashMap2;
        Mutex mutex4;
        Map map9;
        int i9;
        Map map10;
        LinkedHashMap linkedHashMapO;
        Set<String> setSyncedCategories;
        LinkedHashMap linkedHashMapO2;
        long j;
        if (q60Var instanceof C00891) {
            c00891 = (C00891) q60Var;
            int i10 = c00891.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00891.label = i10 - Integer.MIN_VALUE;
            } else {
                c00891 = new C00891(q60Var);
            }
        } else {
            c00891 = new C00891(q60Var);
        }
        C00891 c00892 = c00891;
        Object objAuthenticatedJson$default2 = c00892.result;
        int i11 = c00892.label;
        Object obj3 = z70.e;
        try {
            switch (i11) {
                case 0:
                    ee0.J(objAuthenticatedJson$default2);
                    mutex3 = this.mutex;
                    str4 = str;
                    c00892.L$0 = str4;
                    str5 = str2;
                    c00892.L$1 = str5;
                    map2 = map;
                    c00892.L$2 = map2;
                    str6 = str3;
                    c00892.L$3 = str6;
                    c00892.L$4 = mutex3;
                    c00892.I$0 = 0;
                    c00892.label = 1;
                    if (mutex3.lock(null, c00892) != obj3) {
                        i = 0;
                        try {
                            requireScope(str4);
                            c00892.L$0 = str4;
                            c00892.L$1 = str5;
                            c00892.L$2 = map2;
                            c00892.L$3 = str6;
                            c00892.L$4 = mutex3;
                            c00892.I$0 = i;
                            c00892.I$1 = 0;
                            c00892.label = 2;
                            if (activate(str4, c00892) != obj3) {
                                int i12 = i;
                                str7 = str5;
                                i2 = i12;
                                String str17 = str6;
                                map3 = map2;
                                str8 = str17;
                                str9 = str4;
                                mutex2 = mutex3;
                                i3 = 0;
                                try {
                                    mapEntries = entries((JsonElement) profile(load(), str9).get("base"));
                                    CloudRepository cloudRepository = this.cloud;
                                    c00892.L$0 = str9;
                                    c00892.L$1 = str7;
                                    c00892.L$2 = map3;
                                    c00892.L$3 = str8;
                                    c00892.L$4 = mutex2;
                                    c00892.L$5 = mapEntries;
                                    c00892.I$0 = i2;
                                    c00892.I$1 = i3;
                                    c00892.label = 3;
                                    str10 = str8;
                                    map4 = map3;
                                    str11 = str7;
                                    i4 = i2;
                                    obj2 = obj3;
                                    objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository, "/v2/account/archives/current", null, null, null, str9, null, c00892, 46, null);
                                    if (objAuthenticatedJson$default == obj2) {
                                        return obj2;
                                    }
                                    str12 = str9;
                                    str13 = str10;
                                    map5 = map4;
                                    str14 = str11;
                                    map6 = mapEntries;
                                    i5 = i3;
                                    objAuthenticatedJson$default2 = objAuthenticatedJson$default;
                                    i6 = i4;
                                    requireScope(str12);
                                    Map<String, ? extends Set<String>> map11 = map5;
                                    JSONObject jSONObjectPut = new JSONObject().put("requestId", str13).put("kind", str14).put("baseRevision", ((JSONObject) objAuthenticatedJson$default2).getLong("revision"));
                                    arrayList = new ArrayList(map11.size());
                                    for (it = map11.entrySet().iterator(); it.hasNext(); it = it) {
                                        Map.Entry<String, ? extends Set<String>> next = it.next();
                                        arrayList.add(new JSONObject().put("id", next.getKey()).put("keys", new JSONArray((Collection) zy.B0(next.getValue()))));
                                    }
                                    JSONObject jSONObjectPut2 = jSONObjectPut.put("sources", new JSONArray((Collection) arrayList));
                                    CloudRepository cloudRepository2 = this.cloud;
                                    c00892.L$0 = str12;
                                    c00892.L$1 = null;
                                    c00892.L$2 = null;
                                    c00892.L$3 = null;
                                    c00892.L$4 = mutex2;
                                    c00892.L$5 = map6;
                                    c00892.L$6 = null;
                                    c00892.L$7 = null;
                                    c00892.I$0 = i6;
                                    c00892.I$1 = i5;
                                    c00892.label = 4;
                                    map7 = map6;
                                    str15 = str12;
                                    i7 = i6;
                                    objAuthenticatedJson$default2 = CloudRepository.authenticatedJson$default(cloudRepository2, "/v2/account/archives/restore", null, jSONObjectPut2, null, str15, null, c00892, 42, null);
                                    if (objAuthenticatedJson$default2 == obj2) {
                                        return obj2;
                                    }
                                    str16 = str15;
                                    map8 = map7;
                                    i8 = i7;
                                    jSONObject = (JSONObject) objAuthenticatedJson$default2;
                                    requireScope(str16);
                                    jSONObject2 = jSONObject.getJSONObject("entries");
                                    Iterator<String> itKeys = jSONObject2.keys();
                                    itKeys.getClass();
                                    us2 us2VarN = xs2.N(itKeys);
                                    linkedHashMap = new LinkedHashMap();
                                    for (Object obj4 : (k50) us2VarN) {
                                        linkedHashMap.put(obj4, jSONObject2.getString((String) obj4));
                                    }
                                    this.local.validate(linkedHashMap);
                                    jSONArray = jSONObject.getJSONArray("restoredKeys");
                                    if (jSONArray.length() > 10000) {
                                        throw new CloudException("invalid_response", null, null, null, 14, null);
                                    }
                                    k41 k41VarF0 = mh0.f0(0, jSONArray.length());
                                    arrayList2 = new ArrayList(az.Y(k41VarF0, 10));
                                    it2 = k41VarF0.iterator();
                                    while (((j41) it2).g) {
                                        arrayList2.add(jSONArray.getString(((j41) it2).nextInt()));
                                    }
                                    setN0 = zy.N0(arrayList2);
                                    linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        if (setN0.contains((String) entry.getKey())) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    LocalSyncData localSyncData = this.local;
                                    c00892.L$0 = str16;
                                    c00892.L$1 = null;
                                    c00892.L$2 = null;
                                    c00892.L$3 = null;
                                    c00892.L$4 = mutex2;
                                    c00892.L$5 = map8;
                                    c00892.L$6 = null;
                                    c00892.L$7 = jSONObject;
                                    c00892.L$8 = null;
                                    c00892.L$9 = null;
                                    c00892.L$10 = null;
                                    c00892.L$11 = linkedHashMap2;
                                    c00892.L$12 = null;
                                    c00892.I$0 = i8;
                                    c00892.I$1 = i5;
                                    c00892.label = 5;
                                    objAuthenticatedJson$default2 = localSyncData.capture(c00892);
                                    if (objAuthenticatedJson$default2 == obj2) {
                                        return obj2;
                                    }
                                    mutex4 = mutex2;
                                    map9 = linkedHashMap2;
                                    i9 = i5;
                                    try {
                                        map10 = (Map) objAuthenticatedJson$default2;
                                        linkedHashMapO = jq1.O(map10, map9);
                                        setSyncedCategories = syncedCategories(profile(load(), str16));
                                        linkedHashMapO2 = jq1.O(map8, map9);
                                        j = jSONObject.getLong("revision");
                                        c00892.L$0 = null;
                                        c00892.L$1 = null;
                                        c00892.L$2 = null;
                                        c00892.L$3 = null;
                                        c00892.L$4 = mutex4;
                                        c00892.L$5 = null;
                                        c00892.L$6 = null;
                                        c00892.L$7 = null;
                                        c00892.L$8 = null;
                                        c00892.L$9 = null;
                                        c00892.L$10 = null;
                                        c00892.L$11 = null;
                                        c00892.L$12 = null;
                                        c00892.L$13 = null;
                                        c00892.L$14 = null;
                                        c00892.L$15 = null;
                                        c00892.I$0 = i8;
                                        c00892.I$1 = i9;
                                        c00892.label = 6;
                                        if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                                            return obj2;
                                        }
                                        mutex2 = mutex4;
                                        this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                                        mf3 mf3Var = mf3.a;
                                        mutex2.unlock(null);
                                        return mf3Var;
                                    } catch (Throwable th) {
                                        th = th;
                                        mutex2 = mutex4;
                                        obj = null;
                                        mutex2.unlock(obj);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = null;
                                    mutex2.unlock(obj);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            mutex2 = mutex3;
                            obj = null;
                            mutex2.unlock(obj);
                            throw th;
                        }
                    }
                    return obj3;
                case 1:
                    int i13 = c00892.I$0;
                    Mutex mutex5 = (Mutex) c00892.L$4;
                    String str18 = (String) c00892.L$3;
                    Map<String, ? extends Set<String>> map12 = (Map) c00892.L$2;
                    String str19 = (String) c00892.L$1;
                    String str20 = (String) c00892.L$0;
                    ee0.J(objAuthenticatedJson$default2);
                    str6 = str18;
                    map2 = map12;
                    mutex3 = mutex5;
                    str5 = str19;
                    i = i13;
                    str4 = str20;
                    requireScope(str4);
                    c00892.L$0 = str4;
                    c00892.L$1 = str5;
                    c00892.L$2 = map2;
                    c00892.L$3 = str6;
                    c00892.L$4 = mutex3;
                    c00892.I$0 = i;
                    c00892.I$1 = 0;
                    c00892.label = 2;
                    if (activate(str4, c00892) != obj3) {
                        int i14 = i;
                        str7 = str5;
                        i2 = i14;
                        String str110 = str6;
                        map3 = map2;
                        str8 = str110;
                        str9 = str4;
                        mutex2 = mutex3;
                        i3 = 0;
                        mapEntries = entries((JsonElement) profile(load(), str9).get("base"));
                        CloudRepository cloudRepository3 = this.cloud;
                        c00892.L$0 = str9;
                        c00892.L$1 = str7;
                        c00892.L$2 = map3;
                        c00892.L$3 = str8;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = mapEntries;
                        c00892.I$0 = i2;
                        c00892.I$1 = i3;
                        c00892.label = 3;
                        str10 = str8;
                        map4 = map3;
                        str11 = str7;
                        i4 = i2;
                        obj2 = obj3;
                        objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository3, "/v2/account/archives/current", null, null, null, str9, null, c00892, 46, null);
                        if (objAuthenticatedJson$default == obj2) {
                            return obj2;
                        }
                        str12 = str9;
                        str13 = str10;
                        map5 = map4;
                        str14 = str11;
                        map6 = mapEntries;
                        i5 = i3;
                        objAuthenticatedJson$default2 = objAuthenticatedJson$default;
                        i6 = i4;
                        requireScope(str12);
                        Map<String, ? extends Set<String>> map13 = map5;
                        JSONObject jSONObjectPut3 = new JSONObject().put("requestId", str13).put("kind", str14).put("baseRevision", ((JSONObject) objAuthenticatedJson$default2).getLong("revision"));
                        arrayList = new ArrayList(map13.size());
                        while (it.hasNext()) {
                            Map.Entry<String, ? extends Set<String>> next2 = it.next();
                            arrayList.add(new JSONObject().put("id", next2.getKey()).put("keys", new JSONArray((Collection) zy.B0(next2.getValue()))));
                        }
                        JSONObject jSONObjectPut4 = jSONObjectPut3.put("sources", new JSONArray((Collection) arrayList));
                        CloudRepository cloudRepository4 = this.cloud;
                        c00892.L$0 = str12;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = map6;
                        c00892.L$6 = null;
                        c00892.L$7 = null;
                        c00892.I$0 = i6;
                        c00892.I$1 = i5;
                        c00892.label = 4;
                        map7 = map6;
                        str15 = str12;
                        i7 = i6;
                        objAuthenticatedJson$default2 = CloudRepository.authenticatedJson$default(cloudRepository4, "/v2/account/archives/restore", null, jSONObjectPut4, null, str15, null, c00892, 42, null);
                        if (objAuthenticatedJson$default2 == obj2) {
                            return obj2;
                        }
                        str16 = str15;
                        map8 = map7;
                        i8 = i7;
                        jSONObject = (JSONObject) objAuthenticatedJson$default2;
                        requireScope(str16);
                        jSONObject2 = jSONObject.getJSONObject("entries");
                        Iterator<String> itKeys2 = jSONObject2.keys();
                        itKeys2.getClass();
                        us2 us2VarN2 = xs2.N(itKeys2);
                        linkedHashMap = new LinkedHashMap();
                        while (r3.hasNext()) {
                            linkedHashMap.put(obj4, jSONObject2.getString((String) obj4));
                        }
                        this.local.validate(linkedHashMap);
                        jSONArray = jSONObject.getJSONArray("restoredKeys");
                        if (jSONArray.length() > 10000) {
                            throw new CloudException("invalid_response", null, null, null, 14, null);
                        }
                        k41 k41VarF1 = mh0.f0(0, jSONArray.length());
                        arrayList2 = new ArrayList(az.Y(k41VarF1, 10));
                        it2 = k41VarF1.iterator();
                        while (((j41) it2).g) {
                            arrayList2.add(jSONArray.getString(((j41) it2).nextInt()));
                        }
                        setN0 = zy.N0(arrayList2);
                        linkedHashMap2 = new LinkedHashMap();
                        while (r5.hasNext()) {
                            if (setN0.contains((String) entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LocalSyncData localSyncData2 = this.local;
                        c00892.L$0 = str16;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = map8;
                        c00892.L$6 = null;
                        c00892.L$7 = jSONObject;
                        c00892.L$8 = null;
                        c00892.L$9 = null;
                        c00892.L$10 = null;
                        c00892.L$11 = linkedHashMap2;
                        c00892.L$12 = null;
                        c00892.I$0 = i8;
                        c00892.I$1 = i5;
                        c00892.label = 5;
                        objAuthenticatedJson$default2 = localSyncData2.capture(c00892);
                        if (objAuthenticatedJson$default2 == obj2) {
                            return obj2;
                        }
                        mutex4 = mutex2;
                        map9 = linkedHashMap2;
                        i9 = i5;
                        map10 = (Map) objAuthenticatedJson$default2;
                        linkedHashMapO = jq1.O(map10, map9);
                        setSyncedCategories = syncedCategories(profile(load(), str16));
                        linkedHashMapO2 = jq1.O(map8, map9);
                        j = jSONObject.getLong("revision");
                        c00892.L$0 = null;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex4;
                        c00892.L$5 = null;
                        c00892.L$6 = null;
                        c00892.L$7 = null;
                        c00892.L$8 = null;
                        c00892.L$9 = null;
                        c00892.L$10 = null;
                        c00892.L$11 = null;
                        c00892.L$12 = null;
                        c00892.L$13 = null;
                        c00892.L$14 = null;
                        c00892.L$15 = null;
                        c00892.I$0 = i8;
                        c00892.I$1 = i9;
                        c00892.label = 6;
                        if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                            return obj2;
                        }
                        mutex2 = mutex4;
                        this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                        mf3 mf3Var2 = mf3.a;
                        mutex2.unlock(null);
                        return mf3Var2;
                    }
                    return obj3;
                case 2:
                    int i15 = c00892.I$1;
                    i2 = c00892.I$0;
                    Mutex mutex6 = (Mutex) c00892.L$4;
                    String str21 = (String) c00892.L$3;
                    Map<String, ? extends Set<String>> map14 = (Map) c00892.L$2;
                    String str22 = (String) c00892.L$1;
                    String str23 = (String) c00892.L$0;
                    try {
                        ee0.J(objAuthenticatedJson$default2);
                        i3 = i15;
                        mutex2 = mutex6;
                        str8 = str21;
                        map3 = map14;
                        str7 = str22;
                        str9 = str23;
                        mapEntries = entries((JsonElement) profile(load(), str9).get("base"));
                        CloudRepository cloudRepository5 = this.cloud;
                        c00892.L$0 = str9;
                        c00892.L$1 = str7;
                        c00892.L$2 = map3;
                        c00892.L$3 = str8;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = mapEntries;
                        c00892.I$0 = i2;
                        c00892.I$1 = i3;
                        c00892.label = 3;
                        str10 = str8;
                        map4 = map3;
                        str11 = str7;
                        i4 = i2;
                        obj2 = obj3;
                        objAuthenticatedJson$default = CloudRepository.authenticatedJson$default(cloudRepository5, "/v2/account/archives/current", null, null, null, str9, null, c00892, 46, null);
                        if (objAuthenticatedJson$default == obj2) {
                            return obj2;
                        }
                        str12 = str9;
                        str13 = str10;
                        map5 = map4;
                        str14 = str11;
                        map6 = mapEntries;
                        i5 = i3;
                        objAuthenticatedJson$default2 = objAuthenticatedJson$default;
                        i6 = i4;
                        requireScope(str12);
                        Map<String, ? extends Set<String>> map15 = map5;
                        JSONObject jSONObjectPut5 = new JSONObject().put("requestId", str13).put("kind", str14).put("baseRevision", ((JSONObject) objAuthenticatedJson$default2).getLong("revision"));
                        arrayList = new ArrayList(map15.size());
                        while (it.hasNext()) {
                            Map.Entry<String, ? extends Set<String>> next3 = it.next();
                            arrayList.add(new JSONObject().put("id", next3.getKey()).put("keys", new JSONArray((Collection) zy.B0(next3.getValue()))));
                        }
                        JSONObject jSONObjectPut6 = jSONObjectPut5.put("sources", new JSONArray((Collection) arrayList));
                        CloudRepository cloudRepository6 = this.cloud;
                        c00892.L$0 = str12;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = map6;
                        c00892.L$6 = null;
                        c00892.L$7 = null;
                        c00892.I$0 = i6;
                        c00892.I$1 = i5;
                        c00892.label = 4;
                        map7 = map6;
                        str15 = str12;
                        i7 = i6;
                        objAuthenticatedJson$default2 = CloudRepository.authenticatedJson$default(cloudRepository6, "/v2/account/archives/restore", null, jSONObjectPut6, null, str15, null, c00892, 42, null);
                        if (objAuthenticatedJson$default2 == obj2) {
                            return obj2;
                        }
                        str16 = str15;
                        map8 = map7;
                        i8 = i7;
                        jSONObject = (JSONObject) objAuthenticatedJson$default2;
                        requireScope(str16);
                        jSONObject2 = jSONObject.getJSONObject("entries");
                        Iterator<String> itKeys3 = jSONObject2.keys();
                        itKeys3.getClass();
                        us2 us2VarN3 = xs2.N(itKeys3);
                        linkedHashMap = new LinkedHashMap();
                        while (r3.hasNext()) {
                            linkedHashMap.put(obj4, jSONObject2.getString((String) obj4));
                        }
                        this.local.validate(linkedHashMap);
                        jSONArray = jSONObject.getJSONArray("restoredKeys");
                        if (jSONArray.length() > 10000) {
                            throw new CloudException("invalid_response", null, null, null, 14, null);
                        }
                        k41 k41VarF2 = mh0.f0(0, jSONArray.length());
                        arrayList2 = new ArrayList(az.Y(k41VarF2, 10));
                        it2 = k41VarF2.iterator();
                        while (((j41) it2).g) {
                            arrayList2.add(jSONArray.getString(((j41) it2).nextInt()));
                        }
                        setN0 = zy.N0(arrayList2);
                        linkedHashMap2 = new LinkedHashMap();
                        while (r5.hasNext()) {
                            if (setN0.contains((String) entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LocalSyncData localSyncData3 = this.local;
                        c00892.L$0 = str16;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex2;
                        c00892.L$5 = map8;
                        c00892.L$6 = null;
                        c00892.L$7 = jSONObject;
                        c00892.L$8 = null;
                        c00892.L$9 = null;
                        c00892.L$10 = null;
                        c00892.L$11 = linkedHashMap2;
                        c00892.L$12 = null;
                        c00892.I$0 = i8;
                        c00892.I$1 = i5;
                        c00892.label = 5;
                        objAuthenticatedJson$default2 = localSyncData3.capture(c00892);
                        if (objAuthenticatedJson$default2 == obj2) {
                            return obj2;
                        }
                        mutex4 = mutex2;
                        map9 = linkedHashMap2;
                        i9 = i5;
                        map10 = (Map) objAuthenticatedJson$default2;
                        linkedHashMapO = jq1.O(map10, map9);
                        setSyncedCategories = syncedCategories(profile(load(), str16));
                        linkedHashMapO2 = jq1.O(map8, map9);
                        j = jSONObject.getLong("revision");
                        c00892.L$0 = null;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex4;
                        c00892.L$5 = null;
                        c00892.L$6 = null;
                        c00892.L$7 = null;
                        c00892.L$8 = null;
                        c00892.L$9 = null;
                        c00892.L$10 = null;
                        c00892.L$11 = null;
                        c00892.L$12 = null;
                        c00892.L$13 = null;
                        c00892.L$14 = null;
                        c00892.L$15 = null;
                        c00892.I$0 = i8;
                        c00892.I$1 = i9;
                        c00892.label = 6;
                        if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                            return obj2;
                        }
                        mutex2 = mutex4;
                        this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                        mf3 mf3Var3 = mf3.a;
                        mutex2.unlock(null);
                        return mf3Var3;
                    } catch (Throwable th4) {
                        th = th4;
                        mutex2 = mutex6;
                        obj = null;
                        mutex2.unlock(obj);
                        throw th;
                    }
                case 3:
                    int i16 = c00892.I$1;
                    int i17 = c00892.I$0;
                    Map<String, String> map16 = (Map) c00892.L$5;
                    Mutex mutex7 = (Mutex) c00892.L$4;
                    str13 = (String) c00892.L$3;
                    map5 = (Map) c00892.L$2;
                    str14 = (String) c00892.L$1;
                    str12 = (String) c00892.L$0;
                    ee0.J(objAuthenticatedJson$default2);
                    i5 = i16;
                    obj2 = obj3;
                    i6 = i17;
                    map6 = map16;
                    mutex2 = mutex7;
                    requireScope(str12);
                    Map<String, ? extends Set<String>> map17 = map5;
                    JSONObject jSONObjectPut7 = new JSONObject().put("requestId", str13).put("kind", str14).put("baseRevision", ((JSONObject) objAuthenticatedJson$default2).getLong("revision"));
                    arrayList = new ArrayList(map17.size());
                    while (it.hasNext()) {
                        Map.Entry<String, ? extends Set<String>> next4 = it.next();
                        arrayList.add(new JSONObject().put("id", next4.getKey()).put("keys", new JSONArray((Collection) zy.B0(next4.getValue()))));
                    }
                    JSONObject jSONObjectPut8 = jSONObjectPut7.put("sources", new JSONArray((Collection) arrayList));
                    CloudRepository cloudRepository7 = this.cloud;
                    c00892.L$0 = str12;
                    c00892.L$1 = null;
                    c00892.L$2 = null;
                    c00892.L$3 = null;
                    c00892.L$4 = mutex2;
                    c00892.L$5 = map6;
                    c00892.L$6 = null;
                    c00892.L$7 = null;
                    c00892.I$0 = i6;
                    c00892.I$1 = i5;
                    c00892.label = 4;
                    map7 = map6;
                    str15 = str12;
                    i7 = i6;
                    objAuthenticatedJson$default2 = CloudRepository.authenticatedJson$default(cloudRepository7, "/v2/account/archives/restore", null, jSONObjectPut8, null, str15, null, c00892, 42, null);
                    if (objAuthenticatedJson$default2 == obj2) {
                        return obj2;
                    }
                    str16 = str15;
                    map8 = map7;
                    i8 = i7;
                    jSONObject = (JSONObject) objAuthenticatedJson$default2;
                    requireScope(str16);
                    jSONObject2 = jSONObject.getJSONObject("entries");
                    Iterator<String> itKeys4 = jSONObject2.keys();
                    itKeys4.getClass();
                    us2 us2VarN4 = xs2.N(itKeys4);
                    linkedHashMap = new LinkedHashMap();
                    while (r3.hasNext()) {
                        linkedHashMap.put(obj4, jSONObject2.getString((String) obj4));
                    }
                    this.local.validate(linkedHashMap);
                    jSONArray = jSONObject.getJSONArray("restoredKeys");
                    if (jSONArray.length() > 10000) {
                        throw new CloudException("invalid_response", null, null, null, 14, null);
                    }
                    k41 k41VarF3 = mh0.f0(0, jSONArray.length());
                    arrayList2 = new ArrayList(az.Y(k41VarF3, 10));
                    it2 = k41VarF3.iterator();
                    while (((j41) it2).g) {
                        arrayList2.add(jSONArray.getString(((j41) it2).nextInt()));
                    }
                    setN0 = zy.N0(arrayList2);
                    linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
                        if (setN0.contains((String) entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LocalSyncData localSyncData4 = this.local;
                    c00892.L$0 = str16;
                    c00892.L$1 = null;
                    c00892.L$2 = null;
                    c00892.L$3 = null;
                    c00892.L$4 = mutex2;
                    c00892.L$5 = map8;
                    c00892.L$6 = null;
                    c00892.L$7 = jSONObject;
                    c00892.L$8 = null;
                    c00892.L$9 = null;
                    c00892.L$10 = null;
                    c00892.L$11 = linkedHashMap2;
                    c00892.L$12 = null;
                    c00892.I$0 = i8;
                    c00892.I$1 = i5;
                    c00892.label = 5;
                    objAuthenticatedJson$default2 = localSyncData4.capture(c00892);
                    if (objAuthenticatedJson$default2 == obj2) {
                        return obj2;
                    }
                    mutex4 = mutex2;
                    map9 = linkedHashMap2;
                    i9 = i5;
                    map10 = (Map) objAuthenticatedJson$default2;
                    linkedHashMapO = jq1.O(map10, map9);
                    setSyncedCategories = syncedCategories(profile(load(), str16));
                    linkedHashMapO2 = jq1.O(map8, map9);
                    j = jSONObject.getLong("revision");
                    c00892.L$0 = null;
                    c00892.L$1 = null;
                    c00892.L$2 = null;
                    c00892.L$3 = null;
                    c00892.L$4 = mutex4;
                    c00892.L$5 = null;
                    c00892.L$6 = null;
                    c00892.L$7 = null;
                    c00892.L$8 = null;
                    c00892.L$9 = null;
                    c00892.L$10 = null;
                    c00892.L$11 = null;
                    c00892.L$12 = null;
                    c00892.L$13 = null;
                    c00892.L$14 = null;
                    c00892.L$15 = null;
                    c00892.I$0 = i8;
                    c00892.I$1 = i9;
                    c00892.label = 6;
                    if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                        return obj2;
                    }
                    mutex2 = mutex4;
                    this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                    mf3 mf3Var4 = mf3.a;
                    mutex2.unlock(null);
                    return mf3Var4;
                case 4:
                    int i18 = c00892.I$1;
                    i8 = c00892.I$0;
                    Map<String, String> map18 = (Map) c00892.L$5;
                    Mutex mutex8 = (Mutex) c00892.L$4;
                    String str24 = (String) c00892.L$0;
                    ee0.J(objAuthenticatedJson$default2);
                    i5 = i18;
                    obj2 = obj3;
                    mutex2 = mutex8;
                    str16 = str24;
                    map8 = map18;
                    jSONObject = (JSONObject) objAuthenticatedJson$default2;
                    requireScope(str16);
                    jSONObject2 = jSONObject.getJSONObject("entries");
                    Iterator<String> itKeys5 = jSONObject2.keys();
                    itKeys5.getClass();
                    us2 us2VarN5 = xs2.N(itKeys5);
                    linkedHashMap = new LinkedHashMap();
                    while (r3.hasNext()) {
                        linkedHashMap.put(obj4, jSONObject2.getString((String) obj4));
                    }
                    this.local.validate(linkedHashMap);
                    jSONArray = jSONObject.getJSONArray("restoredKeys");
                    if (jSONArray.length() > 10000) {
                        throw new CloudException("invalid_response", null, null, null, 14, null);
                    }
                    k41 k41VarF4 = mh0.f0(0, jSONArray.length());
                    arrayList2 = new ArrayList(az.Y(k41VarF4, 10));
                    it2 = k41VarF4.iterator();
                    while (((j41) it2).g) {
                        arrayList2.add(jSONArray.getString(((j41) it2).nextInt()));
                    }
                    setN0 = zy.N0(arrayList2);
                    linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
                        if (setN0.contains((String) entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LocalSyncData localSyncData5 = this.local;
                    c00892.L$0 = str16;
                    c00892.L$1 = null;
                    c00892.L$2 = null;
                    c00892.L$3 = null;
                    c00892.L$4 = mutex2;
                    c00892.L$5 = map8;
                    c00892.L$6 = null;
                    c00892.L$7 = jSONObject;
                    c00892.L$8 = null;
                    c00892.L$9 = null;
                    c00892.L$10 = null;
                    c00892.L$11 = linkedHashMap2;
                    c00892.L$12 = null;
                    c00892.I$0 = i8;
                    c00892.I$1 = i5;
                    c00892.label = 5;
                    objAuthenticatedJson$default2 = localSyncData5.capture(c00892);
                    if (objAuthenticatedJson$default2 == obj2) {
                        return obj2;
                    }
                    mutex4 = mutex2;
                    map9 = linkedHashMap2;
                    i9 = i5;
                    map10 = (Map) objAuthenticatedJson$default2;
                    linkedHashMapO = jq1.O(map10, map9);
                    setSyncedCategories = syncedCategories(profile(load(), str16));
                    linkedHashMapO2 = jq1.O(map8, map9);
                    j = jSONObject.getLong("revision");
                    c00892.L$0 = null;
                    c00892.L$1 = null;
                    c00892.L$2 = null;
                    c00892.L$3 = null;
                    c00892.L$4 = mutex4;
                    c00892.L$5 = null;
                    c00892.L$6 = null;
                    c00892.L$7 = null;
                    c00892.L$8 = null;
                    c00892.L$9 = null;
                    c00892.L$10 = null;
                    c00892.L$11 = null;
                    c00892.L$12 = null;
                    c00892.L$13 = null;
                    c00892.L$14 = null;
                    c00892.L$15 = null;
                    c00892.I$0 = i8;
                    c00892.I$1 = i9;
                    c00892.label = 6;
                    if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                        return obj2;
                    }
                    mutex2 = mutex4;
                    this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                    mf3 mf3Var5 = mf3.a;
                    mutex2.unlock(null);
                    return mf3Var5;
                case Logger.WARN /* 5 */:
                    i9 = c00892.I$1;
                    i8 = c00892.I$0;
                    map9 = (Map) c00892.L$11;
                    jSONObject = (JSONObject) c00892.L$7;
                    map8 = (Map) c00892.L$5;
                    Mutex mutex9 = (Mutex) c00892.L$4;
                    str16 = (String) c00892.L$0;
                    try {
                        ee0.J(objAuthenticatedJson$default2);
                        obj2 = obj3;
                        mutex4 = mutex9;
                        map10 = (Map) objAuthenticatedJson$default2;
                        linkedHashMapO = jq1.O(map10, map9);
                        setSyncedCategories = syncedCategories(profile(load(), str16));
                        linkedHashMapO2 = jq1.O(map8, map9);
                        j = jSONObject.getLong("revision");
                        c00892.L$0 = null;
                        c00892.L$1 = null;
                        c00892.L$2 = null;
                        c00892.L$3 = null;
                        c00892.L$4 = mutex4;
                        c00892.L$5 = null;
                        c00892.L$6 = null;
                        c00892.L$7 = null;
                        c00892.L$8 = null;
                        c00892.L$9 = null;
                        c00892.L$10 = null;
                        c00892.L$11 = null;
                        c00892.L$12 = null;
                        c00892.L$13 = null;
                        c00892.L$14 = null;
                        c00892.L$15 = null;
                        c00892.I$0 = i8;
                        c00892.I$1 = i9;
                        c00892.label = 6;
                        if (applyLogged$default(this, str16, linkedHashMapO, linkedHashMapO2, j, map10, null, setSyncedCategories, c00892, 32, null) == obj2) {
                            return obj2;
                        }
                        mutex2 = mutex4;
                        this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                        mf3 mf3Var6 = mf3.a;
                        mutex2.unlock(null);
                        return mf3Var6;
                    } catch (Throwable th5) {
                        th = th5;
                        mutex2 = mutex9;
                        obj = null;
                        mutex2.unlock(obj);
                        throw th;
                    }
                case Logger.ERROR /* 6 */:
                    mutex2 = (Mutex) c00892.L$4;
                    try {
                        ee0.J(objAuthenticatedJson$default2);
                        this._state.setValue(new AccountSyncState(false, new Long(System.currentTimeMillis()), null, null, 13, null));
                        mf3 mf3Var7 = mf3.a;
                        mutex2.unlock(null);
                        return mf3Var7;
                    } catch (Throwable th6) {
                        th = th6;
                        obj = null;
                        mutex2.unlock(obj);
                        throw th;
                    }
                default:
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th7) {
            th = th7;
            mutex2 = mutex;
        }
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C00911(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C00922(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass3(null), 3, null);
    }
}
