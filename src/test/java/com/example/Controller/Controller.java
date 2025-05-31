package com.example.Controller;

import java.util.List;
import com.example.demo.Personaje;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.PersonajeMongo;
@RestController
@RequestMapping("/Personaje")
public class Controller 
{
	private final PersonajeMongo per;
	
	public Controller(PersonajeMongo per) {
		this.per = per;}

	@GetMapping
	public List<Personaje> listar()
	{
		return per.findAll();
	}
	@PostMapping
	public Personaje guardar (@RequestBody Personaje Personaje) 
	{
		return per.save(Personaje);
	}
	 @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable String id) 
	 {
		 per.deleteById(id);
	 }
}
