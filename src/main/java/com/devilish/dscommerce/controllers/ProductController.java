package com.devilish.dscommerce.controllers;

import com.devilish.dscommerce.dto.CustomError;
import com.devilish.dscommerce.dto.ProductDTO;
import com.devilish.dscommerce.services.ProductService;
import com.devilish.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.Instant;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}" )
    public ResponseEntity <ProductDTO> findById(@PathVariable Long id){
            ProductDTO dto = service.findById(id);
            return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity <Page<ProductDTO>> findAll(Pageable pageable){
        Page<ProductDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity <ProductDTO> insert(@Valid @RequestBody ProductDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}" )
    public ResponseEntity <ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO dto){
       try {
           dto = service.update(id, dto);
           return ResponseEntity.ok(dto);
       }
       catch (EntityNotFoundException e){
           throw new ResourceNotFoundException("Recurso não encontrado!");
       }
    }

    @DeleteMapping(value = "/{id}" )
    public ResponseEntity <Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
