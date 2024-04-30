package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set		
		product1.setName("Kahve Makinesi");
		product1.setUnitPrice(7299.15);
		product1.setDiscount(5.0);
		product1.setUnitsInStock(10);
		product1.setImageUrl("kahve-makinesi1.jpg");

		// get
		// System.out.println(product1.name);
		
		Product product2 = new Product();	
		product2.setName("Smeg Makinesi");
		product2.setUnitPrice(2149.15);
		product2.setDiscount(3.0);
		product2.setUnitsInStock(4);
		product2.setImageUrl("kahve-makinesi2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Makinesi");
		product3.setUnitPrice(4249.15);
		product3.setDiscount(10.0);
		product3.setUnitsInStock(7);
		product3.setImageUrl("kahve-makinesi3.jpg");
		
		Product[] products= {product1, product2, product3};
		System.out.println("<ul>");
		for (Product product: products) {
			System.out.println("<li>" + product.getName() + "</li>");
			System.out.println("<li>" + product.getUnitPrice() + "</li>");
			System.out.println("<li>" + product.getDiscount() + "</li>");
			System.out.println("<li>" + product.getUnitsInStock() + "</li>");
			System.out.println("<li>" + product.getImageUrl() + "</li>\n");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05344064444");
		individualCustomer.setCustomerNumber("4236234");
		individualCustomer.setFirstName("Melih");
		individualCustomer.setLastName("Çetin");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("melihcetin.com");
		corporateCustomer.setPhone("02415123541");
		corporateCustomer.setTaxNumber("42341242134");
		corporateCustomer.setCustomerNumber("54213");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
	}

}

