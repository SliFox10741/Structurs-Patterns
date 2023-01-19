public class BinOps {
    private IntsCalculator intsCalculator = new IntsCalculator();
    public String sum(String a, String b) {
        int digit1 = Integer.parseInt(a, 2);
        int digit2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(intsCalculator.sum(digit1, digit2));
    }

    public String mult(String a, String b) {
        int digit1 = Integer.parseInt(a, 2);
        int digit2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(intsCalculator.mult(digit1, digit2));
    }
}