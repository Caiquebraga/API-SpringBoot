package com.seoai.company.dto;

import java.time.Instant;
public record CompanyResponse(Long id, String name, String website, Instant createdAt) {}
