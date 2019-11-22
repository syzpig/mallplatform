package com.doudouj.dao.pay;

import com.doudouj.dto.pay.PayChannel;
import org.springframework.stereotype.Repository;

@Repository
public interface PayChannelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    PayChannel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}