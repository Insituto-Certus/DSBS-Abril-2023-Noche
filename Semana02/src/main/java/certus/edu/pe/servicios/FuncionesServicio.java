package certus.edu.pe.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Funciones;
import certus.edu.pe.repositorios.FuncionesRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class FuncionesServicio {
	
	@Autowired
	public FuncionesRepositorio repositorio;
	
	
	public Funciones crear(Funciones funciones) {
		return repositorio.save(funciones);
	}
	
	public List<Funciones> buscarTodo(){
		return (ArrayList<Funciones>) repositorio.findAll();
	}
	
	public Funciones buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public Funciones actualizar(Funciones funcionesActualizar) {
		
		Funciones funcionActual = repositorio.findById(funcionesActualizar.getIdFunciones()).get();
		
		funcionActual.setIdFunciones(funcionesActualizar.getIdFunciones());
		funcionActual.setHoraInicio(funcionesActualizar.getHoraInicio());
		funcionActual.setHoraFin(funcionesActualizar.getHoraFin());
		funcionActual.setPrecio(funcionesActualizar.getPrecio());
		
		Funciones funcionesActualizado = repositorio.save(funcionActual);
		return funcionesActualizado;
	}
	
	public void eliminarFunciones(Integer id) {
		repositorio.deleteById(id);
	}
	
public void actualizar(int id, Funciones funcion) {
		
		Funciones funcionActual = repositorio.findById(id).get();
		
		funcionActual.setIdFunciones(funcion.getIdFunciones());
		funcionActual.setHoraInicio(funcion.getHoraInicio());
		funcionActual.setHoraFin(funcion.getHoraFin());
		funcionActual.setPrecio(funcion.getPrecio());
		funcionActual.setSala(funcion.getSala());
		repositorio.save(funcionActual);
		
	}
	
	

}
