package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oc0 extends RuntimeException {
    public final s20 e;

    public oc0(s20 s20Var) {
        this.e = s20Var;
        if (s20Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = s20Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            u20 u20Var = (u20) list.get(i);
            if (!yo.j0(iArr, u20Var.a)) {
                if (u20Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((u20) list.get(i3)).a == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(u20Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((u20) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        s20 s20Var = this.e;
        if (!s20Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        mg1 mg1VarN = am1.n();
        List list = s20Var.a;
        list.getClass();
        uq1 uq1Var = new uq1(list);
        int iA = uq1Var.a();
        for (int i = 0; i < iA; i++) {
            ((u20) uq1Var.get(i)).getClass();
        }
        mg1 mg1VarF = am1.f(mg1VarN);
        mg1VarF.getClass();
        uq1 uq1Var2 = new uq1(mg1VarF);
        int iA2 = uq1Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) uq1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
