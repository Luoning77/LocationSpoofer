package io.github.libxposed.service;

import defpackage.p91;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HotReloadResult extends p91 {
    private final String message;
    private final Status status;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public enum Status {
        SUCCEEDED,
        FAILED,
        UNSUPPORTED,
        IN_PROGRESS,
        PROCESS_DIED
    }

    public HotReloadResult(Status status, String str) {
        this.status = status;
        this.message = str;
    }

    public static HotReloadResult from(int i, String str) {
        Status status;
        if (i == 0) {
            status = Status.SUCCEEDED;
        } else if (i == 1) {
            status = Status.FAILED;
        } else if (i == 2) {
            status = Status.UNSUPPORTED;
        } else if (i == 3) {
            status = Status.IN_PROGRESS;
        } else {
            if (i != 4) {
                throw new XposedService.ServiceException(p91.l(i, "Invalid hot reload status code: "));
            }
            status = Status.PROCESS_DIED;
        }
        return new HotReloadResult(status, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HotReloadResult)) {
            return false;
        }
        HotReloadResult hotReloadResult = (HotReloadResult) obj;
        return Objects.equals(this.status, hotReloadResult.status) && Objects.equals(this.message, hotReloadResult.message);
    }

    public final int hashCode() {
        Status status = this.status;
        String str = this.message;
        return Objects.hashCode(str) + (Objects.hashCode(status) * 31);
    }

    public String message() {
        return this.message;
    }

    public Status status() {
        return this.status;
    }

    public final String toString() {
        Object[] objArr = {this.status, this.message};
        String[] strArrSplit = "status;message".length() == 0 ? new String[0] : "status;message".split(";");
        StringBuilder sb = new StringBuilder("HotReloadResult[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
