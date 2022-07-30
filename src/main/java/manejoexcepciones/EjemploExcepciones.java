package manejoexcepciones;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {


        String valor = JOptionPane.showInputDialog("Ingrese un valor");

        
       try{

           int divisor = Integer.parseInt(valor);

           int div = 10/divisor;

           System.out.println("div = " + div);

       }catch (NumberFormatException nfe){

           System.out.println("Se detecto una excepcion:  por favor ingrese un valor numerico " + nfe.getMessage());
           main(args);

        } catch(ArithmeticException ae){

           System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
           main(args);
           
        }finally {

           System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción");
       }

        System.out.println("Continuamos con el flujo de aplicación");
    }
}
