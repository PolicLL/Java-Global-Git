public class Calculator { 

public int add (int a, int b) { 
return a + b 
}

public int multi (int a, int b) { 
return a * b 
}

public static double sqrtBad(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(number);
    }

public int add(int a, int b) {
    System.out.println(\"This is add method\");
    return a + b;
}

 }
