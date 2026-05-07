class Task extends Thread {
    private String name;
    
    Task(String name) {
        this.name = name;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " executing step " + i);
            try {
                Thread.sleep(500); // Wait for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(name + " finished.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Task t1 = new Task("Thread-A");
        Task t2 = new Task("Thread-B");
        
        System.out.println("Starting threads...");
        t1.start();
        t2.start();
    }
}
