# 1. semester prøve / programmering 2019 december

**Dato: 18. december 2020 8:30 - 15:45**

Det er tid til at afprøve det, du lærte igennem første semester på datamatiker-uddannelsen. 

Denne prøve er en milepæl, så du kan se, hvor langt du er nået. Gør dit bedste for at løse opgaverne, og være ikke bang for at løse dem forkert. 

Det er ikke en tragedie, hvis ikke du kan løse alle opgaverne, for du har endnu 2 år til at øve dig på bl.a. programmering.

Men tage dine mangler alvorligt, og lær det, du mangler. Søg evt. hjælp for hos dine undervisere, vi er her for at hjælpe dig at lære. 

# Aflevering 
Følgende skal afleveres i Wiseflow:

#### OBS! Du skal ___committe___ dine ændringer efter hver opgave eller hver time, så vi kan  se udvikling i din kode. Til sidst kan du pushe hele repoet op til GitHub. Hvis du går i stå med en opgave, så fortsat med det næste, og vend tilbage senere. Lex Simon: Du skal kun pushe til allersidst!

1. Din IntelliJ projektmappe pakket som **zip-fil**, inklusiv kommentarer. 
2. Din besvarelse i et Word eller Google dokument, som via skærmbilleder og forklarende tekst viser, hvordan programmet fungerer og hvordan det er udviklet. 
3. Et link til dit projekt på GitHub, hvor du har comittet og pushet alle dine ændringer og tilføjelser!

**[Link til Wiseflow...](https://europe.wiseflow.net/manager/display.php?id=1093138)**


# Overordnet tema: ...

...


1. Skriv en hello world i java
2. op på github med det + readme der viser md formattering (minimum 5)
3. et program, som indlæser 2 tal og viser gennemstnittet og summen
4. programmet skal smide exceptions på fordkert indtastning  eller hvis der kun indtastes 0er 
6. udvid, så programmer skal køre indtil man indtaster exit
7. test gennemsnit() og (sum) metoden
8. 


### Opgave 1 - Opstart

Vi har forberedt noget starter-kode, som du skal arbejde med. Fork den fra **[https://github.com/andracs/1sem_exam_2018_B](https://github.com/andracs/1sem_exam_2018_B)**

### Opgave 2 - Velkommen
Programmet starter i Main klassen. Se, om du kan køre main metoden i denne klasse. 

Forstå, hvordan det virker, og modificer koden således, at den skriver "TV2 Media Manager" i stedet for "Hello World". 

Du kan også konkatenere konstanten SOFTWARE_VERSION fra Main klassen til denne velkomsthilsen.

Commit ændringerne.

### Opgave 3 - Klasser og kodeforståelse
Åben **media** mappen, og se, hvilke filer der er heri. 

Åbn **Main** klassen og forstå dens opbygning. Skriv  kommentarer i klassen.

Åbn **Media** klassen og forstå dens opbygning.  Skriv  kommentarer i klassen.

Åbn **MediaID** klassen, og forstå, hvordan den virker. Din opgave er at skrive kommentarer til alle linjer i denne klasse, og forklare, hvordan den virker. Brug fagsprog.

Konstruer et klassediagram der dokumenterer klassernes indhold og indbyrdes relationer. Du bestemmer selv om du vil bruge Visio, draw.io eller et billede af et håndtegnet diagram. Placer klassediagrammet i dit repository så det løbende bliver inkluderet i hvert commit.

Commit ændringerne.

### Opgave 4 - Nedarvning
Opret 3 nye klasser, som skal repræsentere hhv. billede, video og artikel medietyperne. De skal alle nedarve fra **Media** klassen og udvide den med følgende klassevariabler:

- __Video__:
  - filtype (mp4, m4v, mov)
  - længde (minutter og sekunder)
  - opløsing (SD, HD)
  - fotograf (navn)
 
- __Billede__:
  - filtype (jpg, png, gif)
  - bredde i pixels
  - højde i pixels
  - fotograf (navn)
 
- __Artikel__
  - forfatter (navn)
  - artikeltekst
  - tilhørende billede 
  
 Opdater klassediagrammet så det afspejler tilføjelsen af de nye klasser.
 
 Commit ændringerne.
  

### Opgave 5 - Metoder
Opret en metode ved navnet **logToConsol()** i klassen **Media**, som skal printe klassens **name** instansvariable  og klassens medietype (i dette tilfælde Media) til consollen.

Override nu denne metode i Video, Billede og Artikel subclasses, så de skriver de respektive medietyper til konsolen i stedet for "Media".

Opdater klassediagrammet så det afspejler ændringerne i koden.

Commit ændringerne.

### Opgave 6 - Array, loop og if (eller case) 
TV2 gemmer alle deres mediafiler i en mappe, som vi i vores udviklingsmiljø emulerer med **[media](https://github.com/andracs/1sem_exam_2018_B/tree/master/media)** mappen i projektet.

Opret en metode med navnet **logMediaFolder(String folderNavn)**, som kan vise alle filer fra "mediemappen" på stdout (consol).

Opret en anden metode med navnet **readMediaFolder(String folderNavn)**, som kan indlæse alle filnavne fra "/media" mappen i et array eller ArrayList. Metoden skal returnere dette array eller en ArrayList, som indeholder mappens filer. 

Udskriv alle filnavne fra denne array/Arraylist i konsollen.

Udvid din **readMediaFolder()** medtode således, at den instantierer et medie-objekt for hver indlæst mediefil. (Obs: Brug gerne de specifikke typer frem for det generiske. Brug en if- eller en case-sætning til at afgøre om det er det ene eller det andet.)

Opdater klassediagrammet så det afspejler ændringerne i koden.

Commit ændringerne.

### Opgave 7 - Database
Opret en database og en tabel i MySQL, som kan indeholde TV2.dk's mediedata. 

Opret en metode, som kan tage et array eller ArrayList med filernes egenskaber som parameter, og som gemmer disse i en database. (Du behøver ikke at gemme alle egenskaber, bare et par stykker, der viser, at du forstår at gemme i database.)

Indtast dummy mediadata i tabellerne, og eksporter din database i SQL-format, og gem din eksport i projektets SQL mappe. 

Opdater klassediagrammet så det afspejler ændringerne i koden.

Commit ændringerne.

### Opgave 8 - GUI
Design et GUI vha. Gluon SceneBuilder, som kan vise alle filnavne fra "media" mappen. 

Tilføj funktionalitet til GUI'et, så den rent faktisk indlæser filerne fra folderen, og viser dem i GUI'et. Brug evt den metode, du tidligere har udviklet. 

Commit ændringerne.
 
### Opgave 9 - Refactoring 
TV2 vil gerne have, at brugernes videoer og billeder skulle også indgå i systemet. Udvid systemet, så den kan skelne mellem bruger-genereret indhold og indhold som er lavet af TV2. (Hint: Kan du tilføje en instansvariable, som indikerer brugergenereret indhold? På hvilken klasse?)

Skriv i README filen, hvordan du har løst denne opgave. 

Commit ændringerne.

### Opgave 10 - Test
Skriv en test med navnet MediaIDTest, der tester, hvorvidt MediaID's generate() metode altid returnerer en unik, numerisk ID. 

Commit ændringerne.

### Opgave 11 - Avancerede ekstraopgave
Hvis du har mere tid, kan du også løse følgende opgaver:

Du skal udvide din applikation, så medie-data kan oprettes, rettes og slettes i databasen via GUI'et.

Hvis du stadig har tid, kan du prøve at implementere medievisning i GUI for stationens billede- og videofiler. 

Commit ændringerne.
 

# God arbejdslyst! 
 András 
