***1. Compilation du code :***
Ouvrez un terminal dans le répertoire de vos fichiers source Java.
Utilisez la commande javac pour compiler les fichiers source:

### javac RMIInterface.java RMIServeur.java RMIClient.java   //Cela générera les fichiers .class correspondants//

***2. Création du fichier stub :***
Utilisez la commande rmic pour générer le fichier stub du serveur

### rmic RMIServer.java          //Ceci créera un fichier MonServiceRPCServeur_Stub.class.//

***3. Démarrage du registre RMI :***
Dans le même répertoire, ouvrez un autre terminal et exécutez le registre RMI.

### rmiregistry &     //Le & permet d'exécuter le registre en arrière-plan.//

***4. Exécution du serveur :***
Toujours dans le premier terminal, lancez votre serveur en spécifiant la politique de sécurité.
### java -Djava.security.policy=server.policy MonServiceRPCServeur

Assurez-vous d'avoir un fichier server.policy configuré avec les autorisations nécessaires. Un exemple simple pourrait être :
grant {
    permission java.security.AllPermission;
};
5. Exécution du client :
Ouvrez un troisième terminal et démarrez votre client.
### java -Djava.security.policy=client.policy RMIClient.java
Assurez-vous que le fichier client.policy est également configuré correctement.
