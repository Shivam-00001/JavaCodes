// public class function {

//     // Correctly define the method at the class level
//     public static void myfun() {
//         System.out.println("This is my name");
//     }

//     public static void main(String[] args) {
//         // Call the method from the main method
//         function obj = new function();
//         obj.myfun();
//     }
// }




// public class function{
//     public static void myfun1() {
//         System.out.println("This is my page ");
//     }

//     public static void main(String[] args) {
//         function obj = new function();
//         obj.myfun();
//     }
// }




// public class function{
//     public static int myfun(int a, int b) {
//         // System.out.println("The sum is = " + (a+b));
//         return a + b;
//     }

//     public static void main(String[] args) {
//         myfun(5,10);
//     }
// }


// public class function{
//     public void myfun() {
//         System.out.println("This is my page ");
//     }

//     public static void main(String[] args) {
//         function obj = new function();
//         obj.myfun();
//     }
// }



// class aaddtion{
//     public static int add(int a, int b){
//         System.out.println("Addtion value is = " +(a+b));
//         return  a+b;
//     }
//     public static void main(String[] args) {
//         add(5, 10);
//     }
// }

// class Addtion {
//         public static void main(String[] args) {
//             int newadd=add(10, 12); //22
//             System.out.println(newadd); //22 print
//             System.out.println(add(6, 6)); // System.out.println(12)
//             System.out.println(add(5, 6));
//             System.out.println(add(8, 6));
//         }
//     public static int add(int a, int b){
//         int addt = a+b;
//         return addt;
//     }
// }


// with out return type----------------------------------------
// class aaddtion{
//     static void sum (int a, int b){
//             int add = a+b;
//             System.out.println(add);
//         }
//         public static void main(String[] args) {
//           sum(2, 2);
//         }
//     }


// return type -------------------------------------------------------------
class aaddtion{
    static int sum (int a, int b){
            int add = a+b;
            System.out.println(add);
            return add;
        }
        public static void main(String[] args) {
          sum(2, 2);

        }
    }