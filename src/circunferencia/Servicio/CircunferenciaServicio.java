
package circunferencia.Servicio;

import circunferencia.Entidad.CircunferenciaEntidad;
import java.util.Scanner;


public class CircunferenciaServicio {
    
        Scanner leer= new Scanner(System.in);
        public CircunferenciaEntidad crearCircunferencia(){
            
            System.out.println("ingresar el radio");
            Double radio=leer.nextDouble();
            CircunferenciaEntidad circu= new CircunferenciaEntidad(radio);
            return circu;
        }
        public void area(CircunferenciaEntidad circu){
                 //circu.setRadio(leer.nextDouble());
                 Double area=Math.PI*Math.pow(circu.getRadio(),2);
            System.out.println("El area de la circunferencia es "+ area);
            
        }
        public void perimetro(CircunferenciaEntidad circu){
            Double perimetro=2*Math.PI*circu.getRadio();
            System.out.println("El perimetro de la circunferencia es " + perimetro);
        }
    }

