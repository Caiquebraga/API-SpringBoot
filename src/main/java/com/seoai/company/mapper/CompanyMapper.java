package com.seoai.company.mapper;

import com.seoai.company.dto.*;
import com.seoai.company.entity.Company;

public class CompanyMapper {

    public static Company toEntity(CompanyRequest r){
        return Company.builder().name(r.name()).website(r.website()).build();
    }

    public static CompanyResponse toResponse(Company e) {
        return new CompanyResponse(
                e.getId(),
                e.getName(),
                e.getWebsite(),
                e.getCreateAt()
        );
    }

    public static void update(Company e, CompanyRequest r) {
        e.setName(r.name());
        e.setWebsite(r.website());
    }
}
