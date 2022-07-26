class Data3 { int x; }

public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    private static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp;
    }
}
