package org.example1;

public class Main
{
/**
 * Sıkıntı , çözümü görememeleri değil ,
 * Sıkıntı , problemi görememeleridir.
 **/
  public static void main(String[] args)
  {
    System.out.println("Hello World !");
    System.err.println(" *** Vatandaş başbakanlık kalemine gelir ve başkanla görüşmek ister");

    Basbakan basbakan = new GercekBasbakan();
    BasbakanlikKalemi kalem = new BasbakanlikKalemi(basbakan);

    Vatandas mehmet = new Vatandas(kalem);
    mehmet.dertAnlat();
    mehmet.isIste();
  }
}