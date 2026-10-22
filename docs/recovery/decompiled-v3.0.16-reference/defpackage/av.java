package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class av implements zu {
    public final int[] a;
    public final float[] b;

    public av(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.zu
    public void a(View view, float[] fArr) {
        yq1.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            yq1.d(fArr2);
            yq1.f(fArr2, f, f2);
            sb.Z(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            yq1.d(fArr2);
            yq1.f(fArr2, left, top);
            sb.Z(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            yq1.d(fArr2);
            yq1.f(fArr2, f3, f4);
            sb.Z(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            yq1.d(fArr2);
            yq1.f(fArr2, f5, f6);
            sb.Z(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        am1.T(matrix, fArr2);
        sb.Z(fArr, fArr2);
    }

    public av(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public av(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public av(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
