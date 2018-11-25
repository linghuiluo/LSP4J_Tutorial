package org.eclipsecon.languageserverplugin;

import java.io.IOException;

import de.upb.swt.SootLSP.DemoServer;
import de.upb.swt.SootLSP.SootLSPServer;

public class ConnectionSootLSP extends AbstractConnectionProvider {
	private static final DemoServer TRAVEL_LANGUAGE_SERVER = new DemoServer();
	public ConnectionSootLSP() {
		super(TRAVEL_LANGUAGE_SERVER);
	}
	
	@Override
	public void start() throws IOException {
		super.start();
		TRAVEL_LANGUAGE_SERVER.setRemoteProxy(launcher.getRemoteProxy());
	}
}

