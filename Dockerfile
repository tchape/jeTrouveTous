#définition de l'image de départ pour la construction d'une nouvelle image
#definition de l'image de openjdk 8 officiel comme image de départ
FROM openjdk:8

#Ajout du jar de l'application dans le conteneur
ADD target/JeTrouveTous.jar JeTrouveTous.jar

#définition du port de communication avec l'exterieur
EXPOSE 8085

#définition de la commande par default a executer lors du lancement du conteneur
ENTRYPOINT ["java", "-jar", "JeTrouveTous.jar"]