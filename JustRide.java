class JustRide extends Service {

  public JustRide() {

  }

  @Override
  public String toString() {
    return "JustRide";
  }

  @Override
  public int computeFare(Request req) {
    int time = req.getTime();
    int distance = req.getDistance();
    int baseFare = 22 * distance;
    int fare = (time >= 600 && time <= 900) ? 500 + baseFare : baseFare;
    return fare;
  }
}
