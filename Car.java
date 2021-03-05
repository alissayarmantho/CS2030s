class Car {
  private String licensePlate;
  private int eta;

  public Car(String licensePlate, int eta) {
    this.licensePlate = licensePlate;
    this.eta = eta;
  }

  public int getETA() {
    return this.eta;
  }

  @Override
  public String toString() {
    String min = (eta <= 1) ? "min" : "mins";
    String str = String.format("%s (%d %s away)", licensePlate, eta, min);
    return str;
  }
}
