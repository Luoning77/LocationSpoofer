package io.github.libxposed.service;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HookedTarget {
    private final long mLoadedVersionCode;
    private final int mPid;
    private final String mProcessName;
    private final State mState;
    final long mTargetId;
    private final int mUid;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public enum State {
        UP_TO_DATE,
        STALE,
        RELOADING,
        FAILED
    }

    public HookedTarget(long j, int i, int i2, String str, State state, long j2) {
        this.mTargetId = j;
        this.mUid = i;
        this.mPid = i2;
        Objects.requireNonNull(str);
        this.mProcessName = str;
        Objects.requireNonNull(state);
        this.mState = state;
        this.mLoadedVersionCode = j2;
    }

    public long getLoadedVersionCode() {
        return this.mLoadedVersionCode;
    }

    public int getPid() {
        return this.mPid;
    }

    public String getProcessName() {
        return this.mProcessName;
    }

    public State getState() {
        return this.mState;
    }

    public int getUid() {
        return this.mUid;
    }
}
