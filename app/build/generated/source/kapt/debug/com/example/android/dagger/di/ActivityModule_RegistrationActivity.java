package com.example.android.dagger.di;

import com.example.android.dagger.registration.RegistrationActivity;
import com.example.android.dagger.registration.di.RegistrationFragmentModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_RegistrationActivity.RegistrationActivitySubcomponent.class)
public abstract class ActivityModule_RegistrationActivity {
  private ActivityModule_RegistrationActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RegistrationActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegistrationActivitySubcomponent.Factory builder);

  @Subcomponent(modules = RegistrationFragmentModule.class)
  @ActivityScope
  public interface RegistrationActivitySubcomponent extends AndroidInjector<RegistrationActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegistrationActivity> {}
  }
}
