# SnakeAndLadder
A dockerised , console application to play Snake and Ladder ! 
Different ways to run the application after importing :
1. Build the project , run the Main class.
2. Run jar of the project (already added to the repo or one can generate ) & run by executing the command :
    java -jar jar_file_location
    java -jar ./out/artifacts/SnakeAndLadder_jar/SnakeAndLadder.jar
3. Run using docker image ( only prerequisite : Docker should be installed on the system ) by exceuting following commands :
   >> Create an image of the project with details specified in Dockerfile.We can assign image name if wanted using -t parameter followed by the name.Image name has to be in lowercase letter.
    docker build -t whateverimagename .
  >> Once the image is created successfully, run the image using command 
    docker run whateverimagename
  >> tada !! ran our project through docker image , we can publish our snakeandladder game image to docker hub 


