class arraysumofprime{
    public static void main(String[] args) {
        int a[]={3,5,7,9,4,6,11};
        int count=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                    count+=count;
            }
            if(count==2){
                System.out.println("prime numbers are:"+a[i]);
                  sum=sum+a[i];

            }
            
            }System.out.println(sum);
            

            
        }
    }
}