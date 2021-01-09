class ParkingSystem {
  int[] count;
  public ParkingSystem(int big, int medium, int small) {
    count = new int[] {
      big,
      medium,
      small
    }; //array of frequencies of vehicles of sizes big,med,small
  }

  public boolean addCar(int carType) {
    return count[carType - 1]-->0;
    //this line is tricky: at index [carType minus 1], return true if value at index is / 0 (does it have space?)
    //then, decrement value at that index (1 less spot available for that cartype)
  }
}