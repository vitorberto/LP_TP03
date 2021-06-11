import java.util.Scanner;

public class TP03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Hora teste = new Hora();

    System.out.println("getHora1: " + teste.getHora1());
    System.out.println("getHora2: " + teste.getHora2());
    System.out.println("getSegundos: " + teste.getSegundos());

    int h = 0, m = 0, s = 0;

    Hora teste2 = new Hora(h, m, s);
    System.out.println("Teste 2 com valores do construtor marcados para 0 explicitamente no código: ");

    System.out.println("getHora1: " + teste2.getHora1());
    System.out.println("getHora2: " + teste2.getHora2());
    System.out.println("getSegundos: " + teste2.getSegundos());

    teste2.setHor();
    teste2.setMin();
    teste2.setSeg();

    System.out.println("Teste 2 com valores entregues pelo usuário através das funções set: ");

    System.out.println("getHora1: " + teste2.getHora1());
    System.out.println("getHora2: " + teste2.getHora2());
    System.out.println("getSegundos: " + teste2.getSegundos());

    System.out
        .println("Teste 2 com os valores explicitamente alterados para o horário 23:59:59 através das funções set");
    teste2.setHor(23);
    teste2.setMin(59);
    teste2.setSeg(59);

    System.out.println("getHora1: " + teste2.getHora1());
    System.out.println("getHora2: " + teste2.getHora2());
    System.out.println("getSegundos: " + teste2.getSegundos());

    System.out.println("String de hora montada com os valores retornados pelas funções get");
    int hor, min, seg;

    hor = teste2.getHor();
    min = teste2.getMin();
    seg = teste2.getSeg();

    System.out.println(hor + ":" + min + ":" + seg);

    scan.close();
  }
}
