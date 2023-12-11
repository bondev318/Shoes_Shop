package shoesShop.MVC.Service;

import java.util.List;

import shoesShop.MVC.DTO.UserDTO;
import shoesShop.MVC.Entity.Customer;
import shoesShop.MVC.Entity.User;

public interface UserService {
	public User findByUserName(String username);
	public Customer findByCustomerID(int id);
	public int addCustomer(Customer customer);
	public String addUser(User user);
	public List<User> getOnlyUserRole();
	public List<User> getAllUsers();
	public boolean editUser(User user);
	public boolean deleteUser(String username);
	public List<User> searchUser(String input);
	public boolean updateUser(User user);
	public List<Customer> getAllCustomer();
}
