package kotlinx.coroutines.debug.internal;

import defpackage.a80;
import defpackage.am1;
import defpackage.dh0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.uj0;
import defpackage.vg2;
import defpackage.vs2;
import defpackage.ws2;
import defpackage.y70;
import defpackage.z70;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebugCoroutineInfoImpl {
    private final WeakReference<y70> _context;
    public volatile WeakReference<a80> _lastObservedFrame;
    public volatile String _state = DebugCoroutineInfoImplKt.CREATED;
    private final StackTraceFrame creationStackBottom;
    public volatile Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", l = {164}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends vg2 implements pu0 {
        final /* synthetic */ StackTraceFrame $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StackTraceFrame stackTraceFrame, q60 q60Var) {
            super(2, q60Var);
            this.$bottom = stackTraceFrame;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = DebugCoroutineInfoImpl.this.new AnonymousClass1(this.$bottom, q60Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.pu0
        public final Object invoke(ws2 ws2Var, q60 q60Var) {
            return ((AnonymousClass1) create(ws2Var, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                ws2 ws2Var = (ws2) this.L$0;
                DebugCoroutineInfoImpl debugCoroutineInfoImpl = DebugCoroutineInfoImpl.this;
                a80 callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                Object objYieldFrames = debugCoroutineInfoImpl.yieldFrames(ws2Var, callerFrame, this);
                z70 z70Var = z70.e;
                if (objYieldFrames == z70Var) {
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

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", l = {169}, m = "yieldFrames")
    public static final class C01341 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01341(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugCoroutineInfoImpl.this.yieldFrames(null, null, this);
        }
    }

    public DebugCoroutineInfoImpl(y70 y70Var, StackTraceFrame stackTraceFrame, long j) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j;
        this._context = new WeakReference<>(y70Var);
    }

    private final List<StackTraceElement> creationStackTrace() {
        StackTraceFrame stackTraceFrame = this.creationStackBottom;
        if (stackTraceFrame != null) {
            vs2 vs2VarV = dh0.v(new AnonymousClass1(stackTraceFrame, null));
            if (vs2VarV.hasNext()) {
                Object next = vs2VarV.next();
                if (!vs2VarV.hasNext()) {
                    return am1.F(next);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vs2VarV.hasNext()) {
                    arrayList.add(vs2VarV.next());
                }
                return arrayList;
            }
        }
        return uj0.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0052 -> B:22:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object yieldFrames(defpackage.ws2 r6, defpackage.a80 r7, defpackage.q60 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01341
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r5 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r5
            java.lang.Object r6 = r0.L$1
            a80 r6 = (defpackage.a80) r6
            java.lang.Object r7 = r0.L$0
            ws2 r7 = (defpackage.ws2) r7
            defpackage.ee0.J(r8)
            goto L55
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L38:
            defpackage.ee0.J(r8)
        L3b:
            if (r7 != 0) goto L3e
            goto L5f
        L3e:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L52
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r5
            r0.label = r2
            r6.a(r8, r0)
            z70 r5 = defpackage.z70.e
            return r5
        L52:
            r4 = r7
            r7 = r6
            r6 = r4
        L55:
            a80 r6 = r6.getCallerFrame()
            if (r6 == 0) goto L5f
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3b
        L5f:
            mf3 r5 = defpackage.mf3.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.yieldFrames(ws2, a80, q60):java.lang.Object");
    }

    public final y70 getContext() {
        return this._context.get();
    }

    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final a80 getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<a80> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        a80 lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(a80 a80Var) {
        this._lastObservedFrame = a80Var != null ? new WeakReference<>(a80Var) : null;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }

    public final synchronized void updateState$kotlinx_coroutines_core(String str, q60 q60Var, boolean z) {
        try {
            if (o51.f(this._state, DebugCoroutineInfoImplKt.RUNNING) && o51.f(str, DebugCoroutineInfoImplKt.RUNNING) && z) {
                this.unmatchedResume++;
            } else if (this.unmatchedResume > 0 && o51.f(str, DebugCoroutineInfoImplKt.SUSPENDED)) {
                this.unmatchedResume--;
                return;
            }
            if (o51.f(this._state, str) && o51.f(str, DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
                return;
            }
            this._state = str;
            setLastObservedFrame$kotlinx_coroutines_core(q60Var instanceof a80 ? (a80) q60Var : null);
            this.lastObservedThread = o51.f(str, DebugCoroutineInfoImplKt.RUNNING) ? Thread.currentThread() : null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
