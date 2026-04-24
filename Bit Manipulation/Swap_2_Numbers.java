
public class Swap_2_Numbers {
    static void main(){
        int a = 4;
        int b = 5;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
