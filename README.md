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

####简单的线程同步####

><font color="black">简单的生产者消费者问题:生产者消费者共用一块缓冲区，生产者生产产品，放入缓冲区，消费者在缓冲区中取走物品。</font><font color="blue">白话版：在肯德基排队买吃的，排队的人群是消费者，柜台上的忙碌的服务生是生产者，缓冲区就是柜台，每次服务生将好吃的放到柜台上，客人给万钱就将食物端走，就是在缓冲区中取走物品。</font>
><font color="black">线程同步问题就是解决多个线程共享一个资源时候的情况，如果在肯德基买东西，大家都不排队，那么如果只有一个顾客还好说，若是有多个顾客，都争抢食物，那么就会发生混乱，比如在一段程序中：</font>

```java
	//纯正伪代码，一个多线程程序。
	int foo = 100;
    Thread1:(foo+=10 for 10->times);
    Thread2:(foo-=10 for 10->times);
    
    //等待线程执行
    Thread1.join();
    Thread2.join();
```


><font color="black">这段代码我们都能理解，看似没毛病，不就是一个执行加操作，一个执行减操作吗？But....
这是多线程环境下啊，正常若果Thread1执行完之后继续执行Thread2真的不会有什么毛病，但是如果时间片（脑部操作系统）轮转到for中就结束了，那么线程也就是说Thread1并没有执行加操作，这时候Thread2开始执行，Thread2开始读取缓冲区中的数据，这时候数据还是Thread1未曾加工过的，Thread2在这时候执行了减操作，Thread2执行完毕，时间片轮转到Thread1中，线程的现场恢复，Thread1中的缓冲区数据还是Thread1读取时候的数据，但是线程这个数据已经被减了，可是Thread1并不知道，Thread1将执行加操作，然偶写入缓冲区，结果怎样？出错了被，中间数据未同步。
</font>

><font color="red">So 我们需要线程的同步，请玩单线程的童鞋洗洗睡，我们开始。</font><font color="black">怎么解决上述问题呢？ 笨想想，我们的肯德基买东西的经验，为了避免混论，大家正常买食物的机会，肯德基在柜台前面放置了一个让顾客排队的围栏，这时候大家要买东西就需要排队，讲究一个先来后到，一个一个进行，这就是线程同步的一个表现，使用缓冲区也是这个道理，java中提供了锁机制，每个对象，都有一个锁，对比买食物的场景就是每个人排队到了他，就会获取这个所，有了这个锁，就能操作缓冲区，或者买食物，交易进行完之后需要将这个锁送给下一个人，让他继续购买，进行缓冲区的读写。</font>

#####对比C语言#####

><font color="black">对比C语言来说，java提供的锁机制简直用起来太easy了，有木有！不要一两百，不要四五十，只要一个关键字：synchronized学过C再玩这个简直就想说，我靠。当然了，C语言中，或者说操作系统提供的线程或者进程同步机制不知这一种，还有信号量和条件变量什么的。使用系统提供的更原始的机制也许能够让代码发挥出更厉害的龟派气功！</font>

><font color="black">当然了，不是同语言或者提供的机制我们也能解决线程进程同步问题。</font>
><font color="red">线程进程同步问题都是归结于某些操作是否具有原子性，这是我的个人理解，要是某个操作具有原子性，那么这个操作要么执行完成，要么不去执行，不会发生执行一半后被切换等待，这样也可以做到线程的同步，使用锁机制只是使得原子操作的范围扩大到我们自己的设定，我们使用synchronized之后，就是告诉编译器，这段代码要么执行完，要么不去执行而已。所以，这样使得原子操作的范围变大，也带来了效率上的损失，总感觉有得情况下使用锁机制，会使得程序慢很多，比如我们要统计某鹅厂的实时在线人数，如果共享一个计数器，每次操作都要等待，想象一下每秒钟上下线有多少人，我们要等待多久啊！</font>
><font color="black">解决一下：</font>
>1.	<font color="black">装着胆子设想一下解决办法，我们尽量在能不用锁的时候就不用锁，也就是说，如果这个线程同步问题能够使用某个互斥变量搞定，我们就不用锁机制。</font>
>2.	<font color="blue">用锁机制的时候，尽量的找到重点的保护代码，也就是找到最小的需要院子操作的代码段，将代码包起来，而不是随便锁上一个函数或者说是方法。</font>
>3.	<font color="green">使用缓冲区副本，虽然这个想法并不是到处都能用的，但还是可以解决锁的等待问题，复制一些缓冲区副本，使用这些副本，设定同步条件，条件到达之后就同步缓冲区。</font>

20141201

