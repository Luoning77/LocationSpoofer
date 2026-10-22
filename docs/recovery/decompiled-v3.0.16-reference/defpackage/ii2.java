package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ii2 {
    public static final di2 Companion = new di2();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private jp autoCloser;
    private p90 configuration;
    private bi2 connectionManager;
    private CoroutineScope coroutineScope;
    private Executor internalQueryExecutor;
    private a61 internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends ai2> mCallbacks;
    protected volatile s23 mDatabase;
    private y70 transactionContext;
    private final cy closeBarrier = new cy(new w12(0, this, ii2.class, "onClosed", "onClosed()V", 0, 8));
    private final ThreadLocal<y70> suspendingTransactionContext = new ThreadLocal<>();
    private final Map<l81, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static final void access$onClosed(ii2 ii2Var) throws Exception {
        CoroutineScope coroutineScope = ii2Var.coroutineScope;
        q60 q60Var = null;
        if (coroutineScope == null) {
            o51.F("coroutineScope");
            throw null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        pw1 pw1Var = ii2Var.getInvalidationTracker().i;
        if (pw1Var != null) {
            int i = 0;
            if (pw1Var.e.compareAndSet(false, true)) {
                a61 a61Var = pw1Var.b;
                d31 d31Var = pw1Var.i;
                d31Var.getClass();
                ReentrantLock reentrantLock = a61Var.e;
                reentrantLock.lock();
                try {
                    b12 b12Var = (b12) a61Var.d.remove(d31Var);
                    reentrantLock.unlock();
                    if (b12Var != null) {
                        ld3 ld3Var = a61Var.c;
                        int[] iArr = b12Var.b;
                        ld3Var.getClass();
                        iArr.getClass();
                        if (ld3Var.h.b(iArr)) {
                            gh0.P(new z51(a61Var, q60Var, i));
                        }
                    }
                    try {
                        h01 h01Var = pw1Var.g;
                        if (h01Var != null) {
                            h01Var.c(pw1Var.j, pw1Var.f);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                    }
                    pw1Var.c.unbindService(pw1Var.k);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        bi2 bi2Var = ii2Var.connectionManager;
        if (bi2Var == null) {
            o51.F("connectionManager");
            throw null;
        }
        bi2Var.f.close();
        t23 t23Var = bi2Var.g;
        if (t23Var != null) {
            t23Var.close();
        }
    }

    public static /* synthetic */ Cursor query$default(ii2 ii2Var, v23 v23Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return ii2Var.query(v23Var, cancellationSignal);
    }

    public final Object a(au0 au0Var) {
        if (inCompatibilityMode()) {
            beginTransaction();
            try {
                Object objInvoke = au0Var.invoke();
                setTransactionSuccessful();
                return objInvoke;
            } finally {
                endTransaction();
            }
        }
        m4 m4Var = new m4(7, au0Var);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        y70 y70Var = getSuspendingTransactionContext().get();
        if (y70Var == null) {
            y70Var = sj0.e;
        }
        return gh0.P(new m(y70Var, this, m4Var, null, 5));
    }

    public final void addTypeConverter$room_runtime(l81 l81Var, Object obj) {
        l81Var.getClass();
        obj.getClass();
        this.typeConverters.put(l81Var, obj);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            fo.n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode() || inTransaction()) {
            return;
        }
        y70 y70Var = this.suspendingTransactionContext.get();
        if ((y70Var != null ? (vb3) y70Var.get(vb3.f) : null) == null) {
            return;
        }
        fo.n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @cc0
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        s23 s23VarV = getOpenHelper().V();
        if (!s23VarV.c()) {
            a61 invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            gh0.P(new z51(invalidationTracker, null, 1));
        }
        if (s23VarV.E()) {
            s23VarV.N();
        } else {
            s23VarV.h();
        }
    }

    public abstract void clearAllTables();

    public void close() throws Exception {
        cy cyVar = this.closeBarrier;
        synchronized (cyVar) {
            if (cyVar.c.compareAndSet(false, true)) {
                while (cyVar.b.get() != 0) {
                }
                cyVar.a.invoke();
            }
        }
    }

    public a33 compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().V().t(str);
    }

    public List<xt1> createAutoMigrations(Map<l81, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(jq1.M(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(ig0.r((l81) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final bi2 createConnectionManager$room_runtime(p90 p90Var) {
        li2 li2Var;
        p90Var.getClass();
        try {
            mi2 mi2VarCreateOpenDelegate = createOpenDelegate();
            mi2VarCreateOpenDelegate.getClass();
            li2Var = (li2) mi2VarCreateOpenDelegate;
        } catch (g02 unused) {
            li2Var = null;
        }
        if (li2Var == null) {
            return new bi2(p90Var, new ge2(this, 4), new t5(2, this, ji2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 5));
        }
        return new bi2(p90Var, li2Var, new t5(2, this, ji2.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 6));
    }

    public abstract a61 createInvalidationTracker();

    public mi2 createOpenDelegate() {
        throw new g02(0);
    }

    @cc0
    public t23 createOpenHelper(p90 p90Var) {
        p90Var.getClass();
        throw new g02(0);
    }

    @cc0
    public void endTransaction() {
        getOpenHelper().V().g();
        if (inTransaction()) {
            return;
        }
        a61 invalidationTracker = getInvalidationTracker();
        invalidationTracker.c.c(invalidationTracker.f, invalidationTracker.g);
    }

    @cc0
    public List<xt1> getAutoMigrations(Map<Class<Object>, Object> map) {
        map.getClass();
        return uj0.e;
    }

    public final cy getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o51.F("coroutineScope");
        throw null;
    }

    public final al2 getDriver() {
        p90 p90Var = this.configuration;
        if (p90Var == null) {
            o51.F("configuration");
            throw null;
        }
        al2 al2Var = p90Var.t;
        if (al2Var != null) {
            return al2Var;
        }
        fo.n("No SQLiteDriver was configured with Room.");
        return null;
    }

    public a61 getInvalidationTracker() {
        a61 a61Var = this.internalTracker;
        if (a61Var != null) {
            return a61Var;
        }
        o51.F("internalTracker");
        throw null;
    }

    public t23 getOpenHelper() {
        bi2 bi2Var = this.connectionManager;
        if (bi2Var == null) {
            o51.F("connectionManager");
            throw null;
        }
        t23 t23Var = bi2Var.g;
        if (t23Var != null) {
            return t23Var;
        }
        fo.n("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final String getPath() {
        p90 p90Var = this.configuration;
        if (p90Var == null) {
            o51.F("configuration");
            throw null;
        }
        String str = p90Var.b;
        if (str != null) {
            return p90Var.a.getDatabasePath(str).getPath();
        }
        return null;
    }

    public final y70 getQueryContext() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope.getCoroutineContext();
        }
        o51.F("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        o51.F("internalQueryExecutor");
        throw null;
    }

    public Set<l81> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(az.Y(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            cls.getClass();
            arrayList.add(xe2.a(cls));
        }
        return zy.N0(arrayList);
    }

    @cc0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return zj0.e;
    }

    public Map<l81, List<l81>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iM = jq1.M(az.Y(setEntrySet, 10));
        if (iM < 16) {
            iM = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            ox oxVarA = xe2.a(cls);
            ArrayList arrayList = new ArrayList(az.Y(list, 10));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(xe2.a(cls2));
            }
            linkedHashMap.put(oxVarA, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<l81, List<l81>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return vj0.e;
    }

    public final ThreadLocal<y70> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final y70 getTransactionContext$room_runtime() {
        y70 y70Var = this.transactionContext;
        if (y70Var != null) {
            return y70Var;
        }
        o51.F("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        o51.F("internalTransactionExecutor");
        throw null;
    }

    @cc0
    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(xe2.a(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        bi2 bi2Var = this.connectionManager;
        if (bi2Var != null) {
            return bi2Var.g != null;
        }
        o51.F("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().V().c();
    }

    /* JADX WARN: Code duplicated, block: B:134:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0071 A[LOOP:0: B:3:0x0035->B:16:0x0071, LOOP_END] */
    public void init(p90 p90Var) {
        y70 coroutineContext;
        boolean zContainsKey;
        boolean z;
        int i;
        int i2;
        p90Var.getClass();
        String str = p90Var.b;
        Intent intent = p90Var.j;
        y70 y70Var = p90Var.u;
        this.configuration = p90Var;
        boolean z2 = true;
        this.useTempTrackingTable = true;
        this.connectionManager = createConnectionManager$room_runtime(p90Var);
        this.internalTracker = createInvalidationTracker();
        nk1 nk1Var = p90Var.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<l81> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List list = p90Var.r;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<l81> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i3 = -1;
            if (!it.hasNext()) {
                boolean z3 = z2;
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            fo.i("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return;
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size2 = i4;
                        }
                    }
                }
                for (xt1 xt1Var : createAutoMigrations(linkedHashMap)) {
                    int i5 = xt1Var.startVersion;
                    int i6 = xt1Var.endVersion;
                    LinkedHashMap linkedHashMap2 = nk1Var.a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                        if (map == null) {
                            map = vj0.e;
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i6));
                    } else {
                        zContainsKey = false;
                    }
                    if (!zContainsKey) {
                        nk1Var.a(xt1Var);
                    }
                }
                Map<l81, List<l81>> requiredTypeConverterClassesMap$room_runtime = getRequiredTypeConverterClassesMap$room_runtime();
                List list2 = p90Var.q;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<l81, List<l81>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
                    l81 key = entry.getKey();
                    for (l81 l81Var : entry.getValue()) {
                        int size3 = list2.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i7 = size3 - 1;
                            if (((ox) l81Var).d(list2.get(size3))) {
                                zArr2[size3] = z3;
                                break;
                            } else {
                                if (i7 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i7;
                            }
                        }
                        if (size3 < 0) {
                            b81.t("A required type converter (", ((ox) l81Var).b(), ") for ", ((ox) key).b(), " is missing in the database configuration.");
                            return;
                        }
                        addTypeConverter$room_runtime(l81Var, list2.get(size3));
                    }
                }
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i8 = size4 - 1;
                        if (!zArr2[size4]) {
                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                        if (i8 < 0) {
                            break;
                        } else {
                            size4 = i8;
                        }
                    }
                }
                t23 t23Var = null;
                if (y70Var != null) {
                    w70 w70Var = y70Var.get(j9.B);
                    w70Var.getClass();
                    CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) w70Var;
                    Executor executorAsExecutor = ExecutorsKt.asExecutor(coroutineDispatcher);
                    this.internalQueryExecutor = executorAsExecutor;
                    if (executorAsExecutor == null) {
                        o51.F("internalQueryExecutor");
                        throw null;
                    }
                    this.internalTransactionExecutor = new in(executorAsExecutor);
                    this.coroutineScope = CoroutineScopeKt.CoroutineScope(y70Var.plus(SupervisorKt.SupervisorJob((Job) y70Var.get(Job.Key))));
                    boolean zInCompatibilityMode = inCompatibilityMode();
                    CoroutineScope coroutineScope = this.coroutineScope;
                    if (zInCompatibilityMode) {
                        if (coroutineScope == null) {
                            o51.F("coroutineScope");
                            throw null;
                        }
                        coroutineContext = coroutineScope.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(z3 ? 1 : 0));
                    } else {
                        if (coroutineScope == null) {
                            o51.F("coroutineScope");
                            throw null;
                        }
                        coroutineContext = coroutineScope.getCoroutineContext();
                    }
                    this.transactionContext = coroutineContext;
                } else {
                    this.internalQueryExecutor = p90Var.h;
                    this.internalTransactionExecutor = new in(p90Var.i);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        o51.F("internalQueryExecutor");
                        throw null;
                    }
                    CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                    this.coroutineScope = CoroutineScope;
                    if (CoroutineScope == null) {
                        o51.F("coroutineScope");
                        throw null;
                    }
                    y70 coroutineContext2 = CoroutineScope.getCoroutineContext();
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        o51.F("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = coroutineContext2.plus(ExecutorsKt.from(executor2));
                }
                this.allowMainThreadQueries = p90Var.f;
                bi2 bi2Var = this.connectionManager;
                if (bi2Var == null) {
                    o51.F("connectionManager");
                    throw null;
                }
                t23 delegate = bi2Var.g;
                if (delegate == null) {
                    delegate = null;
                    break;
                }
                while (!(delegate instanceof eb2)) {
                    if (!(delegate instanceof mb0)) {
                        delegate = null;
                        break;
                    }
                    delegate = ((mb0) delegate).getDelegate();
                }
                bi2 bi2Var2 = this.connectionManager;
                if (bi2Var2 == null) {
                    o51.F("connectionManager");
                    throw null;
                }
                t23 delegate2 = bi2Var2.g;
                if (delegate2 != null) {
                    while (true) {
                        if (delegate2 instanceof kp) {
                            t23Var = delegate2;
                            break;
                        } else if (!(delegate2 instanceof mb0)) {
                            break;
                        } else {
                            delegate2 = ((mb0) delegate2).getDelegate();
                        }
                    }
                }
                if (intent != null) {
                    if (str == null) {
                        fo.i("Required value was null.");
                        return;
                    }
                    a61 invalidationTracker = getInvalidationTracker();
                    Context context = p90Var.a;
                    invalidationTracker.getClass();
                    invalidationTracker.h = intent;
                    invalidationTracker.i = new pw1(context, str, invalidationTracker);
                    return;
                }
                return;
            }
            l81 next = it.next();
            int size5 = list.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i9 = size5 - 1;
                    i = i3;
                    z = z2;
                    if (((ox) next).d(list.get(size5))) {
                        zArr[size5] = z;
                        i2 = size5;
                        break;
                    } else if (i9 >= 0) {
                        size5 = i9;
                        i3 = i;
                        z2 = z;
                    }
                }
                if (i2 >= 0) {
                    b81.r(((ox) next).b(), "A required auto migration spec (", ") is missing in the database configuration.");
                    return;
                } else {
                    linkedHashMap.put(next, list.get(i2));
                    z2 = z;
                }
            } else {
                z = z2;
                i = -1;
            }
            i2 = i;
            if (i2 >= 0) {
                b81.r(((ox) next).b(), "A required auto migration spec (", ") is missing in the database configuration.");
                return;
            } else {
                linkedHashMap.put(next, list.get(i2));
                z2 = z;
            }
        }
    }

    public final void internalInitInvalidationTracker(zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        a61 invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        ld3 ld3Var = invalidationTracker.c;
        ld3Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0("PRAGMA query_only");
        try {
            bl2VarA0.R();
            boolean zI = bl2VarA0.I();
            am1.j(bl2VarA0, null);
            if (!zI) {
                mh0.D("PRAGMA temp_store = MEMORY", zk2Var);
                mh0.D("PRAGMA recursive_triggers = 1", zk2Var);
                mh0.D("DROP TABLE IF EXISTS room_table_modification_log", zk2Var);
                if (ld3Var.d) {
                    mh0.D("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", zk2Var);
                } else {
                    mh0.D(s13.X("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false), zk2Var);
                }
                x02 x02Var = ld3Var.h;
                ReentrantLock reentrantLock = x02Var.a;
                reentrantLock.lock();
                try {
                    x02Var.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (invalidationTracker.j) {
                try {
                    pw1 pw1Var = invalidationTracker.i;
                    if (pw1Var != null) {
                        Intent intent = invalidationTracker.h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        pw1Var.a(intent);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                am1.j(bl2VarA0, th3);
                throw th4;
            }
        }
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        bi2 bi2Var = this.connectionManager;
        if (bi2Var == null) {
            o51.F("connectionManager");
            throw null;
        }
        s23 s23Var = bi2Var.h;
        if (s23Var != null) {
            return s23Var.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        bi2 bi2Var = this.connectionManager;
        if (bi2Var == null) {
            o51.F("connectionManager");
            throw null;
        }
        s23 s23Var = bi2Var.h;
        if (s23Var != null) {
            return s23Var.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        gh0.P(new hi2(this, z, strArr, null));
    }

    public Cursor query(v23 v23Var, CancellationSignal cancellationSignal) {
        v23Var.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().V().K(v23Var, cancellationSignal) : getOpenHelper().V().k(v23Var);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        return (V) a(new hd(callable, 28));
    }

    @cc0
    public void setTransactionSuccessful() {
        getOpenHelper().V().J();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection(boolean z, pu0 pu0Var, q60 q60Var) {
        bi2 bi2Var = this.connectionManager;
        if (bi2Var != null) {
            return bi2Var.f.z(z, pu0Var, q60Var);
        }
        o51.F("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(l81 l81Var) {
        l81Var.getClass();
        T t = (T) this.typeConverters.get(l81Var);
        t.getClass();
        return t;
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        a(new hd(runnable, 27));
    }

    @cc0
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @cc0
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().V().k(new z92(3, str, objArr));
    }

    public final Cursor query(v23 v23Var) {
        v23Var.getClass();
        return query$default(this, v23Var, null, 2, null);
    }

    @cc0
    public void internalInitInvalidationTracker(s23 s23Var) throws Exception {
        s23Var.getClass();
        internalInitInvalidationTracker(new r23(s23Var));
    }
}
