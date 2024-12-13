public class fibo {

    public static void main(String[] args) {
    int check = 55;
    int num = 100;
    int a= 0;
    int b = 1;
    int c=0;
    while(c < num){
        c = a + b;
     
        if(c == check){
            System.out.println("number exist");
            break;
        }
        else if(c < check){
            a = b;
            b = c;
        }
        else if(c> check){
            System.out.println("not exist");
        }

    }
}
}