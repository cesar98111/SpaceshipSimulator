public class Cargo extends SpaceShip{
    int capacidadDeCarga;
    int carga;
    public Cargo(String nombre,String matriculaGalactica,float aceleracion,int capacidadDeCarga)
    {
        super(nombre,matriculaGalactica,aceleracion);
        this.capacidadDeCarga=capacidadDeCarga;

    }
    public void load(){
        if (capacidadDeCarga<carga){
            carga++;
        }else{
            System.out.println("capacidad de transporte al tope");
        }

    }
    public void unload(){
        if(capacidadDeCarga>0) {
            carga--;
        }else{
            System.out.println("el almasenamiento ya esta vacio");
        }
    }

    @Override
    public String toString() {
        return "\n" +
                "                  __|__\n" +
                "                   _|_\n" +
                "                  / _ \\\n" +
                "               __/ (_) \\__\n" +
                "          ____/_ ======= _\\____\n" +
                " ________/ _ \\(_)_______(_)/ _ \\________\n" +
                "<___+____ (_) | /   _   \\ | (_) ____+___>\n" +
                "  O O O  \\___/ |   (_)   | \\___/  O O O\n" +
                "             \\__\\_______/__/ \n"+
                "velocidad actual de la nave:"+" "+ velocidadX+ "" + " "+ velocidadY+"\n"+
                "coordenadas actuales de la nave:"+" "+coordenadaX+" "+" "+coordenadaY;
    }
}
