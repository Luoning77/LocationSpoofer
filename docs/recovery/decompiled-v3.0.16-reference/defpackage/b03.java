package defpackage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b03 extends rd3 {
    public static final wo c = new wo(5);
    public final /* synthetic */ int a;
    public final rd3 b;

    public /* synthetic */ b03(rd3 rd3Var, int i) {
        this.a = i;
        this.b = rd3Var;
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        int i = this.a;
        rd3 rd3Var = this.b;
        switch (i) {
            case 0:
                Date date = (Date) rd3Var.read(z71Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) rd3Var.read(z71Var)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                z71Var.A();
                while (z71Var.h0()) {
                    arrayList.add(Long.valueOf(((Number) rd3Var.read(z71Var)).longValue()));
                }
                z71Var.U();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (z71Var.u0() != 9) {
                    return rd3Var.read(z71Var);
                }
                z71Var.q0();
                return null;
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) {
        int i = this.a;
        rd3 rd3Var = this.b;
        switch (i) {
            case 0:
                rd3Var.write(i81Var, (Timestamp) obj);
                break;
            case 1:
                rd3Var.write(i81Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                i81Var.F();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    rd3Var.write(i81Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                i81Var.U();
                break;
            default:
                if (obj == null) {
                    i81Var.f0();
                } else {
                    rd3Var.write(i81Var, obj);
                }
                break;
        }
    }
}
