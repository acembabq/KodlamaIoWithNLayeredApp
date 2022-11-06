package KodlamaIoWithNLayeredApp.dataAccess.category;

import KodlamaIoWithNLayeredApp.entities.Category;

public interface CategoryDao {
	void getCategories(Category[] categories);
}
