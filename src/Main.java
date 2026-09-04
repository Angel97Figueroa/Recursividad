import java.math.*;

import static java.lang.Math.sqrt;

public class Main{
    public static void main(){
        System.out.println(serieN0(5));
        System.out.println(serie0N(5));
        int nElementoDeFib=5;
        System.out.println(serieDeFibonacci(nElementoDeFib, 0, 1, nElementoDeFib));
        int orejitasDeConejo= orejasDeConejo(17);
        System.out.println(orejitasDeConejo);
        System.out.println(multiplicar(5,10));
        System.out.println(esPrimo(2));
    }

    public static String serieN0(int n){
        String serieNums=n+" ";
        if(n>0) serieNums+=serieN0(n-1);
        return serieNums;
    }

    public static String serie0N(int n){
        if(n==0){
            return "0";
        }else{
            return serie0N(n-1)+" "+n;
        }
    }

    public static String serieDeFibonacci(int n, int fn2, int fn1, int nInicial){
        if(nInicial==2){
            return "0 1";
        }else if(nInicial==1){
            return "0";
        }else if(nInicial<=0){
            return "";
        }
        if(n==nInicial){
            n-=2;
        }
        if(n==0){
            return "";
        }
        int fn=fn1+fn2;
        fn2=fn1;
        fn1=fn;
        if(n==nInicial-2){
            return "0 1 "+fn+" "+serieDeFibonacci(n-1, fn2, fn1, nInicial);
        }
        return fn+" "+serieDeFibonacci(n-1, fn2, fn1, nInicial);
    }

    public static int orejasDeConejo(int n){
        if(n==0){
            return n;
        }
        else{
            return orejasDeConejo(n-1)+ 2;
        }
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplicar(a, b - 1);
        } else {
            return -a + multiplicar(a, b + 1);
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        return esPrimo(num, 2);
    }
    private static boolean esPrimo(int num, int divisor) {
        if (divisor > sqrt(num)) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return esPrimo(num, divisor + 1);
    }

    public static int valorMaximo(int[] arreglo, int indice) {
        if (indice == arreglo.length - 1) {
            return arreglo[indice];
        }
        int maxDelResto = valorMaximo(arreglo, indice + 1);
        if (arreglo[indice] > maxDelResto) {
            return arreglo[indice];
        } else {
            return maxDelResto;
        }
    }
    public static int sumarDigitos(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }
        char primerCaracter = cadena.charAt(0);
        int valorActual = 0;
        if (Character.isDigit(primerCaracter)) {
            valorActual = Character.getNumericValue(primerCaracter);
        }
        return valorActual + sumarDigitos(cadena.substring(1));
    }
}