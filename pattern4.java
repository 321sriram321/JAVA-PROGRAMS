class pattern4{
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
        for(int k=1;k<=i;k++){
            
                System.out.print("*");/*if we give space before or after the * then another imp pattern will form like *
                                                                                                                        * *
                                                                                                                       * * *   this     */
           }System.out.println();
        }
    }
}