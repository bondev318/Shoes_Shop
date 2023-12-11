package shoesShop.MVC.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import shoesShop.MVC.DTO.CartDTO;
import shoesShop.MVC.Entity.Product;

public interface CartService {
	public HashMap<Integer, CartDTO> addToCart(Product product, HashMap<Integer, CartDTO> cartItems);
	public HashMap<Integer, CartDTO> editCart(Product product, int quantity, HashMap<Integer, CartDTO> cartItems);
	public HashMap<Integer, CartDTO> addToCartInDetail(Product product, int quantity, HashMap<Integer, CartDTO> cartItems);
}
