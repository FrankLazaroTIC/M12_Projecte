# Projecte
El congrés de mòbils se celebra a Barcelona cada any. Els organitzadors han de dissenyar una aplicació per catalogar tots els dispositius mòbils que s'hi presentaran.

Els dispositius que es volen catalogar són: smartphones, tablets i altres dispositius. Tot dispositiu mòbil té una marca, un model i un preu base. En el cas dels smartphones es vol saber el sistema operatiu i el hardware de què disposa: acceleròmetre (si o no, per defecte no) i gps (si o no, per defecte si). Dels tablets es vol saber el nombre de polsades. Finalment, per qualsevol altre dispositiu que no sigui un smartphone ni tablet es vol emmagatzemar una descripció del dispositiu.

Resol els següents exercicis en l'ordre establert:

1. Crear les classes necessàries de manera que es reutilitzi al màxim el codi. Mètodes que cal implementar necessàriament:
* Constructors: el que té paràmetres per inicialitzar cada atribut de la classe.
* Mètodes d'instància: getters i setters de cada atribut. Sobreescriptura del mètode toString a   cada classe, amb el qual s'ha de retornar una cadena amb la   informació de tots els atributs.    
* La classe Main que instanciï una llista amb 5 dispositius i els mostri. Els dispositius són: un rellotge intel·ligent de 100 Euros, un mòbil Android sense accelerador ni gps de 300 Euros, un iPhone de 500 Euros amb accelerador i gps, una tablet de 400 Euros i un altre dispositiu qualsevol.
* Adjunteu captura de l’execució del Main de manera que mostri per pantalla tots els dispositius creats.

2. El preu final dels tots els dispositius és doble del seu preu base. A més, per als mòbils smartphone es calcula segons el següent criteri: 

* Si té acceleròmetre s'incrementa un 10% el preu base i, si a més de l’accelerometre també té gps, s'incrementa un 5% addicional.

Proposeu una solució perquè el càlcul del preu d'aquest tipus de dispositius sigui diferent al de la resta.
Afegiu a Main el codi necessari per a què mostri el preu base i el preu final de tots els dispositius que heu instanciat anteriorment.

* Adjunteu captura d’aquesta part de l’execució Main.

3. Es desitja saber si un dispositiu smartphone o tablet és de gamma alta. Per fer-ho, cal crear la interfície GammaAlta en el qual hi ha d'haver el mètode isGammaAlta. Un smartphone és considerat de gamma alta si el seu preu final supera els 700€ i un tablet és de gamma alta si el seu preu final supera 900€.
* Sense tocar la superclasse, feu la codificació per determinar els dispositius que són de gamma alta.  
* Afegiu al final de la classe Main el codi que mostri quins són els dispositius de gamma alta.
* Adjunteu captura d’aquesta part de l’execució del Main.