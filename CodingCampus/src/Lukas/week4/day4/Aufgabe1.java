package Lukas.week4.day4;

/**
 * <h1>Textanalyse</h1>
 * <br>Verschiedene Aufgaben zur Stringmanipulation und Analyse.
 * <br>Verwende dazu die Konstante TEXT_TO_ANALYSE dieser Klasse als Ausgangspunkt.
 * <br><strong>Arbeite wo du es als sinnvoll erachtest mit "lower case"</strong>
 * <br><strong>Verwende für alles nötige und sinnvolle eigene Methoden! Mindestens für jede Aufgabe eine eigene.</strong>
 * <br><strong>Mach die Methoden nun private, nicht mehr public.</strong>
 * <ol>
 *    <li>Zähle alle Wörter und gib diese aus.</li>
 *    <li>Zähle alle Zeilen und gib diese aus.</li>
 *    <li>Ersetze jedes Freisebad durch ___ und gib den Text aus</li>
 *    <li>Ersetze jedes "ist, und, oder" durch ___ und gib den Text aus, verwende dazu einen Regulären Ausdruck</li>
 *    <li>Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen und gib den Text aus.
 *    <br>Die Eingabe soll einzeilig erfolgen, z.b.: Haus,Maus,raus
 *    </li>
 *    <li>Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus.
 *    <br>Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.
 *    <li>Siehe 6), beschränke dich aber nun auf das Alphabet</li>
 *    <li>Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4
 *    <br>Gibt es einen unterschied zwischen den deutschen und den englischen Texten?
 *    </li>
 * </ol>
 */
public class Aufgabe1 {
    public static final String TEXT_TO_ANALYZE = "Das Freisebad ist eine ehemalige Badeanstalt an der Dr.-Kahlbaum-Allee in der Görlitzer Innenstadt in Sachsen.\n" +
            "\n" +
            "Im Jahr 1887 gründete der Magdeburger Sanitätsrat Walter Freise die Kaltwasser-Heilanstalt an der Promenade (heute: Dr.-Kahlbaum-Allee) gegenüber dem Tivoli und unweit der Kahlbaum’schen Nervenheilanstalt (später: II. medizinische Klinik). Es war neben der Hoffmann’schen Badeanstalt am Lindenweg und dem Zentralbad in der Hospitalstraße eine von drei Badeanstalten in der Stadt.\n" +
            "\n" +
            "Freise war Assistenzarzt im Krankenhaus an der Berliner Straße in Görlitz. Im Jahr 1885 eröffnete er eine Arztpraxis an der Promenade. Die Promenade war damals ein beliebter Flanierweg der Görlitzer Bürger und führte von der Stadt kommend vorbei am Stadtpark bis zum Blockhaus am Neißeviadukt.\n" +
            "\n" +
            "In Freises Heilanstalt wurden Wannen-, Dampf- und Heißluftbäder sowie Sole-, Fichtennadel- und Kräuterbäder sowie Moorbäder in Franzensbader Moorerde angeboten. Elektrische Licht- und Kohlensäurebäder ergänzten das Angebot. Von Beginn an stand den Besuchern auch ein Schwimmbecken zur Verfügung, das sowohl für Nichtschwimmer als auch für Schwimmer angelegt war. Es war sieben Meter breit, 15 Meter lang und an der tiefsten Stelle 2,80 Meter tief, wobei das Becken zur gegenüberliegenden Seite anstieg.\n" +
            "\n" +
            "Walter Freise leitete die Heilbadeanstalt bis 1905. Er gab das Bad auf Grund der hohen finanziellen Verluste an einen Verein ab, der das Bad noch bis 1919 weiter betrieb. Trotz der Zuschüsse, die die Stadt bereits seit 1901 zahlte, konnte die Badeanstalt keinen Gewinn verzeichnen. Der Verein bot das Bad schließlich der Stadt zum Kauf an, die den Betrieb ab dem 1. April 1920 weiterführte.\n" +
            "\n" +
            "Auch nach dem Zweiten Weltkrieg wurde das Freisebad fortgeführt und beherbergte zuletzt Dampfbad, Sauna, Duschen, Wannenbäder, ein Solarium und das Schwimmbecken. Die Stadt schloss das Freisebad am 31. März 1996.\n" +
            "\n" +
            "Die Stadt ließ 2009 den Großschornstein auf der Rückseite sichern und das Dach sowie die Dachentwässerung notdürftig erneuern, jedoch bedürfte das Dach nach Angaben der Stadt einer Kompletterneuerung und das Bad einer Grundsanierung, die die Stadt jedoch finanziell nicht leisten kann.\n" +
            "\n" +
            "Im Juni 2009 sollte im Freisebad unter dem Motto unerhörte Orte der 14. Jazztage Görlitz ein Konzert der Band Funk de Nite stattfinden, dies wurde jedoch in die alte Maschinenfabrik des Waggonbaus verlegt. Im gleichen Jahr öffnete das Bad jedoch zum Tag des offenen Denkmals seine Türen. Für den Film Grand Budapest Hotel diente es als Drehort.\n" +
            "\n" +
            "Es gab Pläne, das Bad und die ehemalige II. medizinische Klinik als Kompetenzzentrum für die Betreuung von Demenzpatienten (Kahlbaum-Projekt) zu reaktivieren und das Bad auch den Bürgern wieder zugänglich zu machen. Die Pläne lagen jedoch 2011 auf Eis.";

