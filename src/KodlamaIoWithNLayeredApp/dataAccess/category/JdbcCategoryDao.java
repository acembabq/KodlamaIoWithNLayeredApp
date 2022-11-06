package KodlamaIoWithNLayeredApp.dataAccess.category;

import KodlamaIoWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	private Category[] categories;

	@Override
	public void getCategories(Category[] categories) {
		for (Category category : categories) {
			System.out.println("Jdbc ile kategori: " + category.getCtgryName() + " getirildi.");
		}

	}

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi :" + category);

	}

	@Override
	public boolean checkName(String categoryName,Category[] categories) {

		for (Category category : categories) {
			if (category.getCtgryName().equalsIgnoreCase(categoryName)) {
				return true;
			}
		}
		return false;
	}

}
