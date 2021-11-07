# JAVA

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


