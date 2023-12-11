<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Trang Chủ</title>

<body>

	<section id="slider">
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
							<li data-target="#slider-carousel" data-slide-to="3"></li>

						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>
										<span>Shoes</span>-SHOP
									</h1>
									<h2>Adidas</h2>
									<p>Adidas là một trong những hãng giày đã quá nổi tiếng hiện nay. Các dòng giày Adidas chính hãng luôn luôn được phát triển không chỉ ở thiết kế mới mà còn được áp dụng những công nghệ tiên tiến do chính Adidas sáng tạo ra. Adidas đã đưa công nghệ đế Boost đến gần với khách hàng của mình, từ đó khẳng định thêm vị thế của bản thân trên thị trường công nghiệp giày.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào!</a>
								</div>
								<div class="adidas" style="padding-top:100px">
								<div class="col-sm-6" >
									
									<img  src="<c:url value="/assets/user/images/home/adidas.png"/>"
										class="girl img-responsive" alt="" />
								</div>
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Shoes</span>-SHOP
									</h1>
									<h3>Nike</h3>
									<p>Nike tập trung chủ yếu vào tính năng chạy bộ. Tuy nhiên, Nike vẫn khéo léo kết hợp cho ra những thiết kế mang tính ứng dụng thời trang cao. Nike cũng tự phát triển cho mình công nghệ đế Flyknit với đặc tính mềm, ôm sát chân, giúp cho người dùng có những bước di chuyển thoải mái nhất.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào!</a>
								</div>
								<div class="nike" style="padding:100px ">
								<div class="col-sm-6">
									<img src="<c:url value="/assets/user/images/home/nike.png"/>"
										class="girl img-responsive" alt="" />
								</div></div>
							</div>
								<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Shoes</span>-SHOP
									</h1>
									<h2>Vans</h2>
									<p>Vans là một thương hiệu chuyên sản xuất giày phục vụ cho nhu cầu trượt ván. Tuy nhiên, hiện nay Vans còn được các bạn trẻ săn đón và sử dụng cho các mục đích như đi chơi, đi chơi, đi dạo phố,… Bởi những thiết kế của Vans luôn có phần mạnh mẽ, cá tính và đơn giản phù hợp với những bạn trẻ yêu thích phong cách cá tính.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào!</a>
								</div>
								<div class="vans">
								<div class="col-sm-6" style="padding-top:100px">
									<img src="<c:url value="/assets/user/images/home/vans.png"/>"
										class="girl img-responsive" alt=""  />
								</div></div>
							</div>
								<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Shoes</span>-SHOP
									</h1>
									<h2>Converse</h2>
									<p>Các sản phẩm của Converse được hãng đặt ở mức giá tầm trung khiến cho độ phủ sóng của thương hiệu này cực kỳ lớn. Hầu như đối với các bạn trẻ hiện nay thì thương hiệu Converse là thương hiệu “must have” trong tủ giày của mình. Những thiết kế của Converse luôn mang hình thức đơn giản, dễ dàng sử dụng và thân thiện với mọi người dùng cho dù là ở lứa tuổi nào.</p>
									<a href="<c:url value="/product/all-products/1"/>"
										type="button" class="btn btn-default get">Khám Phá Ngay
										Nào !</a>
								</div>
								<div class="converse">
								<div class="col-sm-6" style="padding-top:100px">
									<img src="<c:url value="/assets/user/images/home/converse.png"/>"
										class="girl img-responsive" alt=""  />
								</div></div>



						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/slider-->

	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<%@include
						file="/WEB-INF/views/layouts_master/user/categories_brands.jsp"%>
				</div>
				<div class="col-sm-9 padding-right" style="margin-bottom: 25px">
					<div class="features_items">
						<!--features_items-->
						<br/>
						<h2 class="title text-center">SẢN PHẨM NỔI BẬT</h2>
						<c:forEach items="${listProductsByNumber}" var="productItem">
							<div class="col-sm-4">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">

											<a
												href="<c:url value="/product/product-detail?productID=${productItem.productID}"/>"><img
												src="<c:url value="/assets/user/images/product_image/${productItem.listImages[0]}"/>"
												alt="" /></a>
											<!-- <h2><fmt:parseNumber var = "productUnitPrice" integerOnly = "true" type = "number" value = "${productItem.unitPrice}"/><c:out value="${productUnitPrice}"/> VNĐ</h2> -->
											<h2>
												<fmt:formatNumber type="number" maxFractionDigits="3"
													value="${productItem.unitPrice}" />
												đ
											</h2>
											<p>
												<c:out value="${productItem.productName}" />
											</p>
											<a
												href="<c:url value="/cart/add?productID=${productItem.productID}"/>"
												class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>

					</div>
					<div align="center">
						<a href="<c:url value="/product/all-products/1"/>"
							style="padding: 7px 10px; border: 1px solid #B3AFA8">Tất Cả
							Sản Phẩm</a>
					</div>
					<!--features_items-->
				</div>

			</div>
		</div>
	</section>
</body>
