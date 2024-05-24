package week04;

public class Histogram {
    public static void main(String[] args){
        int[] grade = {2, 3, 1, 5, 5, 5, 6, 10, 2, 2, 3, 4, 5};
        int[] histogram = new int[11];
        for(int x: grade){
            histogram[x]++;
        }

        printHistogram(histogram);
        calculateMean(grade);
        calculateMedian(grade);
        calculateMode(histogram);
    }

    public static void printHistogram(int[] histogram){
        int gradeCount;
        for(int i = 0; i < histogram.length; i++){
            System.out.print(i + ":");
            gradeCount = histogram[i];

            for(int j = 0; j < gradeCount; j++){
                System.out.print(">");
            }
            System.out.println(gradeCount);
        }
    
    }

        public static void calculateMean(int[] grades){
            int sum = 0;
            double mean;

            for(int x: grades){
                sum += x;
            }

            mean = (double) sum / grades.length;
            System.out.println("Mean: " + mean);

        }

        public static void calculateMode(int[] histogram){
            int frequency = 0;
            int mode = 0;

            for(int i = 0; i < histogram.length; i++){
                if(histogram[i] > frequency){
                    frequency = histogram[i];
                    mode = i;
                }
            }

            System.out.println("Mode: " + mode);
        
        }

        public static void calculateMedian(int[] grades){
            int countNumber = grades.length;
            //nested loop for sorting array
            for(int i = 0; i < countNumber - 1; i++){
                for(int j = 0; j < countNumber - i - 1; j++){
                    if(grades[j] > grades[j + 1]){
                        int temp = grades[j];
                        grades[j] = grades[j + 1];
                        grades[j + 1] = temp;

                    }
                }
            }
            double median;

            if(countNumber % 2 == 0){
                median = (grades[(countNumber / 2) - 1] + grades[countNumber / 2]) / 2.0;
            }
            else{
                median = grades[countNumber / 2];
            }

            System.out.println("Median: " + median);
        }
} 
    

    
