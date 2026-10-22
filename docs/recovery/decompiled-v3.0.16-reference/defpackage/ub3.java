package defpackage;

import java.util.List;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ub3 extends e02 {
    public final Channel f;
    public Job g;

    public ub3(wo2 wo2Var, o10 o10Var, xb0 xb0Var) {
        super(wo2Var, o10Var, xb0Var);
        this.f = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sb3 e(Channel channel) {
        sb3 sb3Var = null;
        vs2 vs2VarV = dh0.v(new nr0(new yv1(channel, 1), 0 == true ? 1 : 0, 2));
        while (vs2VarV.hasNext()) {
            sb3 sb3VarA = (sb3) vs2VarV.next();
            if (sb3Var != null) {
                sb3VarA = sb3Var.a(sb3VarA);
            }
            sb3Var = sb3VarA;
        }
        return sb3Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r16.b.invoke(r0, r6) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.wo2 r17, defpackage.sb3 r18, defpackage.r60 r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub3.c(wo2, sb3, r60):java.lang.Object");
    }

    public final boolean d(p92 p92Var) {
        boolean z;
        boolean z2;
        boolean z3;
        Channel channel;
        wo2 wo2Var;
        x92 x92Var = (x92) zy.o0(p92Var.a);
        if (x92Var != null) {
            List list = x92Var.m;
            if (list == null) {
                list = uj0.e;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                channel = this.f;
                wo2Var = this.a;
                if (i >= size) {
                    break;
                }
                vx0 vx0Var = (vx0) list.get(i);
                long j = vx0Var.d ^ (-9223372034707292160L);
                if (!(wo2Var.i(wo2Var.e(j)) == 0.0f)) {
                    z3 = ChannelResult.m56isSuccessimpl(channel.mo32trySendJP2dKIU(new sb3(j, vx0Var.a, false))) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = x92Var.l ^ (-9223372034707292160L);
            boolean z4 = p92Var.f == 12;
            if (!(wo2Var.i(wo2Var.e(j2)) == 0.0f) || z4) {
                if (ChannelResult.m56isSuccessimpl(channel.mo32trySendJP2dKIU(new sb3(j2, x92Var.b, z4))) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
