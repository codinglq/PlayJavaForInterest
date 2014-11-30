#用玩玩java的设计模式##
------------------



> ###<font color="red">絮叨：</font>###
>
<font color="black">自从大二学过一点java并且考完试之后就没怎么碰过java，出了写的那个《外网查分》，哈哈，我承认我自己调入了C的坑里面，并且爬不出来了。
</font>

####<font color="blue">设计模式</font>####

><font color="black">多一天，爱一点！</font>

********************

###单例模式###
><font color="black">单例模式，单例模式平时比较常用，像数据库连接池，游戏中的大BOSS，什么大家都喜欢用的工具类啦～</font>

>1.		<font color="black">懒汉模式和饿汉模式</font>
><font color="black">由于是单例模式，所以必须在应用这个模式的时候要保证对象所属的类有且只有一个实例存在，说白了就是好像一个全局的变量，但是这个变量只能有一个。
懒汉模式就是：我很懒，还不到时候，不要，不要，一旦饿了，就加载，拖延症的表现～在使用这个全局实例的时候再生成这个实例。
饿汉模式就是说：好饿，好饿，我要，快点给我！所以这个全局实例在类被加载的时候就搞定！
</font>

####单例模式线程安全线程安全:####
><font color="red">关于线程安全是不能不说的，但是我还没研究java多线程，暂时先放着！</font>

###策略模式###

><font color="black">策略模式，说白了就是好比一个油滑的人，会说好听的，在不同场合说不同的话。那么，这个人就可以抽象成一个类，人说话就可以抽象成类的方法，如何能够让这个人在不同的场景下说出不同的话呢？这个多简单，只要让他平时多准备一些说辞，记在心中，在不同的情况下，念出心中对应场景的说辞不就得了。</font><font color="red">由此可见，不同场景的预先准备的说辞不就是对这个类所拥有的方法但是不同表现的一种封装吗？</font><font color="black">使用继承和多台，加上接口去设计这个方法，就能多出在不同场景说出不同话的能力，这就是策略模式。</font>

#####对OO理解较浅，后续还要补充，仅当Play#####
20141127


###工厂模式###

*********

><font color="black">简单工厂——自己的理解:如果自己去拼一台电脑，需要自己去买内存，运算器，显卡，机箱，硬盘.....等，而且还要对这些零件进行拼装，弄不好还会出错，千辛万苦之后才能拼好一台电脑，这就好比是自己去构建一个复杂的对象，有时候，有些对象的建立并不是单纯的new运算一下那么简单的，所以就衍生出了工厂模式，我把电脑的配置告诉某个做电脑的工厂，工厂按照这些参数去运用工厂内的设备拼装这台电脑，毕竟人家工厂比较专业嘛！这样对于客户来说，创建一个所谓的复杂对象的成本就低了，更方便去编写客户程序。将拼装电脑的具体细节封装起来！</font>

<br>
><font color="black">工厂方法——简单工厂通过判断用户输入的想要的产品型号，来组装好产品，并且送到用户手中，里面的时使用switch或者if这样的判断来实现通过型号来判断生产的东西，这样的话，要是工厂不能提供给用户想要的了，工厂想扩充一下自己的生产更多想好的电脑，就要在工厂里面增加代码，这样很违背面向对象的设计原则，所以呢，出现了救世主，工厂方法，用户自己来创建生产自己想要的电脑的工厂，工厂呢，去实现一个工厂接口，工厂接口里面的方法就是制造电脑，不同的工厂实现不同的组装电脑，这样就做到了不用去更改原有的代码，从而增加了系统的功能。</font>

<br>
###絮叨##

><font color="black">工厂模式还有其他的设计模式都是前人的经验，对于代码复用，怎样更方便的编写程序的经验，所以我们要取其精华，并不是说所有的程序都要遵守这些“经验”。<font>


20141128


###MYSQL数据库连接JDBC版本###

>#####<font color="black">简单的MYSQL连接</font>#####

