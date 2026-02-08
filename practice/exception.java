public class exception {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("This  block always executes.");
        }

        try {
            int arr[] = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid.");
        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        } finally {
            System.out.println("this is finally block");
        }
        ThrowExample obj = new ThrowExample();
        obj.checkAge(15); 

    }
}

class ThrowExample {
   
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote!");
        }
    }
}
