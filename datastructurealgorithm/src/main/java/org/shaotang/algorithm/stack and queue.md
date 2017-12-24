# 栈

---
++https://github.com/jaldd/algorithm/tree/develop/datastructurealgorithm/src/main/java/org/shaotang/algorithm/stack++

---

栈只允许访问最后插入的数据项，移除后才能访问第二个插入的数据项。

---
```
public class MyStack {
	private int maxSize;
	private long[] arr;
	private int top;
	public MyStack() {
		
	}
	public MyStack(int maxSize) {
		super();
		this.maxSize = maxSize;
		arr=new long[maxSize];
		top=0;
	}
	//压入数据
	public void push(long value) {
		arr[top++]=value;
	}
	//弹出数据
	public long pop() {
		return arr[--top];
	}
	public long peek() {
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==maxSize;
	}
	
}
```

栈实现字符串逆序

---

```
public String doReverse() {
	CharStack ncs=new CharStack(input.length());
	for(int i=0;i<input.length();i++) {
		ncs.push(input.charAt(i));
	}
	String output="";
	while(!ncs.isEmpty()) {
		output+=ncs.pop();
	}
	return output;
}
```
# 队列

---
++https://github.com/jaldd/algorithm/tree/develop/datastructurealgorithm/src/main/java/org/shaotang/algorithm/queue++

---

先进先出

## 循环队列
队尾插入数据，队首取数据

---

```
public class Queue {
	private long[] arr;
	private int maxSize;
	private int elems;
	private int font;//队首
	private int end;//队尾
	public Queue(int maxSize) {
		this.maxSize=maxSize;
		arr=new long[maxSize];
		elems=0;
		font=0;
		end=0;
	}
	public void insert(long value) {
	    //防止死循环
		if(elems<maxSize) {
    	    //循环
    		if(end==maxSize) {
    			end=0;
    		}
    		arr[end++]=value;
    		elems++;
		}
	}
	public long remove() {
		long value=arr[font++];
		//循环
		if(font==maxSize) {
			font=0;
		}
		elems--;
		return value;
	}
	public boolean isEmpty() {
		return elems==0;
	}
	public boolean isFull() {
		return end==maxSize;
	}
	public int size() {
		return elems;
	}
}

```
## 优先级队列
数据项按关键字的值有序，关键字最小（大）的数据项总在队头，数据项插入时按顺序插入。

---

```
public class PriorityQueue {
	private long[] arr;
	private int maxSize;
	private int elems;
	public PriorityQueue(int maxSize) {
		this.maxSize=maxSize;
		arr=new long[maxSize];
		elems=0;
	}
	public void insert(long value) {
		int i;
		for(i=0;i<elems;i++) {
			if(arr[i]<value) {
				break;
			}
		}
		for(int j=elems;j>i;j--) {
			arr[j]=arr[j-1];
		}
		arr[i]=value;
		elems++;
	}
	public long remove() {
		return arr[--elems];
	}
	public boolean isEmpty() {
		return elems==0;
	}
	public boolean isFull() {
		return elems==maxSize;
	} 
	public int size() {
		return elems;
	}
}
```
