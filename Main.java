public class Main {
    public static double workTime, devs, sprintLength, capacity, time;

    public static void main(String[] args) {
        workTime = 1590;
        devs= 8;
        sprintLength= 3;
        hours30();
        hours35();
        hours40();
        devs= 9;
        sprintLength= 3;
        hours30();
        hours35();
        hours40();
        devs= 10;
        sprintLength= 3;
        hours30();
        hours35();
        hours40();
        devs= 11;
        sprintLength= 3;
        hours30();
        hours35();
        hours40();
        devs= 8;
        sprintLength= 4;
        hours30();
        hours35();
        hours40();
        devs= 8;
        sprintLength= 5;
        hours30();
        hours35();
        hours40();
        devs= 8;
        sprintLength= 6;
        hours30();
        hours35();
        hours40();
    }
    public static void hours30(){
        time = devs * 30 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %.0f devs working a %.0f week sprint, for 30 hrs/wk, we would be at %.0f%% of capacity.\n", devs,sprintLength, capacity);
    }
    public static void hours35(){
        time = devs * 35 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %.0f devs working a %.0f week sprint, for 35 hrs/wk, we would be at %.0f%% of capacity.\n", devs,sprintLength, capacity);
    }
    public static void hours40(){
        time = devs * 40 * sprintLength;
        capacity = (workTime/time * 100);
        System.out.printf("With %.0f devs working a %.0f week sprint, for 40 hrs/wk, we would be at %.0f%% of capacity.\n", devs,sprintLength, capacity);
        System.out.println();
    }
}
