package certus.edu.pe.ms.productos.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import certus.edu.pe.ms.productos.entidad.Product;
import certus.edu.pe.ms.productos.servicios.IProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")

public class ProductController {

	private final IProductService productService;
	@Value("${server.port}")
	private Integer port;


    @GetMapping
    @ResponseBody
    ResponseEntity<List<Product>> findAll(){
        List<Product> products = productService.findAll()
                .stream()
                .map(product -> {
                    product.setPort(port);
                    return product;
                }).collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }
	
    @GetMapping("/{id}")
	ResponseEntity<Product> findById(@PathVariable  Long id){
		Product product = productService.findById(id);
		product.setPort(port);
		return ResponseEntity.ok(product);
		
		
	}

	
}
