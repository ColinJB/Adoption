import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    Animal dog = new Animal("dog", "male", 7, "black", "Willie", true);
    Animal cat = new Animal("cat", "female", 2, "white", "Mittens", false);
    Animal rabbit = new Animal("rabbit", "male", 1, "gray", "Thumper", true);

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(dog);
    allAnimals.add(cat);
    allAnimals.add(rabbit);

    boolean programRunning = true;
    while(programRunning){
      System.out.println("Hello! Welcome to our adoption center. Please choose one of the following: See all animals, see all animals up for adoption, filter inside/outside animals, or add an animal,");
      String navigationChoice = userConsole.readLine();
      if ( navigationChoice.equals("See all animals") ) {
        for ( Animal individualAnimal : allAnimals ) {
          System.out.println("-------------");
          System.out.println( individualAnimal.mName );
          System.out.println( individualAnimal.mSpecies );
          System.out.println( individualAnimal.mSex );
          System.out.println( individualAnimal.mAge );
          System.out.println( individualAnimal.mColor );
          System.out.println( individualAnimal.mAdopted);
        }
      } else if ( navigationChoice.equals("see all animals up for adoption")) {
        for ( Animal individualAnimal : allAnimals ) {
          if ( individualAnimal.mAdopted ) {
            System.out.println("-------------");
            System.out.println( individualAnimal.mName );
            System.out.println( individualAnimal.mSpecies );
            System.out.println( individualAnimal.mSex );
            System.out.println( individualAnimal.mAge );
            System.out.println( individualAnimal.mColor );
            System.out.println( individualAnimal.mAdopted);
          }
        }
      } else if ( navigationChoice.equals("filter inside/outside animals")) {
        System.out.println("Inside or Outside?");
        String userChoice = userConsole.readLine();
        for ( Animal individualAnimal : allAnimals ) {
          if ( individualAnimal.insidePet(userChoice)){
            System.out.println("-------------");
            System.out.println( individualAnimal.mName );
            System.out.println( individualAnimal.mSpecies );
            System.out.println( individualAnimal.mSex );
            System.out.println( individualAnimal.mAge );
            System.out.println( individualAnimal.mColor );
            System.out.println( individualAnimal.mAdopted);
          }
        }
      } else if ( navigationChoice.equals("add an animal") ) {
        System.out.println("Alright, let's add an animal! What is this animals name?");
        String animalName = userConsole.readLine();
        System.out.println("Great! What species is the animal?");
        String animalSpecies = userConsole.readLine();
        System.out.println("Got it! Is it male or female?");
        String animalSex = userConsole.readLine();
        System.out.println("And how old is this animal?");
        int animalAge = Integer.parseInt(userConsole.readLine());
        System.out.println("Super! What color is the animal?");
        String animalColor = userConsole.readLine();
      
        Animal newAnimal = new Animal(animalSpecies, animalSex, animalAge, animalColor, animalName, true);
        allAnimals.add(newAnimal);
        System.out.println("Alright, here's your animal:");
        System.out.println( "-----------" );
        System.out.println( newAnimal.mName );
        System.out.println( newAnimal.mSpecies );
        System.out.println( newAnimal.mSex );
        System.out.println( newAnimal.mAge );
        System.out.println( newAnimal.mColor );
        System.out.println( newAnimal.mAdopted );
      } else if ( navigationChoice.equals("Exit") ) {
        programRunning = false;
      } else {
        System.out.println("I'm sorry, please enter valid input.");
      }
    }
  }
}
