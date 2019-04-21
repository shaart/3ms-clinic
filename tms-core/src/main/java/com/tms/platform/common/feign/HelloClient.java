package com.tms.platform.common.feign;

import com.tms.platform.common.dto.HelloDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("tms-db")
public interface HelloClient {

  @RequestMapping("/hellobyname/{id}")
  HelloDto getHello(@PathVariable("id") String id);
}
