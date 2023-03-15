package ratonera;
/**
 * @author Ivan
 * @version v2.0
 */

public class Raton {
    /**
     * edad del ratón en dias
     * @since v1.0
     */
    private int edad;

    /**
     * peso del ratón en gramos
     * @since v1.0
     */
    private double peso;

    /**
     * tasaCrecimiento Incrementa el peso por dia en tanto por ciento
     * @since v1.0
     */
    private double tasaCrecimiento;

    /**
     * crecida operacion que hace lo siguiente: Peso * crecimiento / 100.0
     * @since v2.0
     */
    private double crecida;

    /**
     * Constructor vacio
     * @since v1.0
     */
    public Raton(){
        this(0,0.0);
    }

    /**
     * Contructor con edad y peso
     * @since v2.0
     * @param edad del raton
     * @param peso del raton
     */
    public Raton(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Este método simula un dia de crecimiento para un ratón
     * @since v1.0
     */


    public void desarrollar() {
        crecida = this.getPeso() * this.getTasaCrecimiento() / 100.0;
        this.setPeso(this.getPeso() + crecida);
        this.setEdad(this.getEdad() + 1);
    }
    /**
     * @return Este método devuelve formateada la edad y peso del ratón
     * @since v1.0
     */

    public String datos() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

    /**
     * @since v2.0
     * @return Devuelve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set creado
     * @since v2.0
     * @param edad Edad del raton
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @since v2.0
     * @return Devuelve el peso
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Método set creado
     * @since v2.0
     * @param peso Peso del raton
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @since v2.0
     * @return Devuelve la tasa de crecimiento
     * Enlace {@link <a href="https://es.wikipedia.org/wiki/Rat%C3%B3n_de_labotario">Pincha aqui</a>}
     */
    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    /**
     * Método set creado
     * @since v2.0
     * Enlace {@link <a href="https://es.wikipedia.org/wiki/Rat%C3%B3n_de_labotario">Pincha aqui</a>}
     * @param tasaCrecimiento Tasa de crecimiento del raton
     */
    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }
}
