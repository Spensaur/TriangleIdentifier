# TriangleIdentifier
Java program to identify the type of a given triangle(Equilateral, Isosceles, or Scalene).

In order to run this program java and maven must be installed.

On a mac this can be done with homebrew with the following commands:

>brew update<enter>
>brew cask install java<enter>
>brew install maven<enter>

Once java and maven are installed the program can be built with the following commands:

mvn package
java -cp target/TriangleIdentifier-1.0-SNAPSHOT-jar-with-dependencies.jar com.spencer.TriangleIdentifier arg1 arg2 arg3

arg1, arg2, and arg3 each represent the length of a side of a triangle. Each length must be a positive number and no single side can be greater than or equal to the sum of the other two sides. Each number must also be less than the max Double value(about 1.7*10^308).
