# JAVASE

### 邏輯運算符號 &&  &  || |  ? :

> 對算式進行Boolean的判斷 最後回傳true or false

> ex   a > 1  &&  b  <  1             

> && 與  || 相同  如果在 a > 1 時就確定結果為true or false 
>
> 則不執行以下的 b < 1

> & 與 |  則是無論 a > 1 的結果如何  都一定會執行 b < 1 的判斷

> x = a < 1 ? b : c   --> 如果a < 1為true 則x = b  否則x = c



### 註釋

> 在方法上方加入作者版本等等資訊

> ###### @author 作者

> ###### @version 版本

> ###### @since 最早使用的JDK版本

> ###### @param 參數名

> ###### @return 返回值狀況

> ###### @throws 拋出異常

```
/**
* @author java
* @version 1.0
* @since  1.0
*/
```



### JAVA檔生成html

> 開啟檔案目錄的cmd位置 輸入

> **javadoc** 參數 文件名

```
javadoc -encoding UTF-8 -charset UTF-8 檔案名
```

> **javadoc** 為java生成文件檔

> **-encoding UTF-8 -charset UTF-8**  使編碼為UTF-8 且讓字元集為 UTF-8



### CMD 編譯

> 在檔案的路徑使用 javac 檔案名稱 進行java編譯

### Scanner

> 需要在程式上方引入 **import java.util.Scanner**

> 建立一個Scanner的項目接收輸入 
>
> **Scanner scanner = new Scanner(System.in)**

> 由上述宣告的輸入表示為 scanner 
>
> 後續銜接 **scanner.nextLine() **之類的作法得到String

> next() 使用Scanner接收的輸入不可帶有space
>
> 當**next()** 接收到space或enter時 則會停止接收輸入

> **nextLine()** 只有遇到enter才會停止接收輸入 可以接收帶有space的輸入

> **.hasNext() ** 判斷當前的資料流裡面有沒有資料 有的話回傳true 否則回傳 false

```
sc.nextInt()   			接收integer輸入
sc.nextFloat() 			接收float輸入
sc.nextDouble() 		接收double輸入
sc.next()				接收string輸入
sc.nextByte()			接收byte輸入
sc.nextLong()			接收long輸入
sc.nextShort()			接收short輸入
sc.next().charAt(0) 	接收char輸入
```

> 最後不再使用Scanner時 須關閉Scanner   -->  **Scanner.close()**



### 反編譯

> 由IDEA的project找到compiler output的位置 從裡面找出檔案名的.class檔
>
> 將.class複製到同.java檔案名的位置 再從IDEA執行即可看到反編譯的結果



### 增強型for循環

```
for(變數類型 for變數名稱(a): 已存在的變數名稱(須與宣告的類型相同)){
	sum += a; // a會根據外部的變數名稱 如陣列 依序將每一個陣列值輸入
}
```

> 上述存在的變數名稱 如果為陣列的話 最終會得到的sum為所有陣列值的總和



### 可變參數

> 方法宣告後傳入的參數中  由原本的int 改為 int... 
>
> 用於不確定會傳入參數的數量時
>
> 可變參數僅能使用在參數的最後面

```
Classname.argument(1,2,3,4,5);
public void argument(int... i){
	System.out.println(i[0]);
}
```

> 傳入的i可以使用增強型的for進行數值的列印

```
Classname.argument(1,2,3,4,5);
public void argument(int... i){
        for(int a:i)
        System.out.println(a);
    }
```

### Static 靜態

> 靜態 : 當程式載入記憶體時,跟著程式一起在記憶中佔有空間

> 被宣告為static的方法 無須建立class的物件即可直接使用**物件名.方法名**使用

```
public class test{
	public static void main(String[] args){
		test.method();
	}
	public static void method(){
		System.out.print("paint method");
	}
}
```

> 如果方法名宣告為static  可以如上直接使用class的名去使用方法



> 如果用於class中, 宣告於class各種變數被定義時
>
> static的用法可以使變數只產生一次 進而改善記憶體使用的效率

```
class classA{
	int a;
	String b;
	static String c = "static";
}
```

