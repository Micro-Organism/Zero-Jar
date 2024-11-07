# zero-jar-xjar
# 1. 概述
## 1.1. 什么是xjar?
> Spring Boot JAR 安全加密运行工具, 同时支持的原生JAR. 
> <br/>基于对JAR包内资源的加密以及拓展ClassLoader来构建的一套程序加密启动, 动态解密运行的方案, 避免源码泄露以及反编译.

## 1.2. 功能特性
> 1. 无代码侵入, 只需要把编译好的JAR包通过工具加密即可. 
> 2. 完全内存解密, 降低源码以及字节码泄露或反编译的风险. 
> 3. 支持所有JDK内置加解密算法. 
> 4. 可选择需要加解密的字节码或其他资源文件. 
> 5. 支持Maven插件, 加密更加便捷. 
> 6. 动态生成Go启动器, 保护密码不泄露.

# 2. 环境
## 2.1. 环境准备
```shell

# mac更新brew，并安装go
git -C /usr/local/Homebrew/Library/Taps/homebrew/homebrew-core fetch --unshallow
git -C /usr/local/Homebrew/Library/Taps/homebrew/homebrew-cask fetch --unshallow

# 更新
brew update
# 安装go
brew install go

# 检查go版本
go version
```

# 3. 使用

# 4. 其他

# 5. 参考

