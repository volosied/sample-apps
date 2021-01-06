package myapp;

import java.beans.FeatureDescriptor;
import java.util.Iterator;
import javax.el.ELContext;
import javax.el.ELResolver;

public class CustomELResolver extends ELResolver {
  public Class<?> getCommonPropertyType(ELContext context, Object base) {
      System.out.println("CustomELResolver#getCommonPropertyType called");
    return String.class;
  }
  
  public Object convertToType(ELContext context, Object value, Class<?> targetType) {
    System.out.println("CustomELResolver#convertToType called");
    if (value == null && targetType == String.class)
      context.setPropertyResolved(true); 
    return value;
  }
  
  public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext context, Object base) {
    return null;
  }
  
  public Class<?> getType(ELContext context, Object base, Object property) {
    return null;
  }
  
  public Object getValue(ELContext context, Object base, Object property) {
    System.out.println("CustomELResolver#getValue called");
    return null;
  }
  
  public boolean isReadOnly(ELContext context, Object base, Object property) {
    return true;
  }
  
  public void setValue(ELContext context, Object base, Object property, Object value) {
    System.out.println("CustomELResolver#setValue called");
  }
}
