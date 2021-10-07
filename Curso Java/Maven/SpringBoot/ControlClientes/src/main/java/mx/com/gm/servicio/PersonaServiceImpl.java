package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;
import mx.com.gm.repository.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> finAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void actualizar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(long id) {
        return personaDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void guardar(Persona persona){
        personaDao.save(persona);
    }
}
