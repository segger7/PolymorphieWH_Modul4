# Lerntagebuch Modul 4

### Modul 4 Teil 1 (30.09.2024)

Die Klasse Aufgabe hat folgende Basisfunktionalitäten: Ein Datenfeld Titel vom Typ String
und ein Datenfeld Erstellungsdatum vom Typ GregorianCalender. Dazu einen Konstruktor mit einem
Parameter, der den Titel vergibt. Zusätzlich gibt es eine angepasste toString-Methode um die
Aufgaben in richtiger Form auf der Kommandozeile ausgeben zu können.

Die Klasse AufgabeMitDeadline erbt von Aufgabe und fügt die Funktionalität einer Deadline in Form
eines Datenfelds vom Typ GregorianCalender hinzu.



### Modul 4 Teil 2 (01.10.2024)

Die App Klasse bietet ein Kommandozeilenmenü das solange bestehen bleibt bis man es mit einer Eingabe beendet
Man kann verschiedene Eingaben (Die mit einem Scanner eingelesen werden) treffen, um unterschiedliche Aktionen auszuführen.

1. Alle Aufgaben der Liste ausgeben. Dabei wird mit einer for each Schleife alle Aufgaben aus dem Datenfeld Objekt aufgabenliste von der Klasse Aufgabenliste, die eine List als Datenfeld enthält auf die Kommandozeile per angepasster toString-Methode ausgegeben.

2. Bestimmte Aufgabe ausgeben. Dabei wird wieder mit einer for-each Schleife die Aufgabenliste  nach Aufgaben mit einem Titel der einem zuvor einlesenen Titel übereinstimmt durchsucht, dieser wird dann vollständig auf die Kommandozeile ausgegeben.

3. Deadlines anzeigen. Hier wird nach bestimmten Aufgaben gesucht die vom Typ AufgabeMitDeadline sind, dafür wird der instanceof Operator genutzt. Danach werden alle Aufgaben mit Deadlines ausgegeben, und die die schon überfallig sind werden mit einem Rufezeichen am Anfang ausgegeben.

4. (a) Hier wird eine normale Aufgabe hinzugefügt, indem man einen Titel auf die Kommandozeile eingibt.
   (b) Hier wird eine Deadline-Aufgabe hinzugefügt, indem man einen Titel, und den Tag, Monat und Jahr eingibt.

5. Aufgabe als erledigt markieren. Hier gibt man einen Index vom Typ int ein, der dann den jeweiligen Index Eintrag aus der Liste löscht.
6. (x) mit Eingabe eines x wird das Programm beendet

### Fragen für das Lerntagebuch

1. Was habe ich im Rahmen der Lernaufgabe gelernt (Lernertrag)?

Mir waren grundsätzlich alle Konzepte schon vorher bekannt aber ich habe durch
die Aufgabe die Konzepte nochmal wiederholen können und habe das erste Mal die Klasse
GregorianCalendar benutzt.

2. Was habe ich noch überhaupt nicht verstanden?

Ich habe alles verstanden.

3. Was ich dazugelernt habe und jetzt besser kann:

Ich kann alles gleich gut wie davor.

4. !Ungültiger Link! zur Fragestellung

Ich kann diese Frage nicht beantworten da ein Ungültiger Link in der Fragestellung vorkommt.

5. !Ungültiger Link! zur Fragestellung

Ich kann diese Frage nicht beantworten da ein Ungültiger Link in der Fragestellung vorkommt.

6. Wie wird es weitergehen?

Ich denke das ich alles von dieser Aufgabe sehr gut
verstanden habe.