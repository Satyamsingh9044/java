class  RemoveOccurence{
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(true){
            int idx=sb.indexOf(part);
            if(idx==-1) break;
            sb.delete(idx,idx+part.length());
            }
            return sb.toString();
    }

    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        System.out.println(removeOccurrences(s,part));
    }
}