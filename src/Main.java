public class Main {

    public static void main(String[] args) {
        Matrix a = new Matrix(5,5);
        a.set(2,3,2);
        a.set(4,2,7);
        a.set(1,1,5);
        System.out.println(a);

        Matrix b = a.transpose();
        System.out.println(b);

        a.transposeSquare();
        System.out.println(a);
    }

}
