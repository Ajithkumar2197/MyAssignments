package week1.day2;

public class Browser {
 float browserVersion = 1.103f;
 
 public void lunchBrowser() {
	 System.out.println("Browser lunched successfully");
 }
 public void  loadUrl() {
	 System.out.println("Url loaded successfully");
}
 public static void main(String[] args) {
	Browser chrome =new Browser();
	Browser edge =new Browser();
	chrome.lunchBrowser();
	chrome.loadUrl();
	//chrome.browserVersion=120;
	System.out.println(chrome.browserVersion);
	edge.lunchBrowser();
	edge.loadUrl();
	edge.browserVersion=2.14f;
	System.out.println(edge.browserVersion);
	}
}