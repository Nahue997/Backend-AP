
package com.portfolio.nahuel.Interface;

import com.portfolio.nahuel.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar una persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona mediante Id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
