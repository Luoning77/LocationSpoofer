package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eb extends t1 {
    public final /* synthetic */ jb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(jb jbVar) {
        super(0);
        this.g = jbVar;
    }

    @Override // defpackage.t1
    public final void r(int i, r1 r1Var, String str, Bundle bundle) {
        this.g.e(i, r1Var, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x024a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0253  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02db  */
    /* JADX WARN: Code duplicated, block: B:132:0x02de  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:140:0x0301  */
    /* JADX WARN: Code duplicated, block: B:142:0x030b  */
    /* JADX WARN: Code duplicated, block: B:145:0x031c  */
    /* JADX WARN: Code duplicated, block: B:148:0x034f  */
    /* JADX WARN: Code duplicated, block: B:151:0x035a  */
    /* JADX WARN: Code duplicated, block: B:153:0x036a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0388  */
    /* JADX WARN: Code duplicated, block: B:162:0x0390  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a2 A[LOOP:3: B:161:0x038e->B:164:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:181:0x040c  */
    /* JADX WARN: Code duplicated, block: B:185:0x042f  */
    /* JADX WARN: Code duplicated, block: B:187:0x043d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0444  */
    /* JADX WARN: Code duplicated, block: B:191:0x0458  */
    /* JADX WARN: Code duplicated, block: B:193:0x046a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0474  */
    /* JADX WARN: Code duplicated, block: B:197:0x0484  */
    /* JADX WARN: Code duplicated, block: B:200:0x0492  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:214:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:219:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:222:0x0503  */
    /* JADX WARN: Code duplicated, block: B:225:0x050f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0515  */
    /* JADX WARN: Code duplicated, block: B:230:0x051b  */
    /* JADX WARN: Code duplicated, block: B:231:0x051f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0526  */
    /* JADX WARN: Code duplicated, block: B:236:0x0530  */
    /* JADX WARN: Code duplicated, block: B:241:0x0542  */
    /* JADX WARN: Code duplicated, block: B:243:0x054a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0550  */
    /* JADX WARN: Code duplicated, block: B:247:0x0557  */
    /* JADX WARN: Code duplicated, block: B:251:0x0564  */
    /* JADX WARN: Code duplicated, block: B:254:0x056a  */
    /* JADX WARN: Code duplicated, block: B:256:0x056d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0584 A[LOOP:7: B:255:0x056b->B:259:0x0584, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:262:0x058c  */
    /* JADX WARN: Code duplicated, block: B:265:0x0597  */
    /* JADX WARN: Code duplicated, block: B:268:0x059f  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:272:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:275:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:278:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:280:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:286:0x05df  */
    /* JADX WARN: Code duplicated, block: B:287:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:290:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:293:0x060e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0614  */
    /* JADX WARN: Code duplicated, block: B:297:0x0619  */
    /* JADX WARN: Code duplicated, block: B:300:0x0633  */
    /* JADX WARN: Code duplicated, block: B:302:0x0646  */
    /* JADX WARN: Code duplicated, block: B:304:0x0650  */
    /* JADX WARN: Code duplicated, block: B:305:0x0657  */
    /* JADX WARN: Code duplicated, block: B:308:0x0668  */
    /* JADX WARN: Code duplicated, block: B:309:0x0670  */
    /* JADX WARN: Code duplicated, block: B:312:0x067b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0680  */
    /* JADX WARN: Code duplicated, block: B:316:0x0689  */
    /* JADX WARN: Code duplicated, block: B:318:0x068d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:320:0x0698  */
    /* JADX WARN: Code duplicated, block: B:323:0x069e  */
    /* JADX WARN: Code duplicated, block: B:325:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:329:0x06af  */
    /* JADX WARN: Code duplicated, block: B:332:0x06b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:339:0x06c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:343:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:346:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:351:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:354:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:356:0x0702  */
    /* JADX WARN: Code duplicated, block: B:359:0x0719  */
    /* JADX WARN: Code duplicated, block: B:362:0x072b  */
    /* JADX WARN: Code duplicated, block: B:364:0x0735  */
    /* JADX WARN: Code duplicated, block: B:367:0x074b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:370:0x0762  */
    /* JADX WARN: Code duplicated, block: B:373:0x0778  */
    /* JADX WARN: Code duplicated, block: B:377:0x078c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0793  */
    /* JADX WARN: Code duplicated, block: B:380:0x0796  */
    /* JADX WARN: Code duplicated, block: B:383:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:388:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:389:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:392:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:394:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:403:0x0814  */
    /* JADX WARN: Code duplicated, block: B:405:0x081a  */
    /* JADX WARN: Code duplicated, block: B:413:0x0832  */
    /* JADX WARN: Code duplicated, block: B:415:0x0838  */
    /* JADX WARN: Code duplicated, block: B:417:0x0840  */
    /* JADX WARN: Code duplicated, block: B:419:0x0846  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:422:0x084a  */
    /* JADX WARN: Code duplicated, block: B:425:0x0863  */
    /* JADX WARN: Code duplicated, block: B:433:0x087f  */
    /* JADX WARN: Code duplicated, block: B:436:0x088c  */
    /* JADX WARN: Code duplicated, block: B:439:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:441:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:442:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:445:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:448:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:452:0x0908  */
    /* JADX WARN: Code duplicated, block: B:455:0x090d  */
    /* JADX WARN: Code duplicated, block: B:458:0x092a  */
    /* JADX WARN: Code duplicated, block: B:461:0x092f  */
    /* JADX WARN: Code duplicated, block: B:464:0x093a  */
    /* JADX WARN: Code duplicated, block: B:469:0x0962  */
    /* JADX WARN: Code duplicated, block: B:471:0x0965  */
    /* JADX WARN: Code duplicated, block: B:474:0x096d  */
    /* JADX WARN: Code duplicated, block: B:476:0x097b  */
    /* JADX WARN: Code duplicated, block: B:478:0x097e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:480:0x098c  */
    /* JADX WARN: Code duplicated, block: B:483:0x0991  */
    /* JADX WARN: Code duplicated, block: B:488:0x099b  */
    /* JADX WARN: Code duplicated, block: B:491:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:493:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:495:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:497:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:501:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:503:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:504:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:506:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:507:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:515:0x0a39 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:518:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:528:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:541:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:543:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:544:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:548:0x0abc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:551:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:553:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:555:0x0add  */
    /* JADX WARN: Code duplicated, block: B:558:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:561:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:566:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:576:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:592:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:594:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:596:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:598:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:599:0x0bea  */
    /* JADX WARN: Code duplicated, block: B:603:0x0c01  */
    /* JADX WARN: Code duplicated, block: B:605:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:610:0x0c1a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:614:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:617:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:619:0x0c47  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:623:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:624:0x0c70  */
    /* JADX WARN: Code duplicated, block: B:627:0x0c7d  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c87  */
    /* JADX WARN: Code duplicated, block: B:630:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c99  */
    /* JADX WARN: Code duplicated, block: B:635:0x0ca5  */
    /* JADX WARN: Code duplicated, block: B:640:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:651:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:653:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:657:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:661:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0579 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:680:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x082f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x082a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x09e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x09e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:619:0x0c47, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:653:0x0cdb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [uj0] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v97, types: [java.util.ArrayList] */
    @Override // defpackage.t1
    public final r1 t(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        r1 r1Var;
        int i2;
        js2 js2VarL;
        Integer numValueOf;
        int iIntValue;
        ex1 ex1Var;
        yy2 yy2Var;
        Resources resources;
        es2 es2Var;
        zx1 zx1Var;
        Object objG;
        vh2 vh2Var;
        AccessibilityManager accessibilityManager;
        yy2 yy2Var2;
        boolean zI;
        List listJ;
        int size;
        boolean z;
        int i3;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        dj djVarB;
        es2 es2Var2;
        vh2 vh2Var2;
        zx1 zx1Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        r1 r1Var2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        rs2 rs2Var;
        zx1 zx1Var3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        String strA;
        Object objG2;
        xa3 xa3Var;
        Object objG3;
        Boolean bool;
        vh2 vh2Var3;
        int i6;
        es2 es2Var3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        r1 r1Var3;
        Object objG7;
        int i7;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        rs2 rs2Var2;
        jb jbVar;
        boolean z2;
        js2 js2VarL2;
        boolean z3;
        Object objG10;
        Object objG11;
        z0 z0Var;
        Object objG12;
        z0 z0Var2;
        z0 z0Var3;
        String strO;
        ArrayList arrayList;
        CharSequence charSequenceE;
        oc2 oc2Var;
        Object objG13;
        on2 on2Var;
        on2 on2Var2;
        int i8;
        CharSequence charSequence;
        boolean zF;
        int iD;
        db dbVar;
        Bundle bundle;
        int iD2;
        String str3;
        r1 r1Var4;
        eh ehVarI;
        eh ehVarI2;
        z0 z0Var4;
        z0 z0Var5;
        z0 z0Var6;
        rs2 rs2Var3;
        List list2;
        int size2;
        fx1 fx1Var;
        yy2 yy2Var3;
        ox1 ox1Var;
        int[] iArr;
        int i9;
        int[] iArrCopyOf;
        int i10;
        int i11;
        ArrayList arrayList2;
        int i12;
        Object objG14;
        Object objG15;
        Object objG16;
        boolean zU;
        qa1 qa1Var;
        hb1 hb1Var;
        o1 o1Var;
        o1 o1Var2;
        Object objG17;
        js2 js2VarL3;
        Object objG18;
        Object objG19;
        py pyVar;
        ArrayList arrayList3;
        List listJ2;
        int size3;
        int i13;
        int i14;
        boolean zH;
        int i15;
        int i16;
        Object objG20;
        js2 js2Var;
        z0 z0Var7;
        float f;
        fy fyVar;
        rs2 rs2Var4;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        z0 z0Var8;
        String str4;
        List list3;
        hb1 hb1VarU;
        es2 es2VarW;
        boolean zF2;
        Object objG21;
        es2 es2VarW2;
        z0 z0Var9;
        z0 z0Var10;
        z0 z0Var11;
        z0 z0Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG22;
        boolean z4;
        boolean z5;
        int iD3;
        js2 js2VarL4;
        boolean zBooleanValue;
        es2 es2Var4;
        rs2 rs2Var5;
        boolean zBooleanValue2;
        Object objG23;
        xb0 density;
        gn gnVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size4;
        int i17;
        int size5;
        int i18;
        List listA;
        int size6;
        int i19;
        cj cjVar;
        int i20;
        Object obj;
        int i21;
        bg1 bg1Var;
        WeakHashMap weakHashMap;
        Object i20Var;
        cj cjVar2;
        ag1 ag1Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        zg3 zg3Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size7;
        int i22;
        cj cjVar3;
        fi3 fi3Var;
        int i23;
        int i24;
        int size8;
        int i25;
        cj cjVar4;
        int size9;
        int i26;
        int i27;
        int i28;
        long jA;
        jr0 jr0Var;
        hr0 hr0Var;
        j83 j83Var;
        long j;
        p63 p63Var;
        i83 i83Var;
        long jA2;
        i83 szVar;
        i83 i83Var2;
        SpannableString spannableString4;
        jr0 jr0Var2;
        int i29;
        int i30;
        int i31;
        js2 js2Var2;
        f41 f41VarN;
        int i32;
        eh ehVar;
        ls2 ls2Var;
        boolean zF3;
        js2 js2Var3;
        int i33;
        int i34;
        String strJ;
        Object parentForAccessibility;
        View view;
        jb jbVar2 = this.g;
        AccessibilityManager accessibilityManager2 = jbVar2.k;
        db dbVar2 = jbVar2.h;
        if (((ff1) dbVar2.getComposeViewContext().c.getLifecycle()).d == we1.e) {
            if (accessibilityManager2.isEnabled()) {
                r1Var4 = null;
            } else {
                r1Var4 = new r1(AccessibilityNodeInfo.obtain());
            }
            jbVar = jbVar2;
            i7 = i;
        } else {
            ls2 ls2Var2 = (ls2) jbVar2.n().b(i);
            if (ls2Var2 == null) {
                if (accessibilityManager2.isEnabled()) {
                    r1Var4 = null;
                } else {
                    r1Var4 = new r1(AccessibilityNodeInfo.obtain());
                }
                jbVar = jbVar2;
                i7 = i;
            } else {
                js2 js2Var4 = ls2Var2.a;
                es2 es2VarK = js2Var4.k();
                hb1 hb1Var2 = js2Var4.c;
                Object objG24 = es2VarK.e.g(os2.o);
                if (objG24 == null) {
                    objG24 = null;
                }
                boolean zF4 = o51.f(objG24, Boolean.TRUE);
                if (!zF4) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    r1Var = new r1(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        d1.k(accessibilityNodeInfoObtain, zF4);
                    } else {
                        r1Var.f(64, zF4);
                    }
                    if (i == -1) {
                        parentForAccessibility = dbVar2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        r1Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        js2VarL = js2Var4.l();
                        if (js2VarL != null) {
                            numValueOf = Integer.valueOf(js2VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            p21.d("semanticsNode " + i + " has null parent");
                            fo.d();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == dbVar2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        r1Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(dbVar2, iIntValue);
                    }
                    r1Var.c = i;
                    accessibilityNodeInfoObtain.setSource(dbVar2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(jbVar2.f(ls2Var2));
                    ex1Var = jbVar2.N;
                    yy2Var = jbVar2.w;
                    resources = dbVar2.getContext().getResources();
                    r1Var.g("android.view.View");
                    es2Var = js2Var4.d;
                    zx1Var = es2Var.e;
                    if (zx1Var.c(os2.G)) {
                        r1Var.g("android.widget.EditText");
                    }
                    if (zx1Var.c(os2.C)) {
                        r1Var.g("android.widget.TextView");
                    }
                    objG = zx1Var.g(os2.z);
                    if (objG == null) {
                        objG = null;
                    }
                    vh2Var = (vh2) objG;
                    if (vh2Var != null) {
                        i33 = vh2Var.a;
                        if (js2Var4.n()) {
                            accessibilityManager = accessibilityManager2;
                            i34 = 4;
                            yy2Var2 = yy2Var;
                            if (js2.j(4, js2Var4).isEmpty()) {
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i34 = 4;
                            yy2Var2 = yy2Var;
                        }
                        if (i33 == i34) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131625101));
                        } else if (i33 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131625065));
                        } else {
                            strJ = ig0.J(i33);
                            if (i33 == 5 || js2Var4.p() || es2Var.g) {
                                r1Var.g(strJ);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        yy2Var2 = yy2Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(dbVar2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(am1.D(js2Var4));
                    if (i2 >= 34) {
                        zI = d1.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = js2.j(4, js2Var4);
                    size = listJ.size();
                    z = zI;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i35 = size;
                        js2Var2 = (js2) listJ.get(i4);
                        List list5 = listJ;
                        f41VarN = jbVar2.n();
                        int i36 = i4;
                        i32 = js2Var2.f;
                        if (f41VarN.a(i32)) {
                            ehVar = dbVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(js2Var2.c);
                            if (i32 != -1) {
                                if (ehVar != null) {
                                    accessibilityNodeInfoObtain.addChild(ehVar);
                                } else {
                                    ls2Var = (ls2) jbVar2.n().b(i32);
                                    if (ls2Var != null || (js2Var3 = ls2Var.a) == null) {
                                        zF3 = false;
                                    } else {
                                        Object objG25 = js2Var3.k().e.g(os2.o);
                                        if (objG25 == null) {
                                            objG25 = null;
                                        }
                                        zF3 = o51.f(objG25, Boolean.TRUE);
                                    }
                                    if (z || !zF3) {
                                        accessibilityNodeInfoObtain.addChild(dbVar2, i32);
                                    }
                                }
                                ex1Var.f(i32, i3);
                                i3++;
                            }
                        }
                        i4 = i36 + 1;
                        listJ = list5;
                        size = i35;
                    }
                    i5 = jbVar2.o;
                    accessibilityNodeInfo = r1Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        r1Var.a(o1.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        r1Var.a(o1.c);
                    }
                    djVarB = ym3.B(js2Var4);
                    if (djVarB != null) {
                        dbVar2.getFontFamilyResolver();
                        density = dbVar2.getDensity();
                        gnVar = jbVar2.J;
                        String str5 = djVarB.f;
                        list4 = djVarB.e;
                        spannableString2 = new SpannableString(str5);
                        arrayList4 = djVarB.g;
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            i26 = 0;
                            while (i26 < size9) {
                                int i37 = size9;
                                cj cjVar5 = (cj) arrayList4.get(i26);
                                ArrayList arrayList7 = arrayList4;
                                uy2 uy2Var = (uy2) cjVar5.a;
                                int i38 = i26;
                                i27 = cjVar5.b;
                                i28 = cjVar5.c;
                                es2 es2Var5 = es2Var;
                                vh2 vh2Var4 = vh2Var;
                                jA = uy2Var.a.a();
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                r1 r1Var5 = r1Var;
                                long j2 = uy2Var.b;
                                jr0Var = uy2Var.c;
                                hr0Var = uy2Var.d;
                                j83Var = uy2Var.j;
                                sh1 sh1Var = uy2Var.k;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                zx1 zx1Var4 = zx1Var;
                                j = uy2Var.l;
                                p63Var = uy2Var.m;
                                i83Var = uy2Var.a;
                                dj djVar = djVarB;
                                jA2 = i83Var.a();
                                int i39 = hz.h;
                                if (ye3.a(jA, jA2)) {
                                    i83Var2 = i83Var;
                                } else {
                                    if (jA != 16) {
                                        szVar = new sz(jA);
                                    } else {
                                        szVar = h83.a;
                                    }
                                    i83Var2 = szVar;
                                }
                                mh0.Z(spannableString2, i83Var2.a(), i27, i28);
                                spannableString4 = spannableString2;
                                mh0.a0(spannableString4, j2, density, i27, i28);
                                if (jr0Var == null || hr0Var != null) {
                                    if (jr0Var == null) {
                                        jr0Var2 = jr0.g;
                                    } else {
                                        jr0Var2 = jr0Var;
                                    }
                                    if (hr0Var != null) {
                                        i29 = hr0Var.a;
                                    } else {
                                        i29 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(ks.Q(jr0Var2, i29));
                                    i30 = 33;
                                    spannableString4.setSpan(styleSpan, i27, i28, 33);
                                } else {
                                    i30 = 33;
                                }
                                if (p63Var != null) {
                                    i31 = p63Var.a;
                                    if ((i31 | 1) == i31) {
                                        spannableString4.setSpan(new UnderlineSpan(), i27, i28, i30);
                                    }
                                    if ((i31 | 2) == i31) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i27, i28, i30);
                                    }
                                }
                                if (j83Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(j83Var.a), i27, i28, i30);
                                }
                                mh0.b0(spannableString4, sh1Var, i27, i28);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(xp1.T(j)), i27, i28, i30);
                                }
                                i26 = i38 + 1;
                                spannableString2 = spannableString4;
                                djVarB = djVar;
                                size9 = i37;
                                arrayList4 = arrayList7;
                                es2Var = es2Var5;
                                vh2Var = vh2Var4;
                                r1Var = r1Var5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                zx1Var = zx1Var4;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                            }
                        }
                        es2Var2 = es2Var;
                        vh2Var2 = vh2Var;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo;
                        zx1Var2 = zx1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        r1Var2 = r1Var;
                        spannableString3 = spannableString2;
                        dj djVar2 = djVarB;
                        int length = str5.length();
                        arrayList5 = uj0.e;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size8 = list4.size();
                            while (i25 < size8) {
                                Object obj2 = list4.get(i25);
                                cjVar4 = (cj) obj2;
                                if (!(cjVar4.a instanceof fi3) && ej.b(0, length, cjVar4.b, cjVar4.c)) {
                                    arrayList6.add(obj2);
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size4 = arrayList6.size();
                        while (i17 < size4) {
                            cj cjVar6 = (cj) arrayList6.get(i17);
                            fi3Var = (fi3) cjVar6.a;
                            i23 = cjVar6.b;
                            i24 = cjVar6.c;
                            if (fi3Var instanceof fi3) {
                                b81.d();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(fi3Var.a).build(), i23, i24, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            while (i22 < size7) {
                                Object obj3 = list4.get(i22);
                                cjVar3 = (cj) obj3;
                                if (!(cjVar3.a instanceof zg3) && ej.b(0, length2, cjVar3.b, cjVar3.c)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        size5 = arrayList5.size();
                        while (i18 < size5) {
                            cj cjVar7 = (cj) arrayList5.get(i18);
                            zg3Var = (zg3) cjVar7.a;
                            int i40 = cjVar7.b;
                            int i41 = cjVar7.c;
                            weakHashMap3 = (WeakHashMap) gnVar.a;
                            uRLSpan2 = weakHashMap3.get(zg3Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(zg3Var.a);
                                weakHashMap3.put(zg3Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i40, i41, 33);
                        }
                        listA = djVar2.a(str5.length());
                        size6 = listA.size();
                        while (i19 < size6) {
                            cjVar = (cj) listA.get(i19);
                            i20 = cjVar.b;
                            obj = cjVar.a;
                            i21 = cjVar.c;
                            if (i20 != i21) {
                                bg1Var = (bg1) obj;
                                if (bg1Var instanceof ag1) {
                                    obj.getClass();
                                    ag1Var = (ag1) obj;
                                    cjVar2 = new cj(i20, i21, ag1Var);
                                    weakHashMap2 = (WeakHashMap) gnVar.b;
                                    uRLSpan = weakHashMap2.get(cjVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(ag1Var.a);
                                        weakHashMap2.put(cjVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i20, i21, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) gnVar.c;
                                    i20Var = weakHashMap.get(cjVar);
                                    if (i20Var == null) {
                                        i20Var = new i20(bg1Var);
                                        weakHashMap.put(cjVar, i20Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) i20Var, i20, i21, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) jb.K(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo7;
                    } else {
                        ex1Var = ex1Var;
                        es2Var2 = es2Var;
                        vh2Var2 = vh2Var;
                        zx1Var2 = zx1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        r1Var2 = r1Var;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    rs2Var = os2.M;
                    zx1Var3 = zx1Var2;
                    if (zx1Var3.c(rs2Var)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objG23 = zx1Var3.g(rs2Var);
                        if (objG23 == null) {
                            objG23 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objG23);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    strA = ym3.A(js2Var4, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        p1.h(accessibilityNodeInfo3, strA);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strA);
                    }
                    accessibilityNodeInfo4.setCheckable(ym3.z(js2Var4));
                    objG2 = zx1Var3.g(os2.K);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    xa3Var = (xa3) objG2;
                    if (xa3Var != null) {
                        if (xa3Var == xa3.e) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (xa3Var == xa3.f) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objG3 = zx1Var3.g(os2.J);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (vh2Var2 == null) {
                            vh2Var3 = vh2Var2;
                            i6 = 4;
                        } else {
                            vh2Var3 = vh2Var2;
                            i6 = 4;
                            if (vh2Var3.a == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        vh2Var3 = vh2Var2;
                        i6 = 4;
                    }
                    es2Var3 = es2Var2;
                    if (es2Var3.g || js2.j(i6, js2Var4).isEmpty()) {
                        objG4 = zx1Var3.g(os2.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) zy.o0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objG5 = zx1Var3.g(os2.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        js2VarL4 = js2Var4;
                        while (true) {
                            if (js2VarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            es2Var4 = js2VarL4.d;
                            rs2Var5 = ps2.a;
                            if (es2Var4.e.c(rs2Var5)) {
                                zBooleanValue = ((Boolean) es2Var4.c(rs2Var5)).booleanValue();
                                break;
                            }
                            js2VarL4 = js2VarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = zx1Var3.g(os2.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((mf3) objG6) == null) {
                        r1Var3 = r1Var2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        r1Var3 = r1Var2;
                    } else {
                        r1Var3 = r1Var2;
                        r1Var3.f(2, true);
                    }
                    objG7 = zx1Var3.g(os2.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((mf3) objG7) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            r1Var3.f(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = ex1Var.d(js2Var4.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iD3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(zx1Var3.c(os2.L));
                    objG8 = zx1Var3.g(os2.O);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(o51.f(objG8, bool2));
                    objG9 = zx1Var3.g(os2.P);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(ym3.x(js2Var4));
                    rs2Var2 = os2.l;
                    accessibilityNodeInfo4.setFocusable(zx1Var3.c(rs2Var2));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) es2Var3.c(rs2Var2)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            jbVar = jbVar2;
                            jbVar.p = i7;
                        } else {
                            jbVar = jbVar2;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(am1.C(js2Var4) ^ z2);
                        if (js2Var4.n()) {
                            js2VarL2 = js2Var4.l();
                            js2VarL2.getClass();
                        } else {
                            js2VarL2 = js2Var4;
                        }
                        if (js2VarL2.m().g()) {
                            z3 = false;
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        } else {
                            z3 = false;
                        }
                        objG10 = zx1Var3.g(os2.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        if (objG10 == null) {
                            b81.u();
                            return null;
                        }
                        accessibilityNodeInfo3.setClickable(z3);
                        objG11 = zx1Var3.g(ds2.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        z0Var = (z0) objG11;
                        if (z0Var != null) {
                            objG22 = zx1Var3.g(os2.J);
                            if (objG22 == null) {
                                objG22 = null;
                            }
                            boolean zF5 = o51.f(objG22, bool2);
                            z4 = (vh2Var3 == null && vh2Var3.a == 4) || (vh2Var3 != null && vh2Var3.a == 3);
                            if (z4 || (z4 && !zF5)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            accessibilityNodeInfo3.setClickable(z5);
                            if (ym3.x(js2Var4) && accessibilityNodeInfo4.isClickable()) {
                                r1Var3.a(new o1(null, 16, z0Var.a, null));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        objG12 = zx1Var3.g(ds2.c);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        z0Var2 = (z0) objG12;
                        if (z0Var2 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (ym3.x(js2Var4)) {
                                r1Var3.a(new o1(null, 32, z0Var2.a, null));
                            }
                        }
                        z0Var3 = (z0) ce0.y(es2Var3, ds2.q);
                        if (z0Var3 != null) {
                            r1Var3.a(new o1(16384, z0Var3.a));
                        }
                        if (ym3.x(js2Var4)) {
                            z0Var9 = (z0) ce0.y(es2Var3, ds2.k);
                            if (z0Var9 != null) {
                                r1Var3.a(new o1(2097152, z0Var9.a));
                            }
                            z0Var10 = (z0) ce0.y(es2Var3, ds2.p);
                            if (z0Var10 != null) {
                                r1Var3.a(new o1(R.id.accessibilityActionImeEnter, z0Var10.a));
                            }
                            z0Var11 = (z0) ce0.y(es2Var3, ds2.r);
                            if (z0Var11 != null) {
                                r1Var3.a(new o1(65536, z0Var11.a));
                            }
                            z0Var12 = (z0) ce0.y(es2Var3, ds2.s);
                            if (z0Var12 != null && accessibilityNodeInfo4.isFocused()) {
                                primaryClipDescription = dbVar2.getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    r1Var3.a(new o1(32768, z0Var12.a));
                                }
                            }
                        }
                        strO = jb.o(js2Var4);
                        if (strO != null && strO.length() != 0) {
                            accessibilityNodeInfo4.setTextSelection(jbVar.m(js2Var4), jbVar.l(js2Var4));
                            z0Var8 = (z0) ce0.y(es2Var3, ds2.j);
                            if (z0Var8 != null) {
                                str4 = z0Var8.a;
                            } else {
                                str4 = null;
                            }
                            r1Var3.a(new o1(131072, str4));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) ce0.y(es2Var3, os2.a);
                            if ((list3 != null || list3.isEmpty()) && zx1Var3.c(ds2.a) && (!zx1Var3.c(os2.G) || o51.f(ce0.y(es2Var3, rs2Var2), bool2))) {
                                hb1VarU = hb1Var2.u();
                                while (true) {
                                    if (hb1VarU == null) {
                                        hb1VarU = null;
                                        break;
                                    }
                                    es2VarW2 = hb1VarU.w();
                                    if (es2VarW2 == null && es2VarW2.g) {
                                        if (es2VarW2.e.c(os2.G)) {
                                            break;
                                        }
                                    }
                                    hb1VarU = hb1VarU.u();
                                }
                                if (hb1VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    es2VarW = hb1VarU.w();
                                    if (es2VarW != null) {
                                        objG21 = es2VarW.e.g(rs2Var2);
                                        if (objG21 == null) {
                                            objG21 = null;
                                        }
                                        zF2 = o51.f(objG21, bool2);
                                    } else {
                                        zF2 = false;
                                    }
                                    if (zF2) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = r1Var3.e();
                        if (charSequenceE != null && charSequenceE.length() != 0 && zx1Var3.c(ds2.a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (zx1Var3.c(os2.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (zx1Var3.c(os2.Q)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                        oc2Var = (oc2) ce0.y(es2Var3, os2.c);
                        if (oc2Var != null) {
                            f = oc2Var.a;
                            fyVar = oc2Var.b;
                            rs2Var4 = ds2.i;
                            if (zx1Var3.c(rs2Var4)) {
                                r1Var3.g("android.widget.SeekBar");
                            } else {
                                r1Var3.g("android.widget.ProgressBar");
                            }
                            if (oc2Var != oc2.d) {
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) fyVar.a()).floatValue(), ((Number) fyVar.b()).floatValue(), f));
                            }
                            if (zx1Var3.c(rs2Var4) && ym3.x(js2Var4)) {
                                fFloatValue = ((Number) fyVar.b()).floatValue();
                                fFloatValue2 = ((Number) fyVar.a()).floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    r1Var3.a(o1.e);
                                }
                                fFloatValue3 = ((Number) fyVar.a()).floatValue();
                                fFloatValue4 = ((Number) fyVar.b()).floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    r1Var3.a(o1.f);
                                }
                            }
                        }
                        if (ym3.x(js2Var4) && (z0Var7 = (z0) ce0.y(es2Var3, ds2.i)) != null) {
                            r1Var3.a(new o1(R.id.accessibilityActionSetProgress, z0Var7.a));
                        }
                        zm3.R(r1Var3, js2Var4);
                        objG13 = js2Var4.k().e.g(os2.g);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        if (objG13 == null) {
                            js2VarL3 = js2Var4.l();
                            if (js2VarL3 != null) {
                                objG18 = js2VarL3.k().e.g(os2.e);
                                if (objG18 == null) {
                                    objG18 = null;
                                }
                                if (objG18 != null) {
                                    objG19 = js2VarL3.k().e.g(os2.f);
                                    if (objG19 == null) {
                                        objG19 = null;
                                    }
                                    pyVar = (py) objG19;
                                    if (pyVar != null || (pyVar.a >= 0 && pyVar.b >= 0)) {
                                        if (js2Var4.k().e.c(os2.J)) {
                                            arrayList3 = new ArrayList();
                                            listJ2 = js2.j(4, js2VarL3);
                                            size3 = listJ2.size();
                                            i14 = 0;
                                            while (i13 < size3) {
                                                js2Var = (js2) listJ2.get(i13);
                                                if (js2Var.k().e.c(os2.J)) {
                                                    arrayList3.add(js2Var);
                                                    if (js2Var.c.v() < js2Var4.c.v()) {
                                                        i14++;
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                zH = zm3.h(arrayList3);
                                                if (zH) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = i14;
                                                }
                                                if (zH) {
                                                    i16 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                                objG20 = js2Var4.k().e.g(os2.J);
                                                if (objG20 == null) {
                                                    objG20 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b81.u();
                        }
                        on2Var = (on2) ce0.y(es2Var3, os2.v);
                        z0 z0Var13 = (z0) ce0.y(es2Var3, ds2.d);
                        if (on2Var != null && z0Var13 != null) {
                            objG16 = js2Var4.k().e.g(os2.f);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                objG17 = js2Var4.k().e.g(os2.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 == null) {
                                    r1Var3.g("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) on2Var.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ym3.x(js2Var4)) {
                                zU = jb.u(on2Var);
                                qa1Var = qa1.f;
                                if (zU) {
                                    r1Var3.a(o1.e);
                                    hb1Var = hb1Var2;
                                    if (hb1Var.E == qa1Var) {
                                        o1Var2 = o1.h;
                                    } else {
                                        o1Var2 = o1.j;
                                    }
                                    r1Var3.a(o1Var2);
                                } else {
                                    hb1Var = hb1Var2;
                                }
                                if (jb.t(on2Var)) {
                                    r1Var3.a(o1.f);
                                    if (hb1Var.E == qa1Var) {
                                        o1Var = o1.j;
                                    } else {
                                        o1Var = o1.h;
                                    }
                                    r1Var3.a(o1Var);
                                }
                            }
                        }
                        on2Var2 = (on2) ce0.y(es2Var3, os2.w);
                        if (on2Var2 != null && z0Var13 != null) {
                            objG14 = js2Var4.k().e.g(os2.f);
                            if (objG14 == null) {
                                objG14 = null;
                            }
                            if (objG14 == null) {
                                objG15 = js2Var4.k().e.g(os2.e);
                                if (objG15 == null) {
                                    objG15 = null;
                                }
                                if (objG15 == null) {
                                    r1Var3.g("android.widget.ScrollView");
                                }
                            }
                            if (((Number) on2Var2.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ym3.x(js2Var4)) {
                                if (jb.u(on2Var2)) {
                                    r1Var3.a(o1.e);
                                    r1Var3.a(o1.i);
                                }
                                if (jb.t(on2Var2)) {
                                    r1Var3.a(o1.f);
                                    r1Var3.a(o1.g);
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 29) {
                            da0.k(r1Var3, js2Var4);
                        }
                        charSequence = (CharSequence) ce0.y(es2Var3, os2.d);
                        if (i8 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (ym3.x(js2Var4)) {
                            z0Var4 = (z0) ce0.y(es2Var3, ds2.t);
                            if (z0Var4 != null) {
                                r1Var3.a(new o1(262144, z0Var4.a));
                            }
                            z0Var5 = (z0) ce0.y(es2Var3, ds2.u);
                            if (z0Var5 != null) {
                                r1Var3.a(new o1(524288, z0Var5.a));
                            }
                            z0Var6 = (z0) ce0.y(es2Var3, ds2.v);
                            if (z0Var6 != null) {
                                r1Var3.a(new o1(1048576, z0Var6.a));
                            }
                            rs2Var3 = ds2.x;
                            if (zx1Var3.c(rs2Var3)) {
                                list2 = (List) es2Var3.c(rs2Var3);
                                size2 = list2.size();
                                fx1Var = jb.R;
                                if (size2 < fx1Var.b) {
                                    throw new IllegalStateException("Can't have more than " + fx1Var.b + " custom actions for one widget");
                                }
                                yy2 yy2Var4 = new yy2(0);
                                ox1 ox1VarA = r02.a();
                                yy2Var3 = yy2Var2;
                                if (xq1.x(yy2Var3.g, i7, yy2Var3.e) >= 0) {
                                    ox1Var = (ox1) sb.L(yy2Var3, i7);
                                    iArr = fx1Var.a;
                                    i9 = fx1Var.b;
                                    iArrCopyOf = new int[16];
                                    i10 = 0;
                                    i11 = 0;
                                    while (i10 < i9) {
                                        int i42 = iArr[i10];
                                        int i43 = i9;
                                        i12 = i11 + 1;
                                        int i44 = i10;
                                        if (iArrCopyOf.length < i12) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i11] = i42;
                                        i10 = i44 + 1;
                                        i11 = i12;
                                        i9 = i43;
                                    }
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        p91.x(list2.get(0));
                                        ox1Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() <= 0) {
                                        p91.x(arrayList2.get(0));
                                        if (i11 <= 0) {
                                            fo.p("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i45 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    p91.x(list2.get(0));
                                    fx1Var.c(0);
                                    throw null;
                                }
                                jbVar.v.b(i7, yy2Var4);
                                yy2Var3.b(i7, ox1VarA);
                            }
                        }
                        zF = ym3.F(js2Var4, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zF);
                        } else {
                            r1Var3.f(1, zF);
                        }
                        iD = jbVar.F.d(i7);
                        if (iD != -1) {
                            ehVarI2 = ig0.I(dbVar2.getAndroidViewsHandler$ui(), iD);
                            if (ehVarI2 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(ehVarI2);
                                dbVar = dbVar2;
                            } else {
                                dbVar = dbVar2;
                                accessibilityNodeInfo3.setTraversalBefore(dbVar, iD);
                            }
                            bundle = null;
                            jbVar.e(i7, r1Var3, jbVar.H, null);
                        } else {
                            dbVar = dbVar2;
                            bundle = null;
                        }
                        iD2 = jbVar.G.d(i7);
                        if (iD2 != -1 && (ehVarI = ig0.I(dbVar.getAndroidViewsHandler$ui(), iD2)) != null) {
                            accessibilityNodeInfo3.setTraversalAfter(ehVarI);
                            jbVar.e(i7, r1Var3, jbVar.I, bundle);
                        }
                        str3 = (String) ce0.y(es2Var3, ps2.b);
                        if (str3 != null) {
                            r1Var3.g(str3);
                        }
                        r1Var4 = r1Var3;
                    } else {
                        jbVar = jbVar2;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(am1.C(js2Var4) ^ z2);
                    if (js2Var4.n()) {
                        js2VarL2 = js2Var4.l();
                        js2VarL2.getClass();
                    } else {
                        js2VarL2 = js2Var4;
                    }
                    if (js2VarL2.m().g()) {
                        z3 = false;
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    } else {
                        z3 = false;
                    }
                    objG10 = zx1Var3.g(os2.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    if (objG10 == null) {
                        b81.u();
                        return null;
                    }
                    accessibilityNodeInfo3.setClickable(z3);
                    objG11 = zx1Var3.g(ds2.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    z0Var = (z0) objG11;
                    if (z0Var != null) {
                        objG22 = zx1Var3.g(os2.J);
                        if (objG22 == null) {
                            objG22 = null;
                        }
                        boolean zF6 = o51.f(objG22, bool2);
                        if (vh2Var3 == null) {
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z5);
                        if (ym3.x(js2Var4)) {
                            r1Var3.a(new o1(null, 16, z0Var.a, null));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    objG12 = zx1Var3.g(ds2.c);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    z0Var2 = (z0) objG12;
                    if (z0Var2 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (ym3.x(js2Var4)) {
                            r1Var3.a(new o1(null, 32, z0Var2.a, null));
                        }
                    }
                    z0Var3 = (z0) ce0.y(es2Var3, ds2.q);
                    if (z0Var3 != null) {
                        r1Var3.a(new o1(16384, z0Var3.a));
                    }
                    if (ym3.x(js2Var4)) {
                        z0Var9 = (z0) ce0.y(es2Var3, ds2.k);
                        if (z0Var9 != null) {
                            r1Var3.a(new o1(2097152, z0Var9.a));
                        }
                        z0Var10 = (z0) ce0.y(es2Var3, ds2.p);
                        if (z0Var10 != null) {
                            r1Var3.a(new o1(R.id.accessibilityActionImeEnter, z0Var10.a));
                        }
                        z0Var11 = (z0) ce0.y(es2Var3, ds2.r);
                        if (z0Var11 != null) {
                            r1Var3.a(new o1(65536, z0Var11.a));
                        }
                        z0Var12 = (z0) ce0.y(es2Var3, ds2.s);
                        if (z0Var12 != null) {
                            primaryClipDescription = dbVar2.getClipboardManager().a().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                r1Var3.a(new o1(32768, z0Var12.a));
                            }
                        }
                    }
                    strO = jb.o(js2Var4);
                    if (strO != null) {
                        accessibilityNodeInfo4.setTextSelection(jbVar.m(js2Var4), jbVar.l(js2Var4));
                        z0Var8 = (z0) ce0.y(es2Var3, ds2.j);
                        if (z0Var8 != null) {
                            str4 = z0Var8.a;
                        } else {
                            str4 = null;
                        }
                        r1Var3.a(new o1(131072, str4));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) ce0.y(es2Var3, os2.a);
                        if (list3 != null) {
                            hb1VarU = hb1Var2.u();
                            while (true) {
                                if (hb1VarU == null) {
                                    hb1VarU = null;
                                    break;
                                }
                                es2VarW2 = hb1VarU.w();
                                if (es2VarW2 == null) {
                                }
                                hb1VarU = hb1VarU.u();
                            }
                            if (hb1VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                es2VarW = hb1VarU.w();
                                if (es2VarW != null) {
                                    objG21 = es2VarW.e.g(rs2Var2);
                                    if (objG21 == null) {
                                        objG21 = null;
                                    }
                                    zF2 = o51.f(objG21, bool2);
                                } else {
                                    zF2 = false;
                                }
                                if (zF2) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            hb1VarU = hb1Var2.u();
                            while (true) {
                                if (hb1VarU == null) {
                                    hb1VarU = null;
                                    break;
                                }
                                es2VarW2 = hb1VarU.w();
                                if (es2VarW2 == null) {
                                }
                                hb1VarU = hb1VarU.u();
                            }
                            if (hb1VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                es2VarW = hb1VarU.w();
                                if (es2VarW != null) {
                                    objG21 = es2VarW.e.g(rs2Var2);
                                    if (objG21 == null) {
                                        objG21 = null;
                                    }
                                    zF2 = o51.f(objG21, bool2);
                                } else {
                                    zF2 = false;
                                }
                                if (zF2) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceE = r1Var3.e();
                    if (charSequenceE != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (zx1Var3.c(os2.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (zx1Var3.c(os2.Q)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    oc2Var = (oc2) ce0.y(es2Var3, os2.c);
                    if (oc2Var != null) {
                        f = oc2Var.a;
                        fyVar = oc2Var.b;
                        rs2Var4 = ds2.i;
                        if (zx1Var3.c(rs2Var4)) {
                            r1Var3.g("android.widget.SeekBar");
                        } else {
                            r1Var3.g("android.widget.ProgressBar");
                        }
                        if (oc2Var != oc2.d) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) fyVar.a()).floatValue(), ((Number) fyVar.b()).floatValue(), f));
                        }
                        if (zx1Var3.c(rs2Var4)) {
                            fFloatValue = ((Number) fyVar.b()).floatValue();
                            fFloatValue2 = ((Number) fyVar.a()).floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f < fFloatValue) {
                                r1Var3.a(o1.e);
                            }
                            fFloatValue3 = ((Number) fyVar.a()).floatValue();
                            fFloatValue4 = ((Number) fyVar.b()).floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f > fFloatValue3) {
                                r1Var3.a(o1.f);
                            }
                        }
                    }
                    if (ym3.x(js2Var4)) {
                        r1Var3.a(new o1(R.id.accessibilityActionSetProgress, z0Var7.a));
                    }
                    zm3.R(r1Var3, js2Var4);
                    objG13 = js2Var4.k().e.g(os2.g);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    if (objG13 == null) {
                        js2VarL3 = js2Var4.l();
                        if (js2VarL3 != null) {
                            objG18 = js2VarL3.k().e.g(os2.e);
                            if (objG18 == null) {
                                objG18 = null;
                            }
                            if (objG18 != null) {
                                objG19 = js2VarL3.k().e.g(os2.f);
                                if (objG19 == null) {
                                    objG19 = null;
                                }
                                pyVar = (py) objG19;
                                if (pyVar != null) {
                                    if (js2Var4.k().e.c(os2.J)) {
                                        arrayList3 = new ArrayList();
                                        listJ2 = js2.j(4, js2VarL3);
                                        size3 = listJ2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            js2Var = (js2) listJ2.get(i13);
                                            if (js2Var.k().e.c(os2.J)) {
                                                arrayList3.add(js2Var);
                                                if (js2Var.c.v() < js2Var4.c.v()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zH = zm3.h(arrayList3);
                                            if (zH) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zH) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG20 = js2Var4.k().e.g(os2.J);
                                            if (objG20 == null) {
                                                objG20 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                        }
                                    }
                                } else if (js2Var4.k().e.c(os2.J)) {
                                    arrayList3 = new ArrayList();
                                    listJ2 = js2.j(4, js2VarL3);
                                    size3 = listJ2.size();
                                    i14 = 0;
                                    while (i13 < size3) {
                                        js2Var = (js2) listJ2.get(i13);
                                        if (js2Var.k().e.c(os2.J)) {
                                            arrayList3.add(js2Var);
                                            if (js2Var.c.v() < js2Var4.c.v()) {
                                                i14++;
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        zH = zm3.h(arrayList3);
                                        if (zH) {
                                            i15 = 0;
                                        } else {
                                            i15 = i14;
                                        }
                                        if (zH) {
                                            i16 = i14;
                                        } else {
                                            i16 = 0;
                                        }
                                        objG20 = js2Var4.k().e.g(os2.J);
                                        if (objG20 == null) {
                                            objG20 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        b81.u();
                    }
                    on2Var = (on2) ce0.y(es2Var3, os2.v);
                    z0 z0Var14 = (z0) ce0.y(es2Var3, ds2.d);
                    if (on2Var != null) {
                        objG16 = js2Var4.k().e.g(os2.f);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        if (objG16 == null) {
                            objG17 = js2Var4.k().e.g(os2.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 == null) {
                                r1Var3.g("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) on2Var.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ym3.x(js2Var4)) {
                            zU = jb.u(on2Var);
                            qa1Var = qa1.f;
                            if (zU) {
                                r1Var3.a(o1.e);
                                hb1Var = hb1Var2;
                                if (hb1Var.E == qa1Var) {
                                    o1Var2 = o1.h;
                                } else {
                                    o1Var2 = o1.j;
                                }
                                r1Var3.a(o1Var2);
                            } else {
                                hb1Var = hb1Var2;
                            }
                            if (jb.t(on2Var)) {
                                r1Var3.a(o1.f);
                                if (hb1Var.E == qa1Var) {
                                    o1Var = o1.j;
                                } else {
                                    o1Var = o1.h;
                                }
                                r1Var3.a(o1Var);
                            }
                        }
                    }
                    on2Var2 = (on2) ce0.y(es2Var3, os2.w);
                    if (on2Var2 != null) {
                        objG14 = js2Var4.k().e.g(os2.f);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            objG15 = js2Var4.k().e.g(os2.e);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                r1Var3.g("android.widget.ScrollView");
                            }
                        }
                        if (((Number) on2Var2.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ym3.x(js2Var4)) {
                            if (jb.u(on2Var2)) {
                                r1Var3.a(o1.e);
                                r1Var3.a(o1.i);
                            }
                            if (jb.t(on2Var2)) {
                                r1Var3.a(o1.f);
                                r1Var3.a(o1.g);
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 29) {
                        da0.k(r1Var3, js2Var4);
                    }
                    charSequence = (CharSequence) ce0.y(es2Var3, os2.d);
                    if (i8 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (ym3.x(js2Var4)) {
                        z0Var4 = (z0) ce0.y(es2Var3, ds2.t);
                        if (z0Var4 != null) {
                            r1Var3.a(new o1(262144, z0Var4.a));
                        }
                        z0Var5 = (z0) ce0.y(es2Var3, ds2.u);
                        if (z0Var5 != null) {
                            r1Var3.a(new o1(524288, z0Var5.a));
                        }
                        z0Var6 = (z0) ce0.y(es2Var3, ds2.v);
                        if (z0Var6 != null) {
                            r1Var3.a(new o1(1048576, z0Var6.a));
                        }
                        rs2Var3 = ds2.x;
                        if (zx1Var3.c(rs2Var3)) {
                            list2 = (List) es2Var3.c(rs2Var3);
                            size2 = list2.size();
                            fx1Var = jb.R;
                            if (size2 < fx1Var.b) {
                                throw new IllegalStateException("Can't have more than " + fx1Var.b + " custom actions for one widget");
                            }
                            yy2 yy2Var5 = new yy2(0);
                            ox1 ox1VarA2 = r02.a();
                            yy2Var3 = yy2Var2;
                            if (xq1.x(yy2Var3.g, i7, yy2Var3.e) >= 0) {
                                ox1Var = (ox1) sb.L(yy2Var3, i7);
                                iArr = fx1Var.a;
                                i9 = fx1Var.b;
                                iArrCopyOf = new int[16];
                                i10 = 0;
                                i11 = 0;
                                while (i10 < i9) {
                                    int i46 = iArr[i10];
                                    int i47 = i9;
                                    i12 = i11 + 1;
                                    int i48 = i10;
                                    if (iArrCopyOf.length < i12) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i11] = i46;
                                    i10 = i48 + 1;
                                    i11 = i12;
                                    i9 = i47;
                                }
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    p91.x(list2.get(0));
                                    ox1Var.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() <= 0) {
                                    p91.x(arrayList2.get(0));
                                    if (i11 <= 0) {
                                        fo.p("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i49 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                p91.x(list2.get(0));
                                fx1Var.c(0);
                                throw null;
                            }
                            jbVar.v.b(i7, yy2Var5);
                            yy2Var3.b(i7, ox1VarA2);
                        }
                    }
                    zF = ym3.F(js2Var4, resources);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zF);
                    } else {
                        r1Var3.f(1, zF);
                    }
                    iD = jbVar.F.d(i7);
                    if (iD != -1) {
                        ehVarI2 = ig0.I(dbVar2.getAndroidViewsHandler$ui(), iD);
                        if (ehVarI2 != null) {
                            accessibilityNodeInfo3.setTraversalBefore(ehVarI2);
                            dbVar = dbVar2;
                        } else {
                            dbVar = dbVar2;
                            accessibilityNodeInfo3.setTraversalBefore(dbVar, iD);
                        }
                        bundle = null;
                        jbVar.e(i7, r1Var3, jbVar.H, null);
                    } else {
                        dbVar = dbVar2;
                        bundle = null;
                    }
                    iD2 = jbVar.G.d(i7);
                    if (iD2 != -1) {
                        accessibilityNodeInfo3.setTraversalAfter(ehVarI);
                        jbVar.e(i7, r1Var3, jbVar.I, bundle);
                    }
                    str3 = (String) ce0.y(es2Var3, ps2.b);
                    if (str3 != null) {
                        r1Var3.g(str3);
                    }
                    r1Var4 = r1Var3;
                } else if (Build.VERSION.SDK_INT >= 34 ? d1.i(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    r1Var = new r1(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        d1.k(accessibilityNodeInfoObtain, zF4);
                    } else {
                        r1Var.f(64, zF4);
                    }
                    if (i == -1) {
                        parentForAccessibility = dbVar2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        r1Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        js2VarL = js2Var4.l();
                        if (js2VarL != null) {
                            numValueOf = Integer.valueOf(js2VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            p21.d("semanticsNode " + i + " has null parent");
                            fo.d();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == dbVar2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        r1Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(dbVar2, iIntValue);
                    }
                    r1Var.c = i;
                    accessibilityNodeInfoObtain.setSource(dbVar2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(jbVar2.f(ls2Var2));
                    ex1Var = jbVar2.N;
                    yy2Var = jbVar2.w;
                    resources = dbVar2.getContext().getResources();
                    r1Var.g("android.view.View");
                    es2Var = js2Var4.d;
                    zx1Var = es2Var.e;
                    if (zx1Var.c(os2.G)) {
                        r1Var.g("android.widget.EditText");
                    }
                    if (zx1Var.c(os2.C)) {
                        r1Var.g("android.widget.TextView");
                    }
                    objG = zx1Var.g(os2.z);
                    if (objG == null) {
                        objG = null;
                    }
                    vh2Var = (vh2) objG;
                    if (vh2Var != null) {
                        i33 = vh2Var.a;
                        if (js2Var4.n()) {
                            accessibilityManager = accessibilityManager2;
                            i34 = 4;
                            yy2Var2 = yy2Var;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i34 = 4;
                            yy2Var2 = yy2Var;
                            if (js2.j(4, js2Var4).isEmpty()) {
                            }
                        }
                        if (i33 == i34) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131625101));
                        } else if (i33 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131625065));
                        } else {
                            strJ = ig0.J(i33);
                            if (i33 == 5) {
                                r1Var.g(strJ);
                            } else {
                                r1Var.g(strJ);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        yy2Var2 = yy2Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(dbVar2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(am1.D(js2Var4));
                    if (i2 >= 34) {
                        zI = d1.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = js2.j(4, js2Var4);
                    size = listJ.size();
                    z = zI;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i310 = size;
                        js2Var2 = (js2) listJ.get(i4);
                        List list6 = listJ;
                        f41VarN = jbVar2.n();
                        int i311 = i4;
                        i32 = js2Var2.f;
                        if (f41VarN.a(i32)) {
                            ehVar = dbVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(js2Var2.c);
                            if (i32 != -1) {
                                if (ehVar != null) {
                                    accessibilityNodeInfoObtain.addChild(ehVar);
                                } else {
                                    ls2Var = (ls2) jbVar2.n().b(i32);
                                    if (ls2Var != null) {
                                        zF3 = false;
                                    } else {
                                        zF3 = false;
                                    }
                                    if (z) {
                                        accessibilityNodeInfoObtain.addChild(dbVar2, i32);
                                    } else {
                                        accessibilityNodeInfoObtain.addChild(dbVar2, i32);
                                    }
                                }
                                ex1Var.f(i32, i3);
                                i3++;
                            }
                        }
                        i4 = i311 + 1;
                        listJ = list6;
                        size = i310;
                    }
                    i5 = jbVar2.o;
                    accessibilityNodeInfo = r1Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        r1Var.a(o1.d);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        r1Var.a(o1.c);
                    }
                    djVarB = ym3.B(js2Var4);
                    if (djVarB != null) {
                        dbVar2.getFontFamilyResolver();
                        density = dbVar2.getDensity();
                        gnVar = jbVar2.J;
                        String str6 = djVarB.f;
                        list4 = djVarB.e;
                        spannableString2 = new SpannableString(str6);
                        arrayList4 = djVarB.g;
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            i26 = 0;
                            while (i26 < size9) {
                                int i312 = size9;
                                cj cjVar8 = (cj) arrayList4.get(i26);
                                ArrayList arrayList8 = arrayList4;
                                uy2 uy2Var2 = (uy2) cjVar8.a;
                                int i313 = i26;
                                i27 = cjVar8.b;
                                i28 = cjVar8.c;
                                es2 es2Var6 = es2Var;
                                vh2 vh2Var5 = vh2Var;
                                jA = uy2Var2.a.a();
                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfoObtain;
                                r1 r1Var6 = r1Var;
                                long j3 = uy2Var2.b;
                                jr0Var = uy2Var2.c;
                                hr0Var = uy2Var2.d;
                                j83Var = uy2Var2.j;
                                sh1 sh1Var2 = uy2Var2.k;
                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfo;
                                zx1 zx1Var5 = zx1Var;
                                j = uy2Var2.l;
                                p63Var = uy2Var2.m;
                                i83Var = uy2Var2.a;
                                dj djVar3 = djVarB;
                                jA2 = i83Var.a();
                                int i314 = hz.h;
                                if (ye3.a(jA, jA2)) {
                                    i83Var2 = i83Var;
                                } else {
                                    if (jA != 16) {
                                        szVar = new sz(jA);
                                    } else {
                                        szVar = h83.a;
                                    }
                                    i83Var2 = szVar;
                                }
                                mh0.Z(spannableString2, i83Var2.a(), i27, i28);
                                spannableString4 = spannableString2;
                                mh0.a0(spannableString4, j3, density, i27, i28);
                                if (jr0Var == null) {
                                    if (jr0Var == null) {
                                        jr0Var2 = jr0.g;
                                    } else {
                                        jr0Var2 = jr0Var;
                                    }
                                    if (hr0Var != null) {
                                        i29 = hr0Var.a;
                                    } else {
                                        i29 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(ks.Q(jr0Var2, i29));
                                    i30 = 33;
                                    spannableString4.setSpan(styleSpan2, i27, i28, 33);
                                } else {
                                    if (jr0Var == null) {
                                        jr0Var2 = jr0.g;
                                    } else {
                                        jr0Var2 = jr0Var;
                                    }
                                    if (hr0Var != null) {
                                        i29 = hr0Var.a;
                                    } else {
                                        i29 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(ks.Q(jr0Var2, i29));
                                    i30 = 33;
                                    spannableString4.setSpan(styleSpan3, i27, i28, 33);
                                }
                                if (p63Var != null) {
                                    i31 = p63Var.a;
                                    if ((i31 | 1) == i31) {
                                        spannableString4.setSpan(new UnderlineSpan(), i27, i28, i30);
                                    }
                                    if ((i31 | 2) == i31) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i27, i28, i30);
                                    }
                                }
                                if (j83Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(j83Var.a), i27, i28, i30);
                                }
                                mh0.b0(spannableString4, sh1Var2, i27, i28);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(xp1.T(j)), i27, i28, i30);
                                }
                                i26 = i313 + 1;
                                spannableString2 = spannableString4;
                                djVarB = djVar3;
                                size9 = i312;
                                arrayList4 = arrayList8;
                                es2Var = es2Var6;
                                vh2Var = vh2Var5;
                                r1Var = r1Var6;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo8;
                                zx1Var = zx1Var5;
                                accessibilityNodeInfo = accessibilityNodeInfo9;
                            }
                        }
                        es2Var2 = es2Var;
                        vh2Var2 = vh2Var;
                        AccessibilityNodeInfo accessibilityNodeInfo10 = accessibilityNodeInfo;
                        zx1Var2 = zx1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        r1Var2 = r1Var;
                        spannableString3 = spannableString2;
                        dj djVar4 = djVarB;
                        int length3 = str6.length();
                        arrayList5 = uj0.e;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size8 = list4.size();
                            for (i25 = 0; i25 < size8; i25++) {
                                Object obj4 = list4.get(i25);
                                cjVar4 = (cj) obj4;
                                if (!(cjVar4.a instanceof fi3)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size4 = arrayList6.size();
                        for (i17 = 0; i17 < size4; i17++) {
                            cj cjVar9 = (cj) arrayList6.get(i17);
                            fi3Var = (fi3) cjVar9.a;
                            i23 = cjVar9.b;
                            i24 = cjVar9.c;
                            if (fi3Var instanceof fi3) {
                                b81.d();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(fi3Var.a).build(), i23, i24, 33);
                        }
                        int length4 = str6.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            for (i22 = 0; i22 < size7; i22++) {
                                Object obj5 = list4.get(i22);
                                cjVar3 = (cj) obj5;
                                if (!(cjVar3.a instanceof zg3)) {
                                }
                            }
                        }
                        size5 = arrayList5.size();
                        for (i18 = 0; i18 < size5; i18++) {
                            cj cjVar10 = (cj) arrayList5.get(i18);
                            zg3Var = (zg3) cjVar10.a;
                            int i410 = cjVar10.b;
                            int i411 = cjVar10.c;
                            weakHashMap3 = (WeakHashMap) gnVar.a;
                            uRLSpan2 = weakHashMap3.get(zg3Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(zg3Var.a);
                                weakHashMap3.put(zg3Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i410, i411, 33);
                        }
                        listA = djVar4.a(str6.length());
                        size6 = listA.size();
                        for (i19 = 0; i19 < size6; i19++) {
                            cjVar = (cj) listA.get(i19);
                            i20 = cjVar.b;
                            obj = cjVar.a;
                            i21 = cjVar.c;
                            if (i20 != i21) {
                                bg1Var = (bg1) obj;
                                if (bg1Var instanceof ag1) {
                                    obj.getClass();
                                    ag1Var = (ag1) obj;
                                    cjVar2 = new cj(i20, i21, ag1Var);
                                    weakHashMap2 = (WeakHashMap) gnVar.b;
                                    uRLSpan = weakHashMap2.get(cjVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(ag1Var.a);
                                        weakHashMap2.put(cjVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i20, i21, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) gnVar.c;
                                    i20Var = weakHashMap.get(cjVar);
                                    if (i20Var == null) {
                                        i20Var = new i20(bg1Var);
                                        weakHashMap.put(cjVar, i20Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) i20Var, i20, i21, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) jb.K(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo10;
                    } else {
                        ex1Var = ex1Var;
                        es2Var2 = es2Var;
                        vh2Var2 = vh2Var;
                        zx1Var2 = zx1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        r1Var2 = r1Var;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    rs2Var = os2.M;
                    zx1Var3 = zx1Var2;
                    if (zx1Var3.c(rs2Var)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objG23 = zx1Var3.g(rs2Var);
                        if (objG23 == null) {
                            objG23 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objG23);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    strA = ym3.A(js2Var4, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        p1.h(accessibilityNodeInfo3, strA);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strA);
                    }
                    accessibilityNodeInfo4.setCheckable(ym3.z(js2Var4));
                    objG2 = zx1Var3.g(os2.K);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    xa3Var = (xa3) objG2;
                    if (xa3Var != null) {
                        if (xa3Var == xa3.e) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (xa3Var == xa3.f) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objG3 = zx1Var3.g(os2.J);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (vh2Var2 == null) {
                            vh2Var3 = vh2Var2;
                            i6 = 4;
                        } else {
                            vh2Var3 = vh2Var2;
                            i6 = 4;
                            if (vh2Var3.a == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        vh2Var3 = vh2Var2;
                        i6 = 4;
                    }
                    es2Var3 = es2Var2;
                    if (es2Var3.g) {
                        objG4 = zx1Var3.g(os2.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) zy.o0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    } else {
                        objG4 = zx1Var3.g(os2.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) zy.o0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objG5 = zx1Var3.g(os2.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        js2VarL4 = js2Var4;
                        while (true) {
                            if (js2VarL4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            es2Var4 = js2VarL4.d;
                            rs2Var5 = ps2.a;
                            if (es2Var4.e.c(rs2Var5)) {
                                zBooleanValue = ((Boolean) es2Var4.c(rs2Var5)).booleanValue();
                                break;
                            }
                            js2VarL4 = js2VarL4.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = zx1Var3.g(os2.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((mf3) objG6) == null) {
                        r1Var3 = r1Var2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        r1Var3 = r1Var2;
                    } else {
                        r1Var3 = r1Var2;
                        r1Var3.f(2, true);
                    }
                    objG7 = zx1Var3.g(os2.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((mf3) objG7) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            r1Var3.f(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = ex1Var.d(js2Var4.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iD3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(zx1Var3.c(os2.L));
                    objG8 = zx1Var3.g(os2.O);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(o51.f(objG8, bool2));
                    objG9 = zx1Var3.g(os2.P);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(ym3.x(js2Var4));
                    rs2Var2 = os2.l;
                    accessibilityNodeInfo4.setFocusable(zx1Var3.c(rs2Var2));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) es2Var3.c(rs2Var2)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            jbVar = jbVar2;
                            jbVar.p = i7;
                        } else {
                            jbVar = jbVar2;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(am1.C(js2Var4) ^ z2);
                        if (js2Var4.n()) {
                            js2VarL2 = js2Var4.l();
                            js2VarL2.getClass();
                        } else {
                            js2VarL2 = js2Var4;
                        }
                        if (js2VarL2.m().g()) {
                            z3 = false;
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        } else {
                            z3 = false;
                        }
                        objG10 = zx1Var3.g(os2.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        if (objG10 == null) {
                            b81.u();
                            return null;
                        }
                        accessibilityNodeInfo3.setClickable(z3);
                        objG11 = zx1Var3.g(ds2.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        z0Var = (z0) objG11;
                        if (z0Var != null) {
                            objG22 = zx1Var3.g(os2.J);
                            if (objG22 == null) {
                                objG22 = null;
                            }
                            boolean zF7 = o51.f(objG22, bool2);
                            if (vh2Var3 == null) {
                            }
                            if (z4) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            accessibilityNodeInfo3.setClickable(z5);
                            if (ym3.x(js2Var4)) {
                                r1Var3.a(new o1(null, 16, z0Var.a, null));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        objG12 = zx1Var3.g(ds2.c);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        z0Var2 = (z0) objG12;
                        if (z0Var2 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (ym3.x(js2Var4)) {
                                r1Var3.a(new o1(null, 32, z0Var2.a, null));
                            }
                        }
                        z0Var3 = (z0) ce0.y(es2Var3, ds2.q);
                        if (z0Var3 != null) {
                            r1Var3.a(new o1(16384, z0Var3.a));
                        }
                        if (ym3.x(js2Var4)) {
                            z0Var9 = (z0) ce0.y(es2Var3, ds2.k);
                            if (z0Var9 != null) {
                                r1Var3.a(new o1(2097152, z0Var9.a));
                            }
                            z0Var10 = (z0) ce0.y(es2Var3, ds2.p);
                            if (z0Var10 != null) {
                                r1Var3.a(new o1(R.id.accessibilityActionImeEnter, z0Var10.a));
                            }
                            z0Var11 = (z0) ce0.y(es2Var3, ds2.r);
                            if (z0Var11 != null) {
                                r1Var3.a(new o1(65536, z0Var11.a));
                            }
                            z0Var12 = (z0) ce0.y(es2Var3, ds2.s);
                            if (z0Var12 != null) {
                                primaryClipDescription = dbVar2.getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    r1Var3.a(new o1(32768, z0Var12.a));
                                }
                            }
                        }
                        strO = jb.o(js2Var4);
                        if (strO != null) {
                            accessibilityNodeInfo4.setTextSelection(jbVar.m(js2Var4), jbVar.l(js2Var4));
                            z0Var8 = (z0) ce0.y(es2Var3, ds2.j);
                            if (z0Var8 != null) {
                                str4 = z0Var8.a;
                            } else {
                                str4 = null;
                            }
                            r1Var3.a(new o1(131072, str4));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) ce0.y(es2Var3, os2.a);
                            if (list3 != null) {
                                hb1VarU = hb1Var2.u();
                                while (true) {
                                    if (hb1VarU == null) {
                                        hb1VarU = null;
                                        break;
                                    }
                                    es2VarW2 = hb1VarU.w();
                                    if (es2VarW2 == null) {
                                    }
                                    hb1VarU = hb1VarU.u();
                                }
                                if (hb1VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    es2VarW = hb1VarU.w();
                                    if (es2VarW != null) {
                                        objG21 = es2VarW.e.g(rs2Var2);
                                        if (objG21 == null) {
                                            objG21 = null;
                                        }
                                        zF2 = o51.f(objG21, bool2);
                                    } else {
                                        zF2 = false;
                                    }
                                    if (zF2) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                hb1VarU = hb1Var2.u();
                                while (true) {
                                    if (hb1VarU == null) {
                                        hb1VarU = null;
                                        break;
                                    }
                                    es2VarW2 = hb1VarU.w();
                                    if (es2VarW2 == null) {
                                    }
                                    hb1VarU = hb1VarU.u();
                                }
                                if (hb1VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    es2VarW = hb1VarU.w();
                                    if (es2VarW != null) {
                                        objG21 = es2VarW.e.g(rs2Var2);
                                        if (objG21 == null) {
                                            objG21 = null;
                                        }
                                        zF2 = o51.f(objG21, bool2);
                                    } else {
                                        zF2 = false;
                                    }
                                    if (zF2) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = r1Var3.e();
                        if (charSequenceE != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (zx1Var3.c(os2.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (zx1Var3.c(os2.Q)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                        oc2Var = (oc2) ce0.y(es2Var3, os2.c);
                        if (oc2Var != null) {
                            f = oc2Var.a;
                            fyVar = oc2Var.b;
                            rs2Var4 = ds2.i;
                            if (zx1Var3.c(rs2Var4)) {
                                r1Var3.g("android.widget.SeekBar");
                            } else {
                                r1Var3.g("android.widget.ProgressBar");
                            }
                            if (oc2Var != oc2.d) {
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) fyVar.a()).floatValue(), ((Number) fyVar.b()).floatValue(), f));
                            }
                            if (zx1Var3.c(rs2Var4)) {
                                fFloatValue = ((Number) fyVar.b()).floatValue();
                                fFloatValue2 = ((Number) fyVar.a()).floatValue();
                                if (fFloatValue < fFloatValue2) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (f < fFloatValue) {
                                    r1Var3.a(o1.e);
                                }
                                fFloatValue3 = ((Number) fyVar.a()).floatValue();
                                fFloatValue4 = ((Number) fyVar.b()).floatValue();
                                if (fFloatValue3 > fFloatValue4) {
                                    fFloatValue3 = fFloatValue4;
                                }
                                if (f > fFloatValue3) {
                                    r1Var3.a(o1.f);
                                }
                            }
                        }
                        if (ym3.x(js2Var4)) {
                            r1Var3.a(new o1(R.id.accessibilityActionSetProgress, z0Var7.a));
                        }
                        zm3.R(r1Var3, js2Var4);
                        objG13 = js2Var4.k().e.g(os2.g);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        if (objG13 == null) {
                            js2VarL3 = js2Var4.l();
                            if (js2VarL3 != null) {
                                objG18 = js2VarL3.k().e.g(os2.e);
                                if (objG18 == null) {
                                    objG18 = null;
                                }
                                if (objG18 != null) {
                                    objG19 = js2VarL3.k().e.g(os2.f);
                                    if (objG19 == null) {
                                        objG19 = null;
                                    }
                                    pyVar = (py) objG19;
                                    if (pyVar != null) {
                                        if (js2Var4.k().e.c(os2.J)) {
                                            arrayList3 = new ArrayList();
                                            listJ2 = js2.j(4, js2VarL3);
                                            size3 = listJ2.size();
                                            i14 = 0;
                                            for (i13 = 0; i13 < size3; i13++) {
                                                js2Var = (js2) listJ2.get(i13);
                                                if (js2Var.k().e.c(os2.J)) {
                                                    arrayList3.add(js2Var);
                                                    if (js2Var.c.v() < js2Var4.c.v()) {
                                                        i14++;
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                zH = zm3.h(arrayList3);
                                                if (zH) {
                                                    i15 = 0;
                                                } else {
                                                    i15 = i14;
                                                }
                                                if (zH) {
                                                    i16 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                                objG20 = js2Var4.k().e.g(os2.J);
                                                if (objG20 == null) {
                                                    objG20 = Boolean.FALSE;
                                                }
                                                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                            }
                                        }
                                    } else if (js2Var4.k().e.c(os2.J)) {
                                        arrayList3 = new ArrayList();
                                        listJ2 = js2.j(4, js2VarL3);
                                        size3 = listJ2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            js2Var = (js2) listJ2.get(i13);
                                            if (js2Var.k().e.c(os2.J)) {
                                                arrayList3.add(js2Var);
                                                if (js2Var.c.v() < js2Var4.c.v()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zH = zm3.h(arrayList3);
                                            if (zH) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zH) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG20 = js2Var4.k().e.g(os2.J);
                                            if (objG20 == null) {
                                                objG20 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                        }
                                    }
                                }
                            }
                        } else {
                            b81.u();
                        }
                        on2Var = (on2) ce0.y(es2Var3, os2.v);
                        z0 z0Var15 = (z0) ce0.y(es2Var3, ds2.d);
                        if (on2Var != null) {
                            objG16 = js2Var4.k().e.g(os2.f);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                objG17 = js2Var4.k().e.g(os2.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 == null) {
                                    r1Var3.g("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) on2Var.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ym3.x(js2Var4)) {
                                zU = jb.u(on2Var);
                                qa1Var = qa1.f;
                                if (zU) {
                                    r1Var3.a(o1.e);
                                    hb1Var = hb1Var2;
                                    if (hb1Var.E == qa1Var) {
                                        o1Var2 = o1.h;
                                    } else {
                                        o1Var2 = o1.j;
                                    }
                                    r1Var3.a(o1Var2);
                                } else {
                                    hb1Var = hb1Var2;
                                }
                                if (jb.t(on2Var)) {
                                    r1Var3.a(o1.f);
                                    if (hb1Var.E == qa1Var) {
                                        o1Var = o1.j;
                                    } else {
                                        o1Var = o1.h;
                                    }
                                    r1Var3.a(o1Var);
                                }
                            }
                        }
                        on2Var2 = (on2) ce0.y(es2Var3, os2.w);
                        if (on2Var2 != null) {
                            objG14 = js2Var4.k().e.g(os2.f);
                            if (objG14 == null) {
                                objG14 = null;
                            }
                            if (objG14 == null) {
                                objG15 = js2Var4.k().e.g(os2.e);
                                if (objG15 == null) {
                                    objG15 = null;
                                }
                                if (objG15 == null) {
                                    r1Var3.g("android.widget.ScrollView");
                                }
                            }
                            if (((Number) on2Var2.b.invoke()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ym3.x(js2Var4)) {
                                if (jb.u(on2Var2)) {
                                    r1Var3.a(o1.e);
                                    r1Var3.a(o1.i);
                                }
                                if (jb.t(on2Var2)) {
                                    r1Var3.a(o1.f);
                                    r1Var3.a(o1.g);
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 29) {
                            da0.k(r1Var3, js2Var4);
                        }
                        charSequence = (CharSequence) ce0.y(es2Var3, os2.d);
                        if (i8 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (ym3.x(js2Var4)) {
                            z0Var4 = (z0) ce0.y(es2Var3, ds2.t);
                            if (z0Var4 != null) {
                                r1Var3.a(new o1(262144, z0Var4.a));
                            }
                            z0Var5 = (z0) ce0.y(es2Var3, ds2.u);
                            if (z0Var5 != null) {
                                r1Var3.a(new o1(524288, z0Var5.a));
                            }
                            z0Var6 = (z0) ce0.y(es2Var3, ds2.v);
                            if (z0Var6 != null) {
                                r1Var3.a(new o1(1048576, z0Var6.a));
                            }
                            rs2Var3 = ds2.x;
                            if (zx1Var3.c(rs2Var3)) {
                                list2 = (List) es2Var3.c(rs2Var3);
                                size2 = list2.size();
                                fx1Var = jb.R;
                                if (size2 < fx1Var.b) {
                                    throw new IllegalStateException("Can't have more than " + fx1Var.b + " custom actions for one widget");
                                }
                                yy2 yy2Var6 = new yy2(0);
                                ox1 ox1VarA3 = r02.a();
                                yy2Var3 = yy2Var2;
                                if (xq1.x(yy2Var3.g, i7, yy2Var3.e) >= 0) {
                                    ox1Var = (ox1) sb.L(yy2Var3, i7);
                                    iArr = fx1Var.a;
                                    i9 = fx1Var.b;
                                    iArrCopyOf = new int[16];
                                    i10 = 0;
                                    i11 = 0;
                                    while (i10 < i9) {
                                        int i412 = iArr[i10];
                                        int i413 = i9;
                                        i12 = i11 + 1;
                                        int i414 = i10;
                                        if (iArrCopyOf.length < i12) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i11] = i412;
                                        i10 = i414 + 1;
                                        i11 = i12;
                                        i9 = i413;
                                    }
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        p91.x(list2.get(0));
                                        ox1Var.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() <= 0) {
                                        p91.x(arrayList2.get(0));
                                        if (i11 <= 0) {
                                            fo.p("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i415 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    p91.x(list2.get(0));
                                    fx1Var.c(0);
                                    throw null;
                                }
                                jbVar.v.b(i7, yy2Var6);
                                yy2Var3.b(i7, ox1VarA3);
                            }
                        }
                        zF = ym3.F(js2Var4, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zF);
                        } else {
                            r1Var3.f(1, zF);
                        }
                        iD = jbVar.F.d(i7);
                        if (iD != -1) {
                            ehVarI2 = ig0.I(dbVar2.getAndroidViewsHandler$ui(), iD);
                            if (ehVarI2 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(ehVarI2);
                                dbVar = dbVar2;
                            } else {
                                dbVar = dbVar2;
                                accessibilityNodeInfo3.setTraversalBefore(dbVar, iD);
                            }
                            bundle = null;
                            jbVar.e(i7, r1Var3, jbVar.H, null);
                        } else {
                            dbVar = dbVar2;
                            bundle = null;
                        }
                        iD2 = jbVar.G.d(i7);
                        if (iD2 != -1) {
                            accessibilityNodeInfo3.setTraversalAfter(ehVarI);
                            jbVar.e(i7, r1Var3, jbVar.I, bundle);
                        }
                        str3 = (String) ce0.y(es2Var3, ps2.b);
                        if (str3 != null) {
                            r1Var3.g(str3);
                        }
                        r1Var4 = r1Var3;
                    } else {
                        jbVar = jbVar2;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(am1.C(js2Var4) ^ z2);
                    if (js2Var4.n()) {
                        js2VarL2 = js2Var4.l();
                        js2VarL2.getClass();
                    } else {
                        js2VarL2 = js2Var4;
                    }
                    if (js2VarL2.m().g()) {
                        z3 = false;
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    } else {
                        z3 = false;
                    }
                    objG10 = zx1Var3.g(os2.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    if (objG10 == null) {
                        b81.u();
                        return null;
                    }
                    accessibilityNodeInfo3.setClickable(z3);
                    objG11 = zx1Var3.g(ds2.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    z0Var = (z0) objG11;
                    if (z0Var != null) {
                        objG22 = zx1Var3.g(os2.J);
                        if (objG22 == null) {
                            objG22 = null;
                        }
                        boolean zF8 = o51.f(objG22, bool2);
                        if (vh2Var3 == null) {
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z5);
                        if (ym3.x(js2Var4)) {
                            r1Var3.a(new o1(null, 16, z0Var.a, null));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    objG12 = zx1Var3.g(ds2.c);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    z0Var2 = (z0) objG12;
                    if (z0Var2 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (ym3.x(js2Var4)) {
                            r1Var3.a(new o1(null, 32, z0Var2.a, null));
                        }
                    }
                    z0Var3 = (z0) ce0.y(es2Var3, ds2.q);
                    if (z0Var3 != null) {
                        r1Var3.a(new o1(16384, z0Var3.a));
                    }
                    if (ym3.x(js2Var4)) {
                        z0Var9 = (z0) ce0.y(es2Var3, ds2.k);
                        if (z0Var9 != null) {
                            r1Var3.a(new o1(2097152, z0Var9.a));
                        }
                        z0Var10 = (z0) ce0.y(es2Var3, ds2.p);
                        if (z0Var10 != null) {
                            r1Var3.a(new o1(R.id.accessibilityActionImeEnter, z0Var10.a));
                        }
                        z0Var11 = (z0) ce0.y(es2Var3, ds2.r);
                        if (z0Var11 != null) {
                            r1Var3.a(new o1(65536, z0Var11.a));
                        }
                        z0Var12 = (z0) ce0.y(es2Var3, ds2.s);
                        if (z0Var12 != null) {
                            primaryClipDescription = dbVar2.getClipboardManager().a().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                r1Var3.a(new o1(32768, z0Var12.a));
                            }
                        }
                    }
                    strO = jb.o(js2Var4);
                    if (strO != null) {
                        accessibilityNodeInfo4.setTextSelection(jbVar.m(js2Var4), jbVar.l(js2Var4));
                        z0Var8 = (z0) ce0.y(es2Var3, ds2.j);
                        if (z0Var8 != null) {
                            str4 = z0Var8.a;
                        } else {
                            str4 = null;
                        }
                        r1Var3.a(new o1(131072, str4));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) ce0.y(es2Var3, os2.a);
                        if (list3 != null) {
                            hb1VarU = hb1Var2.u();
                            while (true) {
                                if (hb1VarU == null) {
                                    hb1VarU = null;
                                    break;
                                }
                                es2VarW2 = hb1VarU.w();
                                if (es2VarW2 == null) {
                                }
                                hb1VarU = hb1VarU.u();
                            }
                            if (hb1VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                es2VarW = hb1VarU.w();
                                if (es2VarW != null) {
                                    objG21 = es2VarW.e.g(rs2Var2);
                                    if (objG21 == null) {
                                        objG21 = null;
                                    }
                                    zF2 = o51.f(objG21, bool2);
                                } else {
                                    zF2 = false;
                                }
                                if (zF2) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            hb1VarU = hb1Var2.u();
                            while (true) {
                                if (hb1VarU == null) {
                                    hb1VarU = null;
                                    break;
                                }
                                es2VarW2 = hb1VarU.w();
                                if (es2VarW2 == null) {
                                }
                                hb1VarU = hb1VarU.u();
                            }
                            if (hb1VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                es2VarW = hb1VarU.w();
                                if (es2VarW != null) {
                                    objG21 = es2VarW.e.g(rs2Var2);
                                    if (objG21 == null) {
                                        objG21 = null;
                                    }
                                    zF2 = o51.f(objG21, bool2);
                                } else {
                                    zF2 = false;
                                }
                                if (zF2) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceE = r1Var3.e();
                    if (charSequenceE != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (zx1Var3.c(os2.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (zx1Var3.c(os2.Q)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    oc2Var = (oc2) ce0.y(es2Var3, os2.c);
                    if (oc2Var != null) {
                        f = oc2Var.a;
                        fyVar = oc2Var.b;
                        rs2Var4 = ds2.i;
                        if (zx1Var3.c(rs2Var4)) {
                            r1Var3.g("android.widget.SeekBar");
                        } else {
                            r1Var3.g("android.widget.ProgressBar");
                        }
                        if (oc2Var != oc2.d) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) fyVar.a()).floatValue(), ((Number) fyVar.b()).floatValue(), f));
                        }
                        if (zx1Var3.c(rs2Var4)) {
                            fFloatValue = ((Number) fyVar.b()).floatValue();
                            fFloatValue2 = ((Number) fyVar.a()).floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f < fFloatValue) {
                                r1Var3.a(o1.e);
                            }
                            fFloatValue3 = ((Number) fyVar.a()).floatValue();
                            fFloatValue4 = ((Number) fyVar.b()).floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f > fFloatValue3) {
                                r1Var3.a(o1.f);
                            }
                        }
                    }
                    if (ym3.x(js2Var4)) {
                        r1Var3.a(new o1(R.id.accessibilityActionSetProgress, z0Var7.a));
                    }
                    zm3.R(r1Var3, js2Var4);
                    objG13 = js2Var4.k().e.g(os2.g);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    if (objG13 == null) {
                        js2VarL3 = js2Var4.l();
                        if (js2VarL3 != null) {
                            objG18 = js2VarL3.k().e.g(os2.e);
                            if (objG18 == null) {
                                objG18 = null;
                            }
                            if (objG18 != null) {
                                objG19 = js2VarL3.k().e.g(os2.f);
                                if (objG19 == null) {
                                    objG19 = null;
                                }
                                pyVar = (py) objG19;
                                if (pyVar != null) {
                                    if (js2Var4.k().e.c(os2.J)) {
                                        arrayList3 = new ArrayList();
                                        listJ2 = js2.j(4, js2VarL3);
                                        size3 = listJ2.size();
                                        i14 = 0;
                                        while (i13 < size3) {
                                            js2Var = (js2) listJ2.get(i13);
                                            if (js2Var.k().e.c(os2.J)) {
                                                arrayList3.add(js2Var);
                                                if (js2Var.c.v() < js2Var4.c.v()) {
                                                    i14++;
                                                }
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            zH = zm3.h(arrayList3);
                                            if (zH) {
                                                i15 = 0;
                                            } else {
                                                i15 = i14;
                                            }
                                            if (zH) {
                                                i16 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            objG20 = js2Var4.k().e.g(os2.J);
                                            if (objG20 == null) {
                                                objG20 = Boolean.FALSE;
                                            }
                                            accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                        }
                                    }
                                } else if (js2Var4.k().e.c(os2.J)) {
                                    arrayList3 = new ArrayList();
                                    listJ2 = js2.j(4, js2VarL3);
                                    size3 = listJ2.size();
                                    i14 = 0;
                                    while (i13 < size3) {
                                        js2Var = (js2) listJ2.get(i13);
                                        if (js2Var.k().e.c(os2.J)) {
                                            arrayList3.add(js2Var);
                                            if (js2Var.c.v() < js2Var4.c.v()) {
                                                i14++;
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        zH = zm3.h(arrayList3);
                                        if (zH) {
                                            i15 = 0;
                                        } else {
                                            i15 = i14;
                                        }
                                        if (zH) {
                                            i16 = i14;
                                        } else {
                                            i16 = 0;
                                        }
                                        objG20 = js2Var4.k().e.g(os2.J);
                                        if (objG20 == null) {
                                            objG20 = Boolean.FALSE;
                                        }
                                        accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, 1, i16, 1, false, ((Boolean) objG20).booleanValue()));
                                    }
                                }
                            }
                        }
                    } else {
                        b81.u();
                    }
                    on2Var = (on2) ce0.y(es2Var3, os2.v);
                    z0 z0Var16 = (z0) ce0.y(es2Var3, ds2.d);
                    if (on2Var != null) {
                        objG16 = js2Var4.k().e.g(os2.f);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        if (objG16 == null) {
                            objG17 = js2Var4.k().e.g(os2.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 == null) {
                                r1Var3.g("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) on2Var.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ym3.x(js2Var4)) {
                            zU = jb.u(on2Var);
                            qa1Var = qa1.f;
                            if (zU) {
                                r1Var3.a(o1.e);
                                hb1Var = hb1Var2;
                                if (hb1Var.E == qa1Var) {
                                    o1Var2 = o1.h;
                                } else {
                                    o1Var2 = o1.j;
                                }
                                r1Var3.a(o1Var2);
                            } else {
                                hb1Var = hb1Var2;
                            }
                            if (jb.t(on2Var)) {
                                r1Var3.a(o1.f);
                                if (hb1Var.E == qa1Var) {
                                    o1Var = o1.j;
                                } else {
                                    o1Var = o1.h;
                                }
                                r1Var3.a(o1Var);
                            }
                        }
                    }
                    on2Var2 = (on2) ce0.y(es2Var3, os2.w);
                    if (on2Var2 != null) {
                        objG14 = js2Var4.k().e.g(os2.f);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            objG15 = js2Var4.k().e.g(os2.e);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                r1Var3.g("android.widget.ScrollView");
                            }
                        }
                        if (((Number) on2Var2.b.invoke()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ym3.x(js2Var4)) {
                            if (jb.u(on2Var2)) {
                                r1Var3.a(o1.e);
                                r1Var3.a(o1.i);
                            }
                            if (jb.t(on2Var2)) {
                                r1Var3.a(o1.f);
                                r1Var3.a(o1.g);
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 29) {
                        da0.k(r1Var3, js2Var4);
                    }
                    charSequence = (CharSequence) ce0.y(es2Var3, os2.d);
                    if (i8 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (ym3.x(js2Var4)) {
                        z0Var4 = (z0) ce0.y(es2Var3, ds2.t);
                        if (z0Var4 != null) {
                            r1Var3.a(new o1(262144, z0Var4.a));
                        }
                        z0Var5 = (z0) ce0.y(es2Var3, ds2.u);
                        if (z0Var5 != null) {
                            r1Var3.a(new o1(524288, z0Var5.a));
                        }
                        z0Var6 = (z0) ce0.y(es2Var3, ds2.v);
                        if (z0Var6 != null) {
                            r1Var3.a(new o1(1048576, z0Var6.a));
                        }
                        rs2Var3 = ds2.x;
                        if (zx1Var3.c(rs2Var3)) {
                            list2 = (List) es2Var3.c(rs2Var3);
                            size2 = list2.size();
                            fx1Var = jb.R;
                            if (size2 < fx1Var.b) {
                                throw new IllegalStateException("Can't have more than " + fx1Var.b + " custom actions for one widget");
                            }
                            yy2 yy2Var7 = new yy2(0);
                            ox1 ox1VarA4 = r02.a();
                            yy2Var3 = yy2Var2;
                            if (xq1.x(yy2Var3.g, i7, yy2Var3.e) >= 0) {
                                ox1Var = (ox1) sb.L(yy2Var3, i7);
                                iArr = fx1Var.a;
                                i9 = fx1Var.b;
                                iArrCopyOf = new int[16];
                                i10 = 0;
                                i11 = 0;
                                while (i10 < i9) {
                                    int i416 = iArr[i10];
                                    int i417 = i9;
                                    i12 = i11 + 1;
                                    int i418 = i10;
                                    if (iArrCopyOf.length < i12) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i11] = i416;
                                    i10 = i418 + 1;
                                    i11 = i12;
                                    i9 = i417;
                                }
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    p91.x(list2.get(0));
                                    ox1Var.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() <= 0) {
                                    p91.x(arrayList2.get(0));
                                    if (i11 <= 0) {
                                        fo.p("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i419 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                p91.x(list2.get(0));
                                fx1Var.c(0);
                                throw null;
                            }
                            jbVar.v.b(i7, yy2Var7);
                            yy2Var3.b(i7, ox1VarA4);
                        }
                    }
                    zF = ym3.F(js2Var4, resources);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zF);
                    } else {
                        r1Var3.f(1, zF);
                    }
                    iD = jbVar.F.d(i7);
                    if (iD != -1) {
                        ehVarI2 = ig0.I(dbVar2.getAndroidViewsHandler$ui(), iD);
                        if (ehVarI2 != null) {
                            accessibilityNodeInfo3.setTraversalBefore(ehVarI2);
                            dbVar = dbVar2;
                        } else {
                            dbVar = dbVar2;
                            accessibilityNodeInfo3.setTraversalBefore(dbVar, iD);
                        }
                        bundle = null;
                        jbVar.e(i7, r1Var3, jbVar.H, null);
                    } else {
                        dbVar = dbVar2;
                        bundle = null;
                    }
                    iD2 = jbVar.G.d(i7);
                    if (iD2 != -1) {
                        accessibilityNodeInfo3.setTraversalAfter(ehVarI);
                        jbVar.e(i7, r1Var3, jbVar.I, bundle);
                    }
                    str3 = (String) ce0.y(es2Var3, ps2.b);
                    if (str3 != null) {
                        r1Var3.g(str3);
                    }
                    r1Var4 = r1Var3;
                } else {
                    jbVar = jbVar2;
                    i7 = i;
                    r1Var4 = null;
                }
            }
        }
        if (jbVar.s) {
            if (i7 == jbVar.o) {
                jbVar.q = r1Var4;
            }
            if (i7 == jbVar.p) {
                jbVar.r = r1Var4;
            }
        }
        return r1Var4;
    }

    @Override // defpackage.t1
    public final r1 v(int i) {
        jb jbVar = this.g;
        if (i != 1) {
            if (i == 2) {
                return t(jbVar.o);
            }
            fo.i(p91.l(i, "Unknown focus type: "));
            return null;
        }
        int i2 = jbVar.p;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return t(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x025f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:271:0x042e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0430  */
    /* JADX WARN: Code duplicated, block: B:275:0x0435  */
    /* JADX WARN: Code duplicated, block: B:276:0x0437  */
    /* JADX WARN: Code duplicated, block: B:279:0x043d  */
    /* JADX WARN: Code duplicated, block: B:280:0x043f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0445  */
    /* JADX WARN: Code duplicated, block: B:284:0x0447  */
    /* JADX WARN: Code duplicated, block: B:287:0x044d  */
    /* JADX WARN: Code duplicated, block: B:288:0x044f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0455  */
    /* JADX WARN: Code duplicated, block: B:292:0x0457  */
    /* JADX WARN: Code duplicated, block: B:299:0x0463  */
    /* JADX WARN: Code duplicated, block: B:306:0x046f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0474  */
    /* JADX WARN: Code duplicated, block: B:311:0x047c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0487  */
    /* JADX WARN: Code duplicated, block: B:317:0x048c  */
    /* JADX WARN: Code duplicated, block: B:319:0x0490  */
    /* JADX WARN: Code duplicated, block: B:321:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:331:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:334:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:338:0x0501  */
    /* JADX WARN: Code duplicated, block: B:341:0x0506  */
    /* JADX WARN: Code duplicated, block: B:346:0x0520  */
    /* JADX WARN: Code duplicated, block: B:349:0x0529  */
    /* JADX WARN: Code duplicated, block: B:353:0x0530  */
    /* JADX WARN: Code duplicated, block: B:355:0x053a  */
    /* JADX WARN: Code duplicated, block: B:358:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:401:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:404:0x05d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:407:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:409:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:413:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:415:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:422:0x060f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0613  */
    /* JADX WARN: Code duplicated, block: B:426:0x061b  */
    /* JADX WARN: Code duplicated, block: B:427:0x061d  */
    /* JADX WARN: Code duplicated, block: B:429:0x0621  */
    /* JADX WARN: Code duplicated, block: B:431:0x0627  */
    /* JADX WARN: Code duplicated, block: B:432:0x0629  */
    /* JADX WARN: Code duplicated, block: B:435:0x062e  */
    /* JADX WARN: Code duplicated, block: B:502:0x0714 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:503:0x0716  */
    /* JADX WARN: Code duplicated, block: B:505:0x0724  */
    /* JADX WARN: Code duplicated, block: B:506:0x0726  */
    /* JADX WARN: Code duplicated, block: B:510:0x072c  */
    /* JADX WARN: Code duplicated, block: B:512:0x0732  */
    /* JADX WARN: Code duplicated, block: B:515:0x0740  */
    /* JADX WARN: Code duplicated, block: B:520:0x074e  */
    /* JADX WARN: Code duplicated, block: B:532:0x0765  */
    /* JADX WARN: Code duplicated, block: B:537:0x0777  */
    /* JADX WARN: Code duplicated, block: B:544:0x0789  */
    /* JADX WARN: Code duplicated, block: B:546:0x078d  */
    /* JADX WARN: Code duplicated, block: B:548:0x079a  */
    /* JADX WARN: Code duplicated, block: B:550:0x079e  */
    /* JADX WARN: Code duplicated, block: B:563:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:565:0x0803 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:566:0x0805  */
    /* JADX WARN: Code duplicated, block: B:567:0x0807  */
    /* JADX WARN: Code duplicated, block: B:570:0x080e  */
    /* JADX WARN: Code duplicated, block: B:571:0x0813  */
    /* JADX WARN: Code duplicated, block: B:574:0x081b  */
    /* JADX WARN: Code duplicated, block: B:576:0x0823  */
    /* JADX WARN: Code duplicated, block: B:588:0x0844 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:589:0x0846  */
    /* JADX WARN: Code duplicated, block: B:590:0x0848  */
    /* JADX WARN: Code duplicated, block: B:593:0x084c  */
    /* JADX WARN: Code duplicated, block: B:594:0x084e  */
    /* JADX WARN: Code duplicated, block: B:597:0x0862  */
    /* JADX WARN: Code duplicated, block: B:599:0x0867  */
    /* JADX WARN: Code duplicated, block: B:601:0x0877 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:603:0x087a  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005c, please report this as an issue */
    @Override // defpackage.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb.y(int, int, android.os.Bundle):boolean");
    }
}
