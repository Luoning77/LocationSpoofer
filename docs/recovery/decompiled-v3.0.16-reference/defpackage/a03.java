package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a03 extends rd3 {
    public static final wo c = new wo(3);
    public static final wo d = new wo(4);
    public static final wo e = new wo(1);
    public final /* synthetic */ int a;
    public final Object b;

    public a03(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (f61.a >= 9) {
                    arrayList.add(new SimpleDateFormat(az2.k("MMM d, yyyy", " ", "h:mm:ss a"), Locale.US));
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        Date date;
        Time time;
        Date dateB;
        switch (this.a) {
            case 0:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS0 = z71Var.s0();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.b).parse(strS0);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e2) {
                    fo.l(az2.q("Failed parsing '", strS0, "' as SQL Date; at path "), z71Var.g0(), e2);
                    return null;
                }
            case 1:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS1 = z71Var.s0();
                try {
                    synchronized (this) {
                        try {
                            time = new Time(((SimpleDateFormat) this.b).parse(strS1).getTime());
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return time;
                } catch (ParseException e3) {
                    fo.l(az2.q("Failed parsing '", strS1, "' as SQL Time; at path "), z71Var.g0(), e3);
                    return null;
                }
            default:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS2 = z71Var.s0();
                synchronized (((ArrayList) this.b)) {
                    try {
                        ArrayList arrayList = (ArrayList) this.b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            try {
                                dateB = ((DateFormat) obj).parse(strS2);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateB = i01.b(strS2, new ParsePosition(0));
                        } catch (ParseException e4) {
                            fo.l(az2.q("Failed parsing '", strS2, "' as Date; at path "), z71Var.g0(), e4);
                            return null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return dateB;
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    i81Var.f0();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.b).format((Date) date);
                    break;
                }
                i81Var.m0(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    i81Var.f0();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.b).format((Date) time);
                    break;
                }
                i81Var.m0(str2);
                return;
            default:
                Date date2 = (Date) obj;
                if (date2 == null) {
                    i81Var.f0();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str3 = dateFormat.format(date2);
                    break;
                }
                i81Var.m0(str3);
                return;
        }
    }
}
