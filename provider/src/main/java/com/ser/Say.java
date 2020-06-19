package com.ser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="provider")
public interface Say {
    @PostMapping("/get")
    public String get();
}
