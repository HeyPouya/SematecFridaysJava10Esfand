package ir.heydarii.lib;

public class NumberClass {


    public void sayHello(int age) {
        if (age >= 1 && age <= 10) {
            System.out.print("child");
        } else if (age >= 11 && age <= 20) {
            System.out.print("teen");
        } else if (age >= 21 && age <= 40) {
            System.out.print("young");
        } else if (age >= 41 && age <= 70) {
            System.out.print("mid");
        } else {
            System.out.print("old");
        }
    }


    private void countToTen(int number) {
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
            default:
                System.out.print("Unknown Number !!!");

        }
    }

    public void checkWhile() {

        int a = 11;

        do {
            System.out.println("The number is: " + a);
            a++;
        } while (a <= 10);
    }


}
