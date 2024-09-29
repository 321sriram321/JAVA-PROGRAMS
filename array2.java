class Array2{
    public static void main(String args[]){
    int n,i,sum=0;
    int[] a={2,3,4,5,6,7,8};
    n=a.length;
    for(i=1;i<n;i++){
        if(i%2==0){
            sum=sum+a[i];
        }}
    System.out.println(sum);
    
    }
}