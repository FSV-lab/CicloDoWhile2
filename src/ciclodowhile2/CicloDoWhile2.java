//Realizar un programa que imprima en pantalla la siguiente serie numerica:
//1000,800,600,400,200,0 Empezara por mil y tendra un decremento de 200

package ciclodowhile2;


public class CicloDoWhile2 {


    public static void main(String[] args) {
       int i=1000; //la variable i iniciara en 1000 
        do {            
            System.out.println(i+"");
            i-=200; //se descontara la variable de 200 en 200 y luego lo imprimira con el metodo
                    //i hasta que no sea menor o igual a 200 no dejara de imprimir hasta que cumpla condición
        } while (i>=0);//la variable i terminara la condición mayor o igual a cero.
    }
    
}
