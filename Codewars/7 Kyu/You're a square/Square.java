public class Square {    
    public static boolean isSquare(int n) {  
        double square = Math.sqrt(n);
        return (square - (Math.floor(square)) == 0); // fix me!
    }
}