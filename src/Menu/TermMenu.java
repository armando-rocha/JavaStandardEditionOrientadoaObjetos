package src.Menu;

import java.util.Scanner;

public class TermMenu {
    public static void showMenu(){
        System.out.println("Elige la opcion si eres un usuario doctor o paciente");
        int valueChoosed=0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            Scanner scanner = new Scanner(System.in);
             valueChoosed=scanner.nextInt();
            switch (valueChoosed) {
                case 1:
                    System.out.println("Elegiste doc");
                    break;
                case 2:
                    pacienteMenu();
                    valueChoosed=0;
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                System.out.println("Elige la opción correcta");    
                valueChoosed=0;
                break;
            }
        }while(valueChoosed != 3);
    }

    private static void pacienteMenu() {
        System.out.println("Elige la opción para paciente");
        int valueChoosed2 =0;
        
        
        do{
            System.out.println("Elige la opción para paciente");
            System.out.println("1. Regresar al menu anterior");
            System.out.println("2. Salir");
            Scanner scannerPaciente = new Scanner(System.in);
              valueChoosed2=scannerPaciente.nextInt();
           
            switch (valueChoosed2) {
                case 1:
                    valueChoosed2=0;
                    showMenu();
                    scannerPaciente.close();
                    break;
                
                case 2:
                    System.out.println("Gracias por su visita");
                    scannerPaciente.close();
                    break;
                default:
                    valueChoosed2=0;   
                    System.out.println("Elige la opción correcta");
                    break;
            }
        }while(valueChoosed2 != 2);
    }
}
