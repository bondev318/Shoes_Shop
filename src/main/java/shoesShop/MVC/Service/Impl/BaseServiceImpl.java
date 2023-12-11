package shoesShop.MVC.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shoesShop.MVC.DAO.CategoryDAO;
import shoesShop.MVC.DAO.SupplierDAO;
import shoesShop.MVC.Entity.Category;
import shoesShop.MVC.Entity.Supplier;
import shoesShop.MVC.Service.BaseService;
@Service
public class BaseServiceImpl implements BaseService{
	@Autowired
	private CategoryDAO categoryDao;
	@Autowired
	private SupplierDAO supplierDao;
	@Override
	@Transactional
	public List<Category> getCategoryMenu() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategory();
	}

	@Override
	@Transactional
	public List<Supplier> getSupplierMenu() {
		return supplierDao.getAllSupplier();
	}

}
