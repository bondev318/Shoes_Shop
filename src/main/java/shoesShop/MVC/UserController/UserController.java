package shoesShop.MVC.UserController;

import java.security.Principal;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shoesShop.MVC.Entity.Customer;
import shoesShop.MVC.Entity.Order;
import shoesShop.MVC.Entity.OrderDetail;
import shoesShop.MVC.Entity.User;
import shoesShop.MVC.Entity.UserRole;
import shoesShop.MVC.Service.BaseService;
import shoesShop.MVC.Service.OrderService;
import shoesShop.MVC.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private BaseService baseService;
	@Autowired
	private OrderService orderService;
	@GetMapping("/info")
	public String showInfo(Model model,Principal principal, HttpSession session) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		if(principal != null) {
			User user = userService.findByUserName(principal.getName());
			session.setAttribute("loggedUser", user);
		}
		return "/user/user_info";
	}
	
	@GetMapping("/order-detail")
	public String showOrderDetail(Model model, @RequestParam("orderID") int orderID) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		Order order = orderService.getOrderByID(orderID);
		model.addAttribute("listOrderDetails", order.getListOrderDetails());
		model.addAttribute("order", order);
		return "/user/user_order_detail";
	}
	
	@GetMapping("/all-orders")
	public String showAllOrdering(Model model, Principal principal, HttpSession session) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		if(principal != null) {
			User user = userService.findByUserName(principal.getName());
			session.setAttribute("loggedUser", user);
			model.addAttribute("listOrders", orderService.getAllOrderByCustomerID(user.getCustomer().getCustomerID()));
		}
		return "/user/user_all_orders";
	}
	
	@GetMapping("/order-history")
	public String showOrderHistory(Model model, Principal principal, HttpSession session) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		if(principal != null) {
			User user = userService.findByUserName(principal.getName());
			session.setAttribute("loggedUser", user);
			model.addAttribute("listOrders", orderService.getOrderHistoryByCustomerID(user.getCustomer().getCustomerID()));
		}
		return "/user/user_order_history";
	}
	
	@GetMapping("/deleteOrder")
	public String deleteOrder(Model model, @RequestParam("orderID") int orderID, HttpSession session) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		orderService.deleteOrder(orderID);
		return "redirect:/user/all-orders";
	}
	
	
}

