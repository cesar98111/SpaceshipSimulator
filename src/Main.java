import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
    int salida=1;
    int opcion=scan.nextInt();
    scan.nextLine();
    if(opcion==1){
        System.out.println("creando nave espacial");
        SpaceShip naveEspacial=new SpaceShip("Eclipse","4353S34243DF",5);
        while(salida==1){
            opcion=scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 0:
                    System.out.println("acelerando");
                    naveEspacial.speedUP();
                    break;
                case 1:
                    System.out.println("frenando");
                    naveEspacial.brake();
                    break;
                case 2:
                    System.out.println("parando");
                    naveEspacial.emergencyStop();
                    break;
                default:
                    salida=0;
            }
        }
    }
    if(opcion==2){

    }
    }
}
