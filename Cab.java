class Cab extends Car {

  public Cab(String licensePlate, int eta) {
    super(licensePlate, eta);
  }

  @Override
  public String toString() {
    return "Cab " + super.toString();
  }
}
