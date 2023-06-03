package das.microservice.demo.paymentservice.controller;

import das.microservice.demo.paymentservice.entity.Payment;
import das.microservice.demo.paymentservice.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<?> index(){
        log.info("invoked PaymentController.index");
        return ResponseEntity.ok(Map.of("message","payment service up"));
    }


    @PostMapping("/pay")
    @ResponseBody
    public Payment doPayment(RequestEntity<Payment> paymentRequestEntity){
        log.info("starting payment");
        Payment payment = paymentRequestEntity.getBody();
        return paymentService.savePayment(payment);
    }

}
