public class App {
    public static void main(String[] args) throws Exception{
        int result = square(5);
        System.out.println(result);
        result = square(-5);
        System.out.println(result);

    }

        public static int square(int x){
            assert x > 0 : "Precondition failed: x should be positive";
            int result = x * x;
            assert result == x : "Postcondition failed: result should be equal to x";
            return result;

    }
}
