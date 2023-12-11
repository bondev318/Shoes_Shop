package shoesShop.MVC.DAO;

import java.util.List;

import shoesShop.MVC.Entity.Supplier;

public interface SupplierDAO {
	public List<Supplier> getAllSupplier();
	public Supplier getSupplierByID(int supplierID);
	public int addSupplier(Supplier supplier);
	public boolean deleteSupplier(int supplierID);
	public boolean editSupplier(Supplier supplier);
	public List<Supplier> searchSupplier(String input);
}