> 今後無論使用classA建立了多少個相同的物件 都只會產生一次String c
>
> 以classA建立的所有物件 共同使用的String c 都是一樣的
>
> **只有宣告為static的String c 可以在沒有建立classA物件時 以classA.c的方式呼叫**



### 重載overload

> 與override相比,overload不需要子父類別的繼承 即可使用

> 在一個類別中,方法名字相同,參數不同,返回類型也可以不相同
>
> 但是每個重載的方法傳入的參數都要有所不同

> 從java.lang.String類別中的方法

```
**static String valueOf(boolean b)**
**static String valueOf(char c)**
```

> **主要用於減去方法名稱設計時的困擾**

| 區別     | 重載overload | 重寫override                              |
| -------- | ------------ | ----------------------------------------- |
| 參數列表 | 必須修改     | 一定不能修改                              |
| 返回類型 | 可以修改     | 一定不能修改                              |
| 異常拋出 | 可以修改     | 可以減少或刪除,一定不能拋出新或更廣的異常 |
| 訪問     | 可以修改     | 一定不能做更嚴格的限制                    |



### 類別class

##### public

> 最不嚴謹的宣告方式 公開宣告的變數或方法可以被任意的存取使用

##### protected

> 父類別可以繼承至子類別 子類別也可以直接呼叫父類別的protected類型的變數方法
>
> 但無法由外部進行變數及方法的存取使用

##### private

> 父類別擁有的private變數及方法都無法由子類別繼承
>
> 也無法外部以及子類別的物件進行直接的存取使用



### 建構子 , 繼承extends

##### super() 

> 為子類別呼叫父類別的建構方法
>
> 需要有extends繼承關係才可以使用
>
> 使用super()呼叫父類別的建構方法在子類別建構方法的上方不能加入任何程式碼
>
> 如果實行子類別的建構方法 一般來說會先執行一次父類別且相同於子類別參數的建構方法

> 在子類別中重寫的父類別方法 可以使用super()呼叫父類別的方法

##### this.

> this為呼叫自身類別的變數及方法時使用
>
> 只要建立了類別就可以直接使用
>
> 使用this在無參數的建構方法呼叫有參數的建構方法時 需要放在方法中的最上面

> **super() , this.  兩者不可在同一個建構方法中同時存在**

> 如果建立的有參數的建構子 則會取代預設的無參數建構子 
>
> 需要另外在建立依次無參數的建構子

> 如果父類別建立了有參數的建構方法 則無參數的預設建構子則會被覆蓋
>
> 此時子類別無法只建立無參數的建構子 
>
> 如果想要建立無參數的建構子 必須在此建構子中 呼叫父類別的有參數的建構子

### Override 重寫(複寫)

> override為子類別對父類別允許存取的方法進行重新編寫
>
> 但方法的名稱,回傳值的資料型態,參數型態,數量都必須相同
>
> 訪問權限不能比父類別中被重寫的方法權限低 
>
> ex 父類別為public 子類別就不能為protected

> 聲明為final的方法不能被重寫

> 聲明為static的方法不能被重寫 但可以被再次聲明

> 與overload相比,override需要子父類別的繼承才能使用



#### 為什麼需要override

> 父類別的功能太多,子類別並不一定用得到
>
> 父類別的功能太少,子類別可能需要補足一些功能



#### 加入static靜態 產生的結果

```
public class Main {

  public static void main(String[] args) {

    Animal A = new Dog();
    A.method();
    
    Dog D = new Dog();
    D.method();
  }
}

class Animal {
  public static void method() {
    System.out.println("Animal method");
  }
}
// Dog 繼承 Animal
class Dog extends Animal {
  public static void method(){
    System.out.println("Dog method");
  }
}
```

> 輸出結果

```
Animal method
Dog method
```

> 當方法被宣告為static型態,執行的方法以宣告的類型有關 (左邊)

> 靜態方法是類別的方法 , 非靜態是對象的方法
>
> 有static時, D執行的是Dog類的方法 , 因為D由Dog類別產生
>
> 沒有static時, D執行的是對象(Animal)的方法 , 因為D由Animal類別產生



