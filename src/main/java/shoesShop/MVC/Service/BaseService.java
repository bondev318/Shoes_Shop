package shoesShop.MVC.Service;

import java.util.List;

import shoesShop.MVC.Entity.Category;
import shoesShop.MVC.Entity.Supplier;

public interface BaseService {
	public List<Category> getCategoryMenu();
	public List<Supplier> getSupplierMenu();
}
