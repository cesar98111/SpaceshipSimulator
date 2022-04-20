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

}
