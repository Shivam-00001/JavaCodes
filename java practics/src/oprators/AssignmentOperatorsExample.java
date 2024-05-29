public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;

        // Simple Assignment
        // a = 5;
        // System.out.println("After assignment (a = 5): " + a); 

        // Addition Assignment
        a += 3;
        System.out.println("After addition assignment (a += 3): " + a); 

        // Subtraction Assignment
        a -= 2;
        System.out.println("After subtraction assignment (a -= 2): " + a); 

        // Multiplication Assignment
        a *= 2;
        System.out.println("After multiplication assignment (a *= 2): " + a); 

        // Division Assignment
        a /= 3;
        System.out.println("After division assignment (a /= 3): " + a); 

        // Modulus Assignment
        a %= 3;
        System.out.println("After modulus assignment (a %= 3): " + a); 

        // Bitwise AND Assignment
        a &= 1;
        System.out.println("After bitwise AND assignment (a &= 1): " + a); 

        // Bitwise OR Assignment
        a |= 2;
        System.out.println("After bitwise OR assignment (a |= 2): " + a); 

        // Bitwise XOR Assignment
        a ^= 1;
        System.out.println("After bitwise XOR assignment (a ^= 1): " + a); 

        // Left Shift Assignment
        a <<= 1;
        System.out.println("After left shift assignment (a <<= 1): " + a); 

        // Right Shift Assignment
        a >>= 1;
        System.out.println("After right shift assignment (a >>= 1): " + a); 

        // Unsigned Right Shift Assignment
        a = -8;
        a >>>= 1;
        System.out.println("After unsigned right shift assignment (a >>>= 1): " + a); 
    }
}
