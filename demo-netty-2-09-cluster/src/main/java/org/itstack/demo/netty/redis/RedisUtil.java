package org.itstack.demo.netty.redis;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.netty.domain.UserChannelInfo;
import org.itstack.demo.netty.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈  ｛关注获取学习源码｝
 * Create by fuzhengwei on 2019
 */
@Service("redisUtil")
public class RedisUtil {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void pushObj(UserChannelInfo userChannelInfo) {
        redisTemplate.opsForHash().put(Constant.REDIS_CHANNELS_KEY, userChannelInfo.getChannelId(), JSON.toJSONString(userChannelInfo));
    }

    public List<UserChannelInfo> popList() {
        List<Object> values = redisTemplate.opsForHash().values(Constant.REDIS_CHANNELS_KEY);
        if (null == values) return new ArrayList<>();
        List<UserChannelInfo> userChannelInfoList = new ArrayList<>();
        for (Object strJson : values) {
            userChannelInfoList.add(JSON.parseObject(strJson.toString(), UserChannelInfo.class));
        }
        return userChannelInfoList;
    }

    public void remove(String channelId) {
        redisTemplate.opsForHash().delete(Constant.REDIS_CHANNELS_KEY, channelId);
    }

    public void clear(){
        redisTemplate.delete(Constant.REDIS_CHANNELS_KEY);
    }

}
