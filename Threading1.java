class Threading1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +"is running with priority"+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Threading1 t1 = new Threading1();
        Threading1 t2 = new Threading1();
        Threading1 t3 = new Threading1();
        System.out.println("Thread 1 priority : "+t1.getPriority());    
        System.out.println("Thread 2 priority : "+t2.getPriority());
        System.out.println("Thread 3 priority : "+t3.getPriority());
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(4);
        System.out.println("\nThread 1 priority : "+t1.getPriority());
        System.out.println("Thread 2 priority : "+t2.getPriority());
        System.out.println("Thread 3 priority : "+t3.getPriority()+"\n");
        t1.start();
        t2.start();
        t3.start();
    }
}