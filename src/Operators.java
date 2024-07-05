public class Operators {
    public static void main(String[] args) {
        /*
        Arithmetic
        +
        -
        *
        /
        %

        Assignment
        =
        +=
        -=
        /=
        %=
        *=

        Relational or Conditional
        > greater
        < less
        >= greater or equal
        <= less or equal
        != not equal
        == equal

        Logical
        And &
        Or ||
        Not !



        Bitwise
         */


        int a = 10;
        int b = 5;

        System.out.println((a>b) & (b <a));//false
        System.out.println((b+5 < a) || (a<b));//false
        System.out.println((b+5 < a)|| !(a<b));//false
        System.out.println(!(!(b+5 < a) || (a<b)));//false
//        a = a + b;
//        b = b- a;
//        a *=a;

//        System.out.println(a);
//        System.out.println(b);
/*
        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a!=b+5);//false
        System.out.println(b<=a);//true
        System.out.println(b==a);//false

 */
    }
}
