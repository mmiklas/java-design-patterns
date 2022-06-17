package pl.edu.wszib.jdp.singleton;

public class SingletonTester {
    public static void main(String[] args) {

        SpecialService specialService;

        //Is OK
        // specialService = new SpecialService();

        specialService = SpecialService.getInstance();

        SpecialService specialService1 = SpecialService.getInstance();
        assert (specialService != specialService1);

    }
}
