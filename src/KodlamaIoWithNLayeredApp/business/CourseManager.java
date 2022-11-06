package KodlamaIoWithNLayeredApp.business;

import KodlamaIoWithNLayeredApp.core.logging.Logger;
import KodlamaIoWithNLayeredApp.dataAccess.course.CourseDao;
import KodlamaIoWithNLayeredApp.entities.Category;
import KodlamaIoWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void getCourses(Course[] courses) {
		courseDao.getCourses(courses);
		for (Logger logger : loggers) {
			for (Course course : courses) {
				logger.log(course.getCourseName());

			}
		}

	}
}
