package pl.edu.wszib.jdp.singleton;

public class SpecialService {

    private static SpecialService INSTANCE = null;

    private SpecialService() {
    }

    public static SpecialService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SpecialService();
        }
        return INSTANCE;
    }
}
