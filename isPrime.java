import java.util.*;
public class  IsPrime {

    static boolean isPrime(long n){
        if(n<2)
        return false;
        if(n>=4 &&(n%2==0||n%3==0))
        return false;
        long a = 5,b = 7;
        while(a*a<n){
            if(n%a==0 || n%b==0)
            return false;
            a+=6;
            b+=6;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(isPrime(n)?"Yes":"No");
    }
}

