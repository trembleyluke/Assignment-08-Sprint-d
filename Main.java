public class Main {
    public static double workTime, capacity, time;


    public static void main(String[] args) {
        workTime = 1590;
        printCapacity(8,3);
        printCapacity(9,3);
        printCapacity(10,3);
        printCapacity(11,3);
        printCapacity(8,4);
        printCapacity(8,5);
        printCapacity(8,6);
    }
    public static void printCapacity(int devs, int sprintLength){
        time = devs * 30.0 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %d devs working a %d week sprint, for 30 hrs/wk, we would be at %.0f%% of capacity.\n", devs,sprintLength, capacity);

        time = devs * 35.0 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %d devs working a %d week sprint, for 35 hrs/wk, we would be at %.0f%% of capacity.\n", devs,sprintLength, capacity);

        time = devs * 40.0 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %d devs working a %d week sprint, for 40 hrs/wk, we would be at %.0f%% of capacity.\n", devs, sprintLength, capacity);
        System.out.println();
    }
}
