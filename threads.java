class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Thread started: " + this.getName());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread completed: " + this.getName());
  }
}

public class threads {
  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();
    t1.setName("Thread 1");
    t2.setName("Thread 2");
    t3.setName("Thread 3");

    t1.start();
    t2.start();
    t3.start();

    // Using join method to wait for thread completion
    t1.join();
    t2.join();
    t3.join();

    System.out.println("All threads completed");
  }
}
