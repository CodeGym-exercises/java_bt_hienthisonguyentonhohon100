public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        for(int i = 2; i<100 ; i++){
            boolean temp = true;
            for(int j = 2; j<=i/2 ; j++){
                if(i%j==0){
                   temp = false;
                   break;
                }
            }
            if(temp){
                System.out.print(i + " ");
            }else{
                continue;
            }
        }
    }
}
