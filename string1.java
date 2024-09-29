class string1{
    public static void main(String[] args) {
        String str="malayalam";
        int count=0;
        char target='l';
        int n=str.length();
        for(int i =0;i<n;i++){
            if(str.charAt(i)==target){
                count=count+1;
            }
        }System.out.println(count);
    }

}