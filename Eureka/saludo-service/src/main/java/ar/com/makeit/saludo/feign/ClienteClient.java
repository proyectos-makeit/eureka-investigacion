package ar.com.makeit.saludo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("clientes-service")
public interface ClienteClient {

    @RequestMapping(method = RequestMethod.GET, value = "/cliente")
    String getSaludo();

}
