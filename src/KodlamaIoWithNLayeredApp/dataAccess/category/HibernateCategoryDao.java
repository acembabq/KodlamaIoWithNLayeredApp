package KodlamaIoWithNLayeredApp.dataAccess.category;

import java.util.Iterator;

import KodlamaIoWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	private Category[] categories;
	@Override
	public void getCategories(Category[] categories) {
		for (Category category : categories) {
			System.out.println("Hibernate ile kategori: " + category.getCtgryName() + " getirildi.");
		}

	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi :"+category);
		
	}

	@Override
	public boolean checkName(String categoryName,Category[] categories) {
		
		for (Category _category : categories) {
			if (_category.getCtgryName().equalsIgnoreCase(categoryName)) {
				return true;
			}
		}
		return false;
	}

	

	
		
	}


