package certus.edu.pe.ms.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import certus.edu.pe.ms.productos.entidad.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
