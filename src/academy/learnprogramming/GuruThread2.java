package academy.learnprogramming;
// Here we are taking a class “GuruThread2” which will have the main method in it.
public class GuruThread2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Here we are creating an instance of class GuruThread3 (which is created in below lines of the code)
        // as “threadguru1” and we are starting the thread.
        GuruThread3 threadguru1 = new GuruThread3("guru1");
        threadguru1.start();
        // Here we are creating another instance of class GuruThread3 (which is created in below lines of the code)
        // as “threadguru2” and we are starting the thread.
        GuruThread3 threadguru2 = new GuruThread3("guru2");
        threadguru2.start();
    }
}
// Here we are creating a class “GuruThread3” which is implementing the runnable interface
// (it should be implemented by any class whose instances are intended to be executed by the thread.)
class GuruThread3 implements Runnable {
    // we are taking two class variables from which one is of the type thread class and other of the string class.
    Thread guruthread;
    private String guruname;
    // we are overriding the GuruThread3 constructor, which takes one argument as string type (which is threads name)
    // that gets assigned to class variable guruname and hence the name of the thread is stored.
    GuruThread3(String name) {
        guruname = name;
    }
    // Here we are overriding the run() method of the runnable interface.
    @Override
    public void run() {
        // We are outputting the thread name using println statement.
        System.out.println("Thread running" + guruname);
        // Here we are using a for loop with counter initialized to 0, and it should not be less than 4
        // (we can take any number hence here loop will run 4 times) and incrementing the counter.
        // We are printing the thread name and also making the thread sleep for 1000 milliseconds within a
        // try-catch block as sleep method raised checked exception.
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(guruname);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    // Here we are overriding start method of the runnable interface.
    public void start() {
        // We are outputting the text “Thread started”.
        System.out.println("Thread started");
        // Here we are taking an if condition to check whether class variable guruthread has value in it or no.
        // If its null then we are creating an instance using thread class which takes the name as a parameter
        // (value for which was assigned in the constructor). After which the thread is started using start() method.
        if (guruthread == null) {
            guruthread = new Thread(this, guruname);
            guruthread.start();
        }
    }
}