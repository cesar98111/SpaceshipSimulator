public class SpaceShip {
    private String nombre;
    private String matrículaGalactica;
    private float aceleracion;
    protected float velocidadX;
    protected float velocidadY;
    protected float coordenadaX;
    protected float coordenadaY;
    private float direcciónX;
    private float direcciónY;

    public SpaceShip(String nombre, String matrículaGalactica, float aceleracion) {
        this.nombre = nombre;
        this.matrículaGalactica = matrículaGalactica;
        this.aceleracion = aceleracion;
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.direcciónX = 1;
        this.direcciónY = 1;
    }

    public void speedUP(){
        velocidadX += aceleracion;
        velocidadY += aceleracion;

        coordenadaX += velocidadX;
        coordenadaY += velocidadY;

        //aumentar velocidad
    }

    public void brake(){
        velocidadX -= aceleracion;
        velocidadY -= aceleracion;

        coordenadaX += velocidadX;
        coordenadaY += velocidadY;
    }
    public void emergencyStop(){
        velocidadY = 0;
        velocidadX = 0;
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
        return velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public float getDirecciónX() {
        return direcciónX;
    }

    public void setDirecciónX(float direcciónX) {
        this.direcciónX = direcciónX;
    }

    public float getDirecciónY() {
        return direcciónY;
    }

    public void setDirecciónY(float direcciónY) {
        this.direcciónY = direcciónY;
    }

    @Override
    public String toString() {
        String nave=    "       A   A   A\n"+
            "      | | | | | |\n"+
        "    __| |_| |_| |___nnnnnn_____----____-===----- \n"+
      "___/--| |-| |-|_|---~~~-------~~~---\\==/~~\\.\n"+
   "O=|-|OOOOO--<=X===X===X=>-| | |-----| | |>  HHK   | \n"+
      "---\\--| |-| |-|~|---___-------___---/==\\__/' \n"+
               "      | | | | | |\n"+
                "      | | | | | |\n"+
                "       V   V   V  \n"+
                "velocidad actual de la nave:"+" "+ velocidadX+ "" + " "+ velocidadY+"\n"+
                "coordenadas actuales de la nave:"+" "+coordenadaX+" "+" "+coordenadaY;
        return nave;

    }
}
