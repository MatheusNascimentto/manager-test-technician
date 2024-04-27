package com.manager.user.feign;

import com.manager.user.dto.BoletoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "boleto", url = "http://localhost:8065/boleto")
public interface BoletoFeignClient {

    @GetMapping("/pessoa/{id}")
    ResponseEntity<List<BoletoDTO>> getBoletosPorPessoa(@PathVariable("id") Long id);

}
