// As we know doing n & n-1 remove the last set bit
// We can do this until we get 0 as n

public class No_Set_Bits {
    static void main() {
        int n = 28;
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
