public class fibo {

    public fibo(int i) {
    }

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        Fib(int numbers){
            for(int i = 0; i< numbers; i++){
                if(i<2){
                    System.out.println(i);

                }
                else{
                    int next = first + second;
                    first = second;
                    second = next;
                    System.out.println(next);
                }
            }

        }
}
