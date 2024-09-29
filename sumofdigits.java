class sumofdigits{
    public static void main(String[] args) {
        int sum=0;
        int num=12345;
        
        for(int i=1;i<=5;i++){
           int r=num%10;
            sum=sum+r;
            num=num/10;

        }
        System.out.println(sum);


    }
}