#### 非靜態的方法,override只跟非靜態的方法有關

```
public class Main {

  public static void main(String[] args) {

    Animal A = new Dog();
    A.method();
    
    Dog D = new Dog();
    D.method();
  }
}

class Animal {
  public void method() {
    System.out.println("Animal method");
  }
}
// Dog 繼承 Animal
class Dog extends Animal {
  public void method(){
    System.out.println("Dog method");
  }
}
```

> 輸出結果

```
Dog method
Dog method
```



#### 非static時

```
Animal A = new Dog();
```

> 雖然是建立的是Animal,但執行了Dog的方法
>
> 表示子類別重寫了父類別的方法



### 多型 polymorphism

> 對象可以擁有多種形態 

> 可以由父類別去建立子類別 進而由父類別去執行子類別中被override的方法

```
public class Person{
	public void run(){
		System.out.println("run");
	}
}
public class Student{
	
}
public class Main {
  public static void main(String[] args) {
  		Student s1 = new Student();
  		Person s2 = new Student();
  		Object s3 = new Student();
  		s2.run();
  }
}
```

> 執行結果

```
run
```

> Student 可以是一個 Student ,  也可以是一個Person , 也可以是 Object



#### 子類別與父類別有相同的方法

```
public class Person{
	public void run(){
		System.out.println("run");
	}
}
public class Student extends Person{
		public void run(){
		System.out.println("son");
	}
}
public class Main {
  public static void main(String[] args) {
  		Student s1 = new Student();
  		Person s2 = new Student();
  		Object s3 = new Student();
  		s2.run();
  		s1.run();
  }
}
```

> 輸出結果

```
son
son
```

> 子類別重寫了父類別的方法 >> 執行子類別的方法

> 如果子類別宣告了一個父類別沒有的方法 
>
> 則s2無法去執行子類別所創建的新方法

> 對象能執行的方法,主要看對象左邊的類型
>
> 則子類別(Student)新創立的方法,無法在父類別(Person)直接使用



#### 總結

> 使用父類別建立的對象 只能使用父類別的方法跟變數

> 如果在子類別建立了一個與父類別方法名不同的新方法 則無法使用

> 如果在子類別建立了與父類別方法名相同的方法 則使用的會是子類別建立的方法

##### 無法被重寫的類型

> static靜態 --> 靜態根據的是產生的類別(左邊) 選擇執行的方法 則方法無法被重寫

> final --> 純量 宣告後無法再進行變更

> private 方法 --> 無法被重寫 繼承



### instanceof

> 判斷兩個類別之間是否存在繼承關係

```
## Student extends Person 
## 此處的object為下面宣告過的object 並非共通父類別Object 
## Object > String
## Object > Person > Student
## Object > Person > Teacher
public class Main{
	public static void main(String[] args){
		Object object = new Student();
		System.out.println(object instanceof Student);// true
		System.out.println(object instanceof Person); // true
		System.out.println(object instanceof Object); // true
		System.out.println(object instanceof Teacher);// false
		System.out.println(object instanceof String); // false
		
		Person person = new Student();
		System.out.println(person instanceof Student); // true
		System.out.println(person instanceof Person);  // true
		System.out.println(person instanceof Object);  // true
		System.out.println(person instanceof Teacher); // false
		//System.out.println(person instanceof String);  //語法錯誤
		
		Student student = new Student();
		System.out.println(student instanceof Student);// true
		System.out.println(student instanceof Person); // true
		System.out.println(student instanceof Object); // true
		//System.out.println(student instanceof Teacher);// 語法錯誤
		//System.out.println(student instanceof String); // 語法錯誤
	}
}
```

> System.out.println(X instanceof Y)   的編譯通過與否取決於X和Y有繼承關係



```
public class Person(){

}
public class Student extends Person(){
	public void go(){
		
	}
}
public class Main{
	public static void main(String[] args){
		Student student = new Student();
		student.go();
		Person person = student; // 子類別轉父類別
	}
}
```

