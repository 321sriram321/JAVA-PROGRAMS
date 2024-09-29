class string2{
    public static void main(String args[]){
        String str="education";
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char target=str.charAt(i);
            switch(target){
                case 'a':
                case 'e':
                
                case 'i':
                
                case 'o':
                
                case 'u':
                count=count+1;
                break;
                default:
            }
        }
        System.out.println(count);
    }
}