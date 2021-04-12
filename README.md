# Realisation de Calculatrice RPN

## Idée du projet:
L'objectif de ce projet est de realiser une calculatrice fonctionnant en mode RPN (Reverse Polish Notation), c'est une notation mathématique dans laquelle les opérateurs suivent leurs opérandes. Cette notation permet de représenter des formules arithmétiques sans parenthèses. Par exemple, « 2 × (3 + 4) » pourra s’écrire « 234 + × ».

### DEROULEMENT DU PROJET
**1) Les operations supporter sont addition, soustraction, multiplication, division**

**2) Implemenation d'une classe interpréteur générique, Interpreteur qui supporte uniquement les commandes undo et quit.**

*La commande quit stoppe le programme.*<br/>
*La commande undo supprime la dernière commande de l’historique.*<br/>
        
**3) Creation d'une classe MoteurRPN qui herite de l’interpréteur. Elle permet de :**

*enregistrer une opérande*<br/>
*appliquer une opération sur les opérandes*<br/>
*retourner l’ensemble des opérandes stockées*<br/>
        
**4) Creation de la classe SaisieRPN qui gère les interactions avec l’utilisateur et invoque le moteurRPN.**

**5) Implémenter le programme principal CalculatriceRPN.**

**5)Utilisation d'une classe enum pour implementer les diferents operations**






