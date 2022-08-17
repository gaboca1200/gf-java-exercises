public class DivideByZero {

  /*
  0-val való osztás

  Készíts egy függvényt, ami kap egy számot, majd elosztja
  ezzel a számmal a tízet és kiírja az eredményt.

  Ha a bemeneti paraméter 0, dobjon hibát, aminek az üzenete:
  'Hiba történt, 0-val való osztást próbáltál meg!'
  */

  public static void main(String[] args) {
    int number = 0;
    divider(number);
  }

  public static void divider(int number) {
    try {
      System.out.println(10 / number);
    } catch (ArithmeticException e) {
      System.out.println("Hiba történt, 0-val való osztást próbáltál meg!");
    }
  }


}
