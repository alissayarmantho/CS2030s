class Booking implements Comparable<Booking> {
  
  private Car car;
  private Service service;
  private Request req;

  public Booking(Car car, Service service, Request req) throws IllegalArgumentException {
    if (!(service instanceof JustRide)) {
      if ((service instanceof TakeACab && car instanceof PrivateCar) || 
          (service instanceof ShareARide && car instanceof Cab)) {
        String str = String.format("%s does not provide the %s service.", car, service);
        throw new IllegalArgumentException(str);
      }
    }
    this.car = car;
    this.service = service;
    this.req = req;
  }

  public int getFare() {
    return this.service.computeFare(req);
  }

  public int getWaitingTime() {
    return this.car.getETA();
  }

  @Override 
  public int compareTo(Booking booking) {
    if (this.getFare() == booking.getFare()) {
      return (this.getWaitingTime() <= booking.getWaitingTime()) ? -1 : 1;
    } else if (this.getFare() < booking.getFare()) {
      return -1;
    }
    return 1;
  }
}
