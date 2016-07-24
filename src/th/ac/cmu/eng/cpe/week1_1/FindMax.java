package th.ac.cmu.eng.cpe.week1_1;

public class FindMax {

    public static void main(String[] args) {
        int[] inputs = { 2, 4, 7, 9 , 3, 5, 1};
        int result;

        FindMax fm = new FindMax();
        result = fm.exec(inputs);
        System.out.printf("Max value is %d .", result);
    }

    public int exec(int[] inputs)
    {
        return inputs[0];
    }
}
