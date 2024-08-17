# 前言
此仓库是我学习SSM整合时所创，参照[尚硅谷SSM整合](https://www.bilibili.com/video/BV1AP411s7D7?p=128)和配套[文档](https://www.wolai.com/m4CDNzUs7vj9Ki2hdxExbT)。**建议先看文档，再听课程**。

基本案例ssm-integration-todolist的前端部分链接：[ssm integration frontend](https://github.com/LordBao666/ssm-integration-frontend)

<br>

# SSM总结

这部分是对之前的Spring，MyBatis，SpringMVC进行整合，所以新知识不多。本课程学习过程中，至少有这些难点：

1. 配置依赖相当麻烦；
2. 配置类相当麻烦；
3. 由于是对之前框架的整合，体量更大，更加不容易发现处问题。



整个SSM的整合步骤和上面难点有相似之处：

1. 配置依赖，数据库，POJO
2. 配置文件和如下配置类
   - `WebMVCConfig`
   - `ServiceJavaConfig`
   - `MapperJavaConfig`
   - `DataSourceJavaConfig`
   - `WebAppInitializer`
3. 撰写核心业务
   - `Controller`
   - `Service`
   - `Mapper`

<br>

# 学习顺序

- 快速入门：ssm-integration-practice
- 基本案例：ssm-integration-todolist
