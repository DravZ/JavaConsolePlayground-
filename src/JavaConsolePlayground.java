import java.time.LocalDate;
import java.util.Scanner;

public class JavaConsolePlayground {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        int option = 0;
        while (running){
            System.out.println("""
                    ======================
                    JAVA PLAYGROUND
                    ======================
                    
                    1. Saludar
                    2. Mostrar fecha actual
                    3. Calcular edad
                    4. Convertir Celsius a Fahrenheit
                    5. Salir
                    """);
            System.out.print("Seleccione una opcion  del menu:");
            try{
                option = sc.nextInt();
                switch (option){
                    case 1:
                        saludar();
                        break;
                    case 2:
                        mostrarFecha();
                        break;
                    case 3:
                        calcularEdad();
                        break;
                    case 4:
                        convertirTemperatura();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        break;
                }
            }catch (Exception e){
                System.out.println("Error al ingresar datos.");
                sc.nextLine();
            }
        }
    }

    static void saludar(){
        System.out.println("Hola mucho gusto, bienvenido.");
        espera();
    }
    static void mostrarFecha(){
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Fecha actual: " + fechaHoy);
        espera();
    }
    static void calcularEdad(){
        System.out.print("Ingrese su año de nacimiento:");
        int anoNacimiento = sc.nextInt();
        System.out.println("Edad: " + (LocalDate.now().getYear() - anoNacimiento));
        espera();
    }

    static void convertirTemperatura(){
        System.out.print("Ingrese la temperatura en celcius:");
        float tempCelcius = sc.nextFloat();
        System.out.println("Temperatura en Fahrenheit: " + ((tempCelcius * 9 / 5) + 32));
        espera();
    }

    static void espera(){
        System.out.println("Presione una tecla para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
}
