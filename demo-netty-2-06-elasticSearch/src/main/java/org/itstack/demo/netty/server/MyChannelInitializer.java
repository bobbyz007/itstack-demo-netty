package org.itstack.demo.netty.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import org.itstack.demo.netty.codec.ObjDecoder;
import org.itstack.demo.netty.codec.ObjEncoder;
import org.itstack.demo.netty.domain.TransportProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.Charset;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈  ｛获取学习源码｝
 * Create by fuzhengwei on 2019
 */
@Service("myChannelInitializer")
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Resource
    private MyServerHandler myServerHandler;

    @Override
    protected void initChannel(SocketChannel channel) {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(TransportProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(TransportProtocol.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(myServerHandler);
    }

}
