package com.vpsoftware.formationjsf.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class EcouteurPhase implements PhaseListener {

	private static final long serialVersionUID = 1L;
	
	//méthode appelée par JSF apres une des 6 phases JSF
	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Phase apres: " + event.getPhaseId().toString());

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Phase avant: " + event.getPhaseId().toString());

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
