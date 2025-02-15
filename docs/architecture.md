# 股票市场监控 AI Agent 架构文档

## 1. 架构概述

本项目采用领域驱动设计（DDD）架构，将系统分为以下几层：

### 1.1 领域层（Domain Layer）
- 包含核心业务逻辑和领域模型
- 定义领域事件和领域服务
- 包含仓储接口定义

### 1.2 应用层（Application Layer）
- 协调领域对象和领域服务
- 处理事务边界
- 转换 DTO 和领域对象

### 1.3 基础设施层（Infrastructure Layer）
- 提供技术实现细节
- 实现仓储接口
- 处理外部系统集成

### 1.4 接口层（Interface Layer）
- 提供 API 接口
- 处理用户请求
- 数据格式转换

## 2. 核心领域模型

### 2.1 聚合根
- Stock（股票）
- Analysis（分析结果）
- Alert（告警）

### 2.2 值对象
- StockPrice（股票价格）
- TradingVolume（交易量）
- TimeRange（时间范围）

### 2.3 领域事件
- StockPriceChanged
- AlertTriggered
- AnalysisCompleted

## 3. 技术栈

- Spring Boot 3.x
- PostgreSQL
- Redis
- Kafka
- WebSocket 