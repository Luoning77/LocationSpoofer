package androidx.fragment.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.ah1;
import defpackage.az2;
import defpackage.b80;
import defpackage.b81;
import defpackage.bh1;
import defpackage.cq;
import defpackage.dq;
import defpackage.e8;
import defpackage.eq;
import defpackage.es0;
import defpackage.f8;
import defpackage.ff1;
import defpackage.fo;
import defpackage.gs0;
import defpackage.hs0;
import defpackage.ij1;
import defpackage.is0;
import defpackage.js0;
import defpackage.ks0;
import defpackage.ls0;
import defpackage.mn2;
import defpackage.ms0;
import defpackage.oj3;
import defpackage.ou2;
import defpackage.ox;
import defpackage.p91;
import defpackage.qm2;
import defpackage.r50;
import defpackage.rv;
import defpackage.tr0;
import defpackage.v00;
import defpackage.ve1;
import defpackage.w00;
import defpackage.w7;
import defpackage.we1;
import defpackage.wr0;
import defpackage.x12;
import defpackage.xe2;
import defpackage.yy2;
import defpackage.zg1;
import defpackage.zm3;
import defpackage.zr0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class FragmentActivity extends ComponentActivity {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final ff1 mFragmentLifecycleRegistry;
    final wr0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new wr0(new a(this));
        this.mFragmentLifecycleRegistry = new ff1(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new v00(this, 2));
        final int i = 0;
        addOnConfigurationChangedListener(new r50(this) { // from class: ur0
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i2 = i;
                FragmentActivity fragmentActivity = this.b;
                switch (i2) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new r50(this) { // from class: ur0
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.r50
            public final void accept(Object obj) {
                int i3 = i2;
                FragmentActivity fragmentActivity = this.b;
                switch (i3) {
                    case 0:
                        fragmentActivity.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        fragmentActivity.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new w00(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(ve1.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:90:0x032d  */
    public void lambda$init$3(Context context) {
        int i;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2;
        a aVar = this.mFragments.a;
        FragmentActivity fragmentActivity = aVar.h;
        hs0 hs0Var = aVar.g;
        mn2 mn2Var = hs0Var.c;
        if (hs0Var.u != null) {
            fo.n("Already attached");
            return;
        }
        hs0Var.u = aVar;
        hs0Var.v = aVar;
        hs0Var.n.add(aVar);
        x12 onBackPressedDispatcher = fragmentActivity.getOnBackPressedDispatcher();
        hs0Var.f = onBackPressedDispatcher;
        onBackPressedDispatcher.a(aVar, hs0Var.i);
        oj3 viewModelStore = fragmentActivity.getViewModelStore();
        viewModelStore.getClass();
        b80 b80Var = b80.b;
        b80Var.getClass();
        mn2 mn2Var2 = new mn2(viewModelStore, ks0.f, b80Var);
        ox oxVarA = xe2.a(ks0.class);
        String strB = oxVarA.b();
        if (strB == null) {
            fo.i("Local and anonymous classes can not be ViewModels");
            return;
        }
        ks0 ks0Var = (ks0) mn2Var2.r(oxVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        hs0Var.H = ks0Var;
        mn2Var.h = ks0Var;
        HashMap map = (HashMap) mn2Var.f;
        HashMap map2 = (HashMap) mn2Var.g;
        a aVar2 = hs0Var.u;
        int i2 = 3;
        if (aVar2 != null) {
            qm2 savedStateRegistry = aVar2.h.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new v00(hs0Var, i2));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                for (String str : bundleA.keySet()) {
                    if (str.startsWith("result_") && (bundle2 = bundleA.getBundle(str)) != null) {
                        bundle2.setClassLoader(hs0Var.u.e.getClassLoader());
                        hs0Var.l.put(str.substring(7), bundle2);
                    }
                }
                HashMap map3 = new HashMap();
                for (String str2 : bundleA.keySet()) {
                    if (str2.startsWith("fragment_") && (bundle = bundleA.getBundle(str2)) != null) {
                        bundle.setClassLoader(hs0Var.u.e.getClassLoader());
                        map3.put(str2.substring(9), bundle);
                    }
                }
                map2.clear();
                map2.putAll(map3);
                is0 is0Var = (is0) bundleA.getParcelable("state");
                if (is0Var == null) {
                    i = 2;
                } else {
                    map.clear();
                    ArrayList arrayList2 = is0Var.e;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        Bundle bundle3 = (Bundle) map2.remove((String) obj);
                        if (bundle3 != null) {
                            if (hs0Var.H.b.get(((ls0) bundle3.getParcelable("state")).f) != null) {
                                b81.u();
                                return;
                            } else {
                                hs0Var.u.e.getClassLoader();
                                hs0Var.w.a(((ls0) bundle3.getParcelable("state")).e);
                                throw null;
                            }
                        }
                    }
                    ks0 ks0Var2 = hs0Var.H;
                    ks0Var2.getClass();
                    Iterator it = new ArrayList(ks0Var2.b.values()).iterator();
                    if (it.hasNext()) {
                        throw az2.g(it);
                    }
                    ArrayList arrayList3 = is0Var.f;
                    ((ArrayList) mn2Var.e).clear();
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        if (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            p91.x(map.get(str3));
                            fo.n(az2.k("No instantiated fragment for (", str3, ")"));
                            return;
                        }
                    }
                    if (is0Var.g != null) {
                        hs0Var.d = new ArrayList(is0Var.g.length);
                        int i4 = 0;
                        while (true) {
                            dq[] dqVarArr = is0Var.g;
                            if (i4 >= dqVarArr.length) {
                                break;
                            }
                            dq dqVar = dqVarArr[i4];
                            ArrayList arrayList4 = dqVar.f;
                            cq cqVar = new cq(hs0Var);
                            int[] iArr = dqVar.e;
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                int length = iArr.length;
                                arrayList = cqVar.a;
                                if (i5 >= length) {
                                    break;
                                }
                                ms0 ms0Var = new ms0();
                                int i7 = i5 + 1;
                                ms0Var.a = iArr[i5];
                                if (gs0.l(2)) {
                                    Log.v("FragmentManager", "Instantiate " + cqVar + " op #" + i6 + " base fragment #" + iArr[i7]);
                                }
                                ms0Var.g = we1.values()[dqVar.g[i6]];
                                ms0Var.h = we1.values()[dqVar.h[i6]];
                                int i8 = i5 + 2;
                                ms0Var.b = iArr[i7] != 0;
                                int i9 = iArr[i8];
                                ms0Var.c = i9;
                                int i10 = iArr[i5 + 3];
                                ms0Var.d = i10;
                                int i11 = i5 + 5;
                                int i12 = iArr[i5 + 4];
                                ms0Var.e = i12;
                                i5 += 6;
                                int i13 = iArr[i11];
                                ms0Var.f = i13;
                                cqVar.b = i9;
                                cqVar.c = i10;
                                cqVar.d = i12;
                                cqVar.e = i13;
                                arrayList.add(ms0Var);
                                ms0Var.c = cqVar.b;
                                ms0Var.d = cqVar.c;
                                ms0Var.e = cqVar.d;
                                ms0Var.f = cqVar.e;
                                i6++;
                            }
                            cqVar.f = dqVar.i;
                            cqVar.h = dqVar.j;
                            cqVar.g = true;
                            cqVar.i = dqVar.l;
                            cqVar.j = dqVar.m;
                            cqVar.k = dqVar.n;
                            cqVar.l = dqVar.o;
                            cqVar.m = dqVar.p;
                            cqVar.n = dqVar.q;
                            cqVar.o = dqVar.r;
                            cqVar.s = dqVar.k;
                            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                String str4 = (String) arrayList4.get(i14);
                                if (str4 != null) {
                                    ms0 ms0Var2 = (ms0) arrayList.get(i14);
                                    p91.x(((HashMap) mn2Var.f).get(str4));
                                    ms0Var2.getClass();
                                }
                            }
                            cqVar.b(1);
                            if (gs0.l(2)) {
                                StringBuilder sbR = p91.r(i4, "restoreAllState: back stack #", " (index ");
                                sbR.append(cqVar.s);
                                sbR.append("): ");
                                sbR.append(cqVar);
                                Log.v("FragmentManager", sbR.toString());
                                PrintWriter printWriter = new PrintWriter(new ij1());
                                cqVar.e("  ", printWriter, false);
                                printWriter.close();
                            }
                            hs0Var.d.add(cqVar);
                            i4++;
                        }
                        i = 2;
                    } else {
                        i = 2;
                        hs0Var.d = new ArrayList();
                    }
                    hs0Var.j.set(is0Var.h);
                    String str5 = is0Var.i;
                    if (str5 != null) {
                        p91.x(((HashMap) mn2Var.f).get(str5));
                    }
                    ArrayList arrayList5 = is0Var.j;
                    if (arrayList5 != null) {
                        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                            hs0Var.k.put((String) arrayList5.get(i15), (eq) is0Var.k.get(i15));
                        }
                    }
                    hs0Var.A = new ArrayDeque(is0Var.l);
                }
            } else {
                i = 2;
            }
        } else {
            i = 2;
        }
        a aVar3 = hs0Var.u;
        if (aVar3 != null) {
            f8 activityResultRegistry = aVar3.h.getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat("");
            hs0Var.x = activityResultRegistry.c(strConcat.concat("StartActivityForResult"), new w7(3), new zr0(hs0Var, 1));
            hs0Var.y = activityResultRegistry.c(strConcat.concat("StartIntentSenderForResult"), new w7(4), new zr0(hs0Var, i));
            hs0Var.z = activityResultRegistry.c(strConcat.concat("RequestPermissions"), new w7(1), new zr0(hs0Var, 0));
        }
        a aVar4 = hs0Var.u;
        if (aVar4 != null) {
            aVar4.h.addOnConfigurationChangedListener(hs0Var.o);
        }
        a aVar5 = hs0Var.u;
        if (aVar5 != null) {
            aVar5.h.addOnTrimMemoryListener(hs0Var.p);
        }
        a aVar6 = hs0Var.u;
        if (aVar6 != null) {
            aVar6.h.addOnMultiWindowModeChangedListener(hs0Var.q);
        }
        a aVar7 = hs0Var.u;
        if (aVar7 != null) {
            aVar7.h.addOnPictureInPictureModeChangedListener(hs0Var.r);
        }
        a aVar8 = hs0Var.u;
        if (aVar8 != null) {
            aVar8.h.addMenuProvider(hs0Var.s);
        }
    }

    private static boolean markState(gs0 gs0Var, we1 we1Var) {
        Iterator it = gs0Var.c.k().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                b81.u();
                break;
            }
        }
        return false;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.g.e.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                oj3 viewModelStore = getViewModelStore();
                js0 js0Var = ah1.c;
                viewModelStore.getClass();
                b80 b80Var = b80.b;
                b80Var.getClass();
                mn2 mn2Var = new mn2(viewModelStore, js0Var, b80Var);
                ox oxVarA = xe2.a(ah1.class);
                String strB = oxVarA.b();
                if (strB == null) {
                    fo.i("Local and anonymous classes can not be ViewModels");
                    return;
                }
                yy2 yy2Var = ((ah1) mn2Var.r(oxVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                if (yy2Var.g > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (yy2Var.g > 0) {
                        if (yy2Var.c(0) != null) {
                            b81.u();
                            return;
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(yy2Var.e[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            hs0 hs0Var = this.mFragments.a.g;
            String strY = az2.y(str, "    ");
            mn2 mn2Var2 = hs0Var.c;
            ArrayList arrayList = (ArrayList) mn2Var2.e;
            HashMap map = (HashMap) mn2Var2.f;
            if (!map.isEmpty()) {
                printWriter.print(str);
                printWriter.println("Active Fragments:");
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    p91.x(it.next());
                    printWriter.print(str);
                    printWriter.println("null");
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                if (size > 0) {
                    if (arrayList.get(0) != null) {
                        b81.u();
                        return;
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(0);
                    printWriter.print(": ");
                    throw null;
                }
            }
            int size2 = hs0Var.d.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i = 0; i < size2; i++) {
                    cq cqVar = (cq) hs0Var.d.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(cqVar.toString());
                    cqVar.e(strY, printWriter, true);
                }
            }
            printWriter.print(str);
            printWriter.println("Back Stack Index: " + hs0Var.j.get());
            synchronized (hs0Var.a) {
                try {
                    int size3 = hs0Var.a.size();
                    if (size3 > 0) {
                        printWriter.print(str);
                        printWriter.println("Pending Actions:");
                        for (int i2 = 0; i2 < size3; i2++) {
                            es0 es0Var = (es0) hs0Var.a.get(i2);
                            printWriter.print(str);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                            printWriter.println(es0Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            printWriter.print(str);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(str);
            printWriter.print("  mHost=");
            printWriter.println(hs0Var.u);
            printWriter.print(str);
            printWriter.print("  mContainer=");
            printWriter.println(hs0Var.v);
            printWriter.print(str);
            printWriter.print("  mCurState=");
            printWriter.print(hs0Var.t);
            printWriter.print(" mStateSaved=");
            printWriter.print(hs0Var.B);
            printWriter.print(" mStopped=");
            printWriter.print(hs0Var.C);
            printWriter.print(" mDestroyed=");
            printWriter.println(hs0Var.D);
        }
    }

    public gs0 getSupportFragmentManager() {
        return this.mFragments.a.g;
    }

    @Deprecated
    public zg1 getSupportLoaderManager() {
        return new bh1(this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), we1.g)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(ve1.ON_CREATE);
        hs0 hs0Var = this.mFragments.a.g;
        hs0Var.B = false;
        hs0Var.C = false;
        hs0Var.H.getClass();
        hs0Var.d(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hs0 hs0Var = this.mFragments.a.g;
        boolean zIsChangingConfigurations = true;
        hs0Var.D = true;
        hs0Var.h(true);
        hs0Var.e();
        mn2 mn2Var = hs0Var.c;
        a aVar = hs0Var.u;
        if (aVar != null) {
            zIsChangingConfigurations = ((ks0) mn2Var.h).e;
        } else {
            Context context = aVar.e;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = hs0Var.k.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((eq) it.next()).e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ks0) mn2Var.h).e((String) obj, false);
                }
            }
        }
        hs0Var.d(-1);
        a aVar2 = hs0Var.u;
        if (aVar2 != null) {
            aVar2.h.removeOnTrimMemoryListener(hs0Var.p);
        }
        a aVar3 = hs0Var.u;
        if (aVar3 != null) {
            aVar3.h.removeOnConfigurationChangedListener(hs0Var.o);
        }
        a aVar4 = hs0Var.u;
        if (aVar4 != null) {
            aVar4.h.removeOnMultiWindowModeChangedListener(hs0Var.q);
        }
        a aVar5 = hs0Var.u;
        if (aVar5 != null) {
            aVar5.h.removeOnPictureInPictureModeChangedListener(hs0Var.r);
        }
        a aVar6 = hs0Var.u;
        if (aVar6 != null) {
            aVar6.h.removeMenuProvider(hs0Var.s);
        }
        hs0Var.u = null;
        hs0Var.v = null;
        if (hs0Var.f != null) {
            Iterator it2 = hs0Var.i.b.iterator();
            while (it2.hasNext()) {
                ((rv) it2.next()).cancel();
            }
            hs0Var.f = null;
        }
        e8 e8Var = hs0Var.x;
        if (e8Var != null) {
            e8Var.a();
            hs0Var.y.a();
            hs0Var.z.a();
        }
        this.mFragmentLifecycleRegistry.e(ve1.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            hs0 hs0Var = this.mFragments.a.g;
            if (hs0Var.t >= 1) {
                Iterator it = hs0Var.c.k().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        b81.u();
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.g.d(5);
        this.mFragmentLifecycleRegistry.e(ve1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.g.h(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(ve1.ON_RESUME);
        hs0 hs0Var = this.mFragments.a.g;
        hs0Var.B = false;
        hs0Var.C = false;
        hs0Var.H.getClass();
        hs0Var.d(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            hs0 hs0Var = this.mFragments.a.g;
            hs0Var.B = false;
            hs0Var.C = false;
            hs0Var.H.getClass();
            hs0Var.d(4);
        }
        this.mFragments.a.g.h(true);
        this.mFragmentLifecycleRegistry.e(ve1.ON_START);
        hs0 hs0Var2 = this.mFragments.a.g;
        hs0Var2.B = false;
        hs0Var2.C = false;
        hs0Var2.H.getClass();
        hs0Var2.d(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        hs0 hs0Var = this.mFragments.a.g;
        hs0Var.C = true;
        hs0Var.H.getClass();
        hs0Var.d(4);
        this.mFragmentLifecycleRegistry.e(ve1.ON_STOP);
    }

    public void setEnterSharedElementCallback(ou2 ou2Var) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(ou2 ou2Var) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(tr0 tr0Var, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw null;
        }
        int i2 = zm3.J;
        startActivityForResult(intent, -1, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(tr0 tr0Var, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw null;
        }
        int i5 = zm3.J;
        startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = zm3.J;
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = zm3.J;
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        int i = zm3.J;
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(tr0 tr0Var, Intent intent, int i) {
        startActivityFromFragment(tr0Var, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new wr0(new a(this));
        this.mFragmentLifecycleRegistry = new ff1(this, true);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(tr0 tr0Var) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
