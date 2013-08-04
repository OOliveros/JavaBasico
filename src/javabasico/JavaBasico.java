/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author PFR
 */
public class JavaBasico {

    public static void main(String[] args) {
        JavaBasico.ejercicio1();
        JavaBasico.ejercicio2();
        JavaBasico.ejercicio7(79);


    }

    public static void ejercicio1() {
        Double resultado = 7d * (15d + 1d) * 2d % 2d;
        System.out.println(resultado);
    }

    public static void ejercicio2() {
        Double op1 = 0.0 / 0.0;
        Double op2 = 0.0 / 0.0;
        String rpt ="";
        if(op1==op2)
            rpt = "Verdadero";
                else
            rpt = "False";
        System.out.println(rpt);
                
    }
    public static void ejercicioswitch() {
        int diaSemana = 6; 
        String textoSemana= "";
        
        switch(diaSemana){
            case 1: 
                textoSemana="Domingo"; 
                break; 
            case 6:
                textoSemana="Viernes"; 
                break; 
            default: 
                textoSemana="Martes"; 
                break;
        }
    }
    public static void ejercicio7(int edad) {
        
        double desc = 0;
        if (edad <=18)
            desc=0.15; 
        if (edad >60)
            desc=0.3;
        System.out.println(desc);
    }

    public static void ejercicio0() {
        System.out.println("Hola Mundo");
        byte altura = 3;

        int numeroX = 10;
        int numeroY = 20;
        int numeroTemporal = numeroX;
        numeroY = numeroTemporal;
        System.out.println("X" + numeroX);
        System.out.println("Y" + numeroY);

        int x = 5;
        int y = 8;
        int z = 6;
        int solucion;
        solucion = x + y - 3 * z;
        System.out.println("La solucion es: " + solucion);
    }
    public static void ejercicioMatriz() {
       
        int[] matrizNumeros = new int[5];
        matrizNumeros[0]=648; 
        matrizNumeros[1]=342;
        matrizNumeros[2]=3424;
        matrizNumeros[3]=432;
        for (int i = 0; i < matrizNumeros.length ; i++){
            System.out.println(matrizNumeros[i]);
    }
        
    public static void ejercicio8(int mes) {
        int[] meses = {30,28,31,30,31,30,31,
    
    }
}
