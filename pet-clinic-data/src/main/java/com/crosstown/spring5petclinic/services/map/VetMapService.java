package com.crosstown.spring5petclinic.services.map;

import com.crosstown.spring5petclinic.model.Specialty;
import com.crosstown.spring5petclinic.model.Vet;
import com.crosstown.spring5petclinic.services.SpecialtyService;
import com.crosstown.spring5petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 21:32
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
