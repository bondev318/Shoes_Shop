package shoesShop.MVC.DAO;

import java.util.HashMap;

import shoesShop.MVC.DTO.CartDTO;
import shoesShop.MVC.Entity.Product;

public interface CartDAO {
	public HashMap<Integer, CartDTO> addToCart(Product product, HashMap<Integer, CartDTO> cartItems);
	public HashMap<Integer, CartDTO> addToCartInDetail(Product product, int quantity, HashMap<Integer, CartDTO> cartItems);
	public HashMap<Integer, CartDTO> editCart(Product product, int quantity, HashMap<Integer, CartDTO> cartItems);
}
