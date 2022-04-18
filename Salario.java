import java.util.Scanner;

public class Salario {
    //Declaracion de Vars
    private double ssocial;
    private double sbruto;
    private double seducativo;
    private double sneto;

    public void FijarValor(double qssocial, double qsbruto, double qseducativo, double qsneto)
    {    ssocial =qssocial;
         sbruto = qsbruto;
         seducativo = qseducativo;
         sneto = qsneto;
    }
    public double CalcularSocial()
    { ssocial = sbruto * 0.09;
      return ssocial;
    }
    public double CalcularSeducativo()
    { seducativo = sbruto * 0.0175;
      return seducativo;
    }
    public double CalcularNeto()
    { sneto = sbruto - (ssocial + seducativo);
      return sneto;
    }
    public static void main(String[] args) 
    { double qsbruto=0, qseducativo=0, qsneto=0,qssocial=0;
      String nombre=" ";
      Scanner sc = new Scanner(System.in);
      Salario ar = new Salario();
      
      System.out.println("Deme el salario bruto del empleado:");
      qsbruto = sc.nextDouble();
      System.out.printf("Ingrese el nombre del empleado: ");
      nombre = sc.nextLine();

      ar.FijarValor(qssocial, qsbruto, qseducativo, qsneto);
      
      sc.close();
      System.out.println("El nombre del empleado es:"+ nombre);

    }
}
