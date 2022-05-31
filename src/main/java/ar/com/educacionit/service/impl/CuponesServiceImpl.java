package ar.com.educacionit.service.impl;

import ar.com.educacionit.domain.Cupones;
import ar.com.educacionit.repository.CuponesRepository;
import ar.com.educacionit.service.CuponesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuponesServiceImpl implements CuponesService {

    //spring por medio de la inyeccion de dependencias
    @Autowired
    private CuponesRepository repository;

    @Override
    public List<Cupones> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void save(Cupones cupon) {
        this.repository.save(cupon);
    }

    @Override
    public Cupones getById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void update(Cupones cupon) {
        this.repository.save(cupon);
    }

}