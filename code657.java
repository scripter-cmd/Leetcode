public class code657 {
    public static void main(String[] args) {
        String moves = "RLUURDDDLU";
        String robotmove="UDLR";
        if(robotmove.contains(moves))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");   
        }
    }
}
