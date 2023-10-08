package com.example.android.dagger.di;

import com.example.android.dagger.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_LoginActivity.LoginActivitySubcomponent.class)
public abstract class ActivityModule_LoginActivity {
  private ActivityModule_LoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Factory builder);

  @Subcomponent
  @ActivityScope
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginActivity> {}
  }
}
