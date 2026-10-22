package org.maplibre.android.maps;

import defpackage.jp1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class NativeMapOptions {
    private final boolean actionJournalEnabled;
    private final long actionJournalLogFileCount;
    private final long actionJournalLogFileSize;
    private final String actionJournalPath;
    private final int actionJournalRenderingReportInterval;
    private final boolean asyncRendererCleanup;
    private final boolean crossSourceCollisions;
    private final boolean fastPFOREnabled;
    private final float pixelRatio;

    public NativeMapOptions(jp1 jp1Var) {
        this.pixelRatio = jp1Var.N;
        this.crossSourceCollisions = jp1Var.O;
        this.actionJournalEnabled = jp1Var.P;
        this.actionJournalPath = jp1Var.Q;
        this.actionJournalLogFileSize = jp1Var.R;
        this.actionJournalLogFileCount = jp1Var.S;
        this.actionJournalRenderingReportInterval = jp1Var.T;
        this.asyncRendererCleanup = jp1Var.U;
        this.fastPFOREnabled = jp1Var.V;
    }

    public boolean actionJournalEnabled() {
        return this.actionJournalEnabled;
    }

    public long actionJournalLogFileCount() {
        return this.actionJournalLogFileCount;
    }

    public long actionJournalLogFileSize() {
        return this.actionJournalLogFileSize;
    }

    public String actionJournalPath() {
        return this.actionJournalPath;
    }

    public int actionJournalRenderingReportInterval() {
        return this.actionJournalRenderingReportInterval;
    }

    public boolean asyncRendererCleanup() {
        return this.asyncRendererCleanup;
    }

    public boolean crossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public boolean fastPFOREnabled() {
        return this.fastPFOREnabled;
    }

    public float pixelRatio() {
        return this.pixelRatio;
    }

    public NativeMapOptions(float f, boolean z) {
        this.pixelRatio = f;
        this.crossSourceCollisions = z;
        this.actionJournalEnabled = false;
        this.actionJournalPath = "";
        this.actionJournalLogFileSize = 0L;
        this.actionJournalLogFileCount = 0L;
        this.actionJournalRenderingReportInterval = 0;
        this.asyncRendererCleanup = false;
        this.fastPFOREnabled = false;
    }
}
