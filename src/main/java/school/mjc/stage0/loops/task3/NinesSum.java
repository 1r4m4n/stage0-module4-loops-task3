package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int s = 9;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += s;
            s = s * 10 + 9;
        }
        System.out.println(sum);
    }

}
