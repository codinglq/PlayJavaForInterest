package com.lq.strategy;

/**
 * 设计模式之策略模式 模型类----人 人拥有的属性---年龄－性别－编号－姓名
 * 人拥有的方法---说话－吃饭(不同的人说话是不同的比如普通话，广东话，英语，等)
 * 
 * @author lq
 *
 */
public class StrategyInitial {

	public static void main(String[] args) {
		/**
		 * 这个还不算是一个好的策略模式
		 */
		Person psn1 = new Person(new SayChinease(), new EatChinaFood());
		psn1.eat();
		psn1.say();

		/**
		 * 写一个；类，去继承person类，这样才是好点的方法 因为这样的客户代码就不用改变了，直接能实现不同的功能.
		 */
		CommonPerson chinaPerson = new CommonPerson();
		chinaPerson.eat();
		chinaPerson.say();
		/**
		 * 其实我感觉这样的策略模式还是不够好，应该好友更好的，我先写点别的，换换脑子。
		 */
	}
}
