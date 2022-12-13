package ejercicio_extra_02;

import ejercicio_extra_02.entidades.Edificio;
import ejercicio_extra_02.entidades.EdificioDeOficinas;
import ejercicio_extra_02.entidades.PoliDeportivo;
import java.util.ArrayList;

public class Ejercicio_extra_02 {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();

        EdificioDeOficinas ediOfi1 = new EdificioDeOficinas();
        Edificio ediOfi2 = new EdificioDeOficinas();

        Edificio poliDep1 = new PoliDeportivo();
        PoliDeportivo poliDep2 = new PoliDeportivo();

        edificios.add(ediOfi1);
        edificios.add(ediOfi2);

        edificios.add(poliDep1);
        edificios.add(poliDep2);
        
        int count = 0;
        
        for (Edificio aux : edificios) {
            
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("Los datos del edificio son -->");
                ((EdificioDeOficinas) aux).cantPersonas();
                
            }else if(aux instanceof PoliDeportivo){
                
                System.out.println("Los datos del polideportivo son -->");
                if (((PoliDeportivo) aux).isTechado()) {
                    count++;
                }
                
            }
            aux.calcularSuperficie();
            aux.calcularVolumen();
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        
        System.out.println("La cantidad de polideportivos techados es " + count);
        System.out.println("La cantidad de polideportivos no techados es " + (2 - count));
        
    }

}
