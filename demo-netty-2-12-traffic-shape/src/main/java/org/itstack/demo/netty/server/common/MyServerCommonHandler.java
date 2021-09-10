package org.itstack.demo.netty.server.common;

import io.netty.channel.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈 | 欢迎关注并获取专题&源码
 * Create by fuzhengwei on 2019
 */
public abstract class MyServerCommonHandler extends SimpleChannelInboundHandler<String> {

    protected boolean sentFlag;
    private long priorProgress;

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        sendData(ctx);
    }

    protected abstract void sendData(ChannelHandlerContext ctx);

    protected ChannelProgressivePromise getChannelProgressivePromise(ChannelHandlerContext ctx,
                                                                     Consumer<ChannelProgressiveFuture> completedAction) {
        ChannelProgressivePromise channelProgressivePromise = ctx.newProgressivePromise();
        final long startSeconds = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        channelProgressivePromise.addListener(new ChannelProgressiveFutureListener() {
            @Override
            public void operationProgressed(ChannelProgressiveFuture future, long progress, long total) throws Exception {
                System.out.println(String.format("operation progress: %s, total: %s, priorProgress: %s", progress, total, priorProgress));
                long timeElapsed = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")) - startSeconds;
                long limit = (long) ((progress - priorProgress) / (double) timeElapsed);
                System.out.println("数据发送速率(B/S)：" + limit);
                priorProgress = progress;
            }

            @Override
            public void operationComplete(ChannelProgressiveFuture future) throws Exception {
                sentFlag = false;
                if (future.isSuccess()) {
                    System.out.println("提醒，消息发送成功！ with priorProgress: " + priorProgress);
                    priorProgress = 0;
                    Optional.ofNullable(completedAction).ifPresent(action -> action.accept(future));
                } else {
                    System.out.println("提醒，消息发送失败！");
                    future.cause().printStackTrace();
                }
            }
        });
        return channelProgressivePromise;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("NettyServer接收到消息：" + msg);
    }

}
