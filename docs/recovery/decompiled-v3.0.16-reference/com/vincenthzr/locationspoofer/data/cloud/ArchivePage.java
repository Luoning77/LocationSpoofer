package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ArchivePage {
    private final List<CloudArchive> items;
    private final int page;
    private final int total;

    public ArchivePage(List<CloudArchive> list, int i, int i2) {
        list.getClass();
        this.items = list;
        this.page = i;
        this.total = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArchivePage copy$default(ArchivePage archivePage, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = archivePage.items;
        }
        if ((i3 & 2) != 0) {
            i = archivePage.page;
        }
        if ((i3 & 4) != 0) {
            i2 = archivePage.total;
        }
        return archivePage.copy(list, i, i2);
    }

    public final List<CloudArchive> component1() {
        return this.items;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.total;
    }

    public final ArchivePage copy(List<CloudArchive> list, int i, int i2) {
        list.getClass();
        return new ArchivePage(list, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArchivePage)) {
            return false;
        }
        ArchivePage archivePage = (ArchivePage) obj;
        return o51.f(this.items, archivePage.items) && this.page == archivePage.page && this.total == archivePage.total;
    }

    public final List<CloudArchive> getItems() {
        return this.items;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + p91.b(this.page, this.items.hashCode() * 31, 31);
    }

    public String toString() {
        return "ArchivePage(items=" + this.items + ", page=" + this.page + ", total=" + this.total + ")";
    }
}
