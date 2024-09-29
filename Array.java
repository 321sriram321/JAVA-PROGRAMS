class Array{
    public static void main(String[] args) {
        int sum=0;
        
        int[] a={21,42,43,45};
        int n=a.length;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);


    }
}