><font color="black">简单的数据库链接的步骤JDBC</font>
>1.	<font color="red">加载驱动程序Class.forName(数据库驱动名称)</font><font color="black">不过经过我的测试，这句程序注释掉也不会影响程序运行，因为学过反射，我知道Class.forName(名称)是为了获取一个类类型，是有返回值的，难道在数据库连接时候直接将这个类类型加载到了JVM中的某个神秘的地方了吗？</font>
>2.	<font color="red">准备连接数据库的URL（统一资源定位符）</font><font color="black">准备一个String类型的url吧！格式：协议：子协议：数据源标识。举例："jdbc:mysql://127.0.0.1:3306/DataBaseName".jdbc就是协议，mysql标识着连接的是mysql数据库，127.0.0.1就是指数据库安装服务器的ipv4地址，3306是mysql的默认端口，DataBaseName就是你的数据库的名字。其实这个URl中可以夹带很多的信息，比如编码格式什么的，这里使用默认，（经过几个小时的google我将自己mysql的中文乱码问题搞定了，其实就是编码改成utf-8就行！）</font>
>3.	<font color="red">获取连接对象</font><font color="black">谁说程序员没有对象的，程序员最不缺少对象了，他们想有多少个就有多少个！好吧，我来个数据库连接对象！使用DriverManger.getConnection(url，数据库用户名，数据库密码)获取一个对象！数据库用户名就是你要用什么身份连接这个数据库，密码我就不用多少了。返回的类型是Connection的对象。</font>
>4.	<font color="red">创建一个Statement</font><font color="black">这个Statement是用来搞定一些数据库操作的，执行插入语句，或者升级一组数据什么的，或者是查询一个一组SQL语句的结果啦，总之，没有这个statement就没法完成数据库的操作，我英语不好，还特意查了一下statement的汉语解释——声明，陈述，叙述，报表，清单。这些意思，估计是当做一个报表清单更好一些，我们通过上面创建的数据库连接获取一个报表，使用connention类型对象的.createStatement()返回一个对象是Statement类型的。当然了，这个还有别的类型的statement类型，我就不赘述了。</font>
>5.	<font color="red">执行sql语句</font><font color="black">连接数据库不就是为了执行sql语句的嘛！，使用statement类型对象的方法——1：executeQuery。2：executeUpdate。3：execute.这三种方法分别对应有查询结果的查询语句，无查询结果的语句，多个结果，或者复杂的语句，什么是有结果的查询？就是这样select * form usr;就是一个有查询结果的语句，对应的返回值是ResultSet类型的，表示这是一个结果集，无查询结果的是什么呢？这样的：insert into user_table (name,id,pwd) values (lq,1,123456)大概就是这一类语句，这样语句的执行结果是这条语句完成后，所影响的记录个数。</font>
>6.	<font color="red">结果集的使用</font><font color="black">不多说，一段小程序就明白了！</font>


>```java
		//是数据库连接，也就是Connection类型的对象。
		ResultSet res = db.queryDatabase("select * from the_table");//这个是我写的数据库连接池封装的数据库连接类
		try {
		int col = res.getMetaData().getColumnCount() + 1;
        //下面是循环输出查询结果的程序片段
		while (res.next()) {
        //注意，结果集中的列下表是从1开始的，这让我幻想写这个驱动的人是不是程序员～！
		for (int i = 1; i < col; i++) {
		System.out.println(res.getString(i) + "\t");
		}
		System.out.println();
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		db.closeDataBaseConnection();
```
><font color="blue">最后:</font>	<font color="red">关闭相关连接，做好善后工作</font><font color="black">注意关闭顺序是和打开顺序是相反的，这有点像C++中的构造函数和西沟函数的调用顺序啊！1：先关闭ResultSet类型的结果集。2：关闭表单，也就是Statement类型的st。3：最后关闭数据库连接Connection类型的对象，记得吗？</font>

####带着批判的思想看自己的代码####
><font color="black">写了一个数据库连接的类，里面封装了所有的数据库的属性和配置信息，还封装了查询方法.
</font>
>1.	<font color="red">优点：实现了封装，用户代码不必再闹心数据库连接的具体实现了，只要通过构造函数创造出我的这个类的对象就可以玩数据库了！妈妈再也不用担心我的数据库连接不会了。</font>
>2.	<font color="blue">缺点：这个类的可扩展性简直弱到爆炸啊！你要是向加一个什么方法，比如防止sql注入的检测方法，那么我们就要更新这个类的代码，简直无法直视这样的代码，我写的是什么啊！</font>
>3.	<font color="black">需要好好设计一下。使劲的抽象数据库连接，得到所有数据库连接都要有的方法，这样就可以把这个抽象出来成为一个接口interface然后抽象数据库连接应该有的属性，抽象成为一个抽象类来表示，abstract class这个类中要包含这个接口，因为抽象类中只包含数据库的属性，而所有的方法都放在了接口中，所以数据库连接的抽象类要包含这个接口，换句话说就是让这个接口的对象变成这个类的一个属性。在这之后，要想创建数据库连接类，就去extends这个抽象类，再用一个类去实现数据库操作的接口，这个具体的数据库实现类的构造函数就要注入接口的具体实现类，从而实现具体的数据库操作，这多亏多台的性质。OMG！</font>
>4.	<font color="black">使用这个具体的数据库连接类，就可以调用其中统一的方法做数据库的操作，在客户代码不变的情况下，我们想要扩展数据库的操作，只需添加新的接口的实现，并且在新的数据库连接类中注入新的实现接口的类就可以扩展操作，从而不必更改客户代码。</font>

