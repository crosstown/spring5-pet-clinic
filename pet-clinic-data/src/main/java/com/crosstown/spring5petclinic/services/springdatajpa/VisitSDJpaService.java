package com.crosstown.spring5petclinic.services.springdatajpa;

import com.crosstown.spring5petclinic.model.Specialty;
import com.crosstown.spring5petclinic.model.Visit;
import com.crosstown.spring5petclinic.repositories.SpecialtyRepository;
import com.crosstown.spring5petclinic.repositories.VisitRepository;
import com.crosstown.spring5petclinic.services.SpecialtyService;
import com.crosstown.spring5petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author developer
 * @date 2018-12-04
 * @time 02:11
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }

    /**
     * @author developer
     * @date 2018-12-04
     * @time 01:25
     */
    @Service
    @Profile("springdatajpa")
    public static class SpecialtySDJpa implements SpecialtyService {

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
}
