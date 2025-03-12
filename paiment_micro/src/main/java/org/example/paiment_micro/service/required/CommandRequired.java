package org.example.paiment_micro.service.required;

import org.example.paiment_micro.ws.dto.CommandDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "command-service")
public interface CommandRequired {

    @GetMapping("/api/commande/ref/{ref}")
    CommandDto findCommandeByRef(@PathVariable String ref);

    @PutMapping("/api/commande/ref/{ref}")
    CommandDto update(@PathVariable String ref, @RequestBody CommandDto commandDto);
}
