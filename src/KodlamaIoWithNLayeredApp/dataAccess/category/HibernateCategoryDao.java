package KodlamaIoWithNLayeredApp.dataAccess.category;

import KodlamaIoWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void getCategories(Category[] categories) {
		for (Category category : categories) {
			System.out.println("Hibernate ile kategori: " + category.getCtgryName() + " getirildi.");
		}

	}

}
