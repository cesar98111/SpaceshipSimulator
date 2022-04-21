import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
    int salida=1;

    System.out.println("elige el tipo de nave espacial que quieres:");
    System.out.println("    1.- crear nave normal");
    System.out.println("    2.- crear nave cargo");
    int opcion=scan.nextInt();
    scan.nextLine();

    if(opcion==1){
        System.out.println("creando nave espacial");
        SpaceShip naveEspacial=new SpaceShip("Eclipse","4353S34243DF",5);
        while(salida==1){
            System.out.println("que quieres hacer con la nave ");
            System.out.println("    0.-acelerar");
            System.out.println("    1.-frenar");
            System.out.println("    2.-parada de emergencia");
            System.out.println("    3.-mostrar datos de la nave y estado");
            System.out.println("    presionar cualquier tecla para salir");
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
                case 3:
                    System.out.println(naveEspacial);
                    break;
                default:
                    salida=0;
            }
        }
    }
    if(opcion==2){
        Cargo cruceroImperial= new Cargo("corvus","323525DDD",8,20);

        while (salida==1){
            System.out.println("que quieres hacer con la nave ");
            System.out.println("    0.-acelerar");
            System.out.println("    1.-frenar");
            System.out.println("    2.-parada de emergencia");
            System.out.println("    3.-carga");
            System.out.println("    4.-descargar");
            System.out.println("    5.-mostrar datos de la nave ");
            System.out.println("    presionar cualquier tecla para salir");

            opcion =scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 0:
                    System.out.println("acelerando");
                    cruceroImperial.speedUP();
                    break;
                case 1:
                    System.out.println("frenando");
                    cruceroImperial.brake();
                    break;
                case 2:
                    System.out.println("parando");
                    cruceroImperial.emergencyStop();
                    break;
                case 3:
                    System.out.println("cargando");
                    cruceroImperial.load();
                    break;
                case 4:
                    System.out.println("descargando");
                    cruceroImperial.unload();
                    break;
                case 5:
                    System.out.println(cruceroImperial);
                    break;
                default:
                    System.out.println("saliendo");
                    salida=0;
            }
        }
    }
    }
}
