package exceptionExcample;

public class phoneExceptionTester {
    public static void main(String[] args){
        String[] numbers = new String[] {"123-4567", null, "234-5678", "456-7890"};
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(new Phone("iPhone", numbers[i]));
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
            finally{}
        }
    }
}
