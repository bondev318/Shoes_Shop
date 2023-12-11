package shoesShop.MVC.Service;

import java.util.List;
import java.util.Set;

import shoesShop.MVC.Entity.Order;
import shoesShop.MVC.Entity.OrderDetail;

public interface OrderService {
	public int addOrder(Order order);
	public List<Order> getAllOrders();
	public Order getOrderByID(int orderID);
	public boolean deleteOrder(int orderID);
	public List<Order> getAllOrderByCustomerID(int customerID);
	public boolean editOrder(Order order);
	public List<Order> getOrderHistoryByCustomerID(int customerID);
	public List<Order> searchOrder(String input);
}
