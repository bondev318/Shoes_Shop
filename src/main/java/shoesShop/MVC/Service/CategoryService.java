package shoesShop.MVC.Service;

import java.util.List;

import shoesShop.MVC.Entity.Category;

public interface CategoryService {
	public List<Category> getAllCategory();
	public Category getCategoryByID(int categoryID);
	public int addCategory(Category category);
	public boolean deleteCategory(int categoryID);
	public boolean editCategory(Category category);
	public List<Category> searchCategory(String input);
}
