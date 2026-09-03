public class Main{
    public static void main(){
//        System.out.println(serieN0(5));
//        System.out.println(serie0N(5));
        System.out.println(serieDeFibonacci(8, 0, 1));
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

    public static String serieDeFibonacci(int n, int fn2, int fn1){
        n--;
        if(n==0){
            return "0 1";
        }
        int fn=fn1+fn2;
        fn2=fn1;
        fn1=fn;
        return fn+" "+serieDeFibonacci(n, fn2, fn1);

    }
}