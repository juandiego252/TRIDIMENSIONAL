public class Figuras {
    /* Figuras tridimensionales
    * 1. Cono
    * 2. Cilindro
    * 3. Tetraedro
    * 4. Piramide
    * */

    private float altura;
    private float radio;
    private float arista;
    private float base;
    private float area_base;
    private float perimetro_base;
    private float apotema;

    // Constructor
    public Figuras(float altura, float radio, float arista, float base, float area_base, float perimetro_base, float apotema) {
        this.altura = altura;
        this.radio = radio;
        this.arista = arista;
        this.base = base;
        this.area_base = area_base;
        this.perimetro_base = perimetro_base;
        this.apotema = apotema;
    }

    // Getters y setters


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArista() {
        return arista;
    }

    public void setArista(float arista) {
        this.arista = arista;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getArea_base() {
        return area_base;
    }

    public void setArea_base(float area_base) {
        this.area_base = area_base;
    }

    public float getPerimetro_base() {
        return perimetro_base;
    }

    public void setPerimetro_base(float perimetro_base) {
        this.perimetro_base = perimetro_base;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public void volumen_cono_(){
        double volumen_Cono = (1/3)*Math.PI*getRadio()*getRadio()*getAltura();
        System.out.println(volumen_Cono);
    }

    private void area_cono(){
        double area_cono = Math.PI*getRadio()*(getRadio()+Math.sqrt(getRadio()*getRadio()+getAltura()*getAltura()));
    }
    public void imprimir_datos_cono(){
        System.out.println("El volumen del cono es de:");
        volumen_cono_();
        System.out.println("El area del cono es de:");
        area_cono();
    }
}