> 由於子類別繼承了父類別除了private的所有方法
>
> 所以子類別 > 父類別  因此由父類別轉換為子類別需要強制轉換 因為是小轉大



### abstract 抽象

> 抽象類別 --> 而這個類別只有方法的名字 方法中沒有其他的行為
>
> 不能使用new去建立抽象類別 , 只能使用子類別去實現他

> 一旦方法中有abstract類別 , 則類別也一定要是abstract的型態
>
> 但abstract的類別可以存在普通的方法

> 繼承了抽象類別的子類別 必須要實現父類別的所有方法
>
> 除非繼承他的子類別也是抽象類別

> 雖然抽象類別不能使用new建立 , 但是他也存在建構子 , 得由子類別去實作這個建構子



### interface 介面

> 介面中的所有定義都是抽象的 public abstract

> 介面中所有的變數都是 public static final 類型

> 介面不能直接以new方式建立

> 介面與類別單一繼承不同 可以使用 implements 同時實作多個介面

> 實作介面後需要把介面中所有的方法重寫一次



### Eeception 

![java-exception](A:\690102-20160728164909622-1770558953.png)

> java的例外發生主要分為兩大類 

#### error

> 通常無法預先知道的情況
>
> 大多數的情況是由JVM產生的問題如
>
> OutOfMemeoryError 記憶體溢出
>
> NoClassDefFoundError 類別定義錯誤
>
> LinkageError 連結錯誤

#### Exception

> 相較於error 比較可以預見的情況
>
> 其中較為重要的分支為RuntimeException 執行時異常
>
> ArrayIndexOutOfBoundsException 陣列超過定義的大小
>
> NullPointerException 空指標異常
>
> ArithmeticException 算術邏輯異常
>
> MissingResourceException 找不到資源異常
>
> ClassNotFoundException 找不到類別異常

#### Error & Exception

> Error通常對程式的執行來說是一個很難處理的錯誤,當出現error時一般會停止程式的執行
>
> Exception相較於error則沒有這麼嚴重,可以使用拋出exception的作法預先的把處理方式設計好

#### 拋出例外

##### try

> 監控例外發生的區塊  在此程式區塊如果例外發生 則根據設計好的例外處理進行操作

##### catch

> 捕獲例外的區塊  用來抓取try區塊發生的例外類型 根據catch區塊的定義 進行不同例外類型的處理

##### finally

> 處理善後工作 無論例外有沒有發生 一定會執行到的區塊
>
> 一般用於關閉一些資源的使用

```
try{ // try 檢查有無例外發生
	System.out.println();
}catch(Error e){ // 處理例外發生 處理的例外需由小至大抓取
	System.out.println("Error");
	e.printStackTrace(); // 印出錯誤的訊息
}catch(Exception e){
	System.out.println("Exception");
}catch(Throwable t){ // Throwable包含了上面所有的例外
	System.out.println("Throwable");
}finally{
	System.out.println("finally");
}
```

> 使用try catch捕獲完異常後 , 程式會繼續往下執行

##### throw 

> 主動拋出例外,一般在方法中使用

```
try{
	if(b==0){  // 主動拋出異常
		throw new ArithmeticException();
	}
}
```

######  throws

> 假設方法無法處理例外,主動拋出例外

```
public void test(int a , int b) throws ArithmeticException{
	if(b==0){
		throw new ArithmeticException();
	}
}
```



#### 自定義例外處理

> 繼承了Exception後 即為自定義的例外

```
public class MyException entends Exception{
	//創立一個類別 繼承 Exception的例外類別
}
```

#### 總結

> 處理Exception時,應該先判斷邏輯的合理以及使用try-catch輔助處理

> 在用多重catch處理例外時,最後可以加一個catch(Exception)確保所有的情況都可以被抓取

> 對於不確定的程式也可以加上try-catch處理可能會遇到的例外

> 盡量去處理例外發生,切記只是簡單的使用printStackTrace() 印出輸出

> 實際處理例外的情況,應根據不同的需求跟例外的類型選擇適當的作法

> 盡量使用finally釋放占用的資源
