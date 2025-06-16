public class subset {
    public static void findSubsets(String str,String ans,int i){
//BASE CASE
if(i==str.length()){
    System.out.println(ans);
    return;
}
    //RECURSION
    //YES CHOICE
    findSubsets(str,ans+str.charAt(i),i+1);
    //NO CHOICE
    findSubsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }
}