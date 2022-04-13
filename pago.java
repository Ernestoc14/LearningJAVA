import java.util.Scanner;

public class pago {
    //Declaracion de Vars
    private double horastrab;
    private double tarxhora;
   // private double descuento;

    public void FijarValor(double vhorastrab, double vtarxhora)
    { horastrab = vhorastrab;
      tarxhora = vtarxhora;
     // descuento = vdescuento;
    }
    public double CalularPago()
    {    double pago = 0;
        if(horastrab > 40)
        { pago = (horastrab*tarxhora)*1.5;
        }
        else
        { pago = (horastrab*tarxhora);
        }
        return pago;
    }
    public static void main(String[] args)
    { double vhorastrab = 0, vtarxhora = 0, pago = 0;
      Scanner sc = new Scanner(System.in );
      pago ar = new pago();
      
      System.out.println("Ingrese las horas trabajadas: ");
      vhorastrab = sc.nextDouble();
      System.out.println("Ingrese el tarifa por hora: ");
      vtarxhora = sc.nextDouble();
      sc.close();

      ar.FijarValor(vhorastrab, vtarxhora);
      pago = ar.CalularPago();

      System.out.printf("El pago por %.2f horas trabajadas es de: %.2f", vhorastrab,pago);
//Add 2 probs
    }
}
