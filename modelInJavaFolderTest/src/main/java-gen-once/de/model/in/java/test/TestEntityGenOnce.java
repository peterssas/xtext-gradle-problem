package de.model.in.java.test;

import de.model.in.java.test.TestBean;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class TestEntityGenOnce extends TestBean {
  public TestEntityGenOnce() {
  }
  
  public TestEntityGenOnce(final Procedure1<TestEntityGenOnce> initializer) {
    initializer.apply(this);
  }
  
  public String print();
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
}
