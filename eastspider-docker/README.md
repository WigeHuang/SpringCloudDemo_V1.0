# EastSpider #


任务: 扒取数据 <http://data.eastmoney.com/rzrq/> ,  保存进 `postgres` .

目标：

1. Linux生产环境, Ubuntu 18.04
2. crontab 设置每日运行爬虫， 下载当日数据。
3. 如果历史数据不全， 自动补历史数据。
4. 注意抓取速度，不要招致对方服务器升级对抗， 尤其不要被封ip。
5. postgres server 始终运行， 供数据查询。
6. docker-compose 部署运行


开发：

1. Linux开发环境
2. 在develop分支开发。
3. 每日提交代码不低于两次。
4. 具体设计细节，随项目进展, 在 `design.md` 中进行沟通。
5. 设计表的字段。 前两个字段是 `date`, `sym`
6. 股票代码 `sym` 的格式是 `600036.SH`, `000002.SZ`, 最后两个大写字母对应交易所
   名称。
7. 一周内完成。


开始： 2019-07-19
