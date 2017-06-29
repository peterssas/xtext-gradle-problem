package org.eclipse.xtext.example.domainmodel.output;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;

public class SingleOutputConfigurationFileSystemAccess implements
    IFileSystemAccess, IFileSystemAccessExtension,
    IFileSystemAccessExtension2 {

  protected IFileSystemAccess fsa;
  protected String outputConfigurationName;

  public SingleOutputConfigurationFileSystemAccess(IFileSystemAccess fsa,
      String outputConfigurationName) {
    this.fsa = fsa;
    this.outputConfigurationName = outputConfigurationName;
  }

  @Override
  public void generateFile(String fileName, CharSequence contents) {
    fsa.generateFile(fileName, outputConfigurationName, contents);
  }

  @Override
  public void generateFile(String fileName, String outputConfiguration, CharSequence contents) {
    fsa.generateFile(fileName, outputConfigurationName, contents);
  }

  @Override
  public void deleteFile(String fileName) {
    deleteFile(fileName, outputConfigurationName);
  }

  @Override
  public void deleteFile(String fileName,
      String ignoredOutputConfigurationName) {
    ((IFileSystemAccessExtension) fsa).deleteFile(fileName, outputConfigurationName);
  }

  @Override
  public URI getURI(String fileName, String outputConfiguration) {
    return ((IFileSystemAccessExtension2) fsa).getURI(fileName, outputConfigurationName);
  }

  @Override
  public URI getURI(String fileName) {
    return ((IFileSystemAccessExtension2) fsa).getURI(fileName, outputConfigurationName);
  }
}