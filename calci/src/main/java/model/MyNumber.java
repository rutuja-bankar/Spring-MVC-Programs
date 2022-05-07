package model;

public class MyNumber {
 String txt1,txt2,op;

public String getTxt1() {
	return txt1;
}

public void setTxt1(String txt1) {
	this.txt1 = txt1;
}

public String getTxt2() {
	return txt2;
}

public void setTxt2(String txt2) {
	this.txt2 = txt2;
}

public String getOp() {
	return op;
}

public void setOp(String op) {
	this.op = op;
}
 public int operation()
 {
	 int a= Integer.parseInt(txt1);
	 int b= Integer.parseInt(txt2);
	 int ans=0;
	 
	 if(op.equals("ADD"))
	 ans=a+b;
	 else if(op.equals("SUB"))
		 ans=a-b;
	 else if(op.equals("DIV"))
		 ans=a/b;
	 else if(op.equals("MULT"))
		 ans=a*b;
	 return ans;
 }

@Override
public String toString() {
	return "MyNumber [txt1=" + txt1 + ", txt2=" + txt2 + ", op=" + op + "]";
}
 
}
