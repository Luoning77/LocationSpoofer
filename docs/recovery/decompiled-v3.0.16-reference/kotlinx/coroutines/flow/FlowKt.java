package kotlinx.coroutines.flow;

import defpackage.au0;
import defpackage.cc0;
import defpackage.k41;
import defpackage.l11;
import defpackage.l81;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.su0;
import defpackage.tu0;
import defpackage.us2;
import defpackage.uu0;
import defpackage.wj1;
import defpackage.y70;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Object all(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__LogicKt.all(flow, pu0Var, q60Var);
    }

    public static final <T> Object any(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__LogicKt.any(flow, pu0Var, q60Var);
    }

    public static final <T> Flow<T> asFlow(au0 au0Var) {
        return FlowKt__BuildersKt.asFlow(au0Var);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    @cc0
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(pu0 pu0Var) {
        return FlowKt__BuildersKt.callbackFlow(pu0Var);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m64catch(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__ErrorsKt.m75catch(flow, qu0Var);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, q60 q60Var) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, q60Var);
    }

    public static final <T> Flow<T> channelFlow(pu0 pu0Var) {
        return FlowKt__BuildersKt.channelFlow(pu0Var);
    }

    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i) {
        return FlowKt__TransformKt.chunked(flow, i);
    }

    public static final Object collect(Flow<?> flow, q60 q60Var) {
        return FlowKt__CollectKt.collect(flow, q60Var);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
        return FlowKt__CollectKt.collectIndexed(flow, qu0Var, q60Var);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__CollectKt.collectLatest(flow, pu0Var, q60Var);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__LimitKt.collectWhile(flow, pu0Var, q60Var);
    }

    @cc0
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, qu0Var);
    }

    @cc0
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowKt__MigrationKt.compose(flow, lu0Var);
    }

    @cc0
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowKt__MigrationKt.concatMap(flow, lu0Var);
    }

    @cc0
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.concatWith(flow, t);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__CountKt.count(flow, q60Var);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.debounce(flow, j);
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m65debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m68debounceHG0u8IE(flow, j);
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowKt__DelayKt.debounceDuration(flow, lu0Var);
    }

    @cc0
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j) {
        return FlowKt__MigrationKt.delayEach(flow, j);
    }

    @cc0
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j) {
        return FlowKt__MigrationKt.delayFlow(flow, j);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, lu0Var);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.drop(flow, i);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__LimitKt.dropWhile(flow, pu0Var);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, q60 q60Var) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, q60Var);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__TransformKt.filter(flow, pu0Var);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__TransformKt.filterNot(flow, pu0Var);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.first(flow, q60Var);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.firstOrNull(flow, q60Var);
    }

    public static final ReceiveChannel<mf3> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j);
    }

    @cc0
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__MigrationKt.flatMap(flow, pu0Var);
    }

    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__MergeKt.flatMapConcat(flow, pu0Var);
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__MergeKt.flatMapLatest(flow, pu0Var);
    }

    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i, pu0 pu0Var) {
        return FlowKt__MergeKt.flatMapMerge(flow, i, pu0Var);
    }

    @cc0
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        return FlowKt__MergeKt.flattenMerge(flow, i);
    }

    public static final <T> Flow<T> flow(pu0 pu0Var) {
        return FlowKt__BuildersKt.flow(pu0Var);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, qu0Var);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, ru0 ru0Var) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, ru0Var);
    }

    public static final <T> Flow<T> flowOf(T t) {
        return FlowKt__BuildersKt.flowOf(t);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, y70 y70Var) {
        return FlowKt__ContextKt.flowOn(flow, y70Var);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r, qu0 qu0Var, q60 q60Var) {
        return FlowKt__ReduceKt.fold(flow, r, qu0Var, q60Var);
    }

    @cc0
    public static final <T> void forEach(Flow<? extends T> flow, pu0 pu0Var) {
        FlowKt__MigrationKt.forEach(flow, pu0Var);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.last(flow, q60Var);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.lastOrNull(flow, q60Var);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__TransformKt.map(flow, pu0Var);
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__MergeKt.mapLatest(flow, pu0Var);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__TransformKt.mapNotNull(flow, pu0Var);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> Object none(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__LogicKt.none(flow, pu0Var, q60Var);
    }

    @cc0
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, y70 y70Var) {
        return FlowKt__MigrationKt.observeOn(flow, y70Var);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__EmittersKt.onCompletion(flow, qu0Var);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__TransformKt.onEach(flow, pu0Var);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__EmittersKt.onEmpty(flow, pu0Var);
    }

    @cc0
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    @cc0
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    @cc0
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__EmittersKt.onStart(flow, pu0Var);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, pu0 pu0Var) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, pu0Var);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    @cc0
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    @cc0
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, y70 y70Var) {
        return FlowKt__MigrationKt.publishOn(flow, y70Var);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, qu0 qu0Var, q60 q60Var) {
        return FlowKt__ReduceKt.reduce(flow, qu0Var, q60Var);
    }

    @cc0
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j, pu0 pu0Var) {
        return FlowKt__ErrorsKt.retry(flow, j, pu0Var);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, ru0 ru0Var) {
        return FlowKt__ErrorsKt.retryWhen(flow, ru0Var);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r, qu0 qu0Var) {
        return FlowKt__TransformKt.runningFold(flow, r, qu0Var);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__TransformKt.runningReduce(flow, qu0Var);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.sample(flow, j);
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m66sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m69sampleHG0u8IE(flow, j);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r, qu0 qu0Var) {
        return FlowKt__TransformKt.scan(flow, r, qu0Var);
    }

    @cc0
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r, qu0 qu0Var) {
        return FlowKt__MigrationKt.scanFold(flow, r, qu0Var);
    }

    @cc0
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__MigrationKt.scanReduce(flow, qu0Var);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> Object single(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.single(flow, q60Var);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__ReduceKt.singleOrNull(flow, q60Var);
    }

    @cc0
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.skip(flow, i);
    }

    @cc0
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t) {
        return FlowKt__MigrationKt.startWith(flow, t);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, q60 q60Var) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, q60Var);
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    @cc0
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, y70 y70Var) {
        return FlowKt__MigrationKt.subscribeOn(flow, y70Var);
    }

    @cc0
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__MigrationKt.switchMap(flow, pu0Var);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.take(flow, i);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__LimitKt.takeWhile(flow, pu0Var);
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m67timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m70timeoutHG0u8IE(flow, j);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c, q60 q60Var) {
        return FlowKt__CollectionKt.toCollection(flow, c, q60Var);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, q60 q60Var) {
        return FlowKt__CollectionKt.toList(flow, list, q60Var);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, q60 q60Var) {
        return FlowKt__CollectionKt.toSet(flow, set, q60Var);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__EmittersKt.transform(flow, qu0Var);
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__MergeKt.transformLatest(flow, qu0Var);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__LimitKt.transformWhile(flow, qu0Var);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt__EmittersKt.unsafeTransform(flow, qu0Var);
    }

    public static final <T> Flow<l11> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt__ZipKt.zip(flow, flow2, qu0Var);
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow, pu0 pu0Var) {
        FlowKt__MigrationKt.subscribe(flow, pu0Var);
    }

    public static final <T> Flow<T> asFlow(lu0 lu0Var) {
        return FlowKt__BuildersKt.asFlow(lu0Var);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i, bufferOverflow);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt__ZipKt.combine(flow, flow2, qu0Var);
    }

    @cc0
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, ru0 ru0Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, ru0Var);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, ru0 ru0Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, ru0Var);
    }

    @cc0
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object count(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__CountKt.count(flow, pu0Var, q60Var);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, lu0 lu0Var) {
        return FlowKt__DelayKt.debounce(flow, lu0Var);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, pu0Var);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, q60 q60Var) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, q60Var);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, l81 l81Var) {
        return FlowKt__TransformKt.filterIsInstance(flow, l81Var);
    }

    public static final <T> Object first(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__ReduceKt.first(flow, pu0Var, q60Var);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, pu0 pu0Var, q60 q60Var) {
        return FlowKt__ReduceKt.firstOrNull(flow, pu0Var, q60Var);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    @cc0
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    @cc0
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t, lu0 lu0Var) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t, lu0Var);
    }

    @cc0
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.publish(flow, i);
    }

    @cc0
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.replay(flow, i);
    }

    @cc0
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t);
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow, pu0 pu0Var, pu0 pu0Var2) {
        FlowKt__MigrationKt.subscribe(flow, pu0Var, pu0Var2);
    }

    public static final Flow<Integer> asFlow(k41 k41Var) {
        return FlowKt__BuildersKt.asFlow(k41Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, ru0 ru0Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, ru0Var);
    }

    @cc0
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, su0 su0Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, su0Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, su0 su0Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, su0Var);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    public static final Flow<Long> asFlow(wj1 wj1Var) {
        return FlowKt__BuildersKt.asFlow(wj1Var);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, su0 su0Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, su0Var);
    }

    @cc0
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, tu0 tu0Var) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, tu0Var);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, tu0 tu0Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, tu0Var);
    }

    public static final <T> Flow<T> asFlow(us2 us2Var) {
        return FlowKt__BuildersKt.asFlow(us2Var);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, tu0 tu0Var) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, tu0Var);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, uu0 uu0Var) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, uu0Var);
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
