package tim_so_nguyen_to;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;

            for(int i = 2; ; i++){
                if(checkPrime(i)){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                    count++;
                }
                if(count == 2000){
                    break;
                }
            }

    }

    private boolean checkPrime(int number){
        boolean check = true;
        for(int i = 2; i <= (int)Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
