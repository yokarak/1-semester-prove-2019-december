# 1. semester prøve / programmering 2019 december

**Dato: 18. december 2020 8:30 - 15:45**

Det er tid til at afprøve det, du lærte igennem første semester på datamatiker-uddannelsen. 

Denne prøve er en milepæl, så du kan se, hvor langt du er nået. Gør dit bedste for at løse opgaverne, og være ikke bang for at løse dem forkert. 

Det er ikke en tragedie, hvis ikke du kan løse alle opgaverne, for du har endnu 2 år til at øve dig på bl.a. programmering.

Men tage gerne dine mangler alvorligt, og brug de kommende måneder på at lære det, du mangler. 

Søg evt. hjælp for hos dine undervisere, vi er her for at hjælpe dig at lære. 

# Overordnet tema: Quiz

#### OBS! Du skal ___committe___ dine ændringer efter hver opgave eller hver time, så vi kan  se udvikling i din kode. Til sidst - og kun til allersidst - kan du pushe hele repoet op til GitHub.

Hvis du går i stå med en opgave, så fortsat med det næste, og vend tilbage senere. Lex Simon: Du skal kun pushe til allersidst.

### Opgave 1 - Opvarmning Main.java

Skriv en "Hello world!" applikation i Java, klassenavnet skal være **Main**.

Når det virker, så skal du lave en hello(String navn) metode, som returnerer teksten "Hello András!", når man kalder den som 

```hello("András");```

Nu skal du køre min test for at vise, at metoden fungerer efter hensigten. Test med **MainTest**.java. 

Commit koden til Github.

### Opgave 2 - Opvarmning 2 - Quickmaths

Du skal udvikle en ny klasse, som indlæser to tal fra brugeren via Scanner og viser gennemstnittet og summen. Klassenavn: **Quickmaths**.

Denne klasse skal have 2 metoder, gennemsnit(int a, int b) og sum (int a, int b), som begge returnerer integers.

Skriv unit tests til disse 2 metoder. 

Commit ændringerne.

### Opgave 3 - Exceptions
Nu skal du udvide Quickmaths klassen, så den kan smide exceptions på forkert indtastning eller hvis der kun indtastes 0 er. 

### Opgave 4 - OOD
Vi skal design og udvikle 3 nye java-klasser.

Quizspørgsmål skal repræsenteres af en klasse. 
Hvert spørgsmål er maksimum 100 tegn langt. 
De kan have en pointværdi fra 0 til 1000.
Spørgsmålene skal have nogle svarmuligheder tilknyttet. 
Objektet skal også indeholde information om, hvilket svar er det rigtige.

Svarene skal også repræsenteres af en klasse.
Hvert svar er maksimum 30 tegn langt. 

Den tredje klasse, som vi skal udvikle er selv quiz-klassen, som skal indeholde 3 spørgsmåls-objekter med tilhørende svar.

Det skal være muligt at bruge de ...

Tegn en klassediagram for ovenstående, og derefter kan du implementere koden. Til sidst må du genrere et diagram i IntelliJ for at se, om din implementering passer.

Commit ændringerne.
  

### Opgave 5 - Nedarvning
Nu skal du lave en ny klasse, der extender quizspørgsmål således, at der kan knyttes et billede til spørgsmålerne.  



Opret en metode ved navnet **logToConsol()** i klassen **Media**, som skal printe klassens **name** instansvariable  og klassens medietype (i dette tilfælde Media) til consollen.

Override nu denne metode i Video, Billede og Artikel subclasses, så de skriver de respektive medietyper til konsolen i stedet for "Media".

Opdater klassediagrammet så det afspejler ændringerne i koden.

Commit ændringerne.

### Opgave 6 - TDD opgave

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

# Aflevering 

Følgende skal afleveres i Wiseflow:

1. Din IntelliJ projektmappe pakket som **zip-fil**, inklusiv kommentarer. 
2. Din besvarelse i et Word eller Google dokument, som via skærmbilleder og forklarende tekst viser, hvordan programmet fungerer og hvordan det er udviklet. 
3. Et link til dit projekt på GitHub, hvor du har comittet og pushet alle dine ændringer og tilføjelser!

**[Link til Wiseflow...](https://europe.wiseflow.net/participant/)**


# God arbejdslyst! 
 András 
