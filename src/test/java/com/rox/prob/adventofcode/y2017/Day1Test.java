package com.rox.prob.adventofcode.y2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day1Test {
    @Test
    public void testExtensionExamples(){
        final Day1 day = new Day1(5);
        assertEquals(15, day.solution(new int[] {1,2,3,4,5,1,2,3,4,5,6}));
        assertEquals(30, day.solution(new int[] {1,2,3,4,5,1,2,3,4,5}));
        assertEquals(5, day.solution(new int[] {1,1,1,1,1}));
    }

    @Test
    public void testPart1Examples(){
        final Day1 day = new Day1(1);
        assertEquals(3, day.solution(new int[] {1,1,2,2}));
        assertEquals(4, day.solution(new int[] {1,1,1,1}));
        assertEquals(0, day.solution(new int[] {1,2,3,4}));
        assertEquals(9, day.solution(new int[] {9,1,2,1,2,1,2,9}));
    }

    @Test
    public void testPart1ExamplesAsString(){
        final Day1 day = new Day1(1);
        assertEquals(3, day.solution("1122"));
        assertEquals(4, day.solution("1111"));
        assertEquals(0, day.solution("1234"));
        assertEquals(9, day.solution("91212129"));
    }

    @Test
    public void testPart1MyProblem(){
        final Day1 day = new Day1(1);
        assertEquals(1069, day.solution("36743676522426214741687639282183216978128565594112364817283598621384839756628424146779311928318383597235968644687665159591573413233616717112157752469191845757712928347624726438516211153946892241449523148419426259291788938621886334734497823163281389389853675932246734153563861233894952657625868415432316155487242813798425779743561987563734944962846865263722712768674838244444385768568489842989878163655771847362656153372265945464128668412439248966939398765446171855144544285463517258749813731314365947372548811434646381595273172982466142248474238762554858654679415418693478512641864168398722199638775667744977941183772494538685398862344164521446115925528534491788728448668455349588972443295391385389551783289417349823383324748411689198219329996666752251815562522759374542652969147696419669914534586732436912798519697722586795746371697338416716842214313393228587413399534716394984183943123375517819622837972796431166264646432893478557659387795573234889141897313158457637142238315327877493994933514112645586351127139429281675912366669475931711974332271368287413985682374943195886455927839573986464555141679291998645936683639162588375974549467767623463935561847869527383395278248952314792112113126231246742753119748113828843917812547224498319849947517745625844819175973986843636628414965664466582172419197227695368492433353199233558872319529626825788288176275546566474824257336863977574347328469153319428883748696399544974133392589823343773897313173336568883385364166336362398636684459886283964242249228938383219255513996468586953519638111599935229115228837559242752925943653623682985576323929415445443378189472782454958232341986626791182861644112974418239286486722654442144851173538756859647218768134572858331849543266169672745221391659363674921469481143686952478771714585793322926824623482923579986434741714167134346384551362664177865452895348948953472328966995731169672573555621939584872187999325322327893336736611929752613241935211664248961527687778371971259654541239471766714469122213793348414477789271187324629397292446879752673"));
    }

    @Test
    public void testOtherPeoplesPart1Problems() {
        final Day1 day = new Day1(1);
        assertEquals(1203, day.solution("31813174349235972159811869755166343882958376474278437681632495222499211488649543755655138842553867246131245462881756862736922925752647341673342756514856663979496747158241792857625471323535183222497949751644488277317173496124473893452425118133645984488759128897146498831373795721661696492622276282881218371273973538163779782435211491196616375135472517935481964439956844536136823757764494967297251545389464472794474447941564778733926532741752757865243946976266426548341889873514383464142659425122786667399143335772174973128383869893325977319651839516694295534146668728822393452626321892357192574444856264721585365164945647254645264693957898373214897848424966266582991272496771159583715456714645585576641458358326521858518319315233857473695712238323787254556597566461188452279853766184333696344395818615215846348586541164194624371353556812548945447432787795489443312941687221314432694115847863129826532628228386894683392352799514942665396273726821936346663485499159141368443782475714679953213388375939519711591262489869326145476958378464652451441434846382474578535468433514121336844727988128998543975147649823215332929623574231738442281161294838499441799996857746549441142859199799125595761724782225452394593514388571187279266291364278184761833324476838939898258225748562345853633364314923186685534864178665214135631494876474186833392929124337161222959459117554238429216916532175247326391321525832362274683763488347654497889261543959591212539851835354335598844669618391876623638137926893582131945361264841733341247646125278489995838369127582438419889922365596554237153412394494932582424222479798382932335239274297663365164912953364777876187522324991837775492621675953397843833247525599771974555545348388871578347332456586949283657613841414576976542343934911424716613479249893113961925713317644349946444271959375981158445151659431844142242547191181944395897963146947935463718145169266129118413523541222444997678726644615185324461293228124456118853885552279849917342474792984425629248492847827653133583215539325866881662159421987315186914769478947389188382383546881622246793781846254253759714573354544997853153798862436887889318646643359555663135476261863"));
        assertEquals(1102, day.solution("34997744892914653296827871613388552993634935173733597474997393431324121718942484674492133736486619515246829248477836544451943938832848157199224116563715646126431493563772112714741546635764665586452858349326658345524573681224829221829772728531278893357146638772291782796744812479595172578555931968285326741191558735491923682586844185476584124677856856612582263263124715916498254659761312225295947328671873729594182695425852559718922816832816341259695766322357565252335851264933471555351536363944572763621761489944217787785564355131756948331413652646811626742168857634856234347432698931371757454156396432993421795675147273229642441888776517165375965288923515378871773449714189311167849788519479274172617334378412661574885156988171532483385528342851358599792154331889342985168528186562873736117113242271863318873917355428393173152783223727362282169982597123525671895452937118687191281382949335937173323862618172284254741935865963877359477126188879481911148827453781546789437317581568931445259912541273353345254171252588344612386649134562638758915336976347291218848744548755462493981871543949697331735577243658722111371552363179584543521149944247848176793571855164329415143753479297879926959141597695174674386467854776481689314612324534729187335368471697738925271618243312864656442299938886755679996568297498965651652337961837876468596749433454633975722561971935459554979713344313292511447288939379369279487299557326137798219646395436241742751581363752896833892713543627966633788455384129347637693559713174477262914916598991823983686226378396341554219544683439536933338185723832743964258335163993324191589246399535845434167819135413916443764931668386817282279877264296262823999224943974974489892778799656723453849139194948368998995531261224669478559359689167934624681622834931223728318247832134758581882736415334187562342375144693398771223127132562692525629392889723242374746911936313136382354858767169452656224519128287899264831463597663461857119132312578648894815417348364532372836621644176295776978942783714778954864719541832176633892147845693752248565147794357864859961462918847471158244516279178346514129117328285132341339595664283"));
        assertEquals(1049, day.solution("5255443714755555317777152441826784321918285999594221531636242944998363716119294845838579943562543247239969555791772392681567883449837982119239536325341263524415397123824358467891963762948723327774545715851542429832119179139914471523515332247317441719184556891362179267368325486642376685657759623876854958721636574219871249645773738597751429959437466876166273755524873351452951411628479352522367714269718514838933283861425982562854845471512652555633922878128558926123935941858532446378815929573452775348599693982834699757734714187831337546474515678577158721751921562145591166634279699299418269158557557996583881642468274618196335267342897498486869925262896125146867124596587989531495891646681528259624674792728146526849711139146268799436334618974547539561587581268886449291817335232859391493839167111246376493191985145848531829344198536568987996894226585837348372958959535969651573516542581144462536574953764413723147957237298324458181291167587791714172674717898567269547766636143732438694473231473258452166457194797819423528139157452148236943283374193561963393846385622218535952591588353565319432285579711881559343544515461962846879685879431767963975654347569385354482226341261768547328749947163864645168428953445396361398873536434931823635522467754782422557998262858297563862492652464526366171218276176258582444923497181776129436396397333976215976731542182878979389362297155819461685361676414725597335759976285597713332688275241271664658286868697167515329811831234324698345159949135474463624749624626518247831448143876183133814263977611564339865466321244399177464822649611969896344874381978986453566979762911155931362394192663943526834148596342268321563885255765614418141828934971927998994739769141789185165461976425151855846739959338649499379657223196885539386154935586794548365861759354865453211721551776997576289811595654171672259129335243531518228282393326395241242185795828261319215164262237957743232558971289145639852148197184265766291885259847236646615935963759631145338159257538114359781854685695429348428884248972177278361353814766653996675994784195827214295462389532422825696456457332417366426619555"));
    }

    @Test
    public void testPart2Examples(){
        final Day1 day = new Day1(0.5f);
        assertEquals(6, day.solution(new int[] {1,2,1,2}));        //1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
        assertEquals(0, day.solution(new int[] {1,2,2,1}));        //1221 produces 0, because every comparison is between a 1 and a 2.
        assertEquals(4, day.solution(new int[] {1,2,3,4,2,5}));    //123425 produces 4, because both 2s match each other, but no other digit has a match.
        assertEquals(12, day.solution(new int[] {1,2,3,1,2,3}));   //123123 produces 12.
        assertEquals(4, day.solution(new int[] {1,2,1,3,1,4,1,5}));//12131415 produces 4.
    }

    @Test
    public void testPart2Solution(){
        final Day1 day = new Day1(0.5f);
        assertEquals(1268, day.solution("36743676522426214741687639282183216978128565594112364817283598621384839756628424146779311928318383597235968644687665159591573413233616717112157752469191845757712928347624726438516211153946892241449523148419426259291788938621886334734497823163281389389853675932246734153563861233894952657625868415432316155487242813798425779743561987563734944962846865263722712768674838244444385768568489842989878163655771847362656153372265945464128668412439248966939398765446171855144544285463517258749813731314365947372548811434646381595273172982466142248474238762554858654679415418693478512641864168398722199638775667744977941183772494538685398862344164521446115925528534491788728448668455349588972443295391385389551783289417349823383324748411689198219329996666752251815562522759374542652969147696419669914534586732436912798519697722586795746371697338416716842214313393228587413399534716394984183943123375517819622837972796431166264646432893478557659387795573234889141897313158457637142238315327877493994933514112645586351127139429281675912366669475931711974332271368287413985682374943195886455927839573986464555141679291998645936683639162588375974549467767623463935561847869527383395278248952314792112113126231246742753119748113828843917812547224498319849947517745625844819175973986843636628414965664466582172419197227695368492433353199233558872319529626825788288176275546566474824257336863977574347328469153319428883748696399544974133392589823343773897313173336568883385364166336362398636684459886283964242249228938383219255513996468586953519638111599935229115228837559242752925943653623682985576323929415445443378189472782454958232341986626791182861644112974418239286486722654442144851173538756859647218768134572858331849543266169672745221391659363674921469481143686952478771714585793322926824623482923579986434741714167134346384551362664177865452895348948953472328966995731169672573555621939584872187999325322327893336736611929752613241935211664248961527687778371971259654541239471766714469122213793348414477789271187324629397292446879752673"));
    }
}