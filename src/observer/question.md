+ 需求 用户购买商品成功后，给用户和其上级发送信息，并升级用户和其上级的会员等级

Subject：order
observer ： message 、customer


+ 发送消息可以发送给用户也可以发送给商家，此时是否可以创建一个抽象的member类型，作为发送信息的依赖，然后Customer 和 merchat继承member？ 或者有别的更好的方法？