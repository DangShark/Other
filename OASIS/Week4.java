public class Week4 {
    public static int max2Int(int a, int b) {
	    if(a >= b) return a;
        return b;
    }

    public static int minArray (int[] array) {
	    int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] <= max){
                max = array[i];
            }
        }
        return max;
    }

    public static String calculateBMI(double weight, double height){
	    double BMI = Math.round(weight / (height*height) * 10)/10.0;
        if(BMI < 18.5) return "Thiếu cân";
        else if(BMI < 23) return "Bình thường";
        else if(BMI < 25) return "Thừa cân";
        return "Béo phì";
    }
}
 