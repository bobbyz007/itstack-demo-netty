package org.itstack.demo.test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.itstack.demo.netty.domain.MsgBody;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈  ｛获取学习源码｝
 * Create by fuzhengwei on 2019
 */
public class ApiTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        System.out.println("protobuf <--> json");

        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId("abD01223");
        msg.setMsgInfo("hi helloworld");
        MsgBody msgBody = msg.build();

        //protobuf转Json 需要引入protobuf-java-util
        String msgBodyStr = JsonFormat.printer().includingDefaultValueFields().print(msgBody);
        System.out.println(msgBodyStr);

        //json转protobuf 需要引入protobuf-java-util
        msg.clear();
        JsonFormat.parser().merge("{\"channelId\": \"HBdhi993\",\"msgInfo\": \"hi bugstack虫洞栈\"}", msg);
        msgBody = msg.build();
        System.out.println("channelId: " + msgBody.getChannelId());
        System.out.println("msgInfo: " + msgBody.getMsgInfo());

    }

}
