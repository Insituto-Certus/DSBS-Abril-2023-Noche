package certus.edu.pe.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import certus.edu.pe.modelo.Pelicula;
import certus.edu.pe.repositorios.PeliculaRepositorio;

@Service
@Transactional
public class PeliculasServicios {

	@Autowired // Inyección de dependencia
	private PeliculaRepositorio repositorio;
	
	public PeliculasServicios() {
		
	}
	
	public List<Pelicula> buscarTodo(){
		return (List<Pelicula>) repositorio.findAll();
	}
	
	public Pelicula actualizar(Pelicula peliculaActualizar) {
		
		Pelicula peliculaActual = repositorio.findById(peliculaActualizar.getIdPelicula()).get();
		
		//peliculaActual.setIdPelicula(peliculaActualizar.getIdPelicula());
		peliculaActual.setNombre(peliculaActualizar.getNombre());
		peliculaActual.setDuracion(peliculaActualizar.getDuracion());
		peliculaActual.setClasificacion(peliculaActualizar.getClasificacion());
		peliculaActual.setIdioma(peliculaActualizar.getIdioma());
		peliculaActual.setGenero(peliculaActualizar.getGenero());
		peliculaActual.setFormato(peliculaActualizar.getFormato());
		peliculaActual.setSinopsis(peliculaActualizar.getSinopsis());
		
		Pelicula peliculaActualizado = repositorio.save(peliculaActual); // registra en base de datos
		return peliculaActualizado;
		
	
	}
	
	
	public Pelicula crear(Pelicula pelicula) {
		return repositorio.save(pelicula);
	}
	
	public Pelicula buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
		
	}
	
}
