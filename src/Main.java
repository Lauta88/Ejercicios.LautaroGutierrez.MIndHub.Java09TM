import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        ejercicio11();


    }
    //1. Crear las variables correspondientes para leer tu nombre, apellido y edad e imprimirlos por consola en una oración.
    public void ejercicio1(){
        String nombre = "Lautaro";
        String apellido = "Gutierrez";
        int edad = 34;

        System.out.println("Ejercicio 1");
        System.out.println("Mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años"  );

    }

    //2. Realizar un pequeño programa que permita ingresar 3 números e imprimir por consola cuál es el mayor.
    public void ejercicio2(){

        System.out.println("Ingrese el primer numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = leer.nextInt();
        System.out.println("Ingrese el tercer  numero");
        int numero3 = leer.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El numero mayor es " + numero3);
        }
    }


    //3. Realizar un pequeño programa que permita el ingreso de un número e imprimir por consola su paridad.
    public void ejercicio3(){
        System.out.println("Ingrese un numero para saber si es par o impar");
        int num = leer.nextInt();

        if (num % 2 == 0){
            System.out.println("El numero " + num + " es par" );
        }else {
            System.out.println("El numero " + num + " es impar" );
        }
    }

    //4. Crear el código correspondiente que permita ingresar 2 cadenas de caracteres e imprima por consola si son iguales o no.
    public void ejercicio4(){

        System.out.println("Ingrese una cadena de texto");
        leer.nextLine();
        String cadena1 = leer.nextLine();
        System.out.println("Ingrese otra cadena de texto para saber si son iguales");
        String cadena2 = leer.nextLine();

        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas no son iguales");
        }
    }

    //5. Realizar un pequeño programa que permita el ingreso de números, almacenarlos en una colección hasta ingresar un 0.
    public void ejercicio5(){

        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        do {
            System.out.println("Ingrese un numero, 0 para salir");
            numero = leer.nextInt();
            numeros.add(numero);
        }while(numero != 0);

        System.out.println("Numero ingresados");
        for (int n: numeros) {
            System.out.println(n);
        }
    }

    //6. Crear una función que imprima un mensaje de bienvenida en la consola.
    public static void ejercicio6(){
        System.out.println("Bienvenido a Java");
    }

    //7. Crear una función que reciba un número entero y devuelva si es par o impar en forma de texto.
    public static  void ejercicio7(int numero){
        if(numero % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero no es par");
        }
    }
    //8. Crear una función que reciba un número y devuelva si el mismo es primo o no.
    public static boolean ejercicio8(int numero){


        if (numero <= 1){
            return false;
        }else if (numero == 2){
            return true;
        }else {
            for (int i = 2; i < numero; i++) {
                if(numero % i == 0){
                   return false;
                }
            }
            return true;
        }

    }

    //9. Crear una función que reciba una colección de números y devuelva la suma de los números impares.

    public static int ejercicio9(ArrayList<Integer> lista){
        int suma = 0;

        for (int numero : lista) {
            if (numero % 2 != 0){
                suma = suma + numero;
            }
        }
        return suma;
    }

    //10. Crear una función que reciba una colección de números e imprima los números pares y la suma de los números primos

    public static void ejercicio10(ArrayList<Integer> lista){
        int suma = 0;
        for (int numero : lista) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            if (ejercicio8(numero)){
                suma += numero;
            }
        }
        System.out.println(suma);
    }

    //11. Crear una función que imprima por consola un pequeño menú con las opciones básicas de una calculadora agregando la opción 0 para salir del mismo.

    public static void ejercicio11(){

        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Dividir dos numeros");
            System.out.println("0. Salir");
            opcion = leer.nextInt();
            ejercicio12(opcion);
        } while (opcion != 0);
    }

    public static void ejercicio12(int opcion){

        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        switch (opcion){
            case 1:
                System.out.println("Ingrese el primer numero");
                num1 = leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = leer.nextInt();
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                num1 = leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = leer.nextInt();
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                num1 = leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = leer.nextInt();
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println("Ingrese el primer numero");
                num1 = leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = leer.nextInt();
                if (num2 > 0){
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("El numero no puede ser dividdo por 0");
                }
                break;

            case 0:
                break;
        }
    }
    /*
    Crear el algoritmo necesario para poder gestionar el ingreso
    a un boliche. El mismo deberá contar con un pequeño menú con
    las siguientes opciones:
    ● Ingreso de datos.
    ● Capacidad disponible.
    ● Dinero recaudado.
    ● Salir del sistema.
    Crear las variables correspondientes para controlar la capacidad
    y el dinero recaudado. Siendo la capacidad máxima de 500
    personas y la entrada costar 1500 por persona y 2000 la
    entrada vip. La primera opción del menú deberá tomar los datos
    personales del ingresante (nombre, edad, DNI y pase). El
    algoritmo deberá detectar si la persona está apta para el
    ingreso, ya que solo se dejará pasar a los mayores de 21 años.
    Verificar antes de cobrar la entrada si posee pase vip con el cual
    ingresará gratis o si posee pase con descuento el cual le
    permitirá solo abonar la mitad del valor de la entrada. Al
    momento de hacer el cobro se deberá preguntar si quiere
    comprar la entrada normal o vip y finalmente darle la bienvenida
    en caso de que todo haya salido bien, volviendo al menú
    principal. Las variables correspondientes tendrán que reflejar el
    ingreso tanto de personas como de dinero.
    */

    public static void ejercicio13(){

        Scanner leer = new Scanner(System.in);

        ArrayList<String> personasNormal = new ArrayList<>();
        ArrayList<String> personasVip = new ArrayList<>();


        int opcion;
        do {
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("0. Salir del sistema");

            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese la edad");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese el dni");
                    String dni = leer.nextLine();
                    System.out.println("Ingrese que tipo de pase");
                    String pase = leer.nextLine();

                    if(edad > 21){

                        if (pase.equalsIgnoreCase("vip")){
                            personasNormal.add(nombre);
                        } else {
                            personasVip.add(nombre);
                        }
                    }else{
                        System.out.println("No tiene edad suficiente para entrar");
                    }
                    break;
                case 2:
                    System.out.println(500 - (personasNormal.size() + personasVip.size()));
                    break;
                case 3:
                    System.out.println((personasNormal.size() * 1500) + (personasVip.size() * 2000) );
                    break;
                case 0:
                    break;
            }


        } while(opcion != 0);

    }



}