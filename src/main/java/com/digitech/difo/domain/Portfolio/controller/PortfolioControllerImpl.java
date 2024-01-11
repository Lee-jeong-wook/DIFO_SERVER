package com.digitech.difo.domain.Portfolio.controller;

import com.digitech.difo.domain.Portfolio.domain.Portfolio;
import com.digitech.difo.domain.Portfolio.dto.PortfolioDTO;
import com.digitech.difo.domain.Portfolio.service.PortfolioService;
import com.digitech.difo.global.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
@RequiredArgsConstructor
public class PortfolioControllerImpl implements PortfolioController {
    private final PortfolioService portfolioService;

    @Override
    public ResponseEntity<SuccessResponse<Portfolio>> createPortfolio(PortfolioDTO.PortfolioBaseDTO portfolioBaseDTO) {
        SuccessResponse<Portfolio> response = this.portfolioService.registerProject(portfolioBaseDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));

        return new ResponseEntity<>(response, headers, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<SuccessResponse<PortfolioDTO.PortfolioBaseDTO>> viewPortfolio(Long portfolioId) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<PortfolioDTO.PortfolioBaseDTO>> updatePortfolio(PortfolioDTO.PortfolioBaseDTO portfolioBaseDTO) {
        return null;
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> deletePortfolio(Long portfolioId) {
        return null;
    }
}