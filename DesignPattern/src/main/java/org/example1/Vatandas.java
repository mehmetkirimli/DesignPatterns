package org.example1;

public class Vatandas
{
  private Basbakan basbakan;

  public Vatandas(BasbakanlikKalemi kalem)
  {
    basbakan = kalem.banaBaskanVer();
  }

  public String dertAnlat()
  {
    basbakan.dertDinle("Bir derdim var sayın basbakanım ....");
    return "Yasasinn oley , derdimi anlatabildimm .";
  }

  public String isIste()
  {
    basbakan.isBul("Oglum");
    return "Yasasinn !!!" ;
  }

}
