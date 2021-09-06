public class RomanNumbers {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static String toRoman(int number) {
        String result = "";
        if(number < 4) {
            for (int i = 0; i < number; i++) {
                result += "I";
            }
        }else if(number == 4) {
            result += "IV";
        }
        else{
            result += "V";
        }
        return result;
    }
}
