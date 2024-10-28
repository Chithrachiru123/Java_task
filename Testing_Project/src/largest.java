import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int num:arr){
        if(num > max){
            secondMax = max;
            max = num;

        }
        else if(num >secondMax&&num!= max){
            secondMax=num;
        }

        }
        System.out.println("second largest element:" +secondMax);
    }
}
