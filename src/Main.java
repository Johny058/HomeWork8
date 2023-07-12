
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
        int nums = 1;
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        months[0] = 1;

        for (int i = 0; i < 10; i++) {
            months[i] += nums;
            if (months[i] % 2 == 0) {
                System.out.println(months[i]);
            }
        }
    }
}