    public static final String TEXT_TO_ANALYSE_2 = "1992 war die Sportwagen-Weltmeisterschaft auf einem Tiefpunkt angelangt. Schon 1991 litt die Serie unter einem Mangel an Teilnehmern, sodass die Verantwortlichen der FIA 1992 ursprünglich keine Weltmeisterschaft durchführen wollten. Nach mehrmaliger Urgenz aus dem Vorstand des französischen Automobilherstellers Peugeot lenkte die FIA ein. Unter dem Vorstandsvorsitz von Jean Boillot wurde 1990 der Peugeot 905 vorgestellt. Ziel des auf mehrere Jahre angelegten Projekts, war neben dem Sieg beim 24-Stunden-Rennen von Le Mans auch der Gewinn der Sportwagen-Weltmeisterschaft. Nachdem man sich 1991 Jaguar geschlagen geben musste, sollte 1992 der Erfolg folgen. Eine Absage der Meisterschaft hätte beim Ausleben des Titels für Peugeot einen erheblichen finanziellen Verlust bedeutet, da die Marketingaktivitäten des Konzerns auf Erfolge im Motorsport aufbauten. Als Peugeot versicherte sich bei anderen Hersteller um ein Engagement zu bemühen, ließ sich die FIA umstimmen.\n" +
            "\n" +
            "Das Ende der Meisterschaft wurde bereits mit der Sportwagen-Weltmeisterschaft 1989 eingeleitet. Von den Änderungen betroffen war sowohl das sportliche wie das technische Reglement der Gruppe C. Für die Saison 1989 reduzierte die FIA die Mindestdistanz der bisherigen Langstreckenrennen von 1.000 auf 480 Kilometer, 1991 dann auf 430 Kilometer. Ebenfalls 1989 wurde der bisherige Grundsatz einer Verbrauchsformel aufgegeben. Stattdessen sollten Gruppe-C-Fahrzeuge fortan von 3,5-Liter-Saugmotoren angetrieben werden. Dies entsprach dem damaligen Stand der Formel 1, in der ab 1989 Turbomotoren verboten waren. Die Gruppe C2 entfiel ersatzlos. Motorenhersteller wie Mercedes-Benz gaben fortan ihr Engagement im Sportwagenrennsport auf und belieferten stattdessen Formel-1-Teams mit Motoren. Für Privatteams war eine erfolgreiche Teilnahme an der Sportwagen-WM vor dem Hintergrund, dass de facto Formel-1-Technik eingesetzt werden musste, nicht mehr finanzierbar. Mitunter wird gemutmaßt, die FIA habe zu Beginn der Neunzigerjahre durch ihre Reglementänderungen die Gruppe C bewusst unattraktiv werden lassen, da diese in der Publikums- und Mediengunst gegenüber der Formel-1-Weltmeisterschaft (ebenfalls veranstaltet von der FIA) zu einer inzwischen übermächtigen Konkurrenz geworden sei.\n" +
            "\n" +
            "Jaguar hatte sich mit dem Ende der Saison 1991 zurückgezogen, gab aber XJR-14-Chassis an Mazdaspeed ab. Dort wurde aus den Fahrgestellen der Mazda MXR-01 mit einem V10-Judd-Motor. Mazda bot dieses Fahrzeug Privatteams an. Bei Sauber hatte man nach Problemen mit dem Motor, die Entwicklung des Mercedes-Benz C292 aufgegeben, sodass neben dem Peugeot nur der Toyota TS010 als Werkswagen übrig blieb. Viele andere Projekte, wie der BRM P351 blieben Stückwerk.\n" +
            "\n" +
            "Von den vorerst geplanten 10 Rennveranstaltungen wurden nur sechs ausgetragen. Punkte für die ersten zehn wurden wie folgt vergeben: 20-15-12-10-8-6-4-3-2-1. Teams die mehrere Fahrzeuge gemeldet hatten, erhielten nur Punkte für das am besten Platzierte. Außerdem musste der jeweilige Wagen für alle Weltmeisterschaftsläufe gemeldet sein. Fahrer erhielten nur dann Punkte wenn der Wagen mindestens 90 % der Distanz des Siegerteams zurückgelegt hatte und sie mindestens 30 % der Renndistanz am Steuer saßen.\n" +
            "\n" +
            "Peugeot gewann überlegen die Markenwertung, Yannick Dalmas und Derek Warwick wurden Fahrerweltmeister.";

