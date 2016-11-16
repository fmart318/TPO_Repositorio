package rmi;

public abstract class RmiStarter {
	public RmiStarter(Class<?> clazzToAddToServerCodebase) {

		System.setProperty("java.rmi.server.codebase",
				clazzToAddToServerCodebase.getProtectionDomain()
						.getCodeSource().getLocation().toString());

		System.setProperty("java.security.policy",
				PolicyFileLocator.getLocationOfPolicyFile());

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		doCustomRmiHandling();
	}

	public abstract void doCustomRmiHandling();
}
