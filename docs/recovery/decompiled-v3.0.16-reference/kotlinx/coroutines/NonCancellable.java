package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.lu0;
import defpackage.q60;
import defpackage.us2;
import defpackage.yj0;
import defpackage.z;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class NonCancellable extends z implements Job {
    public static final NonCancellable INSTANCE = new NonCancellable();
    private static final String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private NonCancellable() {
        super(Job.Key);
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public ChildHandle attachChild(ChildJob childJob) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public us2 getChildren() {
        return yj0.a;
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public DisposableHandle invokeOnCompletion(lu0 lu0Var) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public Object join(q60 q60Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public DisposableHandle invokeOnCompletion(boolean z, boolean z2, lu0 lu0Var) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @cc0
    public void cancel(CancellationException cancellationException) {
    }

    @cc0
    public static /* synthetic */ void getChildren$annotations() {
    }

    @cc0
    public static /* synthetic */ void getOnJoin$annotations() {
    }

    @cc0
    public static /* synthetic */ void getParent$annotations() {
    }

    @cc0
    public static /* synthetic */ void isActive$annotations() {
    }

    @cc0
    public static /* synthetic */ void isCancelled$annotations() {
    }

    @cc0
    public static /* synthetic */ void isCompleted$annotations() {
    }
}
