package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fg {
    public final gg a;
    public final dg b;
    public final dg c;
    public final View d;

    public fg(gg ggVar, dg dgVar, dg dgVar2, View view) {
        this.a = ggVar;
        this.b = dgVar;
        this.c = dgVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        x53 x53Var = (x53) this.b.invoke();
        final int i3 = 0;
        if (o51.f(x53Var, null)) {
            return false;
        }
        menu.clear();
        List list = x53Var.a;
        int size = list.size();
        final int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        while (i5 < size) {
            w53 w53Var = (w53) list.get(i5);
            if (w53Var instanceof e63) {
                i = i6 + 1;
                Object obj = w53Var.a;
                if (o51.f(obj, da0.X)) {
                    i2 = R.id.cut;
                } else if (o51.f(obj, da0.Y)) {
                    i2 = R.id.copy;
                } else if (o51.f(obj, da0.Z)) {
                    i2 = R.id.paste;
                } else if (o51.f(obj, da0.a0)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = o51.f(obj, da0.b0) ? R.id.autofill : i6;
                }
                final e63 e63Var = (e63) w53Var;
                MenuItem menuItemAdd = menu.add(i7, i2, i6, e63Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: eg
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i8 = i3;
                        Object obj2 = this;
                        Object obj3 = e63Var;
                        switch (i8) {
                            case 0:
                                ((e63) obj3).d.invoke(((fg) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (w53Var instanceof l63) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i6 + 1;
                        final Context context = this.d.getContext();
                        l63 l63Var = (l63) w53Var;
                        final TextClassification textClassification = l63Var.b;
                        int i8 = l63Var.c;
                        if (i8 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i6, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: eg
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i9 = i4;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i9) {
                                        case 0:
                                            ((e63) obj3).d.invoke(((fg) obj2).a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i9 = i8 == 0 ? 1 : i3;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i8);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i9 != 0 ? 16908353 : i3, i6, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i9 == 0 ? 0 : 2);
                            if (i9 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: v93
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (w53Var instanceof j63) {
                    i7++;
                }
                i5++;
                i3 = 0;
            }
            i6 = i;
            i5++;
            i3 = 0;
        }
        return true;
    }
}
