/*******************************************************************************
 * Copyright (c) 2006-2010, Gerry Weirich and Elexis
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gerry Weirich - initial implementation
 *    
 *******************************************************************************/
package ch.elexis.agenda.util;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "ch.elexis.agenda.util.messages"; //$NON-NLS-1$
	public static String Plannables_databaseError;
	public static String Plannables_errorInAppointmentText;
	public static String TermineLockedTimesUpdater_0;
	public static String TermineLockedTimesUpdater_4;
	public static String TermineLockedTimesUpdater_5;
	public static String TermineLockedTimesUpdater_6;
	public static String TermineLockedTimesUpdater_7;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
	
	private Messages(){}
}
