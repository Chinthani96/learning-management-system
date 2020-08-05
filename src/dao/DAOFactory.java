package dao;

import dao.custom.impl.AdminDAOImpl;
import dao.custom.impl.ModuleDAOImpl;
import dao.custom.impl.StudentDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    /*    public CustomerDAO getCustomerDAO(){
            return new CustomerDAOImpl();
        }
        public ItemDAO getItemDAO(){
            return new ItemDAOImpl();
        }
        public OrderDAO getOrderDAO(){
            return new OrderDAOImpl();
        }
        public OrderDetailDAO getOrderDetailDAO(){
            return new OrderDetailDAOImpl();
        }*/
    public <T extends SuperDAO> T getDAO(DAOType daoType) {
        switch (daoType) {
            case ADMIN:
                return (T) new AdminDAOImpl();
            case ANNOUNCEMENT:
                return (T) new AnnouncementDAOImpl();
            case CONTENT:
                return (T) new ContentDAOImpl();
            case COURSE:
                return (T) new CourseDAOImpl();
            case FACULTY:
                return (T) new FacultyDAOImpl();
            case FACULTYCONTACT:
                return (T) new FacultyContactDAOImpl();
            case FACULTYLECTURER:
                return (T) new FacultyLecturerDAOImpl();
            case LECTURER:
                return (T) new LecturerDAOImpl();
            case MODULE:
                return (T) new ModuleDAOImpl();
            case LECTURERMODULE:
                return (T) new LecturerModuleDAOImpl();
            case STUDENT:
                return (T) new StudentDAOImpl();
            case STUDENTCOURSE:
                return (T) new StudentCourseDAOImpl();
            default:
                return null;
        }
    }
}
