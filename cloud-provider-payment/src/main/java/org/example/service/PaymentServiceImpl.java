package org.example.service;

import org.example.dao.PaymentDao;
import org.example.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qpointwang
 * @create 2020/10/20 下午9:57
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
