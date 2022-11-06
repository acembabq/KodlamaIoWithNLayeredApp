package KodlamaIoWithNLayeredApp.dataAccess.course;

import KodlamaIoWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
	private Course[] courses;
	@Override

	public void getCourses(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Jdbc ile kurs: " + course.getCourseName() + "getirildi");
		}

	}

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi :" + course);

	}

	@Override
	public boolean checkPrice(Course course) {
		if(course.getCoursePrice()<0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkName(String courseName, Course[] courses) {

		for (Course course : courses) {
			if (course.getCourseName().equalsIgnoreCase(courseName)) {
				return true;
			}
		}
		return false;
	}
}