class Animal {
    void sound() {
        System.out.println(" animal make sound");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("dog barks");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("cat meow");
    }
}

public class javalab2 {

    static {
        System.out.println("This sentence is written in static block");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    static int x = 10;

    public static void main(String[] args) {
        Animal a;
        a = new dog();
        a.sound();
        a = new cat();
        a.sound();
        // System.out.println("Sum is: "+sum(2,6));
        System.out.println("Sum is : " + javalab2.sum(2, 4));
        System.out.println("This is static variable" + javalab2.x);
    }
}