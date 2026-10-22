package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.i52;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.s90;
import defpackage.vd0;
import defpackage.y70;
import defpackage.z70;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {434}, m = "any")
    public static final class AnonymousClass1<E> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {41}, m = "consumeEach")
    public static final class C00991<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00991(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "count")
    public static final class C01001<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01001(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C01011 extends k33 implements pu0 {
        /* synthetic */ Object L$0;
        int label;

        public C01011(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01011 c01011 = new C01011(q60Var);
            c01011.L$0 = obj;
            return c01011;
        }

        @Override // defpackage.pu0
        public final Object invoke(Object obj, q60 q60Var) {
            return ((C01011) create(obj, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return this.L$0;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", l = {417, 418, 420}, m = "invokeSuspend")
    public static final class C01021 extends k33 implements pu0 {
        final /* synthetic */ pu0 $selector;
        final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01021(ReceiveChannel<? extends E> receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_distinctBy = receiveChannel;
            this.$selector = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01021 c01021 = new C01021(this.$this_distinctBy, this.$selector, q60Var);
            c01021.L$0 = obj;
            return c01021;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super E> producerScope, q60 q60Var) {
            return ((C01021) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0075 A[PHI: r0 r6 r7 r12
          0x0075: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v6 kotlinx.coroutines.channels.ChannelIterator), (r0v11 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0072, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r6v6 java.util.HashSet) = (r6v8 java.util.HashSet), (r6v12 java.util.HashSet) binds: [B:14:0x0072, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r7v3 kotlinx.coroutines.channels.ProducerScope) = (r7v5 kotlinx.coroutines.channels.ProducerScope), (r7v10 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0072, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r12v4 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0072, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0094  */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[PHI: r0 r7 r8
          0x00b6: PHI (r0v7 kotlinx.coroutines.channels.ChannelIterator) = (r0v3 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:23:0x009d, B:28:0x00b2] A[DONT_GENERATE, DONT_INLINE]
          0x00b6: PHI (r7v6 java.util.HashSet) = (r7v2 java.util.HashSet), (r7v8 java.util.HashSet) binds: [B:23:0x009d, B:28:0x00b2] A[DONT_GENERATE, DONT_INLINE]
          0x00b6: PHI (r8v4 kotlinx.coroutines.channels.ProducerScope) = (r8v0 kotlinx.coroutines.channels.ProducerScope), (r8v5 kotlinx.coroutines.channels.ProducerScope) binds: [B:23:0x009d, B:28:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009d -> B:29:0x00b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b0 -> B:28:0x00b2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L4e
                if (r0 == r4) goto L3e
                if (r0 == r3) goto L29
                if (r0 != r2) goto L23
                java.lang.Object r0 = r11.L$3
                java.lang.Object r6 = r11.L$2
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r11.L$1
                java.util.HashSet r7 = (java.util.HashSet) r7
                java.lang.Object r8 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                defpackage.ee0.J(r12)
                goto Lb2
            L23:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r11)
                return r1
            L29:
                java.lang.Object r0 = r11.L$3
                java.lang.Object r6 = r11.L$2
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r11.L$1
                java.util.HashSet r7 = (java.util.HashSet) r7
                java.lang.Object r8 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                defpackage.ee0.J(r12)
                r10 = r6
                r6 = r0
                r0 = r10
                goto L99
            L3e:
                java.lang.Object r0 = r11.L$2
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r11.L$1
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r12)
                goto L75
            L4e:
                defpackage.ee0.J(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                kotlinx.coroutines.channels.ReceiveChannel<E> r6 = r11.$this_distinctBy
                kotlinx.coroutines.channels.ChannelIterator r6 = r6.iterator()
                r7 = r6
                r6 = r0
                r0 = r7
                r7 = r12
            L64:
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r0
                r11.L$3 = r1
                r11.label = r4
                java.lang.Object r12 = r0.hasNext(r11)
                if (r12 != r5) goto L75
                goto Laf
            L75:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb9
                java.lang.Object r12 = r0.next()
                pu0 r8 = r11.$selector
                r11.L$0 = r7
                r11.L$1 = r6
                r11.L$2 = r0
                r11.L$3 = r12
                r11.label = r3
                java.lang.Object r8 = r8.invoke(r12, r11)
                if (r8 != r5) goto L94
                goto Laf
            L94:
                r10 = r6
                r6 = r12
                r12 = r8
                r8 = r7
                r7 = r10
            L99:
                boolean r9 = r7.contains(r12)
                if (r9 != 0) goto Lb6
                r11.L$0 = r8
                r11.L$1 = r7
                r11.L$2 = r0
                r11.L$3 = r12
                r11.label = r2
                java.lang.Object r6 = r8.send(r6, r11)
                if (r6 != r5) goto Lb0
            Laf:
                return r5
            Lb0:
                r6 = r0
                r0 = r12
            Lb2:
                r7.add(r0)
                r0 = r6
            Lb6:
                r6 = r7
                r7 = r8
                goto L64
            Lb9:
                mf3 r11 = defpackage.mf3.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", l = {194, 199, 200}, m = "invokeSuspend")
    public static final class C01031 extends k33 implements pu0 {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01031(int i, ReceiveChannel receiveChannel, q60 q60Var) {
            super(2, q60Var);
            this.$n = i;
            this.$this_drop = receiveChannel;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01031 c01031 = new C01031(this.$n, this.$this_drop, q60Var);
            c01031.L$0 = obj;
            return c01031;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01031) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0088  */
        /* JADX WARN: Code duplicated, block: B:35:0x0093  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r9 == r5) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        
            if (r1.send(r9, r8) == r5) goto L37;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:23:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:8:0x001b). Please report as a decompilation issue!!! */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L3d
                if (r0 == r4) goto L2f
                if (r0 == r3) goto L23
                if (r0 != r2) goto L1d
                java.lang.Object r0 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                defpackage.ee0.J(r9)
            L1b:
                r9 = r1
                goto L7b
            L1d:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r8)
                return r1
            L23:
                java.lang.Object r0 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                defpackage.ee0.J(r9)
                goto L8b
            L2f:
                int r0 = r8.I$0
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                defpackage.ee0.J(r9)
                goto L65
            L3d:
                defpackage.ee0.J(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r0 = r8.$n
                if (r0 < 0) goto L4a
                r6 = r4
                goto L4b
            L4a:
                r6 = 0
            L4b:
                if (r6 == 0) goto La7
                if (r0 <= 0) goto L75
                kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r6 = r9
            L56:
                r8.L$0 = r6
                r8.L$1 = r1
                r8.I$0 = r0
                r8.label = r4
                java.lang.Object r9 = r1.hasNext(r8)
                if (r9 != r5) goto L65
                goto La3
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L74
                r1.next()
                int r0 = r0 + (-1)
                if (r0 != 0) goto L56
            L74:
                r9 = r6
            L75:
                kotlinx.coroutines.channels.ReceiveChannel r0 = r8.$this_drop
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            L7b:
                r8.L$0 = r9
                r8.L$1 = r0
                r8.label = r3
                java.lang.Object r1 = r0.hasNext(r8)
                if (r1 != r5) goto L88
                goto La3
            L88:
                r7 = r1
                r1 = r9
                r9 = r7
            L8b:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La4
                java.lang.Object r9 = r0.next()
                r8.L$0 = r1
                r8.L$1 = r0
                r8.label = r2
                java.lang.Object r9 = r1.send(r9, r8)
                if (r9 != r5) goto L1b
            La3:
                return r5
            La4:
                mf3 r8 = defpackage.mf3.a
                return r8
            La7:
                java.lang.String r8 = "Requested element count "
                java.lang.String r9 = " is less than zero."
                java.lang.String r8 = defpackage.p91.m(r0, r8, r9)
                defpackage.fo.f(r8)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01031.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", l = {211, 212, 213, 217, 218}, m = "invokeSuspend")
    public static final class C01041 extends k33 implements pu0 {
        final /* synthetic */ pu0 $predicate;
        final /* synthetic */ ReceiveChannel $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01041(ReceiveChannel receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01041 c01041 = new C01041(this.$this_dropWhile, this.$predicate, q60Var);
            c01041.L$0 = obj;
            return c01041;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01041) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005d A[PHI: r0 r8 r12
          0x005d: PHI (r0v3 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v15 kotlinx.coroutines.channels.ChannelIterator) binds: [B:21:0x007b, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005d: PHI (r8v1 kotlinx.coroutines.channels.ProducerScope) = (r8v4 kotlinx.coroutines.channels.ProducerScope), (r8v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:21:0x007b, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005d: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:21:0x007b, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x009c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:43:0x00db  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009c -> B:16:0x0050). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e9 -> B:10:0x0021). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01041.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {68}, m = "elementAt")
    public static final class C01051<E> extends r60 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01051(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {83}, m = "elementAtOrNull")
    public static final class C01061<E> extends r60 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01061(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", l = {228, 229, 229}, m = "invokeSuspend")
    public static final class C01071 extends k33 implements pu0 {
        final /* synthetic */ pu0 $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01071(ReceiveChannel<? extends E> receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_filter = receiveChannel;
            this.$predicate = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01071 c01071 = new C01071(this.$this_filter, this.$predicate, q60Var);
            c01071.L$0 = obj;
            return c01071;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super E> producerScope, q60 q60Var) {
            return ((C01071) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005c A[PHI: r0 r6 r10
          0x005c: PHI (r0v4 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v7 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0059, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005c: PHI (r6v4 kotlinx.coroutines.channels.ProducerScope) = (r6v6 kotlinx.coroutines.channels.ProducerScope), (r6v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0059, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005c: PHI (r10v7 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0059, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0064  */
        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        /* JADX WARN: Code duplicated, block: B:24:0x0085  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L3f
                if (r0 == r4) goto L33
                if (r0 == r3) goto L22
                if (r0 != r2) goto L1c
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                defpackage.ee0.J(r10)
                goto L4d
            L1c:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r9)
                return r1
            L22:
                java.lang.Object r0 = r9.L$2
                java.lang.Object r6 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r10)
                r8 = r6
                r6 = r0
                r0 = r8
                goto L7d
            L33:
                java.lang.Object r0 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                defpackage.ee0.J(r10)
                goto L5c
            L3f:
                defpackage.ee0.J(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r9.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = r10
            L4d:
                r9.L$0 = r6
                r9.L$1 = r0
                r9.L$2 = r1
                r9.label = r4
                java.lang.Object r10 = r0.hasNext(r9)
                if (r10 != r5) goto L5c
                goto L93
            L5c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L96
                java.lang.Object r10 = r0.next()
                pu0 r7 = r9.$predicate
                r9.L$0 = r6
                r9.L$1 = r0
                r9.L$2 = r10
                r9.label = r3
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r5) goto L79
                goto L93
            L79:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L7d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L94
                r9.L$0 = r7
                r9.L$1 = r0
                r9.L$2 = r1
                r9.label = r2
                java.lang.Object r10 = r7.send(r6, r9)
                if (r10 != r5) goto L94
            L93:
                return r5
            L94:
                r6 = r7
                goto L4d
            L96:
                mf3 r9 = defpackage.mf3.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01071.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
    public static final class C01081 extends k33 implements pu0 {
        final /* synthetic */ qu0 $predicate;
        final /* synthetic */ ReceiveChannel $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01081(ReceiveChannel receiveChannel, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01081 c01081 = new C01081(this.$this_filterIndexed, this.$predicate, q60Var);
            c01081.L$0 = obj;
            return c01081;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01081) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0068 A[PHI: r0 r6 r7 r13
          0x0068: PHI (r0v5 int) = (r0v8 int), (r0v9 int) binds: [B:14:0x0065, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r6v3 kotlinx.coroutines.channels.ChannelIterator) = (r6v4 kotlinx.coroutines.channels.ChannelIterator), (r6v6 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0065, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r7v5 kotlinx.coroutines.channels.ProducerScope) = (r7v7 kotlinx.coroutines.channels.ProducerScope), (r7v9 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0065, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r13v7 java.lang.Object) = (r13v12 java.lang.Object), (r13v0 java.lang.Object) binds: [B:14:0x0065, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0070  */
        /* JADX WARN: Code duplicated, block: B:21:0x008e  */
        /* JADX WARN: Code duplicated, block: B:24:0x009a  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L45
                if (r0 == r4) goto L37
                if (r0 == r3) goto L24
                if (r0 != r2) goto L1e
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r13)
                goto L57
            L1e:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r12)
                return r1
            L24:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$2
                java.lang.Object r7 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                defpackage.ee0.J(r13)
                r11 = r7
                r7 = r6
                r6 = r11
                goto L92
            L37:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r13)
                goto L68
            L45:
                defpackage.ee0.J(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlinx.coroutines.channels.ReceiveChannel r0 = r12.$this_filterIndexed
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = 0
                r7 = r6
                r6 = r0
                r0 = r7
                r7 = r13
            L57:
                r12.L$0 = r7
                r12.L$1 = r6
                r12.L$2 = r1
                r12.I$0 = r0
                r12.label = r4
                java.lang.Object r13 = r6.hasNext(r12)
                if (r13 != r5) goto L68
                goto Laa
            L68:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lad
                java.lang.Object r13 = r6.next()
                qu0 r8 = r12.$predicate
                int r9 = r0 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r0)
                r12.L$0 = r7
                r12.L$1 = r6
                r12.L$2 = r13
                r12.I$0 = r9
                r12.label = r3
                java.lang.Object r0 = r8.invoke(r10, r13, r12)
                if (r0 != r5) goto L8e
                goto Laa
            L8e:
                r8 = r7
                r7 = r13
                r13 = r0
                r0 = r9
            L92:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lab
                r12.L$0 = r8
                r12.L$1 = r6
                r12.L$2 = r1
                r12.I$0 = r0
                r12.label = r2
                java.lang.Object r13 = r8.send(r7, r12)
                if (r13 != r5) goto Lab
            Laa:
                return r5
            Lab:
                r7 = r8
                goto L57
            Lad:
                mf3 r12 = defpackage.mf3.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01081.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", l = {252}, m = "invokeSuspend")
    public static final class C01091 extends k33 implements pu0 {
        final /* synthetic */ pu0 $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01091(pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$predicate = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01091 c01091 = new C01091(this.$predicate, q60Var);
            c01091.L$0 = obj;
            return c01091;
        }

        @Override // defpackage.pu0
        public final Object invoke(Object obj, q60 q60Var) {
            return ((C01091) create(obj, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Object obj2 = this.L$0;
                pu0 pu0Var = this.$predicate;
                this.label = 1;
                obj = pu0Var.invoke(obj2, this);
                z70 z70Var = z70.e;
                if (obj == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C01101 extends k33 implements pu0 {
        /* synthetic */ Object L$0;
        int label;

        public C01101(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01101 c01101 = new C01101(q60Var);
            c01101.L$0 = obj;
            return c01101;
        }

        @Override // defpackage.pu0
        public final Object invoke(E e, q60 q60Var) {
            return ((C01101) create(e, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return Boolean.valueOf(this.L$0 != null);
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "filterNotNullTo")
    public static final class C01111<E, C extends Collection<? super E>> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01111(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 272}, m = "filterNotNullTo")
    public static final class AnonymousClass3<E, C extends SendChannel<? super E>> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.filterNotNullTo((ReceiveChannel) null, (SendChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {95}, m = "first")
    public static final class C01121<E> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01121(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {105}, m = "firstOrNull")
    public static final class C01131<E> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01131(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend")
    public static final class C01141 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel $this_flatMap;
        final /* synthetic */ pu0 $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01141(ReceiveChannel receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_flatMap = receiveChannel;
            this.$transform = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01141 c01141 = new C01141(this.$this_flatMap, this.$transform, q60Var);
            c01141.L$0 = obj;
            return c01141;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01141) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0048 A[PHI: r0 r5
          0x0048: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = 
          (r0v2 kotlinx.coroutines.channels.ChannelIterator)
          (r0v3 kotlinx.coroutines.channels.ChannelIterator)
          (r0v11 kotlinx.coroutines.channels.ChannelIterator)
         binds: [B:12:0x003a, B:22:0x007c, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r5v3 kotlinx.coroutines.channels.ProducerScope) = 
          (r5v0 kotlinx.coroutines.channels.ProducerScope)
          (r5v1 kotlinx.coroutines.channels.ProducerScope)
          (r5v9 kotlinx.coroutines.channels.ProducerScope)
         binds: [B:12:0x003a, B:22:0x007c, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0055 A[PHI: r0 r5 r8
          0x0055: PHI (r0v4 kotlinx.coroutines.channels.ChannelIterator) = (r0v5 kotlinx.coroutines.channels.ChannelIterator), (r0v7 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r5v2 kotlinx.coroutines.channels.ProducerScope) = (r5v3 kotlinx.coroutines.channels.ProducerScope), (r5v5 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r8v6 java.lang.Object) = (r8v11 java.lang.Object), (r8v0 java.lang.Object) binds: [B:14:0x0052, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0070 A[PHI: r0 r5 r8
          0x0070: PHI (r0v3 kotlinx.coroutines.channels.ChannelIterator) = (r0v4 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
          0x0070: PHI (r5v1 kotlinx.coroutines.channels.ProducerScope) = (r5v2 kotlinx.coroutines.channels.ProducerScope), (r5v7 kotlinx.coroutines.channels.ProducerScope) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
          0x0070: PHI (r8v3 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:19:0x006d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:13:0x0048). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 3
                r2 = 2
                r3 = 1
                z70 r4 = defpackage.z70.e
                if (r0 == 0) goto L3a
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L22
                if (r0 != r1) goto L1b
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                defpackage.ee0.J(r8)
                goto L48
            L1b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r7)
                r7 = 0
                return r7
            L22:
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                defpackage.ee0.J(r8)
                goto L70
            L2e:
                java.lang.Object r0 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                defpackage.ee0.J(r8)
                goto L55
            L3a:
                defpackage.ee0.J(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlinx.coroutines.channels.ReceiveChannel r0 = r7.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r5 = r8
            L48:
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r3
                java.lang.Object r8 = r0.hasNext(r7)
                if (r8 != r4) goto L55
                goto L7e
            L55:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L7f
                java.lang.Object r8 = r0.next()
                pu0 r6 = r7.$transform
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r2
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r4) goto L70
                goto L7e
            L70:
                kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r1
                java.lang.Object r8 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r8, r5, r7)
                if (r8 != r4) goto L48
            L7e:
                return r4
            L7f:
                mf3 r7 = defpackage.mf3.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01141.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "indexOf")
    public static final class C01151<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01151(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {WorkQueueKt.MASK, 130}, m = "last")
    public static final class C01161<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01161(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
    public static final class C01171<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C01171(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {153, 156}, m = "lastOrNull")
    public static final class C01181<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01181(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", l = {514, 363, 363}, m = "invokeSuspend")
    public static final class C01191 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel<E> $this_map;
        final /* synthetic */ pu0 $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01191(ReceiveChannel<? extends E> receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_map = receiveChannel;
            this.$transform = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01191 c01191 = new C01191(this.$this_map, this.$transform, q60Var);
            c01191.L$0 = obj;
            return c01191;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super R> producerScope, q60 q60Var) {
            return ((C01191) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0081  */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:24:0x0071, B:28:0x0085, B:30:0x008d, B:20:0x005b, B:23:0x006a), top: B:44:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bc -> B:24:0x0071). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend")
    public static final class C01201 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ qu0 $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01201(ReceiveChannel<? extends E> receiveChannel, qu0 qu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = qu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01201 c01201 = new C01201(this.$this_mapIndexed, this.$transform, q60Var);
            c01201.L$0 = obj;
            return c01201;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super R> producerScope, q60 q60Var) {
            return ((C01201) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0065  */
        /* JADX WARN: Code duplicated, block: B:19:0x0070  */
        /* JADX WARN: Code duplicated, block: B:22:0x008e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a3 -> B:13:0x0056). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L45
                if (r0 == r4) goto L37
                if (r0 == r3) goto L25
                if (r0 != r2) goto L1f
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r13)
                r13 = r7
                goto L56
            L1f:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r12)
                return r1
            L25:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$2
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                java.lang.Object r7 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                java.lang.Object r8 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                defpackage.ee0.J(r13)
                goto L92
            L37:
                int r0 = r12.I$0
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r13)
                goto L68
            L45:
                defpackage.ee0.J(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r12.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r6 = 0
                r11 = r6
                r6 = r0
                r0 = r11
            L56:
                r12.L$0 = r13
                r12.L$1 = r6
                r12.I$0 = r0
                r12.label = r4
                java.lang.Object r7 = r6.hasNext(r12)
                if (r7 != r5) goto L65
                goto La2
            L65:
                r11 = r7
                r7 = r13
                r13 = r11
            L68:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La6
                java.lang.Object r13 = r6.next()
                qu0 r8 = r12.$transform
                int r9 = r0 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r0)
                r12.L$0 = r7
                r12.L$1 = r6
                r12.L$2 = r7
                r12.I$0 = r9
                r12.label = r3
                java.lang.Object r13 = r8.invoke(r10, r13, r12)
                if (r13 != r5) goto L8e
                goto La2
            L8e:
                r8 = r7
                r0 = r9
                r7 = r6
                r6 = r8
            L92:
                r12.L$0 = r8
                r12.L$1 = r7
                r12.L$2 = r1
                r12.I$0 = r0
                r12.label = r2
                java.lang.Object r13 = r6.send(r13, r12)
                if (r13 != r5) goto La3
            La2:
                return r5
            La3:
                r6 = r7
                r13 = r8
                goto L56
            La6:
                mf3 r12 = defpackage.mf3.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {450, 452}, m = "maxWith")
    public static final class C01211<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01211(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {464, 466}, m = "minWith")
    public static final class C01221<E> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01221(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {477}, m = "none")
    public static final class C01231<E> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01231(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
    public static final class C01241 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01241(ReceiveChannel receiveChannel, q60 q60Var) {
            super(2, q60Var);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01241 c01241 = new C01241(this.$this_requireNoNulls, q60Var);
            c01241.L$0 = obj;
            return c01241;
        }

        @Override // defpackage.pu0
        public final Object invoke(Object obj, q60 q60Var) {
            return ((C01241) create(obj, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {166, 169}, m = "single")
    public static final class C01251<E> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01251(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {179, 182}, m = "singleOrNull")
    public static final class C01261<E> extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01261(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend")
    public static final class C01271 extends k33 implements pu0 {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01271(int i, ReceiveChannel receiveChannel, q60 q60Var) {
            super(2, q60Var);
            this.$n = i;
            this.$this_take = receiveChannel;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01271 c01271 = new C01271(this.$n, this.$this_take, q60Var);
            c01271.L$0 = obj;
            return c01271;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01271) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0065  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        
            if (r6.send(r9, r8) == r5) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        
            if (r0 == 0) goto L30;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:7:0x001c). Please report as a decompilation issue!!! */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 2
                mf3 r3 = defpackage.mf3.a
                r4 = 1
                z70 r5 = defpackage.z70.e
                if (r0 == 0) goto L32
                if (r0 == r4) goto L24
                if (r0 != r2) goto L1e
                int r0 = r8.I$0
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                defpackage.ee0.J(r9)
            L1c:
                r9 = r6
                goto L78
            L1e:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r8)
                return r1
            L24:
                int r0 = r8.I$0
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                defpackage.ee0.J(r9)
                goto L5d
            L32:
                defpackage.ee0.J(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
                int r0 = r8.$n
                if (r0 != 0) goto L3e
                return r3
            L3e:
                if (r0 < 0) goto L42
                r6 = r4
                goto L43
            L42:
                r6 = 0
            L43:
                if (r6 == 0) goto L7d
                kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_take
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            L4b:
                r8.L$0 = r9
                r8.L$1 = r1
                r8.I$0 = r0
                r8.label = r4
                java.lang.Object r6 = r1.hasNext(r8)
                if (r6 != r5) goto L5a
                goto L77
            L5a:
                r7 = r6
                r6 = r9
                r9 = r7
            L5d:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7c
                java.lang.Object r9 = r1.next()
                r8.L$0 = r6
                r8.L$1 = r1
                r8.I$0 = r0
                r8.label = r2
                java.lang.Object r9 = r6.send(r9, r8)
                if (r9 != r5) goto L1c
            L77:
                return r5
            L78:
                int r0 = r0 + (-1)
                if (r0 != 0) goto L4b
            L7c:
                return r3
            L7d:
                java.lang.String r8 = "Requested element count "
                java.lang.String r9 = " is less than zero."
                java.lang.String r8 = defpackage.p91.m(r0, r8, r9)
                defpackage.fo.f(r8)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, 300, 301}, m = "invokeSuspend")
    public static final class C01281 extends k33 implements pu0 {
        final /* synthetic */ pu0 $predicate;
        final /* synthetic */ ReceiveChannel $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01281(ReceiveChannel receiveChannel, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01281 c01281 = new C01281(this.$this_takeWhile, this.$predicate, q60Var);
            c01281.L$0 = obj;
            return c01281;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01281) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0059 A[PHI: r0 r7 r11
          0x0059: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v7 kotlinx.coroutines.channels.ChannelIterator), (r0v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x0059: PHI (r7v3 kotlinx.coroutines.channels.ProducerScope) = (r7v5 kotlinx.coroutines.channels.ProducerScope), (r7v7 kotlinx.coroutines.channels.ProducerScope) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
          0x0059: PHI (r11v7 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:14:0x0056, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0061  */
        /* JADX WARN: Code duplicated, block: B:21:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0084  */
        /* JADX WARN: Code duplicated, block: B:28:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0093 -> B:13:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                mf3 r2 = defpackage.mf3.a
                r3 = 3
                r4 = 2
                r5 = 1
                z70 r6 = defpackage.z70.e
                if (r0 == 0) goto L3e
                if (r0 == r5) goto L32
                if (r0 == r4) goto L24
                if (r0 != r3) goto L1e
                java.lang.Object r0 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r11)
                goto L4c
            L1e:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r10)
                return r1
            L24:
                java.lang.Object r0 = r10.L$2
                java.lang.Object r7 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                java.lang.Object r8 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                defpackage.ee0.J(r11)
                goto L7b
            L32:
                java.lang.Object r0 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                defpackage.ee0.J(r11)
                goto L59
            L3e:
                defpackage.ee0.J(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.ReceiveChannel r0 = r10.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r7 = r11
            L4c:
                r10.L$0 = r7
                r10.L$1 = r0
                r10.label = r5
                java.lang.Object r11 = r0.hasNext(r10)
                if (r11 != r6) goto L59
                goto L92
            L59:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L96
                java.lang.Object r11 = r0.next()
                pu0 r8 = r10.$predicate
                r10.L$0 = r7
                r10.L$1 = r0
                r10.L$2 = r11
                r10.label = r4
                java.lang.Object r8 = r8.invoke(r11, r10)
                if (r8 != r6) goto L76
                goto L92
            L76:
                r9 = r0
                r0 = r11
                r11 = r8
                r8 = r7
                r7 = r9
            L7b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto L84
                return r2
            L84:
                r10.L$0 = r8
                r10.L$1 = r7
                r10.L$2 = r1
                r10.label = r3
                java.lang.Object r11 = r8.send(r0, r10)
                if (r11 != r6) goto L93
            L92:
                return r6
            L93:
                r0 = r7
                r7 = r8
                goto L4c
            L96:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 308}, m = "toChannel")
    public static final class C01291<E, C extends SendChannel<? super E>> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01291(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toCollection")
    public static final class C01301<E, C extends Collection<? super E>> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01301(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toMap")
    public static final class AnonymousClass2<K, V, M extends Map<? super K, ? super V>> extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", l = {400, 401}, m = "invokeSuspend")
    public static final class C01311 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01311(ReceiveChannel receiveChannel, q60 q60Var) {
            super(2, q60Var);
            this.$this_withIndex = receiveChannel;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01311 c01311 = new C01311(this.$this_withIndex, q60Var);
            c01311.L$0 = obj;
            return c01311;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope producerScope, q60 q60Var) {
            return ((C01311) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0050  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0078  */
        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:7:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 2
                r2 = 1
                z70 r3 = defpackage.z70.e
                if (r0 == 0) goto L33
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1e
                int r0 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                defpackage.ee0.J(r10)
                r10 = r4
                r4 = r0
                r0 = r10
            L1c:
                r10 = r5
                goto L41
            L1e:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r9)
                r9 = 0
                return r9
            L25:
                int r0 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                defpackage.ee0.J(r10)
                goto L56
            L33:
                defpackage.ee0.J(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                kotlinx.coroutines.channels.ReceiveChannel r0 = r9.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
                r4 = 0
            L41:
                r9.L$0 = r10
                r9.L$1 = r0
                r9.I$0 = r4
                r9.label = r2
                java.lang.Object r5 = r0.hasNext(r9)
                if (r5 != r3) goto L50
                goto L77
            L50:
                r8 = r5
                r5 = r10
                r10 = r8
                r8 = r4
                r4 = r0
                r0 = r8
            L56:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L7b
                java.lang.Object r10 = r4.next()
                l11 r6 = new l11
                int r7 = r0 + 1
                r6.<init>(r0, r10)
                r9.L$0 = r5
                r9.L$1 = r4
                r9.I$0 = r7
                r9.label = r1
                java.lang.Object r10 = r5.send(r6, r9)
                if (r10 != r3) goto L78
            L77:
                return r3
            L78:
                r0 = r4
                r4 = r7
                goto L1c
            L7b:
                mf3 r9 = defpackage.mf3.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", l = {514, 499, 501}, m = "invokeSuspend")
    public static final class C01322 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel<R> $other;
        final /* synthetic */ ReceiveChannel<E> $this_zip;
        final /* synthetic */ pu0 $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01322(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, pu0 pu0Var, q60 q60Var) {
            super(2, q60Var);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = pu0Var;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            C01322 c01322 = new C01322(this.$other, this.$this_zip, this.$transform, q60Var);
            c01322.L$0 = obj;
            return c01322;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super V> producerScope, q60 q60Var) {
            return ((C01322) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0098  */
        /* JADX WARN: Code duplicated, block: B:27:0x0099 A[Catch: all -> 0x0028, PHI: r0 r6 r7 r8 r9 r13
          0x0099: PHI (r0v5 kotlinx.coroutines.channels.ChannelIterator) = (r0v6 kotlinx.coroutines.channels.ChannelIterator), (r0v8 kotlinx.coroutines.channels.ChannelIterator) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r6v7 kotlinx.coroutines.channels.ReceiveChannel) = (r6v9 kotlinx.coroutines.channels.ReceiveChannel), (r6v11 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r7v5 pu0) = (r7v7 pu0), (r7v9 pu0) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r8v5 kotlinx.coroutines.channels.ChannelIterator) = (r8v7 kotlinx.coroutines.channels.ChannelIterator), (r8v9 kotlinx.coroutines.channels.ChannelIterator) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r9v5 kotlinx.coroutines.channels.ProducerScope) = (r9v7 kotlinx.coroutines.channels.ProducerScope), (r9v9 kotlinx.coroutines.channels.ProducerScope) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r13v10 java.lang.Object) = (r13v15 java.lang.Object), (r13v0 java.lang.Object) binds: [B:25:0x0096, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0024, B:24:0x0084, B:27:0x0099, B:29:0x00a1, B:20:0x0067, B:23:0x007c), top: B:47:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0024, B:24:0x0084, B:27:0x0099, B:29:0x00a1, B:20:0x0067, B:23:0x007c), top: B:47:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c9 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:33:0x00c1, B:35:0x00c9, B:15:0x0047), top: B:49:0x0047 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.oq
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01322.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object any(ReceiveChannel receiveChannel, q60 q60Var) {
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
        Object objHasNext = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ee0.J(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                anonymousClass1.L$0 = receiveChannel;
                anonymousClass1.label = 1;
                objHasNext = it.hasNext(anonymousClass1);
                z70 z70Var = z70.e;
                if (objHasNext == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannel = (ReceiveChannel) anonymousClass1.L$0;
                ee0.J(objHasNext);
            }
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return objHasNext;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    @cc0
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, lu0 lu0Var) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            return (R) lu0Var.invoke(receiveChannelOpenSubscription);
        } finally {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x0061, B:29:0x0069), top: B:41:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r6, defpackage.lu0 r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00991
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C00991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            lu0 r1 = (defpackage.lu0) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L36
            r5 = r0
            r0 = r7
            r7 = r1
        L34:
            r1 = r5
            goto L61
        L36:
            r6 = move-exception
            goto L83
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r2
        L3e:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.openSubscription()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
            r5 = r8
            r8 = r6
            r6 = r5
        L4c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7c
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L7c
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7c
            r0.label = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7c
            z70 r4 = defpackage.z70.e
            if (r1 != r4) goto L5d
            return r4
        L5d:
            r5 = r0
            r0 = r8
            r8 = r1
            goto L34
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L73
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L76
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L73
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L73
            r8 = r0
            r0 = r1
            goto L4c
        L73:
            r6 = move-exception
            r7 = r0
            goto L83
        L76:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r0, r2, r3, r2)
            mf3 r6 = defpackage.mf3.a
            return r6
        L7c:
            r6 = move-exception
            r7 = r8
            goto L83
        L7f:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L83:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r2, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, lu0, q60):java.lang.Object");
    }

    @cc0
    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, lu0 lu0Var, q60 q60Var) {
        ReceiveChannel<E> receiveChannelOpenSubscription = broadcastChannel.openSubscription();
        try {
            ChannelIterator<E> it = receiveChannelOpenSubscription.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                lu0Var.invoke(it.next());
            }
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            return mf3.a;
        } catch (Throwable th) {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) receiveChannelOpenSubscription, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }

    public static final lu0 consumes(ReceiveChannel<?> receiveChannel) {
        return new a(receiveChannel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 consumes$lambda$24$ChannelsKt__DeprecatedKt(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return mf3.a;
    }

    public static final lu0 consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new a(receiveChannelArr, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 consumesAll$lambda$2$ChannelsKt__DeprecatedKt(ReceiveChannel[] receiveChannelArr, Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                ChannelsKt.cancelConsumed(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    vd0.d(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return mf3.a;
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x002e, B:26:0x005d, B:28:0x0065), top: B:42:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005a -> B:26:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01001
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r4 = r0.L$0
            ue2 r4 = (defpackage.ue2) r4
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L32
            goto L5d
        L32:
            r7 = move-exception
            goto L80
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r3
        L3a:
            defpackage.ee0.J(r8)
            ue2 r8 = new ue2
            r8.<init>()
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L7d
            r4 = r8
            r8 = r7
            r7 = r1
        L49:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7a
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L7a
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L7a
            r0.label = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L7a
            z70 r5 = defpackage.z70.e
            if (r1 != r5) goto L5a
            return r5
        L5a:
            r6 = r1
            r1 = r8
            r8 = r6
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L32
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L6f
            r7.next()     // Catch: java.lang.Throwable -> L32
            int r8 = r4.e     // Catch: java.lang.Throwable -> L32
            int r8 = r8 + r2
            r4.e = r8     // Catch: java.lang.Throwable -> L32
            r8 = r1
            goto L49
        L6f:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r3)
            int r7 = r4.e
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L7a:
            r7 = move-exception
            r1 = r8
            goto L80
        L7d:
            r8 = move-exception
            r1 = r7
            r7 = r8
        L80:
            throw r7     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, q60):java.lang.Object");
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        return distinctBy$default(receiveChannel, null, new C01011(null), 1, null);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01021(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, y70Var, pu0Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i, y70 y70Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01031(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, y70 y70Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i, y70Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01041(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, y70Var, pu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:26:0x0061, B:28:0x0069, B:34:0x0079, B:35:0x0090), top: B:45:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:26:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, defpackage.q60 r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01051
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 46
            r3 = 1
            r4 = 0
            java.lang.String r5 = "ReceiveChannel doesn't contain element at index "
            if (r1 == 0) goto L3f
            if (r1 != r3) goto L39
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            defpackage.ee0.J(r11)     // Catch: java.lang.Throwable -> L36
            goto L61
        L36:
            r9 = move-exception
            goto Laa
        L39:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r9)
            return r4
        L3f:
            defpackage.ee0.J(r11)
            if (r10 < 0) goto L95
            kotlinx.coroutines.channels.ChannelIterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> L91
            r1 = 0
        L49:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L91
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L91
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L91
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L91
            r0.label = r3     // Catch: java.lang.Throwable -> L91
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L91
            z70 r7 = defpackage.z70.e
            if (r6 != r7) goto L5c
            return r7
        L5c:
            r8 = r6
            r6 = r9
            r9 = r1
            r1 = r11
            r11 = r8
        L61:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L36
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto L79
            java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L36
            int r7 = r9 + 1
            if (r10 != r9) goto L75
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r4)
            return r11
        L75:
            r11 = r1
            r9 = r6
            r1 = r7
            goto L49
        L79:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r11.<init>()     // Catch: java.lang.Throwable -> L36
            r11.append(r5)     // Catch: java.lang.Throwable -> L36
            r11.append(r10)     // Catch: java.lang.Throwable -> L36
            r11.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L36
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        L91:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Laa
        L95:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L91
            r0.append(r10)     // Catch: java.lang.Throwable -> L91
            r0.append(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L91
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L91
            throw r11     // Catch: java.lang.Throwable -> L91
        Laa:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lab:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #2 {all -> 0x007c, blocks: (B:28:0x0064, B:30:0x006c, B:23:0x004d, B:22:0x0048), top: B:48:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0060 -> B:28:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, int r8, defpackage.q60 r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01061
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L39
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L37
            r6 = r1
            r1 = r7
            r7 = r4
            r4 = r0
            r0 = r6
            goto L64
        L37:
            r7 = move-exception
            goto L84
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r3
        L3f:
            defpackage.ee0.J(r9)
            if (r8 >= 0) goto L48
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L48:
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L7c
            r1 = 0
        L4d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L7c
            r0.I$0 = r8     // Catch: java.lang.Throwable -> L7c
            r0.I$1 = r1     // Catch: java.lang.Throwable -> L7c
            r0.label = r2     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L7c
            z70 r5 = defpackage.z70.e
            if (r4 != r5) goto L60
            return r5
        L60:
            r6 = r0
            r0 = r9
            r9 = r4
            r4 = r6
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7c
            if (r9 == 0) goto L80
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L7c
            int r5 = r1 + 1
            if (r8 != r1) goto L78
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r9
        L78:
            r9 = r0
            r0 = r4
            r1 = r5
            goto L4d
        L7c:
            r8 = move-exception
            r4 = r7
            r7 = r8
            goto L84
        L80:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r3
        L84:
            throw r7     // Catch: java.lang.Throwable -> L85
        L85:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, q60):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01071(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, y70Var, pu0Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, y70 y70Var, qu0 qu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01081(receiveChannel, qu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, y70 y70Var, qu0 qu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, y70Var, qu0Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt.filter(receiveChannel, y70Var, new C01091(pu0Var, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, y70Var, pu0Var);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new C01101(null), 1, null);
        receiveChannelFilter$default.getClass();
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0033, B:28:0x006a, B:30:0x0072, B:32:0x0078, B:20:0x004b), top: B:46:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0033, B:28:0x006a, B:30:0x0072, B:32:0x0078, B:20:0x004b), top: B:46:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0076 -> B:35:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:35:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r7, kotlinx.coroutines.channels.SendChannel r8, defpackage.q60 r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L37
            goto L87
        L37:
            r7 = move-exception
            goto L93
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r4
        L3f:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L37
            goto L6a
        L4f:
            defpackage.ee0.J(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L8f
        L56:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L8f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L8f
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L8f
            r0.label = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L8f
            if (r1 != r5) goto L65
            goto L86
        L65:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r1
            r1 = r6
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L87
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L37
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L37
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L37
            r0.label = r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r1.send(r9, r0)     // Catch: java.lang.Throwable -> L37
            if (r9 != r5) goto L87
        L86:
            return r5
        L87:
            r9 = r7
            r7 = r8
            r8 = r1
            goto L56
        L8b:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r1
        L8f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L93:
            throw r7     // Catch: java.lang.Throwable -> L94
        L94:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:12:0x002a, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:30:0x0067), top: B:41:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #2 {all -> 0x002e, blocks: (B:12:0x002a, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:30:0x0067), top: B:41:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object first(ReceiveChannel receiveChannel, q60 q60Var) {
        C01121 c01121;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (q60Var instanceof C01121) {
            c01121 = (C01121) q60Var;
            int i = c01121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01121.label = i - Integer.MIN_VALUE;
            } else {
                c01121 = new C01121(q60Var);
            }
        } else {
            c01121 = new C01121(q60Var);
        }
        Object obj = c01121.result;
        int i2 = c01121.label;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channelIterator = (ChannelIterator) c01121.L$1;
            receiveChannel2 = (ReceiveChannel) c01121.L$0;
            try {
                ee0.J(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = channelIterator.next();
                ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th3;
                }
            }
        }
        ee0.J(obj);
        try {
            ChannelIterator it = receiveChannel.iterator();
            c01121.L$0 = receiveChannel;
            c01121.L$1 = it;
            c01121.label = 1;
            Object objHasNext = it.hasNext(c01121);
            z70 z70Var = z70.e;
            if (objHasNext == z70Var) {
                return z70Var;
            }
            receiveChannel2 = receiveChannel;
            channelIterator = it;
            obj = objHasNext;
            if (((Boolean) obj).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            Object next2 = channelIterator.next();
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return next2;
        } catch (Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object firstOrNull(ReceiveChannel receiveChannel, q60 q60Var) {
        C01131 c01131;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        if (q60Var instanceof C01131) {
            c01131 = (C01131) q60Var;
            int i = c01131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01131.label = i - Integer.MIN_VALUE;
            } else {
                c01131 = new C01131(q60Var);
            }
        } else {
            c01131 = new C01131(q60Var);
        }
        Object obj = c01131.result;
        int i2 = c01131.label;
        if (i2 == 0) {
            ee0.J(obj);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c01131.L$0 = receiveChannel;
                c01131.L$1 = it;
                c01131.label = 1;
                Object objHasNext = it.hasNext(c01131);
                z70 z70Var = z70.e;
                if (objHasNext == z70Var) {
                    return z70Var;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channelIterator = (ChannelIterator) c01131.L$1;
            receiveChannel2 = (ReceiveChannel) c01131.L$0;
            try {
                ee0.J(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return next;
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01141(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, y70Var, pu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:26:0x0063, B:28:0x006b, B:30:0x0075, B:33:0x0080, B:21:0x004d), top: B:45:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:26:0x0063, B:28:0x006b, B:30:0x0075, B:33:0x0080, B:21:0x004d), top: B:45:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:26:0x0063, B:28:0x006b, B:30:0x0075, B:33:0x0080, B:21:0x004d), top: B:45:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:26:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, defpackage.q60 r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01151
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L36
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$1
            ue2 r1 = (defpackage.ue2) r1
            java.lang.Object r4 = r0.L$0
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L34
            goto L63
        L34:
            r7 = move-exception
            goto L95
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r3
        L3c:
            defpackage.ee0.J(r9)
            ue2 r9 = new ue2
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L91
            r6 = r8
            r8 = r7
            r7 = r1
            r1 = r9
            r9 = r6
        L4d:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L34
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L34
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L34
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L34
            r0.label = r2     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L34
            z70 r5 = defpackage.z70.e
            if (r4 != r5) goto L60
            return r5
        L60:
            r6 = r4
            r4 = r9
            r9 = r6
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L34
            boolean r9 = defpackage.o51.f(r4, r9)     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L80
            int r7 = r1.e     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L34
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L34
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r3)
            return r9
        L80:
            int r9 = r1.e     // Catch: java.lang.Throwable -> L34
            int r9 = r9 + r2
            r1.e = r9     // Catch: java.lang.Throwable -> L34
            r9 = r4
            goto L4d
        L87:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r3)
            java.lang.Integer r7 = new java.lang.Integer
            r8 = -1
            r7.<init>(r8)
            return r7
        L91:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L95:
            throw r7     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:37:0x0088, B:39:0x0090), top: B:51:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:37:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01161
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            java.lang.Object r7 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L35
            goto L88
        L35:
            r7 = move-exception
            r1 = r3
            goto La6
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r4
        L3f:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L4b
            goto L66
        L4b:
            r7 = move-exception
            goto La6
        L4e:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9a
            r0.label = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r1 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L9a
            if (r1 != r5) goto L62
            goto L83
        L62:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r6 = r1
            r1 = r7
            r7 = r6
        L75:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L9a
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9a
            r0.label = r2     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r1.hasNext(r0)     // Catch: java.lang.Throwable -> L9a
            if (r3 != r5) goto L84
        L83:
            return r5
        L84:
            r6 = r3
            r3 = r7
            r7 = r8
            r8 = r6
        L88:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L96
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L35
            r7 = r3
            goto L75
        L96:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r7
        L9a:
            r8 = move-exception
            r1 = r7
            r7 = r8
            goto La6
        L9e:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = "ReceiveChannel is empty."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0034, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:31:0x0088, B:21:0x005a), top: B:41:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0034, B:26:0x0072, B:28:0x007a, B:30:0x0084, B:31:0x0088, B:21:0x005a), top: B:41:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006f -> B:26:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r8, java.lang.Object r9, defpackage.q60 r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01171
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L41
            if (r1 != r2) goto L3b
            java.lang.Object r8 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r1 = r0.L$2
            ue2 r1 = (defpackage.ue2) r1
            java.lang.Object r4 = r0.L$1
            ue2 r4 = (defpackage.ue2) r4
            java.lang.Object r5 = r0.L$0
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L38
            goto L72
        L38:
            r8 = move-exception
            goto L9e
        L3b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            return r3
        L41:
            defpackage.ee0.J(r10)
            ue2 r10 = new ue2
            r10.<init>()
            r1 = -1
            r10.e = r1
            ue2 r1 = new ue2
            r1.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r8.iterator()     // Catch: java.lang.Throwable -> L9a
            r7 = r9
            r9 = r8
            r8 = r4
            r4 = r10
            r10 = r7
        L5a:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L38
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L38
            r0.L$2 = r1     // Catch: java.lang.Throwable -> L38
            r0.L$3 = r9     // Catch: java.lang.Throwable -> L38
            r0.L$4 = r8     // Catch: java.lang.Throwable -> L38
            r0.label = r2     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L38
            z70 r6 = defpackage.z70.e
            if (r5 != r6) goto L6f
            return r6
        L6f:
            r7 = r5
            r5 = r10
            r10 = r7
        L72:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L38
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L38
            boolean r10 = defpackage.o51.f(r5, r10)     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L88
            int r10 = r1.e     // Catch: java.lang.Throwable -> L38
            r4.e = r10     // Catch: java.lang.Throwable -> L38
        L88:
            int r10 = r1.e     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + r2
            r1.e = r10     // Catch: java.lang.Throwable -> L38
            r10 = r5
            goto L5a
        L8f:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r3)
            int r8 = r4.e
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        L9a:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L9e:
            throw r8     // Catch: java.lang.Throwable -> L9f
        L9f:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:39:0x008b, B:41:0x0093), top: B:53:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:39:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01181
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            java.lang.Object r7 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            r1 = r3
            goto La0
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r4
        L3f:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto La0
        L4d:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r1 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L9d
            if (r1 != r5) goto L61
            goto L86
        L61:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r4)
            return r4
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r6 = r1
            r1 = r7
            r7 = r6
        L78:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L9d
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r3 = r1.hasNext(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 != r5) goto L87
        L86:
            return r5
        L87:
            r6 = r3
            r3 = r7
            r7 = r8
            r8 = r6
        L8b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L99
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L35
            r7 = r3
            goto L78
        L99:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r4)
            return r7
        L9d:
            r8 = move-exception
            r1 = r7
            r7 = r8
        La0:
            throw r7     // Catch: java.lang.Throwable -> La1
        La1:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r1, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, q60):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01191(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, y70Var, pu0Var);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, qu0 qu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01201(receiveChannel, qu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, y70 y70Var, qu0 qu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, y70Var, qu0Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, y70 y70Var, qu0 qu0Var) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, y70Var, qu0Var));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, y70 y70Var, qu0 qu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, y70Var, qu0Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, y70Var, pu0Var));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, y70Var, pu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:40:0x009f, B:42:0x00a7, B:36:0x008a, B:26:0x005e), top: B:54:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009b -> B:15:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, defpackage.q60 r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01211
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L5b
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L3e
            r7 = r0
            r0 = r8
            r8 = r1
        L3b:
            r1 = r7
            goto L9f
        L3e:
            r8 = move-exception
            r9 = r1
            goto Lbe
        L42:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            return r4
        L48:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r1 = r0.L$0
            java.util.Comparator r1 = (java.util.Comparator) r1
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L58
            goto L76
        L58:
            r8 = move-exception
            goto Lbe
        L5b:
            defpackage.ee0.J(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb5
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lb5
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb5
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Lb5
            r0.label = r3     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != r5) goto L71
            goto L9a
        L71:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r1
            r1 = r7
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L58
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r10 != 0) goto L82
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L82:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L58
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r1
        L8a:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Lb5
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb5
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Lb5
            r0.L$3 = r10     // Catch: java.lang.Throwable -> Lb5
            r0.label = r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != r5) goto L9b
        L9a:
            return r5
        L9b:
            r7 = r0
            r0 = r10
            r10 = r1
            goto L3b
        L9f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto Lba
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb5
            int r6 = r3.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb5
            if (r6 >= 0) goto Lb3
        Lb1:
            r0 = r1
            goto L8a
        Lb3:
            r10 = r0
            goto Lb1
        Lb5:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lbe
        Lba:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r0
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:40:0x009f, B:42:0x00a7, B:36:0x008a, B:26:0x005e), top: B:54:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009b -> B:15:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, defpackage.q60 r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01221
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L5b
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r3 = r0.L$0
            java.util.Comparator r3 = (java.util.Comparator) r3
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L3e
            r7 = r0
            r0 = r8
            r8 = r1
        L3b:
            r1 = r7
            goto L9f
        L3e:
            r8 = move-exception
            r9 = r1
            goto Lbe
        L42:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            return r4
        L48:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r1 = r0.L$0
            java.util.Comparator r1 = (java.util.Comparator) r1
            defpackage.ee0.J(r10)     // Catch: java.lang.Throwable -> L58
            goto L76
        L58:
            r8 = move-exception
            goto Lbe
        L5b:
            defpackage.ee0.J(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> Lb5
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lb5
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb5
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Lb5
            r0.label = r3     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != r5) goto L71
            goto L9a
        L71:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r1
            r1 = r7
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L58
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r10 != 0) goto L82
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r4)
            return r4
        L82:
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L58
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r1
        L8a:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Lb5
            r0.L$1 = r8     // Catch: java.lang.Throwable -> Lb5
            r0.L$2 = r9     // Catch: java.lang.Throwable -> Lb5
            r0.L$3 = r10     // Catch: java.lang.Throwable -> Lb5
            r0.label = r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r1 != r5) goto L9b
        L9a:
            return r5
        L9b:
            r7 = r0
            r0 = r10
            r10 = r1
            goto L3b
        L9f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto Lba
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb5
            int r6 = r3.compare(r0, r10)     // Catch: java.lang.Throwable -> Lb5
            if (r6 <= 0) goto Lb3
        Lb1:
            r0 = r1
            goto L8a
        Lb3:
            r10 = r0
            goto Lb1
        Lb5:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lbe
        Lba:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r0
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object none(ReceiveChannel receiveChannel, q60 q60Var) {
        C01231 c01231;
        if (q60Var instanceof C01231) {
            c01231 = (C01231) q60Var;
            int i = c01231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01231.label = i - Integer.MIN_VALUE;
            } else {
                c01231 = new C01231(q60Var);
            }
        } else {
            c01231 = new C01231(q60Var);
        }
        Object objHasNext = c01231.result;
        int i2 = c01231.label;
        try {
            if (i2 == 0) {
                ee0.J(objHasNext);
                ChannelIterator it = receiveChannel.iterator();
                c01231.L$0 = receiveChannel;
                c01231.label = 1;
                objHasNext = it.hasNext(c01231);
                z70 z70Var = z70.e;
                if (objHasNext == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannel = (ReceiveChannel) c01231.L$0;
                ee0.J(objHasNext);
            }
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) objHasNext).booleanValue());
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return boolValueOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        return map$default(receiveChannel, null, new C01241(receiveChannel, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0061, B:31:0x0069, B:41:0x0092, B:42:0x0099), top: B:51:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:35:0x007e, B:39:0x008a, B:40:0x0091), top: B:49:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #1 {all -> 0x0047, blocks: (B:20:0x0043, B:29:0x0061, B:31:0x0069, B:41:0x0092, B:42:0x0099), top: B:51:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object single(ReceiveChannel receiveChannel, q60 q60Var) {
        C01251 c01251;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        Object next;
        Object objHasNext;
        Object obj;
        ReceiveChannel receiveChannel3;
        if (q60Var instanceof C01251) {
            c01251 = (C01251) q60Var;
            int i = c01251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01251.label = i - Integer.MIN_VALUE;
            } else {
                c01251 = new C01251(q60Var);
            }
        } else {
            c01251 = new C01251(q60Var);
        }
        Object obj2 = c01251.result;
        int i2 = c01251.label;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c01251.L$0 = receiveChannel;
                c01251.L$1 = it;
                c01251.label = 1;
                Object objHasNext2 = it.hasNext(c01251);
                if (objHasNext2 != z70Var) {
                    receiveChannel2 = receiveChannel;
                    channelIterator = it;
                    obj2 = objHasNext2;
                    if (((Boolean) obj2).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    next = channelIterator.next();
                    c01251.L$0 = receiveChannel2;
                    c01251.L$1 = next;
                    c01251.label = 2;
                    objHasNext = channelIterator.hasNext(c01251);
                    if (objHasNext != z70Var) {
                        obj2 = objHasNext;
                        obj = next;
                        receiveChannel3 = receiveChannel2;
                        if (((Boolean) obj2).booleanValue()) {
                            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                        }
                        ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return obj;
                    }
                }
                return z70Var;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c01251.L$1;
            receiveChannel3 = (ReceiveChannel) c01251.L$0;
            try {
                ee0.J(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        channelIterator = (ChannelIterator) c01251.L$1;
        receiveChannel2 = (ReceiveChannel) c01251.L$0;
        try {
            ee0.J(obj2);
            if (((Boolean) obj2).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            next = channelIterator.next();
            c01251.L$0 = receiveChannel2;
            c01251.L$1 = next;
            c01251.label = 2;
            objHasNext = channelIterator.hasNext(c01251);
            if (objHasNext != z70Var) {
                obj2 = objHasNext;
                obj = next;
                receiveChannel3 = receiveChannel2;
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            }
            return z70Var;
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @cc0
    public static final Object singleOrNull(ReceiveChannel receiveChannel, q60 q60Var) {
        C01261 c01261;
        ReceiveChannel receiveChannel2;
        Throwable th;
        ChannelIterator channelIterator;
        Object obj;
        ReceiveChannel receiveChannel3;
        if (q60Var instanceof C01261) {
            c01261 = (C01261) q60Var;
            int i = c01261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01261.label = i - Integer.MIN_VALUE;
            } else {
                c01261 = new C01261(q60Var);
            }
        } else {
            c01261 = new C01261(q60Var);
        }
        Object obj2 = c01261.result;
        int i2 = c01261.label;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj2);
            try {
                ChannelIterator it = receiveChannel.iterator();
                c01261.L$0 = receiveChannel;
                c01261.L$1 = it;
                c01261.label = 1;
                Object objHasNext = it.hasNext(c01261);
                if (objHasNext != z70Var) {
                    receiveChannel2 = receiveChannel;
                    channelIterator = it;
                    obj2 = objHasNext;
                }
                return z70Var;
            } catch (Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c01261.L$1;
            receiveChannel3 = (ReceiveChannel) c01261.L$0;
            try {
                ee0.J(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    ChannelsKt.cancelConsumed(receiveChannel3, null);
                    return null;
                }
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        channelIterator = (ChannelIterator) c01261.L$1;
        receiveChannel2 = (ReceiveChannel) c01261.L$0;
        try {
            ee0.J(obj2);
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
        if (!((Boolean) obj2).booleanValue()) {
            ChannelsKt.cancelConsumed(receiveChannel2, null);
            return null;
        }
        Object next = channelIterator.next();
        c01261.L$0 = receiveChannel2;
        c01261.L$1 = next;
        c01261.label = 2;
        Object objHasNext2 = channelIterator.hasNext(c01261);
        if (objHasNext2 != z70Var) {
            obj2 = objHasNext2;
            obj = next;
            receiveChannel3 = receiveChannel2;
            if (((Boolean) obj2).booleanValue()) {
                ChannelsKt.cancelConsumed(receiveChannel3, null);
                return null;
            }
            ChannelsKt.cancelConsumed(receiveChannel3, null);
            return obj;
        }
        return z70Var;
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i, y70 y70Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01271(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, y70 y70Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i, y70Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01281(receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, y70Var, pu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0033, B:28:0x006d, B:30:0x0075, B:20:0x004e), top: B:43:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r1.send(r9, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r8v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:14:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, C r8, defpackage.q60 r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01291
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L52
            if (r1 == r3) goto L42
            if (r1 != r2) goto L3c
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L3a
        L36:
            r9 = r7
            r7 = r8
            r8 = r1
            goto L59
        L3a:
            r7 = move-exception
            goto L90
        L3c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r7)
            return r4
        L42:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            defpackage.ee0.J(r9)     // Catch: java.lang.Throwable -> L3a
            goto L6d
        L52:
            defpackage.ee0.J(r9)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L8c
        L59:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L8c
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L8c
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L8c
            r0.label = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L8c
            if (r1 != r5) goto L68
            goto L87
        L68:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r1
            r1 = r6
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L88
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3a
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L3a
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3a
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3a
            r0.label = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r9 = r1.send(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 != r5) goto L36
        L87:
            return r5
        L88:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r1
        L8c:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:26:0x0059, B:28:0x0061, B:21:0x0045), top: B:38:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01301
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            java.util.Collection r1 = (java.util.Collection) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L32
            goto L59
        L32:
            r6 = move-exception
            goto L72
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r3
        L3a:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L6e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L45:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L32
            r0.label = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L32
            z70 r4 = defpackage.z70.e
            if (r1 != r4) goto L56
            return r4
        L56:
            r5 = r1
            r1 = r8
            r8 = r5
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L32
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L32
            r1.add(r8)     // Catch: java.lang.Throwable -> L32
            r8 = r1
            goto L45
        L6a:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L6e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L72:
            throw r6     // Catch: java.lang.Throwable -> L73
        L73:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, q60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:26:0x0059, B:28:0x0061, B:21:0x0045), top: B:38:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends defpackage.i52> r6, M r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            java.util.Map r1 = (java.util.Map) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L32
            goto L59
        L32:
            r6 = move-exception
            goto L78
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r3
        L3a:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L74
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L45:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L32
            r0.label = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L32
            z70 r4 = defpackage.z70.e
            if (r1 != r4) goto L56
            return r4
        L56:
            r5 = r1
            r1 = r8
            r8 = r5
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L32
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L70
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L32
            i52 r8 = (defpackage.i52) r8     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r8.e     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r8.f     // Catch: java.lang.Throwable -> L32
            r1.put(r4, r8)     // Catch: java.lang.Throwable -> L32
            r8 = r1
            goto L45
        L70:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L74:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L78:
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, q60):java.lang.Object");
    }

    @cc0
    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, q60 q60Var) {
        return ChannelsKt.toCollection(receiveChannel, new ArrayList(), q60Var);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, q60 q60Var) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), q60Var);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, y70 y70Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumes(receiveChannel), new C01311(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, y70 y70Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, y70Var);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, y70 y70Var, pu0 pu0Var) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, y70Var, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new C01322(receiveChannel2, receiveChannel, pu0Var, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, y70 y70Var, pu0 pu0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            y70Var = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, y70Var, pu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i52 zip$lambda$23$ChannelsKt__DeprecatedKt(Object obj, Object obj2) {
        return new i52(obj, obj2);
    }

    @cc0
    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        return zip$default(receiveChannel, receiveChannel2, null, new b(), 2, null);
    }

    @cc0
    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, q60 q60Var) {
        return ChannelsKt.toMap(receiveChannel, new LinkedHashMap(), q60Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:21:0x0045), top: B:42:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:26:0x0059, B:28:0x0061, B:30:0x0067, B:21:0x0045), top: B:42:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @defpackage.cc0
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, java.util.Collection r7, defpackage.q60 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01111
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C01111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r1 = r0.L$0
            java.util.Collection r1 = (java.util.Collection) r1
            defpackage.ee0.J(r8)     // Catch: java.lang.Throwable -> L32
            goto L59
        L32:
            r6 = move-exception
            goto L74
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r3
        L3a:
            defpackage.ee0.J(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L70
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L45:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L32
            r0.label = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L32
            z70 r4 = defpackage.z70.e
            if (r1 != r4) goto L56
            return r4
        L56:
            r5 = r1
            r1 = r8
            r8 = r5
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L32
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L6a
            r1.add(r8)     // Catch: java.lang.Throwable -> L32
        L6a:
            r8 = r1
            goto L45
        L6c:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r3)
            return r1
        L70:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, q60):java.lang.Object");
    }
}
