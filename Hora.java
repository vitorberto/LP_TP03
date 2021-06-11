import java.util.Scanner;

public class Hora {
  private int hora;
  private int min;
  private int seg;

  public Hora() {
    Scanner scan = new Scanner(System.in);
    boolean hValido = false, mValido = false, sValido = false;
    String gotH, gotM, gotS;
    int h = 0, m = 0, s = 0;

    /* ------------------------- pegando o valor da hora ------------------------ */
    do {
      System.out.println("Por favor digite um número inteiro para que este represente a hora");
      gotH = scan.nextLine();
      try {
        h = Integer.parseInt(gotH);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (h >= 0 && h < 24)
          hValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!hValido);

    /* ------------------------ pegando o valor do minuto ----------------------- */
    do {
      System.out.println("Por favor digite um valor inteiro para que este seja o minuto");
      gotM = scan.nextLine();
      try {
        m = Integer.parseInt(gotM);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (m >= 0 && m < 60)
          mValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!mValido);

    /* ------------------------ pegando valor de segundo ------------------------ */
    do {
      System.out.println("Por favor digite um valor inteiro para que este seja os segundos");
      gotS = scan.nextLine();
      try {
        s = Integer.parseInt(gotS);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (s >= 0 && s < 60)
          sValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!sValido);

    scan.close();

    // atribuindo os valores recebidos às propriedades da classe
    hora = h;
    min = m;
    seg = s;
  }

  public Hora(int h, int m, int s) {
    hora = h;
    min = m;
    seg = s;
  }

  public void setHor(int h) {
    hora = h;
  }

  public void setMin(int m) {
    min = m;
  }

  public void setSeg(int s) {
    seg = s;
  }

  public void setHor() {
    Scanner scan = new Scanner(System.in);
    String gotH = "";
    int h = 0;
    boolean hValido = false;
    do {
      System.out.println("Por favor digite um número inteiro positivo e menor que 24 para que este represente a hora");
      gotH = scan.nextLine();
      try {
        h = Integer.parseInt(gotH);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (h >= 0 && h < 24)
          hValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!hValido);

    hora = h;
    scan.close();
  }

  public void setMin() {
    Scanner scan = new Scanner(System.in);
    String gotM;
    int m = 0;
    boolean mValido = false;

    do {
      System.out.println("Por favor digite um valor inteiro positivo e menor que 60 para que este seja o minuto");
      gotM = scan.nextLine();
      try {
        m = Integer.parseInt(gotM);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (m >= 0 && m < 60)
          mValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!mValido);

    min = m;
    scan.close();
  }

  public void setSeg() {
    Scanner scan = new Scanner(System.in);
    String gotS;
    int s = 0;
    boolean sValido = false;

    do {
      System.out.println("Por favor digite um valor inteiro positivo e menor que 60 para que este seja os segundos");
      gotS = scan.nextLine();
      try {
        s = Integer.parseInt(gotS);

        // Se o valor passado não puder ser convertido para inteiro ele não chega aqui e
        // vai para o catch
        if (s >= 0 && s < 60)
          sValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("O valor digitado é inválido, por favor tente novamente");
      }
    } while (!sValido);

    seg = s;
    scan.close();
  }

  public int getHor() {
    return hora;
  }

  public int getMin() {
    return min;
  }

  public int getSeg() {
    return seg;
  }

  public String getHora1() {
    String sHora = String.format("%02d", hora);
    String sMin = String.format("%02d", min);
    String sSeg = String.format("%02d", seg);

    return sHora + ":" + sMin + ":" + sSeg;
  }

  public String getHora2() {
    String AP = "AM";
    int hor = hora;
    if (hor >= 12) {
      hor -= 12;
      AP = "PM";
    } else if (hor == 0) {
      hor = 12;
    }

    String sHora = String.format("%02d", hor);
    String sMin = String.format("%02d", min);
    String sSeg = String.format("%02d", seg);

    return sHora + ":" + sMin + ":" + sSeg + " " + AP;
  }

  public int getSegundos() {
    int segundos = (hora * 3600) + (min * 60) + seg;
    return segundos;
  }
}
