package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete e;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.e = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.e;
        if (searchAutoComplete.k) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.k = false;
        }
    }
}
