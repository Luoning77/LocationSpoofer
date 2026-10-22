package defpackage;

import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u3 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;

    public /* synthetic */ u3(List list, int i) {
        this.e = i;
        this.f = list;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                break;
            case 1:
                list.get(((Number) obj).intValue());
                break;
            case 2:
                list.get(((Number) obj).intValue());
                break;
            case 3:
                list.get(((Number) obj).intValue());
                break;
            case 4:
                list.get(((Number) obj).intValue());
                break;
            case Logger.WARN /* 5 */:
                list.get(((Number) obj).intValue());
                break;
            case Logger.ERROR /* 6 */:
                list.get(((Number) obj).intValue());
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                list.get(((Number) obj).intValue());
                break;
            case 8:
                list.get(((Number) obj).intValue());
                break;
            case mc0.b /* 9 */:
                list.get(((Number) obj).intValue());
                break;
            case mc0.c /* 10 */:
                list.get(((Number) obj).intValue());
                break;
            case 11:
                list.get(((Number) obj).intValue());
                break;
            case mc0.d /* 12 */:
                list.get(((Number) obj).intValue());
                break;
            case 13:
                list.get(((Number) obj).intValue());
                break;
            default:
                list.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
