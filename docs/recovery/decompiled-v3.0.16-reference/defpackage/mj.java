package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mj {
    public static final mj e;
    public static final mj f;
    public static final mj g;
    public static final mj h;
    public static final mj i;
    public static final mj j;
    public static final mj k;
    public static final /* synthetic */ mj[] l;

    static {
        mj mjVar = new mj("Paragraph", 0);
        e = mjVar;
        mj mjVar2 = new mj("Span", 1);
        f = mjVar2;
        mj mjVar3 = new mj("VerbatimTts", 2);
        g = mjVar3;
        mj mjVar4 = new mj("Url", 3);
        h = mjVar4;
        mj mjVar5 = new mj("Link", 4);
        i = mjVar5;
        mj mjVar6 = new mj("Clickable", 5);
        j = mjVar6;
        mj mjVar7 = new mj("String", 6);
        k = mjVar7;
        l = new mj[]{mjVar, mjVar2, mjVar3, mjVar4, mjVar5, mjVar6, mjVar7};
    }

    public static mj valueOf(String str) {
        return (mj) Enum.valueOf(mj.class, str);
    }

    public static mj[] values() {
        return (mj[]) l.clone();
    }
}
