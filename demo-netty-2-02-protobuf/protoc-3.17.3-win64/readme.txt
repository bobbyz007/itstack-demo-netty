Protocol Buffers - Google's data interchange format
Copyright 2008 Google Inc.
https://developers.google.com/protocol-buffers/

This package contains a precompiled binary version of the protocol buffer
compiler (protoc). This binary is intended for users who want to use Protocol
Buffers in languages other than C++ but do not want to compile protoc
themselves. To install, simply place this binary somewhere in your PATH.

If you intend to use the included well known types then don't forget to
copy the contents of the 'include' directory somewhere as well, for example
into '/usr/local/include/'.

Please refer to our official github site for more installation instructions:
  https://github.com/protocolbuffers/protobuf

编译；
protoc -I=源地址 --java_out=目标地址  源地址/xxx.proto

.\protoc.exe -I=D:\workspace\opensource\itstack-demo-netty\itstack-demo-netty-2-02\src\main\java\org\itstack\demo\netty\proto --java_out=D:\workspace\opensource\itstack-demo-netty\itstack-demo-netty-2-02\src\main\java MsgInfo.proto