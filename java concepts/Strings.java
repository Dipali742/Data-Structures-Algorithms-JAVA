
class Strings {
	public static void main(String[] args) {
		String str = "test";
		str += "hello";
		System.out.println(str);

		String str1 = str;
		System.out.println(str == str1);	//true (same reference)
		System.out.println(str.equals(str1));  //true (same content)

		String a = new String("Hello");
		String b = new String("Hello");

		System.out.println(a == b);           // false (different objects)
		System.out.println(a.equals(b));      // true  (same content)
	}
}

/* 

Strings are immutable in java
line 5 will create new string in heap memory instead of updating value

str1 will point to the same memory location. So str == str1 will return true.

== checks the reference only - checks if its pointing to same memory location

for content check - .equals() needs to be used

*/	