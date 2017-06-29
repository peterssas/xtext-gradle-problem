/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.generator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.domainmodel.output.DomainmodelOutputConfigurationAdapter;
import org.eclipse.xtext.example.domainmodel.output.SingleOutputConfigurationFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

public class OutputConfigurationAwaredGenerator extends JvmModelGenerator {
  @Override
  public void doGenerate(Resource input, IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    for (final EObject obj : _contents) {
      String outputConfiguration = null;
      for (Adapter adapter : obj.eAdapters()) {
        if (adapter instanceof DomainmodelOutputConfigurationAdapter) {
          outputConfiguration = ((DomainmodelOutputConfigurationAdapter) adapter).getOutputConfigurationName();
          break;
        }
      }
      if (outputConfiguration == null) {
        this.internalDoGenerate(obj, fsa);
      } else {
        this.internalDoGenerate(obj, new SingleOutputConfigurationFileSystemAccess(fsa, outputConfiguration));
      }
    }
  }
}