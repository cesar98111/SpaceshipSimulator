public class SpaceShip {
    private String nombre;
    private String matrículaGalactica;
    private float aceleracion;
    private float VelocidadX;
    private float VelocidadY;
    private float CoordenadaX;
    private float CoordenadaY;
    private float DirecciónX;
    private float DirecciónY;

    public SpaceShip(String nombre, String matrículaGalactica, float aceleracion) {
        this.nombre = nombre;
        this.matrículaGalactica = matrículaGalactica;
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatrículaGalactica() {
        return matrículaGalactica;
    }

    public void setMatrículaGalactica(String matrículaGalactica) {
        this.matrículaGalactica = matrículaGalactica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return VelocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        VelocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return VelocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        VelocidadY = velocidadY;
    }

    public float getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(float coordenadaY) {
        CoordenadaY = coordenadaY;
    }

    public float getDirecciónX() {
        return DirecciónX;
    }

    public void setDirecciónX(float direcciónX) {
        DirecciónX = direcciónX;
    }

    public float getDirecciónY() {
        return DirecciónY;
    }

    public void setDirecciónY(float direcciónY) {
        DirecciónY = direcciónY;
    }
}
