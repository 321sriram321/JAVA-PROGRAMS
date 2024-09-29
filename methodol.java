class ram{
    void sriram(){
        System.out.println("string");
    }void sriram(int x){
        System.out.println(10);
    }
}
class methodol{
    public static void main(String[] args) {
        ram obj=new ram();
        obj.sriram();
        obj.sriram(10);
    }
}