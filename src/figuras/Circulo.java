package figuras;

/**
 *
 * @author marta.burgaleta
 */
public class Circulo {
    private int radio;
    
    /**
     * Constructor de la clase circulo
     * @param radio valor del radio
     */
    public Circulo(int radio){
        this.radio = radio;
    }
    /**
     * Obtiene el valor del radio del circulo
     * @param radio El valor del radio del circulo
     */
    public int getRadio() {
        return radio;
    }
    /**
     * Establece un valor para el radio del circulo
     * @return El valor del radic del circulo
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public double CalcularArea(){
        return pi*radio*radio;
    }

    public double calcularPerimetro(){
        return 2*pi*radio;
    }
}