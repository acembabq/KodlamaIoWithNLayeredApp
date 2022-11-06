package KodlamaIoWithNLayeredApp.dataAccess.course;

import KodlamaIoWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override

	public void getCourses(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Jdbc ile kurs: " + course.getCourseName() + "getirildi");
		}

	}
}