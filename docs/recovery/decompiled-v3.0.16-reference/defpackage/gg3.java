package defpackage;

import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class gg3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ UpdateArtifact g;
    public final /* synthetic */ GithubRelease h;

    public /* synthetic */ gg3(pu0 pu0Var, UpdateArtifact updateArtifact, GithubRelease githubRelease, int i) {
        this.e = i;
        this.f = pu0Var;
        this.g = updateArtifact;
        this.h = githubRelease;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        GithubRelease githubRelease = this.h;
        UpdateArtifact updateArtifact = this.g;
        pu0 pu0Var = this.f;
        switch (i) {
            case 0:
                pu0Var.invoke(updateArtifact.getPath(), githubRelease.getVersionName());
                break;
            default:
                pu0Var.invoke(updateArtifact.getPath(), githubRelease.getVersionName());
                break;
        }
        return mf3Var;
    }
}
