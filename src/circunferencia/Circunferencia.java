
package circunferencia;

import circunferencia.Entidad.CircunferenciaEntidad;
import circunferencia.Servicio.CircunferenciaServicio;


public class Circunferencia {

    
    public static void main(String[] args) {
        CircunferenciaServicio sv= new CircunferenciaServicio();
        CircunferenciaEntidad primerCalculo=sv.crearCircunferencia();
        sv.area(primerCalculo);
        sv.perimetro(primerCalculo);
        
    }
    
}