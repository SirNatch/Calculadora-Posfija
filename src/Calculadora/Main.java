package Calculadora;

/**
 *
 * @author Francisco Ignacio Núñez Valdivieso
 */
public class Main {
    public static void main(String [ ] args){
    Posfijo ecuacion = new Posfijo();
    Calcular resultado = new Calcular();
    
    String cadena ="(12+5)/3-(4*3)";
    
    cadena = ecuacion.conv_posfija(cadena);
    resultado.calcular(cadena);
    }
}
