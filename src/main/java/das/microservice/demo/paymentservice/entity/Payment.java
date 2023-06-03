package das.microservice.demo.paymentservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Payments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private String status;
    private String transactionId;
}
