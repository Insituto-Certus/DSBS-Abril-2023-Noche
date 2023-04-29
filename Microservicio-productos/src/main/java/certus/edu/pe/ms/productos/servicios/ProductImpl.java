package certus.edu.pe.ms.productos.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import certus.edu.pe.ms.productos.entidad.Product;
import certus.edu.pe.ms.productos.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductImpl implements IProductService {

	private final IProductRepository productRepository;
	
	@Override
	@Transactional(readOnly = true)  // solo de lectura
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true) // de lectura
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

}