    public static final String TEXT_TO_ANALYSE_3 = "Austria, officially the Republic of Austria, is a landlocked East Alpine country in the southern part of Central Europe. It is composed of nine federated states, one of which is Vienna, Austria's capital and largest city. It is bordered by Germany to the northwest, the Czech Republic to the north, Slovakia to the northeast, Hungary to the east, Slovenia and Italy to the south, and Switzerland and Liechtenstein to the west. Austria occupies an area of 83,879 km2 (32,386 sq mi) and has a population of nearly 9 million people. While Austrian German is the country's official language, many Austrians communicate informally in a variety of Bavarian dialects.\n" +
            "\n" +
            "Austria initially emerged as a margraviate around 976 and developed into a duchy and archduchy. In the 16th century, Austria started serving as the heart of the Habsburg Monarchy and the junior branch of the House of Habsburg – one of the most influential royal dynasties in history. As an archduchy, it was a major component and administrative centre of the Holy Roman Empire. Early in the 19th century, Austria established its own empire, which became a great power and the leading force of the German Confederation, but pursued its own course independently of the other German states following its defeat in the Austro-Prussian War in 1866. In 1867, in compromise with Hungary, the Austria-Hungary Dual Monarchy was established.\n" +
            "\n" +
            "Austria was involved in World War I under Emperor Franz Joseph following the assassination of Archduke Ferdinand, the presumptive successor to the Austro-Hungarian throne. After the defeat and the dissolution of the Monarchy, the Republic of German-Austria was proclaimed with the intent of union with Germany, but the Allied Powers did not support the new state and it remained unrecognized. In 1919 the First Austrian Republic became the legal successor of Austria. In 1938, the Austrian-born Adolf Hitler, who became the Chancellor of the German Reich, achieved the annexation of Austria by the Anschluss. Following the defeat of Nazi Germany in 1945 and an extended period of Allied occupation, Austria was re-established as a sovereign and self-governing democratic nation known as the Second Republic.\n" +
            "\n" +
            "Austria is a parliamentary representative democracy with a directly elected Federal President as head of state and a Chancellor as head of the federal government. Major urban areas of Austria include Vienna, Graz, Linz, Salzburg and Innsbruck. Austria is consistently ranked in the top 20 richest countries in the world by GDP per capita terms. The country has achieved a high standard of living and in 2018 was ranked 20th in the world for its Human Development Index. Vienna consistently ranks in the top internationally on quality-of-life indicators.\n" +
            "\n" +
            "The Second Republic declared its perpetual neutrality in foreign political affairs in 1955. Austria has been a member of the United Nations since 1955 and joined the European Union in 1995. It plays host to the OSCE and OPEC and is a founding member of the OECD and Interpol. Austria also signed the Schengen Agreement in 1995, and adopted the euro currency in 1999.";

