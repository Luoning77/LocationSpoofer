package defpackage;

import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i40 extends k33 implements pu0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Map C;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ConfigManager g;
    public final /* synthetic */ List h;
    public final /* synthetic */ double i;
    public final /* synthetic */ double j;
    public final /* synthetic */ String k;
    public final /* synthetic */ float l;
    public final /* synthetic */ double m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ double x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(boolean z, ConfigManager configManager, List list, double d, double d2, String str, float f, double d3, long j, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, double d4, int i, boolean z8, int i2, boolean z9, Map map, q60 q60Var) {
        super(2, q60Var);
        this.f = z;
        this.g = configManager;
        this.h = list;
        this.i = d;
        this.j = d2;
        this.k = str;
        this.l = f;
        this.m = d3;
        this.n = j;
        this.o = z2;
        this.p = z3;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.t = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = d4;
        this.y = i;
        this.z = z8;
        this.A = i2;
        this.B = z9;
        this.C = map;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new i40(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((i40) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[LOOP:0: B:22:0x0056->B:24:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0129 A[LOOP:1: B:30:0x0123->B:32:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x016d A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r13 == r9) goto L35;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.json.JSONException, com.vincenthzr.locationspoofer.data.cloud.CloudException {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
