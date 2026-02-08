public class ComapreVersion {
    public static int compare(String version1,String version2){
        String []v1=version1.split("\\.");
        String []v2=version2.split("\\.");
        int len=Math.max(v1.length,v2.length);
        for(int i=0;i<len;i++){
            int num1=i<v1.length?Integer.parseInt(v1[i]):0;
            int num2=i<v2.length?Integer.parseInt(v2[i]):0;
            if(num1<num2) return -1;
            if(num1>num2) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        String version1="1.002";
        String version2="1.10";
        System.out.println(compare(version1,version2));
    }
}


//0 ms another approch

// class Solution {
//     public int compareVersion(String version1, String version2) {
//         int n = version1.length();
//         int m = version2.length();
//         int i = 0, j = 0;
//         while(i < n || j < m){
//             int num1 = 0, num2 = 0;
//             while(i < n && version1.charAt(i) != '.'){
//                  num1 = num1 * 10 + version1.charAt(i) - '0';
//                 i++;
//             }
//             while(j < m && version2.charAt(j) != '.'){
//                 num2 = num2 * 10 + version2.charAt(j) - '0';
//                 j++;
//             }
//             if(num1 < num2) return -1;
//             else if(num1 > num2) return 1;
//             i++;
//             j++;
//         }
//         return 0;
//     }
// }