package com.sangnd.api.appspring.api;

import com.sangnd.api.appspring.model.Company;
import com.sangnd.api.appspring.service.CompanyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class CompanyController {

    static final Logger logger  = LogManager.getLogger(CompanyController.class.getName());

    @Autowired
    private CompanyService companyService;

    // displaying list of all company
    @GetMapping("/companies")
    public List<Company> getAllCompany(){
        return companyService.getAllCompanys();
    }

    // displaying company by id
    @GetMapping("/companies/{id}")
    public Optional<Company> getCompany(@PathVariable Long id){
        return companyService.getCompany(id);
    }

    // inserting company
    @PostMapping("/companies")
    public void addCompany(@RequestBody Company company){
        companyService.addCompany(company);
    }

    //updating company by id
    @PutMapping("/companies/{id}")
    public void updateCompany(@RequestBody Company d, @PathVariable int id){
        companyService.updateCompany(d, id);
    }

    // deleting all company
    @DeleteMapping("/companies")
    public void deleteAllCompanys(){
        companyService.deleteAllCompany();
    }

    // deleting company by id
    @DeleteMapping("companies/{id}")
    public void deleteCompanyByID(@RequestBody Company d, @PathVariable Long id){
        companyService.deleteCompanyByID(id);
    }

    // updating/ patching company by id
    @PatchMapping("companies/{id}")
    public void patchCompanyByID(@RequestBody Company d, @PathVariable Long id) {
        companyService.patchCompany(d, id);
    }
}