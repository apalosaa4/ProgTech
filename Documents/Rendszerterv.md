# Rendszerterv

## A rendszer célja

Aki szokott főzni, illetve bármilyen köze is van a főzéshez vagy közel áll a konyhához az tudhatja, hogy milyen nehéz lehet néha kitalálni, kigondolni vagy megfogalmazni mit is szeretne főzni. 
Alkalmazásunkkal a mindennapi életben szeretnénk segíteni a felhasználóknak. 
Mégpedig olyan módon, hogy az alapból otthon meglévő alapanyagokból szeretnénk recept ötleteket felajánlani, így nem kell találgatni hosszas órákon vagy napokon keresztül, hogy mit készítsünk, illetve a több lehetőség közül amit az alkalmazás ajánl rögtön elkeszíthetjük a nekünk tetsző receptet.


## Projekt terv

Projektmunka és a felelősök:

 - Adatbázis tervezése és létrehozása:
	 - Bognár Viktória
	 - Kulcsár Vivien
 - API tervezése és létrehozása:
	 - Bognár Viktória
	 - Kulcsár Vivien
 - Java alapú alkalmazás tervezése:
	 - Bognár Viktória
	 - Kulcsár Vivien
- Java alapú alkalmazás megvalósítása:
	 - Bognár Viktória
	 - Kulcsár Vivien
- Alkalmazás tesztelése:
	- Bognár Viktória
	- Kulcsár Vivien

## Üzleti folymatok modellje

![Üzleti folymatok modellje](https://raw.githubusercontent.com/apalosaa4/ProgTech/main/Documents/Images/%C3%9Czleti%20folyamatok%20modellje.png)


## Követelmények

 - Ablakos alkalmazás megvalósítása, ami user friendly legyen, azaz a felhasználónak könnyű és egyértelmű legyen a használata.
 - Az adott recepteket, hozzávalókat, alapanyagokat és esetleges allergiákat egy adatbazis rendszerben tárolni tudjuk.
 - Az adott adatbázisunkkal való kommunikácó és változtatások logolása.

 - Esetleges szabályok vagy törvényi előírások:
	-   JAVA alapú alkalmazás
	-   Intuitív, átlátható rendszer 

## Funkcionális terv
 -   Alkalmazást használók
	 - Nem szükséges a bejelentkezés
	 - Nem szükséges egy admin felhasználó jelenléte

 -   Alkalmazás használati esetei és lefutásai:
	 - Az adott felhasználó ki tudja választani az alapanyagokat
	 - Az adott felhasználó az alapanyagok alapján tud böngészni a lehetséges receptek között
	 - Az adott felhasználó a receptek közül ki tudja választani a neki legmegfelelőbbet
	 - Az adott felhasználó meg tudja nézni a recept részletes leírását


## Fizikai környezet

Ezt az alkalmazást asztali platformra tervezzük, melyet Java nyelv használatával tudunk megvalósítani.
Ezt a későbbiekben akár telefonon androidos applikációra is át lehet formálni.

Fejlesztői eszközök:

-   Diagrams.Net
-   IntelliJ IDEA
-   Visual Studio Code
-   XAMPP
-   MySQL Workbench
-   DataGrip


## Architektruális terv

- Adatbázis szerver: MySQL
- Java
- Java Swing

Az alkalmazáshoz szükség van egy adatbázis szerverre. A kliens oldali alkalmazást Java segítségével implementáljuk, emellett a Swinget is használjuk a GUI elkészítéséhez.

## Adatbázis terv
![Adatbázis terv](https://github.com/apalosaa4/ProgTech/blob/main/Documents/Images/Recipes.png)

## Implementációs terv

Egy ablakos asztali alkalmazást készítünk Java-ban, a GUI elkészítéséhez Java Swinget is használunk. Két tervezési mintát alkalmazunk, melyek a következők:

- Observer
-


## Telepítési terv

Az alkalmazás használatához egy számítógépre van szügségünk, melyen futtatni tudjuk.

## Tesztterv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

### Tesztelési eljárások

Unit teszt:
Ahol csak lehetséges, szükséges már a fejlesztési idő alatt is tesztelni, hogy a metódusok megfelelően működnek-e. Ezért a metódusok megfelelő működésének biztosítására írni kell Unit teszteket. A metódusok akkor vannak kész, ha a tesztesetek hiba nélkül lefutnak az egyes metódusokon.

| Tesztelő:                | Időpont:     Év/Hónap/Nap |
|--------------------------|---------------------------|

| Időpont | Teszt              | Eredmény | Megjegyzés                                                                      |
|:-------:|--------------------|----------|---------------------------------------------------------------------------------|
|  18:34  |     Példa          | Sikeres  | A példa gomb megnyomására a példa adatok megjelentek.                           | 

## Karbantartási terv

Az alkalmazás folyamatos üzemeltetése és karbantartása, mely magában foglalja a programhibák elhárítását, a belső igények változása miatti módosításokat, valamint a környezeti feltételek változása miatt
megfogalmazott program-, illetve állomány módosítási igényeket.

### Karbantartás
- Corrective Maintenance: A felhasználók által felfedezett és "user reportban"
  elküldött hibák kijavítása.
- Adaptive Maintenance: A program naprakészen tartása és finomhangolása.
- Perfective Maintenance: A szoftver hosszútávú használata érdekében végzett
  módosítások, új funkciók, a szoftver teljesítményének és működési
  megbízhatóságának javítása.
- Preventive Maintenance: Olyan problémák elhárítása, amelyek még nem
  tűnnek fontosnak, de később komoly problémákaat okozhatnak.
