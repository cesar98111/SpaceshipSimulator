public class Cargo extends SpaceShip{
    int capacidadDeCarga;
    public Cargo(String nombre,String matriculaGalactica,float aceleracion,int capacidadDeCarga)
    {
        super(nombre,matriculaGalactica,aceleracion);
        this.capacidadDeCarga=capacidadDeCarga;

    }

}
