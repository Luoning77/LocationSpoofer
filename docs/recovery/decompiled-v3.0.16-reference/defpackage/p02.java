package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p02 extends rd3 {
    public static final o02 b = new o02(new p02(0), 0);
    public final /* synthetic */ int a;

    public /* synthetic */ p02(int i) {
        this.a = i;
    }

    public static JsonElement a(z71 z71Var, int i) {
        int iZ = az2.z(i);
        if (iZ == 5) {
            return new JsonPrimitive(z71Var.s0());
        }
        if (iZ == 6) {
            return new JsonPrimitive(new yb1(z71Var.s0()));
        }
        if (iZ == 7) {
            return new JsonPrimitive(Boolean.valueOf(z71Var.k0()));
        }
        if (iZ == 8) {
            z71Var.q0();
            return r71.e;
        }
        fo.n("Unexpected token: ".concat(az2.A(i)));
        return null;
    }

    public static void b(i81 i81Var, JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            i81Var.f0();
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                i81Var.l0(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                i81Var.n0(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                i81Var.m0(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement.isJsonArray()) {
            i81Var.F();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                b(i81Var, it.next());
            }
            i81Var.U();
            return;
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
        }
        i81Var.O();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            i81Var.d0(entry.getKey());
            b(i81Var, entry.getValue());
        }
        i81Var.c0();
    }

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) {
        JsonElement jsonArray;
        JsonElement jsonArray2;
        boolean zK0;
        switch (this.a) {
            case 0:
                int iU0 = z71Var.u0();
                int iZ = az2.z(iU0);
                if (iZ == 5 || iZ == 6) {
                    return new yb1(z71Var.s0());
                }
                if (iZ == 8) {
                    z71Var.q0();
                    return null;
                }
                throw new l71("Expecting number, got: " + az2.A(iU0) + "; at path " + z71Var.e0());
            case 1:
                if (z71Var.u0() != 9) {
                    return Double.valueOf(z71Var.l0());
                }
                z71Var.q0();
                return null;
            case 2:
                if (z71Var.u0() != 9) {
                    return Float.valueOf((float) z71Var.l0());
                }
                z71Var.q0();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                z71Var.A();
                while (z71Var.h0()) {
                    try {
                        arrayList.add(Integer.valueOf(z71Var.m0()));
                    } catch (NumberFormatException e) {
                        throw new l71(e);
                    }
                }
                z71Var.U();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                try {
                    return Long.valueOf(z71Var.n0());
                } catch (NumberFormatException e2) {
                    throw new l71(e2);
                }
            case Logger.WARN /* 5 */:
                if (z71Var.u0() != 9) {
                    return Float.valueOf((float) z71Var.l0());
                }
                z71Var.q0();
                return null;
            case Logger.ERROR /* 6 */:
                if (z71Var.u0() != 9) {
                    return Double.valueOf(z71Var.l0());
                }
                z71Var.q0();
                return null;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS0 = z71Var.s0();
                if (strS0.length() == 1) {
                    return Character.valueOf(strS0.charAt(0));
                }
                StringBuilder sbQ = az2.q("Expecting character, got: ", strS0, "; at ");
                sbQ.append(z71Var.g0());
                throw new l71(sbQ.toString());
            case 8:
                int iU1 = z71Var.u0();
                if (iU1 != 9) {
                    return iU1 == 8 ? Boolean.toString(z71Var.k0()) : z71Var.s0();
                }
                z71Var.q0();
                return null;
            case mc0.b /* 9 */:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS1 = z71Var.s0();
                try {
                    return new BigDecimal(strS1);
                } catch (NumberFormatException e3) {
                    fo.l(az2.q("Failed parsing '", strS1, "' as BigDecimal; at path "), z71Var.g0(), e3);
                    return null;
                }
            case mc0.c /* 10 */:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS2 = z71Var.s0();
                try {
                    return new BigInteger(strS2);
                } catch (NumberFormatException e4) {
                    fo.l(az2.q("Failed parsing '", strS2, "' as BigInteger; at path "), z71Var.g0(), e4);
                    return null;
                }
            case 11:
                if (z71Var.u0() != 9) {
                    return new yb1(z71Var.s0());
                }
                z71Var.q0();
                return null;
            case mc0.d /* 12 */:
                if (z71Var.u0() != 9) {
                    return new StringBuilder(z71Var.s0());
                }
                z71Var.q0();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (z71Var.u0() != 9) {
                    return new StringBuffer(z71Var.s0());
                }
                z71Var.q0();
                return null;
            case a83.e /* 15 */:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS3 = z71Var.s0();
                if ("null".equals(strS3)) {
                    return null;
                }
                return new URL(strS3);
            case 16:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                try {
                    String strS4 = z71Var.s0();
                    if ("null".equals(strS4)) {
                        return null;
                    }
                    return new URI(strS4);
                } catch (URISyntaxException e5) {
                    throw new l71(e5);
                }
            case 17:
                if (z71Var.u0() != 9) {
                    return InetAddress.getByName(z71Var.s0());
                }
                z71Var.q0();
                return null;
            case 18:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                String strS5 = z71Var.s0();
                try {
                    return UUID.fromString(strS5);
                } catch (IllegalArgumentException e6) {
                    fo.l(az2.q("Failed parsing '", strS5, "' as UUID; at path "), z71Var.g0(), e6);
                    return null;
                }
            case 19:
                String strS6 = z71Var.s0();
                try {
                    return Currency.getInstance(strS6);
                } catch (IllegalArgumentException e7) {
                    fo.l(az2.q("Failed parsing '", strS6, "' as Currency; at path "), z71Var.g0(), e7);
                    return null;
                }
            case 20:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                z71Var.F();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (z71Var.u0() != 4) {
                    String strO0 = z71Var.o0();
                    int iM0 = z71Var.m0();
                    if ("year".equals(strO0)) {
                        i2 = iM0;
                    } else if ("month".equals(strO0)) {
                        i3 = iM0;
                    } else if ("dayOfMonth".equals(strO0)) {
                        i4 = iM0;
                    } else if ("hourOfDay".equals(strO0)) {
                        i5 = iM0;
                    } else if ("minute".equals(strO0)) {
                        i6 = iM0;
                    } else if ("second".equals(strO0)) {
                        i7 = iM0;
                    }
                }
                z71Var.c0();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            case 21:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(z71Var.s0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                if (z71Var instanceof f81) {
                    f81 f81Var = (f81) z71Var;
                    int iU2 = f81Var.u0();
                    if (iU2 == 5 || iU2 == 2 || iU2 == 4 || iU2 == 10) {
                        fo.h(az2.A(iU2), "Unexpected ", " when reading a JsonElement.");
                        return null;
                    }
                    JsonElement jsonElement = (JsonElement) f81Var.G0();
                    f81Var.A0();
                    return jsonElement;
                }
                int iU3 = z71Var.u0();
                int iZ2 = az2.z(iU3);
                if (iZ2 == 0) {
                    z71Var.A();
                    jsonArray = new JsonArray();
                } else if (iZ2 != 2) {
                    jsonArray = null;
                } else {
                    z71Var.F();
                    jsonArray = new JsonObject();
                }
                if (jsonArray == null) {
                    return a(z71Var, iU3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (z71Var.h0()) {
                        String strO1 = jsonArray instanceof JsonObject ? z71Var.o0() : null;
                        int iU4 = z71Var.u0();
                        int iZ3 = az2.z(iU4);
                        if (iZ3 == 0) {
                            z71Var.A();
                            jsonArray2 = new JsonArray();
                        } else if (iZ3 != 2) {
                            jsonArray2 = null;
                        } else {
                            z71Var.F();
                            jsonArray2 = new JsonObject();
                        }
                        boolean z = jsonArray2 != null;
                        if (jsonArray2 == null) {
                            jsonArray2 = a(z71Var, iU4);
                        }
                        if (jsonArray instanceof JsonArray) {
                            ((JsonArray) jsonArray).add(jsonArray2);
                        } else {
                            ((JsonObject) jsonArray).add(strO1, jsonArray2);
                        }
                        if (z) {
                            arrayDeque.addLast(jsonArray);
                            jsonArray = jsonArray2;
                        }
                    } else {
                        if (jsonArray instanceof JsonArray) {
                            z71Var.U();
                        } else {
                            z71Var.c0();
                        }
                        if (arrayDeque.isEmpty()) {
                            return jsonArray;
                        }
                        jsonArray = (JsonElement) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                z71Var.A();
                int iU5 = z71Var.u0();
                int i8 = 0;
                while (iU5 != 2) {
                    int iZ4 = az2.z(iU5);
                    if (iZ4 == 5 || iZ4 == 6) {
                        int iM1 = z71Var.m0();
                        if (iM1 == 0) {
                            zK0 = false;
                        } else {
                            if (iM1 != 1) {
                                StringBuilder sbR = p91.r(iM1, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbR.append(z71Var.g0());
                                throw new l71(sbR.toString());
                            }
                            zK0 = true;
                        }
                    } else {
                        if (iZ4 != 7) {
                            throw new l71("Invalid bitset value type: " + az2.A(iU5) + "; at path " + z71Var.e0());
                        }
                        zK0 = z71Var.k0();
                    }
                    if (zK0) {
                        bitSet.set(i8);
                    }
                    i8++;
                    iU5 = z71Var.u0();
                }
                z71Var.U();
                return bitSet;
            case 24:
                int iU6 = z71Var.u0();
                if (iU6 != 9) {
                    return iU6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(z71Var.s0())) : Boolean.valueOf(z71Var.k0());
                }
                z71Var.q0();
                return null;
            case 25:
                if (z71Var.u0() != 9) {
                    return Boolean.valueOf(z71Var.s0());
                }
                z71Var.q0();
                return null;
            case 26:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                try {
                    int iM2 = z71Var.m0();
                    if (iM2 <= 255 && iM2 >= -128) {
                        return Byte.valueOf((byte) iM2);
                    }
                    StringBuilder sbR2 = p91.r(iM2, "Lossy conversion from ", " to byte; at path ");
                    sbR2.append(z71Var.g0());
                    throw new l71(sbR2.toString());
                } catch (NumberFormatException e8) {
                    throw new l71(e8);
                }
            case 27:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                try {
                    int iM3 = z71Var.m0();
                    if (iM3 <= 65535 && iM3 >= -32768) {
                        return Short.valueOf((short) iM3);
                    }
                    StringBuilder sbR3 = p91.r(iM3, "Lossy conversion from ", " to short; at path ");
                    sbR3.append(z71Var.g0());
                    throw new l71(sbR3.toString());
                } catch (NumberFormatException e9) {
                    throw new l71(e9);
                }
            default:
                if (z71Var.u0() == 9) {
                    z71Var.q0();
                    return null;
                }
                try {
                    return Integer.valueOf(z71Var.m0());
                } catch (NumberFormatException e10) {
                    throw new l71(e10);
                }
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        int i = 0;
        switch (this.a) {
            case 0:
                i81Var.l0((Number) obj);
                return;
            case 1:
                Number number = (Number) obj;
                if (number == null) {
                    i81Var.f0();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                zw0.a(dDoubleValue);
                i81Var.i0(dDoubleValue);
                return;
            case 2:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    i81Var.f0();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                zw0.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                i81Var.l0(numberValueOf);
                return;
            case 3:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                i81Var.F();
                int length = atomicIntegerArray.length();
                while (i < length) {
                    i81Var.j0(atomicIntegerArray.get(i));
                    i++;
                }
                i81Var.U();
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    i81Var.f0();
                    return;
                } else {
                    i81Var.j0(number2.longValue());
                    return;
                }
            case Logger.WARN /* 5 */:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    i81Var.f0();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                i81Var.l0(numberValueOf2);
                return;
            case Logger.ERROR /* 6 */:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    i81Var.f0();
                    return;
                } else {
                    i81Var.i0(number3.doubleValue());
                    return;
                }
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                Character ch = (Character) obj;
                i81Var.m0(ch != null ? String.valueOf(ch) : null);
                return;
            case 8:
                i81Var.m0((String) obj);
                return;
            case mc0.b /* 9 */:
                i81Var.l0((BigDecimal) obj);
                return;
            case mc0.c /* 10 */:
                i81Var.l0((BigInteger) obj);
                return;
            case 11:
                i81Var.l0((yb1) obj);
                return;
            case mc0.d /* 12 */:
                StringBuilder sb = (StringBuilder) obj;
                i81Var.m0(sb != null ? sb.toString() : null);
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                i81Var.m0(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case a83.e /* 15 */:
                URL url = (URL) obj;
                i81Var.m0(url != null ? url.toExternalForm() : null);
                return;
            case 16:
                URI uri = (URI) obj;
                i81Var.m0(uri != null ? uri.toASCIIString() : null);
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                i81Var.m0(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case 18:
                UUID uuid = (UUID) obj;
                i81Var.m0(uuid != null ? uuid.toString() : null);
                return;
            case 19:
                i81Var.m0(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    i81Var.f0();
                    return;
                }
                i81Var.O();
                i81Var.d0("year");
                i81Var.j0(calendar.get(1));
                i81Var.d0("month");
                i81Var.j0(calendar.get(2));
                i81Var.d0("dayOfMonth");
                i81Var.j0(calendar.get(5));
                i81Var.d0("hourOfDay");
                i81Var.j0(calendar.get(11));
                i81Var.d0("minute");
                i81Var.j0(calendar.get(12));
                i81Var.d0("second");
                i81Var.j0(calendar.get(13));
                i81Var.c0();
                return;
            case 21:
                Locale locale = (Locale) obj;
                i81Var.m0(locale != null ? locale.toString() : null);
                return;
            case 22:
                b(i81Var, (JsonElement) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                i81Var.F();
                int length2 = bitSet.length();
                while (i < length2) {
                    i81Var.j0(bitSet.get(i) ? 1L : 0L);
                    i++;
                }
                i81Var.U();
                return;
            case 24:
                i81Var.k0((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                i81Var.m0(bool == null ? "null" : bool.toString());
                return;
            case 26:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    i81Var.f0();
                    return;
                } else {
                    i81Var.j0(number4.byteValue());
                    return;
                }
            case 27:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    i81Var.f0();
                    return;
                } else {
                    i81Var.j0(number5.shortValue());
                    return;
                }
            default:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    i81Var.f0();
                    return;
                } else {
                    i81Var.j0(number6.intValue());
                    return;
                }
        }
    }
}
