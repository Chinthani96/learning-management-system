package business;

import business.custom.impl.LecturerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType) {
        switch (boType) {
            case LECTURER:
                return (T) new LecturerBOImpl();

            default:
                return null;
        }
    }
}
