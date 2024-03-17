# JAVA_RPC
client/server

RPC (Remote Process Call pour appel de procédure à distance) est un protocole de couche 5 du modèle OSI présent dans tous les systèmes d’exploitations (Windows, Linux, MacOS ou Android).
C’est une technique de communication interprocessus (inter-process communication – IPC) utilisée pour les applications client-serveur.
Un programme peut utiliser ce protocole pour demander un service à un programme situé dans un autre ordinateur d’un réseau sans avoir à comprendre les détails du réseau.

Un appel de procédure à distance ou RPC est utilisé dans l’informatique distribuée, et cet appel se produit lorsqu’une procédure est exécutée dans un espace d’adressage différent.

RPC utilise le modèle client-serveur. Le programme demandeur est un client et le programme fournisseur de services est le serveur. Comme un appel de procédure locale, une RPC est une opération synchrone qui exige que le programme demandeur soit suspendu jusqu’à ce que les résultats de la procédure distante soient renvoyés. Toutefois, l’utilisation de processus légers ou de threads qui partagent le même espace d’adressage permet d’exécuter plusieurs RPC simultanément.
Ce protocole est utile lorsque le processus ne connaît pas les détails du réseau de l’autre ordinateur et que le service est demandé dans un autre ordinateur. On parle également d’appel de sous-programme ou d’appel de fonction.
Il s’agit d’un modèle client-serveur. Les arguments sont transmis à une procédure à distance et l’appel est envoyé au serveur par le client. RPC peut être utilisé sous Windows, Apple et UNIX.

![image](https://github.com/yamitxc/RPCJAVA/assets/110922220/daee5675-c365-4868-a093-eb563c5718fb)

