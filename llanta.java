
import java.util.Scanner;

public class llanta{
    //Declaracion de Vars
    private double precioUni;
    private int cantidad;

    public void FijarValor(double vprecioUni, int vcantidad)
    { precioUni = vprecioUni;
      cantidad = vcantidad;
    }
    public double CalcularDesc()
    { //double preciototal = 0.0;
      if(cantidad > 4 )  
      { precioUni = precioUni - (precioUni*0.10);
      }
      return precioUni * cantidad;
    }
    public static void main(String[] args)
    { double vprecioUni = 0, precioFinal = 0;
      int vcantidad = 0;
      Scanner sc = new Scanner(System.in);
      llanta ar = new llanta();

      System.out.println("Ingrese la cantidad de llantas: ");
      vcantidad = sc.nextInt();
      System.out.println("Ingrese el precio unitario por llanta: ");
      vprecioUni = sc.nextInt();

      ar.FijarValor(vprecioUni, vcantidad);
      precioFinal = ar.CalcularDesc();

      sc.close();
      System.out.printf("Por la compra de %d llantas, se debe pagar: %.2f", vcantidad, precioFinal);
    }
}