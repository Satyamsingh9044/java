public class StringReverse{
    public static void main(String[] args){
        String str="ab cd ef";
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(char ch:arr){
            System.out.print(ch);
        }
    }
}