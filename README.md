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
