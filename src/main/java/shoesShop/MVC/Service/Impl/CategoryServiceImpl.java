package shoesShop.MVC.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shoesShop.MVC.DAO.CategoryDAO;
import shoesShop.MVC.Entity.Category;
import shoesShop.MVC.Service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDAO categoryDao;
	@Override
	@Transactional
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategory();
	}
	
	@Override
	@Transactional
	public Category getCategoryByID(int categoryID) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryByID(categoryID);
	}

	@Override
	@Transactional
	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.addCategory(category);
	}

	@Override
	@Transactional
	public boolean deleteCategory(int categoryID) {
		// TODO Auto-generated method stub
		return categoryDao.deleteCategory(categoryID);
	}

	@Override
	@Transactional
	public boolean editCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.editCategory(category);
	}

	@Override
	@Transactional
	public List<Category> searchCategory(String input) {
		// TODO Auto-generated method stub
		return categoryDao.searchCategory(input);
	}

	

}
