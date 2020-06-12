

public class Triangle2 {

	public static void main(String[] args) {

        
        System.out.println("Test 1: "+ "Equilateral".equals(triangleType("3","3","3")));

        System.out.println("Test 2: "+ "Invalid Input".equals(triangleType("4","5","?")));

        System.out.println("Test 3: "+ "Not a Triangle".equals(triangleType("4","1","1")));

        System.out.println("Test 4: "+ "Not a Triangle".equals(triangleType("2","2","4")));

        System.out.println("Test 5: "+ "Not a Triangle".equals(triangleType("2","4","2")));

        System.out.println("Test 6: "+ "Isosceles".equals(triangleType("3","4","3")));

        System.out.println("Test 7: "+ "Scalene".equals(triangleType("3","4","6")));

        System.out.println("Test 8: "+ "Value not in range".equals(triangleType("300","300","200")));

        System.out.println("Test 9: "+ "Isosceles".equals(triangleType("3","3","4")));

        System.out.println("Test 10: "+ "Isosceles".equals(triangleType("3","3","4.5")));
    }

    public static String triangleType(String n1, String n2, String n3){

        int a, b ,c;
	    boolean c1, c2, c3, isTriangle;

        try{
            a = Integer.parseInt(n1);
            b = Integer.parseInt(n2);
            c = Integer.parseInt(n3);

        }catch(Exception e){
            return "Invalid Input";

        }
        
        c1 = (1 <= a) && (a <= 200);
        c2 = (1 <= b) && (b <= 200);
        c3 = (1 <= c) && (c <= 200);

        if (!c1 || !c2 || !c3) {
            return "Value not in range";
        }else{
            isTriangle = (a < b + c) && (b < a + c) && (c < a + b);

            if (isTriangle) {
                if ((a == b) && (b == c)) {
                    return "Equilateral";
                }
                else if ((a != b) && (a != c) && (b != c)) {
                    return"Scalene";
                } 
                else {
                    return"Isosceles";
                }
            } 
            else {
                return"Not a Triangle";
            }
        }

    }
}
