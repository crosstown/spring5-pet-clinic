package com.crosstown.spring5petclinic.services;

import com.crosstown.spring5petclinic.model.Specialty;
import com.crosstown.spring5petclinic.repositories.SpecialtyRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author developer
 * @date 2018-12-04
 * @time 01:25
 */
@Service
@Profile("springdatajpa")
public class SpecialtySDJpa implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpa(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
