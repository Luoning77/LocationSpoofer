package defpackage;

import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cm1 extends k33 implements pu0 {
    public ul1 e;
    public Iterator f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ul1 j;
    public final /* synthetic */ ImportExportSelection k;
    public final /* synthetic */ LocationSpooferDataPackage l;
    public final /* synthetic */ au0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm1(ul1 ul1Var, ImportExportSelection importExportSelection, LocationSpooferDataPackage locationSpooferDataPackage, au0 au0Var, q60 q60Var) {
        super(2, q60Var);
        this.j = ul1Var;
        this.k = importExportSelection;
        this.l = locationSpooferDataPackage;
        this.m = au0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        cm1 cm1Var = new cm1(this.j, this.k, this.l, this.m, q60Var);
        cm1Var.i = obj;
        return cm1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((cm1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:9:0x0028, B:69:0x019b, B:71:0x01a1, B:74:0x01d7, B:76:0x01dd, B:78:0x01e7, B:79:0x01fd, B:81:0x0203, B:83:0x0209, B:85:0x0231, B:86:0x0238, B:88:0x023e, B:89:0x0245, B:91:0x024f, B:92:0x0256, B:94:0x0260, B:95:0x0267, B:97:0x0271, B:98:0x0278, B:99:0x0286, B:101:0x02b2, B:102:0x02b6, B:104:0x02ca, B:113:0x02f6, B:115:0x03aa, B:112:0x02f1, B:108:0x02dd, B:16:0x0040, B:37:0x00c5, B:39:0x00cb, B:43:0x00e7, B:45:0x00ed, B:47:0x00f7, B:48:0x0109, B:50:0x010f, B:62:0x0154, B:53:0x011e, B:55:0x0125, B:57:0x013b, B:59:0x0147, B:63:0x017b, B:64:0x0180, B:66:0x0186, B:68:0x0190, B:19:0x004e, B:29:0x007b, B:31:0x0081, B:36:0x00b8, B:20:0x0054, B:26:0x006a, B:28:0x0070, B:23:0x005b, B:106:0x02d0, B:110:0x02e2), top: B:124:0x0018, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ad -> B:35:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oq
    public final java.lang.Object invokeSuspend(java.lang.Object r115) {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
