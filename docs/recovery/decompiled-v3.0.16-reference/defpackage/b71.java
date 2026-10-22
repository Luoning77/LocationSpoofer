package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b71 extends sb {
    public final fk n0;

    public b71(fk fkVar, t61 t61Var) {
        this.n0 = fkVar;
    }

    @Override // defpackage.sb, defpackage.w90
    public final long d() {
        fk fkVar = this.n0;
        String strK = fkVar.k();
        try {
            strK.getClass();
            ye3 ye3VarE = r93.e(strK);
            if (ye3VarE != null) {
                return ye3VarE.e;
            }
            s13.U(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'ULong' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }

    @Override // defpackage.l30
    public final int j(bt2 bt2Var) {
        bt2Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.sb, defpackage.w90
    public final int o() {
        fk fkVar = this.n0;
        String strK = fkVar.k();
        try {
            strK.getClass();
            te3 te3VarD = r93.d(strK);
            if (te3VarD != null) {
                return te3VarD.e;
            }
            s13.U(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'UInt' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }

    @Override // defpackage.sb, defpackage.w90
    public final byte r() {
        oe3 oe3Var;
        fk fkVar = this.n0;
        String strK = fkVar.k();
        try {
            strK.getClass();
            te3 te3VarD = r93.d(strK);
            if (te3VarD != null) {
                int i = te3VarD.e;
                oe3Var = Integer.compareUnsigned(i, 255) > 0 ? null : new oe3((byte) i);
            }
            if (oe3Var != null) {
                return oe3Var.e;
            }
            s13.U(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'UByte' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }

    @Override // defpackage.sb, defpackage.w90
    public final short w() {
        df3 df3Var;
        fk fkVar = this.n0;
        String strK = fkVar.k();
        try {
            strK.getClass();
            te3 te3VarD = r93.d(strK);
            if (te3VarD != null) {
                int i = te3VarD.e;
                df3Var = Integer.compareUnsigned(i, 65535) > 0 ? null : new df3((short) i);
            }
            if (df3Var != null) {
                return df3Var.e;
            }
            s13.U(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            fk.n(fkVar, p91.p("Failed to parse type 'UShort' for input '", strK, '\''), 0, 6);
            throw null;
        }
    }
}
