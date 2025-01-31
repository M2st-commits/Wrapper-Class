# Wrapper-Class

# Wrapper-Class

Auto-Boxing // Conversion of Primitive to objects .
Un-Boxing // Conversions of objects to primitives .
int a = 5 ; // In this variable is holding a value .
Integer obj = a; //In this object(obj) of wrapper class Integer is holding a value 'a'  .

Why to use Wrapper class ->
1) To use usility methods,parseInt(),equals,toLowerCase(),conversion & comparison.
2) Collection frameworks i.e List, Map, Stack uses Wrapper class & works on objects  & to implement these functionalities wrapper class is needed.


One Fact in wrapper class ->

// This code will give yes in answer                    // This code will give No in answer
Integer a = 100;                                       Integer a = 200;
Integer b = 100;                                       Integer b = 200;
if(a==b){                                              if(a==b){
Sout("Yes");                                           Sout("Yes");
}else{                                                 }else{
Sout("No");                                            Sout("No")
}                                                      }


Integer chache range(-127 to 127)

When the objects are in their respective cache range and both the objects are having same values, then if you will be using "==" operator it will
give true because for the same values no new object will be created the next one will be having the refrece of previous one. So far this reason '100' is giving ture and for '200' is giving false .
