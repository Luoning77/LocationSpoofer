package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vp1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ tg f;

    public /* synthetic */ vp1(tg tgVar, int i) {
        this.e = i;
        this.f = tgVar;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        tg tgVar = this.f;
        switch (i) {
            case 0:
                tgVar.a("https://sentinels.copernicus.eu/documents/247904/690755/Sentinel_Data_Legal_Notice");
                break;
            case 1:
                tgVar.a("https://www.openstreetmap.org/copyright");
                break;
            case 2:
                tgVar.a("https://github.com/HuangZhuoRui/LocationSpoofer");
                break;
            default:
                tgVar.a("https://t.me/+CsxZGItXdW40ZWVl");
                break;
        }
        return mf3Var;
    }
}
