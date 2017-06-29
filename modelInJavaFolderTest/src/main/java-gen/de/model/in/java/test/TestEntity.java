package de.model.in.java.test;

import de.model.in.java.test.TestBean;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class TestEntity extends TestBean {
  public TestEntity() {
  }
  
  public TestEntity(final Procedure1<TestEntity> initializer) {
    initializer.apply(this);
  }
  
  public String print() {
    return this.getFirstname();
  }
  
  @Override
  public String toString() {
    String result = new ToStringBuilder(this).addAllFields().toString();
    return result;
  }
}
