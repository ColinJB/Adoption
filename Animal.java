class Animal {
  public String mSpecies;
  public String mSex;
  public int mAge;
  public String mColor;
  public String mName;
  public boolean mAdopted;

  public Animal(String species, String sex, int age, String color, String name, boolean adopted) {
    mSpecies = species;
    mSex = sex;
    mAge = age;
    mColor = color;
    mName = name;
    mAdopted = adopted;
  }

  public boolean adoptStatus() {
    if ( mAdopted == true ) {
      return mAdopted = false;
    } else {
      return mAdopted = true;
    }
  }

  public boolean insidePet(String userChoice) {
    if ( mSpecies.equals("rabbit") || mSpecies.equals("cat") ) {
      return (userChoice.equals("inside"));
    } else {
      return (userChoice.equals("outside"));
    }
  }
}
