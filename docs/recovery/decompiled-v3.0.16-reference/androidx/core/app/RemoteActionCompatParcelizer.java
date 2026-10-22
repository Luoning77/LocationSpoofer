package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.gi3;
import defpackage.hi3;
import defpackage.ii3;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(gi3 gi3Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ii3 ii3VarG = remoteActionCompat.a;
        boolean z = true;
        if (gi3Var.e(1)) {
            ii3VarG = gi3Var.g();
        }
        remoteActionCompat.a = (IconCompat) ii3VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (gi3Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((hi3) gi3Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (gi3Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((hi3) gi3Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) gi3Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (gi3Var.e(5)) {
            z2 = ((hi3) gi3Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!gi3Var.e(6)) {
            z = z3;
        } else if (((hi3) gi3Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, gi3 gi3Var) {
        gi3Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        gi3Var.h(1);
        gi3Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        gi3Var.h(2);
        Parcel parcel = ((hi3) gi3Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        gi3Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        gi3Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        gi3Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        gi3Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