    public static final String TEXT_TO_ANALYSE_4 = "Österreich ist ein mitteleuropäischer Binnenstaat mit rund 8,9 Millionen Einwohnern. Die angrenzenden Staaten sind Deutschland und Tschechien im Norden, die Slowakei und Ungarn im Osten, Slowenien und Italien im Süden sowie die Schweiz und Liechtenstein im Westen.\n" +
            "\n" +
            "Österreich ist ein demokratischer und föderaler Bundesstaat, im Besonderen eine semipräsidentielle Republik. Seine großteils aus den historischen Kronländern hervorgegangenen neun Bundesländer sind das Burgenland, Kärnten, Niederösterreich, Oberösterreich, Salzburg, die Steiermark, Tirol, Vorarlberg und Wien. Das Bundesland Wien ist zugleich Bundeshauptstadt und auch einwohnerstärkste Stadt des Landes. Weitere Bevölkerungszentren sind Graz, Linz, Salzburg und Innsbruck.\n" +
            "\n" +
            "Das Land wird von der Böhmischen Masse und der Thaya im Norden, den Karawanken und dem Steirischen Hügelland im Süden, der Pannonischen Tiefebene im Osten sowie dem Rhein und dem Bodensee im Westen begrenzt. Mehr als 62 Prozent seiner Staatsfläche werden von alpinem Hochgebirge gebildet.\n" +
            "\n" +
            "Die Bezeichnung Österreich ist in ihrer althochdeutschen Form Ostarrichi erstmals aus dem Jahr 996 überliefert. Daneben war ab dem frühen Mittelalter die lateinische Bezeichnung Austria in Verwendung. Ursprünglich eine Grenzmark des Stammesherzogtums Baiern, wurde Österreich 1156 zu einem im Heiligen Römischen Reich eigenständigen Herzogtum erhoben. Nach dem Aussterben des Geschlechts der Babenberger 1246 setzte sich das Haus Habsburg im Kampf um die Herrschaft in Österreich durch. Das als Österreich bezeichnete Gebiet umfasste später die gesamte Habsburgermonarchie sowie in der Folge das 1804 konstituierte Kaisertum Österreich und die österreichische Reichshälfte der 1867 errichteten Doppelmonarchie Österreich-Ungarn.\n" +
            "\n" +
            "Die heutige Republik entstand ab 1918, nach dem für Österreich-Ungarn verlorenen Ersten Weltkrieg, aus den zunächst Deutschösterreich genannten deutschsprachigen Teilen der Monarchie. Mit dem Vertrag von Saint-Germain wurden die Staatsgrenze und der Name Republik Österreich festgelegt. Damit einher ging der Verlust Südtirols. Die Erste Republik war von innenpolitischen Spannungen geprägt, die in einen Bürgerkrieg und die Ständestaatsdiktatur mündeten. Durch den sogenannten „Anschluss“ stand das Land ab 1938 unter nationalsozialistischer Herrschaft. Nach der Niederlage des Deutschen Reiches im Zweiten Weltkrieg wieder ein eigenständiger Staat, erklärte Österreich am Ende der alliierten Besatzung 1955 seine immerwährende Neutralität und trat den Vereinten Nationen bei. Österreich ist seit 1956 Mitglied im Europarat, Gründungsmitglied der 1961 errichteten Organisation für wirtschaftliche Zusammenarbeit und Entwicklung (OECD) und seit 1995 ein Mitgliedsstaat der Europäischen Union.";
}