>#####<font color="red">这就是一种策略模式</font>#####


><font color="black">使用策略模式+单例+工厂能够制造出可扩展性良好的数据库连接池。</font>
>1.	<font color="blue">抽象：将数据库连接池进行抽象成为一个工厂，得到要制造的东西最本质的东西，比如数据库的种类，mysql，oracle等。用户，密码。对数据库连接进行抽象，得带我们的工厂想要生产什么样的产品，就是说产品应该具有什么样的功能，什么样的配置。我们生产的是一个数据库连接，那么我们就需要这个连接拥有执行查询语句的功能，就需要有关闭的功能，就需要有获取数据库名称的功能，就需要有查看这个连接状态的功能等。这时候就需要将数据库连接这个产品的功能封装成一个数据库连接功能的一个接口。</font>
>2.	<font color="green">封装：将这些属性封装成为数据库连接池的类，一个抽象类，将操作数据库的方法封装成一个接口，其中规定了该执行什么样的操作。我们要生产数据库连接，就要有生产的功能，我们需要指导数据库的类型和基本的配置，来指导我们的工厂进行生产。  将连接封装成一个抽象类，里面是不是需要有操作这个连接的方法呢？这就需要一个数据库连接方法接口作为这个数据库连接类的属性，通过策略模式的代码注入，可以方便的扩展功能。</font>
>3.	<font color="black">这些只是一点点的设想，具体的抽象程度还要看自己想要什么样的工厂，什么样的产拼。</font>

>###<font color="red">个人感想</font>###
><font color="black">一直以来我都这么认为：不经过实战去谈论的经验都是赵括，不经过实战检验的理论都是不可相信的！</font>
><font color="red">So I would like checkout!（中国英语）</font>
20141129

####java中的参数传递####

><font color="red">在玩java多线程的时候，自己想要用一个线程接收一个对象，然后去对这个对象进行操作。我测试时候传入的是Integer类型的对象，简单的代码如下：</font>

<br>


```java

/**
 * java多线程
 * 
 * @author lq
 *
 */
public class ThreadInitial {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("a");
		ThreadInitial.cat(sb);
		// 输出sb
		System.out.println(sb);

		Integer value = new Integer(10);
		Integer temp = value;
		System.out.println(value == temp);
		System.out.println("hash" + value.hashCode());
		value = 10;
		System.out.println("hash" + value.hashCode());

		System.out.println(value == temp);
		System.out.println(value.equals(temp));

		ThreadInitial.add(value);
		System.out.println(value);

		String str = new String("a");
		ThreadInitial.cat(str);
		System.out.println(str);
	}

	public static void cat(String theStr) {
		theStr = new String("b");
	}

	public static void add(Integer theValue) {
		System.out.println(theValue);
		theValue = 100;
	}

	public static void cat(StringBuffer theSb) {
		theSb.append("b");
	}
}
```
><font color="black">运行时候发现，如果将一个Integer类型的对象传递到一个函数中，并且对其进行修改，不会对主函数中的对象产生影响。</font>


>1.	<font color="black">疑惑产生：我们都知道，java中的参数传递有两种方式：1，值传递。2：引用传递（按照我的理解就是传递对象的指针）。</font>
>2.	<font color="black">解释:值传递就是传递一些基本类型的参数，比如int，char，double，这些基本类型被当做参数时候，传递的是本身的值。      引用传递：引用传递就是说某个类的对象作为参数时候，在函数调用的时候传递的是这个类的对象的地址，所以，通过这个传递方式就可以在别的函数中根据地址去更改这个对象的属性。但是为什么我的测试用的Integer类型的对象作为参数传入函数中，却没有正确的更改主调函数中的值呢？</font>
>3.	<font color="black">猜想：在这测试之前，我只知道string类型的对象是不可更改的，每次赋值都是jvm新的开辟的内存，然后指向这个内存区域，如果将string类型的对象赋值成为新的串，那么就是说这个string变量的指向的内存已经改变了，这个可以使用==操作符来判断，所以推测，Integer类型的对象也是不可更改的，每次操作这个对象的时候也是jvm新的开辟出一块内存，并且在这之上做的更改，也就是说原来的变量指向了新的地址，原来的地址若是没有引用了，就被GC给KO了！</font>
>4.	<font color="red">瞎想：在我看来，java中漫天的指针乱飞，每次new时候都是得到的是一个指针，和c语言不一样的是这个指针使用的".操作符"，而且不用解引。</font>
