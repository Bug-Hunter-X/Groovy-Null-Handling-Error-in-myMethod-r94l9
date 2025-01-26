```groovy
def myMethod(String a, String b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Input strings cannot be null")
  }
  // ...rest of the method
}
```