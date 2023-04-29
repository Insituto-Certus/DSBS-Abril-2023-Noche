package certus.edu.pe.ms.productos.entidad;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType .IDENTITY)
	private Long id;
	private String name;
	private Double price;
	
	@Column (name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Transient //evitar tener iteración con la bd, mostrar el port del microservicios
	private Integer port;
	
	
}
