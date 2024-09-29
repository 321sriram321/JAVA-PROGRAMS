class countvowels{
    public static void main(String args[]){
        String str="sriram";
        int n=str.length();
        int count=0;
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("no of vowewls are :"+count);
        System.out.println("no of consonants are :"+(n-count));
    }
}