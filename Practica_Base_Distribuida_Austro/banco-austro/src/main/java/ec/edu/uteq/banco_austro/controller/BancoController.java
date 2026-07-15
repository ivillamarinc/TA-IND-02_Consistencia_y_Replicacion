package ec.edu.uteq.banco_austro.controller;

import java.util.List;
import java.util.Map;

import ec.edu.uteq.banco_austro.service.ConsultaDistribuidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/banco")
@RestController
public class BancoController {

    private final ConsultaDistribuidaService service;

    public BancoController(ConsultaDistribuidaService service) {
        this.service = service;
    }

    @GetMapping("/saldo/{numero}")
    public Map<String, Object> consultarSaldo(@PathVariable String numero) {
        return service.consultarSaldo(numero);
    }

    @GetMapping("/clientes")
    public List<Map<String, Object>> listarClientes() {
        return service.listarTodosLosClientes();
    }
}