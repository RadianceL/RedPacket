package com.example.utils.filter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author eddie
 * @createTime 2018-12-13
 * @description 布隆过滤器过滤不存在的红包请求
 */
@Slf4j
@Component
public class LuckMoneyBloomFilter {

    /**
     * 布隆数组容量
     */
    private static int size = 10000;

    /**
     * 容错指数
     */
    private static double fpp = 0.001;

    /**
     * 试图非法请求不存在订单号的请求数
     */
    private static AtomicInteger count = new AtomicInteger(0);

    private static BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("utf-8")), size, fpp);

    public static void add(String orderId){
        final boolean success = bloomFilter.put(orderId);
        log.info("订单{}:添加状态{}", orderId, success);
    }

    public static boolean contain(String orderId){
        final boolean isContain = bloomFilter.mightContain(orderId);
        final int size = count.getAndIncrement();
        log.info("订单{}: 第{}个非法请求不存在订单", orderId, size);
        return isContain;
    }


}
