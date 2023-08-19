package Lambda.Worker;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        OnTaskDoneListener.Worker worker = new OnTaskDoneListener.Worker(listener, errorListener);
        worker.start();
    }
}