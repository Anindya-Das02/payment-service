package das.microservice.demo.paymentservice.service;

import das.microservice.demo.paymentservice.entity.Payment;
import das.microservice.demo.paymentservice.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
        log.info("invoked savePayment");
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

}
