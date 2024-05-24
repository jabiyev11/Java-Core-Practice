package paralelExecution;

import java.util.concurrent.BlockingQueue;

public class ParallelTaskExecutor extends Thread {

    private final BlockingQueue<Task> taskQueue;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while (!taskQueue.isEmpty()) {
                Task task = taskQueue.poll();
                if (task != null) {
                    System.out.println("Executing: " + task);
                    Thread.sleep(task.getDuration());
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
