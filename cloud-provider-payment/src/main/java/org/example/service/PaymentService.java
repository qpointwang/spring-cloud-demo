package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.entities.Payment;

/**
 * @author qpointwang
 * @create 2020/10/20 下午9:55
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
