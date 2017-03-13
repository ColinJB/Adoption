import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    Animal dog = new Animal();
      dog.mSpecies = "dog";
      dog.mSex = "male";
      dog.mAge = 7;
      dog.mColor = "black";
      dog.mName = "Willie";

    Animal cat = new Animal();
      cat.mSpecies = "cat";
      cat.mSex = "female";
      cat.mAge = 2;
      cat.mColor = "white";
      cat.mName = "Mittens";

    Animal rabbit = new Animal();
      rabbit.mSpecies = "rabbit";
      rabbit.mSex = "male";
      rabbit.mAge = 1;
      rabbit.mColor = "gray";
      rabbit.mName = "Thumper";

    Animal[] allAnimals = {dog, cat, rabbit};

    System.out.println("Would you prefer an inside or outside pet?");
    String userChoice = userConsole.readLine();

    System.out.println("Available Animals:");

    for ( Animal individualAnimal : allAnimals ) {
      if (individualAnimal.insidePet(userChoice)) {
        System.out.println("-------------");
        System.out.println( individualAnimal.mName );
        System.out.println( individualAnimal.mSpecies );
        System.out.println( individualAnimal.mSex );
        System.out.println( individualAnimal.mAge );
        System.out.println( individualAnimal.mColor );
      }
    }
  }
}
