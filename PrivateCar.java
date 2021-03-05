class PrivateCar extends Car {

  public PrivateCar(String licensePlate, int eta) {
    super(licensePlate, eta);
  }

  @Override
  public String toString() {
    return "PrivateCar " + super.toString();
  }
}
