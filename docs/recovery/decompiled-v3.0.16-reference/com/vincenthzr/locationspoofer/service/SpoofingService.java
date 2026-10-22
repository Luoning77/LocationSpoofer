package com.vincenthzr.locationspoofer.service;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeServiceOwnership;
import defpackage.am1;
import defpackage.az2;
import defpackage.b81;
import defpackage.ce1;
import defpackage.d6;
import defpackage.gh0;
import defpackage.ig0;
import defpackage.l13;
import defpackage.mf3;
import defpackage.ni2;
import defpackage.oi2;
import defpackage.q60;
import defpackage.rn;
import defpackage.rz2;
import defpackage.sz2;
import defpackage.vo;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.yi2;
import defpackage.zb1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SpoofingService extends Service {
    public static final int $stable = 8;
    public static final String ACTION_START = "ACTION_START";
    public static final String ACTION_STOP = "ACTION_STOP";
    private static final String CHANNEL_ID = "SpoofingServiceChannel";
    public static final String EXTRA_LAT = "EXTRA_LAT";
    public static final String EXTRA_LNG = "EXTRA_LNG";
    private static final int NOTIFICATION_ID = 1001;
    private final zb1 backgroundProtection$delegate;
    private int commandStartId;
    private final Object ownerToken;
    private Long runGeneration;
    private final zb1 runtimeAuthorization$delegate;
    private final CoroutineScope serviceScope;
    private PowerManager.WakeLock wakeLock;
    public static final rz2 Companion = new rz2();
    private static final RuntimeServiceOwnership ownership = new RuntimeServiceOwnership();

    public SpoofingService() {
        sz2 sz2Var = new sz2(this, 0);
        ce1 ce1Var = ce1.e;
        this.runtimeAuthorization$delegate = ig0.A(ce1Var, sz2Var);
        this.backgroundProtection$delegate = ig0.A(ce1Var, new sz2(this, 1));
        this.ownerToken = new Object();
        this.serviceScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
    }

    private final void acquireWakeLock() {
        PowerManager.WakeLock wakeLock;
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = this.wakeLock;
            if (wakeLockNewWakeLock == null) {
                Object systemService = getSystemService("power");
                systemService.getClass();
                wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "LocationSpoofer:BackgroundSpoofingWakeLock");
                wakeLockNewWakeLock.setReferenceCounted(false);
                this.wakeLock = wakeLockNewWakeLock;
            }
            if (wakeLockNewWakeLock == null || wakeLockNewWakeLock.isHeld() || (wakeLock = this.wakeLock) == null) {
                return;
            }
            wakeLock.acquire(86400000L);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeOwnResources() {
        if (ownership.release(this.ownerToken, this.runGeneration)) {
            getBackgroundProtection().a(this.runGeneration);
            stopForeground(1);
        }
        releaseWakeLock();
        stopSelf(this.commandStartId);
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, getString(2131625041), 2);
        notificationChannel.setDescription(getString(2131625037));
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    private final oi2 getBackgroundProtection() {
        return (oi2) this.backgroundProtection$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RuntimeAuthorizationManager getRuntimeAuthorization() {
        return (RuntimeAuthorizationManager) this.runtimeAuthorization$delegate.getValue();
    }

    private final void releaseWakeLock() {
        PowerManager.WakeLock wakeLock;
        try {
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            if (wakeLock2 != null && wakeLock2.isHeld() && (wakeLock = this.wakeLock) != null) {
                wakeLock.release();
            }
        } catch (Throwable unused) {
        }
        this.wakeLock = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.net.Uri, java.lang.CharSequence, java.lang.CharSequence[], java.lang.String, long[]] */
    private final void startSpoofing(double d, double d2) {
        ?? r8;
        Bundle bundle;
        Object wg2Var;
        List listF;
        RuntimeAuthorization value = getRuntimeAuthorization().getAuthorization().getValue();
        Long lValueOf = value != null ? Long.valueOf(value.getRunGeneration()) : null;
        if (lValueOf == null || !RuntimeAuthorizationManager.isAuthorized$default(getRuntimeAuthorization(), null, 1, null)) {
            closeOwnResources();
            return;
        }
        this.runGeneration = lValueOf;
        ownership.begin(this.ownerToken, lValueOf.longValue());
        acquireWakeLock();
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent();
        }
        launchIntentForPackage.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        ArrayList arrayList4 = new ArrayList();
        String string = getString(2131625043);
        String strSubSequence = string;
        if (string != null && string.length() > 5120) {
            strSubSequence = string;
            strSubSequence = string.subSequence(0, 5120);
        }
        strSubSequence = string;
        Locale locale = Locale.US;
        String string2 = getString(2131625042, String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
        String strSubSequence2 = string2;
        if (string2 != null && string2.length() > 5120) {
            strSubSequence2 = string2;
            strSubSequence2 = string2.subSequence(0, 5120);
        }
        strSubSequence2 = string2;
        notification.icon = R.drawable.ic_menu_mylocation;
        notification.flags |= 2;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder builder = new Notification.Builder(this, CHANNEL_ID);
        Long l = lValueOf;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(strSubSequence).setContentText(strSubSequence2).setContentInfo(null).setContentIntent(activity).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & WorkQueueKt.BUFFER_CAPACITY) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(1);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(false);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory("service");
        builder.setColor(0);
        builder.setVisibility(1);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList5 = new ArrayList(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                throw az2.g(it2);
            }
            vo voVar = new vo(arrayList4.size() + arrayList5.size());
            voVar.addAll(arrayList5);
            voVar.addAll(arrayList4);
            arrayList4 = new ArrayList(voVar);
        }
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                builder.addPerson((String) obj);
            }
        }
        if (arrayList3.size() > 0) {
            bundle = new Bundle();
            Bundle bundle3 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList3.size() > 0) {
                Integer.toString(0);
                if (arrayList3.get(0) != null) {
                    b81.u();
                    return;
                } else {
                    new Bundle();
                    throw null;
                }
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            bundle.putBundle("android.car.EXTENSIONS", bundle3);
            bundle2.putBundle("android.car.EXTENSIONS", bundle4);
            r8 = 0;
        } else {
            r8 = 0;
            bundle = null;
        }
        builder.setExtras(bundle);
        builder.setRemoteInputHistory(r8);
        builder.setBadgeIconType(0);
        builder.setSettingsText(r8);
        builder.setShortcutId(r8);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(CHANNEL_ID)) {
            builder.setSound(r8).setDefaults(0).setLights(0, 0, 0).setVibrate(r8);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                throw az2.g(it3);
            }
        }
        if (i2 >= 29) {
            rn.l(builder);
            rn.m(builder);
        }
        Notification notificationBuild = builder.build();
        notificationBuild.getClass();
        try {
            if (i2 >= 29) {
                startForeground(1001, notificationBuild, 8);
            } else {
                startForeground(NOTIFICATION_ID, notificationBuild);
            }
            ownership.foregroundStarted(this.ownerToken, l.longValue());
            try {
                String strM = gh0.M(new File("/proc/self/stat"));
                int iL0 = l13.l0(6, strM, ") ");
                if (iL0 != -1) {
                    strM = strM.substring(2 + iL0, strM.length());
                }
                String string3 = l13.D0(strM).toString();
                Pattern patternCompile = Pattern.compile("\\s+");
                patternCompile.getClass();
                string3.getClass();
                l13.s0(0);
                Matcher matcher = patternCompile.matcher(string3);
                if (matcher.find()) {
                    ArrayList arrayList6 = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList6.add(string3.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList6.add(string3.subSequence(iEnd, string3.length()).toString());
                    listF = arrayList6;
                } else {
                    listF = am1.F(string3.toString());
                }
                oi2 backgroundProtection = getBackgroundProtection();
                long jLongValue = l.longValue();
                String packageName = getPackageName();
                packageName.getClass();
                yi2 yi2Var = new yi2(packageName, Process.myPid(), Process.myUid(), Long.parseLong((String) listF.get(19)));
                synchronized (backgroundProtection) {
                    if (((Boolean) backgroundProtection.c.invoke(l)).booleanValue()) {
                        backgroundProtection.f.setValue(new ni2(jLongValue, yi2Var));
                    }
                }
                wg2Var = mf3.a;
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            if (xg2.a(wg2Var) != null) {
                Log.w("LocationSpoofer", "Background process identity unavailable");
            }
        } catch (Throwable unused) {
            RuntimeAuthorizationManager.invalidate$default(getRuntimeAuthorization(), false, l, 1, null);
            closeOwnResources();
        }
    }

    private final void stopSpoofing() {
        RuntimeAuthorizationManager.invalidate$default(getRuntimeAuthorization(), true, null, 2, null);
        closeOwnResources();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new d6(this, (q60) null, 20), 3, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (ownership.release(this.ownerToken, this.runGeneration)) {
            getBackgroundProtection().a(this.runGeneration);
            Long l = this.runGeneration;
            if (l != null) {
                RuntimeAuthorizationManager.invalidate$default(getRuntimeAuthorization(), false, Long.valueOf(l.longValue()), 1, null);
            }
        }
        releaseWakeLock();
        CoroutineScopeKt.cancel$default(this.serviceScope, null, 1, null);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.commandStartId = i2;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -528730005) {
                if (iHashCode == 789225721 && action.equals(ACTION_START)) {
                    if (!RuntimeAuthorizationManager.isAuthorized$default(getRuntimeAuthorization(), null, 1, null)) {
                        closeOwnResources();
                        return 2;
                    }
                    startSpoofing(intent.getDoubleExtra(EXTRA_LAT, 0.0d), intent.getDoubleExtra(EXTRA_LNG, 0.0d));
                }
            } else if (action.equals(ACTION_STOP)) {
                stopSpoofing();
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Companion.getClass();
        if (ownership.isRunning() && ownership.owns(this.ownerToken, this.runGeneration)) {
            acquireWakeLock();
        }
    }
}
