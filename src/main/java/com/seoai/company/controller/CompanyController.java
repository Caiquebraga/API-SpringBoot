package com.seoai.company.controller;

import com.seoai.company.dto.*;
import com.seoai.company.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService service;

    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public CompanyResponse create(@RequestBody @Valid CompanyRequest r){ return service.create(r); }

    @GetMapping("/{id}")
    public CompanyResponse get(@PathVariable Long id){ return service.findById(id); }

    @GetMapping
    public List<CompanyResponse> list(){ return service.findAll(); }

    @PutMapping("/{id}")
    public CompanyResponse update(@PathVariable Long id, @RequestBody @Valid CompanyRequest r){
        return service.update(id, r);
    }

    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){ service.delete(id); }
}
