package com.example.feature.registration.di;

import com.example.core.common.di.scope.ActivityScope;
import com.example.feature.registration.RegistrationActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      RegistrationActivityModule_RegistrationActivity.RegistrationActivitySubcomponent.class
)
public abstract class RegistrationActivityModule_RegistrationActivity {
  private RegistrationActivityModule_RegistrationActivity() {}

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
