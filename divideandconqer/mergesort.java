public class mergesort{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si;//iidx for first sorted array
        int j=mid+1;//idx for second sorted array
        int k=0;//idx for temp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            } else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover element of first part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover element of seecond part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for( k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,4,6,9,8};
        mergesort(arr,0,6);
        print(arr);
    }
}