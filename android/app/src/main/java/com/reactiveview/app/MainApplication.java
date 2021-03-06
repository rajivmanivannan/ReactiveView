package com.reactiveview.app;

import android.app.Application;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.reactiveview.BuildConfig;
import com.reactiveview.component.ReactiveViewReactPackage;
import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  public static MainApplication mainApplication;
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.asList(
          new MainReactPackage(),
          new ReactiveViewReactPackage()
      );
    }
  };

  public static MainApplication getInstance() {
    return mainApplication;
  }

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    mainApplication = this;
    SoLoader.init(this, /* native exopackage */ false);
  }
}
