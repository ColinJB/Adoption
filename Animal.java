class Animal {
  public String mSpecies;
  public String mSex;
  public int mAge;
  public String mColor;
  public String mName;

  public boolean insidePet(String userChoice) {
    if ( mSpecies.equals("rabbit") || mSpecies.equals("cat") ) {
      return (userChoice.equals("inside"));
    } else {
      return (userChoice.equals("outside"));
    }
  }
}
