package shoesShop.MVC.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shoesShop.MVC.DAO.SupplierDAO;
import shoesShop.MVC.Entity.Supplier;
import shoesShop.MVC.Service.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDAO supplierDao;
	@Override
	@Transactional
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return supplierDao.getAllSupplier();
	}
	@Override
	@Transactional
	public Supplier getSupplierByID(int supplierID) {
		// TODO Auto-generated method stub
		return supplierDao.getSupplierByID(supplierID);
	}
	@Override
	@Transactional
	public int addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierDao.addSupplier(supplier);
	}
	@Override
	@Transactional
	public boolean deleteSupplier(int supplierID) {
		// TODO Auto-generated method stub
		return supplierDao.deleteSupplier(supplierID);
	}
	@Override
	@Transactional
	public boolean editSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierDao.editSupplier(supplier);
	}
	@Override
	@Transactional
	public List<Supplier> searchSupplier(String input) {
		// TODO Auto-generated method stub
		return supplierDao.searchSupplier(input);
	}

}
