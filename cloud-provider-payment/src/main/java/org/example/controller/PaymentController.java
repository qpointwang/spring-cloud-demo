package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entities.CommonResult;
import org.example.entities.Payment;
import org.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qpointwang
 * @create 2020/10/20 下午10:03
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        // 注意:mapper接口返回值依然是成功插入的记录数，但不同的是主键值已经赋值到领域模型实体的id中了
        log.info("插入结果: " + payment.getId());
        if (result > 0) {
            return new CommonResult(200, "插入成功", payment.getId());
        } else {
            return new CommonResult(444, "插入失败", payment.getId());
        }
    }

    @GetMapping(value = "payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果: " + result.toString());
        return new CommonResult(200, "查询成功", result);
    }
}
