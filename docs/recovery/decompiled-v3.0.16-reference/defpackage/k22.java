package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class k22 {
    public static final lz A;
    public static final lz B;
    public static final float C;
    public static final lz D;
    public static final float E;
    public static final lz F;
    public static final float G;
    public static final lz H;
    public static final float I;
    public static final cu2 J;
    public static final float K;
    public static final lz L;
    public static final float M;
    public static final float N;
    public static final lz O;
    public static final float P;
    public static x01 Q;
    public static x01 R;
    public static x01 S;
    public static x01 T;
    public static x01 U;
    public static final p10 j;
    public static final p10 l;
    public static final k91 y;
    public static final ui a = new ui(Float.POSITIVE_INFINITY);
    public static final vi b = new vi(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final wi c = new wi(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final xi d = new xi(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ui e = new ui(Float.NEGATIVE_INFINITY);
    public static final vi f = new vi(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final wi g = new wi(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final xi h = new xi(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final p10 i = new p10(new s10(2), false, 759698998);
    public static final p10 k = new p10(new b20(8), false, -135026016);
    public static final p10 m = new p10(new b20(22), false, -1041087938);
    public static final p10 n = new p10(new b20(23), false, -1610878396);
    public static final p10 o = new p10(new c20(29), false, 360253584);
    public static final float[] p = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] q = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final gk3 r = new gk3(0.31006f, 0.31616f);
    public static final gk3 s = new gk3(0.34567f, 0.3585f);
    public static final gk3 t = new gk3(0.32168f, 0.33767f);
    public static final gk3 u = new gk3(0.31271f, 0.32902f);
    public static final float[] v = {0.964212f, 1.0f, 0.825188f};
    public static final y81[] w = new y81[0];
    public static final k91 x = new k91(26);
    public static final k91 z = new k91(28);

    static {
        int i2 = 27;
        j = new p10(new s10(i2), false, 682780636);
        l = new p10(new a20(i2), false, -1451591241);
        y = new k91(i2);
        lz lzVar = lz.m;
        A = lzVar;
        lz lzVar2 = lz.i;
        B = lzVar2;
        C = 0.38f;
        D = lzVar2;
        E = 0.38f;
        F = lzVar2;
        G = 0.12f;
        H = lzVar;
        I = 44.0f;
        J = cu2.g;
        K = 4.0f;
        L = lz.o;
        M = 16.0f;
        N = 4.0f;
        O = lz.j;
        P = 0.38f;
    }

    public static final dv1 A(dv1 dv1Var, qu0 qu0Var) {
        return dv1Var.d(new ra1(qu0Var));
    }

    public static final float[] B(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] C(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    public static final long D(int i2, int i3, String str) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c5 = '0';
        if (i13 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i5 = i16;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i17);
                i5 += 4;
                i16 = i12;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i5 == i3) {
                        break loop2;
                    }
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i18);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = cCharAt5 - c5;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i15--;
                }
                i21++;
                cCharAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char cCharAt7 = str.charAt(i4);
                j3 = 0;
                while (i4 != i13 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                    j3 = (j3 * 10) + ((long) (cCharAt7 - '0'));
                    i4++;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + ((long) (cCharAt8 - '0'));
                        i22++;
                        cCharAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c4 = c3;
            } else {
                j3 = j5;
                c4 = 0;
            }
        } else {
            j3 = j5;
            c4 = 0;
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compareUnsigned(j3, 16777216L) <= 0) {
            float f2 = j3;
            float[] fArr = p;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z2) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z2 != 0 ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j7 = q[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j8 = j3 << iNumberOfLeadingZeros;
        long j9 = j8 & j2;
        long j10 = j8 >>> c2;
        long j11 = j7 & j2;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j2)) >>> c2) + (j14 >>> c2);
        int i23 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i23 + 9);
        int i24 = iNumberOfLeadingZeros + (i23 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i24--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i24);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z2 != 0 ? Long.MIN_VALUE : 0L)))) & j2);
    }

    public static final void E(me1 me1Var, f83 f83Var, e12 e12Var) {
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            y83 y83VarD = me1Var.d();
            if (y83VarD == null) {
                return;
            }
            p83 p83Var = me1Var.e;
            if (p83Var == null) {
                return;
            }
            pa1 pa1VarC = me1Var.c();
            if (pa1VarC == null) {
                return;
            }
            v63.d(f83Var, me1Var.a, y83VarD.a, pa1VarC, p83Var, me1Var.b(), e12Var);
        } finally {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
        }
    }

    public static final dv1 F(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new p50(lu0Var));
    }

    public static final dv1 G(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new a22(lu0Var));
    }

    public static final void H(l83 l83Var, me1 me1Var, f83 f83Var, c11 c11Var, e12 e12Var) {
        d31 d31Var = me1Var.d;
        f70 f70Var = me1Var.v;
        f70 f70Var2 = me1Var.w;
        we2 we2Var = new we2();
        ji1 ji1Var = new ji1(d31Var, f70Var, we2Var, 20);
        j92 j92Var = l83Var.a;
        j92Var.a(f83Var, c11Var, ji1Var, f70Var2);
        p83 p83Var = new p83(l83Var, j92Var);
        l83Var.b.set(p83Var);
        we2Var.e = p83Var;
        me1Var.e = p83Var;
        E(me1Var, f83Var, e12Var);
    }

    public static final BlendMode I(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode J(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final u4 K(boolean z2, boolean z3, boolean z4, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        boolean z5 = false;
        boolean z6 = z2 && str2.length() > 0 && str2.length() < 12;
        boolean z7 = z2 && str3.length() > 0 && !str3.equals(str2);
        if (!z3 && z4 && !l13.k0(str) && str2.length() > 0 && (!z2 || (str2.length() >= 12 && str2.equals(str3)))) {
            z5 = true;
        }
        return new u4(z6, z7, z5);
    }

    public static final dv1 L(sk3 sk3Var) {
        return new o31(sk3Var);
    }

    public static final oh a(float f2, float f3) {
        return new oh(Float.valueOf(f2), o51.v0, Float.valueOf(f3), 8);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(kk kkVar, pu0 pu0Var, f30 f30Var, int i2) {
        gh3 gh3Var;
        boolean z2;
        ee2 ee2VarT;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-149765515);
        q41 q41Var = ov0Var.x;
        l72 l72VarL = ov0Var.l();
        ov0Var.Z(201, j30.b);
        Object objQ = ov0Var.Q();
        if (o51.f(objQ, d30.a)) {
            gh3Var = null;
        } else {
            objQ.getClass();
            gh3Var = (gh3) objQ;
        }
        cd2 cd2Var = (cd2) kkVar.f;
        gh3 gh3VarC = cd2Var.c(kkVar, gh3Var);
        boolean zEquals = gh3VarC.equals(gh3Var);
        if (!zEquals) {
            ov0Var.m0(gh3VarC);
        }
        if (!ov0Var.S) {
            gx2 gx2Var = ov0Var.G;
            Object objB = gx2Var.b(gx2Var.b, gx2Var.g);
            objB.getClass();
            l72 l72Var = (l72) objB;
            if (!(ov0Var.E() && zEquals) && (kkVar.e || !l72VarL.containsKey(cd2Var))) {
                l72VarL = l72VarL.d(cd2Var, gh3VarC);
            } else if ((zEquals && !ov0Var.w) || !ov0Var.w) {
                l72VarL = l72Var;
            }
            if (ov0Var.y || l72Var != l72VarL) {
                z2 = true;
            }
            if (z2 && !ov0Var.S) {
                ov0Var.O(l72VarL);
            }
            q41Var.c(ov0Var.w ? 1 : 0);
            ov0Var.w = z2;
            ov0Var.K = l72VarL;
            ov0Var.X(202, 0, j30.c, l72VarL);
            pu0Var.invoke(ov0Var, Integer.valueOf((i2 >> 3) & 14));
            ov0Var.p(false);
            ov0Var.p(false);
            ov0Var.w = q41Var.b() != 0;
            ov0Var.K = null;
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new fj(i2, 2, kkVar, pu0Var);
            }
        }
        if (kkVar.e || !l72VarL.containsKey(cd2Var)) {
            l72VarL = l72VarL.d(cd2Var, gh3VarC);
        }
        ov0Var.J = true;
        z2 = false;
        if (z2) {
            ov0Var.O(l72VarL);
        }
        q41Var.c(ov0Var.w ? 1 : 0);
        ov0Var.w = z2;
        ov0Var.K = l72VarL;
        ov0Var.X(202, 0, j30.c, l72VarL);
        pu0Var.invoke(ov0Var, Integer.valueOf((i2 >> 3) & 14));
        ov0Var.p(false);
        ov0Var.p(false);
        ov0Var.w = q41Var.b() != 0;
        ov0Var.K = null;
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i2, 2, kkVar, pu0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(kk[] kkVarArr, pu0 pu0Var, f30 f30Var, int i2) {
        l72 l72VarD;
        boolean z2;
        ee2 ee2VarT;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(415205898);
        q41 q41Var = ov0Var.x;
        l72 l72VarL = ov0Var.l();
        ov0Var.Z(201, j30.b);
        boolean z3 = ov0Var.S;
        i22 i22Var = j30.d;
        if (z3) {
            l72 l72VarX = ji2.X(kkVarArr, l72VarL, l72.h);
            l72VarL.getClass();
            k72 k72Var = new k72(l72VarL);
            k72Var.k = l72VarL;
            k72Var.putAll(l72VarX);
            l72VarD = k72Var.a();
            ov0Var.Z(204, i22Var);
            ov0Var.I();
            ov0Var.n0(l72VarD);
            ov0Var.I();
            ov0Var.n0(l72VarX);
            ov0Var.p(false);
            ov0Var.J = true;
        } else {
            gx2 gx2Var = ov0Var.G;
            Object objH = gx2Var.h(gx2Var.g, 0);
            objH.getClass();
            l72 l72Var = (l72) objH;
            gx2 gx2Var2 = ov0Var.G;
            Object objH2 = gx2Var2.h(gx2Var2.g, 1);
            objH2.getClass();
            l72 l72Var2 = (l72) objH2;
            l72 l72VarX2 = ji2.X(kkVarArr, l72VarL, l72Var2);
            if (!ov0Var.E() || ov0Var.y || !l72Var2.equals(l72VarX2)) {
                l72VarL.getClass();
                k72 k72Var2 = new k72(l72VarL);
                k72Var2.k = l72VarL;
                k72Var2.putAll(l72VarX2);
                l72VarD = k72Var2.a();
                ov0Var.Z(204, i22Var);
                ov0Var.I();
                ov0Var.n0(l72VarD);
                ov0Var.I();
                ov0Var.n0(l72VarX2);
                ov0Var.p(false);
                if (ov0Var.y || !l72VarD.equals(l72Var)) {
                    z2 = true;
                }
                if (z2 && !ov0Var.S) {
                    ov0Var.O(l72VarD);
                }
                q41Var.c(ov0Var.w ? 1 : 0);
                ov0Var.w = z2;
                ov0Var.K = l72VarD;
                ov0Var.X(202, 0, j30.c, l72VarD);
                pu0Var.invoke(ov0Var, Integer.valueOf((i2 >> 3) & 14));
                ov0Var.p(false);
                ov0Var.p(false);
                ov0Var.w = q41Var.b() != 0;
                ov0Var.K = null;
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new fj(i2, 3, kkVarArr, pu0Var);
                }
            }
            ov0Var.l = ov0Var.G.s() + ov0Var.l;
            l72VarD = l72Var;
        }
        z2 = false;
        if (z2) {
            ov0Var.O(l72VarD);
        }
        q41Var.c(ov0Var.w ? 1 : 0);
        ov0Var.w = z2;
        ov0Var.K = l72VarD;
        ov0Var.X(202, 0, j30.c, l72VarD);
        pu0Var.invoke(ov0Var, Integer.valueOf((i2 >> 3) & 14));
        ov0Var.p(false);
        ov0Var.p(false);
        ov0Var.w = q41Var.b() != 0;
        ov0Var.K = null;
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i2, 3, kkVarArr, pu0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:204:0x040d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0418  */
    /* JADX WARN: Code duplicated, block: B:207:0x0426  */
    /* JADX WARN: Code duplicated, block: B:209:0x0438  */
    /* JADX WARN: Code duplicated, block: B:212:0x043d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0446  */
    /* JADX WARN: Code duplicated, block: B:215:0x044e  */
    /* JADX WARN: Code duplicated, block: B:222:0x046b  */
    /* JADX WARN: Code duplicated, block: B:225:0x0483  */
    /* JADX WARN: Code duplicated, block: B:228:0x048e  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:233:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:236:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:239:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:242:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:245:0x04df  */
    /* JADX WARN: Code duplicated, block: B:248:0x0564  */
    /* JADX WARN: Code duplicated, block: B:249:0x0566  */
    /* JADX WARN: Code duplicated, block: B:252:0x0573  */
    /* JADX WARN: Code duplicated, block: B:253:0x0575  */
    /* JADX WARN: Code duplicated, block: B:256:0x0587  */
    /* JADX WARN: Code duplicated, block: B:257:0x058a  */
    /* JADX WARN: Code duplicated, block: B:268:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:277:0x0656  */
    /* JADX WARN: Code duplicated, block: B:281:0x0660  */
    /* JADX WARN: Code duplicated, block: B:283:0x0666 A[PHI: r24
      0x0666: PHI (r24v7 dv1) = (r24v5 dv1), (r24v9 dv1) binds: [B:282:0x0664, B:280:0x065d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:284:0x0668  */
    /* JADX WARN: Code duplicated, block: B:287:0x0671  */
    /* JADX WARN: Code duplicated, block: B:289:0x0675  */
    /* JADX WARN: Code duplicated, block: B:290:0x0678  */
    /* JADX WARN: Code duplicated, block: B:291:0x0685 A[PHI: r62
      0x0685: PHI (r62v2 c30) = (r2v23 c30), (r62v3 c30) binds: [B:286:0x066f, B:289:0x0675] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:294:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:297:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:298:0x0700  */
    /* JADX WARN: Code duplicated, block: B:301:0x0713  */
    /* JADX WARN: Code duplicated, block: B:302:0x0715  */
    /* JADX WARN: Code duplicated, block: B:305:0x0722 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x0728  */
    /* JADX WARN: Code duplicated, block: B:311:0x0759  */
    /* JADX WARN: Code duplicated, block: B:319:0x078e  */
    /* JADX WARN: Code duplicated, block: B:321:0x0791  */
    /* JADX WARN: Code duplicated, block: B:322:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:325:0x07b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:329:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:330:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:333:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:335:0x07db  */
    /* JADX WARN: Code duplicated, block: B:341:0x07e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:344:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:347:0x0809  */
    /* JADX WARN: Code duplicated, block: B:349:0x080c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0829  */
    /* JADX WARN: Code duplicated, block: B:355:0x082d  */
    /* JADX WARN: Code duplicated, block: B:359:0x084b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x084d  */
    /* JADX WARN: Code duplicated, block: B:363:0x085a  */
    /* JADX WARN: Code duplicated, block: B:369:0x0874  */
    /* JADX WARN: Code duplicated, block: B:372:0x0898  */
    /* JADX WARN: Code duplicated, block: B:375:0x08ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:376:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:379:0x092a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0952  */
    /* JADX WARN: Code duplicated, block: B:388:0x0955  */
    /* JADX WARN: Code duplicated, block: B:393:0x0969  */
    public static final void d(final f83 f83Var, final lu0 lu0Var, final dv1 dv1Var, final q93 q93Var, final ak3 ak3Var, final lu0 lu0Var2, final ix1 ix1Var, final st stVar, final boolean z2, final int i2, final int i3, final c11 c11Var, final m91 m91Var, final boolean z3, final qu0 qu0Var, f30 f30Var, final int i4, final int i5) {
        int i6;
        int i7;
        ov0 ov0Var;
        f93 f93Var;
        Object me1Var;
        lq0 lq0Var;
        q93 q93Var2;
        boolean z4;
        ov0 ov0Var2;
        dj djVar;
        xb0 xb0Var;
        lq0 lq0Var2;
        xb0 xb0Var2;
        boolean z5;
        d31 d31Var;
        p83 p83Var;
        f93 f93Var2;
        long j2;
        boolean z6;
        long j3;
        f83 f83Var2;
        f83 f83VarA;
        f83 f83Var3;
        Object objQ;
        c30 c30Var;
        final kf3 kf3Var;
        long jCurrentTimeMillis;
        Object objQ2;
        CoroutineScope coroutineScope;
        Object objQ3;
        gt gtVar;
        Object objQ4;
        x73 x73Var;
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        l83 l83Var;
        boolean z10;
        boolean zH;
        Object i70Var;
        c11 c11Var2;
        me1 me1Var2;
        int i11;
        l83 l83Var2;
        f83 f83Var4;
        CoroutineScope coroutineScope2;
        gt gtVar2;
        boolean z11;
        av1 av1Var;
        dv1 dv1VarS;
        ey1 ey1VarL;
        dv1 dv1Var2;
        boolean z12;
        boolean z13;
        Object objQ5;
        Object ydVar;
        x73 x73Var2;
        c30 c30Var2;
        ey1 ey1Var;
        dv1 dv1VarA;
        xc xcVar;
        boolean z14;
        boolean z15;
        boolean zH2;
        Object objQ6;
        l83 l83Var3;
        final x73 x73Var3;
        final me1 me1Var3;
        boolean z16;
        dv1 dv1VarP;
        boolean zH3;
        Object objQ7;
        boolean z17;
        boolean z18;
        Object objQ8;
        c11 c11Var3;
        final boolean z19;
        int i12;
        boolean z20;
        boolean zBooleanValue;
        boolean zG;
        Object objQ9;
        dv1 dv1VarD;
        Object qy2Var;
        long j4;
        long jC;
        boolean zH4;
        Object objQ10;
        final boolean z21;
        dv1 dv1VarP2;
        Long l2;
        long j5 = f83Var.b;
        f93 f93Var3 = f83Var.c;
        dj djVar2 = f83Var.a;
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(31062401);
        if ((i4 & 6) == 0) {
            i6 = i4 | (ov0Var3.f(f83Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= ov0Var3.h(lu0Var) ? 32 : 16;
        }
        int i13 = i4 & 384;
        int i14 = WorkQueueKt.BUFFER_CAPACITY;
        if (i13 == 0) {
            i6 |= ov0Var3.f(dv1Var) ? 256 : 128;
        }
        int i15 = i4 & 3072;
        int i16 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i15 == 0) {
            i6 |= ov0Var3.f(q93Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= ov0Var3.f(ak3Var) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= ov0Var3.h(lu0Var2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= ov0Var3.f(ix1Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= ov0Var3.f(stVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= ov0Var3.g(z2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= ov0Var3.d(i2) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (ov0Var3.d(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ov0Var3.f(c11Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            if (ov0Var3.f(m91Var)) {
                i14 = 256;
            }
            i7 |= i14;
        }
        if ((i5 & 3072) == 0) {
            if (ov0Var3.g(z3)) {
                i16 = 2048;
            }
            i7 |= i16;
        }
        if ((i5 & 24576) == 0) {
            i7 |= ov0Var3.g(false) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= ov0Var3.h(qu0Var) ? 131072 : 65536;
        }
        int i17 = i7 | 1572864;
        if (ov0Var3.T(i6 & 1, ((i6 & 306783379) == 306783378 && (599187 & i17) == 599186) ? false : true)) {
            ov0Var3.Y();
            if ((i4 & 1) != 0 && !ov0Var3.B()) {
                ov0Var3.W();
            }
            ov0Var3.q();
            Object objQ11 = ov0Var3.Q();
            c30 c30Var3 = d30.a;
            if (objQ11 == c30Var3) {
                objQ11 = new vp0();
                ov0Var3.m0(objQ11);
            }
            vp0 vp0Var = (vp0) objQ11;
            Object objQ12 = ov0Var3.Q();
            if (objQ12 == c30Var3) {
                je1 je1Var = ke1.a;
                objQ12 = new zd();
                ov0Var3.m0(objQ12);
            }
            ie1 ie1Var = (ie1) objQ12;
            Object objQ13 = ov0Var3.Q();
            if (objQ13 == c30Var3) {
                objQ13 = new l83(ie1Var);
                ov0Var3.m0(objQ13);
            }
            l83 l83Var4 = (l83) objQ13;
            xb0 xb0Var3 = (xb0) ov0Var3.j(z30.h);
            lq0 lq0Var3 = (lq0) ov0Var3.j(z30.k);
            long j6 = ((i93) ov0Var3.j(j93.a)).b;
            op0 op0Var = (op0) ov0Var3.j(z30.i);
            qk3 qk3Var = (qk3) ov0Var3.j(z30.v);
            ny2 ny2Var = (ny2) ov0Var3.j(z30.r);
            x32 x32Var = x32.e;
            x32 x32Var2 = (i2 == 1 && !z2 && c11Var.a) ? x32.f : x32Var;
            ov0Var3.c0(-213744626);
            Object[] objArr = {x32Var2};
            z92 z92Var = r73.g;
            boolean zD = ov0Var3.d(x32Var2.ordinal());
            Object objQ14 = ov0Var3.Q();
            if (zD || objQ14 == c30Var3) {
                objQ14 = new hd(x32Var2, 11);
                ov0Var3.m0(objQ14);
            }
            r73 r73Var = (r73) wc0.d0(objArr, z92Var, (au0) objQ14, ov0Var3, 0);
            ov0Var3.p(false);
            if (((x32) r73Var.f.getValue()) != x32Var2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(x32Var2 == x32Var ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i18 = i6 & 14;
            int i19 = 57344;
            boolean z22 = (i18 == 4) | ((i6 & 57344) == 16384);
            Object objQ15 = ov0Var3.Q();
            int i20 = 8;
            if (z22 || objQ15 == c30Var3) {
                bc3 bc3VarA = fh3.a(ak3Var, djVar2);
                e12 e12Var = bc3VarA.b;
                if (f93Var3 != null) {
                    f93Var = f93Var3;
                    long j7 = f93Var.a;
                    int i21 = f93.c;
                    int iR = e12Var.r((int) (j7 >> 32));
                    int iR2 = e12Var.r((int) (j7 & 4294967295L));
                    int iMin = Math.min(iR, iR2);
                    int iMax = Math.max(iR, iR2);
                    bj bjVar = new bj(bc3VarA.a);
                    bjVar.g.add(new aj(new uy2(0L, 0L, (jr0) null, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, p63.c, (xt2) null, 61439), iMin, iMax, i20));
                    objQ15 = new bc3(bjVar.g(), e12Var);
                } else {
                    f93Var = f93Var3;
                    objQ15 = bc3VarA;
                }
                ov0Var3.m0(objQ15);
            } else {
                r73Var = r73Var;
                i19 = 57344;
                djVar2 = djVar2;
                f93Var = f93Var3;
                i18 = i18;
            }
            bc3 bc3Var = (bc3) objQ15;
            dj djVar3 = bc3Var.a;
            final e12 e12Var2 = bc3Var.b;
            ee2 ee2VarA = ov0Var3.A();
            if (ee2VarA == null) {
                fo.n("no recompose scope found");
                return;
            }
            ee2VarA.b |= 1;
            boolean zF = ov0Var3.f(ny2Var);
            Object objQ16 = ov0Var3.Q();
            dj djVar4 = djVar2;
            uj0 uj0Var = uj0.e;
            if (zF || objQ16 == c30Var3) {
                lq0Var = lq0Var3;
                q93Var2 = q93Var;
                z4 = z2;
                ov0Var2 = ov0Var3;
                djVar = djVar3;
                xb0Var = xb0Var3;
                me1Var = new me1(new gc0(djVar3, q93Var2, z4, xb0Var3, lq0Var, uj0Var), ee2VarA, ny2Var);
                ov0Var2.m0(me1Var);
            } else {
                q93Var2 = q93Var;
                z4 = z2;
                me1Var = objQ16;
                xb0Var = xb0Var3;
                lq0Var = lq0Var3;
                djVar = djVar3;
                ov0Var2 = ov0Var3;
            }
            me1 me1Var4 = (me1) me1Var;
            me1Var4.u = lu0Var;
            me1Var4.z = j6;
            l91 l91Var = me1Var4.r;
            l91Var.b = m91Var;
            l91Var.c = op0Var;
            me1Var4.j = djVar4;
            gc0 gc0Var = me1Var4.a;
            if (o51.f((dj) gc0Var.b, djVar) && o51.f((q93) gc0Var.c, q93Var2) && gc0Var.a == z4 && o51.f((xb0) gc0Var.d, xb0Var) && o51.f((List) gc0Var.f, uj0Var)) {
                lq0Var2 = lq0Var;
                if (((lq0) gc0Var.e) == lq0Var2) {
                    xb0Var2 = xb0Var;
                }
                if (me1Var4.a != gc0Var) {
                    z5 = true;
                    me1Var4.p = true;
                } else {
                    z5 = true;
                }
                me1Var4.a = gc0Var;
                d31Var = me1Var4.d;
                p83Var = me1Var4.e;
                f93Var2 = f93Var;
                boolean zF2 = o51.f(f93Var2, ((mi0) d31Var.g).c());
                if (o51.f(((f83) d31Var.f).a.f, djVar4.f)) {
                    j2 = r16;
                    if (f93.b(((f83) d31Var.f).b, j2)) {
                        z6 = false;
                    } else {
                        ((mi0) d31Var.g).f(f93.f(j2), f93.e(j2));
                        z6 = true;
                    }
                    z5 = false;
                } else {
                    j2 = j5;
                    d31Var.g = new mi0(djVar4, j2);
                    z6 = false;
                }
                if (f93Var2 == null) {
                    mi0 mi0Var = (mi0) d31Var.g;
                    mi0Var.d = -1;
                    mi0Var.e = -1;
                } else {
                    j3 = f93Var2.a;
                    if (!f93.c(j3)) {
                        ((mi0) d31Var.g).e(f93.f(j3), f93.e(j3));
                    }
                }
                if (z5 && (z6 || zF2)) {
                    f83VarA = f83Var;
                    f83Var2 = f83VarA;
                } else {
                    mi0 mi0Var2 = (mi0) d31Var.g;
                    mi0Var2.d = -1;
                    mi0Var2.e = -1;
                    f83Var2 = f83Var;
                    f83VarA = f83.a(f83Var2, null, 0L, 3);
                }
                f83Var3 = (f83) d31Var.f;
                d31Var.f = f83VarA;
                if (p83Var != null) {
                    p83Var.a(f83Var3, f83VarA);
                }
                objQ = ov0Var2.Q();
                c30Var = c30Var3;
                if (objQ == c30Var) {
                    objQ = new kf3();
                    ov0Var2.m0(objQ);
                }
                kf3Var = (kf3) objQ;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (kf3Var.e) {
                    kf3Var.d = Long.valueOf(jCurrentTimeMillis);
                    kf3Var.a(f83Var2);
                } else {
                    l2 = kf3Var.d;
                    if (jCurrentTimeMillis > (l2 != null ? l2.longValue() : 0L) + 5000) {
                        kf3Var.d = Long.valueOf(jCurrentTimeMillis);
                        kf3Var.a(f83Var2);
                    }
                }
                objQ2 = ov0Var2.Q();
                if (objQ2 == c30Var) {
                    objQ2 = oi0.j(ov0Var2);
                    ov0Var2.m0(objQ2);
                }
                coroutineScope = (CoroutineScope) objQ2;
                objQ3 = ov0Var2.Q();
                if (objQ3 == c30Var) {
                    objQ3 = new gt();
                    ov0Var2.m0(objQ3);
                }
                gtVar = (gt) objQ3;
                objQ4 = ov0Var2.Q();
                if (objQ4 == c30Var) {
                    objQ4 = new x73(kf3Var);
                    ov0Var2.m0(objQ4);
                }
                x73Var = (x73) objQ4;
                x73Var.b = e12Var2;
                x73Var.f = ak3Var;
                x73Var.c = me1Var4.v;
                x73Var.d = me1Var4;
                x73Var.e.setValue(f83Var2);
                x73Var.w = new f93(j2);
                x73Var.h = (zx) ov0Var2.j(z30.f);
                x73Var.i = coroutineScope;
                x73Var.k = (jx0) ov0Var2.j(z30.l);
                x73Var.l = vp0Var;
                final boolean z23 = true;
                x73Var.m.setValue(true);
                x73Var.n.setValue(Boolean.valueOf(z3));
                ov0Var2.c0(1966756105);
                x73Var.j = e92.b(vp2.e, q93Var2.a.k, ov0Var2, 6);
                ov0Var2.p(false);
                me1Var4.b();
                boolean zH5 = ov0Var2.h(me1Var4);
                i8 = i17 & 7168;
                if (i8 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z24 = zH5 | z7;
                if ((i17 & i19) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zH6 = z24 | z8 | ov0Var2.h(l83Var4);
                i9 = i18;
                if (i9 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z25 = zH6 | z9;
                i10 = (i17 & 112) ^ 48;
                if (i10 > 32 || !ov0Var2.f(c11Var)) {
                    l83Var = l83Var4;
                    if ((i17 & 48) != 32) {
                        z10 = false;
                    }
                    zH = z25 | z10 | ov0Var2.h(e12Var2) | ov0Var2.h(coroutineScope) | ov0Var2.h(gtVar) | ov0Var2.h(x73Var);
                    Object objQ17 = ov0Var2.Q();
                    if (!zH || objQ17 == c30Var) {
                        c11Var2 = c11Var;
                        me1Var2 = me1Var4;
                        i11 = 32;
                        f83 f83Var5 = f83Var2;
                        l83Var2 = l83Var;
                        i70Var = new i70(me1Var2, z3, l83Var2, f83Var5, c11Var2, e12Var2, x73Var, coroutineScope, gtVar);
                        f83Var4 = f83Var5;
                        coroutineScope2 = coroutineScope;
                        gtVar2 = gtVar;
                        z11 = z3;
                        ov0Var2.m0(i70Var);
                    } else {
                        c11Var2 = c11Var;
                        i70Var = objQ17;
                        gtVar2 = gtVar;
                        coroutineScope2 = coroutineScope;
                        me1Var2 = me1Var4;
                        i11 = 32;
                        z11 = z3;
                        f83Var4 = f83Var2;
                        l83Var2 = l83Var;
                    }
                    av1Var = av1.a;
                    dv1VarS = n51.s(sb.X(ks.P(av1Var, r28), (lu0) i70Var), ix1Var, z11);
                    ey1VarL = ke0.L(Boolean.valueOf(z11), ov0Var2);
                    boolean zF3 = ov0Var2.f(ey1VarL) | ov0Var2.h(me1Var2) | ov0Var2.h(l83Var2) | ov0Var2.h(x73Var);
                    if (i10 > i11 || !ov0Var2.f(c11Var2)) {
                        dv1Var2 = dv1VarS;
                        if ((r13 & 48) != i11) {
                            z12 = false;
                        }
                        z13 = zF3 | z12;
                        objQ5 = ov0Var2.Q();
                        if (z13) {
                            x73Var2 = x73Var;
                            c30Var2 = c30Var;
                            ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                            ey1Var = ey1VarL;
                            ov0Var2.m0(ydVar);
                        } else if (objQ5 == c30Var) {
                            c30Var = c30Var;
                            x73Var2 = x73Var;
                            c30Var2 = c30Var;
                            ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                            ey1Var = ey1VarL;
                            ov0Var2.m0(ydVar);
                        } else {
                            ey1Var = ey1VarL;
                            x73Var2 = x73Var;
                            c30Var2 = c30Var;
                            ydVar = objQ5;
                        }
                        oi0.e(ov0Var2, (pu0) ydVar, mf3.a);
                        dv1VarA = m33.a(av1Var, 8675309, new qc(new f70(me1Var2, 4), 3));
                        xcVar = new xc(me1Var2, r28, z11, x73Var2, e12Var2, 2);
                        if (z3) {
                            dv1VarA = xp1.p(dv1VarA, new bu(12, xcVar, ix1Var));
                        }
                        dv1 dv1VarB = m33.b(dv1VarA, x73Var2.A, x73Var2.z, new qc(x73Var2, 7));
                        v92.a.getClass();
                        dv1 dv1VarC = mc0.C(dv1VarB, ji2.s);
                        final dv1 dv1VarS2 = xp1.s(av1Var, new ji1(me1Var2, f83Var4, e12Var2, 5));
                        boolean zH7 = ov0Var2.h(me1Var2);
                        if (i8 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zF4 = zH7 | z14 | ov0Var2.f(qk3Var) | ov0Var2.h(x73Var2);
                        if (i9 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zH2 = zF4 | z15 | ov0Var2.h(e12Var2);
                        objQ6 = ov0Var2.Q();
                        if (zH2 || objQ6 == c30Var2) {
                            j70 j70Var = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                            ov0Var2.m0(j70Var);
                            objQ6 = j70Var;
                        }
                        final dv1 dv1VarG = G(av1Var, (lu0) objQ6);
                        me1 me1Var5 = me1Var2;
                        l83Var3 = l83Var2;
                        x73Var3 = x73Var2;
                        q70 q70Var = new q70(bc3Var, f83Var, me1Var5, z3, ak3Var instanceof j62, e12Var2, x73Var3, c11Var, vp0Var);
                        me1Var3 = me1Var5;
                        if (!z3 && ((Boolean) ((ee1) qk3Var).c.getValue()).booleanValue() && f93.c(((f93) me1Var3.A.getValue()).a) && f93.c(((f93) me1Var3.B.getValue()).a)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            oc1 oc1Var = new oc1(stVar, me1Var3, f83Var, e12Var2, 5);
                            me1Var3 = me1Var3;
                            dv1VarP = xp1.p(av1Var, oc1Var);
                        } else {
                            dv1VarP = av1Var;
                        }
                        zH3 = ov0Var2.h(x73Var3);
                        objQ7 = ov0Var2.Q();
                        if (zH3 || objQ7 == c30Var2) {
                            objQ7 = new d70(x73Var3, 0);
                            ov0Var2.m0(objQ7);
                        }
                        oi0.a(x73Var3, (lu0) objQ7, ov0Var2);
                        boolean zH8 = ov0Var2.h(me1Var3) | ov0Var2.h(l83Var3);
                        if (i9 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zH8 | z17 | ((i10 <= 32 && ov0Var2.f(c11Var)) || (i17 & 48) == 32);
                        objQ8 = ov0Var2.Q();
                        if (!z18 || objQ8 == c30Var2) {
                            lh lhVar = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                            c11Var3 = c11Var;
                            ov0Var2.m0(lhVar);
                            objQ8 = lhVar;
                        } else {
                            c11Var3 = c11Var;
                        }
                        oi0.a(c11Var3, (lu0) objQ8, ov0Var2);
                        final f70 f70Var = me1Var3.v;
                        if (i2 == 1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        final int i22 = c11Var3.e;
                        dv1 dv1VarP3 = xp1.p(av1Var, new qu0() { // from class: k73
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                ov0 ov0Var4 = (ov0) ((f30) obj2);
                                ov0Var4.c0(851809892);
                                Object objQ18 = ov0Var4.Q();
                                c30 c30Var4 = d30.a;
                                if (objQ18 == c30Var4) {
                                    objQ18 = new e93();
                                    ov0Var4.m0(objQ18);
                                }
                                e93 e93Var = (e93) objQ18;
                                Object objQ19 = ov0Var4.Q();
                                if (objQ19 == c30Var4) {
                                    objQ19 = new r90();
                                    ov0Var4.m0(objQ19);
                                }
                                j73 j73Var = new j73(me1Var3, x73Var3, f83Var, z23, z19, e93Var, e12Var2, kf3Var, (r90) objQ19, f70Var, i22);
                                boolean zH9 = ov0Var4.h(j73Var);
                                Object objQ20 = ov0Var4.Q();
                                if (zH9 || objQ20 == c30Var4) {
                                    l lVar = new l(1, j73Var, j73.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                    ov0Var4.m0(lVar);
                                    objQ20 = lVar;
                                }
                                dv1 dv1VarA2 = zm3.A(av1.a, (lu0) ((o81) objQ20));
                                ov0Var4.p(false);
                                return dv1VarA2;
                            }
                        });
                        i12 = c11Var3.d;
                        if (i12 == 7 && i12 != 8) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
                        zG = ov0Var2.g(z20) | ov0Var2.h(ie1Var);
                        objQ9 = ov0Var2.Q();
                        if (zG || objQ9 == c30Var2) {
                            objQ9 = new sy(z20, ie1Var, 2);
                            ov0Var2.m0(objQ9);
                        }
                        au0 au0Var = (au0) objQ9;
                        if (zBooleanValue || !y13.a) {
                            dv1VarD = av1Var;
                        } else {
                            dv1VarD = (z20 ? new z13(n51.P) : av1Var).d(new w13(au0Var));
                        }
                        qy2Var = (st) ov0Var2.j(qp.a);
                        j4 = ((hz) ov0Var2.j(qp.b)).a;
                        jC = xp1.c(1308617531);
                        int i23 = hz.h;
                        if (!ye3.a(j4, jC)) {
                            qy2Var = new qy2(j4);
                        }
                        zH4 = ov0Var2.h(me1Var3) | ov0Var2.f(qy2Var);
                        objQ10 = ov0Var2.Q();
                        if (zH4 || objQ10 == c30Var2) {
                            objQ10 = new j(10, me1Var3, qy2Var);
                            ov0Var2.m0(objQ10);
                        }
                        final r73 r73Var2 = r73Var;
                        dv1 dv1VarP4 = ym3.p(G(zm3.B(zm3.B(zm3.z(dv1Var.d(xp1.w(av1Var, (lu0) objQ10)), ie1Var, me1Var3, x73Var3).d(dv1VarD).d(dv1Var2), new l3(23, op0Var, me1Var3)), new l3(9, me1Var3, x73Var3)).d(dv1VarP3).d(new b30(new gl1(4, r73Var2, ix1Var, z3))).d(dv1VarC).d(q70Var), new f70(me1Var3, 0)), new j2(24, x73Var3, coroutineScope2));
                        if (!z3 && me1Var3.b() && ((Boolean) me1Var3.q.getValue()).booleanValue() && ((Boolean) r3.c.getValue()).booleanValue()) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21 || !sk1.a()) {
                            dv1VarP2 = av1Var;
                        } else {
                            dv1VarP2 = xp1.p(av1Var, new au(x73Var3, 14));
                        }
                        final dv1 dv1Var3 = dv1VarP2;
                        final xb0 xb0Var4 = xb0Var2;
                        final gt gtVar3 = gtVar2;
                        final dv1 dv1Var4 = dv1VarP;
                        final me1 me1Var6 = me1Var3;
                        ov0Var = ov0Var2;
                        e(dv1VarP4, x73Var3, sb.a0(-814563849, new pu0() { // from class: g70
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                f30 f30Var2 = (f30) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                ov0 ov0Var4 = (ov0) f30Var2;
                                if (ov0Var4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final me1 me1Var7 = me1Var6;
                                    final q93 q93Var3 = q93Var;
                                    final int i24 = i3;
                                    final int i25 = i2;
                                    final r73 r73Var3 = r73Var2;
                                    final f83 f83Var6 = f83Var;
                                    final ak3 ak3Var2 = ak3Var;
                                    final dv1 dv1Var5 = dv1Var4;
                                    final dv1 dv1Var6 = dv1VarS2;
                                    final dv1 dv1Var7 = dv1VarG;
                                    final dv1 dv1Var8 = dv1Var3;
                                    final gt gtVar4 = gtVar3;
                                    final x73 x73Var4 = x73Var3;
                                    final boolean z26 = z21;
                                    final lu0 lu0Var3 = lu0Var2;
                                    final e12 e12Var3 = e12Var2;
                                    final xb0 xb0Var5 = xb0Var4;
                                    qu0Var.invoke(sb.a0(-44346382, new pu0() { // from class: e70
                                        @Override // defpackage.pu0
                                        public final Object invoke(Object obj3, Object obj4) {
                                            dv1 li3Var;
                                            f83 f83Var7 = f83Var6;
                                            long j8 = f83Var7.b;
                                            f30 f30Var3 = (f30) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            ov0 ov0Var5 = (ov0) f30Var3;
                                            if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                me1 me1Var8 = me1Var7;
                                                dv1 dv1VarH = iw2.h(av1.a, ((td0) me1Var8.g.getValue()).e, 0.0f, 2);
                                                int i26 = i24;
                                                int i27 = i25;
                                                vd0.K(i26, i27);
                                                q93 q93Var4 = q93Var3;
                                                if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                                    dv1VarH = dv1VarH.d(new qx0(q93Var4, i26, i27));
                                                }
                                                boolean zH9 = ov0Var5.h(me1Var8);
                                                Object objQ18 = ov0Var5.Q();
                                                if (zH9 || objQ18 == d30.a) {
                                                    objQ18 = new hd(me1Var8, 10);
                                                    ov0Var5.m0(objQ18);
                                                }
                                                au0 au0Var2 = (au0) objQ18;
                                                r73 r73Var4 = r73Var3;
                                                x32 x32Var3 = (x32) r73Var4.f.getValue();
                                                int i28 = f93.c;
                                                int iF = (int) (j8 >> 32);
                                                long j9 = r73Var4.e;
                                                dv1 dv1Var9 = dv1VarH;
                                                if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                    iF = f93.f(j8);
                                                }
                                                r73Var4.e = j8;
                                                bc3 bc3VarA2 = fh3.a(ak3Var2, f83Var7.a);
                                                int iOrdinal = x32Var3.ordinal();
                                                if (iOrdinal == 0) {
                                                    li3Var = new li3(r73Var4, iF, bc3VarA2, au0Var2);
                                                } else {
                                                    if (iOrdinal != 1) {
                                                        b81.d();
                                                        return null;
                                                    }
                                                    li3Var = new hy0(r73Var4, iF, bc3VarA2, au0Var2);
                                                }
                                                dh0.d(ji2.x(xp1.o(dv1Var9).d(li3Var).d(dv1Var5).d(dv1Var6).d(new c83(q93Var4)).d(dv1Var7).d(dv1Var8), gtVar4), sb.a0(1412697320, new vw(x73Var4, me1Var8, z26, lu0Var3, f83Var7, e12Var3, xb0Var5, i27), ov0Var5), ov0Var5, 48);
                                            } else {
                                                ov0Var5.W();
                                            }
                                            return mf3.a;
                                        }
                                    }, ov0Var4), ov0Var4, 6);
                                } else {
                                    ov0Var4.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var), ov0Var, 384);
                    } else {
                        dv1Var2 = dv1VarS;
                    }
                    z12 = true;
                    z13 = zF3 | z12;
                    objQ5 = ov0Var2.Q();
                    if (z13) {
                        x73Var2 = x73Var;
                        c30Var2 = c30Var;
                        ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                        ey1Var = ey1VarL;
                        ov0Var2.m0(ydVar);
                    } else if (objQ5 == c30Var) {
                        c30Var = c30Var;
                        x73Var2 = x73Var;
                        c30Var2 = c30Var;
                        ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                        ey1Var = ey1VarL;
                        ov0Var2.m0(ydVar);
                    } else {
                        ey1Var = ey1VarL;
                        x73Var2 = x73Var;
                        c30Var2 = c30Var;
                        ydVar = objQ5;
                    }
                    oi0.e(ov0Var2, (pu0) ydVar, mf3.a);
                    dv1VarA = m33.a(av1Var, 8675309, new qc(new f70(me1Var2, 4), 3));
                    xcVar = new xc(me1Var2, r28, z11, x73Var2, e12Var2, 2);
                    if (z3) {
                        dv1VarA = xp1.p(dv1VarA, new bu(12, xcVar, ix1Var));
                    }
                    dv1 dv1VarB2 = m33.b(dv1VarA, x73Var2.A, x73Var2.z, new qc(x73Var2, 7));
                    v92.a.getClass();
                    dv1 dv1VarC2 = mc0.C(dv1VarB2, ji2.s);
                    final dv1 dv1VarS3 = xp1.s(av1Var, new ji1(me1Var2, f83Var4, e12Var2, 5));
                    boolean zH9 = ov0Var2.h(me1Var2);
                    if (i8 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zF5 = zH9 | z14 | ov0Var2.f(qk3Var) | ov0Var2.h(x73Var2);
                    if (i9 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zH2 = zF5 | z15 | ov0Var2.h(e12Var2);
                    objQ6 = ov0Var2.Q();
                    if (zH2) {
                        j70 j70Var2 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                        ov0Var2.m0(j70Var2);
                        objQ6 = j70Var2;
                    } else {
                        j70 j70Var3 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                        ov0Var2.m0(j70Var3);
                        objQ6 = j70Var3;
                    }
                    final dv1 dv1VarG2 = G(av1Var, (lu0) objQ6);
                    me1 me1Var7 = me1Var2;
                    l83Var3 = l83Var2;
                    x73Var3 = x73Var2;
                    q70 q70Var2 = new q70(bc3Var, f83Var, me1Var7, z3, ak3Var instanceof j62, e12Var2, x73Var3, c11Var, vp0Var);
                    me1Var3 = me1Var7;
                    if (!z3) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        oc1 oc1Var2 = new oc1(stVar, me1Var3, f83Var, e12Var2, 5);
                        me1Var3 = me1Var3;
                        dv1VarP = xp1.p(av1Var, oc1Var2);
                    } else {
                        dv1VarP = av1Var;
                    }
                    zH3 = ov0Var2.h(x73Var3);
                    objQ7 = ov0Var2.Q();
                    if (zH3) {
                        objQ7 = new d70(x73Var3, 0);
                        ov0Var2.m0(objQ7);
                    } else {
                        objQ7 = new d70(x73Var3, 0);
                        ov0Var2.m0(objQ7);
                    }
                    oi0.a(x73Var3, (lu0) objQ7, ov0Var2);
                    boolean zH10 = ov0Var2.h(me1Var3) | ov0Var2.h(l83Var3);
                    if (i9 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zH10 | z17 | ((i10 <= 32 && ov0Var2.f(c11Var)) || (i17 & 48) == 32);
                    objQ8 = ov0Var2.Q();
                    if (z18) {
                        lh lhVar2 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                        c11Var3 = c11Var;
                        ov0Var2.m0(lhVar2);
                        objQ8 = lhVar2;
                    } else {
                        lh lhVar3 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                        c11Var3 = c11Var;
                        ov0Var2.m0(lhVar3);
                        objQ8 = lhVar3;
                    }
                    oi0.a(c11Var3, (lu0) objQ8, ov0Var2);
                    final lu0 f70Var2 = me1Var3.v;
                    if (i2 == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    final int i24 = c11Var3.e;
                    dv1 dv1VarP5 = xp1.p(av1Var, new qu0() { // from class: k73
                        @Override // defpackage.qu0
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ov0 ov0Var4 = (ov0) ((f30) obj2);
                            ov0Var4.c0(851809892);
                            Object objQ18 = ov0Var4.Q();
                            c30 c30Var4 = d30.a;
                            if (objQ18 == c30Var4) {
                                objQ18 = new e93();
                                ov0Var4.m0(objQ18);
                            }
                            e93 e93Var = (e93) objQ18;
                            Object objQ19 = ov0Var4.Q();
                            if (objQ19 == c30Var4) {
                                objQ19 = new r90();
                                ov0Var4.m0(objQ19);
                            }
                            j73 j73Var = new j73(me1Var3, x73Var3, f83Var, z23, z19, e93Var, e12Var2, kf3Var, (r90) objQ19, f70Var2, i24);
                            boolean zH11 = ov0Var4.h(j73Var);
                            Object objQ20 = ov0Var4.Q();
                            if (zH11 || objQ20 == c30Var4) {
                                l lVar = new l(1, j73Var, j73.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                ov0Var4.m0(lVar);
                                objQ20 = lVar;
                            }
                            dv1 dv1VarA2 = zm3.A(av1.a, (lu0) ((o81) objQ20));
                            ov0Var4.p(false);
                            return dv1VarA2;
                        }
                    });
                    i12 = c11Var3.d;
                    if (i12 == 7) {
                        z20 = false;
                    } else {
                        z20 = true;
                    }
                    zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
                    zG = ov0Var2.g(z20) | ov0Var2.h(ie1Var);
                    objQ9 = ov0Var2.Q();
                    if (zG) {
                        objQ9 = new sy(z20, ie1Var, 2);
                        ov0Var2.m0(objQ9);
                    } else {
                        objQ9 = new sy(z20, ie1Var, 2);
                        ov0Var2.m0(objQ9);
                    }
                    au0 au0Var2 = (au0) objQ9;
                    if (zBooleanValue) {
                        dv1VarD = av1Var;
                    } else {
                        dv1VarD = av1Var;
                    }
                    qy2Var = (st) ov0Var2.j(qp.a);
                    j4 = ((hz) ov0Var2.j(qp.b)).a;
                    jC = xp1.c(1308617531);
                    int i25 = hz.h;
                    if (!ye3.a(j4, jC)) {
                        qy2Var = new qy2(j4);
                    }
                    zH4 = ov0Var2.h(me1Var3) | ov0Var2.f(qy2Var);
                    objQ10 = ov0Var2.Q();
                    if (zH4) {
                        objQ10 = new j(10, me1Var3, qy2Var);
                        ov0Var2.m0(objQ10);
                    } else {
                        objQ10 = new j(10, me1Var3, qy2Var);
                        ov0Var2.m0(objQ10);
                    }
                    final r73 r73Var3 = r73Var;
                    dv1 dv1VarP6 = ym3.p(G(zm3.B(zm3.B(zm3.z(dv1Var.d(xp1.w(av1Var, (lu0) objQ10)), ie1Var, me1Var3, x73Var3).d(dv1VarD).d(dv1Var2), new l3(23, op0Var, me1Var3)), new l3(9, me1Var3, x73Var3)).d(dv1VarP5).d(new b30(new gl1(4, r73Var3, ix1Var, z3))).d(dv1VarC2).d(q70Var2), new f70(me1Var3, 0)), new j2(24, x73Var3, coroutineScope2));
                    if (!z3) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        dv1VarP2 = av1Var;
                    } else {
                        dv1VarP2 = av1Var;
                    }
                    final dv1 dv1Var5 = dv1VarP2;
                    final xb0 xb0Var5 = xb0Var2;
                    final gt gtVar4 = gtVar2;
                    final dv1 dv1Var6 = dv1VarP;
                    final me1 me1Var8 = me1Var3;
                    ov0Var = ov0Var2;
                    e(dv1VarP6, x73Var3, sb.a0(-814563849, new pu0() { // from class: g70
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            f30 f30Var2 = (f30) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            ov0 ov0Var4 = (ov0) f30Var2;
                            if (ov0Var4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final me1 me1Var9 = me1Var8;
                                final q93 q93Var3 = q93Var;
                                final int i26 = i3;
                                final int i27 = i2;
                                final r73 r73Var4 = r73Var3;
                                final f83 f83Var6 = f83Var;
                                final ak3 ak3Var2 = ak3Var;
                                final dv1 dv1Var7 = dv1Var6;
                                final dv1 dv1Var8 = dv1VarS3;
                                final dv1 dv1Var9 = dv1VarG2;
                                final dv1 dv1Var10 = dv1Var5;
                                final gt gtVar5 = gtVar4;
                                final x73 x73Var4 = x73Var3;
                                final boolean z26 = z21;
                                final lu0 lu0Var3 = lu0Var2;
                                final e12 e12Var3 = e12Var2;
                                final xb0 xb0Var6 = xb0Var5;
                                qu0Var.invoke(sb.a0(-44346382, new pu0() { // from class: e70
                                    @Override // defpackage.pu0
                                    public final Object invoke(Object obj3, Object obj4) {
                                        dv1 li3Var;
                                        f83 f83Var7 = f83Var6;
                                        long j8 = f83Var7.b;
                                        f30 f30Var3 = (f30) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        ov0 ov0Var5 = (ov0) f30Var3;
                                        if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            me1 me1Var10 = me1Var9;
                                            dv1 dv1VarH = iw2.h(av1.a, ((td0) me1Var10.g.getValue()).e, 0.0f, 2);
                                            int i28 = i26;
                                            int i29 = i27;
                                            vd0.K(i28, i29);
                                            q93 q93Var4 = q93Var3;
                                            if (i28 != 1 || i29 != Integer.MAX_VALUE) {
                                                dv1VarH = dv1VarH.d(new qx0(q93Var4, i28, i29));
                                            }
                                            boolean zH11 = ov0Var5.h(me1Var10);
                                            Object objQ18 = ov0Var5.Q();
                                            if (zH11 || objQ18 == d30.a) {
                                                objQ18 = new hd(me1Var10, 10);
                                                ov0Var5.m0(objQ18);
                                            }
                                            au0 au0Var3 = (au0) objQ18;
                                            r73 r73Var5 = r73Var4;
                                            x32 x32Var3 = (x32) r73Var5.f.getValue();
                                            int i210 = f93.c;
                                            int iF = (int) (j8 >> 32);
                                            long j9 = r73Var5.e;
                                            dv1 dv1Var11 = dv1VarH;
                                            if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                iF = f93.f(j8);
                                            }
                                            r73Var5.e = j8;
                                            bc3 bc3VarA2 = fh3.a(ak3Var2, f83Var7.a);
                                            int iOrdinal = x32Var3.ordinal();
                                            if (iOrdinal == 0) {
                                                li3Var = new li3(r73Var5, iF, bc3VarA2, au0Var3);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    b81.d();
                                                    return null;
                                                }
                                                li3Var = new hy0(r73Var5, iF, bc3VarA2, au0Var3);
                                            }
                                            dh0.d(ji2.x(xp1.o(dv1Var11).d(li3Var).d(dv1Var7).d(dv1Var8).d(new c83(q93Var4)).d(dv1Var9).d(dv1Var10), gtVar5), sb.a0(1412697320, new vw(x73Var4, me1Var10, z26, lu0Var3, f83Var7, e12Var3, xb0Var6, i29), ov0Var5), ov0Var5, 48);
                                        } else {
                                            ov0Var5.W();
                                        }
                                        return mf3.a;
                                    }
                                }, ov0Var4), ov0Var4, 6);
                            } else {
                                ov0Var4.W();
                            }
                            return mf3.a;
                        }
                    }, ov0Var), ov0Var, 384);
                } else {
                    l83Var = l83Var4;
                }
                z10 = true;
                zH = z25 | z10 | ov0Var2.h(e12Var2) | ov0Var2.h(coroutineScope) | ov0Var2.h(gtVar) | ov0Var2.h(x73Var);
                Object objQ18 = ov0Var2.Q();
                if (zH) {
                    c11Var2 = c11Var;
                    me1Var2 = me1Var4;
                    i11 = 32;
                    f83 f83Var6 = f83Var2;
                    l83Var2 = l83Var;
                    i70Var = new i70(me1Var2, z3, l83Var2, f83Var6, c11Var2, e12Var2, x73Var, coroutineScope, gtVar);
                    f83Var4 = f83Var6;
                    coroutineScope2 = coroutineScope;
                    gtVar2 = gtVar;
                    z11 = z3;
                    ov0Var2.m0(i70Var);
                } else {
                    c11Var2 = c11Var;
                    me1Var2 = me1Var4;
                    i11 = 32;
                    f83 f83Var7 = f83Var2;
                    l83Var2 = l83Var;
                    i70Var = new i70(me1Var2, z3, l83Var2, f83Var7, c11Var2, e12Var2, x73Var, coroutineScope, gtVar);
                    f83Var4 = f83Var7;
                    coroutineScope2 = coroutineScope;
                    gtVar2 = gtVar;
                    z11 = z3;
                    ov0Var2.m0(i70Var);
                }
                av1Var = av1.a;
                dv1VarS = n51.s(sb.X(ks.P(av1Var, r28), (lu0) i70Var), ix1Var, z11);
                ey1VarL = ke0.L(Boolean.valueOf(z11), ov0Var2);
                boolean zF6 = ov0Var2.f(ey1VarL) | ov0Var2.h(me1Var2) | ov0Var2.h(l83Var2) | ov0Var2.h(x73Var);
                if (i10 > i11) {
                    dv1Var2 = dv1VarS;
                    if ((r13 & 48) != i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    dv1Var2 = dv1VarS;
                    if ((r13 & 48) != i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                z13 = zF6 | z12;
                objQ5 = ov0Var2.Q();
                if (z13) {
                    x73Var2 = x73Var;
                    c30Var2 = c30Var;
                    ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                    ey1Var = ey1VarL;
                    ov0Var2.m0(ydVar);
                } else if (objQ5 == c30Var) {
                    c30Var = c30Var;
                    x73Var2 = x73Var;
                    c30Var2 = c30Var;
                    ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                    ey1Var = ey1VarL;
                    ov0Var2.m0(ydVar);
                } else {
                    ey1Var = ey1VarL;
                    x73Var2 = x73Var;
                    c30Var2 = c30Var;
                    ydVar = objQ5;
                }
                oi0.e(ov0Var2, (pu0) ydVar, mf3.a);
                dv1VarA = m33.a(av1Var, 8675309, new qc(new f70(me1Var2, 4), 3));
                xcVar = new xc(me1Var2, r28, z11, x73Var2, e12Var2, 2);
                if (z3) {
                    dv1VarA = xp1.p(dv1VarA, new bu(12, xcVar, ix1Var));
                }
                dv1 dv1VarB3 = m33.b(dv1VarA, x73Var2.A, x73Var2.z, new qc(x73Var2, 7));
                v92.a.getClass();
                dv1 dv1VarC3 = mc0.C(dv1VarB3, ji2.s);
                final dv1 dv1VarS4 = xp1.s(av1Var, new ji1(me1Var2, f83Var4, e12Var2, 5));
                boolean zH11 = ov0Var2.h(me1Var2);
                if (i8 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zF7 = zH11 | z14 | ov0Var2.f(qk3Var) | ov0Var2.h(x73Var2);
                if (i9 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zH2 = zF7 | z15 | ov0Var2.h(e12Var2);
                objQ6 = ov0Var2.Q();
                if (zH2) {
                    j70 j70Var4 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                    ov0Var2.m0(j70Var4);
                    objQ6 = j70Var4;
                } else {
                    j70 j70Var5 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                    ov0Var2.m0(j70Var5);
                    objQ6 = j70Var5;
                }
                final dv1 dv1VarG3 = G(av1Var, (lu0) objQ6);
                me1 me1Var9 = me1Var2;
                l83Var3 = l83Var2;
                x73Var3 = x73Var2;
                q70 q70Var3 = new q70(bc3Var, f83Var, me1Var9, z3, ak3Var instanceof j62, e12Var2, x73Var3, c11Var, vp0Var);
                me1Var3 = me1Var9;
                if (!z3) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    oc1 oc1Var3 = new oc1(stVar, me1Var3, f83Var, e12Var2, 5);
                    me1Var3 = me1Var3;
                    dv1VarP = xp1.p(av1Var, oc1Var3);
                } else {
                    dv1VarP = av1Var;
                }
                zH3 = ov0Var2.h(x73Var3);
                objQ7 = ov0Var2.Q();
                if (zH3) {
                    objQ7 = new d70(x73Var3, 0);
                    ov0Var2.m0(objQ7);
                } else {
                    objQ7 = new d70(x73Var3, 0);
                    ov0Var2.m0(objQ7);
                }
                oi0.a(x73Var3, (lu0) objQ7, ov0Var2);
                boolean zH12 = ov0Var2.h(me1Var3) | ov0Var2.h(l83Var3);
                if (i9 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zH12 | z17 | ((i10 <= 32 && ov0Var2.f(c11Var)) || (i17 & 48) == 32);
                objQ8 = ov0Var2.Q();
                if (z18) {
                    lh lhVar4 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                    c11Var3 = c11Var;
                    ov0Var2.m0(lhVar4);
                    objQ8 = lhVar4;
                } else {
                    lh lhVar5 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                    c11Var3 = c11Var;
                    ov0Var2.m0(lhVar5);
                    objQ8 = lhVar5;
                }
                oi0.a(c11Var3, (lu0) objQ8, ov0Var2);
                final lu0 f70Var3 = me1Var3.v;
                if (i2 == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                final int i26 = c11Var3.e;
                dv1 dv1VarP7 = xp1.p(av1Var, new qu0() { // from class: k73
                    @Override // defpackage.qu0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ov0 ov0Var4 = (ov0) ((f30) obj2);
                        ov0Var4.c0(851809892);
                        Object objQ19 = ov0Var4.Q();
                        c30 c30Var4 = d30.a;
                        if (objQ19 == c30Var4) {
                            objQ19 = new e93();
                            ov0Var4.m0(objQ19);
                        }
                        e93 e93Var = (e93) objQ19;
                        Object objQ110 = ov0Var4.Q();
                        if (objQ110 == c30Var4) {
                            objQ110 = new r90();
                            ov0Var4.m0(objQ110);
                        }
                        j73 j73Var = new j73(me1Var3, x73Var3, f83Var, z23, z19, e93Var, e12Var2, kf3Var, (r90) objQ110, f70Var3, i26);
                        boolean zH13 = ov0Var4.h(j73Var);
                        Object objQ20 = ov0Var4.Q();
                        if (zH13 || objQ20 == c30Var4) {
                            l lVar = new l(1, j73Var, j73.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                            ov0Var4.m0(lVar);
                            objQ20 = lVar;
                        }
                        dv1 dv1VarA2 = zm3.A(av1.a, (lu0) ((o81) objQ20));
                        ov0Var4.p(false);
                        return dv1VarA2;
                    }
                });
                i12 = c11Var3.d;
                if (i12 == 7) {
                    z20 = false;
                } else {
                    z20 = true;
                }
                zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
                zG = ov0Var2.g(z20) | ov0Var2.h(ie1Var);
                objQ9 = ov0Var2.Q();
                if (zG) {
                    objQ9 = new sy(z20, ie1Var, 2);
                    ov0Var2.m0(objQ9);
                } else {
                    objQ9 = new sy(z20, ie1Var, 2);
                    ov0Var2.m0(objQ9);
                }
                au0 au0Var3 = (au0) objQ9;
                if (zBooleanValue) {
                    dv1VarD = av1Var;
                } else {
                    dv1VarD = av1Var;
                }
                qy2Var = (st) ov0Var2.j(qp.a);
                j4 = ((hz) ov0Var2.j(qp.b)).a;
                jC = xp1.c(1308617531);
                int i27 = hz.h;
                if (!ye3.a(j4, jC)) {
                    qy2Var = new qy2(j4);
                }
                zH4 = ov0Var2.h(me1Var3) | ov0Var2.f(qy2Var);
                objQ10 = ov0Var2.Q();
                if (zH4) {
                    objQ10 = new j(10, me1Var3, qy2Var);
                    ov0Var2.m0(objQ10);
                } else {
                    objQ10 = new j(10, me1Var3, qy2Var);
                    ov0Var2.m0(objQ10);
                }
                final r73 r73Var4 = r73Var;
                dv1 dv1VarP8 = ym3.p(G(zm3.B(zm3.B(zm3.z(dv1Var.d(xp1.w(av1Var, (lu0) objQ10)), ie1Var, me1Var3, x73Var3).d(dv1VarD).d(dv1Var2), new l3(23, op0Var, me1Var3)), new l3(9, me1Var3, x73Var3)).d(dv1VarP7).d(new b30(new gl1(4, r73Var4, ix1Var, z3))).d(dv1VarC3).d(q70Var3), new f70(me1Var3, 0)), new j2(24, x73Var3, coroutineScope2));
                if (!z3) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                if (z21) {
                    dv1VarP2 = av1Var;
                } else {
                    dv1VarP2 = av1Var;
                }
                final dv1 dv1Var7 = dv1VarP2;
                final xb0 xb0Var6 = xb0Var2;
                final gt gtVar5 = gtVar2;
                final dv1 dv1Var8 = dv1VarP;
                final me1 me1Var10 = me1Var3;
                ov0Var = ov0Var2;
                e(dv1VarP8, x73Var3, sb.a0(-814563849, new pu0() { // from class: g70
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        f30 f30Var2 = (f30) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        ov0 ov0Var4 = (ov0) f30Var2;
                        if (ov0Var4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final me1 me1Var11 = me1Var10;
                            final q93 q93Var3 = q93Var;
                            final int i28 = i3;
                            final int i29 = i2;
                            final r73 r73Var5 = r73Var4;
                            final f83 f83Var8 = f83Var;
                            final ak3 ak3Var2 = ak3Var;
                            final dv1 dv1Var9 = dv1Var8;
                            final dv1 dv1Var10 = dv1VarS4;
                            final dv1 dv1Var11 = dv1VarG3;
                            final dv1 dv1Var12 = dv1Var7;
                            final gt gtVar6 = gtVar5;
                            final x73 x73Var4 = x73Var3;
                            final boolean z26 = z21;
                            final lu0 lu0Var3 = lu0Var2;
                            final e12 e12Var3 = e12Var2;
                            final xb0 xb0Var7 = xb0Var6;
                            qu0Var.invoke(sb.a0(-44346382, new pu0() { // from class: e70
                                @Override // defpackage.pu0
                                public final Object invoke(Object obj3, Object obj4) {
                                    dv1 li3Var;
                                    f83 f83Var9 = f83Var8;
                                    long j8 = f83Var9.b;
                                    f30 f30Var3 = (f30) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ov0 ov0Var5 = (ov0) f30Var3;
                                    if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        me1 me1Var12 = me1Var11;
                                        dv1 dv1VarH = iw2.h(av1.a, ((td0) me1Var12.g.getValue()).e, 0.0f, 2);
                                        int i210 = i28;
                                        int i211 = i29;
                                        vd0.K(i210, i211);
                                        q93 q93Var4 = q93Var3;
                                        if (i210 != 1 || i211 != Integer.MAX_VALUE) {
                                            dv1VarH = dv1VarH.d(new qx0(q93Var4, i210, i211));
                                        }
                                        boolean zH13 = ov0Var5.h(me1Var12);
                                        Object objQ19 = ov0Var5.Q();
                                        if (zH13 || objQ19 == d30.a) {
                                            objQ19 = new hd(me1Var12, 10);
                                            ov0Var5.m0(objQ19);
                                        }
                                        au0 au0Var4 = (au0) objQ19;
                                        r73 r73Var6 = r73Var5;
                                        x32 x32Var3 = (x32) r73Var6.f.getValue();
                                        int i212 = f93.c;
                                        int iF = (int) (j8 >> 32);
                                        long j9 = r73Var6.e;
                                        dv1 dv1Var13 = dv1VarH;
                                        if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                            iF = f93.f(j8);
                                        }
                                        r73Var6.e = j8;
                                        bc3 bc3VarA2 = fh3.a(ak3Var2, f83Var9.a);
                                        int iOrdinal = x32Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            li3Var = new li3(r73Var6, iF, bc3VarA2, au0Var4);
                                        } else {
                                            if (iOrdinal != 1) {
                                                b81.d();
                                                return null;
                                            }
                                            li3Var = new hy0(r73Var6, iF, bc3VarA2, au0Var4);
                                        }
                                        dh0.d(ji2.x(xp1.o(dv1Var13).d(li3Var).d(dv1Var9).d(dv1Var10).d(new c83(q93Var4)).d(dv1Var11).d(dv1Var12), gtVar6), sb.a0(1412697320, new vw(x73Var4, me1Var12, z26, lu0Var3, f83Var9, e12Var3, xb0Var7, i211), ov0Var5), ov0Var5, 48);
                                    } else {
                                        ov0Var5.W();
                                    }
                                    return mf3.a;
                                }
                            }, ov0Var4), ov0Var4, 6);
                        } else {
                            ov0Var4.W();
                        }
                        return mf3.a;
                    }
                }, ov0Var), ov0Var, 384);
            } else {
                lq0Var2 = lq0Var;
            }
            xb0Var2 = xb0Var;
            gc0Var = new gc0(djVar, q93Var2, z4, xb0Var2, lq0Var2, uj0Var);
            if (me1Var4.a != gc0Var) {
                z5 = true;
                me1Var4.p = true;
            } else {
                z5 = true;
            }
            me1Var4.a = gc0Var;
            d31Var = me1Var4.d;
            p83Var = me1Var4.e;
            f93Var2 = f93Var;
            boolean zF8 = o51.f(f93Var2, ((mi0) d31Var.g).c());
            if (o51.f(((f83) d31Var.f).a.f, djVar4.f)) {
                j2 = j5;
                d31Var.g = new mi0(djVar4, j2);
                z6 = false;
            } else {
                j2 = r16;
                if (f93.b(((f83) d31Var.f).b, j2)) {
                    ((mi0) d31Var.g).f(f93.f(j2), f93.e(j2));
                    z6 = true;
                } else {
                    z6 = false;
                }
                z5 = false;
            }
            if (f93Var2 == null) {
                mi0 mi0Var3 = (mi0) d31Var.g;
                mi0Var3.d = -1;
                mi0Var3.e = -1;
            } else {
                j3 = f93Var2.a;
                if (!f93.c(j3)) {
                    ((mi0) d31Var.g).e(f93.f(j3), f93.e(j3));
                }
            }
            if (z5) {
                mi0 mi0Var4 = (mi0) d31Var.g;
                mi0Var4.d = -1;
                mi0Var4.e = -1;
                f83Var2 = f83Var;
                f83VarA = f83.a(f83Var2, null, 0L, 3);
            } else {
                mi0 mi0Var5 = (mi0) d31Var.g;
                mi0Var5.d = -1;
                mi0Var5.e = -1;
                f83Var2 = f83Var;
                f83VarA = f83.a(f83Var2, null, 0L, 3);
            }
            f83Var3 = (f83) d31Var.f;
            d31Var.f = f83VarA;
            if (p83Var != null) {
                p83Var.a(f83Var3, f83VarA);
            }
            objQ = ov0Var2.Q();
            c30Var = c30Var3;
            if (objQ == c30Var) {
                objQ = new kf3();
                ov0Var2.m0(objQ);
            }
            kf3Var = (kf3) objQ;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (kf3Var.e) {
                kf3Var.d = Long.valueOf(jCurrentTimeMillis);
                kf3Var.a(f83Var2);
            } else {
                l2 = kf3Var.d;
                if (jCurrentTimeMillis > (l2 != null ? l2.longValue() : 0L) + 5000) {
                    kf3Var.d = Long.valueOf(jCurrentTimeMillis);
                    kf3Var.a(f83Var2);
                }
            }
            objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = oi0.j(ov0Var2);
                ov0Var2.m0(objQ2);
            }
            coroutineScope = (CoroutineScope) objQ2;
            objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = new gt();
                ov0Var2.m0(objQ3);
            }
            gtVar = (gt) objQ3;
            objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var) {
                objQ4 = new x73(kf3Var);
                ov0Var2.m0(objQ4);
            }
            x73Var = (x73) objQ4;
            x73Var.b = e12Var2;
            x73Var.f = ak3Var;
            x73Var.c = me1Var4.v;
            x73Var.d = me1Var4;
            x73Var.e.setValue(f83Var2);
            x73Var.w = new f93(j2);
            x73Var.h = (zx) ov0Var2.j(z30.f);
            x73Var.i = coroutineScope;
            x73Var.k = (jx0) ov0Var2.j(z30.l);
            x73Var.l = vp0Var;
            final boolean z26 = true;
            x73Var.m.setValue(true);
            x73Var.n.setValue(Boolean.valueOf(z3));
            ov0Var2.c0(1966756105);
            x73Var.j = e92.b(vp2.e, q93Var2.a.k, ov0Var2, 6);
            ov0Var2.p(false);
            me1Var4.b();
            boolean zH13 = ov0Var2.h(me1Var4);
            i8 = i17 & 7168;
            if (i8 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z27 = zH13 | z7;
            if ((i17 & i19) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zH14 = z27 | z8 | ov0Var2.h(l83Var4);
            i9 = i18;
            if (i9 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z28 = zH14 | z9;
            i10 = (i17 & 112) ^ 48;
            if (i10 > 32) {
            }
            l83Var = l83Var4;
            if ((i17 & 48) != 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            zH = z28 | z10 | ov0Var2.h(e12Var2) | ov0Var2.h(coroutineScope) | ov0Var2.h(gtVar) | ov0Var2.h(x73Var);
            Object objQ19 = ov0Var2.Q();
            if (zH) {
                c11Var2 = c11Var;
                me1Var2 = me1Var4;
                i11 = 32;
                f83 f83Var8 = f83Var2;
                l83Var2 = l83Var;
                i70Var = new i70(me1Var2, z3, l83Var2, f83Var8, c11Var2, e12Var2, x73Var, coroutineScope, gtVar);
                f83Var4 = f83Var8;
                coroutineScope2 = coroutineScope;
                gtVar2 = gtVar;
                z11 = z3;
                ov0Var2.m0(i70Var);
            } else {
                c11Var2 = c11Var;
                me1Var2 = me1Var4;
                i11 = 32;
                f83 f83Var9 = f83Var2;
                l83Var2 = l83Var;
                i70Var = new i70(me1Var2, z3, l83Var2, f83Var9, c11Var2, e12Var2, x73Var, coroutineScope, gtVar);
                f83Var4 = f83Var9;
                coroutineScope2 = coroutineScope;
                gtVar2 = gtVar;
                z11 = z3;
                ov0Var2.m0(i70Var);
            }
            av1Var = av1.a;
            dv1VarS = n51.s(sb.X(ks.P(av1Var, r28), (lu0) i70Var), ix1Var, z11);
            ey1VarL = ke0.L(Boolean.valueOf(z11), ov0Var2);
            boolean zF9 = ov0Var2.f(ey1VarL) | ov0Var2.h(me1Var2) | ov0Var2.h(l83Var2) | ov0Var2.h(x73Var);
            if (i10 > i11) {
                dv1Var2 = dv1VarS;
                if ((r13 & 48) != i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                dv1Var2 = dv1VarS;
                if ((r13 & 48) != i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            z13 = zF9 | z12;
            objQ5 = ov0Var2.Q();
            if (z13) {
                x73Var2 = x73Var;
                c30Var2 = c30Var;
                ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                ey1Var = ey1VarL;
                ov0Var2.m0(ydVar);
            } else if (objQ5 == c30Var) {
                c30Var = c30Var;
                x73Var2 = x73Var;
                c30Var2 = c30Var;
                ydVar = new yd(me1Var2, ey1VarL, l83Var2, x73Var2, c11Var2, null, 2);
                ey1Var = ey1VarL;
                ov0Var2.m0(ydVar);
            } else {
                ey1Var = ey1VarL;
                x73Var2 = x73Var;
                c30Var2 = c30Var;
                ydVar = objQ5;
            }
            oi0.e(ov0Var2, (pu0) ydVar, mf3.a);
            dv1VarA = m33.a(av1Var, 8675309, new qc(new f70(me1Var2, 4), 3));
            xcVar = new xc(me1Var2, r28, z11, x73Var2, e12Var2, 2);
            if (z3) {
                dv1VarA = xp1.p(dv1VarA, new bu(12, xcVar, ix1Var));
            }
            dv1 dv1VarB4 = m33.b(dv1VarA, x73Var2.A, x73Var2.z, new qc(x73Var2, 7));
            v92.a.getClass();
            dv1 dv1VarC4 = mc0.C(dv1VarB4, ji2.s);
            final dv1 dv1VarS5 = xp1.s(av1Var, new ji1(me1Var2, f83Var4, e12Var2, 5));
            boolean zH15 = ov0Var2.h(me1Var2);
            if (i8 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zF10 = zH15 | z14 | ov0Var2.f(qk3Var) | ov0Var2.h(x73Var2);
            if (i9 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zH2 = zF10 | z15 | ov0Var2.h(e12Var2);
            objQ6 = ov0Var2.Q();
            if (zH2) {
                j70 j70Var6 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                ov0Var2.m0(j70Var6);
                objQ6 = j70Var6;
            } else {
                j70 j70Var7 = new j70(me1Var2, z3, qk3Var, x73Var2, f83Var4, e12Var2);
                ov0Var2.m0(j70Var7);
                objQ6 = j70Var7;
            }
            final dv1 dv1VarG4 = G(av1Var, (lu0) objQ6);
            me1 me1Var11 = me1Var2;
            l83Var3 = l83Var2;
            x73Var3 = x73Var2;
            q70 q70Var4 = new q70(bc3Var, f83Var, me1Var11, z3, ak3Var instanceof j62, e12Var2, x73Var3, c11Var, vp0Var);
            me1Var3 = me1Var11;
            if (!z3) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z16) {
                oc1 oc1Var4 = new oc1(stVar, me1Var3, f83Var, e12Var2, 5);
                me1Var3 = me1Var3;
                dv1VarP = xp1.p(av1Var, oc1Var4);
            } else {
                dv1VarP = av1Var;
            }
            zH3 = ov0Var2.h(x73Var3);
            objQ7 = ov0Var2.Q();
            if (zH3) {
                objQ7 = new d70(x73Var3, 0);
                ov0Var2.m0(objQ7);
            } else {
                objQ7 = new d70(x73Var3, 0);
                ov0Var2.m0(objQ7);
            }
            oi0.a(x73Var3, (lu0) objQ7, ov0Var2);
            boolean zH16 = ov0Var2.h(me1Var3) | ov0Var2.h(l83Var3);
            if (i9 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zH16 | z17 | ((i10 <= 32 && ov0Var2.f(c11Var)) || (i17 & 48) == 32);
            objQ8 = ov0Var2.Q();
            if (z18) {
                lh lhVar6 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                c11Var3 = c11Var;
                ov0Var2.m0(lhVar6);
                objQ8 = lhVar6;
            } else {
                lh lhVar7 = new lh(me1Var3, l83Var3, f83Var, c11Var, 1);
                c11Var3 = c11Var;
                ov0Var2.m0(lhVar7);
                objQ8 = lhVar7;
            }
            oi0.a(c11Var3, (lu0) objQ8, ov0Var2);
            final lu0 f70Var4 = me1Var3.v;
            if (i2 == 1) {
                z19 = true;
            } else {
                z19 = false;
            }
            final int i28 = c11Var3.e;
            dv1 dv1VarP9 = xp1.p(av1Var, new qu0() { // from class: k73
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ov0 ov0Var4 = (ov0) ((f30) obj2);
                    ov0Var4.c0(851809892);
                    Object objQ110 = ov0Var4.Q();
                    c30 c30Var4 = d30.a;
                    if (objQ110 == c30Var4) {
                        objQ110 = new e93();
                        ov0Var4.m0(objQ110);
                    }
                    e93 e93Var = (e93) objQ110;
                    Object objQ111 = ov0Var4.Q();
                    if (objQ111 == c30Var4) {
                        objQ111 = new r90();
                        ov0Var4.m0(objQ111);
                    }
                    j73 j73Var = new j73(me1Var3, x73Var3, f83Var, z26, z19, e93Var, e12Var2, kf3Var, (r90) objQ111, f70Var4, i28);
                    boolean zH17 = ov0Var4.h(j73Var);
                    Object objQ20 = ov0Var4.Q();
                    if (zH17 || objQ20 == c30Var4) {
                        l lVar = new l(1, j73Var, j73.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                        ov0Var4.m0(lVar);
                        objQ20 = lVar;
                    }
                    dv1 dv1VarA2 = zm3.A(av1.a, (lu0) ((o81) objQ20));
                    ov0Var4.p(false);
                    return dv1VarA2;
                }
            });
            i12 = c11Var3.d;
            if (i12 == 7) {
                z20 = false;
            } else {
                z20 = true;
            }
            zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
            zG = ov0Var2.g(z20) | ov0Var2.h(ie1Var);
            objQ9 = ov0Var2.Q();
            if (zG) {
                objQ9 = new sy(z20, ie1Var, 2);
                ov0Var2.m0(objQ9);
            } else {
                objQ9 = new sy(z20, ie1Var, 2);
                ov0Var2.m0(objQ9);
            }
            au0 au0Var4 = (au0) objQ9;
            if (zBooleanValue) {
                dv1VarD = av1Var;
            } else {
                dv1VarD = av1Var;
            }
            qy2Var = (st) ov0Var2.j(qp.a);
            j4 = ((hz) ov0Var2.j(qp.b)).a;
            jC = xp1.c(1308617531);
            int i29 = hz.h;
            if (!ye3.a(j4, jC)) {
                qy2Var = new qy2(j4);
            }
            zH4 = ov0Var2.h(me1Var3) | ov0Var2.f(qy2Var);
            objQ10 = ov0Var2.Q();
            if (zH4) {
                objQ10 = new j(10, me1Var3, qy2Var);
                ov0Var2.m0(objQ10);
            } else {
                objQ10 = new j(10, me1Var3, qy2Var);
                ov0Var2.m0(objQ10);
            }
            final r73 r73Var5 = r73Var;
            dv1 dv1VarP10 = ym3.p(G(zm3.B(zm3.B(zm3.z(dv1Var.d(xp1.w(av1Var, (lu0) objQ10)), ie1Var, me1Var3, x73Var3).d(dv1VarD).d(dv1Var2), new l3(23, op0Var, me1Var3)), new l3(9, me1Var3, x73Var3)).d(dv1VarP9).d(new b30(new gl1(4, r73Var5, ix1Var, z3))).d(dv1VarC4).d(q70Var4), new f70(me1Var3, 0)), new j2(24, x73Var3, coroutineScope2));
            if (!z3) {
                z21 = false;
            } else {
                z21 = false;
            }
            if (z21) {
                dv1VarP2 = av1Var;
            } else {
                dv1VarP2 = av1Var;
            }
            final dv1 dv1Var9 = dv1VarP2;
            final xb0 xb0Var7 = xb0Var2;
            final gt gtVar6 = gtVar2;
            final dv1 dv1Var10 = dv1VarP;
            final me1 me1Var12 = me1Var3;
            ov0Var = ov0Var2;
            e(dv1VarP10, x73Var3, sb.a0(-814563849, new pu0() { // from class: g70
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var4 = (ov0) f30Var2;
                    if (ov0Var4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final me1 me1Var13 = me1Var12;
                        final q93 q93Var3 = q93Var;
                        final int i210 = i3;
                        final int i211 = i2;
                        final r73 r73Var6 = r73Var5;
                        final f83 f83Var10 = f83Var;
                        final ak3 ak3Var2 = ak3Var;
                        final dv1 dv1Var11 = dv1Var10;
                        final dv1 dv1Var12 = dv1VarS5;
                        final dv1 dv1Var13 = dv1VarG4;
                        final dv1 dv1Var14 = dv1Var9;
                        final gt gtVar7 = gtVar6;
                        final x73 x73Var4 = x73Var3;
                        final boolean z29 = z21;
                        final lu0 lu0Var3 = lu0Var2;
                        final e12 e12Var3 = e12Var2;
                        final xb0 xb0Var8 = xb0Var7;
                        qu0Var.invoke(sb.a0(-44346382, new pu0() { // from class: e70
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj3, Object obj4) {
                                dv1 li3Var;
                                f83 f83Var11 = f83Var10;
                                long j8 = f83Var11.b;
                                f30 f30Var3 = (f30) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ov0 ov0Var5 = (ov0) f30Var3;
                                if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    me1 me1Var14 = me1Var13;
                                    dv1 dv1VarH = iw2.h(av1.a, ((td0) me1Var14.g.getValue()).e, 0.0f, 2);
                                    int i212 = i210;
                                    int i213 = i211;
                                    vd0.K(i212, i213);
                                    q93 q93Var4 = q93Var3;
                                    if (i212 != 1 || i213 != Integer.MAX_VALUE) {
                                        dv1VarH = dv1VarH.d(new qx0(q93Var4, i212, i213));
                                    }
                                    boolean zH17 = ov0Var5.h(me1Var14);
                                    Object objQ110 = ov0Var5.Q();
                                    if (zH17 || objQ110 == d30.a) {
                                        objQ110 = new hd(me1Var14, 10);
                                        ov0Var5.m0(objQ110);
                                    }
                                    au0 au0Var5 = (au0) objQ110;
                                    r73 r73Var7 = r73Var6;
                                    x32 x32Var3 = (x32) r73Var7.f.getValue();
                                    int i214 = f93.c;
                                    int iF = (int) (j8 >> 32);
                                    long j9 = r73Var7.e;
                                    dv1 dv1Var15 = dv1VarH;
                                    if (iF == ((int) (j9 >> 32)) && (iF = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                        iF = f93.f(j8);
                                    }
                                    r73Var7.e = j8;
                                    bc3 bc3VarA2 = fh3.a(ak3Var2, f83Var11.a);
                                    int iOrdinal = x32Var3.ordinal();
                                    if (iOrdinal == 0) {
                                        li3Var = new li3(r73Var7, iF, bc3VarA2, au0Var5);
                                    } else {
                                        if (iOrdinal != 1) {
                                            b81.d();
                                            return null;
                                        }
                                        li3Var = new hy0(r73Var7, iF, bc3VarA2, au0Var5);
                                    }
                                    dh0.d(ji2.x(xp1.o(dv1Var15).d(li3Var).d(dv1Var11).d(dv1Var12).d(new c83(q93Var4)).d(dv1Var13).d(dv1Var14), gtVar7), sb.a0(1412697320, new vw(x73Var4, me1Var14, z29, lu0Var3, f83Var11, e12Var3, xb0Var8, i213), ov0Var5), ov0Var5, 48);
                                } else {
                                    ov0Var5.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var4), ov0Var4, 6);
                    } else {
                        ov0Var4.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 384);
        } else {
            ov0Var = ov0Var3;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: h70
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i4 | 1);
                    int iM1 = wc0.m0(i5);
                    k22.d(f83Var, lu0Var, dv1Var, q93Var, ak3Var, lu0Var2, ix1Var, stVar, z2, i2, i3, c11Var, m91Var, z3, qu0Var, (f30) obj, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }

    public static final void e(dv1 dv1Var, x73 x73Var, p10 p10Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2036174316);
        int i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2 | (ov0Var.h(x73Var) ? 32 : 16);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            er1 er1VarC = ws.c(j9.f, true);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            n51.d(x73Var, p10Var, ov0Var, (i3 >> 3) & 126);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f5(dv1Var, x73Var, p10Var, i2, 2);
        }
    }

    public static final void f(ul1 ul1Var, AppState appState, boolean z2, f30 f30Var, int i2) {
        ul1 ul1Var2;
        boolean z3;
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-996622058);
        int i3 = i2 | (ov0Var.h(ul1Var) ? 4 : 2) | (ov0Var.h(appState) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i4 = 0;
        int i5 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                mg1 mg1VarX = x();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = mg1VarX.listIterator(0);
                while (true) {
                    xx0 xx0Var = (xx0) listIterator;
                    if (!xx0Var.hasNext()) {
                        break;
                    }
                    Object next = xx0Var.next();
                    if (zm3.k(context, (String) next) != 0) {
                        arrayList.add(next);
                    }
                }
                objQ = ke0.H(arrayList);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            w7 w7Var = new w7(i5);
            boolean zH = ov0Var.h(context);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new k90(context, ey1Var, i4);
                ov0Var.m0(objQ2);
            }
            no1 no1VarB0 = sb.b0(w7Var, (lu0) objQ2, ov0Var);
            v7 v7Var = new v7("application/json");
            boolean zH2 = ov0Var.h(ul1Var) | ov0Var.h(context);
            Object objQ3 = ov0Var.Q();
            if (zH2 || objQ3 == c30Var) {
                objQ3 = new m90(ul1Var, context, i4);
                ov0Var.m0(objQ3);
            }
            no1 no1VarB1 = sb.b0(v7Var, (lu0) objQ3, ov0Var);
            fn0 fn0Var = iw2.c;
            dv1 dv1VarK = xp1.k(fn0Var, z2 ? bk.a : bk.d, o51.p0);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarE = zm3.E(zm3.P(ji2.U(fn0Var), zm3.O(ov0Var), true), 16.0f, 24.0f);
            yz yzVarA = wz.a(new jo(14.0f, true, new fo(0)), j9.r, ov0Var, 6);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            av1 av1Var = av1.a;
            zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), xp1.d, ov0Var, 25014, 8);
            if (((List) ey1Var.getValue()).isEmpty()) {
                z3 = false;
                ov0Var.c0(-1420282520);
            } else {
                ov0Var.c0(-1413645389);
                zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-1504088178, new zt(context, no1VarB0, ey1Var, 2), ov0Var), ov0Var, 25014, 8);
                z3 = false;
            }
            ov0Var.p(z3);
            ul1Var2 = ul1Var;
            zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-1037460686, new bu(2, appState, ul1Var2), ov0Var), ov0Var, 25014, 8);
            zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-2005421615, new bu(3, appState, no1VarB1), ov0Var), ov0Var, 25014, 8);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ul1Var2 = ul1Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new n90(ul1Var2, appState, z2, i2, 0);
        }
    }

    public static final void g(x01 x01Var, long j2, String str, dv1 dv1Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1178255250);
        int i3 = i2 | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(dv1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            dv1 dv1VarF = zm3.F(xp1.k(xp1.n(dv1Var, cj2.a(12.0f)), hz.c(0.1f, j2), o51.p0), 0.0f, 10.0f, 1);
            yz yzVarA = wz.a(am1.g, j9.s, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, yzVarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            av1 av1Var = av1.a;
            t01.a(x01Var, null, iw2.k(av1Var, 18.0f), j2, ov0Var, (i3 & 14) | 3504, 0);
            gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
            s83.b(str, null, j2, v63.c(11), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i3 >> 6) & 14) | 1597824, 0, 262058);
            ov0Var = ov0Var;
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new q80(x01Var, j2, str, dv1Var, i2, 1);
        }
    }

    public static final void h(x73 x73Var, boolean z2, f30 f30Var, int i2) {
        y83 y83VarD;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(626339208);
        int i3 = (ov0Var.h(x73Var) ? 4 : 2) | i2 | (ov0Var.g(z2) ? 32 : 16);
        if (!ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            ov0Var.W();
        } else if (z2) {
            ov0Var.c0(1530097388);
            me1 me1Var = x73Var.d;
            x83 x83Var = null;
            if (me1Var != null && (y83VarD = me1Var.d()) != null) {
                x83 x83Var2 = y83VarD.a;
                me1 me1Var2 = x73Var.d;
                if (!(me1Var2 != null ? me1Var2.p : true)) {
                    x83Var = x83Var2;
                }
            }
            if (x83Var == null) {
                ov0Var.c0(1530097387);
                ov0Var.p(false);
            } else {
                ov0Var.c0(1530097388);
                if (f93.c(x73Var.l().b)) {
                    ov0Var.c0(2110860558);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(2109807302);
                    int iR = x73Var.b.r((int) (x73Var.l().b >> 32));
                    int iR2 = x73Var.b.r((int) (x73Var.l().b & 4294967295L));
                    hg2 hg2VarA = x83Var.a(iR);
                    hg2 hg2VarA2 = x83Var.a(Math.max(iR2 - 1, 0));
                    me1 me1Var3 = x73Var.d;
                    if (me1Var3 == null || !((Boolean) me1Var3.m.getValue()).booleanValue()) {
                        ov0Var.c0(2110490542);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(2110225306);
                        a83.a(true, hg2VarA, x73Var, ov0Var, ((i3 << 6) & 896) | 6);
                        ov0Var.p(false);
                    }
                    me1 me1Var4 = x73Var.d;
                    if (me1Var4 == null || !((Boolean) me1Var4.n.getValue()).booleanValue()) {
                        ov0Var.c0(2110838734);
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(2110574459);
                        a83.a(false, hg2VarA2, x73Var, ov0Var, ((i3 << 6) & 896) | 6);
                        ov0Var.p(false);
                    }
                    ov0Var.p(false);
                }
                me1 me1Var5 = x73Var.d;
                if (me1Var5 != null) {
                    w52 w52Var = me1Var5.l;
                    if (!o51.f(x73Var.u.a.f, x73Var.l().a.f)) {
                        w52Var.setValue(Boolean.FALSE);
                    }
                    if (me1Var5.b()) {
                        if (((Boolean) w52Var.getValue()).booleanValue()) {
                            x73Var.s();
                        } else {
                            x73Var.m();
                        }
                    }
                }
                ov0Var.p(false);
            }
            ov0Var.p(false);
        } else {
            ov0Var.c0(1989076778);
            ov0Var.p(false);
            x73Var.m();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ty(x73Var, z2, i2);
        }
    }

    public static final void i(x73 x73Var, f30 f30Var, int i2) {
        dj djVarK;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1436003720);
        int i3 = 4;
        int i4 = (ov0Var.h(x73Var) ? 4 : 2) | i2;
        int i5 = 0;
        if (ov0Var.T(i4 & 1, (i4 & 3) != 2)) {
            me1 me1Var = x73Var.d;
            if (me1Var == null || !((Boolean) me1Var.o.getValue()).booleanValue() || (djVarK = x73Var.k()) == null || djVarK.f.length() <= 0) {
                ov0Var.c0(-2111042550);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-2112351432);
                boolean zF = ov0Var.f(x73Var);
                Object objQ = ov0Var.Q();
                c30 c30Var = d30.a;
                if (zF || objQ == c30Var) {
                    objQ = new u73(x73Var);
                    ov0Var.m0(objQ);
                }
                s63 s63Var = (s63) objQ;
                xb0 xb0Var = (xb0) ov0Var.j(z30.h);
                e12 e12Var = x73Var.b;
                long j2 = x73Var.l().b;
                int i6 = f93.c;
                int iR = e12Var.r((int) (j2 >> 32));
                me1 me1Var2 = x73Var.d;
                y83 y83VarD = me1Var2 != null ? me1Var2.d() : null;
                y83VarD.getClass();
                x83 x83Var = y83VarD.a;
                pe2 pe2VarC = x83Var.c(mh0.v(iR, 0, x83Var.a.a.f.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((xb0Var.R(2.0f) / 2.0f) + pe2VarC.a)) << 32) | (((long) Float.floatToRawIntBits(pe2VarC.d)) & 4294967295L);
                boolean zE = ov0Var.e(jFloatToRawIntBits);
                Object objQ2 = ov0Var.Q();
                if (zE || objQ2 == c30Var) {
                    objQ2 = new m70(jFloatToRawIntBits);
                    ov0Var.m0(objQ2);
                }
                f12 f12Var = (f12) objQ2;
                boolean zH = ov0Var.h(s63Var) | ov0Var.h(x73Var);
                Object objQ3 = ov0Var.Q();
                if (zH || objQ3 == c30Var) {
                    objQ3 = new p70(i5, s63Var, x73Var);
                    ov0Var.m0(objQ3);
                }
                dv1 dv1VarA = m33.a(av1.a, s63Var, (PointerInputEventHandler) objQ3);
                boolean zE2 = ov0Var.e(jFloatToRawIntBits);
                Object objQ4 = ov0Var.Q();
                if (zE2 || objQ4 == c30Var) {
                    objQ4 = new ec(i3, jFloatToRawIntBits);
                    ov0Var.m0(objQ4);
                }
                gc.a(f12Var, gs2.a(dv1VarA, false, (lu0) objQ4), 0L, ov0Var, 0);
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new s5(i2, 5, x73Var);
        }
    }

    public static oz j(oz ozVar) {
        if (xq1.D(ozVar.b, 12884901888L)) {
            jh2 jh2Var = (jh2) ozVar;
            gk3 gk3Var = jh2Var.d;
            gk3 gk3Var2 = s;
            if (!n(gk3Var, gk3Var2)) {
                return new jh2(jh2Var.a, jh2Var.h, gk3Var2, B(m(k8.c.b, gk3Var.a(), gk3Var2.a()), jh2Var.i), jh2Var.k, jh2Var.n, jh2Var.e, jh2Var.f, jh2Var.g, -1);
            }
        }
        return ozVar;
    }

    public static dv1 k(dv1 dv1Var, l9 l9Var) {
        return dv1Var.d(new us(l9Var));
    }

    public static final void l(ag0 ag0Var, float f2, float f3) {
        int i2;
        nf nfVarL;
        int iA;
        int iA2;
        float[] fArr;
        float[] fArr2;
        int i3;
        sd0 sd0Var;
        if (q1.e()) {
            float[][] fArr3 = ag0Var.q;
            float[][] fArr4 = ag0Var.p;
            float f4 = f2 * 0.45f;
            float f5 = 0.45f * f3;
            int i4 = ag0Var.B;
            if (i4 < 0) {
                float fMax = Math.max(f4, f5);
                float[] fArr5 = yr.d;
                int length = fArr5.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        float f6 = fMax * fMax;
                        if (f6 >= 1945.0f) {
                            i3 = 4;
                        } else if (f6 > 400.0f) {
                            i3 = 3;
                        } else if (f6 >= 90.25f) {
                            i3 = 2;
                        } else {
                            i3 = f6 >= 12.6f ? 1 : 0;
                        }
                        sd0Var = new sd0(0.0f, i3, i3);
                        break;
                    }
                    float f7 = fArr5[i5];
                    float f8 = 0.88f * f7;
                    float f9 = f7 * 1.12f;
                    if (fMax > f8 && fMax < f9) {
                        float fU = mh0.u((fMax - f8) / (f9 - f8), 0.0f, 1.0f);
                        sd0Var = new sd0((3.0f - (fU * 2.0f)) * fU * fU, i5, i5 + 1);
                        break;
                    }
                    i5++;
                }
                i4 = sd0Var.a;
                ag0Var.C = i4;
                ag0Var.D = sd0Var.b;
                ag0Var.E = sd0Var.c;
            }
            int i6 = 1 << i4;
            float f10 = i6 * 13;
            if (f10 > ag0Var.i) {
                ag0Var.i = f10;
            }
            float fIntBitsToFloat = (ag0Var.i * 2.0f) + Float.intBitsToFloat((int) (ag0Var.g >> 32));
            float fIntBitsToFloat2 = (ag0Var.i * 2.0f) + Float.intBitsToFloat((int) (ag0Var.g & 4294967295L));
            t20 t20VarL = ag0Var.w;
            if (t20VarL != null && ag0Var.r == f2 && ag0Var.s == f3 && ag0Var.t == fIntBitsToFloat && ag0Var.u == fIntBitsToFloat2 && ag0Var.v == i4) {
                i2 = i6;
            } else {
                float f11 = i6;
                float f12 = yr.c[i4];
                float f13 = f11 * f11;
                float f14 = ((f4 * f4) - f12) / f13;
                if (f14 < 0.1f) {
                    f14 = 0.1f;
                }
                float f15 = ((f5 * f5) - f12) / f13;
                if (f15 < 0.1f) {
                    f15 = 0.1f;
                }
                float f16 = fIntBitsToFloat;
                i2 = i6;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
                if (f2 > 0.0f || f3 > 0.0f) {
                    int iIntBitsToFloat = ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / i2;
                    if (iIntBitsToFloat < 1) {
                        iIntBitsToFloat = 1;
                    }
                    float f17 = iIntBitsToFloat;
                    int iIntBitsToFloat2 = ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / i2;
                    if (iIntBitsToFloat2 < 1) {
                        iIntBitsToFloat2 = 1;
                    }
                    float f18 = iIntBitsToFloat2;
                    double[] dArr = ag0Var.m;
                    float[] fArr6 = ag0Var.n;
                    float[] fArr7 = ag0Var.o;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
                    if (f2 <= 0.0f || (iA2 = yr.a(f14, dArr, fArr6, fArr7)) <= 0) {
                        f16 = f16;
                        f18 = f18;
                        nfVarL = null;
                    } else {
                        float[] fArr8 = fArr4[iA2];
                        if (fArr8 == null) {
                            fArr = new float[iA2 * 2];
                            fArr4[iA2] = fArr;
                        } else {
                            fArr = fArr8;
                        }
                        float[] fArr9 = fArr3[iA2];
                        if (fArr9 == null) {
                            fArr2 = new float[iA2];
                            fArr3[iA2] = fArr2;
                        } else {
                            fArr2 = fArr9;
                        }
                        for (int i7 = 0; i7 < iA2; i7++) {
                            int i8 = i7 * 2;
                            fArr[i8] = fArr6[i7];
                            fArr[i8 + 1] = 0.0f;
                            fArr2[i7] = fArr7[i7];
                        }
                        pf pfVarC = ag0Var.c(yr.a[iA2][iNumberOfTrailingZeros], wt2.a[iA2]);
                        pfVarC.a.setFloatUniform("in_blurOffset", fArr);
                        pfVarC.a.setFloatUniform("in_blurWeight", fArr2);
                        pfVarC.a.setFloatUniform("in_maxCoord", f17 - 0.5f, f18 - 0.5f);
                        nfVarL = ld0.L(pfVarC, "child");
                    }
                    if (f3 <= 0.0f || (iA = yr.a(f15, dArr, fArr6, fArr7)) <= 0) {
                        t20VarL = nfVarL;
                    } else {
                        float[] fArr10 = fArr4[iA];
                        if (fArr10 == null) {
                            fArr10 = new float[iA * 2];
                            fArr4[iA] = fArr10;
                        }
                        float[] fArr11 = fArr3[iA];
                        if (fArr11 == null) {
                            fArr11 = new float[iA];
                            fArr3[iA] = fArr11;
                        }
                        for (int i9 = 0; i9 < iA; i9++) {
                            int i10 = i9 * 2;
                            fArr10[i10] = 0.0f;
                            fArr10[i10 + 1] = fArr6[i9];
                            fArr11[i9] = fArr7[i9];
                        }
                        pf pfVarC2 = ag0Var.c(yr.b[iA][iNumberOfTrailingZeros], wt2.a[iA]);
                        pfVarC2.a.setFloatUniform("in_blurOffset", fArr10);
                        pfVarC2.a.setFloatUniform("in_blurWeight", fArr11);
                        pfVarC2.a.setFloatUniform("in_maxCoord", f17 - 0.5f, f18 - 0.5f);
                        t20VarL = nfVarL != null ? ld0.l(nfVarL, ld0.L(pfVarC2, "child")) : ld0.L(pfVarC2, "child");
                    }
                } else {
                    i4 = i4;
                    f16 = f16;
                    t20VarL = null;
                }
                ag0Var.r = f2;
                ag0Var.s = f3;
                ag0Var.t = f16;
                ag0Var.u = fIntBitsToFloat2;
                ag0Var.v = i4;
                ag0Var.w = t20VarL;
            }
            if (t20VarL == null) {
                return;
            }
            ag0Var.k = i2;
            t20 t20Var = ag0Var.j;
            if (t20Var != null) {
                t20VarL = ld0.l(t20Var, t20VarL);
            }
            ag0Var.j = t20VarL;
        }
    }

    public static final float[] m(float[] fArr, float[] fArr2, float[] fArr3) {
        C(fArr, fArr2);
        C(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrZ = z(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return B(fArrZ, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean n(gk3 gk3Var, gk3 gk3Var2) {
        if (gk3Var == gk3Var2) {
            return true;
        }
        return Math.abs(gk3Var.a - gk3Var2.a) < 0.001f && Math.abs(gk3Var.b - gk3Var2.b) < 0.001f;
    }

    public static final d50 o(oz ozVar, oz ozVar2) {
        if (ozVar == ozVar2) {
            return new b50(ozVar, ozVar, 1);
        }
        return (xq1.D(ozVar.b, 12884901888L) && xq1.D(ozVar2.b, 12884901888L)) ? new c50((jh2) ozVar, (jh2) ozVar2) : new d50(ozVar, ozVar2, 0);
    }

    public static final jm2 p(dx1 dx1Var) {
        LinkedHashMap linkedHashMap = dx1Var.a;
        tm2 tm2Var = (tm2) linkedHashMap.get(x);
        Bundle bundle = null;
        if (tm2Var == null) {
            fo.i("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        pj3 pj3Var = (pj3) linkedHashMap.get(y);
        if (pj3Var == null) {
            fo.i("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(z);
        String str = (String) linkedHashMap.get(xp1.O);
        if (str == null) {
            fo.i("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        pm2 pm2VarB = tm2Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        mm2 mm2Var = pm2VarB instanceof mm2 ? (mm2) pm2VarB : null;
        if (mm2Var == null) {
            fo.n("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = y(pj3Var).b;
        jm2 jm2Var = (jm2) linkedHashMap2.get(str);
        if (jm2Var != null) {
            return jm2Var;
        }
        mm2Var.b();
        Bundle bundle3 = mm2Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                mm2Var.c = null;
            }
            bundle = bundle4;
        }
        jm2 jm2VarA = mh0.A(bundle, bundle2);
        linkedHashMap2.put(str, jm2VarA);
        return jm2VarA;
    }

    public static final void q(me1 me1Var) {
        p83 p83Var = me1Var.e;
        if (p83Var != null) {
            me1Var.v.invoke(f83.a((f83) me1Var.d.f, null, 0L, 3));
            l83 l83Var = p83Var.a;
            AtomicReference atomicReference = l83Var.b;
            while (!atomicReference.compareAndSet(p83Var, null)) {
                if (atomicReference.get() != p83Var) {
                }
            }
            l83Var.a.f();
        }
        me1Var.e = null;
    }

    public static final x01 r() {
        x01 x01Var = Q;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Bookmarks", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(19.0f, 18.0f);
        nx0Var.l(2.0f, 1.0f);
        nx0Var.r(3.0f);
        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.h(8.99f);
        nx0Var.f(7.89f, 1.0f, 7.0f, 1.9f, 7.0f, 3.0f);
        nx0Var.i(10.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        nx0Var.s(13.0f);
        nx0Var.e();
        nx0Var.m(15.0f, 5.0f);
        nx0Var.h(5.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0Var.s(16.0f);
        nx0Var.l(7.0f, -3.0f);
        nx0Var.l(7.0f, 3.0f);
        nx0Var.r(7.0f);
        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        Q = x01VarB;
        return x01VarB;
    }

    public static final x01 s() {
        x01 x01Var = R;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Cancel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.f(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        nx0VarI.o(4.47f, 10.0f, 10.0f, 10.0f);
        nx0VarI.o(10.0f, -4.47f, 10.0f, -10.0f);
        nx0VarI.n(17.53f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(16.3f, 16.3f);
        nx0VarI.g(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        nx0VarI.k(12.0f, 13.41f);
        nx0VarI.k(9.11f, 16.3f);
        nx0VarI.g(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        nx0VarI.g(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        nx0VarI.k(10.59f, 12.0f);
        nx0VarI.k(7.7f, 9.11f);
        nx0VarI.g(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        nx0VarI.g(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nx0VarI.k(12.0f, 10.59f);
        nx0VarI.l(2.89f, -2.89f);
        nx0VarI.g(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nx0VarI.g(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.k(13.41f, 12.0f);
        nx0VarI.l(2.89f, 2.89f);
        nx0VarI.g(0.38f, 0.38f, 0.38f, 1.02f, 0.0f, 1.41f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        R = x01VarB;
        return x01VarB;
    }

    public static final x01 t() {
        x01 x01Var = S;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(9.0f, 16.17f);
        nx0Var.k(5.53f, 12.7f);
        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0Var.l(4.18f, 4.18f);
        nx0Var.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0Var.k(20.29f, 7.71f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0Var.k(9.0f, 16.17f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        S = x01VarB;
        return x01VarB;
    }

    public static final x01 u() {
        x01 x01Var = T;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(18.3f, 5.71f);
        nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0VarI.k(12.0f, 10.59f);
        nx0VarI.k(7.11f, 5.7f);
        nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.k(10.59f, 12.0f);
        nx0VarI.k(5.7f, 16.89f);
        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0VarI.k(12.0f, 13.41f);
        nx0VarI.l(4.89f, 4.89f);
        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0VarI.k(13.41f, 12.0f);
        nx0VarI.l(4.89f, -4.89f);
        nx0VarI.g(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        T = x01VarB;
        return x01VarB;
    }

    public static Drawable v(Context context, int i2) {
        return kg2.c().d(context, i2);
    }

    public static final boolean w(q93 q93Var) {
        w82 w82Var;
        k92 k92Var = q93Var.c;
        kj0 kj0Var = (k92Var == null || (w82Var = k92Var.b) == null) ? null : new kj0(w82Var.b);
        boolean z2 = false;
        if (kj0Var != null && kj0Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static final mg1 x() {
        mg1 mg1VarN = am1.n();
        mg1VarN.add("android.permission.ACCESS_FINE_LOCATION");
        mg1VarN.add("android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT >= 31) {
            mg1VarN.add("android.permission.BLUETOOTH_SCAN");
        }
        return am1.f(mg1VarN);
    }

    public static final nm2 y(pj3 pj3Var) {
        lm2 lm2Var = new lm2();
        c80 defaultViewModelCreationExtras = pj3Var instanceof lx0 ? ((lx0) pj3Var).getDefaultViewModelCreationExtras() : b80.b;
        defaultViewModelCreationExtras.getClass();
        oj3 viewModelStore = pj3Var.getViewModelStore();
        viewModelStore.getClass();
        return (nm2) new mn2(viewModelStore, lm2Var, defaultViewModelCreationExtras).r(xe2.a(nm2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final float[] z(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }
}
