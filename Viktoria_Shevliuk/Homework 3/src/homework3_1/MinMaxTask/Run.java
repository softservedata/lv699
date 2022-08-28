package homework3_1.MinMaxTask;

public class Run {

    public static void main(String[] args) {

        int[] intarr = {2,3,4};
        int max = intarr[0];
        int imax = 0;
        int i = 0;
        while (i < intarr.length) {
            if (intarr[i] > max) {
                max = intarr[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Max number is "+ max);
        int min = intarr[0];
        int imin = 0;
        int t = 0;
        while (t < intarr.length) {
            if (intarr[t] > max) {
                max = intarr[t];
                imax = t;
            }
            t++;
        }
        System.out.println("Min number is "+ min);


    }
}
