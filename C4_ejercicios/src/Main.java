import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una estacion");

        var estacion = scanner.nextLine().toUpperCase();


        switch(estacion){
            case "VERANO":
                System.out.println("La estacion es VERANO");
                break;
            case "INVIERNO":
                System.out.println("La estacion es INVIERNO");
                break;

            case  "OTOÑO":
                System.out.println("La estacion es OTOÑO");
                break;
            case "PRIMAVERA":
                System.out.println("La estacion es PRIMAVERA");
                break;
            default:
                System.out.println("No es ninguna estacion");
                break;
        }



        System.out.println("**************************************************");

        System.out.println("proporciona numeros positivos,negativos u 0");
        int numero = scanner.nextInt();

        if(numero <0){
            System.out.println("El numero ingresado es negativo");
        }else if(numero ==0){
            System.out.println("El numero ingresado es 0");

        }else{
            System.out.println("El numero ingresado es positivo");
        }

        System.out.println("*********************************************************************");


    int numeroWhile = 0;
            while(numeroWhile<3){
                System.out.println(numeroWhile);
                numeroWhile++;
            }
        System.out.println("*********************************************************************");




        int contador = 0;

        do{
            System.out.println(contador);
            contador = contador +1;
        }while(contador >3);


        System.out.println("*********************************************************************");

        int i;

        for(i =0; i<=3; i++){
            System.out.println(i);
        }

        System.out.println("*********************************************************************");






    }
}
