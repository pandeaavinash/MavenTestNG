package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties 
{
	public static String browser = LoadProperties.getProperty("browser");
			
			
			
	public static String getProperty(String key)
	{
		Properties prop = new Properties();
		try 
		{
			StringBuffer buffer = new StringBuffer();
			String userDir = System.getProperty("user.dir");
			String path = "\\src\\test\\resources\\config\\config.properties";
			buffer.append(userDir).append(path);
			System.out.println(buffer.toString());
			https://txxx.com/videos/7342147/nadia-ali-fucking-nadia-ali-pov-style-broken-teens/
			//InputStream resourceAsStream = LoadProperties.class.getClassLoader().getResourceAsStream(".\\config\\config.properties");
			InputStream resourceAsStream = LoadProperties.class.getClassLoader().getResourceAsStream(buffer.toString());
			if(resourceAsStream != null)
			{
				prop.load(resourceAsStream);
			}
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key, "");
	}
	
	public static void main(String[] args)
	{
		String b = LoadProperties.browser;
	}
}
