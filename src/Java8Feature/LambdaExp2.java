package Java8Feature;

public interface LambdaExp2 {
    int operate(int x, int y);
}

class LambdaParameter{
    public static void main(String[] args) {
        LambdaExp2 f = (x,y) -> { int z = x+y;
            return z;
        };
        System.out.println(f.operate(40,9));

        LambdaExp2 f2 = (x,y) -> {
            int z = x*y;
            return z;
        };
        System.out.println(f2.operate(40,90));
    }

}
