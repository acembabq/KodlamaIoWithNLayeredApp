package KodlamaIoWithNLayeredApp.dataAccess.category;

import KodlamaIoWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void getCategories(Category[] categories) {
		for (Category category : categories) {
			System.out.println("Jdbc ile kategori: " + category.getCtgryName() + " getirildi.");
		}

	}

}