####关于这真学习java的一点感悟####
><font color="black">学习java也差不多有一周了，在网上一直在胡乱学习，各种博客，视频，哈哈，感谢那些无私的geek们。</font>
>1.	<font color="black">Java中谁说没有指针的？java每次new出来的东西后，不久返回给用户一个指针吗？只不过：</font><font color="red">Java中没有提供解引(*)操作！</font><font color="black">要是Java中有解引操作，那么就一位置我们可以直接操作内存，对内存进行读写，这样不就是Java了。指针漫天飞给你看，但是又不让你玩，哈。把指针不给程序员也挺好的，反正大部分的活都交给GC去做了，让我们的工作量减轻点，注意这里只是减轻点，虽然GC使用有向图的方式去回收垃圾，但是，如果一味的new对象，然后这些对象也有别的变量指向这，那么这就是Java中的内存泄露了。</font>

```java
	//简而言之，就是申请了空间，装载了对象，但是这些对象是没用的，也有root到这些对象的路径，所以不会被GC收走，这就内存泄露了。
	List ls = new ArrayList();
    while(true)
    {
    	ls.add(new Integer(10));
    }
```

>2.	<font color="black">Java中到处都是轮子，有牛曰到，不要重复发明轮子，可是我却对各种轮子的内部好奇之极，总想着没事造个轮子常常问道，但是有些不用本地方法臣妾办不到啊。。。。Java中提供的这些轮子肯定是一件好事，这样使编程人员解放出来了，可以去用更多的精力去思考业务逻辑，而不是在某些数据结构和算法上花费太多的时间，因为人家Java都给你封装好了，自己随时调着用就是了，还有就是一套完整的异常处理机制，哈哈，貌似现在所有的高级语言中都有异常处理，但是对于初学者来书，这异常处理无疑是一个难点，就好比是轮子中的轮子，Python中也是这样，这样对有经验的程序员来说可以更快的定位错误发生的地方，而c语言呢？玩Java失去了玩C时候可以操作内存的痛快的感觉，可是换来的是开发效率的提升，记得以前写C的时候，好多次因为一个指针忘记free导致整个程序dump，调试起来用系统监视器看着内存，cppcheck静态检查者代码才搞定，多么痛的领悟，不过被虐的多了，也就舒服了。Java众多框架让我们更加的能够快速的开发企业级的程序，呵呵，什么SSH，只知其名啊，用这些框架有时候是很爽的，虽然Java我没怎么用过，但是举一个Python的例子就知道了，用Python写爬虫有Scrapy框架，用C写......也有框架.....在这不谈效率的问题，就说这个跨平台，我用python搞在win下和搞在linux下是一样的，没差，所谓的移植也许就是几个环境变量路径啥的，但是要是用c搞，，，，移植。。。。。你用vs在win下玩完想去linux下发扬光大，那么，你得写两套代码，系统API直接就是让人痛苦的地方。然后gcc链接库使劲玩。爱，不说了，C的效率让我爱！</font>

>3.	<font color="black">面向对象是个好东西，面向对象大法好！我的理解还太浅，今日不语。<font>

以上纯属扯淡by20141202

####王强&学习####
><font color="black">不知道多久之前看了好友推荐的王强在北大的演讲《读书毁了我》，一开始被这个名字吓了一跳，读书将人整完蛋了？怎么还能毁了呢？抱着巴拉巴拉的心态去看这个视频，结果出乎意料，毁字的多义使用，这个视频不过多的赘述，只说其中的干货。</font>
>1.	<font color="black">读书是个好习惯，北大的大部分人为什么厉害，因为读书的欲望超过了性，比起现在普遍的大学生活，大学生都在想方设法的解决自己的生理需求，但是在王强上学的年代的北大，读书的欲望是大过找女朋友的欲望的，这样就造就了一品中国有名的企业家，比如李彦宏谁的，所以总结，读书是个好事，坚持才是王道。</font>
>2.	<font color="black">爱因斯坦说过吧，(爱迪生才对)成功是百分之九十九的汗水加上百分之一的天才——但是这百分之一的天才是很少数人才拥有的（概率论中的正态分布的最右边，就是天才吧（横轴表示智商）），所以对于大部分的人来书，成功是通过百分之九十九的汗水获得的，我们大部分都是普通人，付出汗水也不一定收获成功，但是着汗水也要付出的值得，比如王强说的，读书就要读经典的书，要不然他怎么能要去北大读中文结果读了英语，留学学了计算机然后去了贝尔实验室？因为王强掌握方法，这里的方法据他说，就是去读经典的书籍，因为经典，所以没有被历史淘汰，因为经典，所以积累了人类的智慧，读书就要读经典的。</font>
>3.	<font color="black">从基础做起，什么叫基础，每个人的所掌握的知识量是不一样的，接收能力也是不一样的，所以，花上一段时间让自己思考明白什么才是适合自己的开始，才是好的开始，好高骛远，永远不是什么好的品质。<font>

20141203絮叨～

####使用cas操作能够获得比锁机制更快的线程访问速度，但是不是那么容易编写程序####
20141206使用CAS有感。