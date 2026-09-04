public class Main{
    public static void main(){
//        System.out.println(serieN0(5));
//        System.out.println(serie0N(5));
        int nElementoDeFib=5;
        System.out.println(serieDeFibonacci(nElementoDeFib, 0, 1, nElementoDeFib));
        int[] arreglo=new int[5];
        for(int i=0;i<arreglo.length;i++) arreglo[i]=i;
        int elemento=4;
        System.out.println(verificarElemEnArray(arreglo, elemento, 0));
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

    public static int verificarElemEnArray(int[] arreglo, int elemento, int indice){
        if(indice>=arreglo.length){
            return -1;
        }
        if(arreglo[indice]==elemento){
            return indice;
        }
        indice++;
        return verificarElemEnArray(arreglo, elemento, indice);
    }

//    public static boolean elementosSeguidos(String cadena){
//
//    }
}