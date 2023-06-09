import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Figuras cono = new Figuras(0,0,0,0,0,0,0);
        float radio_cono;
        float altura_cono;
        int opcion = 0;
        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Calcular Volumen y area del Cono");
            System.out.println("2. Calular volumen y area de la figura 2");
            System.out.println("3. Calcular volumen y area de la figura 3");
            System.out.println("4. Calcular volumen y area de la figura 4");
            System.out.println("5. Salir");
            System.out.println("Opcion >:");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese radio:");
                    radio_cono = input.nextFloat();
                    cono.setRadio(radio_cono);
                    System.out.println("Ingrese la altura:");
                    altura_cono = input.nextFloat();
                    cono.setAltura(altura_cono);
                    cono.volumen_cono_();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion ingresada de manera incorrecta !");
                    break;
            }
        }while(opcion !=5);
    }
}
