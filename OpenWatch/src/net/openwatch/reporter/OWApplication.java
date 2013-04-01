package net.openwatch.reporter;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import android.app.Application;

public class OWApplication extends Application {
	
	// Keep track of whether per-launch actions have been performed
	public static boolean per_launch_sync = false;
	
	public void onCreate (){
		super.onCreate();
		ImageLoader.getInstance().init(getImageLoaderConfiguration());
	}
	
	private ImageLoaderConfiguration getImageLoaderConfiguration(){
		DisplayImageOptions displayOptions = new DisplayImageOptions.Builder()
		.cacheInMemory()
		.cacheOnDisc()
		.build();
			
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
		.defaultDisplayImageOptions(displayOptions)
		.build();
		
		return config;
	}

}
