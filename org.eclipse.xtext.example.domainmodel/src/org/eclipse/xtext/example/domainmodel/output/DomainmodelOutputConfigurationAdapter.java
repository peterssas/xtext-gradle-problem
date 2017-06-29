/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.output;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

/**
 * @author peterssas - Initial contribution and API
 */
public class DomainmodelOutputConfigurationAdapter implements Adapter {
	private String outputConfigurationName;

	public DomainmodelOutputConfigurationAdapter(String outputConfigurationName) {
	    this.outputConfigurationName = outputConfigurationName;
	  }

	public String getOutputConfigurationName() {
		return outputConfigurationName;
	}

	@Override
	public void notifyChanged(Notification notification) {
	}

	@Override
	public Notifier getTarget() {
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

}