package com.sangnd.api.appspring.service;

import com.sangnd.api.appspring.model.Company;
import com.sangnd.api.appspring.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    // fetching all company
    public List<Company> getAllCompanys(){
        List<Company> comps = (List<Company>)companyRepository.findAll();
        return comps;
    }

    // fetching company by id
    public Optional<Company> getCompany(Long id){
        return companyRepository.findById(id);
    }

    // inserting company
    public void addCompany(Company d) {
        companyRepository.save(d);
    }

    // updating company by id
    public void updateCompany(Company d, int id){
        if(id == d.getCompanyID()) {
            companyRepository.save(d);
        }
    }

    // deleting all companys
    public void deleteAllCompany(){
        companyRepository.deleteAll();
    }

    // deleting company by id
    public void deleteCompanyByID(Long id){
        companyRepository.deleteById(id);
    }

    //patching/updating company by id
    public void patchCompany(Company d, Long id) {
        if(id == d.getCompanyID()) {
            companyRepository.save(d);
        }
    }
}