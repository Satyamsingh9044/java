import java.util.Arrays;

public class stream{
    public static void main(String[] args){
        int arr[]={4,6,3,8,1,99,33,66};
        Arrays.stream(arr)
        // .sorted()
        .forEach(f->System.out.print(f+" "));
    }
}