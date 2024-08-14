package org.example1;

public class VekilBasbakan implements Basbakan
{
  private Basbakan gercekBasbakan;

  public VekilBasbakan(Basbakan gercekBasbakan)
  {
    this.gercekBasbakan = gercekBasbakan;
  }

  @Override
  public void dertDinle(String dert) {
    System.out.println("Vekil : Derdinizi dinliyorum .");
    if(ayikla("olumlu"))
    {
      ilet(dert);
    }
  }

  @Override
  public void isBul(String is) {
    System.out.println("Vekil : Isteklerinizi dinliyorum ..");
  }

  private Boolean ayikla(String cv)
  {
    if(cv == "olumlu")
    {
      return true;
    }
    return false;
  }

  private void ilet(String cv)
  {
    gercekBasbakan.dertDinle(cv);
  }
}
