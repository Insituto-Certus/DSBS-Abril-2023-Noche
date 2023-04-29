package certus.edu.pe.ms.productos.servicios;

import java.util.List;

import certus.edu.pe.ms.productos.entidad.Product;

public interface IProductService {
	List<Product> findAll();
	Product findById(Long id);
}
