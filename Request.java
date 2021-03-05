class Request {
  private int distance;
  private int numberOfPassengers;
  private int time;

  public Request(int distance, int numberOfPassengers, int time) {
    this.distance = distance;
    this.numberOfPassengers = numberOfPassengers;
    this.time = time;
  }
  
  public int getTime() {
    return this.time;
  }

  public int getDistance() {
    return this.distance;
  }

  public int getNumberOfPassengers() {
    return this.numberOfPassengers;
  }
}
