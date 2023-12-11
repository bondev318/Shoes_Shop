package shoesShop.MVC.UserController;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shoesShop.MVC.DTO.ProductDTO;
import shoesShop.MVC.Entity.Category;
import shoesShop.MVC.Entity.Product;
import shoesShop.MVC.Entity.Supplier;
import shoesShop.MVC.Service.BaseService;
import shoesShop.MVC.Service.CategoryService;
import shoesShop.MVC.Service.ProductService;
import shoesShop.MVC.Service.SupplierService;
@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private BaseService baseService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private ProductService productService;
	@GetMapping("{pageID}/category")
	public String getProductByCategory(@PathVariable("pageID") int pageID, @RequestParam("categoryID") int categoryID, Model model) {
		List<Object> obj = productService.getAllProductByCategory(categoryID, pageID, 9);
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("listProducts", obj.get(0));
		model.addAttribute("numberOfProduct", obj.get(1));
		model.addAttribute("categoryID", categoryID);
		model.addAttribute("nameBySelection", categoryService.getCategoryByID(categoryID).getCategoryName());
		return "user/product_category";
	}
	
	@GetMapping("{pageID}/supplier")
	public String getProductBySupplier(@PathVariable("pageID") int pageID, @RequestParam("supplierID") int supplierID, Model model) {
		List<Object> obj = productService.getAllProductBySupplier(supplierID, pageID, 9);
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("listProducts", obj.get(0));
		model.addAttribute("supplierID", supplierID);
		model.addAttribute("numberOfProduct", obj.get(1));
		model.addAttribute("nameBySelection", supplierService.getSupplierByID(supplierID).getSupplierName());
		return "user/product_supplier";
	}
	
	@GetMapping("{pageID}/category-supplier")
	public String getProductByCategorySupplier(@PathVariable("pageID") int pageID, @RequestParam("categoryID") int categoryID, @RequestParam("supplierID") int supplierID, Model model) {
		List<Object> obj = productService.getAllProductByCategorySupplier(categoryID, supplierID, pageID, 9);
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("supplierID", supplierID);
		model.addAttribute("categoryID", categoryID);
		model.addAttribute("listProducts", obj.get(0));
		model.addAttribute("numberOfProduct", obj.get(1));
		model.addAttribute("nameBySelection", categoryService.getCategoryByID(categoryID).getCategoryName());
		model.addAttribute("supplierNameSelection", supplierService.getSupplierByID(supplierID).getSupplierName());
		return "user/product_category-supplier";
	}
	
	@GetMapping("/all-products/{pageID}")
	public String getAllProduct(@PathVariable("pageID") int pageID, Model model) {
		List<Object> obj = productService.getProductByNumber(pageID, 9);
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("numberOfProduct", obj.get(1));
		model.addAttribute("listProducts", obj.get(0));
		model.addAttribute("nameBySelection", "TẤT CẢ SẢN PHẨM");
		return "user/product_page";
	}
	
	@GetMapping("/product-detail")
	public String productDetail(@RequestParam("productID") int productID, Model model) {
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("product", productService.getProductByID(productID));
		return "user/product_detail";
	}
	
	@GetMapping("{pageID}/search")
	public String searchProduct(@RequestParam("input") String input, Model model, @PathVariable("pageID") int pageID, HttpSession session) {
		List<Object> obj = productService.searchProduct(input, pageID, 9);
		model.addAttribute("listSuppliers",baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("listProducts", obj.get(0));
		model.addAttribute("numberOfProduct", obj.get(1));
		model.addAttribute("nameBySelection", "KẾT QUẢ TÌM KIẾM");
		session.setAttribute("inputString", input);
		return "user/product_search";
	}
}
