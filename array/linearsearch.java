public class linearsearch {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr []={1,6,43,7,3,8,4,};
        int key =8;

        int index=linearsearch(arr,key);
        if(index== -1){
            System.out.println("key not found");

        }else{

            System.out.print("key is found at index "  + index);
        }

    }
}
