class ScopeTesting {
  public static void main(String args[]) {
    int i;
    for (i = 0; i < 10; i++) {
      char favoriteLetter = 'r';
      if (i < 7) {
        System.out.println("Small enough to work with");
      }
      else {
        boolean large = true;
        System.out.println(large);
      }
      System.out.println(large);
      System.out.println(favoriteLetter);
    }
    System.out.println(favoriteLetter);
  }
}
