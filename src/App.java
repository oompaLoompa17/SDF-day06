public class App {
    
    public static void main(String[] args){

       
        Thread th = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + "->" + i);
                }
            }
        
        });
        th.start();
    }
}
