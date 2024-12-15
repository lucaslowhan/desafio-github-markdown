import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numeroFinal = sc.nextInt();
        Contador contador = new Contador(numeroFinal);
        contador.contar();
    }
}
    class Contador{
       int numeroFinal;

        public Contador(int numeroFinal){
            this.numeroFinal = numeroFinal;
        }
        public int contar (){
            for(int i=0 ; i<=numeroFinal ; i++){
                System.out.println(i);
            }
            return numeroFinal;
        }
    }
