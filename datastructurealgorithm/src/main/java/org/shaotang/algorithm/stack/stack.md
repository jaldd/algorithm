# 栈
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
