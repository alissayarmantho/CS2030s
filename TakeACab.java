class TakeACab extends Service {

  public TakeACab() {

  }

  @Override
  public String toString() {
    return "TakeACab";
  }

  @Override
  public int computeFare(Request req) {
    int distance = req.getDistance();
    int fare = (33 * distance) + 200;
    return fare;
  }
}
