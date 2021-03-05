class ShareARide extends Service {

  public ShareARide() {

  }

  @Override
  public String toString() {
    return "ShareARide";
  }

  @Override
  public int computeFare(Request req) {
    int time = req.getTime();
    int distance = req.getDistance();
    int numberOfPassengers = req.getNumberOfPassengers();
    int baseFare = 50 *  distance / numberOfPassengers;
    int fare = (time >= 600 && time <= 900) ? 500 + baseFare : baseFare;
    return fare;
  }
}
