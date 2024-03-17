# JAVA_RPC
client/server

RPC (Remote Process Call pour appel de procédure à distance) est un protocole de couche 5 du modèle OSI présent dans tous les systèmes d’exploitations (Windows, Linux, MacOS ou Android).
C’est une technique de communication interprocessus (inter-process communication – IPC) utilisée pour les applications client-serveur.
Un programme peut utiliser ce protocole pour demander un service à un programme situé dans un autre ordinateur d’un réseau sans avoir à comprendre les détails du réseau.

Un appel de procédure à distance ou RPC est utilisé dans l’informatique distribuée, et cet appel se produit lorsqu’une procédure est exécutée dans un espace d’adressage différent.

RPC utilise le modèle client-serveur. Le programme demandeur est un client et le programme fournisseur de services est le serveur. Comme un appel de procédure locale, une RPC est une opération synchrone qui exige que le programme demandeur soit suspendu jusqu’à ce que les résultats de la procédure distante soient renvoyés. Toutefois, l’utilisation de processus légers ou de threads qui partagent le même espace d’adressage permet d’exécuter plusieurs RPC simultanément.
Ce protocole est utile lorsque le processus ne connaît pas les détails du réseau de l’autre ordinateur et que le service est demandé dans un autre ordinateur. On parle également d’appel de sous-programme ou d’appel de fonction.
Il s’agit d’un modèle client-serveur. Les arguments sont transmis à une procédure à distance et l’appel est envoyé au serveur par le client. RPC peut être utilisé sous Windows, Apple et UNIX.

![image](https://github.com/yamitxc/RPCJAVA/assets/110922220/025df9dd-56d1-4217-a31c-9feda43c9942)


Voila les différentes étapes que l'on peut voir sur ce schéma :

1. le code client appelle une procédure stub (stub client local).

2. À partir des paramètres transmis par l’appel de procédure, le stub client génère un message prêt à l’envoi suivant le protocole RPC. Une sérialisation a lieu lors du transfert pendant laquelle les données structurées sont transférées sous une forme séquentielle. Ce processus de traduction est également appelé marshalling (de l’anglais « to marshal », ce qui signifie en français « lister », « trier »).

3. Le stub client contacte ensuite le système de communication de l’ordinateur local qui utilise TCP/IP ou UDP/IP pour l’échange de messages qui se déroule ensuite entre le client et le serveur.

4. Une fois le message envoyé parvenu au destinataire, le stub serveur exécute un demarshalling ou unmarshalling, en décompressant les paramètres contenus dans le message (sur la base du protocole RPC).

5. Le stub serveur transmet les paramètres décodés et assure ainsi l’appel local d’une procédure de serveur.

6. La valeur de fonction qui en résulte est communiquée au stub serveur.

7. Le processus est alors exécuté dans le sens inverse : génération d’un message prêt à l’envoi conformément au protocole RPC, échange de messages entre le serveur et le client, puis transport de la valeur de retour au code client en attente. L’application est poursuivie sur l’ordinateur d’origine.

