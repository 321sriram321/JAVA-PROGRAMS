public class Nonduplicate{
    public static void main(String arga[]){
       int [] a={2,3,5,7,5,7,2};
       int n=a.length;

      for(int i=0;i<n;i++){
        for(int j=1;j<=n;j++){
            if(a[i]!=a[j]){
                System.out.println(a[i]);
            }
        }
        
      } 
    }
}