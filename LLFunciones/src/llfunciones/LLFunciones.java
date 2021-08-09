/* 
* Clase para las funciones lógicas de una lavadora
*/

package llfunciones;

/**
 * 
 * 
 * @author demian
 */

public class LLFunciones {

    private int kilos = 0, LlenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    
    
    public LLFunciones(int Kilos, int TipoDeRopa){
        this.kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
                 
    }
    
    private void LLenado(){
        if(kilos <= 12){
            LlenadoCompleto = 1;
            System.out.println("LLenando...");
            System.out.println("LLenado completo");
            
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");    
        }
    }
    
    private void Lavado(){
        LLenado();
        if(LlenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else if (TipoDeRopa == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");               
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                LavadoCompleto = 1;
            
            }
        }
    }
    
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("Tu ropa está lista!.");
        }
    }
}
