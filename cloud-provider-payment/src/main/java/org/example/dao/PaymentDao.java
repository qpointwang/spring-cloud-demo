package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entities.Payment;

/**
 * @author qpointwang
 * @create 2020/10/20 下午9:19
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
