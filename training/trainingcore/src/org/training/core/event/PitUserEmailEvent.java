/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.event;


import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import org.training.core.model.PitUserEmailProcessModel;


public class PitUserEmailEvent extends AbstractEvent {
	private PitUserEmailProcessModel process;

	public PitUserEmailEvent(final PitUserEmailProcessModel process) {
		this.process=process;
	}

	public PitUserEmailProcessModel getProcess() {
		return process;
	}
}
