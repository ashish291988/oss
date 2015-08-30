import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample_java_pr {

	/**
	 * @param args
	 */
	public static String varl;
	public static void getvar(){
		varl="How";
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String select="2,3,4";
		String p[]=select.split(",");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jobserve.com");
		Thread.sleep(5000L);
		d.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		Thread.sleep(2000L);
		
		d.findElement(By.xpath("//*[@id='ddcl-selInd-ddw']/div/div[1]/label")).click();
		
		String startstr="//*[@id='ddcl-selInd-ddw']/div/div[";
		String endstr="]/label";
		for(int i=0;i<p.length;i++){
			d.findElement(By.xpath (startstr+p[i]+endstr)).click();
			Thread.sleep(1000L);
		}
		
		String gh=d.findElement(By.xpath("//*[@id='ddcl-selInd-ddw']/div/div[1]/label")).getText();
		System.out.println(gh);
		d.findElement(By.id("ddcl-selInd-i9")).click();
		int b=d.findElements(By.xpath("//input[starts-with(@id, 'ddcl-selInd-i')]") ).size();
		System.out.println(b);
		List<WebElement> name=d.findElements(By.xpath("//input[starts-with(@id, 'ddcl-selInd-i')]") );
		for (int k=1;k<name.size();k++){
			String nms=name.get(k).getAttribute("selection");
			System.out.println(nms);
			//name.get(k).click();
		}
		//d.findElement(By.name("Self Employment")).click();
		//WebElement nm= d.findElement(By.linkText("Self Employment"));
		//nm.click();
		
		//input[starts-with(@id, 'text-')
	
		
	}

}