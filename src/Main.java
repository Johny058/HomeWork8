
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[0] + ", " + weights[1] + ", " + weights[2]);

        float[] nums = new float[3];
        nums[0] = 1.57f;
        nums[1] = 7.654f;
        nums[2] = 9.986f;
        System.out.println(nums[0] + ", " + nums[1] + ", " + nums[2]);
        int[] months = {1, 2, 3};
        System.out.println(months[0] + ", " + months[1] + ", " + months[2]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] months = {3, 2, 1};
        System.out.println(months[0] + ", " + months[1] + ", " + months[2]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.println(weights[2] + ", " + weights[1] + ", " + weights[0]);

        float[] nums = new float[3];
        nums[0] = 1.57f;
        nums[1] = 7.654f;
        nums[2] = 9.986f;
        System.out.println(nums[2] + ", " + nums[1] + ", " + nums[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] months = new int[10];
        int nums = 1;
        months[0] = 1;
        months[1] = 3;
        months[2] = 5;
        months[3] = 7;
        months[4] = 9;
        months[5] = 11;
        months[6] = 13;
        months[7] = 15;
        months[8] = 17;
        months[9] = 19;

        for (int i = 1; i < months.length; i++) {
            System.out.println(months[i] + nums);
        }
    }
}

