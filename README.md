# SnakeAndLadder
A dockerised , console application to play Snake and Ladder ! 

Project is structured into model,controller architecture...play around with the logic to make your own version of game.
Lets come to execution part.
Different ways to run the application after importing :
1. Build project , run the Main class.


2. Using jar of the project (already added to the repo or one can generate ) & run by executing the command :
    ```java -jar jar_file_location
    java -jar ./out/artifacts/SnakeAndLadder_jar/SnakeAndLadder.jar

3. Run using docker image ( only prerequisite : Docker should be installed on the system ) & exceute following commands :

  i. Create an image of the project with details specified in Dockerfile.We can assign image name if wanted using -t parameter followed by the name.Image name has to be in lowercase letter.
    ```docker build -t whateverimagename .```
 ii.  the image is created successfully, run the image using command 
     ``` docker run whateverimagename ```
 iii. tada !! ran our project through docker image , we can publish our snakeandladder game image to docker hub 


