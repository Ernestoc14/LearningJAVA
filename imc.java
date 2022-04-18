import java.util.Scanner;

public class imc {
    //Declaracion de Vars
    private double imc;
    private double peso;
    private double altura;
    
    public void FijarValor(double qimc, double qpeso, double qaltura)
    { imc = qimc;
      peso = qpeso;
      altura = qaltura;
    }
    public double CalcIMC()
    { imc = peso/(altura*altura);
      return imc;
    }
    public static void main(String[] args) {
        double qimc=0, qpeso=0, qaltura=0;
        Scanner sc = new Scanner(System.in);
        imc ar = new imc();

        System.out.println("Deme su peso en Kg: ");
        qpeso = sc.nextDouble();
        System.out.println("Deme su altura en Mts:");
        qaltura = sc.nextDouble();

        ar.FijarValor(qimc, qpeso, qaltura);
        qimc = ar.CalcIMC();

        sc.close();
        System.out.printf("Su IMC es de: %.2f ", qimc);
    }
}
