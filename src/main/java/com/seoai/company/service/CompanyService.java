package com.seoai.company.service;

import com.seoai.company.common.execption.NotFoundException;
import com.seoai.company.dto.*;
import com.seoai.company.entity.Company;
import com.seoai.company.mapper.CompanyMapper;
import com.seoai.company.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository repo;

    @Transactional
    public CompanyResponse create(CompanyRequest r){
        Company e = CompanyMapper.toEntity(r);
        return CompanyMapper.toResponse(repo.save(e));
    }
    @Transactional(readOnly = true)
    public CompanyResponse findById(Long id){
        Company e = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Company %d not found".formatted(id)));
        return CompanyMapper.toResponse(e);
    }
    @Transactional(readOnly = true)
    public List<CompanyResponse> findAll(){
        return repo.findAll().stream().map(CompanyMapper::toResponse).toList();
    }
    @Transactional
    public CompanyResponse update(Long id, CompanyRequest r){
        Company e = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Company %d not found".formatted(id)));
        CompanyMapper.update(e, r);
        return CompanyMapper.toResponse(repo.save(e));
    }
    @Transactional
    public void delete(Long id){
        if(!repo.existsById(id)) throw new NotFoundException("Company %d not found".formatted(id));
        repo.deleteById(id);
    }
}
