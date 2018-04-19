public class QuadPolynomial {
    private int a;
    private int b;
    private int c;

    public int result(int num){
        return a*num*num+b*num+c;
    }

    public static void main(String[] args){
        QuadPolynomial abc=new QuadPolynomial();
        assert(abc.result(3)==38);
    }
}
