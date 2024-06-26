public class Main {
    public static void main(String[] args) {
        int x = 2;
        double d = x;
        int y = (int) d;
        String xs = Integer.toString(x);
        String xss = String.valueOf(x);
        System.out.println("Hello world!"+" " + xs + " " + xss + " " + d + " " + y);
        System.out.printf("Hello world! %s %s %.1f %d%n", xs, xss, d, y);
    }
}