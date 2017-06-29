/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.output;

import static com.google.common.collect.Sets.*;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;


/**
 * @author peterssas - Initial contribution and API
 */
public class DomainmodelOutputConfigurationProvider  implements IOutputConfigurationProvider {
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration("JAVA_OUTPUT");
		defaultOutput.setDescription("Output folder for generated onced Form-DSL2-Files");
		defaultOutput.setOutputDirectory("src/main/java-gen-once/");
		defaultOutput.setOverrideExistingResources(false);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCanClearOutputDirectory(false);
		defaultOutput.setCleanUpDerivedResources(false);
		defaultOutput.setSetDerivedProperty(false);

		OutputConfiguration formGenOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		formGenOutput.setDescription("Output folder for generated Form-DSL2-Files");
		formGenOutput.setOutputDirectory("src/main/java-gen/");
		formGenOutput.setOverrideExistingResources(true);
		formGenOutput.setCreateOutputDirectory(true);
		formGenOutput.setCanClearOutputDirectory(true);
		formGenOutput.setCleanUpDerivedResources(true);
		formGenOutput.setSetDerivedProperty(false);
		
		return newHashSet(defaultOutput, formGenOutput);
	}
}


