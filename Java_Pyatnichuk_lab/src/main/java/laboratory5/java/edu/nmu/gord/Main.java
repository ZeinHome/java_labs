package edu.nmu.gord;
import edu.nmu.gord.controller.StudentController;
import edu.nmu.gord.viewer.StudentView;
import java.sql.SQLException;
public class Main {
        public static void main(String[] args) throws SQLException {
            StudentView.view(StudentController.findStudentsInDb("2003.04.25", "1995.06.15"));
    }
}