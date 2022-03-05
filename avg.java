public class avg {

    public static void main(String[] args) {

//        int sum = 0;
//        int i = 0;
//        for (int a = 1; a <= 5; a++) {
//            sum = sum + a;
//            i++;                                                                                                      //СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ
//        }
//        float avg = sum / i;
//        System.out.println(avg);

        int sum = 0;
        int i = 0;
        for (int a = 1; a <= 6; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
                i++;                                                                                                    //СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ ЧЕТНЫХ ЧИСЕЛ
            }
        }
        float avg = sum / i;
        System.out.println(avg);
    }
}
