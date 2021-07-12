# ArrayList

* Dynamic Array (reference variable)
* Syntax: *ArrayList<Integer> al = new ArrayList<>();*
* Function: 
      * *al.add(10);*
      * *al.size();*
      * *al.remove(index);*
      * *al.set(index,value);*
      *  *al.get(index)*
* Primitive datatypes: we have to intialize them unlike reference variable we can or cannot initialize them.
   * *int a;* (will give an error)
   * *int[] arr;*(will not give error and later we can initialize them like *arr = new  int[9];*)

***

# String
* String is character of array
* Strings content is immutable in java and are refernce type variable
* String function:
   * *s.lengths()*
   * *s.charAt(index)*
   * *s1.equals(s2)* 
   * *s.substring(incl,excl)*
* **Intialize**
      * String s1 = "hello";
      * String s2 = new String("hello);
      * String s3 = s1 + s2; *(O(m+n))*
      * char[] ch={'j','a','v','a','t','p','o','i','n','t'};  ***String s=new String(ch);*** 
* String memory is created inside intern pool that is heap part.
* The content will be always in intern pool memory part (InString Case)
* but when we use *new* keyword (reference heap mei banega & content intern pool mei banega).
* STRING + INT -> STRING
* "hello" + 100 -> "hello100"

* Why Java uses the concept of String literal?
   * To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 

***

# StringBuilder
* To resolve mutability & appending, we use string builder
* Syntax: *StringBuilder sb = new StringBuilder("hello");*
* Functions: 
     * *sb.setCharAt(index,char);*//we can set a character 
     * *sb.append("world");*
     * *sb.charAt(index);*
     * *sb.insert(5,'a');* //to insert a char in between 
     * *sb.deleteCharAt(5);*
     * *sb.substring(incl,excl);*
     * *sb.length();*