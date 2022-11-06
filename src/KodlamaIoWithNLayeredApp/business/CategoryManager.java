package KodlamaIoWithNLayeredApp.business;

import KodlamaIoWithNLayeredApp.core.logging.Logger;
import KodlamaIoWithNLayeredApp.dataAccess.category.CategoryDao;
import KodlamaIoWithNLayeredApp.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void getCategories(Category[] categories) { // response request pattern
		categoryDao.getCategories(categories);
		for (Logger logger : loggers) {
			for (Category category : categories) {
				logger.log(category.getCtgryName());
			}

		}
	}
}
