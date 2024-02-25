// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.main;

import com.example.android.dagger.helper.SampleTask;
import com.example.core.common.logger.Logger;
import com.example.core.common.user.UserManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<MainViewModel> mainViewModelProvider;

  private final Provider<UserManager> userManagerProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<SampleTask> sampleTaskProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MainViewModel> mainViewModelProvider, Provider<UserManager> userManagerProvider,
      Provider<Logger> loggerProvider, Provider<SampleTask> sampleTaskProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.mainViewModelProvider = mainViewModelProvider;
    this.userManagerProvider = userManagerProvider;
    this.loggerProvider = loggerProvider;
    this.sampleTaskProvider = sampleTaskProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MainViewModel> mainViewModelProvider, Provider<UserManager> userManagerProvider,
      Provider<Logger> loggerProvider, Provider<SampleTask> sampleTaskProvider) {
    return new MainActivity_MembersInjector(androidInjectorProvider, mainViewModelProvider, userManagerProvider, loggerProvider, sampleTaskProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectMainViewModel(instance, mainViewModelProvider.get());
    injectUserManager(instance, userManagerProvider.get());
    injectLogger(instance, loggerProvider.get());
    injectSampleTask(instance, sampleTaskProvider.get());
  }

  @InjectedFieldSignature("com.example.android.dagger.main.MainActivity.mainViewModel")
  public static void injectMainViewModel(MainActivity instance, MainViewModel mainViewModel) {
    instance.mainViewModel = mainViewModel;
  }

  @InjectedFieldSignature("com.example.android.dagger.main.MainActivity.userManager")
  public static void injectUserManager(MainActivity instance, UserManager userManager) {
    instance.userManager = userManager;
  }

  @InjectedFieldSignature("com.example.android.dagger.main.MainActivity.logger")
  public static void injectLogger(MainActivity instance, Logger logger) {
    instance.logger = logger;
  }

  @InjectedFieldSignature("com.example.android.dagger.main.MainActivity.sampleTask")
  public static void injectSampleTask(MainActivity instance, SampleTask sampleTask) {
    instance.sampleTask = sampleTask;
  }
}
