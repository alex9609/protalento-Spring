package ar.com.educacionit.service;

import ar.com.educacionit.domain.Cupones;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuponesService {

    public List<Cupones> findAll();
    public void delete(Long id);
    public void save(Cupones cupon);
    public Cupones getById(Long id);
    public void update(Cupones cupon);
}
