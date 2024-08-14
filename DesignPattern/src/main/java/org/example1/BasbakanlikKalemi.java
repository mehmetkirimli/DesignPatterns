package org.example1;

public class BasbakanlikKalemi
{
  private Basbakan basbakan;

  public BasbakanlikKalemi(Basbakan basbakan)
  {
    this.basbakan = new VekilBasbakan(basbakan);
  }

  public Basbakan banaBaskanVer()
  {
    System.out.println("Basbakanlik Kalemi : Tabi Efendim ..");
    return basbakan;
  }

}
