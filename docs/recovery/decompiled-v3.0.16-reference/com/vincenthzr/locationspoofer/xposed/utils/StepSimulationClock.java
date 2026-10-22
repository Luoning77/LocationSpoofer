package com.vincenthzr.locationspoofer.xposed.utils;

import defpackage.ca0;
import defpackage.mh0;
import defpackage.p91;
import defpackage.rv1;
import defpackage.sv1;
import defpackage.yo;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class StepSimulationClock {
    public static final Companion Companion = new Companion(null);
    private long anchor;
    private double base;
    private long lastNow;
    private Program program;
    private long resumeAt;
    private double steps;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Program {
        private final boolean auto;
        private final int cadence;
        private final int fluctuation;
        private final int level;
        private final boolean moving;
        private final double speed;
        private final long start;

        public Program(long j, double d, int i, boolean z, int i2, int i3, boolean z2) {
            this.start = j;
            this.speed = d;
            this.cadence = i;
            this.auto = z;
            this.level = i2;
            this.fluctuation = i3;
            this.moving = z2;
        }

        public static /* synthetic */ Program copy$default(Program program, long j, double d, int i, boolean z, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j = program.start;
            }
            long j2 = j;
            if ((i4 & 2) != 0) {
                d = program.speed;
            }
            double d2 = d;
            if ((i4 & 4) != 0) {
                i = program.cadence;
            }
            return program.copy(j2, d2, i, (i4 & 8) != 0 ? program.auto : z, (i4 & 16) != 0 ? program.level : i2, (i4 & 32) != 0 ? program.fluctuation : i3, (i4 & 64) != 0 ? program.moving : z2);
        }

        public final long component1() {
            return this.start;
        }

        public final double component2() {
            return this.speed;
        }

        public final int component3() {
            return this.cadence;
        }

        public final boolean component4() {
            return this.auto;
        }

        public final int component5() {
            return this.level;
        }

        public final int component6() {
            return this.fluctuation;
        }

        public final boolean component7() {
            return this.moving;
        }

        public final Program copy(long j, double d, int i, boolean z, int i2, int i3, boolean z2) {
            return new Program(j, d, i, z, i2, i3, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Program)) {
                return false;
            }
            Program program = (Program) obj;
            return this.start == program.start && Double.compare(this.speed, program.speed) == 0 && this.cadence == program.cadence && this.auto == program.auto && this.level == program.level && this.fluctuation == program.fluctuation && this.moving == program.moving;
        }

        public final boolean getAuto() {
            return this.auto;
        }

        public final int getCadence() {
            return this.cadence;
        }

        public final int getFluctuation() {
            return this.fluctuation;
        }

        public final int getLevel() {
            return this.level;
        }

        public final boolean getMoving() {
            return this.moving;
        }

        public final double getSpeed() {
            return this.speed;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Boolean.hashCode(this.moving) + p91.b(this.fluctuation, p91.b(this.level, p91.e(p91.b(this.cadence, p91.a(this.speed, Long.hashCode(this.start) * 31, 31), 31), 31, this.auto), 31), 31);
        }

        public final Object[] save() {
            return new Object[]{Long.valueOf(this.start), Double.valueOf(this.speed), Integer.valueOf(this.cadence), Boolean.valueOf(this.auto), Integer.valueOf(this.level), Integer.valueOf(this.fluctuation), Boolean.valueOf(this.moving)};
        }

        public final double stepsAt(long j) {
            if (!this.moving) {
                return 0.0d;
            }
            long j2 = this.start;
            long j3 = j - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            double d = j3 / 1000.0d;
            if (!this.auto) {
                return (((double) this.cadence) * d) / 60.0d;
            }
            rv1 rv1Var = sv1.a;
            rv1 rv1VarC = sv1.c(this.level, this.fluctuation, j2);
            return ((rv1VarC.f.u(d) * rv1VarC.b.f) + (rv1VarC.e.u(d) * rv1VarC.d * 0.4d) + d) * (((double) this.cadence) / 60.0d);
        }

        public String toString() {
            return "Program(start=" + this.start + ", speed=" + this.speed + ", cadence=" + this.cadence + ", auto=" + this.auto + ", level=" + this.level + ", fluctuation=" + this.fluctuation + ", moving=" + this.moving + ")";
        }
    }

    public /* synthetic */ StepSimulationClock(double d, long j, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? 2350.0d : d, (i & 2) != 0 ? 0L : j);
    }

    private final void advance(Program program, long j) {
        this.steps = Math.max(this.steps, (this.base + program.stepsAt(j)) - program.stepsAt(this.anchor));
    }

    public final synchronized void restore(Object[] objArr) {
        Program program;
        try {
            objArr.getClass();
            Object obj = objArr[0];
            Object[] objArr2 = obj instanceof Object[] ? (Object[]) obj : null;
            if (objArr2 != null) {
                Object obj2 = objArr2[0];
                obj2.getClass();
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = objArr2[1];
                obj3.getClass();
                double dDoubleValue = ((Double) obj3).doubleValue();
                Object obj4 = objArr2[2];
                obj4.getClass();
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = objArr2[3];
                obj5.getClass();
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                Object obj6 = objArr2[4];
                obj6.getClass();
                int iIntValue2 = ((Integer) obj6).intValue();
                Object obj7 = objArr2[5];
                obj7.getClass();
                int iIntValue3 = ((Integer) obj7).intValue();
                Object obj8 = objArr2[6];
                obj8.getClass();
                program = new Program(jLongValue, dDoubleValue, iIntValue, zBooleanValue, iIntValue2, iIntValue3, ((Boolean) obj8).booleanValue());
            } else {
                program = null;
            }
            this.program = program;
            Object obj9 = objArr[1];
            obj9.getClass();
            this.base = ((Double) obj9).doubleValue();
            Object obj10 = objArr[2];
            obj10.getClass();
            this.steps = ((Double) obj10).doubleValue();
            Object obj11 = objArr[3];
            obj11.getClass();
            this.anchor = ((Long) obj11).longValue();
            Object obj12 = objArr[4];
            obj12.getClass();
            this.lastNow = ((Long) obj12).longValue();
            Object objX0 = yo.x0(objArr, 5);
            Long l = objX0 instanceof Long ? (Long) objX0 : null;
            this.resumeAt = l != null ? l.longValue() : 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object[] save() {
        Program program;
        try {
            program = this.program;
        } catch (Throwable th) {
            throw th;
        }
        return new Object[]{program != null ? program.save() : null, Double.valueOf(this.base), Double.valueOf(this.steps), Long.valueOf(this.anchor), Long.valueOf(this.lastNow), Long.valueOf(this.resumeAt)};
    }

    public final synchronized double steps(JSONObject jSONObject, long j) {
        long jMax;
        try {
            jSONObject.getClass();
            long jOptLong = jSONObject.optLong("start_timestamp", 0L);
            if (jOptLong > 0 && j >= this.lastNow) {
                Program program = this.program;
                if (jOptLong >= (program != null ? program.getStart() : jOptLong)) {
                    Double dValueOf = Double.valueOf(jSONObject.optDouble("speed_m_s", 0.0d));
                    if (Math.abs(dValueOf.doubleValue()) > Double.MAX_VALUE) {
                        dValueOf = null;
                    }
                    double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                    boolean zOptBoolean = jSONObject.optBoolean("is_auto_cadence", true);
                    Program program2 = new Program(jOptLong, dDoubleValue, zOptBoolean ? Companion.autoCadence(dDoubleValue) : mh0.v(jSONObject.optInt("step_cadence_spm", 165), 60, 240), zOptBoolean, jSONObject.optInt("realism_level", 0), jSONObject.optInt("speed_fluctuation_pct", 0), dDoubleValue > 0.05d && jSONObject.optBoolean("active", true) && jSONObject.optBoolean("enable_step_simulation", true));
                    if (!program2.equals(this.program)) {
                        Program program3 = this.program;
                        if (program3 != null) {
                            advance(program3, program2.getStart() == program3.getStart() ? j : Math.min(j, program2.getStart()));
                        }
                        this.base = this.steps;
                        Program program4 = this.program;
                        if (program4 == null || program4.getStart() != program2.getStart()) {
                            jMax = Math.max(program2.getStart(), this.program == null ? this.resumeAt : 0L);
                        } else {
                            jMax = j;
                        }
                        this.anchor = jMax;
                        this.program = program2;
                    }
                    advance(program2, j);
                    this.lastNow = j;
                    return this.steps;
                }
            }
            return this.steps;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final int autoCadence(double d) {
            double d2;
            double d3;
            if (d <= 0.8d) {
                return 95;
            }
            if (d <= 1.5d) {
                d2 = ((d - 0.8d) / 0.7d) * 25.0d;
                d3 = 100.0d;
            } else if (d <= 2.8d) {
                d2 = ((d - 1.5d) / 1.3d) * 25.0d;
                d3 = 135.0d;
            } else if (d <= 4.0d) {
                d2 = ((d - 2.8d) / 1.2d) * 20.0d;
                d3 = 160.0d;
            } else {
                if (d > 5.5d) {
                    return 200;
                }
                d2 = ((d - 4.0d) / 1.5d) * 15.0d;
                d3 = 180.0d;
            }
            return (int) (d2 + d3);
        }

        private Companion() {
        }
    }

    public StepSimulationClock(double d, long j) {
        this.resumeAt = j;
        this.base = d;
        this.steps = d;
    }

    public StepSimulationClock() {
        this(0.0d, 0L, 3, null);
    }
}
