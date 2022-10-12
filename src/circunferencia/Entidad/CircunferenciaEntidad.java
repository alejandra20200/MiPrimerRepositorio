
package circunferencia.Entidad;



public class CircunferenciaEntidad {
    private Double radio;
public CircunferenciaEntidad(Double radio){
    this.radio=radio;
    
}  

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "CircunferenciaEntidad{" + "radio=" + radio + '}';
    }

    

}

