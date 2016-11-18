package com.generics.binarycompatibility.generified;

// 8.4 Maintain Binary Compatibility

interface Name extends Comparable<Name> {
  public int compareTo(Name o);
}

class SimpleName implements Name {
  private String base;
  public SimpleName(String base) {
    this.base = base;
  }
  public int compareTo(Name o) {
    return base.compareTo(((SimpleName)o).base);
  }
}
class ExtendedName extends SimpleName {
	  private String ext;
	  public ExtendedName(String base, String ext) {
	    super(base); this.ext = ext;
	  }
}
// use legacy class file for ExtendedName

class Test {
  public static void main(String[] args) {
    Name m = new ExtendedName("a","b");
    Name n = new ExtendedName("a","c");
    assert m.compareTo(n) == 0;  // answer is now different!
  }
}
