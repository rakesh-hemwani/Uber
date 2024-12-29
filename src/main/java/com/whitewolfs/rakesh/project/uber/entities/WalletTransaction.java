package com.whitewolfs.rakesh.project.uber.entities;

import com.whitewolfs.rakesh.project.uber.entities.enums.TransactionMethod;
import com.whitewolfs.rakesh.project.uber.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private String transacionId;

    @CreationTimestamp
    private LocalDateTime timeStamp;

    @ManyToOne
    private Wallet wallet;
}
