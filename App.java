import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    Animal dog = new Animal("dog", "male", 7, "black", "Willie", true);
    Animal cat = new Animal("cat", "female", 2, "white", "Mittens", false);
    Animal rabbit = new Animal("rabbit", "male", 1, "gray", "Thumper", true);

    Animal[] allAnimals = {dog, cat, rabbit};

    System.out.println("Would you prefer an inside or outside pet?");
    String userChoice = userConsole.readLine();

    System.out.println("Available Animals:");

    for ( Animal individualAnimal : allAnimals ) {
      if ( individualAnimal.mAge > 1 ) {
        individualAnimal.adoptStatus();
      }
    }
    for ( Animal individualAnimal : allAnimals ) {
      if (individualAnimal.insidePet(userChoice)) {
        System.out.println("-------------");
        System.out.println( individualAnimal.mName );
        System.out.println( individualAnimal.mSpecies );
        System.out.println( individualAnimal.mSex );
        System.out.println( individualAnimal.mAge );
        System.out.println( individualAnimal.mColor );
        System.out.println( individualAnimal.mAdopted);
      }
    }
  }
}
