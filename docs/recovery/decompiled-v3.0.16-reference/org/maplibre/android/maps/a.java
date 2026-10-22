package org.maplibre.android.maps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import defpackage.fo;
import defpackage.hp;
import defpackage.xp1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.style.sources.Source;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a implements View.OnClickListener, DialogInterface.OnClickListener {
    public final Context e;
    public final g f;
    public Set g;
    public AlertDialog h;

    public a(Context context, g gVar) {
        this.e = context;
        this.f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        Context context = (Context) new WeakReference(view.getContext()).get();
        if (context == null) {
            set = Collections.EMPTY_SET;
        } else {
            ArrayList arrayList = new ArrayList();
            m mVarI = this.f.i();
            if (mVarI != null) {
                mVarI.h("getSources");
                Iterator it = ((NativeMapView) mVarI.a).r().iterator();
                while (it.hasNext()) {
                    String attribution = ((Source) it.next()).getAttribution();
                    if (!attribution.isEmpty()) {
                        arrayList.add(attribution);
                    }
                }
            }
            new WeakReference(context);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (strArr == null) {
                fo.n("Using builder without providing attribution data");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    sb.append(str);
                }
            }
            String string = sb.toString();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) Html.fromHtml(string, 0);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                char[] cArr = new char[spanEnd - spanStart];
                spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
                String strValueOf = String.valueOf(cArr);
                hp hpVar = new hp();
                hpVar.a = strValueOf;
                hpVar.b = url;
                linkedHashSet.add(hpVar);
            }
            set = linkedHashSet;
        }
        this.g = set;
        Context context2 = this.e;
        if (context2 instanceof Activity ? ((Activity) context2).isFinishing() : false) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hp) it2.next()).a);
        }
        String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        builder.setTitle(2131624686);
        builder.setAdapter(new ArrayAdapter(context2, 2131427359, strArr2), this);
        this.h = builder.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Set set = this.g;
        String string = ((hp[]) set.toArray(new hp[set.size()]))[i].b;
        boolean zContains = string.contains("https://www.mapbox.com/map-feedback");
        Context context = this.e;
        if (zContains || string.contains("https://apps.mapbox.com/feedback")) {
            String apiKey = MapLibre.getApiKey();
            Uri.Builder builderBuildUpon = Uri.parse("https://apps.mapbox.com/feedback").buildUpon();
            g gVar = this.f;
            CameraPosition cameraPositionH = gVar.h();
            if (cameraPositionH != null) {
                builderBuildUpon.encodedFragment(String.format(Locale.getDefault(), "/%f/%f/%f/%f/%d", Double.valueOf(cameraPositionH.target.b()), Double.valueOf(cameraPositionH.target.a()), Double.valueOf(cameraPositionH.zoom), Double.valueOf(cameraPositionH.bearing), Integer.valueOf((int) cameraPositionH.tilt)));
            }
            String packageName = context.getApplicationContext().getPackageName();
            if (packageName != null) {
                builderBuildUpon.appendQueryParameter("referrer", packageName);
            }
            if (apiKey != null) {
                builderBuildUpon.appendQueryParameter("access_token", apiKey);
            }
            m mVarI = gVar.i();
            if (mVarI != null) {
                mVarI.h("getUri");
                Matcher matcher = Pattern.compile("^(.*://[^:^/]*)/(.*)/(.*)").matcher(((NativeMapView) mVarI.a).s());
                if (matcher.find()) {
                    String strGroup = matcher.group(2);
                    builderBuildUpon.appendQueryParameter("owner", strGroup).appendQueryParameter("id", matcher.group(3));
                }
            }
            string = builderBuildUpon.build().toString();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string));
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(context, 2131624685, 1).show();
            xp1.Q(e);
        }
    }
}
