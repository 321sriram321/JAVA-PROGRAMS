public class Minarray{
    public static void main(String args[]){
    int[] a={2,4,5,6,7,9,6,12,0};
    int n=a.length;
    int min=a[0];
    
    
    for(int i=1;i<n;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println(min);


    }
}