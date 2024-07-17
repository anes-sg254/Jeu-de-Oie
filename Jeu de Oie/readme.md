# TP8 - Jeu de L'oie

## Auteur

-SEGHIR ANES

## Objectifs

### objectifs atteints
Ce TP sur jeu de l'oie de la consolidé mes connaissances en programmation orientée objet. on appliquant l'heritage la class abstraite.
 

J'ai réussi.

### Difficultés recontrées

Pour ce tp j'ai pas eu des difficultées.

## Comment générer la documentation

* J'ouvre le dossier tp8 dans le terminal et j'execute cette  commande : 
* export CLASSPATH="src:classes" 
* ensuite celle la pour le dossier goosegame:
* javadoc src/goosegame/*.java -d docs
* ensuite celle la pour le dossier cell:
* javadoc src/goosegame/cells/*.java -d docs



## Comment compiler les classes du projet ?

* Tout d'abord une fois j'ouvre le tp8 terminal j'execute cette commande :export CLASSPATH="src:classes"

* ensuite pour compiler tout les classes j'execute cette commande: 
* javac src/goosegame/cells/*.java -d classes

* javac src/goosegame/*.java -d classes


## Comment compiler les testes du projet ?

* Pour compiler tout les testes du dossier rental j'execute cette commande: 
* javac -classpath junit-console.jar:classes test/goosegame/*.java



## Comment executer les testes ?

* pour executer les testes on prends par example le teste CellTest j'execute cette commande:
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.CellTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.ClassicalBoardTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.GameTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.GooseCellTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.PlayerTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.StartCellTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.TeleportationCellTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.TrapCellTest
* java -jar junit-console.jar -classpath test:classes -select-class goosegame.WaitingCellTest



## Comment tester l'exécution du programme ?

* une fois la compilation est faite:
 
* j'execute:
* java goosegame.GameMain  //ça affiche les cells et un message "give the players please"
* java goosegame.GameMain falou anes





## comment créer un fichier jar:

* jar cvfe goose.jar goosegame.GameMain -C classes goosegame


## pour l'éxecuté:

* java -jar goose.jar falou anes








