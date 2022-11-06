package KodlamaIoWithNLayeredApp.dataAccess.course;

import KodlamaIoWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void getCourses(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Habernate ile kurs: " + course.getCourseName() + " getirildi");
		}
		
	}

}
