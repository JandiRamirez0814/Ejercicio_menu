import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombreUser= "Heli Abel";
        String tipoCuenta= "Corriente";
        double saldoCuenta= 1599.99;
        int opcion=0;
        DecimalFormat df =new DecimalFormat("#.00");

        System.out.println(String.format("""
                ***********************************
                \nNombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: $ %s\n
                ***********************************""",
                nombreUser,tipoCuenta,df.format(saldoCuenta)));
        String menu= """
                \n*** Escriba el numero de opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir\n""";
        Scanner teclado= new Scanner(System.in);
        while (opcion!=9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es de: $"+df.format(saldoCuenta));
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorRetirar= teclado.nextDouble();
                    if(valorRetirar>saldoCuenta){
                        System.out.println("Saldo insuficiente...");
                    }else{
                        saldoCuenta= saldoCuenta-valorRetirar;
                        System.out.println("Saldo actual: $"+df.format(saldoCuenta));
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorDepositar= teclado.nextDouble();
                    saldoCuenta+=valorDepositar;
                    System.out.println("Saldo actual: $"+df.format(saldoCuenta));
                    break;
                case 9:
                    System.out.println("Saliendo del programa... Gracias por utilizar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        };
    }
}
