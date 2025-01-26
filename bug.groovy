```groovy
def myMethod(String a, String b) {
  if (a == null || b == null) {
    return null //This is the error, should throw an exception
  }
  // ...rest of the method
}
```