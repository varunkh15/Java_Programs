package Encapsulation;

public class Browser {

	
		public void launchBrowser() {
			System.out.println("checking the browser...");
			checkBrowserVersion();
			System.out.println("browser is launched....");
		}

		private void checkBrowserVersion() {
			System.out.println("checkBrowserVersion");
			OSCompatible();
		}

		private void OSCompatible() {
			System.out.println("OSCompatible");
			CPUMemoryForBrowser();
		}

		private void CPUMemoryForBrowser() {
			System.out.println("CPUMemoryForBrowser");
			latestUpdatesForBrowser();

		}

		private void latestUpdatesForBrowser() {
			System.out.println("latestUpdatesForBrowser");

		}

	}

