package paralelExecution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException{

        String csvFilePath = "week13\\paralelExecution\\Tasks.csv";
        List<Task> taskList = readTasksFromCSV(csvFilePath);

        runWithDifferentWorkers(taskList, 1); //One worker
        runWithDifferentWorkers(taskList, Runtime.getRuntime().availableProcessors()); // One per CPU core
        runWithDifferentWorkers(taskList, taskList.size()); // One per Task
        

    }

    private static List<Task> readTasksFromCSV(String filePath) throws IOException {

        List<Task> taskList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0].trim();
                long duration = Long.parseLong(values[1].trim());
                taskList.add(new Task(name, duration));

            }
        }

        return taskList;
    }

    private static void runWithDifferentWorkers(List<Task> taskList, int numberOfWorkers) throws InterruptedException{
        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>(taskList);

        List<ParallelTaskExecutor> workers = new ArrayList<>();
        for(int i = 0; i < numberOfWorkers; i++){
            workers.add(new ParallelTaskExecutor(taskQueue));
        }

        long startTime = System.currentTimeMillis();


        for (ParallelTaskExecutor worker : workers) {
            worker.start();    
        }

        for (ParallelTaskExecutor worker : workers) {
            worker.join();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Execution time with " + numberOfWorkers + " workers: " + (endTime - startTime) + " ms");
    }
}
