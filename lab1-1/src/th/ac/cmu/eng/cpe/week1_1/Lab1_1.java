package th.ac.cmu.eng.cpe.week1_1;

/**
 * Created by pruet on 4/8/2559.
 */
public class Lab1_1 {

    public int findMax(int[] inputs)
    {
        return inputs[0];
    }

    public static void main(String[] args) {
        Lab1_1 l = new Lab1_1();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Max value is %d\n", l.findMax(inputs));
    }
}
